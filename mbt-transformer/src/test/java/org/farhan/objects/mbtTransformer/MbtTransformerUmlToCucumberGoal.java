package org.farhan.objects.mbtTransformer;

import org.farhan.common.objects.MbtTransformer;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumberuml.ConvertUMLToCucumberMojo;
import org.junit.jupiter.api.Assertions;

public class MbtTransformerUmlToCucumberGoal extends MbtTransformer {

    public void transition() {
        try {
            ConvertUMLToCucumberMojo mojo = new ConvertUMLToCucumberMojo();
            mojo.mojoGoal();
        } catch (Exception e) {
            Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
        }
    }
}
