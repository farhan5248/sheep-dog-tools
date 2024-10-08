
package org.farhan.mbt.cucumber;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.farhan.mbt.cucumber.AbstractScenario;
import org.farhan.mbt.cucumber.Feature;
import org.farhan.mbt.cucumber.Scenario;
import org.farhan.mbt.cucumber.ScenarioOutline;
import org.farhan.mbt.cucumber.Tag;
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
			aFile = new File(baseDir + "src/test/resources/cucumber");
			break;
		case SECOND_LAYER:
			aFile = new File(baseDir + "src/test/java/org/farhan/" + SECOND_LAYER);
			break;
		case THIRD_LAYER:
			aFile = new File(baseDir + "src/test/java/org/farhan/" + THIRD_LAYER);
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
		ConvertibleObject aConvertibleObject = getObject(name);
		if (aConvertibleObject != null) {
			return aConvertibleObject;
		}
		File file = new File(name);
		if (file.getAbsolutePath().startsWith(getDir(FIRST_LAYER).getAbsolutePath())) {
			aConvertibleObject = new CucumberFeatureWrapper(file);
			firstLayerObjects.add(aConvertibleObject);
			return aConvertibleObject;
		} else {
			aConvertibleObject = new CucumberJavaWrapper(file);
			if (file.getAbsolutePath().startsWith(getDir(SECOND_LAYER).getAbsolutePath())) {
				secondLayerObjects.add(aConvertibleObject);
			} else if (file.getAbsolutePath().startsWith(getDir(THIRD_LAYER).getAbsolutePath())) {
				thirdLayerObjects.add(aConvertibleObject);
			}
			return aConvertibleObject;
		}
	}

	public ConvertibleObject getObject(String name) {
		File file = new File(name);
		if (file.getAbsolutePath().startsWith(getDir(FIRST_LAYER).getAbsolutePath())) {
			for (ConvertibleObject obj : firstLayerObjects) {
				if (obj.getFile().getAbsolutePath().contentEquals(file.getAbsolutePath())) {
					return obj;
				}
			}
		} else {
			if (file.getAbsolutePath().startsWith(getDir(SECOND_LAYER).getAbsolutePath())) {
				for (ConvertibleObject obj : secondLayerObjects) {
					if (obj.getFile().getAbsolutePath().contentEquals(file.getAbsolutePath())) {
						return obj;
					}
				}
			} else if (file.getAbsolutePath().startsWith(getDir(THIRD_LAYER).getAbsolutePath())) {
				for (ConvertibleObject obj : thirdLayerObjects) {
					if (obj.getFile().getAbsolutePath().contentEquals(file.getAbsolutePath())) {
						return obj;
					}
				}
			}
		}
		return null;
	}

	public void load(String tags) throws Exception {
		ArrayList<File> files = Utilities.recursivelyListFiles(getDir(ConvertibleProject.FIRST_LAYER),
				getFileExt(ConvertibleProject.FIRST_LAYER));
		for (File f : files) {
			createObject(f.getAbsolutePath()).load();
			if (!isFileSelected(getObjects(ConvertibleProject.FIRST_LAYER).getLast(), tags)) {
				getObjects(ConvertibleProject.FIRST_LAYER).removeLast();
			}
		}
	}

	private boolean isFileSelected(ConvertibleObject convertibleFile, String tag) throws Exception {

		CucumberFeatureWrapper ufw = (CucumberFeatureWrapper) convertibleFile;
		// TODO use getFeatureTags and remove get()
		Feature f = (Feature) ufw.get();
		if (isTagged(f.getTags(), tag)) {
			return true;
		}
		for (AbstractScenario a : f.getAbstractScenarios()) {
			if (a instanceof Scenario) {
				if (isTagged(((Scenario) a).getTags(), tag)) {
					return true;
				}
			} else if (a instanceof ScenarioOutline) {
				if (isTagged(((ScenarioOutline) a).getTags(), tag)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isTagged(EList<Tag> tags, String tag) {
		if (tag.isEmpty()) {
			return true;
		}
		for (Tag t : tags) {
			if (t.getName().trim().contentEquals(tag)) {
				return true;
			}
		}
		return false;
	}

}
