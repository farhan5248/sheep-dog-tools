package org.farhan.objects.codeprj.src.test.java.org.farhan.stepdefs.blah;

import java.util.HashMap;

public interface BlahObjectPageStepsJavaFile {

    public void setContent(HashMap<String, String> keyMap);

    public void assertContent(HashMap<String, String> keyMap);

    public void assertPresent(HashMap<String, String> keyMap);
}
