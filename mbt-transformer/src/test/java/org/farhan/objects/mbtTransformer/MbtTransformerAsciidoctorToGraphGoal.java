package org.farhan.objects.mbtTransformer;

import org.farhan.common.MbtTransformerGoal;

public class MbtTransformerAsciidoctorToGraphGoal extends MbtTransformerGoal {

	public void transition() {
		runGoal("org.farhan.mbt.asciidoctorgraph.ConvertAsciiDoctorToGraph");
	}
}
