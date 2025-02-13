
package org.farhan.mbt.asciidoctor;

import java.util.ArrayList;

import org.farhan.mbt.SheepDogStandaloneSetup;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.ObjectRepository;

public class AsciiDoctorProject extends ConvertibleProject {

	public AsciiDoctorProject(String tags, ObjectRepository fa) {
		super(fa);
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
			aConvertibleObject = new AsciiDoctorAdocWrapper(path);
			if (!path.startsWith(getDir(TEST_CASES))) {
				secondLayerObjects.add(aConvertibleObject);
			} else {
				firstLayerObjects.add(aConvertibleObject);
			}
			return aConvertibleObject;
		}
	}

	@Override
	public String getDir(String layer) {
		switch (layer) {
		case TEST_CASES:
			return "src/test/resources/asciidoc";
		case TEST_STEPS:
			return "src/test/resources/asciidoc/" + TEST_STEPS;
		case TEST_OBJECTS:
			return "src/test/resources/asciidoc/" + TEST_OBJECTS;
		default:
			return "src/test/resources/asciidoc";
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
