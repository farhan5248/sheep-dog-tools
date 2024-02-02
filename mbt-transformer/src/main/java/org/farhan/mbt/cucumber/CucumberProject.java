
package org.farhan.mbt.cucumber;

import java.io.File;
import java.util.ArrayList;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.Utilities;

public class CucumberProject extends Project {

	private static ArrayList<ConvertibleObject> firstLayerFiles;
	private static ArrayList<ConvertibleObject> secondLayerFiles;
	private static ArrayList<ConvertibleObject> thirdLayerFiles;

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

	public static ArrayList<ConvertibleObject> getLayerFiles(String layer) {

		ArrayList<ConvertibleObject> layerFiles = null;
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

	public static void readFiles(String layer, ArrayList<ConvertibleObject> layerFiles) {
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
		firstLayerFiles = new ArrayList<ConvertibleObject>();
		secondLayerFiles = new ArrayList<ConvertibleObject>();
		thirdLayerFiles = new ArrayList<ConvertibleObject>();
	}

	public static void writeFiles() {
		for (ConvertibleObject cf : firstLayerFiles) {
			try {
				cf.write();
			} catch (Exception e) {
				System.out.println(Utilities.getStackTraceAsString(e));
			}
		}
		for (ConvertibleObject cf : secondLayerFiles) {
			try {
				cf.write();
			} catch (Exception e) {
				System.out.println(Utilities.getStackTraceAsString(e));
			}
		}
		for (ConvertibleObject cf : thirdLayerFiles) {
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
