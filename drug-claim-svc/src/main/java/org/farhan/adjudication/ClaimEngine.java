package org.farhan.adjudication;

public class ClaimEngine {

	private ClaimRequest request;
	private ClaimResponse response;

	public ClaimEngine(ClaimRequest request) {
		this.request = request;
	}

	public ClaimResponse process() {

		// Calculation
		// TODO remove this check and use the DINFactory to get the DIN record. If it
		// returns null then reject it. For each of the 3 alternatives make a separate
		// method that sets the response which this methods returns.
		Drug din = DrugFactory.get(request.getDIN());
		if (din != null) {
			if (Math.abs(din.getDrugCost() - request.getDrugCost()) <= 0.01) {
				process("No Problems");
			} else {
				process("Different Cost");
			}
		} else {
			processUnknownDIN();
		}
		return response;
	}

	private void process(String rejectMessage) {

		double drugCost = DrugFactory.get(request.getDIN()).getDrugCost();
		double deductible = request.getDeductible();
		double coinsurance = request.getCoInsurance();
		double coPayment = request.getCoPayment();
		double dispenseFee = request.getDispenseFee();
		double maximum = request.getMaximum();

		String planPays;
		String outOfPocket;
		// Pay provider can be different from out of pocket for deferred claims. For now
		// the customer pays the provider but the plan will mail the customer a cheque.
		String payProvider;

		double deductibleAfterMaximum;
		double planPaysBeforeCoPayment;
		double totalAmount = drugCost + dispenseFee;
		if (maximum >= deductible) {
			deductibleAfterMaximum = deductible;
		} else {
			deductibleAfterMaximum = maximum;
		}
		planPaysBeforeCoPayment = (totalAmount - deductibleAfterMaximum) * (coinsurance / 100);
		if (Math.round(planPaysBeforeCoPayment - coPayment) > 0) {
			planPays = Double.toString(planPaysBeforeCoPayment - coPayment);
		} else {
			planPays = Double.toString(0);
		}
		outOfPocket = Double.toString(totalAmount - Double.valueOf(planPays));
		payProvider = outOfPocket;
		response = new ClaimResponse(payProvider, outOfPocket, planPays, rejectMessage);
	}

	private void processUnknownDIN() {
		double totalAmount = request.getDrugCost() + request.getDispenseFee();
		String rejectMessage = "Unknown DIN";
		String planPays = Double.toString(0);
		String outOfPocket = Double.toString(totalAmount - Double.valueOf(planPays));
		String payProvider = outOfPocket;
		response = new ClaimResponse(payProvider, outOfPocket, planPays, rejectMessage);
	}
}
