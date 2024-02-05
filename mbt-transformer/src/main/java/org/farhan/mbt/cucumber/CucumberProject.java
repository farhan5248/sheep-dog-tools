
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
		switch (layer) {
		case firstLayerName:
			layerFiles = firstLayerObjects;
			break;
		case secondLayerName:
			layerFiles = secondLayerObjects;
			break;
		case thirdLayerName:
			layerFiles = thirdLayerObjects;
			break;
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
	private void readFiles(String layer, ArrayList<ConvertibleObject> layerFiles) {
		layerFiles.clear();
		ArrayList<File> files = Utilities.recursivelyListFiles(getDir(layer), getFileType(layer));
		for (File f : files) {
			try {
				createObject(f.getAbsolutePath()).read();
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

	@Override
	public ConvertibleObject createObject(String name) {
		File file = new File(name);
		if (file.getAbsolutePath().contains(getDir(firstLayerName).getName())) {
			CucumberFeatureWrapper aConvertibleObject = new CucumberFeatureWrapper(file);
			firstLayerObjects.add(aConvertibleObject);
			return aConvertibleObject;
		} else {
			JavaClassWrapper aConvertibleObject = new JavaClassWrapper(file);
			if (file.getAbsolutePath().contains(getDir(secondLayerName).getName())) {
				secondLayerObjects.add(aConvertibleObject);
			} else if (file.getAbsolutePath().contains(getDir(thirdLayerName).getName())) {
				thirdLayerObjects.add(aConvertibleObject);
			}
			return aConvertibleObject;
		}
	}

}
