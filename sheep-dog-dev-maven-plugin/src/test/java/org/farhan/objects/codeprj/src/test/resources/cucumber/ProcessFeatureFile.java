package org.farhan.objects.codeprj.src.test.resources.cucumber;

import java.util.HashMap;

public interface ProcessFeatureFile {

    public void assertContent(HashMap<String, String> keyMap);

    public void setContent(HashMap<String, String> keyMap);
}
