package org.farhan.objects.mbtTransformer;

import java.util.HashMap;

public interface ProcessAdocFile {

    public void assertContent(HashMap<String, String> keyMap);

    public void setContent(HashMap<String, String> keyMap);
}
