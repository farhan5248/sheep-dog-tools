package org.farhan.mbt.graphuml;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToUMLGherkinConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.core.Validator;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTPath;
import org.farhan.mbt.graph.MBTVertex;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public class GraphToUMLConverter extends ToUMLGherkinConverter {

	private UMLClassWrapper ucw;
	private JGraphTProject source;

	public GraphToUMLConverter(String layer, JGraphTProject source, UMLProject target) {
		this.layer = layer;
		this.source = source;
		this.target = target;
	}

	@Override
	protected String getLayer() {
		return layer;
	}

	@Override
	protected void selectObjects() throws Exception {

		ArrayList<File> files = Utilities.recursivelyListFiles(source.getDir(source.FIRST_LAYER),
				source.getFileExt(source.FIRST_LAYER));
		source.getObjects(source.FIRST_LAYER).clear();
		for (File f : files) {
			source.createObject(f.getAbsolutePath()).load();
		}
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		// TODO make a GraphDotFile
		return source.getObjects(layer);
	}

	@Override
	protected void convertObject(ConvertibleObject theObject) throws Exception {

		JGraphTGraphWrapper jgw = (JGraphTGraphWrapper) theObject;
		String qualifiedName = convertObjectName(jgw.getFile().getAbsolutePath());
		ucw = (UMLClassWrapper) target.createObject(qualifiedName);
	}

	@Override
	protected void convertImports(ConvertibleObject theObject) throws Exception {
	}

	@Override
	protected void convertBehaviours(ConvertibleObject theObject) throws Exception {

		JGraphTGraphWrapper jgw = (JGraphTGraphWrapper) theObject;
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) jgw.get();
		ArrayList<MBTPath> paths = getAllPaths(g, g.getStartVertex());
		for (int i = 0; i < paths.size(); i++) {
			resetCurrentContainerObject();
			// TODO figure out names for this later, use a counter for now
			Interaction anInteraction = createInteraction((Class) ucw.get(), "Scenario " + String.valueOf(i));
			// TODO think about adding tags by deriving them from the edges
			// convertTagsToParameters(anInteraction, s.getTags());
			convertInteractionMessages(anInteraction, paths.get(i).getPath());
		}
	}

	@Override
	protected void convertInteractionMessages(Interaction anInteraction, List<?> steps) throws Exception {

		boolean isField = false;
		boolean isKeyword = true;
		HashMap<String, String> dataTable = null;
		// use loop with counters
		// ignore 0, it's start
		// ignore 1, it's blank edge
		// ignore size -1, it's end
		for (int i = 2; i < steps.size() - 1; i++) {
			// for each i
			String cs = getLabel(steps.get(i));
			if (cs.contentEquals("start")) {
				// if it's start, make empty map, set isField to true, is Keyword to false, skip
				// empty edge
				dataTable = new HashMap<String, String>();
				isField = true;
				isKeyword = false;
				i++;
			} else if (cs.contentEquals("end")) {
				// if it's end, convert map to table, set isField to false, isKeyword to true
				convertDataTableToArgument(dataTable, anInteraction.getMessages().getLast());
				isField = false;
				isKeyword = true;
			} else if (isKeyword) {
				// if isKeyword, then make it a step
				if (Validator.validateStepText(cs)) {
					setCurrentMachineAndState(cs);
					convertMessage(anInteraction, cs);
				} else {
					throw new Exception("Step (" + cs + ") is not valid, use Xtext editor to correct it first. ");
				}
				// skip the next element since it's an edge
				if (!getLabel(steps.get(i + 1)).contentEquals("start")) {
					i++;
				}
			} else if (isField) {
				// if isField, then add map element for i and i+1, then i++
				dataTable.put(cs, getLabel(steps.get(i + 1)));
				i++;
			}
		}
	}

	private String getLabel(Object o) {
		if (o instanceof MBTVertex) {
			return ((MBTVertex) o).getLabel();
		} else {
			return ((MBTEdge) o).getLabel();
		}
	}

	@Override
	protected void convertMessage(Interaction anInteraction, Object o) {
		String s = (String) o;
		String messageName = s;
		Class owningClass = (Class) anInteraction.getOwner();
		String secondLayerClassName = getSecondLayerClassName();
		UMLClassWrapper ucwi = (UMLClassWrapper) target.createObject(secondLayerClassName);
		Class nextLayerClass = (Class) ucwi.get();
		ElementImport classImport = createElementImport(owningClass, nextLayerClass);
		owningClass.createOwnedAttribute(nextLayerClass.getName(), nextLayerClass);
		getMessage(anInteraction, nextLayerClass, messageName);
	}

	@Override
	protected String convertObjectName(String fullName) {
		String qualifiedName = fullName.trim();
		qualifiedName = qualifiedName.replace(source.getFileExt(source.FIRST_LAYER), "");
		qualifiedName = qualifiedName.replace(source.getDir(source.FIRST_LAYER).getAbsolutePath(), "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::specs" + qualifiedName;
		return qualifiedName;
	}

	private void convertDataTableToArgument(HashMap<String, String> dataTable, Message theMessage) {
		ValueSpecification vs = createArgument(theMessage, "dataTable", "", true);

		String headerRow = "";
		String valueRow = "";
		for (String columnName : dataTable.keySet()) {
			headerRow += columnName + " |";
			valueRow += dataTable.get(columnName) + " |";
		}
		createAnnotation(vs, "dataTable", String.valueOf(0), headerRow);
		createAnnotation(vs, "dataTable", String.valueOf(1), valueRow);
	}

	private String getSecondLayerClassName() {
		String secondLayerClassName = "";
		secondLayerClassName = convertNextLayerClassName(getFSMName() + getFSMState() + "Steps");
		secondLayerClassName = "pst::" + source.SECOND_LAYER + "::" + Utilities.toLowerCamelCase(getFSMName()) + "::"
				+ secondLayerClassName;
		return secondLayerClassName;
	}

	private Interaction createInteraction(Class layerClass, String pathName) {
		Interaction anInteraction = getInteraction(layerClass, pathName, true);
		return anInteraction;
	}

	private static ArrayList<MBTPath> getAllPaths(MBTGraph<MBTVertex, MBTEdge> g, MBTVertex vertex) {
		ArrayList<MBTPath> vertexPaths = new ArrayList<MBTPath>();
		Set<MBTEdge> edges = g.outgoingEdgesOf(vertex);
		if (edges.isEmpty()) {
			// last node creates empty list and returns it
			vertexPaths.add(new MBTPath());
			return vertexPaths;
		} else {
			for (MBTEdge e : edges) {
				ArrayList<MBTPath> childPaths = getAllPaths(g, g.getEdgeTarget(e));
				ArrayList<MBTPath> edgePaths = getEdgePaths(e);
				combinePaths(g, e, vertex, vertexPaths, childPaths, edgePaths);
			}
			return vertexPaths;
		}
	}

	private static void combinePaths(MBTGraph<MBTVertex, MBTEdge> g, MBTEdge e, MBTVertex vertex,
			ArrayList<MBTPath> vertexPaths, ArrayList<MBTPath> childPaths, ArrayList<MBTPath> edgePaths) {
		for (MBTPath pc : childPaths) {
			if (edgePaths.isEmpty()) {
				pc.getPath().add(0, g.getEdgeTarget(e));
				pc.getPath().add(0, e);
				if (vertex.getLabel().contentEquals(g.getStartVertex().getLabel())) {
					pc.getPath().add(0, vertex);
				}
				vertexPaths.add(pc);
			} else {
				for (MBTPath pe : edgePaths) {

					MBTPath expandedPath = new MBTPath();
					expandedPath.getPath().addAll(0, pc.getPath());
					expandedPath.getPath().add(0, g.getEdgeTarget(e));
					expandedPath.getPath().addAll(0, pe.getPath());
					if (vertex.getLabel().contentEquals(g.getStartVertex().getLabel())) {
						expandedPath.getPath().add(0, vertex);
					}
					vertexPaths.add(expandedPath);
				}
			}
		}
	}

	private static ArrayList<MBTPath> getEdgePaths(MBTEdge e) {
		if (e.getValue() != null) {
			if (e.getValue() instanceof MBTGraph<?, ?>) {
				MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) e.getValue();
				return getAllPaths(g, g.getStartVertex());
			}
		}
		return new ArrayList<MBTPath>();

	}

}
