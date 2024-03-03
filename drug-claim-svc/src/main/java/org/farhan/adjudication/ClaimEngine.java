package org.farhan.adjudication;

public class ClaimEngine {

	private ClaimRequest request;
	private ClaimResponse response;

	public ClaimEngine(ClaimRequest request) {
		this.request = request;
	}

	public ClaimResponse process() {

		double drugCost = request.getDrugCost();
		double deductible = request.getDeductible();
		double coinsurance = request.getCoInsurance();
		double coPayment = request.getCoPayment();
		double dispenseFee = request.getDispenseFee();
		double maximum = request.getMaximum();
		double totalAmount = drugCost + dispenseFee;
		int din = request.getDIN();

		String rejectMessage;
		String planPays;
		String outOfPocket;
		// Pay provider can be different from out of pocket for deferred claims. For now
		// the customer pays the provider but the plan will mail the customer a cheque.
		String payProvider;

		double deductibleAfterMaximum;
		double planPaysBeforeCoPayment;

		// Calculation
		// TODO remove this check and use the DINFactory to get the DIN record. If it
		// returns null then reject it. For each of the 3 alternatives make a separate
		// method that sets the response which this methods returns.
		if (din == 2345) {
			rejectMessage = "No Problems";
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
			return new ClaimResponse(payProvider, outOfPocket, planPays, rejectMessage);
		} else {
			rejectMessage = "Unknown DIN";
			planPays = Double.toString(0);
			outOfPocket = Double.toString(totalAmount - Double.valueOf(planPays));
			payProvider = outOfPocket;
			return new ClaimResponse(payProvider, outOfPocket, planPays, rejectMessage);
		}
	}
}
