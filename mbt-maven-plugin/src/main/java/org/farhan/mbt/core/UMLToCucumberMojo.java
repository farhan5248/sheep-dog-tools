package org.farhan.mbt.core;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.apache.maven.settings.Settings;
import org.farhan.mbt.cucumberuml.ConvertUMLToCucumberMojo;

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
	 * The Maven Settings.
	 */
	@Parameter(defaultValue = "${settings}", readonly = true)
	private Settings settings;

	/**
	 * The tag of the selected scenarios. TODO This goal validates that the elements
	 * in the UML model are derived from scenarios with this tag
	 */
	@Parameter(property = "uml-to-cucumber.tag", defaultValue = "debug")
	private String tag;

	public void execute() throws MojoExecutionException {
		getLog().info(tag);
		try {
			ConvertUMLToCucumberMojo mojo = new ConvertUMLToCucumberMojo();
			// TODO pass in tags and basedir to the mojo constructor
			Project.tags = tag;
			Project.baseDir = project.getBasedir().getAbsolutePath() + File.separator;
			mojo.mojoGoal();
		} catch (Exception e) {
			getLog().error(Utilities.getStackTraceAsString(e));
			throw new MojoExecutionException(e);
		}
	}
}