package com.example.restservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoIT {

	@Test
	public void whenSendingGet_thenMessageIsReturned() throws IOException {
		String url = "http://localhost:8887/greeting?name=Farhan";
		URLConnection connection = new URL(url).openConnection();
		try (InputStream response = connection.getInputStream(); Scanner scanner = new Scanner(response)) {
			String responseBody = scanner.nextLine();
			assertEquals("{\"id\":2,\"content\":\"Hello, Farhan!\"}", responseBody);
		}
	}

}
