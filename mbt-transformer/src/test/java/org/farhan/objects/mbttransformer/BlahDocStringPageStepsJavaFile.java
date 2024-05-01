package org.farhan.objects.mbttransformer;

import java.util.HashMap;

public interface BlahDocStringPageStepsJavaFile {

    public void assertContent(HashMap<String, String> keyMap);

    public void assertPresent(HashMap<String, String> keyMap);

    public void assertFieldsSectionMethodName(HashMap<String, String> keyMap);

    public void assertFieldsSectionParameterName(HashMap<String, String> keyMap);

    public void assertFieldsSectionParameterType(HashMap<String, String> keyMap);

    public void assertFieldsSectionAnnotation(HashMap<String, String> keyMap);

    public void assertFieldsSectionStatement(HashMap<String, String> keyMap);
}
