
package org.farhan.mbt.cucumber;

import java.io.File;
import java.util.ArrayList;

import org.farhan.mbt.core.ConvertibleFile;
import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.Utilities;

public class CucumberProject extends Project {

	private static ArrayList<ConvertibleFile> firstLayerFiles;
	private static ArrayList<ConvertibleFile> secondLayerFiles;
	private static ArrayList<ConvertibleFile> thirdLayerFiles;

	public static String getLayerFileType(String layer) {
		if (layer.contentEquals(firstLayerPackageName)) {
			return ".feature";
		} else {
			return ".java";
		}
	}

	public static File getLayerDir(String layer) {
		File aFile = null;
		if (layer.contentEquals(firstLayerPackageName)) {
			aFile = new File(baseDir + "src/test/resources/Cucumber/");
		} else if (layer.contentEquals(Project.secondLayerPackageName)) {
			aFile = new File(baseDir + "src/test/java/org/farhan/" + secondLayerPackageName + "/");
		} else if (layer.contentEquals(Project.thirdLayerPackageName)) {
			aFile = new File(baseDir + "src/test/java/org/farhan/" + thirdLayerPackageName + "/");
		}
		aFile.mkdirs();
		return aFile;
	}

	public static ArrayList<ConvertibleFile> getLayerFiles(String layer) {

		ArrayList<ConvertibleFile> layerFiles = null;
		if (layer.contentEquals(firstLayerPackageName)) {
			layerFiles = firstLayerFiles;
		} else if (layer.contentEquals(secondLayerPackageName)) {
			layerFiles = secondLayerFiles;
		} else if (layer.contentEquals(thirdLayerPackageName)) {
			layerFiles = thirdLayerFiles;
		}
		if (layerFiles.isEmpty()) {
			// TODO this shouldn't be here, selecting the files will know which to read,
			// this reads everything which is unnecessary
			readFiles(layer, layerFiles);
		}
		return layerFiles;
	}

	public static void readFiles(String layer, ArrayList<ConvertibleFile> layerFiles) {
		ArrayList<File> files = Utilities.recursivelyListFiles(getLayerDir(layer), getLayerFileType(layer));
		for (File f : files) {
			try {
				if (layer.contentEquals(firstLayerPackageName)) {
					layerFiles.add(new CucumberFeatureFile(f));
				} else {
					layerFiles.add(new CucumberJavaFile(f));
				}
				layerFiles.getLast().read();
			} catch (Exception e) {
				// TODO handle this better, the override class throws an Exception. Why?
				Utilities.getStackTraceAsString(e);
			}
		}
	}

	public static void init() {
		firstLayerFiles = new ArrayList<ConvertibleFile>();
		secondLayerFiles = new ArrayList<ConvertibleFile>();
		thirdLayerFiles = new ArrayList<ConvertibleFile>();
	}

	public static void writeFiles() {
		for (ConvertibleFile cf : firstLayerFiles) {
			try {
				cf.write();
			} catch (Exception e) {
				System.out.println(Utilities.getStackTraceAsString(e));
			}
		}
		for (ConvertibleFile cf : secondLayerFiles) {
			try {
				cf.write();
			} catch (Exception e) {
				System.out.println(Utilities.getStackTraceAsString(e));
			}
		}
		for (ConvertibleFile cf : thirdLayerFiles) {
			try {
				cf.write();
			} catch (Exception e) {
				System.out.println(Utilities.getStackTraceAsString(e));
			}
		}
	}

	public static CucumberJavaFile createCucumberJavaFile(File file) throws Exception {
		CucumberJavaFile aJavaFile = new CucumberJavaFile(file);
		if (file.getAbsolutePath().contains(getLayerDir(secondLayerPackageName).getName())) {
			getLayerFiles(secondLayerPackageName).add(aJavaFile);
		} else if (file.getAbsolutePath().contains(getLayerDir(thirdLayerPackageName).getName())) {
			getLayerFiles(thirdLayerPackageName).add(aJavaFile);
		} else {
			throw new Exception("Java files are only in layer 2 or 3");
		}
		return aJavaFile;
	}

	public static CucumberFeatureFile createCucumberFeatureFile(File file) throws Exception {
		CucumberFeatureFile aFeatureFile = new CucumberFeatureFile(file);
		if (file.getAbsolutePath().contains(getLayerDir(firstLayerPackageName).getName())) {
			getLayerFiles(firstLayerPackageName).add(aFeatureFile);
		} else {
			throw new Exception("Feature files are only in layer 1");
		}
		return aFeatureFile;
	}

}
