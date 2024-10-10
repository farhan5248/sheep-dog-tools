package org.farhan.adjudication.pharmacy;

import org.farhan.adjudication.admin.Drug;
import org.farhan.adjudication.admin.DrugFactory;
import org.farhan.adjudication.admin.Member;
import org.farhan.adjudication.admin.MemberFactory;
import org.farhan.adjudication.admin.Provider;
import org.farhan.adjudication.admin.ProviderFactory;

public class ClaimEngine {

	private ClaimRequest request;
	private ClaimResponse response;

	public ClaimEngine(ClaimRequest request) {
		this.request = request;
	}

	public ClaimResponse process() {

		Provider provider = ProviderFactory.get(request.getProvider());
		if (provider == null) {
			processError("Unknown Provider");
		} else {
			Member member = MemberFactory.get(request.getCertificate());
			if (member == null) {
				processError("Unknown Certificate");
			} else {
				Drug din = DrugFactory.get(request.getDIN());
				if (din == null) {
					processError("Unknown DIN");
				} else {
					if (Math.abs(din.getDrugCost() - request.getDrugCost()) <= 0.01) {
						process("No Problems");
					} else {
						process("Different Cost");
					}
				}
			}
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

	private void processError(String rejectMessage) {
		double totalAmount = request.getDrugCost() + request.getDispenseFee();
		String planPays = Double.toString(0);
		String outOfPocket = Double.toString(totalAmount - Double.valueOf(planPays));
		String payProvider = outOfPocket;
		response = new ClaimResponse(payProvider, outOfPocket, planPays, rejectMessage);
	}
}
