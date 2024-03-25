package org.farhan.mbt.graph;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

import org.asciidoctor.ast.Section;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Utilities;

public class JGraphTGraphWrapper implements ConvertibleObject {

	private int pathCnt;
	private MBTVertex backgroundEndVertex;
	private File theFile;
	private MBTGraph<MBTVertex, MBTEdge> theGraph;

	public JGraphTGraphWrapper(File f) {
		theFile = f;
		theGraph = new MBTGraph<MBTVertex, MBTEdge>(MBTEdge.class);
		theGraph.setName(f.getName());
		theGraph.createStartVertex();
		theGraph.createEndVertex();
		backgroundEndVertex = null;
		pathCnt = 0;
	}

	@Override
	public Object get() {
		return theGraph;
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

	@Override
	public void save() throws Exception {
		String fileContents = theGraph.toString();
		Utilities.writeFile(theFile, fileContents);
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
		theGraph.setName(theFile.getName());
	}

	public void addBackground(MBTPathInfo background) {
		theGraph.addPath(background);
		pathCnt++;
		MBTEdge edge = getLastCoveredEdge(background);
		backgroundEndVertex = theGraph.getEdgeSource(edge);
		// TODO this removes the data table associated with this edge.
		// Use a waypoint
		theGraph.removeEdge(edge);
	}

	public void addScenario(MBTPathInfo scenario) {
		theGraph.addPath(scenario);
		pathCnt++;
	}

	public void addScenarioOutline(MBTPathInfo abstractScenario) {
		theGraph.addPath(abstractScenario);
		pathCnt++;
	}

	public MBTPathInfo createAbstractScenario(int index) {
		MBTPathInfo abstractScenario = new MBTPathInfo(String.valueOf(index));
		MBTVertex source = theGraph.getStartVertex();
		if (backgroundEndVertex != null) {
			source = backgroundEndVertex;
		}
		theGraph.createEdgeWithVertices(source.getLabel(), theGraph.getEndVertex().getLabel(), "",
				String.valueOf(index));
		return abstractScenario;
	}

	public MBTPathInfo createBackground() {
		MBTPathInfo background = createAbstractScenario(pathCnt);
		// backgrounds don't have tags so use that field for now
		setScenarioOutlineTags(background, "background");
		return background;
	}

	public MBTPathInfo createExamples(MBTPathInfo scenarioOutline) {
		return scenarioOutline;
	}

	public MBTPathInfo createExamplesRow(MBTPathInfo examples) {
		return examples;
	}

	public MBTPathInfo createScenario() {
		return createAbstractScenario(pathCnt);
	}

	public MBTPathInfo createScenarioOutline() {
		return createAbstractScenario(pathCnt);
	}

	public void createStep(MBTPathInfo abstractScenario, String name) {
		addLastCoveredEdge(abstractScenario, name, "");
	}

	private void addLastCoveredEdge(MBTPathInfo abstractScenario, String name, String edgeLabel) {

		MBTVertex newStep = theGraph.createVertex(name);
		MBTEdge lastCoveredEdge = getLastCoveredEdge(abstractScenario);
		theGraph.createEdgeWithVertices(theGraph.getEdgeSource(lastCoveredEdge).getLabel(), newStep.getLabel(),
				lastCoveredEdge.getLabel(), String.valueOf(abstractScenario.getIndex()));
		theGraph.createEdgeWithVertices(newStep.getLabel(), theGraph.getEndVertex().getLabel(), edgeLabel,
				String.valueOf(abstractScenario.getIndex()));
		abstractScenario.removeCoverage(lastCoveredEdge);
		if (lastCoveredEdge.getTags().isEmpty()) {
			theGraph.removeEdge(lastCoveredEdge);
		}
	}

	private MBTEdge getLastCoveredEdge(MBTPathInfo abstractScenario) {
		for (MBTEdge e : theGraph.incomingEdgesOf(theGraph.getEndVertex())) {
			if (abstractScenario.isCoveredBy(e)) {
				return e;
			}
		}
		return null;
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

	public void setBackgroundDescription(MBTPathInfo background, String description) {
		background.setDescription(description);
	}

	public void setBackgroundName(MBTPathInfo background, String name) {
		background.setName(name);
	}

	public void setExamplesName(MBTPathInfo examples, String name) {
		examples.setName(examples.getName() + "/" + name);
	}

	public void setExamplesRowName(MBTPathInfo examplesRow, String name) {
		examplesRow.setName(examplesRow.getName() + "/" + name);
	}

	public void setFeatureDescription(String description) {
		theGraph.setDescription(description);
	}

	public void setFeatureName(String name) {
		theGraph.setName(name);
	}

	public void setFeatureTags(String tags) {
		theGraph.setTags(tags);
	}

	public void setScenarioDescription(MBTPathInfo scenario, String description) {
		scenario.setDescription(description);
	}

	public void setScenarioName(MBTPathInfo scenario, String name) {
		scenario.setName(name);
	}

	public void setScenarioOutlineDescription(MBTPathInfo abstractScenario, String description) {
		abstractScenario.setDescription(description);
	}

	public void setScenarioOutlineName(MBTPathInfo abstractScenario, String name) {
		abstractScenario.setName(name);
	}

	public void setScenarioOutlineParameters(MBTPathInfo abstractScenario, Set<String> outlineParameters) {
		TreeSet<String> sortedParameters = new TreeSet<String>();
		sortedParameters.addAll(outlineParameters);
		String textParameters = "";
		for (String p : sortedParameters) {
			textParameters += "," + p;
		}
		abstractScenario.setParameters(textParameters.replaceFirst(",", ""));
	}

	public void setScenarioOutlineTags(MBTPathInfo abstractScenario, String tags) {
		abstractScenario.setTags(tags);
	}

	public void setScenarioTags(MBTPathInfo scenario, String tags) {
		scenario.setTags(tags);
	}

	public void createDocString(MBTPathInfo abstractScenario, String fileName) {
		theGraph.createEdgeWithVertices(theGraph.getStartVertex().getLabel(), theGraph.getEndVertex().getLabel(), "",
				String.valueOf(abstractScenario.getIndex()));
		addLastCoveredEdge(abstractScenario, "Content", fileName);
	}

	public void setStepDefinitionName(String name) {
		theGraph.setName(name);
	}

	public void createDataTable(MBTPathInfo abstractScenario, ArrayList<ArrayList<String>> dataTableCellList) {
		theGraph.createEdgeWithVertices(theGraph.getStartVertex().getLabel(), theGraph.getEndVertex().getLabel(), "",
				String.valueOf(abstractScenario.getIndex()));
		for (ArrayList<String> cell : dataTableCellList) {
			addLastCoveredEdge(abstractScenario, cell.get(0), cell.get(1));
		}
	}

	public String getFeatureName() {
		return theGraph.getName();
	}

	public String getFeatureTags() {
		return theGraph.getTags();
	}

	public String getFeatureDescription() {
		return theGraph.getDescription();
	}

	public ArrayList<MBTPathInfo> getAbstractScenarioList() {
		return theGraph.getPathInfo();
	}

	public boolean isBackground(MBTPathInfo abstractScenario) {
		return abstractScenario.getTags().contentEquals("background");
	}

	public boolean isScenarioOutline(MBTPathInfo abstractScenario) {
		return !abstractScenario.getParameters().isEmpty();
	}

	public String getBackgroundName(MBTPathInfo abstractScenario) {
		return abstractScenario.getName();
	}

	public String getBackgroundDescription(MBTPathInfo abstractScenario) {
		return abstractScenario.getDescription();
	}

	public ArrayList<Object> getStepList(MBTPathInfo abstractScenario) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<MBTEdge> getStepList(MBTVertex vertex, MBTPathInfo abstractScenario) {
		if (vertex == null) {
			vertex = theGraph.getStartVertex();
		}
		ArrayList<MBTEdge> stepList = null;
		Set<MBTEdge> edges = theGraph.outgoingEdgesOf(vertex);
		for (MBTEdge e : edges) {
			if (abstractScenario.isCoveredBy(e)) {
				stepList = getStepList(theGraph.getEdgeTarget(e), abstractScenario);
				if (vertex != null) {
					stepList.add(0, e);
				}
			}
		}
		if (stepList == null) {
			stepList = new ArrayList<MBTEdge>();
		}
		return stepList;
	}

	public boolean hasDataTable(MBTEdge step) {
		// TODO update this after setting layer 1 graph edges to docString or dataTable
		return true;
	}

	public boolean hasDocString(MBTEdge step) {
		if (theGraph.getVertex("Content") != null) {
			return true;
		}
		return false;
	}

	public String getStep(MBTEdge step) {
		return theGraph.getEdgeSource(step).getLabel();
	}

	public String getDocString() {
		for (MBTEdge e : theGraph.outgoingEdgesOf(theGraph.getVertex("Content"))) {
			return e.getLabel();
		}
		return null;
	}

	public ArrayList<ArrayList<String>> getDataTable(MBTEdge step, MBTPathInfo abstractScenario) {
		// TODO Auto-generated method stub
		return null;
	}

}
