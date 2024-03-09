package org.farhan.mbt.asciidoctorgraph;

import java.io.File;
import java.util.ArrayList;
import java.util.Set;

import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.Table;
import org.asciidoctor.jruby.extension.internal.JRubyProcessor;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.List;
import org.asciidoctor.ast.ListItem;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToDocumentConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTPathInfo;
import org.farhan.mbt.graph.MBTVertex;

public class GraphToAdocConverter extends ToDocumentConverter {

	private AsciiDoctorAdocWrapper tgtWrp;
	private JGraphTProject srcPrj;
	private JRubyProcessor jrp;
	private int pathCnt;

	public GraphToAdocConverter(String layer, JGraphTProject source, AsciiDoctorProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
		this.pathCnt = -1;
		this.jrp = new JRubyProcessor();
	}

	@Override
	protected void selectObjects() throws Exception {
		// TODO duplicate method from GraphToUMLConverter
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
	protected void convertObject(ConvertibleObject object) throws Exception {
		JGraphTGraphWrapper adaw = (JGraphTGraphWrapper) object;
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) adaw.get();
		tgtWrp = (AsciiDoctorAdocWrapper) tgtPrj.createObject(convertObjectName(g.getName()));
		Document theDoc = (Document) tgtWrp.get();
		theDoc.setTitle(g.getName());
		theDoc.getAttributes().put("tags", g.getTags());
		Block block = jrp.createBlock(theDoc, "paragraph", g.getDescription());
		theDoc.getBlocks().add(block);
	}

	@Override
	protected String convertObjectName(String documentTitle) {
		return convertObjectName(documentTitle, tgtPrj.FIRST_LAYER);
	}

	private String convertObjectName(String documentTitle, String layer) {
		return tgtPrj.getDir(layer).getAbsolutePath() + File.separator + documentTitle.replace(",", "")
				+ tgtPrj.getFileExt(layer);
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void convertElements(ConvertibleObject object) throws Exception {
		JGraphTGraphWrapper adaw = (JGraphTGraphWrapper) object;
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) adaw.get();
		Document theDoc = (Document) tgtWrp.get();
		for (MBTPathInfo pi : g.getPathInfo()) {

			Section section = jrp.createSection(theDoc);
			theDoc.getBlocks().add(section);
			section.setTitle(pi.getName());
			section.getAttributes().put("tags", pi.getTags());
			Block block = jrp.createBlock(section, "paragraph", pi.getDescription());
			section.getBlocks().add(block);

			List list = jrp.createList(section, "olist");
			section.getBlocks().add(list);
			ArrayList<Object> p = getPath(g, g.getStartVertex(), pi);
			for (Object o : p) {
				if (o instanceof MBTVertex) {
					MBTVertex v = (MBTVertex) o;
					if (!v.getLabel().contentEquals(g.getStartVertex().getLabel())
							&& !v.getLabel().contentEquals(g.getEndVertex().getLabel())) {
						ListItem listItem = jrp.createListItem(list, getLabel(o));
						list.getItems().add(listItem);
					}
				} else {
					MBTEdge e = (MBTEdge) o;
					MBTGraph<MBTVertex, MBTEdge> edgeGraph = getGraph(g.getEdgeSource(e).getLabel());
					if (edgeGraph != null) {
						ArrayList<Object> edgePath = getPath(edgeGraph, edgeGraph.getStartVertex(), pi);
						ListItem listItem = (ListItem) list.getItems().getLast();
						Table table = jrp.createTable(listItem);
						listItem.getBlocks().add(table);
						convertPathToTable(edgePath, table);
					}
				}
			}
		}
	}

	private void convertPathToTable(ArrayList<Object> edgePath, Table table) {
		// TODO Auto-generated method stub
		
	}

	private ArrayList<Object> getPath(MBTGraph<MBTVertex, MBTEdge> g, MBTVertex vertex, MBTPathInfo pi) {

		// TODO this is a duplicate method, instead of removing the Wrapper classes,
		// perhaps all the UML/Graph stuff should go in there and there should be basic
		// methods like create feature, scenario, step that manages the Class/Graph/Java
		// code? I'll try that out in April.

		ArrayList<Object> path = null;
		Set<MBTEdge> edges = g.outgoingEdgesOf(vertex);
		if (edges.isEmpty()) {
			path = new ArrayList<Object>();
			path.add(vertex);
		} else {
			for (MBTEdge e : edges) {
				if (pi.isCoveredBy(e)) {
					path = getPath(g, g.getEdgeTarget(e), pi);
					path.add(0, e);
					path.add(0, vertex);
				}
			}
		}
		return path;
	}

	private MBTGraph<MBTVertex, MBTEdge> getGraph(String graphName) {
		// TODO This is a duplicate method like above
		for (Object o : srcPrj.getObjects(srcPrj.SECOND_LAYER)) {
			MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) ((JGraphTGraphWrapper) o).get();
			if (g.getName().contentEquals(graphName)) {
				return g;
			}
		}
		return null;
	}

	private String getLabel(Object o) {
		// TODO also a duplicate, maybe make a super type for label, name, tag etc?
		if (o instanceof MBTVertex) {
			return ((MBTVertex) o).getLabel();
		} else {
			return ((MBTEdge) o).getLabel();
		}
	}
}
