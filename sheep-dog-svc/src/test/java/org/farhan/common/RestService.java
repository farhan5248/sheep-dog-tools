package org.farhan.common;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import org.junit.jupiter.api.Assertions;

public class RestService extends GraphTestObject {
	private String urlTemplate = "http://localhost:8080/<resource>?";
	private String url = "http://localhost:8080/<resource>?";
	protected static String responseBody = "";

	protected void addParamter(String key, String value) {
		if (!url.endsWith("?")) {
			url += "&";
		}
		url += key + "=" + value;
	}

	protected void sendRequest(String resource) {
		try {
			this.responseBody = "";
			this.url = url.replace("<resource>", resource);
			URLConnection connection = new URL(url).openConnection();
			InputStream response = connection.getInputStream();
			Scanner scanner = new Scanner(response);
			responseBody = scanner.nextLine();
			scanner.close();
			this.url = urlTemplate;
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}
}
