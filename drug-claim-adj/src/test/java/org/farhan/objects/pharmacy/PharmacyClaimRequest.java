package org.farhan.objects.pharmacy;

import java.util.HashMap;
import org.farhan.adjudication.ClaimFactory;
import org.farhan.common.Pharmacy;

public class PharmacyClaimRequest extends Pharmacy {

    public void setDrugCost(HashMap<String, String> keyMap) {
    	ClaimFactory.getClaim().setDrugCost(keyMap.get("Drug Cost"));
    }

    public void setFamily(HashMap<String, String> keyMap) {
    	ClaimFactory.getClaim().setFamily(keyMap.get("Family"));
    }

    public void transition() {
		ClaimFactory.getClaim().process();
    }
}
