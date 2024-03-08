package org.farhan.mbt.graphuml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.uml2.uml.Class;
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
import org.farhan.mbt.graph.MBTPathInfo;
import org.farhan.mbt.graph.MBTVertex;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public class GraphToUMLConverter extends ToUMLGherkinConverter {

	private UMLClassWrapper tgtWrp;
	private JGraphTProject srcPrj;

	public GraphToUMLConverter(String layer, JGraphTProject source, UMLProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
	}

	@Override
	protected void selectObjects() throws Exception {

		ArrayList<File> files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.FIRST_LAYER),
				srcPrj.getFileExt(srcPrj.FIRST_LAYER));
		srcPrj.getObjects(srcPrj.FIRST_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
		// TODO this is an instance of selecting from multiple layers, think about how
		// that factors into the multilayer model. Perhaps remove first,second third and
		// make a dynamic list of 1,2,3?
		files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.SECOND_LAYER),
				srcPrj.getFileExt(srcPrj.SECOND_LAYER));
		srcPrj.getObjects(srcPrj.SECOND_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void convertObject(ConvertibleObject theObject) throws Exception {

		JGraphTGraphWrapper jgw = (JGraphTGraphWrapper) theObject;
		String qualifiedName = convertObjectName(jgw.getFile().getAbsolutePath());
		tgtWrp = (UMLClassWrapper) tgtPrj.createObject(qualifiedName);
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) jgw.get();
		createAnnotation((Class) tgtWrp.get(), "title", g.getName());
		for (String t : g.getTag().split(",")) {
			createAnnotation((Class) tgtWrp.get(), "tags", t);
		}
		((Class) tgtWrp.get()).createOwnedComment().setBody(g.getDescription());

	}

	@Override
	protected void convertImports(ConvertibleObject theObject) throws Exception {
	}

	@Override
	protected void convertBehaviours(ConvertibleObject theObject) throws Exception {

		JGraphTGraphWrapper jgw = (JGraphTGraphWrapper) theObject;
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) jgw.get();
		for (MBTPathInfo pi : g.getPathInfo()) {
			ArrayList<Object> p = getPath(g, g.getStartVertex(), pi);
			resetCurrentMachineAndState();
			Interaction anInteraction = createInteraction((Class) tgtWrp.get(), pi.getName());
			anInteraction.createOwnedComment().setBody(pi.getDescription());
			convertTagsToParameters(anInteraction, pi.getTags().split(","));
			convertInteractionMessages(anInteraction, p);
		}
	}

	@Override
	protected void convertInteractionMessages(Interaction anInteraction, List<?> steps) throws Exception {

		boolean isField = false;
		boolean isKeyword = true;
		TreeMap<String, String> dataTable = null;
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
				dataTable = new TreeMap<String, String>();
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
				// add map element for i and i+1, then i++
				dataTable.put(cs, getLabel(steps.get(i + 1)));
				i++;
			}
		}
	}

	@Override
	protected void convertMessage(Interaction anInteraction, Object o) {
		String s = (String) o;
		String messageName = s;
		Class nextLayerClass = createClassImport(getSecondLayerClassName(), anInteraction);
		Message theMessage = getMessage(anInteraction, nextLayerClass, messageName);
		createAnnotation(theMessage, "Step", "Keyword", "Asterisk");
	}

	@Override
	protected String convertObjectName(String fullName) {
		String qualifiedName = fullName.trim();
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(srcPrj.FIRST_LAYER), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(srcPrj.FIRST_LAYER).getAbsolutePath(), "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::specs" + qualifiedName;
		return qualifiedName;
	}

	private void convertTagsToParameters(Interaction anInteraction, String[] tags) {
		for (String t : tags) {
			createParameter(anInteraction, t, "", "in");
		}
	}

	private String getLabel(Object o) {
		if (o instanceof MBTVertex) {
			return ((MBTVertex) o).getLabel();
		} else {
			return ((MBTEdge) o).getLabel();
		}
	}

	private void convertDataTableToArgument(TreeMap<String, String> dataTable, Message theMessage) {
		ValueSpecification vs = createArgument(theMessage, "dataTable", "");

		String row = "";
		for (String key : dataTable.keySet()) {
			if (key.startsWith("0 ")) {
				row += key.replaceFirst("0 ", "") + " |";
			} else {
				break;
			}
		}
		createAnnotation(vs, "dataTable", String.valueOf(0), row);

		int rowCnt = 0;
		row = "";
		for (String key : dataTable.keySet()) {
			if (key.startsWith(String.valueOf(rowCnt))) {
				row += dataTable.get(key) + " |";
			} else {
				createAnnotation(vs, "dataTable", String.valueOf(rowCnt + 1), row);
				rowCnt++;
				row = dataTable.get(key) + " |";
			}
		}
		createAnnotation(vs, "dataTable", String.valueOf(rowCnt + 1), row);
	}

	private String getSecondLayerClassName() {
		String secondLayerClassName = "";
		secondLayerClassName = convertNextLayerClassName(getFSMName() + getFSMState() + "Steps");
		secondLayerClassName = "pst::" + srcPrj.SECOND_LAYER + "::" + Utilities.toLowerCamelCase(getFSMName()) + "::"
				+ secondLayerClassName;
		return secondLayerClassName;
	}

	private ArrayList<Object> getPath(MBTGraph<MBTVertex, MBTEdge> g, MBTVertex vertex, MBTPathInfo pi) {

		ArrayList<Object> path = null;
		Set<MBTEdge> edges = g.outgoingEdgesOf(vertex);
		if (edges.isEmpty()) {
			path = new ArrayList<Object>();
			path.add(vertex);
		} else {
			for (MBTEdge e : edges) {
				if (pi.isCoveredBy(e)) {
					path = getPath(g, g.getEdgeTarget(e), pi);
					MBTGraph<MBTVertex, MBTEdge> edgeGraph = getGraph(g.getEdgeSource(e).getLabel());
					if (edgeGraph != null) {
						ArrayList<Object> edgePath = getPath(edgeGraph, edgeGraph.getStartVertex(), pi);
						path.addAll(0, edgePath);
					}
					path.add(0, e);
					path.add(0, vertex);
				}
			}
		}
		return path;
	}

	private MBTGraph<MBTVertex, MBTEdge> getGraph(String graphName) {
		for (Object o : srcPrj.getObjects(srcPrj.SECOND_LAYER)) {
			MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) ((JGraphTGraphWrapper) o).get();
			if (g.getName().contentEquals(graphName)) {
				return g;
			}
		}
		return null;
	}
}
