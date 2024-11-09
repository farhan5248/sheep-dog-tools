package org.farhan.common;

import java.io.DataOutputStream;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import org.json.*;
import org.farhan.mbt.core.Utilities;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.web.server.LocalServerPort;

public class RestService extends TestObject {

	@LocalServerPort
	private int port;

	private String getHost() {
		return "http://localhost:" + port + "/";
	}

	private HttpURLConnection createRequest(String url, Map<String, String> parameters, String method)
			throws Exception {
		for (String param : parameters.keySet()) {
			if (url.contains("?")) {
				url += "&";
			} else {
				url += "?";
			}
			url += param + "=" + parameters.get(param);
		}
		parameters = new TreeMap<String, String>();
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);
		connection.setRequestProperty("Content-Type", "text/plain");
		connection.setRequestProperty("charset", "utf-8");
		connection.setRequestMethod(method);
		return connection;
	}

	private String sendRequest(HttpURLConnection connection) throws Exception {
		connection.connect();
		if (connection.getResponseCode() != 200) {
			throw new Exception("Invalid response code: " + connection.getResponseCode());
		}
		Scanner scanner = new Scanner(connection.getInputStream());
		String response = scanner.nextLine();
		scanner.close();
		return response;
	}

	protected JSONObject sendGetRequest(String resource, Map<String, String> parameters) throws Exception {
		HttpURLConnection connection = createRequest(getHost() + resource, parameters, "GET");
		return new JSONObject(sendRequest(connection));
	}

	protected void sendPostRequest(String resource, Map<String, String> parameters, String payload) throws Exception {
		HttpURLConnection connection = createRequest(getHost() + resource, parameters, "POST");
		DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
		wr.write(payload.getBytes(StandardCharsets.UTF_8));
		sendRequest(connection);
	}

	protected void runGoal(String resource) {
		try {
			File srcDir = new File("target/src-gen/" + this.keyValue.get("component") + "/src/test/");
			TreeMap<String, String> parameters = new TreeMap<String, String>();
			if (keyValue.get("tags") == null) {
				keyValue.put("tags", "");
			}
			if (!keyValue.get("tags").isEmpty()) {
				parameters.put("tags", keyValue.get("tags"));
			}
			for (File aFile : Utilities.recursivelyListFiles(srcDir, "")) {
				String contents = Utilities.readFile(aFile);
				String fileName = aFile.getAbsolutePath().replace(srcDir.getAbsolutePath() + "\\", "").replace("\\",
						"/");
				parameters.put("fileName", fileName);
				sendPostRequest("addFile", parameters, contents);
				parameters.remove("fileName");
			}
			sendPostRequest(resource, parameters, "");
			String fileList = sendGetRequest("getFileList", parameters).getString("fileName");
			if (!fileList.isBlank()) {
				for (String fileName : fileList.split("\n")) {
					parameters.put("fileName", fileName.replace("\\", "/"));
					String contents = sendGetRequest("getFileContents", parameters).getString("content");
					parameters.remove("fileName");
					Utilities.writeFile(new File(srcDir.getAbsolutePath() + "\\" + fileName), contents);
				}
			}
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}
}
