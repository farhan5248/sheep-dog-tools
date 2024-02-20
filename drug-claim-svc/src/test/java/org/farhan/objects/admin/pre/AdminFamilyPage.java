package org.farhan.objects.admin.pre;

import java.util.HashMap;

public class AdminFamilyPage extends Admin {

	public void setFamily(HashMap<String, String> keyMap) {
		createFamily(keyMap.get("Family"));
	}
}
