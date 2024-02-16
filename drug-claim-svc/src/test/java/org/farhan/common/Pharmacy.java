package org.farhan.common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import org.junit.jupiter.api.Assertions;

public class Pharmacy extends GraphModelObject {

	public void transition() {
		try {
			String url = "http://localhost:8887/claim?name=Farhan";
			URLConnection connection = new URL(url).openConnection();
			try (InputStream response = connection.getInputStream(); Scanner scanner = new Scanner(response)) {
				String responseBody = scanner.nextLine();
				assertEquals("{\"id\":2,\"content\":\"Hello, Farhan!\"}", responseBody);
			}
		} catch (Exception e) {
			Assertions.fail(getStackTraceAsString(e));
		}
	}
}
