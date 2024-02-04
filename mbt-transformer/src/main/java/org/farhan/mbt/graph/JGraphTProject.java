package org.farhan.mbt.graph;

import java.io.File;
import java.util.ArrayList;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.Utilities;

public class JGraphTProject extends ConvertibleProject {

	private ArrayList<ConvertibleObject> firstLayerObjects;

	public JGraphTProject() {
		firstLayerObjects = new ArrayList<ConvertibleObject>();
	}

	@Override
	public File getDir(String layer) {
		File aFile = null;
		aFile = new File(baseDir + "target/Graphs/");
		aFile.mkdirs();
		return aFile;
	}

	@Override
	public void load() throws Exception {

		ArrayList<File> files = Utilities.recursivelyListFiles(getDir(firstLayerName),
				getFileType(firstLayerName));
		firstLayerObjects.clear();
		for (File f : files) {
			JGraphTGraphWrapper gtf = new JGraphTGraphWrapper(f);
			firstLayerObjects.add(gtf);
			gtf.read();
		}
	}

	@Override
	public void save() throws Exception {
		for (ConvertibleObject cf : firstLayerObjects) {
			try {
				cf.write();
			} catch (Exception e) {
				System.out.println(Utilities.getStackTraceAsString(e));
			}
		}
	}

	@Override
	public String getFileType(String layer) {
		return ".graph";
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

}
