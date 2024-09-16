package org.farhan.objects.xtext;

import java.util.HashMap;

public interface ScenarioValidationDialog {

    public void assertMessage(HashMap<String, String> keyMap);

    public void assertEmpty(HashMap<String, String> keyMap);
}
