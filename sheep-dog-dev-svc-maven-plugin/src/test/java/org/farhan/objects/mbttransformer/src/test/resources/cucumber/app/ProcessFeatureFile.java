package org.farhan.objects.mbttransformer.src.test.resources.cucumber.app;

import java.util.HashMap;

public interface ProcessFeatureFile {

    public void setContent(HashMap<String, String> keyMap);

    public void assertContent(HashMap<String, String> keyMap);
}
