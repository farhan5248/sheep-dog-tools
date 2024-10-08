package org.farhan.mbt.core;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Utilities {

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

	// TODO move this to classes that use it.

	public static String removeDelimiterAndCapitalize(String text, String delimiter) {
		String[] nameParts = text.split(delimiter);
		text = "";
		for (String s : nameParts) {
			text += StringUtils.capitalize(s);
		}
		return text;
	}

	public static String upperFirst(String text) {
		if (!text.isEmpty()) {
			return text.substring(0, 1).toUpperCase() + text.substring(1);
		}
		return text;
	}

	public static String lowerFirst(String text) {
		if (!text.isEmpty()) {
			return text.substring(0, 1).toLowerCase() + text.substring(1);
		}
		return text;
	}

	public static Object listAsCsv(ArrayList<String> list) {
		String csv = "";
		for (String listItem : list) {
			csv += "," + listItem;
		}
		return csv.replaceFirst(",", "");
	}
}
