package org.farhan.objects.pharmacy.pre;

import java.util.HashMap;

import org.farhan.adjudication.ClaimEngine;
import org.farhan.adjudication.ClaimFactory;
import org.farhan.common.PharmacyPre;
import org.farhan.objects.pharmacy.ClaimRequest;

public class ClaimRequestImpl extends PharmacyPre implements ClaimRequest {

	@Override
	public void setDrugCost(HashMap<String, String> keyMap) {
		ClaimFactory.getClaim().setDrugCost(keyMap.get("Drug Cost"));
	}

	@Override
	public void transition() {
		ClaimEngine engine = new ClaimEngine(ClaimFactory.getClaim());
		response = engine.process();
	}

	@Override
	public void setCoInsurance(HashMap<String, String> keyMap) {
		ClaimFactory.getClaim().setCoInsurance(keyMap.get("Co-Insurance"));
	}

	@Override
	public void setDeductible(HashMap<String, String> keyMap) {
		ClaimFactory.getClaim().setDeductible(keyMap.get("Deductible"));
	}

	@Override
	public void setCoPayment(HashMap<String, String> keyMap) {
		ClaimFactory.getClaim().setCoPayment(keyMap.get("Co-Payment"));
	}
}
