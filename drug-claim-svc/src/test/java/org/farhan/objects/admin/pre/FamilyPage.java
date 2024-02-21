package org.farhan.objects.admin.pre;

import java.util.HashMap;

import org.farhan.common.Admin;

public class FamilyPage extends Admin {

	public void setFamily(HashMap<String, String> keyMap) {
		createFamily(keyMap.get("Family"));
	}
}
