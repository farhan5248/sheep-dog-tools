package org.farhan.objects.admin.pre;

import java.util.HashMap;

import org.farhan.adjudication.admin.DrugFactory;
import org.farhan.common.AdminPre;
import org.farhan.objects.admin.DINPage;

public class DINPageImpl extends AdminPre implements DINPage {

    public void setDIN(HashMap<String, String> keyMap) {
    	DrugFactory.create(keyMap.get("DIN"));
	}

    public void setDrugCost(HashMap<String, String> keyMap) {
    	DrugFactory.get(keyMap.get("DIN")).setDrugCost(keyMap.get("Drug Cost"));
	}
}
