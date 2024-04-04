package org.farhan.objects.mbttransformer;

import java.util.HashMap;

public interface ProcessGraphFile {

    public void assertContent(HashMap<String, String> keyMap);

    public void assertEdgesSectionEdgeName(HashMap<String, String> keyMap);

    public void assertGraphSectionDescription(HashMap<String, String> keyMap);

    public void assertGraphSectionName(HashMap<String, String> keyMap);

    public void assertGraphSectionTag(HashMap<String, String> keyMap);

    public void assertPathsSectionDescription(HashMap<String, String> keyMap);

    public void assertPathsSectionName(HashMap<String, String> keyMap);

    public void assertPathsSectionTag(HashMap<String, String> keyMap);

    public void assertPresent(HashMap<String, String> keyMap);

    public void assertVerticesSectionVertexName(HashMap<String, String> keyMap);

    public void setContent(HashMap<String, String> keyMap);
}
