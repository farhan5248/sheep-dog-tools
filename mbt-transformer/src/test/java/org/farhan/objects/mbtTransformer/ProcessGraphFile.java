package org.farhan.objects.mbtTransformer;

import java.util.HashMap;

public interface ProcessGraphFile {

    public void assertPresent(HashMap<String, String> keyMap);

    public void assertEdgesGraphVerticesSectionEdgeSourceVertexName(HashMap<String, String> keyMap);

    public void assertEdgesGraphVerticesSectionGraphVertexName(HashMap<String, String> keyMap);

    public void assertEdgesGraphEdgesSectionEdgeSourceVertexName(HashMap<String, String> keyMap);

    public void assertEdgesGraphEdgesSectionGraphEdgeName(HashMap<String, String> keyMap);

    public void assertVerticesSectionVertexName(HashMap<String, String> keyMap);

    public void assertEdgesSectionEdgeName(HashMap<String, String> keyMap);

    public void setContent(HashMap<String, String> keyMap);
}
