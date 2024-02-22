package org.farhan.objects.admin.pre;

import java.util.HashMap;

import org.farhan.common.Admin;
import org.farhan.objects.admin.FamilyPage;

public class FamilyPageImpl extends Admin implements FamilyPage {

	public void setFamily(HashMap<String, String> keyMap) {
		createFamily(keyMap.get("Family"));
	}
}