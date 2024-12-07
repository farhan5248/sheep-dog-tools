
package org.farhan.mbt.asciidoctor;

import java.util.ArrayList;

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
	public ConvertibleObject createObject(String path) {
		AsciiDoctorAdocWrapper cff = new AsciiDoctorAdocWrapper(path);
		try {
			// TODO calculate an actual checksum for later
			fa.put(tags, path, "sha checksum");
		} catch (Exception e) {
			// TODO do something better
			return null;
		}
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
		case TEST_CASES:
			layerFiles = firstLayerObjects;
			break;
		}
		return layerFiles;
	}

	@Override
	public void load() throws Exception {
	}

	@Override
	public void save() throws Exception {
	}

	@Override
	public void deleteObject(ConvertibleObject srcObj) {
		firstLayerObjects.remove(srcObj);
	}

}
