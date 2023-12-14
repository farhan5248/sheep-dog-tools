package org.farhan.conv.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * <p>
 * Utilities class.
 * </p>
 *
 * @author T856673
 * @version $Id: $Id
 */
public class Utilities {

	public static String removeLastComma(String newTitle) {
		StringBuilder sb = new StringBuilder(newTitle.trim());
		if (!(sb.length() == 0) && sb.charAt(sb.length() - 1) == ',') {
			sb.setCharAt(sb.length() - 1, Character.MIN_VALUE);
		}
		return sb.toString().trim();
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

	public static String getCurrentTime(String pattern) {
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime date = ZonedDateTime.now(zone);
		return DateTimeFormatter.ofPattern(pattern).format(date);
	}

	public static String getCurrentTime() {
		return getCurrentTime("MMddHHmmss");
	}

	public static String getCurrentDate() {
		return getCurrentTime("yyyyMMdd");
	}

	public static String getCurrentTimeNoTimeZone() {
		SimpleDateFormat formatter = new SimpleDateFormat("MMddHHmmss");
		Date date = new Date();
		return formatter.format(date);
	}

	public static boolean isBefore(Date endTime) {
		Date date = new Date();
		return date.before(endTime);
	}

	public static Date getTimeSecondsFromNow(int seconds) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.SECOND, seconds);
		return calendar.getTime();
	}

	/**
	 * <p>
	 * getNamedGroupCandidates.
	 * </p>
	 *
	 * @param regex a {@link java.lang.String} object.
	 * @return a {@link java.util.Set} object.
	 * @since 1.9
	 */
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

	public static void writeFile(String fileName, String content) throws Exception {
		writeFile(new File(fileName), content);
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

	public static void deleteDir(String dir, String extension) {
		deleteDir(new File(dir), extension);
	}

	public static void deleteDir(File dir, String extension) {
		ArrayList<File> filesList = Utilities.recursivelyListFilesAndDirectories(dir, extension);
		for (File f : filesList) {
			f.delete();
		}
	}

	public static void copyFileTypeToDir(String srcDirPath, String tgtDirPath, String type) throws Exception {
		copyFileTypeToDir(srcDirPath, tgtDirPath, type, "");
	}

	public static void copyFileTypeToDir(String srcDirPath, String tgtDirPath, String type, String prefix)
			throws Exception {
		File srcDir = new File(srcDirPath);
		File tgtDir = new File(tgtDirPath);
		if (srcDir.exists() && tgtDir.exists()) {
			// TODO this method assumes we don't have nested robot files which we do now.
			// Combine the recursive list with this one.
			if (!srcDir.isDirectory()) {
				return;
			}
			for (File f : srcDir.listFiles()) {
				if (f.getName().endsWith(type)) {
					File tgtFile = new File(tgtDirPath + File.separator + prefix + f.getName());
					copyFile(f, tgtFile);
				} else if (f.isDirectory()) {
					copyFileTypeToDir(f.getAbsolutePath(), tgtDirPath, type, prefix);
				}
			}
		}
	}

	public static void copyFile(File srcFile, File tgtFile) throws Exception {
		if (!tgtFile.getParentFile().exists()) {
			tgtFile.getParentFile().mkdirs();
		}
		Files.copy(srcFile.toPath(), tgtFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
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
}
