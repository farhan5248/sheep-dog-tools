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
	public String tags;

	public void execute(String goal) throws MojoExecutionException {
		getLog().info("Starting execute");
		getLog().info("tag: " + tags);
		getLog().info("baseDir: " + baseDir);

		if (!baseDir.endsWith("/")) {
			baseDir += "/";
		}
		ObjectRepository or = new FileObjectRepository(baseDir);
		SourceRepository sr = new SourceRepository(baseDir);
		// TODO make these configurable Maven properties
		String[] dirs = { "src/test/resources/asciidoc/", "src/test/resources/cucumber/",
				"src/test/java/org/farhan/objects/", "src/test/java/org/farhan/stepdefs/" };
		try {

			Class<?> mojoClass = Class.forName(goal);
			Converter mojo = (Converter) mojoClass.getConstructor(String.class, ObjectRepository.class)
					.newInstance(tags, or);

			if (goal.endsWith("ToUML")) {
				for (String dir : dirs) {
					for (String fileName : sr.list(dir, "")) {
						or.put(tags, fileName, sr.get(fileName));
					}
				}
			}

			mojo.mojoGoal();

			if (!goal.endsWith("ToUML")) {
				for (String dir : dirs) {
					for (String fileName : or.list(tags, dir, "")) {
						sr.put(fileName, or.get(tags, fileName));
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
