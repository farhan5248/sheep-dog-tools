package org.farhan.objects.xtext;

import java.util.HashMap;

public interface InputFileFeatureFile {

    public void assertObjectName(HashMap<String, String> keyMap);

    public void setObjectName(HashMap<String, String> keyMap);

    public void setParameters(HashMap<String, String> keyMap);

    public void assertParameters(HashMap<String, String> keyMap);

    public void assertStepDefinitionName(HashMap<String, String> keyMap);

    public void setStepDefinitionName(HashMap<String, String> keyMap);

    public void setStepDefinitionDescription(HashMap<String, String> keyMap);

    public void setObjectDescription(HashMap<String, String> keyMap);
}
