package org.farhan.mbt.graph;

import java.io.File;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Utilities;

public class JGraphTGraphWrapper implements ConvertibleObject {

	private File theFile;
	private MBTGraph<MBTVertex, MBTEdge> theGraph;

	public JGraphTGraphWrapper(File f) {
		theFile = f;
		theGraph = new MBTGraph<MBTVertex, MBTEdge>(MBTEdge.class);
		// TODO get the file extension from the project?
		theGraph.setName(f.getName().replace(".graph", ""));
		theGraph.createStartVertex();
		theGraph.createEndVertex();
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
		theGraph.setName(theFile.getName());
	}

	@Override
	public File getFile() {
		return theFile;
	}

	@Override
	public void load() throws Exception {
		if (theFile.exists()) {
			readTextFile();
		}
	}

	private void readTextFile() throws Exception {
		String lines = Utilities.readFile(theFile);
		MBTGraph<MBTVertex, MBTEdge> lastGraph = null;
		Object lastObject = null;
		boolean isSource = true;
		boolean isDescription = false;
		MBTVertex sourceVertex = null;
		MBTVertex targetVertex = null;
		for (String line : lines.split("\n")) {
			if (line.startsWith("Graph")) {
				lastGraph = new MBTGraph<MBTVertex, MBTEdge>(MBTEdge.class);
				theGraph = lastGraph;
			} else if (line.startsWith("\tname:")) {
				lastGraph.setName(line.replace("\tname:", ""));
			} else if (line.startsWith("\ttag:")) {
				lastGraph.setTags(line.replace("\ttag:", ""));
			} else if (line.startsWith("\tdescription:")) {
				isDescription = true;
			} else if (line.startsWith("\tpaths:")) {
				isDescription = false;
			} else if (line.startsWith("\t\tPath")) {
				isDescription = false;
				lastObject = new MBTPathInfo();
				lastGraph.addPath((MBTPathInfo) lastObject);
			} else if (line.startsWith("\t\t\tindex:") && lastObject instanceof MBTPathInfo) {
				((MBTPathInfo) lastObject).setIndex(line.replace("\t\t\tindex:", ""));
			} else if (line.startsWith("\t\t\tname:") && lastObject instanceof MBTPathInfo) {
				((MBTPathInfo) lastObject).setName(line.replace("\t\t\tname:", ""));
			} else if (line.startsWith("\t\t\ttag:") && lastObject instanceof MBTPathInfo) {
				((MBTPathInfo) lastObject).setTags(line.replace("\t\t\ttag:", ""));
			} else if (line.startsWith("\t\t\tparameters:") && lastObject instanceof MBTPathInfo) {
				((MBTPathInfo) lastObject).setParameters(line.replace("\t\t\tparameters:", ""));
			} else if (line.startsWith("\t\t\tdescription:") && lastObject instanceof MBTPathInfo) {
				isDescription = true;
			} else if (line.startsWith("\tvertices:")) {
				isDescription = false;
			} else if (line.startsWith("\t\tVertex")) {
				lastObject = new MBTVertex("");
			} else if (line.startsWith("\t\t\tlabel:") && lastObject instanceof MBTVertex) {
				((MBTVertex) lastObject).setLabel(line.replace("\t\t\tlabel:", ""));
				lastGraph.addVertex((MBTVertex) lastObject);
			} else if (line.startsWith("\tedges:")) {
				isDescription = false;
			} else if (line.startsWith("\t\tEdge")) {
				lastObject = new MBTEdge("");
			} else if (line.startsWith("\t\t\tlabel:") && lastObject instanceof MBTEdge) {
				((MBTEdge) lastObject).setLabel(line.replace("\t\t\tlabel:", ""));
			} else if (line.startsWith("\t\t\tsource:") && lastObject instanceof MBTEdge) {
				isSource = true;
			} else if (line.startsWith("\t\t\ttarget:") && lastObject instanceof MBTEdge) {
				isSource = false;
			} else if (line.startsWith("\t\t\t\tVertex") && lastObject instanceof MBTEdge) {
			} else if (line.startsWith("\t\t\t\t\tlabel:") && lastObject instanceof MBTEdge && isSource) {
				sourceVertex = lastGraph.getVertex(line.replace("\t\t\t\t\tlabel:", ""));
			} else if (line.startsWith("\t\t\t\t\tlabel:") && lastObject instanceof MBTEdge && !isSource) {
				targetVertex = lastGraph.getVertex(line.replace("\t\t\t\t\tlabel:", ""));
				lastGraph.addEdge(sourceVertex, targetVertex, (MBTEdge) lastObject);
			} else if (line.startsWith("\t\t\ttag:") && lastObject instanceof MBTEdge) {
				((MBTEdge) lastObject).setTag(line.replace("\t\t\ttag:", ""));
			} else if (isDescription) {

				// if lastObject is null, it means this is the graph description
				if (lastObject == null) {
					String description = lastGraph.getDescription();
					if (description.isEmpty()) {
						lastGraph.setDescription(line.trim());
					} else {
						lastGraph.setDescription(description + "\n" + line.trim());
					}
				} else {
					MBTPathInfo path = (MBTPathInfo) lastObject;
					String description = path.getDescription();
					if (description.isEmpty()) {
						path.setDescription(line.trim());
					} else {
						path.setDescription(description + "\n" + line.trim());
					}
				}
			}
		}
	}

	@Override
	public void save() throws Exception {
		String fileContents = theGraph.toString();
		Utilities.writeFile(theFile, fileContents);
	}

	@Override
	public Object get() {
		return theGraph;
	}

}
