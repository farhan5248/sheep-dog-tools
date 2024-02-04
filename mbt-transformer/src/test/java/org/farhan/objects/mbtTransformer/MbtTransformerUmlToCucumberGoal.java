package org.farhan.objects.mbtTransformer;

import org.farhan.common.objects.MbtTransformerGoal;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumberuml.ConvertUMLToCucumber;
import org.junit.jupiter.api.Assertions;

public class MbtTransformerUmlToCucumberGoal extends MbtTransformerGoal {

	public void transition() {
		try {
			ConvertUMLToCucumber mojo = new ConvertUMLToCucumber();
			mojo.mojoGoal();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}
