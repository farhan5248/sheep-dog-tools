package org.farhan.mbt.maven;

import java.io.File;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.farhan.mbt.convert.ConvertAsciidoctorToUML;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.MojoGoal;
import org.farhan.mbt.core.Utilities;

/**
 * Converts Ascii Doctor files to Graph model paths
 *
 */
@Mojo(name = "asciidoctor-to-uml", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class AsciiDoctorToUMLMojo extends MBTMojo {



	public void execute() throws MojoExecutionException {
		// TODO after adding the file copy, move to MBTMojo
		try {
			getLog().info("Converting tests with this tag: " + tag);
			if (project != null) {
				// TODO the basedir should be passed into the Docker container when it starts
				ConvertibleProject.baseDir = project.getBasedir().getAbsolutePath() + File.separator + "target"
						+ File.separator + "mbt" + File.separator;
			}
			getLog().info("Converting tests in this directory: " + ConvertibleProject.baseDir);
			MojoGoal mojo = new ConvertAsciidoctorToUML();

			// TODO
			// get the list of files from the src directory
			// For each file name, get its contents and then pass it to the mojo.
			// Make a new method that takes the file name and content and writes it to the
			// baseDir

			// TODO rename mojoGoal to convert
			// TODO when the goal is complete, it should return a list of files to modify
			// across all 3 layers. Loop through those files and get their content and write
			// it out locally
			mojo.mojoGoal(tag);
		} catch (Exception e) {
			getLog().error(Utilities.getStackTraceAsString(e));
			throw new MojoExecutionException(e);
		}
	}
}