package org.farhan.mbt.graph;

import java.io.File;
import java.util.ArrayList;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;

public class JGraphTProject extends ConvertibleProject {

	private ArrayList<ConvertibleObject> firstLayerObjects;
	private ArrayList<ConvertibleObject> secondLayerObjects;

	public JGraphTProject() {
		firstLayerObjects = new ArrayList<ConvertibleObject>();
		secondLayerObjects = new ArrayList<ConvertibleObject>();
	}

	@Override
	public File getDir(String layer) {
		File aFile = null;
		switch (layer) {
		case FIRST_LAYER:
			aFile = new File(baseDir + "target/Graphs/" + this.FIRST_LAYER + "/");
			break;
		case SECOND_LAYER:
			aFile = new File(baseDir + "target/Graphs/" + SECOND_LAYER + "/");
			break;
		}
		aFile.mkdirs();
		return aFile;
	}

	@Override
	public void save() throws Exception {
		for (ConvertibleObject cf : firstLayerObjects) {
			cf.save();
		}
		for (ConvertibleObject cf : secondLayerObjects) {
			cf.save();
		}
	}

	@Override
	public String getFileExt(String layer) {
		return ".graph";
	}

	@Override
	public ArrayList<ConvertibleObject> getObjects(String layer) {
		ArrayList<ConvertibleObject> layerObjects = null;
		switch (layer) {
		case FIRST_LAYER:
			layerObjects = firstLayerObjects;
			break;
		case SECOND_LAYER:
			layerObjects = secondLayerObjects;
			break;
		}
		return layerObjects;
	}

	@Override
	public ConvertibleObject createObject(String name) {
		JGraphTGraphWrapper jgw = getGraph(name);
		if (jgw == null) {
			File file = new File(name);
			jgw = new JGraphTGraphWrapper(new File(name));
			if (file.getAbsolutePath().contains(getDir(FIRST_LAYER).getName())) {
				firstLayerObjects.add(jgw);
			} else {
				secondLayerObjects.add(jgw);
			}
		}
		return jgw;
	}

	private JGraphTGraphWrapper getGraph(String fileName) {

		// TODO this is an ugly hack, refactor it, there's similar code in the Converter
		// classes

		String layer = FIRST_LAYER;
		if (fileName.contains(SECOND_LAYER)) {
			layer = SECOND_LAYER;
		}
		for (Object o : getObjects(layer)) {

			JGraphTGraphWrapper jgw = (JGraphTGraphWrapper) o;
			if (jgw.getFile().getAbsolutePath().contentEquals(fileName)) {
				return jgw;
			}
		}
		return null;
	}

}
