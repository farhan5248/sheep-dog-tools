
package org.farhan.mbt.asciidoctor;

import java.util.ArrayList;

import org.asciidoctor.ast.Section;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.ObjectRepository;

public class AsciiDoctorProject extends ConvertibleProject {

	private static ArrayList<ConvertibleObject> firstLayerObjects;

	public AsciiDoctorProject(String tags, ObjectRepository fa) {
		super(fa);
		firstLayerObjects = new ArrayList<ConvertibleObject>();
		ConvertibleProject.tags = tags;
	}

	@Override
	public ConvertibleObject createObject(String path) throws Exception {
		AsciiDoctorAdocWrapper cff = new AsciiDoctorAdocWrapper(path);
		firstLayerObjects.add(cff);
		return cff;
	}

	@Override
	public String getDir(String layer) {
		return "src/test/resources/asciidoc";
	}

	@Override
	public String getFileExt(String layer) {
		return ".asciidoc";
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

	private boolean isFileSelected(ConvertibleObject convertibleFile, String tags) throws Exception {

		AsciiDoctorAdocWrapper ufw = (AsciiDoctorAdocWrapper) convertibleFile;
		if (isTagged(ufw.getFeatureTags(), tags)) {
			return true;
		}
		for (Section a : ufw.getAbstractScenarioList()) {
			if (ufw.isScenarioOutline(a)) {
				if (isTagged(ufw.getScenarioOutlineTags(a), tags)) {
					return true;
				}
			} else if (!ufw.isBackground(a)) {
				if (isTagged(ufw.getScenarioTags(a), tags)) {
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
		ArrayList<String> files = fa.list(tags, getDir(FIRST_LAYER), getFileExt(FIRST_LAYER));
		getObjects(FIRST_LAYER).clear();
		for (String f : files) {
			createObject(f).load(fa.get(tags, f));
			if (!isFileSelected(getObjects(FIRST_LAYER).getLast(), tags)) {
				getObjects(FIRST_LAYER).removeLast();
			}
		}
	}

	@Override
	public void save() throws Exception {
		for (ConvertibleObject cf : firstLayerObjects) {
			cf.save(fa);
		}
	}

}
