package org.farhan.objects.mbttransformer.graph;

import java.util.HashMap;

public interface SetObjectAsFollowsGraphFile {

    public void assertPresent(HashMap<String, String> keyMap);

    public void assertVerticesSectionVertexName(HashMap<String, String> keyMap);

    public void assertEdgesSectionEdgeName(HashMap<String, String> keyMap);
}
