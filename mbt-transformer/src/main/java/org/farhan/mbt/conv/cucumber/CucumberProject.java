
package org.farhan.mbt.conv.cucumber;

import java.io.File;
import java.util.ArrayList;

import org.farhan.mbt.conv.core.ConvertibleFile;
import org.farhan.mbt.conv.core.Project;
import org.farhan.mbt.conv.core.Utilities;

public class CucumberProject extends Project {

	private static ArrayList<ConvertibleFile> firstLayerFiles;
	private static ArrayList<ConvertibleFile> secondLayerFiles;
	private static ArrayList<ConvertibleFile> thirdLayerFiles;

	public static File getFirstLayerDir() {
		return new File(baseDir + "src/test/cucumber/");
	}

	public static ArrayList<ConvertibleFile> getFirstLayerFiles() {
		if (firstLayerFiles.isEmpty()) {
			ArrayList<File> files = Utilities.recursivelyListFiles(getFirstLayerDir(), getFirstLayerFileType());
			for (File f : files) {
				CucumberFeatureFile cff = new CucumberFeatureFile(f);
				firstLayerFiles.add(cff);
				cff.read();
			}
		}
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
		if (secondLayerFiles.isEmpty()) {
			ArrayList<File> files = Utilities.recursivelyListFiles(getSecondLayerDir(), getOtherLayerFileType());
			for (File f : files) {
				CucumberJavaFile cff = new CucumberJavaFile(f);
				secondLayerFiles.add(cff);
				cff.read();
			}
		}
		return secondLayerFiles;
	}

	public static File getThirdLayerDir() {
		File aFile = new File(baseDir + "src/test/java/org/farhan/" + thirdLayerPackageName + "/");
		aFile.mkdirs();
		return aFile;
	}

	public static ArrayList<ConvertibleFile> getThirdLayerFiles() {
		if (thirdLayerFiles.isEmpty()) {
			ArrayList<File> files = Utilities.recursivelyListFiles(getThirdLayerDir(), getOtherLayerFileType());
			for (File f : files) {
				CucumberJavaFile cff = new CucumberJavaFile(f);
				thirdLayerFiles.add(cff);
				cff.read();
			}
		}
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

	public static String getOtherLayerFileType() {
		return ".java";
	}

	public static CucumberJavaFile getCucumberJavaFile(File file) throws Exception {
		CucumberJavaFile aJavaFile = new CucumberJavaFile(file);
		if (file.getAbsolutePath().contains(getSecondLayerDir().getName())) {
			CucumberProject.getSecondLayerFiles().add(aJavaFile);
		} else if (file.getAbsolutePath().contains(getThirdLayerDir().getName())) {
			CucumberProject.getThirdLayerFiles().add(aJavaFile);
		} else {
			throw new Exception("Java files are only in layer 2 or 3");
		}
		return aJavaFile;
	}

}
