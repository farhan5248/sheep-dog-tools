package org.farhan.objects.mbtTransformer;

import org.farhan.common.objects.MbtTransformer;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graphuml.ConvertGraphToUMLMojo;
import org.junit.jupiter.api.Assertions;

public class MbtTransformerGraphToUmlGoal extends MbtTransformer {

    public void transition() {
        try {
        	ConvertGraphToUMLMojo mojo = new ConvertGraphToUMLMojo();
            mojo.mojoGoal();
        } catch (Exception e) {
            Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
        }
    }
}
