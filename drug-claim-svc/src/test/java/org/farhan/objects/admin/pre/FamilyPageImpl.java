package org.farhan.objects.admin.pre;

import java.util.HashMap;

import org.farhan.adjudication.FamilyFactory;
import org.farhan.common.AdminPre;
import org.farhan.objects.admin.FamilyPage;

public class FamilyPageImpl extends AdminPre implements FamilyPage {

	public void setFamily(HashMap<String, String> keyMap) {
		FamilyFactory.get(keyMap.get("Family"));
	}
}
