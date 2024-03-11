package org.farhan.mbt.maven;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.farhan.mbt.convert.ConvertUMLToGraph;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.MojoGoal;
import org.farhan.mbt.core.Utilities;

/**
 * Converts a UML model to Graph model paths
 *
 */
@Mojo(name = "uml-to-graph", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class UMLToGraphMojo extends AbstractMojo {

	/**
	 * The Maven Project.
	 */
	@Parameter(defaultValue = "${project}", readonly = true)
	protected MavenProject project;

	/**
	 * The tag of the selected paths.
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
			MojoGoal mojo = new ConvertUMLToGraph();
			mojo.mojoGoal();
		} catch (Exception e) {
			getLog().error(Utilities.getStackTraceAsString(e));
			throw new MojoExecutionException(e);
		}
	}
}