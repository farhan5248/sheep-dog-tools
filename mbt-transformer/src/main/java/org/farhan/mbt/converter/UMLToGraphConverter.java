package org.farhan.mbt.converter;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToGraphConverter;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTVertex;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public class UMLToGraphConverter extends ToGraphConverter {

	// TODO instead of storing the wrappers, just store what they wrap? Also is
	// there any value in keeping them? Maybe move all file read/write to the
	// project?
	private JGraphTGraphWrapper tgtWrp;
	private UMLProject srcPrj;
	private int pathCnt;

	public UMLToGraphConverter(String layer, UMLProject source, JGraphTProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
		pathCnt = 0;
	}

	@Override
	protected void selectSourceObjects() throws Exception {
		srcPrj.loadObjects(layer);
	}

	@Override
	protected ArrayList<ConvertibleObject> getSourceObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void convertObject(ConvertibleObject theObject) throws Exception {

		UMLClassWrapper ucw = (UMLClassWrapper) theObject;
		Class c = (Class) ucw.get();
		tgtWrp = (JGraphTGraphWrapper) tgtPrj.createObject(convertObjectName(c.getQualifiedName()));
		convertClassAnnotationsToTags(c);
		convertComments(c);
	}

	@Override
	protected String convertObjectName(String fullName) {
		String pathName = fullName;
		pathName = pathName.replace("pst::" + tgtPrj.FIRST_LAYER, tgtPrj.getDir(tgtPrj.FIRST_LAYER).getAbsolutePath());
		pathName = pathName.replace("::", File.separator);
		pathName = pathName + tgtPrj.getFileExt(tgtPrj.FIRST_LAYER);
		return pathName;
	}

	@Override
	protected void convertElements(ConvertibleObject object) throws Exception {
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) tgtWrp.get();
		UMLClassWrapper ucw = (UMLClassWrapper) object;
		Class c = (Class) ucw.get();
		MBTVertex startVertex = g.getStartVertex();
		for (Behavior b : c.getOwnedBehaviors()) {
			Interaction anInteraction = (Interaction) b;
			EList<Message> steps = anInteraction.getMessages();
			EList<EAnnotation> examples = anInteraction.getEAnnotations();
			String tags = convertParametersToTags(anInteraction);
			String description = convertCommentsToDescription(anInteraction);
			if (anInteraction.getEAnnotations().isEmpty() || anInteraction.getEAnnotation("background") != null) {
				convertInteractionMessagesToPath(g, startVertex, steps, anInteraction.getName(), tags, description,
						new HashMap<String, String>());
				if (anInteraction.getEAnnotation("background") != null) {
					// backgrounds don't have tags so use that field for now
					g.getPathInfo().getFirst().setTags("background");
					// the only edge going into the end vertex is the last background element
					MBTEdge edge = null;
					for (MBTEdge e : g.incomingEdgesOf(g.getEndVertex())) {
						startVertex = g.getEdgeSource(e);
						edge = e;
					}
					g.removeEdge(edge);
				}
			} else {
				for (EAnnotation example : examples) {
					ArrayList<HashMap<String, String>> replacements = convertExamplesToMaps(example);
					for (int i = 0; i < replacements.size(); i++) {
						convertInteractionMessagesToPath(g, startVertex, steps,
								anInteraction.getName() + "/" + example.getSource() + "/" + String.valueOf(i), tags,
								description, replacements.get(i));

					}
				}
			}
		}
	}

	private ArrayList<HashMap<String, String>> convertExamplesToMaps(EAnnotation examples) {
		ArrayList<HashMap<String, String>> replacements = new ArrayList<HashMap<String, String>>();
		ArrayList<String> paramNames = new ArrayList<String>();
		for (String cell : examples.getDetails().getFirst().getValue().split("\\|")) {
			paramNames.add(cell);
		}
		int rowCnt = examples.getDetails().size();
		for (int i = 1; i < rowCnt; i++) {
			String[] row = examples.getDetails().get(i).getValue().split("\\|");
			HashMap<String, String> map = new HashMap<String, String>();
			int cellCnt = row.length;
			for (int j = 0; j < cellCnt; j++) {
				map.put(paramNames.get(j), row[j]);
			}
			replacements.add(map);
		}
		return replacements;
	}

	private void convertClassAnnotationsToTags(Class c) {

		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) tgtWrp.get();
		// The first is the title
		g.setName(c.getEAnnotations().getFirst().getDetails().get(0).getKey());

		// the last is the tags
		if (c.getEAnnotations().size() == 2) {
			for (Entry<String, String> t : c.getEAnnotations().getLast().getDetails()) {
				if (g.getTags().isEmpty()) {
					g.setTags(t.getKey());
				} else {
					g.setTags(g.getTags() + "," + t.getKey());
				}
			}
		}
	}

	private void convertComments(Class aClass) {
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) tgtWrp.get();
		if (aClass.getOwnedComments().size() > 0) {
			String comment = aClass.getOwnedComments().get(0).getBody();
			g.setDescription(comment);
		}
	}

	private String convertObjectName(String stepName, String layer) {
		return tgtPrj.getDir(layer).getAbsolutePath() + File.separator + stepName.replace(",", "")
				+ tgtPrj.getFileExt(layer);
	}

	private void convertInteractionMessagesToPath(MBTGraph<MBTVertex, MBTEdge> g, MBTVertex startVertex,
			EList<Message> steps, String title, String tags, String description, HashMap<String, String> replacements) {

		g.addPath(String.valueOf(pathCnt), title, tags, description, replacements.keySet());
		for (int i = 0; i < steps.size(); i++) {
			Message m = steps.get(i);
			if (i == 0) {
				g.createEdgeWithVertices(startVertex.getLabel(), getStepName(m), "", String.valueOf(pathCnt));
			}
			if (i == steps.size() - 1) {
				g.createEdgeWithVertices(getStepName(m), g.getEndVertex().getLabel(), "", String.valueOf(pathCnt));
			} else {
				Message mNext = steps.get(i + 1);
				g.createEdgeWithVertices(getStepName(m), getStepName(mNext), "", String.valueOf(pathCnt));
			}
			convertTableToGraph(m, title, replacements);
			convertDocStringToGraph(m, title);
		}
		pathCnt++;
	}

	private String getStepName(Message m) {
		String name = m.getName();
		String keyword = m.getEAnnotation("Step").getDetails().get("Keyword");
		return keyword + " " + name;
	}

	private void convertDocStringToGraph(Message m, String title) {
		ValueSpecification vs = (LiteralString) m.getArgument("docString", null);
		if (vs == null) {
			return;
		}
		EMap<String, String> docString = vs.getEAnnotation("docString").getDetails();
		String content = "";
		for (String lineNo : docString.keySet()) {
			content += "\n" + docString.get(lineNo);
		}
		content = content.replaceFirst("\n", "");
		String fileName = tgtPrj.createResource(getStepName(m), content);

		MBTGraph<MBTVertex, MBTEdge> g = createGraph(getStepName(m));
		g.createEdge(g.getStartVertex(), g.createVertex("Content"), "", String.valueOf(pathCnt));
		g.createEdge(g.getVertex("Content"), g.getEndVertex(), fileName, String.valueOf(pathCnt));
	}

	private MBTGraph<MBTVertex, MBTEdge> createGraph(String title) {
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) tgtPrj
				.createObject(convertObjectName(title, tgtPrj.SECOND_LAYER));
		MBTGraph<MBTVertex, MBTEdge> fieldGraph = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
		fieldGraph.setName(title);
		return fieldGraph;
	}

	private void convertTableToGraph(Message m, String scenarioTitle, HashMap<String, String> replacements) {

		ValueSpecification vs = (LiteralString) m.getArgument("dataTable", null);
		if (vs == null) {
			return;
		}
		MBTGraph<MBTVertex, MBTEdge> fieldGraph = createGraph(getStepName(m));
		EMap<String, String> table = vs.getEAnnotation("dataTable").getDetails();
		MBTVertex lastVertex = fieldGraph.getStartVertex();
		String lastEdgeLabel = "";
		int rowCnt = table.keySet().size();

		String[] header = null;
		for (int i = 0; i < rowCnt; i++) {
			String[] row = table.get(i).getValue().split(" \\|");
			if (i == 0) {
				header = row;
			} else {
				int cellCnt = row.length;
				for (int j = 0; j < cellCnt; j++) {
					MBTVertex newVertex = fieldGraph.createVertex(i - 1 + " " + header[j]);
					String newEdgeLabel = replaceWithExampleData(replacements, row[j]);
					fieldGraph.createEdge(lastVertex, newVertex, lastEdgeLabel, String.valueOf(pathCnt));
					lastVertex = newVertex;
					lastEdgeLabel = newEdgeLabel;
				}
			}
		}
		fieldGraph.createEdge(lastVertex, fieldGraph.getEndVertex(), lastEdgeLabel, String.valueOf(pathCnt));

	}

	private String replaceWithExampleData(HashMap<String, String> replacements, String text) {
		if (text.startsWith("<")) {
			for (String key : replacements.keySet()) {
				if (text.contentEquals("<" + key + ">")) {
					return replacements.get(key);
				}
			}
		}
		return text;
	}

	private String convertParametersToTags(Interaction anInteraction) {
		String tags = "";
		for (Parameter p : anInteraction.getOwnedParameters()) {
			tags += "," + p.getName();
		}
		return tags.replaceFirst(",", "");
	}

	private String convertCommentsToDescription(Interaction anInteraction) {
		if (anInteraction.getOwnedComments().size() > 0) {
			return anInteraction.getOwnedComments().get(0).getBody();
		}
		return "";
	}
}
