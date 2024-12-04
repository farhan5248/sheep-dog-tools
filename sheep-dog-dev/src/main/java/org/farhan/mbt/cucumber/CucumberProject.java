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
	public ConvertibleObject createObject(String path) {
		ConvertibleObject aConvertibleObject = getObject(path);
		if (aConvertibleObject != null) {
			return aConvertibleObject;
		} else {
			if (!path.endsWith(getFileExt(TEST_CASES))) {
				aConvertibleObject = createJavaWrapper(path);
				if (path.contains(TEST_STEPS)) {
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

	public ConvertibleObject getObject(String name) {
		if (name.startsWith(getDir(TEST_CASES))) {
			for (ConvertibleObject obj : firstLayerObjects) {
				if (obj.getPath().contentEquals(name)) {
					return obj;
				}
			}
		} else {
			if (name.startsWith(getDir(TEST_STEPS))) {
				for (ConvertibleObject obj : secondLayerObjects) {
					if (obj.getPath().contentEquals(name)) {
						return obj;
					}
				}
			} else if (name.startsWith(getDir(TEST_OBJECTS))) {
				for (ConvertibleObject obj : thirdLayerObjects) {
					if (obj.getPath().contentEquals(name)) {
						return obj;
					}
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

	private boolean isFileSelected(ConvertibleObject convertibleFile, String tag) throws Exception {

		CucumberFeatureWrapper ufw = (CucumberFeatureWrapper) convertibleFile;
		if (isTagged(ufw.getFeatureTags(), tag)) {
			return true;
		}
		for (AbstractScenario a : ufw.getAbstractScenarioList()) {
			if (ufw.isScenarioOutline(a)) {
				if (isTagged(ufw.getScenarioOutlineTags(a), tag)) {
					return true;
				}
			} else if (!ufw.isBackground(a)) {
				if (isTagged(ufw.getScenarioTags(a), tag)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isTagged(ArrayList<String> tags, String tag) {
		if (tag.isEmpty()) {
			return true;
		}
		for (String t : tags) {
			if (t.trim().contentEquals(tag)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void load() throws Exception {

		CucumberStandaloneSetup.doSetup();
		ArrayList<String> files = fa.list(tags, getDir(TEST_CASES), getFileExt(TEST_CASES));
		for (String f : files) {
			createObject(f).parse(fa.get(tags, f));
			if (!isFileSelected(getObjects(TEST_CASES).getLast(), tags)) {
				getObjects(TEST_CASES).removeLast();
			}
		}
	}

	@Override
	public void save() throws Exception {
		for (ConvertibleObject cf : firstLayerObjects) {
			cf.save(fa);
		}
		for (ConvertibleObject cf : secondLayerObjects) {
			cf.save(fa);
		}
		for (ConvertibleObject cf : thirdLayerObjects) {
			cf.save(fa);
		}
	}

}
