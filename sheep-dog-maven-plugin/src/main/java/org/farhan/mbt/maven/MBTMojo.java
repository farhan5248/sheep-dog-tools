package org.farhan.mbt.maven;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.MojoGoal;
import org.farhan.mbt.core.Utilities;

public abstract class MBTMojo extends AbstractMojo {

	/**
	 * The Maven Project.
	 */
	@Parameter(defaultValue = "${project}", readonly = true)
	public MavenProject project;

	public File srcDir = new File("src/test/");

	/**
	 * The tag of the selected edges.
	 */
	@Parameter(property = "tag", defaultValue = "")
	public String tag;

	public void execute(MojoGoal mojo) throws MojoExecutionException {
		try {
			// TODO this should probably be mojo.getBaseDir instead of exposing
			// ConvertibleProject.baseDir
			ConvertibleProject.baseDir = "target/mbt/";
			for (File aFile : Utilities.recursivelyListFiles(srcDir, "")) {
				mojo.addFile(aFile.getAbsolutePath().replace(srcDir.getAbsolutePath(), ""), Utilities.readFile(aFile));
			}
			getLog().info("Converting tests with this tag: " + tag);
			mojo.mojoGoal(tag);
			for (String fileName : mojo.getFileList()) {
				Utilities.writeFile(new File(srcDir.getAbsolutePath() + fileName), mojo.getFileContents(fileName));
			}
		} catch (Exception e) {
			getLog().error(Utilities.getStackTraceAsString(e));
			throw new MojoExecutionException(e);
		}
	}
}
