package org.farhan.mbt.maven;

import java.io.DataOutputStream;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import org.json.*;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

public abstract class MBTMojo extends AbstractMojo {

	private String urlTemplate = "http://localhost:8080/<resource>";
	private String url = "http://localhost:8080/<resource>";

	/**
	 * The Maven Project.
	 */
	@Parameter(defaultValue = "${project}", readonly = true)
	public MavenProject project;

	public File srcDir = new File("src/test/");

	/**
	 * The tag of the selected edges.
	 */
	@Parameter(property = "tag", defaultValue = "")
	public String tag;

	public void execute(String mojo) throws MojoExecutionException {
		try {
			for (File aFile : Utilities.recursivelyListFiles(srcDir, "")) {
				String fileName = aFile.getAbsolutePath().replace(srcDir.getAbsolutePath() + "\\", "");
				addParameter("fileName", fileName.replace("\\", "/"));
				sendPostRequest("addFile", Utilities.readFile(aFile));
			}
			getLog().info("Converting tests with this tag: " + tag);
			if (!tag.isEmpty()) {
				addParameter("tags", tag);
			}
			sendPostRequest(mojo, "");
			String fileList = sendGetRequest("getFileList").getString("fileName");
			if (!fileList.isBlank()) {
				for (String fileName : fileList.split("\n")) {
					addParameter("fileName", fileName);
					String fileContents = sendGetRequest("getFileContents").getString("content");
					Utilities.writeFile(new File(srcDir.getAbsolutePath() + "\\" + fileName), fileContents);
				}
			}
		} catch (Exception e) {
			getLog().error(Utilities.getStackTraceAsString(e));
			throw new MojoExecutionException(e);
		}
	}

	private HttpURLConnection createRequest(String resource, String method) throws Exception {
		this.url = url.replace("<resource>", resource);
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		this.url = urlTemplate;
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);
		connection.setRequestProperty("Content-Type", "text/plain");
		connection.setRequestProperty("charset", "utf-8");
		connection.setRequestMethod(method);
		return connection;
	}

	private String sendRequest(HttpURLConnection connection) throws Exception {
		connection.connect();
		Scanner scanner = new Scanner(connection.getInputStream());
		String response = scanner.nextLine();
		scanner.close();
		return response;
	}

	protected JSONObject sendGetRequest(String resource) throws Exception {
		HttpURLConnection connection = createRequest(resource, "GET");
		return new JSONObject(sendRequest(connection));
	}

	protected void sendPostRequest(String resource, String payload) throws Exception {
		HttpURLConnection connection = createRequest(resource, "POST");
		DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
		wr.write(payload.getBytes(StandardCharsets.UTF_8));
		sendRequest(connection);
	}

	protected void addParameter(String key, String value) {
		if (!url.contains("?")) {
			url += "?";
		} else if (!url.endsWith("?")) {
			url += "&";
		}
		url += key + "=" + value;
	}
}
