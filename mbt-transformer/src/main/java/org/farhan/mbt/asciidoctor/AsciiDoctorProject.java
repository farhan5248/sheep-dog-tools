
package org.farhan.mbt.asciidoctor;

import java.io.File;
import java.util.ArrayList;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.Utilities;

public class AsciiDoctorProject extends Project {

	private static ArrayList<ConvertibleObject> firstLayerFiles;

	public static File getFirstLayerDir() {
		return new File(baseDir + "src/test/resources/AsciiDoc/");
	}

	public static ArrayList<ConvertibleObject> getLayerFiles(String layer) {
		if (firstLayerFiles.isEmpty()) {
			readFiles();
		}
		return firstLayerFiles;
	}

	private static String getFirstLayerFileType() {
		return ".adoc";
	}

	public static void init() {
		firstLayerFiles = new ArrayList<ConvertibleObject>();
	}

	public static void readFiles() {
		ArrayList<File> files = Utilities.recursivelyListFiles(getFirstLayerDir(), getFirstLayerFileType());
		for (File f : files) {
			AsciiDoctorAdocFile cff = new AsciiDoctorAdocFile(f);
			firstLayerFiles.add(cff);
			cff.read();
		}
	}

	public static void writeFiles() {
		for (ConvertibleObject cf : firstLayerFiles) {
			try {
				cf.write();
			} catch (Exception e) {
				System.out.println(Utilities.getStackTraceAsString(e));
			}
		}
	}

}
