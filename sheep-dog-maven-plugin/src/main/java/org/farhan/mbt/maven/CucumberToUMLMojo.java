package org.farhan.mbt.maven;

import java.io.File;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.farhan.mbt.convert.ConvertCucumberToUML;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.MojoGoal;
import org.farhan.mbt.core.Utilities;

/**
 * Converts tagged Cucumber scenarios to a UML model using Eclipse Xtext and EMF
 *
 */
@Mojo(name = "cucumber-to-uml", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class CucumberToUMLMojo extends MBTMojo {

	public void execute() throws MojoExecutionException {
		try {
			getLog().info("Converting tests with this tag: " + tag);
			if (project != null) {
				ConvertibleProject.baseDir = project.getBasedir().getAbsolutePath() + File.separator;
			}
			getLog().info("Converting tests in this directory: " + ConvertibleProject.baseDir);
			MojoGoal mojo = new ConvertCucumberToUML();
			mojo.mojoGoal(tag);
		} catch (Exception e) {
			getLog().error(Utilities.getStackTraceAsString(e));
			throw new MojoExecutionException(e);
		}
	}
}