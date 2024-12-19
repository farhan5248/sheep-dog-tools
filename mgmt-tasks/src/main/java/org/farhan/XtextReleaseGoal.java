package org.farhan;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class XtextReleaseGoal {

	private static File rootDir;
	private static String template = "C:\\Users\\Farhan\\git\\lean-sheep-dog-tools\\template.parent";
	private static String project;
	private static String automation = "sheepdogxtextcukeplugin";
	private static String documentation = "sheepdogxtextplugin";

	public static void main(String[] args) throws Exception {

		String currentVersion = "1.1.0";
		String nextVersion = "1.2.0";
		String currentSheepDogTestVersion = "1.4";
		String nextSheepDogTestVersion = "1.5";

		// project = automation;
		// currentVersion = "1.1.0";
		// nextVersion = "1.2.0";
		// project = documentation;
		// currentVersion = "1.1.0";
		// nextVersion = "1.2.0";
		rootDir = new File(template.replace("template", project));
		// updateToRelease(currentVersion, currentSheepDogTestVersion);
		// Run mvn install
		// Run git add and git commit
		// Run git tag
		// updateToSnapshot(currentVersion, nextVersion, currentSheepDogTestVersion, nextSheepDogTestVersion);
		// Run mvn install
		// Run git add and git commit
	}

	private static void updateToSnapshot(String cv, String nv, String csdtv, String nsdtv) throws Exception {
		updateVersion("<sheep-dog-test.version>", csdtv + "</sheep-dog-test.version>",
				nsdtv + "-SNAPSHOT</sheep-dog-test.version>", "pom.xml");
		updateVersion("<version>", cv + "</version>", nv + "-SNAPSHOT</version>", "pom.xml");
		updateVersion("Bundle-Version: ", cv + "", nv + ".qualifier", "MANIFEST.MF");
		updateVersion("version=\"", cv + "\"", nv + ".qualifier\"", "feature.xml");
		System.out.println("[maven-release-plugin] prepare for next development iteration");
	}

	private static void updateToRelease(String cv, String csdtv) throws Exception {
		updateVersion("<sheep-dog-test.version>", csdtv + "-SNAPSHOT</sheep-dog-test.version>",
				csdtv + "</sheep-dog-test.version>", "pom.xml");
		updateVersion("<version>", cv + "-SNAPSHOT</version>", cv + "</version>", "pom.xml");
		updateVersion("Bundle-Version: ", cv + ".qualifier", cv + "", "MANIFEST.MF");
		updateVersion("version=\"", cv + ".qualifier\"", cv + "\"", "feature.xml");
		System.out.println("[maven-release-plugin] prepare release " + project + "-" + cv);
		System.out.println(project + "-" + cv);
	}

	private static void updateVersion(String start, String currentVersionEnd, String nextVersionEnd, String fileName)
			throws Exception {
		String currentVersionSearchTerm = start + currentVersionEnd;
		String nextVersionSearchTerm = start + nextVersionEnd;

		ArrayList<File> fileList = recursivelyListFiles(rootDir, fileName);
		List<File> filteredList = fileList.stream().filter(f -> (f.getName().contentEquals(fileName)))
				.collect(Collectors.toList());
		for (File f : filteredList) {
			writeFile(f, readFile(f).replace(currentVersionSearchTerm, nextVersionSearchTerm));
		}
	}

	private static ArrayList<File> recursivelyListFilesAndDirectories(File aDir, String extension) {
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

	private static ArrayList<File> recursivelyListFiles(File aDir, String extension) {
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

	private static void writeFile(File aFile, String content) throws Exception {
		PrintWriter aPrintWriter = new PrintWriter(aFile, StandardCharsets.UTF_8);
		aPrintWriter.print(content);
		aPrintWriter.flush();
		aPrintWriter.close();
	}

	private static String readFile(File aFile) throws Exception {
		return new String(Files.readAllBytes(Paths.get(aFile.toURI())), StandardCharsets.UTF_8);
	}
}
