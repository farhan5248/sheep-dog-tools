package org.farhan.objects.mbtTransformer;

import java.util.HashMap;

import org.farhan.common.objects.MbtTransformerGoal;
import org.farhan.mbt.core.ConvertibleProject;

public class MbtTransformerCucumberToUmlGoal extends MbtTransformerGoal {

	public void setTags(HashMap<String, String> keyMap) {
		// TODO I should probably pass the tags to the mojoGoal to keep it simple? It
		// can then set it at the project level or whatever
		ConvertibleProject.tags = keyMap.get("Tags");
	}

	@Override
	public void transition() {
		runGoal("org.farhan.mbt.cucumberuml.ConvertCucumberToUML");
	}

}
