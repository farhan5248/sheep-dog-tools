package org.farhan.objects.mbtTransformer;

import java.util.HashMap;

public interface SetObjectAsFollowsGraphFile {

    public void assertEdgesSectionEdgeName(HashMap<String, String> keyMap);

    public void assertPresent(HashMap<String, String> keyMap);

    public void assertVerticesSectionVertexName(HashMap<String, String> keyMap);
}
