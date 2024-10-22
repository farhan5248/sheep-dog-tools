package org.farhan.mbt.maven;

import java.io.DataOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import org.json.JSONObject;

public class Utilities {

	private static HttpURLConnection createRequest(String url, Map<String, String> parameters, String method)
			throws Exception {
		for (String param : parameters.keySet()) {
			if (url.contains("?")) {
				url += "&";
			} else {
				url += "?";
			}
			url += param + "=" + parameters.get(param);
		}
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);
		connection.setRequestProperty("Content-Type", "text/plain");
		connection.setRequestProperty("charset", "utf-8");
		connection.setRequestMethod(method);
		return connection;
	}

	private static String sendRequest(HttpURLConnection connection) throws Exception {
		connection.connect();
		if (connection.getResponseCode() != 200) {
			throw new Exception("Invalid response code: " + connection.getResponseCode());
		}
		Scanner scanner = new Scanner(connection.getInputStream());
		String response = scanner.nextLine();
		scanner.close();
		return response;
	}

	public static JSONObject sendGetRequest(String resource, Map<String, String> parameters) throws Exception {
		HttpURLConnection connection = createRequest(resource, parameters, "GET");
		return new JSONObject(sendRequest(connection));
	}

	public static void sendPostRequest(String resource, Map<String, String> parameters, String payload)
			throws Exception {
		HttpURLConnection connection = createRequest(resource, parameters, "POST");
		DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
		wr.write(payload.getBytes(StandardCharsets.UTF_8));
		sendRequest(connection);
	}

	// TODO Move the maven plugin implementation of ConvertibleProjectResource and
	// put a copy in the test code

	public static ArrayList<File> recursivelyListFiles(File aDir, String extension) {
		ArrayList<File> theFiles = new ArrayList<File>();
		if (aDir.exists()) {
			for (String s : aDir.list()) {
				File tempFile = new File(aDir.getAbsolutePath() + File.separator + s);
				if (tempFile.isDirectory()) {
					theFiles.addAll(recursivelyListFiles(tempFile, extension));
				} else if (tempFile.getAbsolutePath().toLowerCase().endsWith(extension.toLowerCase())) {
					theFiles.add(tempFile);
				}
			}
		}
		return theFiles;
	}

	// TODO move to FileObject
	public static String readFile(File aFile) throws Exception {
		String content = new String(Files.readAllBytes(Paths.get(aFile.toURI())), StandardCharsets.UTF_8);
		return content;
	}

	// TODO move to AsciiDoctorAdocWrapper and FileObject
	public static void writeFile(File aFile, String content) throws Exception {
		aFile.getParentFile().mkdirs();
		PrintWriter aPrintWriter = new PrintWriter(aFile, StandardCharsets.UTF_8);
		aPrintWriter.print(content);
		aPrintWriter.flush();
		aPrintWriter.close();
	}

	// TODO move to mojo superclass
	public static String getStackTraceAsString(Exception e) {
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		String exceptionAsString = sw.toString();
		return exceptionAsString;
	}

	// TODO move to test class
	public static void deleteDir(File dir, String extension) {
		ArrayList<File> filesList = Utilities.recursivelyListFilesAndDirectories(dir, extension);
		for (File f : filesList) {
			f.delete();
		}
	}

	// TODO move into deleteDir
	public static ArrayList<File> recursivelyListFilesAndDirectories(File aDir, String extension) {
		ArrayList<File> theFiles = new ArrayList<File>();
		if (aDir.exists()) {
			for (String s : aDir.list()) {
				File tempFile = new File(aDir.getAbsolutePath() + File.separator + s);
				if (tempFile.isDirectory()) {
					theFiles.addAll(recursivelyListFilesAndDirectories(tempFile, extension));
					theFiles.add(tempFile);
				} else if (tempFile.getAbsolutePath().toLowerCase().endsWith(extension.toLowerCase())) {
					theFiles.add(tempFile);
				}
			}
		}
		return theFiles;
	}
}
