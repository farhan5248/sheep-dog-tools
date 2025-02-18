package org.farhan.objects.mbttransformer;

import java.util.HashMap;

public interface ObjectPageJavaFile {

    public void assertFieldsSectionMethodName(HashMap<String, String> keyMap);

    public void assertPresent(HashMap<String, String> keyMap);

    public void setContent(HashMap<String, String> keyMap);
}
