
package org.farhan.mbt.asciidoctor;

import java.io.File;
import java.util.ArrayList;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.Utilities;

public class AsciiDoctorProject extends Project {

	private static ArrayList<ConvertibleObject> firstLayerObjects;

	public AsciiDoctorProject() {
		firstLayerObjects = new ArrayList<ConvertibleObject>();
	}

	@Override
	public File getLayerDir(String layer) {
		File aFile = null;
		aFile = new File(baseDir + "src/test/resources/AsciiDoc/");
		aFile.mkdirs();
		return aFile;
	}

	@Override
	public ArrayList<ConvertibleObject> getLayerObjects(String layer) {
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
		ArrayList<File> files = Utilities.recursivelyListFiles(getLayerDir(firstLayerName),
				getLayerFileType(firstLayerName));
		for (File f : files) {
			AsciiDoctorAdocFile cff = new AsciiDoctorAdocFile(f);
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
	public String getLayerFileType(String layer) {
		return ".adoc";
	}

}
