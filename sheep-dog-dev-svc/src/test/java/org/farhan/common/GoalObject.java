package org.farhan.common;

import java.util.TreeMap;
import org.farhan.mbt.service.ModelTransformerResponse;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class GoalObject extends TestObject {

	@Value("${server.port}")
	private int port;

	public GoalObject() {
		attributes.put("tags", "");
	}

	private String getHost() {
		return "http://localhost:" + port + "/";
	}

	private final RestTemplate restTemplate = new RestTemplate();

	private String convertObject(String goal, String fileName, String contents) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", attributes.get("tags"));
		parameters.put("fileName", fileName);
		return restTemplate.postForObject(getHost() + "run" + goal + "?tags={tags}&fileName={fileName}", contents,
				ModelTransformerResponse.class, parameters).content();
	}

	private String[] getObjectNames(String goal) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", attributes.get("tags"));
		String fileList = restTemplate.getForObject(getHost() + "get" + goal + "ObjectNames?tags={tags}",
				ModelTransformerResponse.class, parameters).fileName();
		if (!fileList.isBlank()) {
			return fileList.split("\n");
		} else {
			return new String[0];
		}
	}

	protected void runGoal(String goal) {

		SourceRepository sr = new SourceRepository();
		String[] dirs = { "src/test/resources/asciidoc/", "src/test/resources/cucumber/",
				"src/test/java/org/farhan/objects/", "src/test/java/org/farhan/stepdefs/" };

		try {

			if (goal.endsWith("ToUML")) {
				for (int i = 0; i < 2; i++) {
					for (String fileName : sr.list(dirs[i], "")) {
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
			Assertions.fail(getStackTraceAsString(e));
		}
	}
}
