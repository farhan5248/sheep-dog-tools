package org.farhan.objects.mbtTransformer;

import java.util.HashMap;

public interface ProcessGraphFile {

    public void assertEdgesGraphEdgesSectionEdgeSourceVertexName(HashMap<String, String> keyMap);

    public void assertEdgesGraphEdgesSectionGraphEdgeName(HashMap<String, String> keyMap);

    public void assertEdgesGraphVerticesSectionEdgeSourceVertexName(HashMap<String, String> keyMap);

    public void assertEdgesGraphVerticesSectionGraphVertexName(HashMap<String, String> keyMap);

    public void assertEdgesSectionDescription(HashMap<String, String> keyMap);

    public void assertEdgesSectionEdgeName(HashMap<String, String> keyMap);

    public void assertEdgesSectionLabel(HashMap<String, String> keyMap);

    public void assertEdgesSectionTag(HashMap<String, String> keyMap);

    public void assertGraphSectionDescription(HashMap<String, String> keyMap);

    public void assertGraphSectionLabel(HashMap<String, String> keyMap);

    public void assertGraphSectionTag(HashMap<String, String> keyMap);

    public void assertPresent(HashMap<String, String> keyMap);

    public void assertVerticesSectionVertexName(HashMap<String, String> keyMap);

    public void setContent(HashMap<String, String> keyMap);
}
