
package org.farhan.mbt.conv.cucumber;

import java.io.File;
import java.util.ArrayList;

import org.farhan.conv.core.ConvertibleFile;
import org.farhan.conv.core.Project;

public class CucumberProject extends Project {

	// TODO make getters for these like in UML project
	public static ArrayList<ConvertibleFile> firstLayerFiles;
	public static ArrayList<ConvertibleFile> secondLayerFiles;
	public static ArrayList<ConvertibleFile> thirdLayerFiles;

	public static File getSecondLayerDir() {
		File aFile = new File(baseDir + "src/test/java/org/farhan/stepdefs/");
		aFile.mkdirs();
		return aFile;
	}

	public static File getThirdLayerDir() {
		File aFile = new File(baseDir + "src/test/java/org/farhan/objects/");
		aFile.mkdirs();
		return aFile;
	}

	public static File getFourthLayerDir() {
		File aFile = new File(baseDir + "src/test/java/org/farhan/common/");
		aFile.mkdirs();
		return aFile;
	}

	public static File getFirstLayerDir() {
		return new File(baseDir + "src/test/cucumber/");
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

	public static String getFirstLayerFileType() {
		return ".feature";
	}

	protected String getOtherLayerFileType() {
		return ".java";
	}

	public static void init() {
		firstLayerFiles = new ArrayList<ConvertibleFile>();
		secondLayerFiles = new ArrayList<ConvertibleFile>();
		thirdLayerFiles = new ArrayList<ConvertibleFile>();
	}
}
