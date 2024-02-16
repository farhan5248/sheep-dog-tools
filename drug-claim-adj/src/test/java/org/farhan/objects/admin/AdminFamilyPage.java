package org.farhan.objects.admin;

import java.util.HashMap;
import org.farhan.common.Admin;

public class AdminFamilyPage extends Admin {

	public void setFamily(HashMap<String, String> keyMap) {
		createFamily(keyMap.get("Family"));
	}
}
