package org.farhan.objects.admin.pre;

import java.util.HashMap;

import org.farhan.common.Admin;
import org.farhan.objects.admin.DINPage;

public class DINPageImpl extends Admin implements DINPage {

    public void setDIN(HashMap<String, String> keyMap) {
    	// TODO use the DIN factory to create DIN
    	// Then in the engine code, use the DIN factory to get the specific DIN
	}

    public void setDrugCost(HashMap<String, String> keyMap) {
    	// Use the DIN factory to get the DIN and set its cost
	}
}
