package org.farhan.objects.xtext.pre;

import java.util.HashMap;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.SuggestionDialog;
import org.junit.jupiter.api.Assertions;

public class SuggestionDialogImpl extends TestObject implements SuggestionDialog {

	@Override
	public void assertSuggestionName(HashMap<String, String> keyMap) {
		Assertions.assertEquals(keyMap.get("Suggestion Name"), getLA().getProposals().get(keyMap.get("Suggestion"))[0]);
	}

	@Override
	public void assertSuggestion(HashMap<String, String> keyMap) {
		Assertions.assertNotNull(getLA().getProposals().get(keyMap.get("Suggestion")));
	}

	@Override
	public void assertEmpty(HashMap<String, String> keyMap) {
		Assertions.assertTrue(getLA().getProposals().isEmpty());
	}

	@Override
	public void assertSuggestionDescription(HashMap<String, String> keyMap) {
		Assertions.assertEquals(keyMap.get("Suggestion Description"),
				getLA().getProposals().get(keyMap.get("Suggestion"))[1]);
	}
}
