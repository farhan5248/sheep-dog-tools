package org.farhan.objects.mbtTransformer;

import org.farhan.common.objects.MbtTransformerGoal;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graphuml.ConvertGraphToUML;
import org.junit.jupiter.api.Assertions;

public class MbtTransformerGraphToUmlGoal extends MbtTransformerGoal {

    public void transition() {
        try {
        	ConvertGraphToUML mojo = new ConvertGraphToUML();
            mojo.mojoGoal();
        } catch (Exception e) {
            Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
        }
    }
}
