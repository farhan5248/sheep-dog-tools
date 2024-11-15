package org.farhan.mbt.maven;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.FileAccessor;
import org.farhan.mbt.core.MojoGoal;

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

	protected FileAccessor fa = new FileAccessorImpl();

	public void execute(MojoGoal mojo) throws MojoExecutionException {
		getLog().info("Starting execute");
		getLog().info("tag: " + tag);
		getLog().info("srcDir: " + srcDir);
		try {
			if (ConvertibleProject.baseDir.isEmpty()) {
				ConvertibleProject.baseDir = "target/mbt/";
			}
			// TODO this should only send the layer 1,2,3 files, not runners, common or impl
			for (File aFile : fa.recursivelyListFiles(srcDir, "")) {
				String contents = fa.readFile(aFile);
				getLog().debug("contents: " + contents);
				mojo.addFile(aFile.getAbsolutePath().replace(srcDir.getAbsolutePath(), ""), contents);
			}
			mojo.mojoGoal();
			for (String fileName : mojo.getFileList()) {
				String contents = mojo.getFileContents(fileName);
				getLog().debug("contents: " + contents);
				fa.writeFile(new File(srcDir.getAbsolutePath() + fileName), contents);
			}
		} catch (Exception e) {
			throw new MojoExecutionException(e);
		}
		getLog().info("Ending execute");
	}
}
