package org.farhan.mbt.maven;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.farhan.mbt.convert.ConvertUMLToCucumberSpring;

/**
 * Converts tagged Cucumber scenarios to a UML model using Eclipse Xtext and EMF
 *
 */
@Mojo(name = "uml-to-cucumber-spring", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class UMLToCucumberSpringMojo extends MBTMojo {

	public void execute() throws MojoExecutionException {
		super.execute(new ConvertUMLToCucumberSpring(tag));
	}
}