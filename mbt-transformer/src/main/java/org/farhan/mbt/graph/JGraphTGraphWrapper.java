package org.farhan.mbt.graph;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Utilities;

public class JGraphTGraphWrapper implements ConvertibleObject {

	private int pathCnt;
	private File theFile;
	private MBTGraph<MBTVertex, MBTEdge> theGraph;

	public JGraphTGraphWrapper(File f) {
		theFile = f;
		theGraph = new MBTGraph<MBTVertex, MBTEdge>(MBTEdge.class);
		theGraph.setName(f.getName());
		theGraph.createStartVertex();
		theGraph.createEndVertex();
		pathCnt = 0;
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

	private ArrayList<MBTEdge> getPath(MBTVertex vertex, MBTPathInfo abstractScenario) {
		Set<MBTEdge> edges;
		if (vertex == null) {
			edges = theGraph.outgoingEdgesOf(getStartVertex(abstractScenario));
		} else {
			edges = theGraph.outgoingEdgesOf(vertex);
		}
		ArrayList<MBTEdge> stepList = null;
		for (MBTEdge e : edges) {
			if (abstractScenario.isCoveredBy(e)) {
				stepList = getPath(theGraph.getEdgeTarget(e), abstractScenario);
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

	private MBTVertex getStartVertex(MBTPathInfo abstractScenario) {
		if (abstractScenario.getTags().contentEquals("background")) {
			return theGraph.getStartVertex();
		}
		if (theGraph.getPathInfo().isEmpty()) {
			return theGraph.getStartVertex();
		}
		MBTPathInfo background = theGraph.getPathInfo(0);
		if (background.getTags().contentEquals("background")) {
			return theGraph.getEdgeSource(getLastCoveredEdge(background));
		} else {
			return theGraph.getStartVertex();
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

	public void addBackground(MBTPathInfo background) {
		theGraph.addPath(background);
		pathCnt++;
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
		MBTVertex source = getStartVertex(abstractScenario);
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

	public void createDataTable(MBTPathInfo abstractScenario, ArrayList<ArrayList<String>> dataTableCellList) {
		theGraph.createEdgeWithVertices(theGraph.getStartVertex().getLabel(), theGraph.getEndVertex().getLabel(), "",
				String.valueOf(abstractScenario.getIndex()));
		for (ArrayList<String> cell : dataTableCellList) {
			addLastCoveredEdge(abstractScenario, cell.get(0), cell.get(1));
		}
	}

	public void createDocString(MBTPathInfo abstractScenario, String fileName) {
		theGraph.createEdgeWithVertices(theGraph.getStartVertex().getLabel(), theGraph.getEndVertex().getLabel(), "",
				String.valueOf(abstractScenario.getIndex()));
		addLastCoveredEdge(abstractScenario, "Content", fileName);
	}

	public MBTPathInfo createExamples(MBTPathInfo scenarioOutline) {
		return scenarioOutline;
	}

	public MBTPathInfo createExamplesRow(MBTPathInfo examples, int rowNum) {
		examples.setName(examples.getName() + "/" + String.valueOf(rowNum));
		return examples;
	}

	public void createExamplesTable(MBTPathInfo abstractScenario, Set<String> outlineParameters) {
		TreeSet<String> sortedParameters = new TreeSet<String>();
		sortedParameters.addAll(outlineParameters);
		String textParameters = "";
		for (String p : sortedParameters) {
			textParameters += "," + p;
		}
		abstractScenario.setParameters(textParameters.replaceFirst(",", ""));
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

	@Override
	public Object get() {
		return theGraph;
	}

	public ArrayList<MBTPathInfo> getAbstractScenarioList() {
		return theGraph.getPathInfo();
	}

	public String getBackgroundDescription(MBTPathInfo abstractScenario) {
		return abstractScenario.getDescription();
	}

	public String getBackgroundName(MBTPathInfo abstractScenario) {
		return abstractScenario.getName();
	}

	public ArrayList<ArrayList<String>> getDataTable(MBTPathInfo abstractScenario) {
		ArrayList<ArrayList<String>> dataTable = new ArrayList<ArrayList<String>>();
		ArrayList<String> headerRow = new ArrayList<String>();
		ArrayList<String> bodyRow = new ArrayList<String>();
		ArrayList<MBTEdge> path = getPath(null, abstractScenario);

		// header
		for (MBTEdge e : path) {
			String columnName = theGraph.getEdgeSource(e).getLabel();
			if (columnName.startsWith("0 ")) {
				headerRow.add(columnName.replaceFirst("0 ", ""));
			} else {
				break;
			}
		}
		dataTable.add(headerRow);
		// body
		int colCnt = 0;
		for (MBTEdge e : path) {
			String cellValue = e.getLabel();
			for (String p : abstractScenario.getParameters().split(",")) {
				if (p.contentEquals(headerRow.get(colCnt))) {
					cellValue = "{" + headerRow.get(colCnt) + "}";
				}
			}
			bodyRow.add(cellValue);
			if (colCnt == headerRow.size() - 1) {
				dataTable.add(bodyRow);
				colCnt = 0;
				bodyRow = new ArrayList<String>();
			} else {
				colCnt++;
			}
		}
		return dataTable;
	}

	public String getDocString() {
		for (MBTEdge e : theGraph.outgoingEdgesOf(theGraph.getVertex("Content"))) {
			return e.getLabel();
		}
		return null;
	}

	public ArrayList<MBTPathInfo> getExamplesList(MBTPathInfo abstractScenario) {
		ArrayList<MBTPathInfo> examplesList = new ArrayList<MBTPathInfo>();
		examplesList.add(abstractScenario);
		return examplesList;
	}

	public String getExamplesName(MBTPathInfo examplesSrc) {
		return examplesSrc.getName().split("/")[1];
	}

	public HashMap<String, String> getExamplesRow(MBTPathInfo examples, HashMap<String, String> examplesRow) {
		ArrayList<MBTEdge> path = getPath(null, examples);
		for (MBTEdge e : path) {
			String key = theGraph.getEdgeSource(e).getLabel().replaceFirst("^[0-9]+ ", "");
			for (String p : examples.getParameters().split(",")) {
				if (p.contentEquals(key)) {
					examplesRow.put(key, e.getLabel());
					break;
				}
			}
		}
		return examplesRow;
	}

	public String getExamplesTable(MBTPathInfo examples) {
		return examples.getParameters();
	}

	public String getFeatureDescription() {
		return theGraph.getDescription();
	}

	public String getFeatureName() {
		return theGraph.getName();
	}

	public String getFeatureTags() {
		return theGraph.getTags();
	}

	@Override
	public File getFile() {
		return theFile;
	}

	public String getScenarioDescription(MBTPathInfo abstractScenario) {
		return abstractScenario.getDescription();
	}

	public String getScenarioName(MBTPathInfo abstractScenario) {
		return abstractScenario.getName();
	}

	public String getScenarioOutlineDescription(MBTPathInfo abstractScenario) {
		return abstractScenario.getDescription();
	}

	public String getScenarioOutlineName(MBTPathInfo abstractScenario) {
		return abstractScenario.getName().split("/")[0];
	}

	public String getScenarioOutlineTags(MBTPathInfo abstractScenario) {
		return abstractScenario.getTags();
	}

	public String getScenarioTags(MBTPathInfo abstractScenario) {
		return abstractScenario.getTags();
	}

	public String getStep(MBTEdge step) {
		return theGraph.getEdgeSource(step).getLabel();
	}

	public ArrayList<MBTEdge> getStepList(MBTVertex vertex, MBTPathInfo abstractScenario) {
		return getPath(vertex, abstractScenario);
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

	public boolean isBackground(MBTPathInfo abstractScenario) {
		return abstractScenario.getTags().contentEquals("background");
	}

	public boolean isScenarioOutline(MBTPathInfo abstractScenario) {
		return !abstractScenario.getParameters().isEmpty();
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

	public void setBackgroundDescription(MBTPathInfo background, String description) {
		background.setDescription(description);
	}

	public void setBackgroundName(MBTPathInfo background, String name) {
		background.setName(name);
	}

	public void setExamplesName(MBTPathInfo examples, String name) {
		examples.setName(examples.getName() + "/" + name);
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

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
		theGraph.setName(theFile.getName());
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

	public void setScenarioOutlineTags(MBTPathInfo abstractScenario, String tags) {
		abstractScenario.setTags(tags);
	}

	public void setScenarioTags(MBTPathInfo scenario, String tags) {
		scenario.setTags(tags);
	}

	public void setStepDefinitionName(String name) {
		theGraph.setName(name);
	}

}
