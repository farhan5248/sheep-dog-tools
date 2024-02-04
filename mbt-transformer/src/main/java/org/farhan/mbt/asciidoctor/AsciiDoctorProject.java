
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
		if (firstLayerObjects.isEmpty()) {
			try {
				load();
			} catch (Exception e) {
				Utilities.getStackTraceAsString(e);
			}
		}
		return firstLayerObjects;
	}

	@Override
	public void load() throws Exception {
		ArrayList<File> files = Utilities.recursivelyListFiles(getDir(firstLayerName),
				getFileType(firstLayerName));
		for (File f : files) {
			AsciiDoctorAdocWrapper cff = new AsciiDoctorAdocWrapper(f);
			firstLayerObjects.add(cff);
			cff.read();
		}
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
