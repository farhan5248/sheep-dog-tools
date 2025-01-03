package org.farhan.mbt.maven;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.maven.plugin.AbstractMojo;

public abstract class ReleaseMojo extends AbstractMojo {

	protected void updateVersion(File project, String start, String currentVersionEnd, String nextVersionEnd,
			String fileName) throws Exception {
		String currentVersionSearchTerm = start + currentVersionEnd;
		String nextVersionSearchTerm = start + nextVersionEnd;

		ArrayList<File> fileList = recursivelyListFiles(project, fileName);
		List<File> filteredList = fileList.stream().filter(f -> (f.getName().contentEquals(fileName)))
				.collect(Collectors.toList());
		for (File f : filteredList) {
			writeFile(f, readFile(f).replace(currentVersionSearchTerm, nextVersionSearchTerm));
		}
	}

	protected ArrayList<File> recursivelyListFiles(File aDir, String extension) {
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

	protected void writeFile(File aFile, String content) throws Exception {
		PrintWriter aPrintWriter = new PrintWriter(aFile, StandardCharsets.UTF_8);
		aPrintWriter.print(content);
		aPrintWriter.flush();
		aPrintWriter.close();
	}

	protected String readFile(File aFile) throws Exception {
		return new String(Files.readAllBytes(Paths.get(aFile.toURI())), StandardCharsets.UTF_8);
	}

	protected void gitCommit(String message) throws Exception {
		String[] addCommand = { "git", "add", "*" };
		runCommand(addCommand);
		String[] commitCommand = { "git", "commit", "-m", message };
		runCommand(commitCommand);
	}

	protected void gitTag(String tag) throws Exception {
		String[] tagCommand = { "git", "tag", tag };
		runCommand(tagCommand);
	}

	protected void runCommand(String[] command) throws Exception {
		ProcessBuilder processBuilder = new ProcessBuilder(command);
		Process process = processBuilder.start();
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line;
		while ((line = reader.readLine()) != null) {
			getLog().info(line);
		}
		if (process.waitFor() != 0) {
			throw new Exception("Command line execution failed");
		}
	}
}
