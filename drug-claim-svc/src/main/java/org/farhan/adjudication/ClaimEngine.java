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

		String planPays;
		String outOfPocket;
		// Pay provider can be different from out of pocket for deferred claims. For now
		// the customer pays the provider but the plan will mail the customer a cheque.
		String payProvider;

		double planPaysBeforeCoPayment = (drugCost - deductible) * (coinsurance / 100);
		if (Math.round(planPaysBeforeCoPayment - coPayment) > 0) {
			planPays = Double.toString(planPaysBeforeCoPayment - coPayment);
		} else {
			planPays = Double.toString(0);
		}
		outOfPocket = Double.toString(drugCost - Double.valueOf(planPays));
		payProvider = outOfPocket;
		return new ClaimResponse(payProvider, outOfPocket, planPays);
	}
}
