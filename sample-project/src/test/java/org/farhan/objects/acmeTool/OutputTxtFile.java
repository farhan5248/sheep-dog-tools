package org.farhan.objects.acmeTool;

import java.util.HashMap;

public interface OutputTxtFile {

    public void assertPresent(HashMap<String, String> keyMap);

    public void assertResultsTableLines(HashMap<String, String> keyMap);
}
