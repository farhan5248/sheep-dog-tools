package org.farhan.objects.mbttransformer;

import java.util.HashMap;

public interface ObjectPageAsciidocFile {

    public void setContent(HashMap<String, String> keyMap);

    public void assertContent(HashMap<String, String> keyMap);
}
