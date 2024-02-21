package org.farhan.objects.pharmacy.pre;

import java.util.HashMap;

import org.farhan.adjudication.ClaimEngine;
import org.farhan.adjudication.ClaimFactory;
import org.farhan.common.PharmacyPre;
import org.farhan.objects.pharmacy.ClaimRequest;

public class ClaimRequestImpl extends PharmacyPre implements ClaimRequest {

	public void setDrugCost(HashMap<String, String> keyMap) {
		ClaimFactory.getClaim().setDrugCost(keyMap.get("Drug Cost"));
	}

	public void setFamily(HashMap<String, String> keyMap) {
		ClaimFactory.getClaim().setFamily(keyMap.get("Family"));
	}

	public void transition() {
		ClaimEngine engine = new ClaimEngine(ClaimFactory.getClaim());
		response = engine.process();
	}
}
