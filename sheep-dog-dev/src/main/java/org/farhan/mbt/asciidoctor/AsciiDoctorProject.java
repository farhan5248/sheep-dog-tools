
package org.farhan.mbt.asciidoctor;

import java.util.ArrayList;

import org.farhan.mbt.SheepDogStandaloneSetup;
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
		// TODO make this mimic the CucumberProject implementation
		AsciiDoctorAdocWrapper cff = new AsciiDoctorAdocWrapper(path);
		// TODO calculate an actual checksum for later
		fa.put(tags, path, "sha checksum");
		firstLayerObjects.add(cff);
		return cff;
	}

	@Override
	public String getDir(String layer) {
		// TODO rethink what these directories should be after creating the adoc editor
		switch (layer) {
		case TEST_CASES:
			return "src/test/resources/asciidoc";
		case TEST_STEPS:
			return "src/test/resources/asciidoc/" + TEST_STEPS;
		case TEST_OBJECTS:
			return "src/test/resources/asciidoc/" + TEST_OBJECTS;
		default:
			return "";
		}
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
	public void init() throws Exception {
		SheepDogStandaloneSetup.doSetup();
	}

	@Override
	public void deleteObject(ConvertibleObject srcObj) {
		firstLayerObjects.remove(srcObj);
	}

}
