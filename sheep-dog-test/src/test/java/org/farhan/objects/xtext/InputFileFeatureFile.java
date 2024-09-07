package org.farhan.objects.xtext;

import java.util.HashMap;

public interface InputFileFeatureFile {

    public void assertObjectName(HashMap<String, String> keyMap);

    public void assertStepName(HashMap<String, String> keyMap);

    public void setObjectName(HashMap<String, String> keyMap);

    public void setStepName(HashMap<String, String> keyMap);

    public void setParameters(HashMap<String, String> keyMap);

    public void assertParameters(HashMap<String, String> keyMap);
}
