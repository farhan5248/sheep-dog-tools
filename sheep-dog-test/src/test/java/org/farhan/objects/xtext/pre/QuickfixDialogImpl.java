package org.farhan.objects.xtext.pre;

import java.util.HashMap;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.QuickfixDialog;
import org.junit.jupiter.api.Assertions;

public class QuickfixDialogImpl extends TestObject implements QuickfixDialog {

	public void assertMessage(HashMap<String, String> keyMap) {

		String message = "";
		for (Object alternateObject : getEclipseMock().getAlternateObjects()) {
			if (alternateObject.toString().contentEquals(keyMap.get("Message"))) {
				message = alternateObject.toString();
				break;
			}
		}
		Assertions.assertTrue(!message.isEmpty());
	}
}