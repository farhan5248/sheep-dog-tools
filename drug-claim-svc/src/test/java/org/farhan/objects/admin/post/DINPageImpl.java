package org.farhan.objects.admin.post;

import java.util.HashMap;

import org.farhan.common.AdminPost;
import org.farhan.objects.admin.DINPage;

public class DINPageImpl extends AdminPost implements DINPage {

	public void setDIN(HashMap<String, String> keyMap) {
		addParamter("din", keyMap.get("DIN"));
		sendRequest("drug");
	}

	public void setDrugCost(HashMap<String, String> keyMap) {
		addParamter("din", keyMap.get("DIN"));
		addParamter("drugCost", keyMap.get("Drug Cost"));
		// Everytime a new piece of information is added, the service is called to
		// update it. I treat this like someone editing a record in a page and saving
		// their changes. When the actual UI test is called, the entire record is sent
		// for a step but that happens here to, it's just that it's a sequence of one
		// insert and multiple updates for each field
		sendRequest("drug");
	}

}
