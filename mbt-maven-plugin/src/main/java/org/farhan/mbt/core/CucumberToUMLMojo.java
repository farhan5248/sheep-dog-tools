package org.farhan.mbt.core;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.apache.maven.settings.Settings;
import org.farhan.mbt.cucumberuml.ConvertCucumberToUML;

/**
 * Converts tagged Cucumber scenarios to a UML model using Eclipse Xtext and EMF
 *
 */
@Mojo(name = "cucumber-to-uml", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class CucumberToUMLMojo extends AbstractMojo {

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
	 * The tag of the selected scenarios.
	 */
	@Parameter(property = "tag", defaultValue = "debug")
	private String tag;

	public void execute() throws MojoExecutionException {
		getLog().info("Converting tests with this tag: "+tag);
		try {
			ConvertCucumberToUML mojo = new ConvertCucumberToUML();
			// TODO pass in tags to the mojo constructor
			ConvertibleProject.tags = tag;
			ConvertibleProject.baseDir = project.getBasedir().getAbsolutePath() + File.separator;
			mojo.mojoGoal();
		} catch (Exception e) {
			getLog().error(Utilities.getStackTraceAsString(e));
			throw new MojoExecutionException(e);
		}
	}
}