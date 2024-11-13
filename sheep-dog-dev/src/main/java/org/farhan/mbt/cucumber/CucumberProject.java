package org.farhan.mbt.cucumber;

import java.io.File;
import java.util.ArrayList;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.Utilities;

public class CucumberProject extends ConvertibleProject {

	protected ArrayList<ConvertibleObject> firstLayerObjects;
	protected ArrayList<ConvertibleObject> secondLayerObjects;
	protected ArrayList<ConvertibleObject> thirdLayerObjects;

	public CucumberProject(String tag) {
		firstLayerObjects = new ArrayList<ConvertibleObject>();
		secondLayerObjects = new ArrayList<ConvertibleObject>();
		thirdLayerObjects = new ArrayList<ConvertibleObject>();
		this.tag = tag;
	}

	@Override
	public ConvertibleObject createObject(String name) {
		ConvertibleObject aConvertibleObject = getObject(name);
		if (aConvertibleObject != null) {
			return aConvertibleObject;
		}
		File file = new File(name);
		if (!file.getAbsolutePath().endsWith(getFileExt(FIRST_LAYER))) {
			aConvertibleObject = createJavaWrapper(file);
			if (file.getAbsolutePath().contains(SECOND_LAYER)) {
				secondLayerObjects.add(aConvertibleObject);
			} else {
				thirdLayerObjects.add(aConvertibleObject);
			}
			return aConvertibleObject;
		} else {
			aConvertibleObject = new CucumberFeatureWrapper(file);
			firstLayerObjects.add(aConvertibleObject);
			return aConvertibleObject;
		}
	}

	protected ConvertibleObject createJavaWrapper(File file) {
		return new CucumberJavaWrapper(file);
	}

	@Override
	public File getDir(String layer) {
		File aFile = null;
		switch (layer) {
		case FIRST_LAYER:
			aFile = new File(baseDir + tag + "/" + "resources/cucumber");
			break;
		case SECOND_LAYER:
			aFile = new File(baseDir + tag + "/" + "java/org/farhan/" + SECOND_LAYER);
			break;
		case THIRD_LAYER:
			aFile = new File(baseDir + tag + "/" + "java/org/farhan/" + THIRD_LAYER);
			break;
		}
		aFile.mkdirs();
		return aFile;
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
		ArrayList<File> files = Utilities.recursivelyListFiles(getDir(ConvertibleProject.FIRST_LAYER),
				getFileExt(ConvertibleProject.FIRST_LAYER));
		for (File f : files) {
			createObject(f.getAbsolutePath()).load();
			if (!isFileSelected(getObjects(ConvertibleProject.FIRST_LAYER).getLast(), this.tag)) {
				getObjects(ConvertibleProject.FIRST_LAYER).removeLast();
			}
		}
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

}
