
package org.farhan.mbt.asciidoctor;

import java.io.File;
import java.util.ArrayList;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.Utilities;

public class AsciiDoctorProject extends ConvertibleProject {

	private static ArrayList<ConvertibleObject> firstLayerObjects;

	public AsciiDoctorProject() {
		firstLayerObjects = new ArrayList<ConvertibleObject>();
	}

	@Override
	public File getDir(String layer) {
		File aFile = null;
		aFile = new File(baseDir + "src/test/resources/AsciiDoc/");
		aFile.mkdirs();
		return aFile;
	}

	@Override
	public ArrayList<ConvertibleObject> getObjects(String layer) {
		ArrayList<ConvertibleObject> layerFiles = null;
		switch (layer) {
		case firstLayerName:
			layerFiles = firstLayerObjects;
			break;
		}
		return layerFiles;
	}

	@Override
	public void load() throws Exception {
		ArrayList<File> files = Utilities.recursivelyListFiles(getDir(firstLayerName), getFileType(firstLayerName));
		firstLayerObjects.clear();
		for (File f : files) {
			createObject(f.getAbsolutePath()).read();
		}
	}

	@Override
	public ConvertibleObject createObject(String name) {
		File file = new File(name);
		AsciiDoctorAdocWrapper cff = new AsciiDoctorAdocWrapper(file);
		firstLayerObjects.add(cff);
		return cff;
	}

	@Override
	public void save() throws Exception {
		for (ConvertibleObject cf : firstLayerObjects) {
			cf.write();
		}
	}

	@Override
	public String getFileType(String layer) {
		return ".adoc";
	}

}
