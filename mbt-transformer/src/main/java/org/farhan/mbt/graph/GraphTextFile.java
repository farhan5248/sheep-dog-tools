package org.farhan.mbt.graph;

import java.io.File;

import org.farhan.mbt.core.ConvertibleFile;
import org.farhan.mbt.core.Utilities;

public class GraphTextFile implements ConvertibleFile {

	private File theFile;
	public MBTGraph<MBTVertex, MBTEdge> theGraph;

	public GraphTextFile(MBTGraph<MBTVertex, MBTEdge> g) {
		theGraph = g;
		String fileName = GraphProject.getFirstLayerDir().getAbsolutePath() + File.separator + g.getName() + ".txt";
		theFile = new File(fileName);
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
	}

	@Override
	public File getFile() {
		return theFile;
	}

	@Override
	public void read() {
		if (theFile.exists()) {
			// TODO in the future call the dot exporter code here
			theGraph = readFile();
		}
	}

	private MBTGraph<MBTVertex, MBTEdge> readFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write() throws Exception {
		String fileContents = theGraph.toString();
		Utilities.writeFile(theFile, fileContents);
	}

}
