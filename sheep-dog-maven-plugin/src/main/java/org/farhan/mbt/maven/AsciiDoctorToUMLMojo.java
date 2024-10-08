package org.farhan.mbt.maven;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.farhan.mbt.convert.ConvertAsciidoctorToUML;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.MojoGoal;
import org.farhan.mbt.core.Utilities;

/**
 * Converts Ascii Doctor files to Graph model paths
 *
 */
@Mojo(name = "asciidoctor-to-uml", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class AsciiDoctorToUMLMojo extends AbstractMojo {

	/**
	 * The Maven Project.
	 */
	@Parameter(defaultValue = "${project}", readonly = true)
	protected MavenProject project;

	/**
	 * The tag of the selected edges.
	 */
	@Parameter(property = "tag", defaultValue = "")
	public String tag;

	public void execute() throws MojoExecutionException {
		// TODO after adding the file copy, create an abstract parent class to avoid
		// code duplication
		try {
			getLog().info("Converting tests with this tag: " + tag);
			if (project != null) {
				// TODO set this to project.getBasedir().getAbsolutePath() + File.separator +
				// "target/src-gen/"
				ConvertibleProject.baseDir = project.getBasedir().getAbsolutePath() + File.separator;
			}
			getLog().info("Converting tests in this directory: " + ConvertibleProject.baseDir);
			MojoGoal mojo = new ConvertAsciidoctorToUML();

			// TODO
			// get the list of files from the git repo. the param is either file:// or
			// http://
			// the param is passed in
			// For each file name, get its contents and then pass it to the mojo.
			// Make a new method that takes the file name and content and writes it to the
			// baseDir "target/src-gen/"

			// TODO rename mojoGoal to convert
			mojo.mojoGoal(tag);
		} catch (Exception e) {
			getLog().error(Utilities.getStackTraceAsString(e));
			throw new MojoExecutionException(e);
		}
	}
}