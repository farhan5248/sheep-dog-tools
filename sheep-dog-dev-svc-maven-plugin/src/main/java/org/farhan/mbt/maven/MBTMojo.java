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

	private void clearObjects(String goal) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", tag);
		restTemplate.delete(getHost() + "clear" + goal + "Objects?tags={tags}", parameters);
	}

	private String convertObject(String goal, String fileName, String contents) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", tag);
		parameters.put("fileName", fileName);
		return restTemplate.postForObject(getHost() + "run" + goal + "?tags={tags}&fileName={fileName}", contents,
				ModelTransformerResponse.class, parameters).content();
	}

	private String[] getObjectNames(String goal) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", tag);
		String fileList = restTemplate.getForObject(getHost() + "get" + goal + "ObjectNames?tags={tags}",
				ModelTransformerResponse.class, parameters).fileName();
		if (!fileList.isBlank()) {
			return fileList.split("\n");
		} else {
			return new String[0];
		}
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
		String[] dirs = { "src/test/resources/asciidoc/", "src/test/resources/cucumber/" };
		try {
			if (goal.endsWith("ToUML")) {
				clearObjects(goal);
				for (String dir : dirs) {
					for (String fileName : sr.list(dir, "")) {
						convertObject(goal, fileName, sr.get(fileName));
					}
				}
			} else {
				for (String fileName : getObjectNames(goal)) {
					String content = convertObject(goal, fileName, sr.contains(fileName) ? sr.get(fileName) : null);
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

}
