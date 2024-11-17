
package org.farhan.mbt.asciidoctor;

import java.io.File;
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
		this.tags = tags;
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
		aFile = new File(baseDir + tags + "/" + "resources/asciidoc/");
		return aFile;
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
		if (tags.isEmpty()) {
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
		ArrayList<String> files = fa.list(getDir(ConvertibleProject.FIRST_LAYER).getAbsolutePath(),
				getFileExt(ConvertibleProject.FIRST_LAYER));
		getObjects(ConvertibleProject.FIRST_LAYER).clear();
		for (String f : files) {
			createObject(f).load(fa);
			if (!isFileSelected(getObjects(ConvertibleProject.FIRST_LAYER).getLast(), this.tags)) {
				getObjects(ConvertibleProject.FIRST_LAYER).removeLast();
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
