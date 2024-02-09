package org.farhan.objects.mbtTransformer;

import org.farhan.common.objects.MbtTransformerGoal;

public class MbtTransformerAsciidoctorToGraphGoal extends MbtTransformerGoal {

	public void transition() {
		runGoal("org.farhan.mbt.asciidoctorgraph.ConvertAsciiDoctorToGraph");
	}
}
