package org.farhan.objects.mbtTransformer;

import org.farhan.common.objects.MbtTransformerGoal;

public class MbtTransformerUmlToCucumberGoal extends MbtTransformerGoal {

	public void transition() {
		runGoal("org.farhan.mbt.cucumberuml.ConvertUMLToCucumber");

	}
}
