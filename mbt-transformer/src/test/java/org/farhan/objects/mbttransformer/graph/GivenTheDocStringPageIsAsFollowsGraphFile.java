package org.farhan.objects.mbttransformer.graph;

import java.util.HashMap;

public interface GivenTheDocStringPageIsAsFollowsGraphFile {

    public void setContent(HashMap<String, String> keyMap);

    public void assertPresent(HashMap<String, String> keyMap);

    public void assertEdgesSectionEdgeName(HashMap<String, String> keyMap);
}
