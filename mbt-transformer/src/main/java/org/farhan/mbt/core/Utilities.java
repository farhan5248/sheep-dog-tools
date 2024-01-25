package org.farhan.mbt.core;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class Utilities {

	public static String removeDelimiterAndCapitalize(String text, String delimiter) {
		String[] nameParts = text.split(delimiter);
		text = "";
		for (String s : nameParts) {
			text += StringUtils.capitalize(s);
		}
		return text;
	}

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

	public static Set<String> getNamedGroupCandidates(String regex) {
		Set<String> namedGroups = new TreeSet<String>();
		Matcher m = Pattern.compile("\\(\\?<([a-zA-Z][a-zA-Z0-9]*)>", Pattern.CASE_INSENSITIVE).matcher(regex);
		while (m.find()) {
			namedGroups.add(m.group(1));
		}
		return namedGroups;
	}

	public static ArrayList<String> getNamedGroupCandidatesByPosition(String regex) {
		ArrayList<String> namedGroups = new ArrayList<String>();
		Matcher m = Pattern.compile("\\(\\?<([a-zA-Z][a-zA-Z0-9]*)>", Pattern.CASE_INSENSITIVE).matcher(regex);
		while (m.find()) {
			namedGroups.add(m.group(1));
		}
		return namedGroups;
	}

	public static String getStackTraceAsString(Exception e) {
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		String exceptionAsString = sw.toString();
		return exceptionAsString;
	}

	public static String regexFind(String pattern, String text, int groupNumber, String defaultText) {
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(text);
		if (m.find()) {
			if (m.group(groupNumber) != null) {
				return m.group(groupNumber);
			}
		}
		return defaultText;
	}

	public static String regexFind(String pattern, String text, int groupNumber) {
		return regexFind(pattern, text, groupNumber, null);
	}

	public static String regexFindByName(String pattern, String text, String groupName) {
		Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		Matcher m = r.matcher(text);
		if (m.find()) {
			return m.group(groupName);
		} else {
			return null;
		}
	}

	public static String regexFindAll(String pattern, String text, int group, String defaultText) {
		Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		Matcher m = r.matcher(text);
		String allResults = "";
		while (m.find()) {
			if (m.group(group) != null) {
				allResults += m.group(group);
			}
		}

		if (allResults.isEmpty()) {
			return defaultText;
		} else {
			return allResults;
		}
	}

	public static void writeFile(File aFile, String content) throws Exception {
		aFile.getParentFile().mkdirs();
		PrintWriter aPrintWriter = new PrintWriter(aFile, StandardCharsets.UTF_8);
		aPrintWriter.print(content);
		aPrintWriter.flush();
		aPrintWriter.close();
	}

	public static String readFile(File aFile) throws Exception {
		String content = new String(Files.readAllBytes(Paths.get(aFile.toURI())), StandardCharsets.UTF_8);
		return content;
	}

	public static void deleteDir(File dir, String extension) {
		ArrayList<File> filesList = Utilities.recursivelyListFilesAndDirectories(dir, extension);
		for (File f : filesList) {
			f.delete();
		}
	}

	public static String padZeroes(String stringToPad, int padSize) {
		return padLeft(stringToPad, "0", padSize);
	}

	public static String padLeft(String stringToPad, String padding, int padSize) {
		return pad(stringToPad, padding, padSize, false);
	}

	public static String padRight(String stringToPad, String padding, int padSize) {
		return pad(stringToPad, padding, padSize, true);
	}

	public static String pad(String stringToPad, String padding, int padSize, boolean leftJustified) {
		String retString = stringToPad;
		retString = retString.trim();

		for (int t = retString.length(); t < padSize; t++) {
			if (leftJustified) {
				retString = retString + padding;
			} else {
				retString = padding + retString;
			}
		}
		return retString;
	}

	public static String toUpperCamelCase(String text) {
		Pattern p = Pattern.compile(" ([a-zA-Z])");
		Matcher m = p.matcher(text);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, m.group(1).toUpperCase());
		}
		m.appendTail(sb);
		return sb.toString().replace(",", "");
	}

	public static String toLowerCamelCase(String text) {
		text = toUpperCamelCase(text);
		return text.substring(0, 1).toLowerCase() + text.substring(1);
	}

	public static String removeLastComma(String newTitle) {
		StringBuilder sb = new StringBuilder(newTitle.trim());
		if (!(sb.length() == 0) && sb.charAt(sb.length() - 1) == ',') {
			sb.setCharAt(sb.length() - 1, Character.MIN_VALUE);
		}
		return sb.toString().trim();
	}
}
