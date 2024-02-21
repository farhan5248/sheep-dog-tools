package org.farhan.objects.mbtTransformer;

import java.util.HashMap;

public interface ObjectPageJavaFile {

    public void setContent(HashMap<String, String> keyMap);

    public void assertContent(HashMap<String, String> keyMap);
}
