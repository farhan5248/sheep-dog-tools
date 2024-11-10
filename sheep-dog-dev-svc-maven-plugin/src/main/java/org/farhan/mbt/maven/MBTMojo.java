package org.farhan.mbt.maven;

import java.io.File;
import java.util.TreeMap;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

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

	@Parameter(property = "port", defaultValue = "8080")
	public int port;

	private String getHost() {
		return "http://localhost:" + port + "/";
	}

	private final RestTemplate restTemplate = new RestTemplate();

	private void addFile(String tags, String fileName, String contents) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", tags);
		parameters.put("fileName", fileName);
		restTemplate.postForObject(getHost() + "addFile?tags={tags}&fileName={fileName}", contents,
				ModelTransformerResponse.class, parameters);
	}

	private void runGoal(String tags, String goal) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", tags);
		restTemplate.postForObject(getHost() + goal + "?tags={tags}", null, ModelTransformerResponse.class, parameters);
	}

	private String getFileList(String tags) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", tags);
		return restTemplate
				.getForObject(getHost() + "getFileList?tags={tags}", ModelTransformerResponse.class, parameters)
				.fileName();
	}

	private String getFileContents(String tags, String fileName) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", tags);
		parameters.put("fileName", fileName);
		return restTemplate.getForObject(getHost() + "getFileContents?tags={tags}&fileName={fileName}",
				org.farhan.mbt.maven.ModelTransformerResponse.class, parameters).content();
	}

	public void execute(String mojo) throws MojoExecutionException {
		getLog().info("Starting execute");
		getLog().info("tag: " + tag);
		getLog().info("srcDir: " + srcDir);
		try {
			// TODO only upload step libraries and interfaces, not every .java file
			for (File aFile : Utilities.recursivelyListFiles(srcDir, "")) {
				String contents = Utilities.readFile(aFile);
				String fileName = aFile.getAbsolutePath().replace(srcDir.getAbsolutePath() + "\\", "");
				addFile(tag, fileName.replace("\\", "/"), contents);
			}

			runGoal(tag, mojo);

			for (String fileName : getFileList(tag).split("\n")) {
				String contents = getFileContents(tag, fileName.replace("\\", "/"));
				Utilities.writeFile(new File(srcDir.getAbsolutePath() + "\\" + fileName), contents);
			}
		} catch (Exception e) {
			getLog().error(Utilities.getStackTraceAsString(e));
			throw new MojoExecutionException(e);
		}
		getLog().info("Ending execute");
	}

}
