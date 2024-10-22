package org.farhan.common;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import org.json.*;
import org.farhan.mbt.core.Utilities;
import org.junit.jupiter.api.Assertions;

public class RestService extends TestObject {

	private String urlTemplate = "http://localhost:8080/<resource>";
	private String url = "http://localhost:8080/<resource>";
	protected String postPayload = "";
	protected static String responseBody = "";
	protected String tags = "";

	protected void addParamter(String key, String value) {
		if (!url.contains("?")) {
			url += "?";
		} else if (!url.endsWith("?")) {
			url += "&";
		}
		url += key + "=" + value;
	}

	private HttpURLConnection createRequest(String resource, String method) throws Exception {
		this.url = url.replace("<resource>", resource);
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);
		connection.setRequestProperty("Content-Type", "text/plain");
		connection.setRequestProperty("charset", "utf-8");
		connection.setRequestMethod(method);
		return connection;
	}

	protected void sendRequest(HttpURLConnection connection) throws Exception {
		connection.connect();
		InputStream response = connection.getInputStream();
		Scanner scanner = new Scanner(response);
		responseBody = scanner.nextLine();
		scanner.close();
		this.url = urlTemplate;
	}

	protected void sendGetRequest(String resource) {
		try {
			HttpURLConnection connection = createRequest(resource, "GET");
			sendRequest(connection);
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	protected void sendPostRequest(String resource, String payload) {
		try {
			HttpURLConnection connection = createRequest(resource, "POST");
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.write(payload.getBytes(StandardCharsets.UTF_8));
			sendRequest(connection);
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	protected void setContent(String resource, String docString) {
		try {
			sendPostRequest(resource, docString);
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	protected void assertContent(String resource, String docString) {
		try {
			sendGetRequest(resource);
			JSONObject obj = new JSONObject(responseBody);
			// System.out.println(obj.toString());
			String content = obj.getString("content");
			Assertions.assertEquals(docString, content.replaceAll("\r", "").trim());
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}
}
