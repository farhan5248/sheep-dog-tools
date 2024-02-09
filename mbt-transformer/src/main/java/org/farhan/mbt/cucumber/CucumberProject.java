
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
		if (layer.contentEquals(FIRST_LAYER)) {
			return ".feature";
		} else {
			return ".java";
		}
	}

	@Override
	public File getDir(String layer) {
		File aFile = null;
		switch (layer) {
		case FIRST_LAYER:
			aFile = new File(baseDir + "src/test/resources/Cucumber/");
			break;
		case SECOND_LAYER:
			aFile = new File(baseDir + "src/test/java/org/farhan/" + SECOND_LAYER + "/");
			break;
		case THIRD_LAYER:
			aFile = new File(baseDir + "src/test/java/org/farhan/" + THIRD_LAYER + "/");
			break;
		}
		aFile.mkdirs();
		return aFile;
	}

	@Override
	public ArrayList<ConvertibleObject> getObjects(String layer) {

		ArrayList<ConvertibleObject> layerObjects = null;
		switch (layer) {
		case FIRST_LAYER:
			layerObjects = firstLayerObjects;
			break;
		case SECOND_LAYER:
			layerObjects = secondLayerObjects;
			break;
		case THIRD_LAYER:
			layerObjects = thirdLayerObjects;
			break;
		}
		return layerObjects;
	}

	@Override
	public void save() throws Exception {
		for (ConvertibleObject cf : firstLayerObjects) {
			cf.save();
		}
		for (ConvertibleObject cf : secondLayerObjects) {
			cf.save();
		}
		for (ConvertibleObject cf : thirdLayerObjects) {
			cf.save();
		}
	}

	@Override
	public ConvertibleObject createObject(String name) {
		File file = new File(name);
		if (file.getAbsolutePath().contains(getDir(FIRST_LAYER).getName())) {
			CucumberFeatureWrapper aConvertibleObject = new CucumberFeatureWrapper(file);
			firstLayerObjects.add(aConvertibleObject);
			return aConvertibleObject;
		} else {
			CucumberJavaWrapper aConvertibleObject = new CucumberJavaWrapper(file);
			if (file.getAbsolutePath().contains(getDir(SECOND_LAYER).getName())) {
				secondLayerObjects.add(aConvertibleObject);
			} else if (file.getAbsolutePath().contains(getDir(THIRD_LAYER).getName())) {
				thirdLayerObjects.add(aConvertibleObject);
			}
			return aConvertibleObject;
		}
	}

}
