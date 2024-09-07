package org.farhan.objects.xtext.pre;

import java.util.HashMap;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.ValidationDialog;
import org.junit.jupiter.api.Assertions;

public class ValidationDialogImpl extends TestObject implements ValidationDialog {

	public void assertMessage(HashMap<String, String> keyMap) {
		Assertions.assertEquals(keyMap.get("Message"), getLA().getValidationMessage());
	}

}
