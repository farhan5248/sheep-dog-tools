package org.farhan.common;

import java.util.TreeMap;
import org.farhan.mbt.service.ModelTransformerResponse;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class RestService extends TestObject {

	@Value("${server.port}")
	private int port;

	public RestService() {
		attributes.put("tags", "");
	}

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
				ModelTransformerResponse.class, parameters).content();
	}

	protected void runGoal(String goal) {

		SourceRepository sr = new SourceRepository();
		String[] dirs = { "src/test/resources/asciidoc/", "src/test/resources/cucumber/",
				"src/test/java/org/farhan/objects/", "src/test/java/org/farhan/stepdefs/" };

		try {
			if (goal.endsWith("ToUML")) {
				for (String dir : dirs) {
					for (String fileName : sr.list(dir, "")) {
						put(attributes.get("tags"), fileName.replace("\\", "/"), sr.get(fileName));
					}
				}
			}

			mojoGoal(attributes.get("tags"), goal);

			if (!goal.endsWith("ToUML")) {
				for (String dir : dirs) {
					for (String fileName : list(attributes.get("tags"), dir)) {
						sr.put(fileName, get(attributes.get("tags"), fileName));
					}
				}
			}
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}
}
