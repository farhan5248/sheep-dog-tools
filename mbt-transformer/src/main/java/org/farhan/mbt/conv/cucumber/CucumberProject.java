
package org.farhan.mbt.conv.cucumber;

import java.io.File;
import java.util.ArrayList;

import org.farhan.mbt.conv.core.ConvertibleFile;
import org.farhan.mbt.conv.core.Project;

public class CucumberProject extends Project {

	// TODO The CucumberProject should manage creating new CucumberFeature or
	// CucumberJava files

	private static ArrayList<ConvertibleFile> firstLayerFiles;
	private static ArrayList<ConvertibleFile> secondLayerFiles;
	private static ArrayList<ConvertibleFile> thirdLayerFiles;

	public static File getFirstLayerDir() {
		return new File(baseDir + "src/test/cucumber/");
	}

	public static ArrayList<ConvertibleFile> getFirstLayerFiles() {
		return firstLayerFiles;
	}

	public static String getFirstLayerFileType() {
		return ".feature";
	}

	public static File getFourthLayerDir() {
		File aFile = new File(baseDir + "src/test/java/org/farhan/" + fourthLayerPackageName + "/");
		aFile.mkdirs();
		return aFile;
	}

	public static File getSecondLayerDir() {
		File aFile = new File(baseDir + "src/test/java/org/farhan/" + secondLayerPackageName + "/");
		aFile.mkdirs();
		return aFile;
	}

	public static ArrayList<ConvertibleFile> getSecondLayerFiles() {
		return secondLayerFiles;
	}

	public static File getThirdLayerDir() {
		File aFile = new File(baseDir + "src/test/java/org/farhan/" + thirdLayerPackageName + "/");
		aFile.mkdirs();
		return aFile;
	}

	public static ArrayList<ConvertibleFile> getThirdLayerFiles() {
		return thirdLayerFiles;
	}

	public static void init() {
		firstLayerFiles = new ArrayList<ConvertibleFile>();
		secondLayerFiles = new ArrayList<ConvertibleFile>();
		thirdLayerFiles = new ArrayList<ConvertibleFile>();
	}

	public static void writeFiles() {
		for (ConvertibleFile cf : firstLayerFiles) {
			cf.write();
		}
		for (ConvertibleFile cf : secondLayerFiles) {
			cf.write();
		}
		for (ConvertibleFile cf : thirdLayerFiles) {
			cf.write();
		}
	}

	protected String getOtherLayerFileType() {
		return ".java";
	}

}
