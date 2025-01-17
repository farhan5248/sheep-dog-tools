package org.farhan.mbt.maven;

import java.io.File;
import java.util.TreeMap;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public abstract class MBTMojo extends AbstractMojo {

	/**
	 * The Maven Project.
	 */
	@Parameter(defaultValue = "${project}", readonly = true)
	public MavenProject project;

	public String baseDir = "";

	private final RestTemplate restTemplate;

	public MBTMojo() {
		baseDir = new File("").getAbsolutePath();
		RestClientConfig config = new RestClientConfig();
		this.restTemplate = config.restTemplate();
	}

	@Parameter(property = "timeout", defaultValue = "120000")
	public int timeout;

	/**
	 * The tag of the selected edges.
	 */
	@Parameter(property = "tag", defaultValue = "")
	public String tag;

	@Parameter(property = "port", defaultValue = "8080")
	public int port;

	@Parameter(property = "host", defaultValue = "sheep-dog-dev-svc")
	public String host;

	private String getHost() {
		return "http://" + host + ":" + port + "/";
	}

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

	private void waitForService() throws MojoExecutionException {
		long startTime = System.currentTimeMillis();
		while (System.currentTimeMillis() - startTime < timeout) {
			try {
				ResponseEntity<String> response = restTemplate.getForEntity(getHost() + "actuator/health", String.class);
				if (response.getStatusCode() == HttpStatus.OK && 
					response.getBody().contains("\"status\":\"UP\"")) {
					return;
				}
			} catch (Exception e) {
				long timeLeft = (timeout - (System.currentTimeMillis() - startTime)) / 1000;
				getLog().info("Service not ready yet, " + timeLeft + " seconds remaining");
			}
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				throw new MojoExecutionException("Interrupted while waiting for service", e);
			}
		}
		
		throw new MojoExecutionException("Service did not become available within " + timeout + " milliseconds");
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
			waitForService();
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
