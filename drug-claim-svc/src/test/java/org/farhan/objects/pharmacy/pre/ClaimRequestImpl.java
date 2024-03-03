package org.farhan.objects.pharmacy.pre;

import java.util.HashMap;

import org.farhan.adjudication.ClaimEngine;
import org.farhan.common.PharmacyPre;
import org.farhan.objects.pharmacy.ClaimRequest;

public class ClaimRequestImpl extends PharmacyPre implements ClaimRequest {

	private static org.farhan.adjudication.ClaimRequest theClaim = null;

	// Before each scenario, this and other Impl objects are cleared so that should
	// reset it once per scenario
	public ClaimRequestImpl() {
		theClaim = new org.farhan.adjudication.ClaimRequest();
	}

	@Override
	public void setDrugCost(HashMap<String, String> keyMap) {
		theClaim.setDrugCost(keyMap.get("Drug Cost"));
	}

	@Override
	public void transition() {
		ClaimEngine engine = new ClaimEngine(theClaim);
		response = engine.process();
	}

	@Override
	public void setCoInsurance(HashMap<String, String> keyMap) {
		theClaim.setCoInsurance(keyMap.get("Co-Insurance"));
	}

	@Override
	public void setDeductible(HashMap<String, String> keyMap) {
		theClaim.setDeductible(keyMap.get("Deductible"));
	}

	@Override
	public void setCoPayment(HashMap<String, String> keyMap) {
		theClaim.setCoPayment(keyMap.get("Co-Payment"));
	}

	@Override
	public void setDispenseFee(HashMap<String, String> keyMap) {
		theClaim.setDispenseFee(keyMap.get("Dispense Fee"));
	}

	@Override
	public void setMaximum(HashMap<String, String> keyMap) {
		theClaim.setMaximum(keyMap.get("Maximum"));
	}

	@Override
	public void setDIN(HashMap<String, String> keyMap) {
		theClaim.setDIN(keyMap.get("DIN"));
	}

	@Override
	public void setProvider(HashMap<String, String> keyMap) {
		theClaim.setProvider(keyMap.get("Provider"));
	}
}
