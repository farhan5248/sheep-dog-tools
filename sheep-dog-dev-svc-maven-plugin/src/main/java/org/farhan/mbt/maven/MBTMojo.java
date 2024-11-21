package org.farhan.mbt.maven;

import java.io.File;
import java.util.TreeMap;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.springframework.web.client.RestTemplate;

public abstract class MBTMojo extends AbstractMojo {

	/**
	 * The Maven Project.
	 */
	@Parameter(defaultValue = "${project}", readonly = true)
	public MavenProject project;

	public String baseDir = "";

	public MBTMojo() {
		baseDir = new File("").getAbsolutePath();
	}

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

	private void put(String tags, String fileName, String contents) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", tags);
		parameters.put("fileName", fileName);
		restTemplate.postForObject(getHost() + "addFile?tags={tags}&fileName={fileName}", contents,
				ModelTransformerResponse.class, parameters);
	}

	private void mojoGoal(String tags, String goal) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", tags);
		restTemplate.postForObject(getHost() + goal + "?tags={tags}", null, ModelTransformerResponse.class, parameters);
	}

	private String[] list(String tags, String dir) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", tags);
		parameters.put("dir", dir);
		String fileList = restTemplate.getForObject(getHost() + "getFileList?tags={tags}&dir={dir}",
				ModelTransformerResponse.class, parameters).fileName();
		if (!fileList.isBlank()) {
			return fileList.split("\n");
		} else {
			return new String[0];
		}
	}

	private String get(String tags, String fileName) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", tags);
		parameters.put("fileName", fileName);
		return restTemplate.getForObject(getHost() + "getFileContents?tags={tags}&fileName={fileName}",
				org.farhan.mbt.maven.ModelTransformerResponse.class, parameters).content();
	}

	public void execute(String goal) throws MojoExecutionException {
		getLog().info("Starting execute");
		getLog().info("tag: " + tag);
		getLog().info("baseDir: " + baseDir);

		if (!baseDir.endsWith("/")) {
			baseDir += "/";
		}
		SourceRepository sr = new SourceRepository(baseDir);
		// TODO make these configurable Maven properties
		String[] dirs = { "src/test/resources/asciidoc/", "src/test/resources/cucumber/",
				"src/test/java/org/farhan/objects/", "src/test/java/org/farhan/stepdefs/" };
		try {
			if (goal.endsWith("ToUML")) {
				for (String dir : dirs) {
					for (String fileName : sr.list(dir, "")) {
						put(tag, fileName.replace("\\", "/"), sr.get(fileName));
					}
				}
			}

			mojoGoal(tag, goal);

			if (!goal.endsWith("ToUML")) {
				for (String dir : dirs) {
					for (String fileName : list(tag, dir)) {
						sr.put(fileName, get(tag, fileName));
					}
				}
			}
		} catch (Exception e) {
			throw new MojoExecutionException(e);
		}
		getLog().info("Ending execute");
	}

}
