package org.farhan.objects.mbtTransformer;

import org.farhan.common.MbtTransformerGoal;

public class MbtTransformerUmlToCucumberGoal extends MbtTransformerGoal {

	public void transition() {
		runGoal("org.farhan.mbt.cucumberuml.ConvertUMLToCucumber");

	}
}
