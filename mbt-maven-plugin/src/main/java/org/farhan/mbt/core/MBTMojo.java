package org.farhan.mbt.core;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.apache.maven.settings.Settings;

/**
 * Says "Hi" to the user.
 *
 */
@Mojo(name = "sayhi", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class MBTMojo extends AbstractMojo {

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
	 * The greeting to display.
	 */
	@Parameter(property = "sayhi.greeting", defaultValue = "Hello World!")
	private String greeting;

	private String option0;
	private String option1;

	@Parameter(property = "options")
	public void setOptions(String[] options) {
		// we can do something more with provided parameter
		this.option0 = options[0];
		this.option1 = options[1];
	}

	public void execute() throws MojoExecutionException {
		getLog().info("Hello, world.");
	}
}