package org.farhan.mbt.maven;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.apache.maven.settings.Settings;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.MojoGoal;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumberuml.ConvertUMLToCucumber;

/**
 * Converts tagged Cucumber scenarios to a UML model using Eclipse Xtext and EMF
 *
 */
@Mojo(name = "uml-to-cucumber", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class UMLToCucumberMojo extends AbstractMojo {

	/**
	 * The Maven Project.
	 */
	@Parameter(defaultValue = "${project}", readonly = true)
	protected MavenProject project;

	/**
	 * The tag of the selected scenarios. TODO This goal validates that the elements
	 * in the UML model are derived from scenarios with this tag
	 */
	@Parameter(property = "tag", defaultValue = "")
	private String tag;

	public void execute() throws MojoExecutionException {
		try {
			// TODO pass in tags to the mojo constructor
			if (project != null) {
				getLog().info("Converting tests with this tag: " + tag);
				ConvertibleProject.tags = tag;
				ConvertibleProject.baseDir = project.getBasedir().getAbsolutePath() + File.separator;
			}
			MojoGoal mojo = new ConvertUMLToCucumber();
			mojo.mojoGoal();
		} catch (Exception e) {
			getLog().error(Utilities.getStackTraceAsString(e));
			throw new MojoExecutionException(e);
		}
	}
}