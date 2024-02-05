
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
	public String getFileExt(String layer) {
		if (layer.contentEquals(firstLayerName)) {
			return ".feature";
		} else {
			return ".java";
		}
	}

	@Override
	public File getDir(String layer) {
		File aFile = null;
		switch (layer) {
		case firstLayerName:
			aFile = new File(baseDir + "src/test/resources/Cucumber/");
			break;
		case secondLayerName:
			aFile = new File(baseDir + "src/test/java/org/farhan/" + secondLayerName + "/");
			break;
		case thirdLayerName:
			aFile = new File(baseDir + "src/test/java/org/farhan/" + thirdLayerName + "/");
			break;
		}
		aFile.mkdirs();
		return aFile;
	}

	@Override
	public ArrayList<ConvertibleObject> getObjects(String layer) {

		ArrayList<ConvertibleObject> layerObjects = null;
		switch (layer) {
		case firstLayerName:
			layerObjects = firstLayerObjects;
			break;
		case secondLayerName:
			layerObjects = secondLayerObjects;
			break;
		case thirdLayerName:
			layerObjects = thirdLayerObjects;
			break;
		}
		return layerObjects;
	}

	@Override
	public void load() throws Exception {
		loadObjects(firstLayerName, firstLayerObjects);
		loadObjects(secondLayerName, secondLayerObjects);
		loadObjects(thirdLayerName, thirdLayerObjects);
	}

	// TODO delete after moving reads to select layer objects
	private void loadObjects(String layer, ArrayList<ConvertibleObject> layerFiles) {
		layerFiles.clear();
		ArrayList<File> files = Utilities.recursivelyListFiles(getDir(layer), getFileExt(layer));
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
