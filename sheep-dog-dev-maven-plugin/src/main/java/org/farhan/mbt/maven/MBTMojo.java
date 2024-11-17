package org.farhan.mbt.maven;

import java.io.File;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.MojoGoal;

public abstract class MBTMojo extends AbstractMojo {

	/**
	 * The Maven Project.
	 */
	@Parameter(defaultValue = "${project}", readonly = true)
	public MavenProject project;

	public String srcDir;

	public MBTMojo() {
		srcDir = new File("src/test/").getAbsolutePath();
	}

	/**
	 * The tag of the selected edges.
	 */
	@Parameter(property = "tag", defaultValue = "")
	public String tag;

	protected ObjectRepository fa = new FileObjectRepository();

	public void execute(MojoGoal mojo) throws MojoExecutionException {
		getLog().info("Starting execute");
		getLog().info("tag: " + tag);
		getLog().info("srcDir: " + srcDir);
		try {
			if (ConvertibleProject.baseDir.isEmpty()) {
				ConvertibleProject.baseDir = "target/mbt/";
			}
			// TODO this should only send the layer 1,2,3 files, not runners, common or impl
			// TODO the files shouldn't be resent, make a flag to control if this needs to
			// happen or the get below
			for (String aFile : fa.list(srcDir, "")) {
				String contents = fa.get(aFile);
				getLog().debug("contents: " + contents);
				mojo.addFile(aFile.replace(srcDir, ""), contents);
			}
			mojo.mojoGoal();
			for (String fileName : mojo.getFileList()) {
				String contents = mojo.getFileContents(fileName);
				getLog().debug("contents: " + contents);
				fa.put(srcDir + fileName, contents);
			}
		} catch (Exception e) {
			throw new MojoExecutionException(e);
		}
		getLog().info("Ending execute");
	}
}
