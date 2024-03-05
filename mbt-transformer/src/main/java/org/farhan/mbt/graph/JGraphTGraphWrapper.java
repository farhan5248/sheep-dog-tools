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
		theGraph.setLabel(f.getName().replace(".graph", ""));
		theGraph.createStartVertex();
		theGraph.createEndVertex();
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
		theGraph.setLabel(theFile.getName());
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
		boolean isValue = false;
		boolean isDescription = false;
		MBTVertex sourceVertex = null;
		MBTVertex targetVertex = null;
		for (String line : lines.split("\n")) {
			if (line.startsWith("Graph")) {
				lastGraph = new MBTGraph<MBTVertex, MBTEdge>(MBTEdge.class);
				theGraph = lastGraph;
			} else if (line.startsWith("\tname:")) {
				lastGraph.setLabel(line.replace("\tname:", ""));
			} else if (line.startsWith("\t\t\t\t\tname:")) {
				lastGraph.setLabel(line.replace("\t\t\t\t\tname:", ""));
			} else if (line.startsWith("\tvertices:")) {
			} else if (line.startsWith("\t\t\t\t\tvertices:")) {
			} else if (line.startsWith("\t\tVertex")) {
				lastObject = new MBTVertex("");
			} else if (line.startsWith("\t\t\t\t\t\tVertex")) {
				lastObject = new MBTVertex("");
			} else if (line.startsWith("\t\t\tlabel:") && lastObject instanceof MBTVertex) {
				((MBTVertex) lastObject).setLabel(line.replace("\t\t\tlabel:", ""));
				lastGraph.addVertex((MBTVertex) lastObject);
			} else if (line.startsWith("\t\t\t\t\t\t\tlabel:") && lastObject instanceof MBTVertex) {
				((MBTVertex) lastObject).setLabel(line.replace("\t\t\t\t\t\t\tlabel:", ""));
				lastGraph.addVertex((MBTVertex) lastObject);
			} else if (line.startsWith("\tedges:")) {
			} else if (line.startsWith("\t\t\t\t\tedges:")) {
			} else if (line.startsWith("\t\tEdge")) {
				lastObject = new MBTEdge("");
			} else if (line.startsWith("\t\t\t\t\t\tEdge")) {
				lastObject = new MBTEdge("");
			} else if (line.startsWith("\t\t\tlabel:") && lastObject instanceof MBTEdge) {
				((MBTEdge) lastObject).setLabel(line.replace("\t\t\tlabel:", ""));
			} else if (line.startsWith("\t\t\t\t\t\t\tlabel:") && lastObject instanceof MBTEdge) {
				((MBTEdge) lastObject).setLabel(line.replace("\t\t\t\t\t\t\tlabel:", ""));
			} else if (line.startsWith("\t\t\tsource:")) {
				isSource = true;
			} else if (line.startsWith("\t\t\t\t\t\t\tsource:")) {
				isSource = true;
			} else if (line.startsWith("\t\t\ttarget:")) {
				isSource = false;
			} else if (line.startsWith("\t\t\t\t\t\t\ttarget:")) {
				isSource = false;
			} else if (line.startsWith("\t\t\t\tVertex")) {
			} else if (line.startsWith("\t\t\t\t\t\t\t\tVertex")) {
			} else if (line.startsWith("\t\t\t\t\tlabel:") && lastObject instanceof MBTEdge && isSource) {
				sourceVertex = lastGraph.getVertex(line.replace("\t\t\t\t\tlabel:", ""));
			} else if (line.startsWith("\t\t\t\t\t\t\t\t\tlabel:") && lastObject instanceof MBTEdge && isSource) {
				sourceVertex = lastGraph.getVertex(line.replace("\t\t\t\t\t\t\t\t\tlabel:", ""));
			} else if (line.startsWith("\t\t\t\t\tlabel:") && lastObject instanceof MBTEdge && !isSource) {
				targetVertex = lastGraph.getVertex(line.replace("\t\t\t\t\tlabel:", ""));
				lastGraph.addEdge(sourceVertex, targetVertex, (MBTEdge) lastObject);
			} else if (line.startsWith("\t\t\t\t\t\t\t\t\tlabel:") && lastObject instanceof MBTEdge && !isSource) {
				targetVertex = lastGraph.getVertex(line.replace("\t\t\t\t\t\t\t\t\tlabel:", ""));
				lastGraph.addEdge(sourceVertex, targetVertex, (MBTEdge) lastObject);
			} else if (line.startsWith("\ttag:")) {
				lastGraph.setTag(line.replace("\ttag:", ""));
			} else if (line.startsWith("\t\t\ttag:") && lastObject instanceof MBTEdge) {
				((MBTEdge) lastObject).setTag(line.replace("\t\t\ttag:", ""));
			} else if (line.startsWith("\t\t\t\t\t\t\ttag:") && lastObject instanceof MBTEdge) {
				((MBTEdge) lastObject).setTag(line.replace("\t\t\t\t\t\t\ttag:", ""));
			} else if (line.startsWith("\t\t\tdescription:") && lastObject instanceof MBTEdge) {
				isValue = false;
				isDescription = true;
			} else if (line.startsWith("\t\t\t\t\t\t\tdescription:") && lastObject instanceof MBTEdge) {
				isValue = false;
				isDescription = true;
			} else if (line.startsWith("\t\t\tvalue:") && lastObject instanceof MBTEdge) {
				isValue = true;
				isDescription = false;
			} else if (line.startsWith("\t\t\t\t\t\t\tvalue:") && lastObject instanceof MBTEdge) {
				isValue = true;
				isDescription = false;
			} else if (line.startsWith("\t\t\t\tGraph") && lastObject instanceof MBTEdge) {
				isValue = false;
				lastGraph = new MBTGraph<MBTVertex, MBTEdge>(MBTEdge.class);
				((MBTEdge) lastObject).setValue(lastGraph);
			} else if (isValue) {
				isValue = false;
				((MBTEdge) lastObject).setValue(line.trim());
			} else if (isDescription) {
				MBTEdge edge = (MBTEdge) lastObject;
				String description = edge.getDescription();
				if (description.isEmpty()) {
					edge.setDescription(line.trim());
				} else {
					edge.setDescription(description + "\n" + line.trim());
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
