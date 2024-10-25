package org.farhan.common;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import org.json.*;
import org.farhan.mbt.core.Utilities;
import org.junit.jupiter.api.Assertions;

public class RestService extends TestObject {

	private String host = "http://localhost:8080/";
	private TreeMap<String, String> parameters = new TreeMap<String, String>();

	protected void addParameter(String name, String value) {
		parameters.put(name, value);
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
		HttpURLConnection connection = createRequest(host + resource, parameters, "GET");
		return new JSONObject(sendRequest(connection));
	}

	protected void sendPostRequest(String resource, Map<String, String> parameters, String payload) throws Exception {
		HttpURLConnection connection = createRequest(host + resource, parameters, "POST");
		DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
		wr.write(payload.getBytes(StandardCharsets.UTF_8));
		sendRequest(connection);
	}

	protected void runGoal(String resource) {
		try {
			sendPostRequest(resource, parameters, "");
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	protected void setContent(String resource, String docString) {
		try {
			sendPostRequest(resource, parameters, docString);
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	protected void assertContent(String resource, String docString) {
		try {

			JSONObject obj = sendGetRequest(resource, parameters);
			// System.out.println(obj.toString());
			String content = obj.getString("content");
			Assertions.assertEquals(docString, content.replaceAll("\r", "").trim());
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}
}
