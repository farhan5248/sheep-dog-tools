package org.farhan.mbt.maven;

import java.io.File;
import java.util.TreeMap;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

public abstract class MBTMojo extends AbstractMojo {

	private String host = "http://localhost:8080/";

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

	public void execute(String mojo) throws MojoExecutionException {
		getLog().info("Starting execute");
		getLog().info("tag: " + tag);
		getLog().info("srcDir: " + srcDir);
		TreeMap<String, String> parameters;
		try {
			parameters = new TreeMap<String, String>();
			// TODO only upload step libraries and interfaces, not every .java file
			for (File aFile : Utilities.recursivelyListFiles(srcDir, "")) {
				String contents = Utilities.readFile(aFile);
				getLog().debug("contents: " + contents);
				String fileName = aFile.getAbsolutePath().replace(srcDir.getAbsolutePath() + "\\", "").replace("\\",
						"/");
				parameters.put("tag", tag);
				parameters.put("fileName", fileName);
				Utilities.sendPostRequest(host + "addFile", parameters, contents);
			}
			parameters = new TreeMap<String, String>();
			if (!tag.isEmpty()) {
				parameters.put("tags", tag);
			}
			Utilities.sendPostRequest(host + mojo, parameters, "");
			parameters = new TreeMap<String, String>();
			parameters.put("tag", tag);
			String fileList = Utilities.sendGetRequest(host + "getFileList", new TreeMap<String, String>())
					.getString("fileName");
			getLog().debug("fileList: " + fileList);
			if (!fileList.isBlank()) {
				parameters = new TreeMap<String, String>();
				for (String fileName : fileList.split("\n")) {
					parameters.put("tag", tag);
					parameters.put("fileName", fileName);
					String contents = Utilities.sendGetRequest(host + "getFileContents", parameters)
							.getString("content");
					getLog().debug("contents: " + contents);
					Utilities.writeFile(new File(srcDir.getAbsolutePath() + "\\" + fileName), contents);
				}
			}
		} catch (Exception e) {
			getLog().error(Utilities.getStackTraceAsString(e));
			throw new MojoExecutionException(e);
		}
		getLog().info("Ending execute");
	}

}
