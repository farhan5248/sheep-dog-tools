package org.farhan.mbt.converter;

import java.io.File;
import java.util.ArrayList;
import java.util.Map.Entry;

import org.asciidoctor.ast.Row;
import org.eclipse.emf.common.util.EMap;
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
import org.farhan.mbt.graph.MBTPathInfo;
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
	protected void selectObjects() throws Exception {
		srcPrj.loadObjects(layer);
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
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
		for (int i = 0; i < c.getOwnedBehaviors().size(); i++) {
			Interaction anInteraction = (Interaction) c.getOwnedBehaviors().get(i);
			if (anInteraction.getEAnnotation("background") != null) {
				// background
			} else if (!anInteraction.getEAnnotations().isEmpty()) {
				// outline examples
			} else {
				MBTPathInfo pi = new MBTPathInfo();
				g.addPath(pi);
				pi.setIndex(String.valueOf(pathCnt));
				pi.setName(anInteraction.getName());
				convertComments(anInteraction, pi);
				convertParametersToTags(anInteraction, pi);
				convertInteractionMessages(anInteraction, pi);
				pathCnt++;
			}
		}
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

	private void convertInteractionMessages(Interaction itr, MBTPathInfo pi) {
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) tgtWrp.get();
		for (int i = 0; i < itr.getMessages().size(); i++) {
			Message m = itr.getMessages().get(i);
			if (i == 0) {
				g.createEdgeWithVertices(g.getStartVertex().getLabel(), getStepName(m), "", pi.getIndex());
			}
			if (i == itr.getMessages().size() - 1) {
				g.createEdgeWithVertices(getStepName(m), g.getEndVertex().getLabel(), "", pi.getIndex());
				convertTableToGraph(m, pi);
			} else {
				Message mNext = itr.getMessages().get(i + 1);
				g.createEdgeWithVertices(getStepName(m), getStepName(mNext), "", pi.getIndex());
				convertTableToGraph(m, pi);
			}
		}
	}

	private String getStepName(Message m) {
		String name = m.getName();
		String keyword = m.getEAnnotation("Step").getDetails().get("Keyword");
		return keyword + " " + name;
	}

	private void convertTableToGraph(Message m, MBTPathInfo pi) {

		ValueSpecification vs = (LiteralString) m.getArgument("dataTable", null);
		if (vs == null) {
			return;
		}
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) tgtPrj
				.createObject(convertObjectName(getStepName(m), tgtPrj.SECOND_LAYER));
		MBTGraph<MBTVertex, MBTEdge> fieldGraph = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
		fieldGraph.setName(getStepName(m));

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
					String newEdgeLabel = row[j];
					fieldGraph.createEdge(lastVertex, newVertex, lastEdgeLabel, String.valueOf(pi.getIndex()));
					lastVertex = newVertex;
					lastEdgeLabel = newEdgeLabel;
				}
			}
		}
		fieldGraph.createEdge(lastVertex, fieldGraph.getEndVertex(), lastEdgeLabel, String.valueOf(pi.getIndex()));

	}

	private void convertParametersToTags(Interaction anInteraction, MBTPathInfo pi) {
		for (Parameter p : anInteraction.getOwnedParameters()) {
			if (pi.getTags().isEmpty()) {
				pi.setTags(p.getName());
			} else {
				pi.setTags(pi.getTags() + "," + p.getName());
			}
		}
	}

	private void convertComments(Interaction anInteraction, MBTPathInfo pi) {
		if (anInteraction.getOwnedComments().size() > 0) {
			String comment = anInteraction.getOwnedComments().get(0).getBody();
			pi.setDescription(comment);
		}
	}
}
