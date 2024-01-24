package org.farhan.objects.mbtTransformer;

import java.util.HashMap;
import org.farhan.common.objects.MbtTransformer;

public class MbtTransformerProcessGraphFile extends MbtTransformer {

	public void assertVerticesVertexName(HashMap<String, String> keyMap) {
		assertVerticesVertexNameExists(keyMap.get("Vertex Name"));
	}

	public void assertEdgesEdgeName(HashMap<String, String> keyMap) {
		assertEdgesEdgeNameExists(keyMap.get("Edge Name"));
	}

}
