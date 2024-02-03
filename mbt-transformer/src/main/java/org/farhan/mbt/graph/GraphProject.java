package org.farhan.mbt.graph;

import java.io.File;
import java.util.ArrayList;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.Utilities;

public class GraphProject extends Project {

	private ArrayList<ConvertibleObject> firstLayerObjects;

	public GraphProject() {
		firstLayerObjects = new ArrayList<ConvertibleObject>();
	}

	@Override
	public File getLayerDir(String layer) {
		File aFile = null;
		aFile = new File(baseDir + "target/Graphs/");
		aFile.mkdirs();
		return aFile;
	}

	@Override
	public void load() throws Exception {

		ArrayList<File> files = Utilities.recursivelyListFiles(getLayerDir(firstLayerName),
				getLayerFileType(firstLayerName));
		firstLayerObjects.clear();
		for (File f : files) {
			GraphTextFile gtf = new GraphTextFile(f);
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
	public String getLayerFileType(String layer) {
		return ".graph";
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

}
