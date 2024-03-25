package org.farhan.mbt.graph;

import java.io.File;
import java.util.ArrayList;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.Utilities;

public class JGraphTProject extends ConvertibleProject {

	private ArrayList<ConvertibleObject> firstLayerObjects;
	private ArrayList<ConvertibleObject> secondLayerObjects;
	private int fileCnt;

	public JGraphTProject() {
		firstLayerObjects = new ArrayList<ConvertibleObject>();
		secondLayerObjects = new ArrayList<ConvertibleObject>();
		fileCnt = 0;
	}

	@Override
	public File getDir(String layer) {
		File aFile = null;
		switch (layer) {
		case FIRST_LAYER:
			aFile = new File(baseDir + "target/graphs/" + this.FIRST_LAYER + "/");
			break;
		case SECOND_LAYER:
			aFile = new File(baseDir + "target/graphs/" + SECOND_LAYER + "/");
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
			if (jgw.getFile().getPath().contentEquals(fileName)) {
				return jgw;
			}
		}
		return null;
	}

	public String createResource(String prefix, String content) {
		String fileName = prefix + "-" + fileCnt + ".txt";
		try {
			File aFile = new File(baseDir + "target/graphs/resources/" + fileName);
			Utilities.writeFile(aFile, content);
			fileCnt++;
		} catch (Exception e) {
			// TODO Handle this during the exception handling review
		}
		return fileName;
	}

	public String getResource(String fileName) {
		try {
			File aFile = new File(baseDir + "target/graphs/resources/" + fileName);
			return Utilities.readFile(aFile);
		} catch (Exception e) {
			// TODO Handle this during the exception handling review
		}
		return null;
	}

	public JGraphTGraphWrapper getObject(String graphName, String layer) {
		for (Object o : getObjects(layer)) {
			MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) ((JGraphTGraphWrapper) o).get();
			if (g.getName().contentEquals(graphName)) {
				return (JGraphTGraphWrapper) o;
			}
		}
		return null;
	}

}
