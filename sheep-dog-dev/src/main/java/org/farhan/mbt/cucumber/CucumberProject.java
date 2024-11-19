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

	public CucumberProject(String tag, ObjectRepository fa) {
		super(fa);
		firstLayerObjects = new ArrayList<ConvertibleObject>();
		secondLayerObjects = new ArrayList<ConvertibleObject>();
		thirdLayerObjects = new ArrayList<ConvertibleObject>();
		ConvertibleProject.tags = tag;
	}

	@Override
	public ConvertibleObject createObject(String path) {
		ConvertibleObject aConvertibleObject = getObject(path);
		if (aConvertibleObject != null) {
			return aConvertibleObject;
		}
		if (!path.endsWith(getFileExt(FIRST_LAYER))) {
			aConvertibleObject = createJavaWrapper(path);
			if (path.contains(SECOND_LAYER)) {
				secondLayerObjects.add(aConvertibleObject);
			} else {
				thirdLayerObjects.add(aConvertibleObject);
			}
			return aConvertibleObject;
		} else {
			aConvertibleObject = new CucumberFeatureWrapper(path);
			firstLayerObjects.add(aConvertibleObject);
			return aConvertibleObject;
		}
	}

	protected ConvertibleObject createJavaWrapper(String path) {
		return new CucumberJavaWrapper(path);
	}

	@Override
	public String getDir(String layer) {
		switch (layer) {
		case FIRST_LAYER:
			return "src/test/resources/cucumber";
		case SECOND_LAYER:
			return "src/test/java/org/farhan/" + SECOND_LAYER;
		case THIRD_LAYER:
			return "src/test/java/org/farhan/" + THIRD_LAYER;
		default:
			return "";
		}
	}

	@Override
	public String getFileExt(String layer) {
		if (layer.contentEquals(FIRST_LAYER)) {
			return ".feature";
		} else {
			return ".java";
		}
	}

	public ConvertibleObject getObject(String name) {
		if (name.startsWith(getDir(FIRST_LAYER))) {
			for (ConvertibleObject obj : firstLayerObjects) {
				if (obj.getPath().contentEquals(name)) {
					return obj;
				}
			}
		} else {
			if (name.startsWith(getDir(SECOND_LAYER))) {
				for (ConvertibleObject obj : secondLayerObjects) {
					if (obj.getPath().contentEquals(name)) {
						return obj;
					}
				}
			} else if (name.startsWith(getDir(THIRD_LAYER))) {
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
		ArrayList<String> files = fa.list(ConvertibleProject.tags, getDir(ConvertibleProject.FIRST_LAYER),
				getFileExt(ConvertibleProject.FIRST_LAYER));
		for (String f : files) {
			createObject(f).load(fa);
			if (!isFileSelected(getObjects(ConvertibleProject.FIRST_LAYER).getLast(), tags)) {
				getObjects(ConvertibleProject.FIRST_LAYER).removeLast();
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
