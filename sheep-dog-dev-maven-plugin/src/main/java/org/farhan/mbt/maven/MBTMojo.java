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
		getLog().info("Starting execute");
		getLog().info("tag: " + tag);
		getLog().info("srcDir: " + srcDir);
		try {
			if (ConvertibleProject.baseDir.isEmpty()) {
				ConvertibleProject.baseDir = "target/mbt/";
			}
			for (File aFile : Utilities.recursivelyListFiles(srcDir, "")) {
				String contents = Utilities.readFile(aFile);
				getLog().debug("contents: " + contents);
				mojo.addFile(aFile.getAbsolutePath().replace(srcDir.getAbsolutePath(), ""), contents);
			}
			mojo.mojoGoal(tag);
			for (String fileName : mojo.getFileList()) {
				String contents = mojo.getFileContents(fileName);
				getLog().debug("contents: " + contents);
				Utilities.writeFile(new File(srcDir.getAbsolutePath() + fileName), contents);
			}
		} catch (Exception e) {
			getLog().error(Utilities.getStackTraceAsString(e));
			throw new MojoExecutionException(e);
		}
		getLog().info("Ending execute");
	}
}
