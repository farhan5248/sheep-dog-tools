package org.farhan.mbt.maven;

import static org.junit.jupiter.api.Assertions.*;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.apache.maven.plugin.MojoExecutionException;
import org.junit.jupiter.api.Test;

class GoalTest {

	@Test
	void goalWithOneTag() {
		try {
			AsciiDoctorToUMLMojo mojo = new AsciiDoctorToUMLMojo();
			mojo.tag = "new";
			mojo.execute();
		} catch (MojoExecutionException e) {
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			fail("Exception when trying to run the goal\n" + sw.toString());
		}
	}

	@Test
	void goalWithNoTag() {
		try {
			AsciiDoctorToUMLMojo mojo = new AsciiDoctorToUMLMojo();
			mojo.tag = "";
			mojo.execute();
		} catch (MojoExecutionException e) {
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			fail("Exception when trying to run the goal\n" + sw.toString());
		}
	}

}
