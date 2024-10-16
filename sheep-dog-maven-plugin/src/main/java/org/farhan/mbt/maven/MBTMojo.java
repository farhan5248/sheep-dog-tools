package org.farhan.mbt.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

public abstract class MBTMojo extends AbstractMojo {

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
}
