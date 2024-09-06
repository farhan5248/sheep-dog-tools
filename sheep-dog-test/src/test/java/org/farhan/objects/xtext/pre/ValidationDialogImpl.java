package org.farhan.objects.xtext.pre;

import java.util.HashMap;

import org.farhan.common.DialogObject;
import org.farhan.objects.xtext.ValidationDialog;

public class ValidationDialogImpl extends DialogObject implements ValidationDialog {

	public void assertMessage(HashMap<String, String> keyMap) {
		assertMessage(keyMap.get("Message"));
	}

}
