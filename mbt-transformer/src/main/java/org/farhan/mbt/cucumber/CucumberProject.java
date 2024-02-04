
package org.farhan.mbt.cucumber;

import java.io.File;
import java.util.ArrayList;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.Utilities;

public class CucumberProject extends ConvertibleProject {

	private ArrayList<ConvertibleObject> firstLayerObjects;
	private ArrayList<ConvertibleObject> secondLayerObjects;
	private ArrayList<ConvertibleObject> thirdLayerObjects;

	public CucumberProject() {
		firstLayerObjects = new ArrayList<ConvertibleObject>();
		secondLayerObjects = new ArrayList<ConvertibleObject>();
		thirdLayerObjects = new ArrayList<ConvertibleObject>();
	}

	@Override
	public String getFileType(String layer) {
		if (layer.contentEquals(firstLayerName)) {
			return ".feature";
		} else {
			return ".java";
		}
	}

	@Override
	public File getDir(String layer) {
		File aFile = null;
		if (layer.contentEquals(firstLayerName)) {
			aFile = new File(baseDir + "src/test/resources/Cucumber/");
		} else if (layer.contentEquals(secondLayerName)) {
			aFile = new File(baseDir + "src/test/java/org/farhan/" + secondLayerName + "/");
		} else if (layer.contentEquals(thirdLayerName)) {
			aFile = new File(baseDir + "src/test/java/org/farhan/" + thirdLayerName + "/");
		}
		aFile.mkdirs();
		return aFile;
	}

	@Override
	public ArrayList<ConvertibleObject> getObjects(String layer) {

		ArrayList<ConvertibleObject> layerFiles = null;
		if (layer.contentEquals(firstLayerName)) {
			layerFiles = firstLayerObjects;
		} else if (layer.contentEquals(secondLayerName)) {
			layerFiles = secondLayerObjects;
		} else if (layer.contentEquals(thirdLayerName)) {
			layerFiles = thirdLayerObjects;
		}
		if (layerFiles.isEmpty()) {
			try {
				readFiles(layer, layerFiles);
			} catch (Exception e) {
				Utilities.getStackTraceAsString(e);
			}
		}
		return layerFiles;
	}

	@Override
	public void load() throws Exception {
		readFiles(firstLayerName, firstLayerObjects);
		readFiles(secondLayerName, secondLayerObjects);
		readFiles(thirdLayerName, thirdLayerObjects);
	}

	// TODO delete after moving reads to select layer objects
	public void readFiles(String layer, ArrayList<ConvertibleObject> layerFiles) {
		ArrayList<File> files = Utilities.recursivelyListFiles(getDir(layer), getFileType(layer));
		for (File f : files) {
			try {
				if (layer.contentEquals(firstLayerName)) {
					layerFiles.add(new CucumberFeatureWrapper(f));
				} else {
					layerFiles.add(new JavaClassWrapper(f));
				}
				layerFiles.getLast().read();
			} catch (Exception e) {
				Utilities.getStackTraceAsString(e);
			}
		}
	}

	@Override
	public void save() throws Exception {
		for (ConvertibleObject cf : firstLayerObjects) {
			cf.write();
		}
		for (ConvertibleObject cf : secondLayerObjects) {
			cf.write();
		}
		for (ConvertibleObject cf : thirdLayerObjects) {
			cf.write();
		}
	}

	public JavaClassWrapper createCucumberJavaFile(File file) throws Exception {
		JavaClassWrapper aJavaFile = new JavaClassWrapper(file);
		if (file.getAbsolutePath().contains(getDir(secondLayerName).getName())) {
			getObjects(secondLayerName).add(aJavaFile);
		} else if (file.getAbsolutePath().contains(getDir(thirdLayerName).getName())) {
			getObjects(thirdLayerName).add(aJavaFile);
		} else {
			throw new Exception("Java files are only in layer 2 or 3");
		}
		return aJavaFile;
	}

	public CucumberFeatureWrapper createCucumberFeatureFile(File file) throws Exception {
		CucumberFeatureWrapper aFeatureFile = new CucumberFeatureWrapper(file);
		if (file.getAbsolutePath().contains(getDir(firstLayerName).getName())) {
			getObjects(firstLayerName).add(aFeatureFile);
		} else {
			throw new Exception("Feature files are only in layer 1");
		}
		return aFeatureFile;
	}

}
