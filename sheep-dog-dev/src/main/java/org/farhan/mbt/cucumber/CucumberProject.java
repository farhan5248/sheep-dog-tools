package org.farhan.mbt.cucumber;

import java.util.ArrayList;

import org.farhan.mbt.CucumberStandaloneSetup;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.ObjectRepository;

public class CucumberProject extends ConvertibleProject {

	protected ArrayList<ConvertibleObject> firstLayerObjects;
	protected ArrayList<ConvertibleObject> secondLayerObjects;
	protected ArrayList<ConvertibleObject> thirdLayerObjects;

	public CucumberProject(String tags, ObjectRepository fa) {
		super(fa);
		firstLayerObjects = new ArrayList<ConvertibleObject>();
		secondLayerObjects = new ArrayList<ConvertibleObject>();
		thirdLayerObjects = new ArrayList<ConvertibleObject>();
		ConvertibleProject.tags = tags;
	}

	@Override
	public ConvertibleObject createObject(String path) throws Exception {
		// TODO calculate an actual checksum
		fa.put(tags, path, "sha checksum");
		ConvertibleObject aConvertibleObject = getObject(path);
		if (aConvertibleObject != null) {
			return aConvertibleObject;
		} else {

			if (!path.startsWith(getDir(TEST_CASES))) {
				aConvertibleObject = createJavaWrapper(path);
				if (path.startsWith(getDir(TEST_STEPS))) {
					secondLayerObjects.add(aConvertibleObject);
				} else {
					thirdLayerObjects.add(aConvertibleObject);
				}
			} else {
				aConvertibleObject = new CucumberFeatureWrapper(path);
				firstLayerObjects.add(aConvertibleObject);
			}
			return aConvertibleObject;
		}
	}

	protected ConvertibleObject createJavaWrapper(String path) {
		return new CucumberJavaWrapper(path);
	}

	@Override
	public String getDir(String layer) {
		switch (layer) {
		case TEST_CASES:
			return "src/test/resources/cucumber";
		case TEST_STEPS:
			return "src/test/java/org/farhan/" + TEST_STEPS;
		case TEST_OBJECTS:
			return "src/test/java/org/farhan/" + TEST_OBJECTS;
		default:
			return "";
		}
	}

	@Override
	public String getFileExt(String layer) {
		if (layer.contentEquals(TEST_CASES)) {
			return ".feature";
		} else {
			return ".java";
		}
	}

	private ConvertibleObject getObject(String path) {
		if (path.startsWith(getDir(TEST_CASES))) {
			for (ConvertibleObject obj : firstLayerObjects) {
				if (obj.getPath().contentEquals(path)) {
					return obj;
				}
			}
		} else if (path.startsWith(getDir(TEST_STEPS))) {
			for (ConvertibleObject obj : secondLayerObjects) {
				if (obj.getPath().contentEquals(path)) {
					return obj;
				}
			}
		} else if (path.startsWith(getDir(TEST_OBJECTS))) {
			for (ConvertibleObject obj : thirdLayerObjects) {
				if (obj.getPath().contentEquals(path)) {
					return obj;
				}
			}
		}
		return null;
	}

	@Override
	public ArrayList<ConvertibleObject> getObjects(String layer) {

		ArrayList<ConvertibleObject> layerObjects = null;
		switch (layer) {
		case TEST_CASES:
			layerObjects = firstLayerObjects;
			break;
		case TEST_STEPS:
			layerObjects = secondLayerObjects;
			break;
		case TEST_OBJECTS:
			layerObjects = thirdLayerObjects;
			break;
		}
		return layerObjects;
	}

	@Override
	public void init() throws Exception {
		CucumberStandaloneSetup.doSetup();
	}

	@Override
	public void deleteObject(ConvertibleObject srcObj) {
		firstLayerObjects.remove(srcObj);
		secondLayerObjects.remove(srcObj);
		thirdLayerObjects.remove(srcObj);
	}

}
