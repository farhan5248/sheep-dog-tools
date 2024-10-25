
package org.farhan.mbt.asciidoctor;

import java.io.File;
import java.util.ArrayList;

import org.asciidoctor.ast.Section;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.Scenario;
import org.farhan.mbt.cucumber.ScenarioOutline;

public class AsciiDoctorProject extends ConvertibleProject {

	private static ArrayList<ConvertibleObject> firstLayerObjects;

	public AsciiDoctorProject() {
		firstLayerObjects = new ArrayList<ConvertibleObject>();
	}

	@Override
	public ConvertibleObject createObject(String name) {
		File file = new File(name);
		AsciiDoctorAdocWrapper cff = new AsciiDoctorAdocWrapper(file);
		firstLayerObjects.add(cff);
		return cff;
	}

	@Override
	public File getDir(String layer) {
		File aFile = null;
		aFile = new File(baseDir + "resources/asciidoc/");
		aFile.mkdirs();
		return aFile;
	}

	@Override
	public String getFileExt(String layer) {
		return ".adoc";
	}

	@Override
	public ArrayList<ConvertibleObject> getObjects(String layer) {
		ArrayList<ConvertibleObject> layerFiles = null;
		switch (layer) {
		case FIRST_LAYER:
			layerFiles = firstLayerObjects;
			break;
		}
		return layerFiles;
	}

	private boolean isFileSelected(ConvertibleObject convertibleFile, String tag) throws Exception {

		AsciiDoctorAdocWrapper ufw = (AsciiDoctorAdocWrapper) convertibleFile;
		if (isTagged(ufw.getFeatureTags(), tag)) {
			return true;
		}
		for (Section a : ufw.getAbstractScenarioList()) {
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
	public void load(String tags) throws Exception {
		ArrayList<File> files = Utilities.recursivelyListFiles(getDir(ConvertibleProject.FIRST_LAYER),
				getFileExt(ConvertibleProject.FIRST_LAYER));
		getObjects(ConvertibleProject.FIRST_LAYER).clear();
		for (File f : files) {
			createObject(f.getAbsolutePath()).load();
			if (!isFileSelected(getObjects(ConvertibleProject.FIRST_LAYER).getLast(), tags)) {
				getObjects(ConvertibleProject.FIRST_LAYER).removeLast();
			}
		}
	}

	@Override
	public void save() throws Exception {
		for (ConvertibleObject cf : firstLayerObjects) {
			cf.save();
		}
	}

}
