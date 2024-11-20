package org.farhan.mbt.maven;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.farhan.mbt.core.Converter;
import org.farhan.mbt.core.ObjectRepository;

public abstract class MBTMojo extends AbstractMojo {

	/**
	 * The Maven Project.
	 */
	@Parameter(defaultValue = "${project}", readonly = true)
	public MavenProject project;

	public String baseDir;

	public MBTMojo() {
		baseDir = new File("").getAbsolutePath();
	}

	/**
	 * The tag of the selected edges.
	 */
	@Parameter(property = "tag", defaultValue = "")
	public String tag;

	protected ObjectRepository fa = new FileObjectRepository();

	public void execute(Converter mojo) throws MojoExecutionException {
		getLog().info("Starting execute");
		getLog().info("tag: " + tag);
		getLog().info("baseDir: " + baseDir);

		// TODO this is an ugly hack for now, clean it up later
		((FileObjectRepository) fa).setTargetDir(baseDir);
		// TODO make these configurable Maven properties
		String[] dirs = { "src/test/resources/asciidoc/", "src/test/resources/cucumber/",
				"src/test/java/org/farhan/objects/", "src/test/java/org/farhan/stepdefs/" };
		try {

			if (mojo.getClass().getName().endsWith("ToUML")) {
				for (String dir : dirs) {
					for (String path : list(new File(baseDir + dir))) {
						String contents = get(new File(baseDir + path));
						getLog().debug("contents: " + contents);
						fa.put(tag, path.replace(baseDir, ""), contents);
					}
				}
			}

			mojo.mojoGoal();

			if (!mojo.getClass().getName().endsWith("ToUML")) {
				for (String dir : dirs) {
					for (String path : fa.list(tag, dir, "")) {
						String contents = fa.get(tag, path);
						getLog().debug("contents: " + contents);
						put(new File(baseDir + path), contents);
					}
				}
			}
		} catch (Exception e) {
			throw new MojoExecutionException(e);
		}
		getLog().info("Ending execute");
	}

	public ArrayList<String> list(File aDir) {
		ArrayList<String> theFiles = new ArrayList<String>();
		if (aDir.exists()) {
			for (String s : aDir.list()) {
				File tempFile = new File(aDir.getPath() + File.separator + s);
				if (tempFile.isDirectory()) {
					theFiles.addAll(list(tempFile));
				} else {
					theFiles.add(tempFile.getPath().replaceAll("\\\\+", "/").replace(baseDir, ""));
				}
			}
		}
		return theFiles;
	}

	public String get(File aFile) throws Exception {
		return new String(Files.readAllBytes(aFile.toPath()), StandardCharsets.UTF_8);
	}

	public void put(File aFile, String content) throws Exception {
		aFile.getParentFile().mkdirs();
		PrintWriter aPrintWriter = new PrintWriter(aFile, StandardCharsets.UTF_8);
		aPrintWriter.print(content);
		aPrintWriter.flush();
		aPrintWriter.close();
	}
}
