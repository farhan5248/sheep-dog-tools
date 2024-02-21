package org.farhan.objects.mbtTransformer;

import org.farhan.common.MbtTransformerGoal;

public class MbtTransformerGraphToUmlGoal extends MbtTransformerGoal {

    public void transition() {
		runGoal("org.farhan.mbt.graphuml.ConvertGraphToUML");
    }
}
