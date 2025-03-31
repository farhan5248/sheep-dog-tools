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
import org.farhan.mbt.convert.Converter;
import org.farhan.mbt.convert.Logger;
import org.farhan.mbt.convert.ObjectRepository;

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
	 * The tag of the selected paths
	 */
	@Parameter(property = "tag", defaultValue = "")
	public String tags;

	/**
	 * The tag of the selected paths
	 */
	@Parameter(property = "repoDir", defaultValue = "")
	public String repoDir;

	public void execute(String goal, String dir) throws MojoExecutionException {
		getLog().info("Starting execute");
		getLog().info("tag: " + tags);
		getLog().info("baseDir: " + baseDir);

		if (!baseDir.endsWith("/")) {
			baseDir += "/";
		}
		// TODO make a unit (non asciidoc) test for this, test both relative and
		// complete paths
		if (repoDir.isEmpty()) {
			repoDir = baseDir;
		} else if (!repoDir.endsWith("/")) {
			repoDir += "/";			
		}
		ObjectRepository or = new FileObjectRepository(repoDir);
		SourceRepository sr = new SourceRepository(baseDir);
		try {

			Class<?> mojoClass = Class.forName(goal);
			Converter mojo = (Converter) mojoClass.getConstructor(String.class, ObjectRepository.class, Logger.class)
					.newInstance(tags, or, new LoggerImpl(getLog()));

			if (mojo.getClass().getName().endsWith("ToUML")) {
				mojo.clearProjects();
				ArrayList<String> tempFiles = new ArrayList<String>();
				for (String fileName : sr.list(dir, "")) {
					if (fileName.startsWith(dir + "stepdefs")) {
						tempFiles.add(fileName);
					} else {
						mojo.convertFile(fileName, sr.get(fileName));
					}
				}
				for (String fileName : tempFiles) {
					mojo.convertFile(fileName, sr.get(fileName));
				}
			} else {
				for (String fileName : mojo.getFileNames()) {
					String content = mojo.convertFile(fileName, sr.contains(fileName) ? sr.get(fileName) : "");
					if (!content.isEmpty()) {
						sr.put(fileName, content);
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
