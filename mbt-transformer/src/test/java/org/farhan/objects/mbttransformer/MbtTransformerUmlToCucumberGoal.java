package org.farhan.objects.mbttransformer;

import org.farhan.common.objects.MbtTransformer;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.ConvertUMLToCucumberPSTMojo;
import org.junit.jupiter.api.Assertions;

public class MbtTransformerUmlToCucumberGoal extends MbtTransformer {

    public void transition() {
        try {
            ConvertUMLToCucumberPSTMojo mojo = new ConvertUMLToCucumberPSTMojo();
            mojo.mojoGoal();
        } catch (Exception e) {
            Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
        }
    }
}
