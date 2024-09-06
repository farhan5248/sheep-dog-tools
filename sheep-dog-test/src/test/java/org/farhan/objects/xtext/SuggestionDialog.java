package org.farhan.objects.xtext;

import java.util.HashMap;

public interface SuggestionDialog {

    public void assertSuggestionName(HashMap<String, String> keyMap);

    public void assertSuggestion(HashMap<String, String> keyMap);
}
