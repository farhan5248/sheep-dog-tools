package org.farhan.mbt.converter;

import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Column;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;
import org.asciidoctor.jruby.extension.internal.JRubyProcessor;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
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

	private JRubyProcessor jrp;
	private JGraphTGraphWrapper srcObj;
	private JGraphTProject srcPrj;
	private AsciiDoctorAdocWrapper tgtObj;

	public GraphToAdocConverter(String layer, JGraphTProject source, AsciiDoctorProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
		this.jrp = new JRubyProcessor();
	}

	@Override
	protected void convertAbstractScenarios(ConvertibleObject object) throws Exception {
		for (MBTPathInfo abstractScenario : srcObj.getAbstractScenarioList()) {
			if (srcObj.isBackground(abstractScenario)) {
				convertBackground(abstractScenario);
			} else if (srcObj.isScenarioOutline(abstractScenario)) {
				convertScenarioOutline(abstractScenario);
			} else {
				convertScenario(abstractScenario);
			}
		}
		JGraphTGraphWrapper adaw = (JGraphTGraphWrapper) object;
		MBTGraph<MBTVertex, MBTEdge> theGraph = (MBTGraph<MBTVertex, MBTEdge>) adaw.get();
		MBTVertex startVertex = theGraph.getStartVertex();
		Document theDoc = (Document) tgtObj.get();
		for (MBTPathInfo pi : theGraph.getPathInfo()) {
			ArrayList<Object> p = getPath(theGraph, startVertex, pi);
			String[] nameParts = pi.getName().split("/");
			Section scenario = createChildSection(theDoc, nameParts[0]);
			scenario.getBlocks().add(jrp.createBlock(scenario, "paragraph", pi.getDescription()));

			TreeMap<String, String> exampleData = getExamplesRow(pi, p, theGraph);
			convertStepList(scenario, p, theGraph, pi, startVertex);
			if (!pi.getParameters().isEmpty()) {
				getExamplesList_createExamplesList(pi, scenario, nameParts[1], exampleData);
			}
			if (!pi.getTags().isEmpty()) {
				scenario.getAttributes().put("tags", pi.getTags());
			}
		}
	}

	@Override
	protected void convertObject(ConvertibleObject object) throws Exception {
		srcObj = (JGraphTGraphWrapper) object;
		tgtObj = (AsciiDoctorAdocWrapper) tgtPrj.createObject(convertObjectName(srcObj.getFile().getAbsolutePath()));
		tgtObj.setFeatureName(srcObj.getFeatureName());
		tgtObj.setFeatureTags(srcObj.getFeatureTags());
		tgtObj.setFeatureDescription(srcObj.getFeatureDescription());
	}

	@Override
	protected String convertObjectName(String documentTitle) {
		return convertObjectName(documentTitle, tgtPrj.FIRST_LAYER);
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void selectObjects() throws Exception {
		ArrayList<File> files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.FIRST_LAYER),
				srcPrj.getFileExt(srcPrj.FIRST_LAYER));
		srcPrj.getObjects(srcPrj.FIRST_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
		files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.SECOND_LAYER),
				srcPrj.getFileExt(srcPrj.SECOND_LAYER));
		srcPrj.getObjects(srcPrj.SECOND_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
	}

	private void getExamplesList_createExamplesList(MBTPathInfo pi, Section scenario, String exampleTitle,
			TreeMap<String, String> exampleData) {
		if (!pi.getParameters().isEmpty()) {

			Section exampleSection = getSection(scenario, exampleTitle);
			if (exampleSection == null) {
				exampleSection = createChildSection(scenario, exampleTitle);
				exampleSection.getAttributes().put("examples", "true");
				Table table = jrp.createTable(exampleSection);
				exampleSection.getBlocks().add(table);
				Row row = jrp.createTableRow(table);
				table.getHeader().add(row);
				int colCnt = 0;
				for (String e : exampleData.keySet()) {
					Column column = jrp.createTableColumn(table, colCnt);
					table.getColumns().add(column);
					Cell cell = jrp.createTableCell(column, e.replaceFirst("0 ", ""));
					row.getCells().add(cell);
					colCnt++;
				}
			}
			for (StructuralNode sn : exampleSection.getBlocks()) {
				if (sn instanceof Table) {
					Table table = (Table) sn;
					Row row = jrp.createTableRow(table);
					table.getBody().add(row);
					int colCnt = 0;
					for (String e : exampleData.keySet()) {
						Cell cell = jrp.createTableCell(table.getColumns().get(colCnt), exampleData.get(e));
						row.getCells().add(cell);
						colCnt++;
					}
				}
			}
		}
	}

	private void convertBackground(MBTPathInfo abstractScenario) {
		Section background = tgtObj.createBackground();
		tgtObj.setBackgroundName(background, srcObj.getBackgroundName(abstractScenario));
		tgtObj.setBackgroundDescription(background, srcObj.getBackgroundDescription(abstractScenario));
		convertStepList(background, srcObj.getStepList(null, abstractScenario), abstractScenario);
		tgtObj.addBackground(background);
	}

	private void convertDataTable(MBTGraph<MBTVertex, MBTEdge> theGraph, Table table, MBTPathInfo abstractScenario) {
		ArrayList<Object> edgePath = getPath(theGraph, theGraph.getStartVertex(), abstractScenario);
		Row row = jrp.createTableRow(table);
		table.getHeader().add(row);
		int colCnt = 0;
		for (Object o : edgePath) {
			if (o instanceof MBTVertex) {
				MBTVertex v = (MBTVertex) o;
				if (v.getLabel().startsWith("0 ")) {
					Column column = jrp.createTableColumn(table, colCnt);
					table.getColumns().add(column);
					Cell cell = jrp.createTableCell(column, v.getLabel().replaceFirst("0 ", ""));
					row.getCells().add(cell);
					colCnt++;
				} else if (v.getLabel().startsWith("1 ")) {
					break;
				} else {
					continue;
				}
			}
		}
		colCnt = table.getHeader().getFirst().getCells().size();
		for (Object o : edgePath) {
			if (o instanceof MBTVertex) {
				MBTVertex v = (MBTVertex) o;
				if (v.equals(theGraph.getStartVertex())) {
					continue;
				}
				if (colCnt < table.getHeader().getFirst().getCells().size()) {
					colCnt++;
				} else {
					colCnt = 0;
					row = jrp.createTableRow(table);
					table.getBody().add(row);
				}
			} else {
				MBTEdge e = (MBTEdge) o;
				if (theGraph.getEdgeSource(e).equals(theGraph.getStartVertex())) {
					continue;
				}
				Cell cell = jrp.createTableCell(table.getColumns().get(colCnt), e.getLabel());
				row.getCells().add(cell);
			}
		}
	}

	private void convertDataTable(Section abstractScenario, MBTEdge step, MBTPathInfo abstractScenarioSrc) {
		JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(step), srcPrj.SECOND_LAYER);
		ArrayList<ArrayList<String>> dataTableCellList = stepDefObj.getDataTable(step, abstractScenarioSrc);
		tgtObj.createDataTable(abstractScenario, dataTableCellList);
	}

	private void convertDocString(Section abstractScenario, MBTEdge step) {
		JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(step), srcPrj.SECOND_LAYER);
		String content = srcPrj.getResource(stepDefObj.getDocString());
		tgtObj.createDocString(abstractScenario, content);
	}

	private String convertObjectName(String fileName, String layer) {
		// TODO move to superclass
		String qualifiedName = fileName.replace(",", "");
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(layer), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(layer).getAbsolutePath(), "");
		qualifiedName = tgtPrj.getDir(layer) + qualifiedName + tgtPrj.getFileExt(layer);
		return qualifiedName;
	}

	private void convertScenario(MBTPathInfo abstractScenario) {
		// TODO Auto-generated method stub

	}

	private void convertScenarioOutline(MBTPathInfo abstractScenario) {
		// TODO Auto-generated method stub

	}

	private void convertStep(Section abstractScenario, MBTEdge step) {
		tgtObj.createStep(abstractScenario, srcObj.getStep(step));
	}

	private void convertStepList(Section abstractScenario, ArrayList<MBTEdge> stepList,
			MBTPathInfo abstractScenarioSrc) {
		for (MBTEdge step : stepList) {
			convertStep(abstractScenario, step);
			// TODO remove this stepDefObj creation after putting the docstring/datatable
			// label on the edge. Then that way the srcObj alone can tell if there's a
			// docstring or data table
			JGraphTGraphWrapper stepDefObj = srcPrj.getObject(srcObj.getStep(step), srcPrj.SECOND_LAYER);
			if (stepDefObj != null) {
				if (stepDefObj.hasDocString(step)) {
					convertDocString(abstractScenario, step);
				} else if (stepDefObj.hasDataTable(step)) {
					// TODO pass in the path info instead of the examplesRow
					convertDataTable(abstractScenario, step, abstractScenarioSrc);
				}
			}
		}
	}

	private void convertStepList(Section tgtScenario, ArrayList<Object> stepList, MBTGraph<MBTVertex, MBTEdge> theGraph,
			MBTPathInfo srcScenario, MBTVertex startVertex) {
		Section step;
		for (Object o : stepList) {
			if (o instanceof MBTVertex) {

			} else {
				MBTEdge e = (MBTEdge) o;
				MBTGraph<MBTVertex, MBTEdge> edgeGraph = getGraphOld(theGraph.getEdgeSource(e).getLabel());
				if (edgeGraph != null) {
					step = (Section) tgtScenario.getBlocks().getLast();
					if (edgeGraph.getVertex("Content") == null) {
						Table table = jrp.createTable(step);
						step.getBlocks().add(table);
						convertDataTable(edgeGraph, table, srcScenario);
					}
				}
			}
		}
	}

	private Section createChildSection(StructuralNode owningSection, String name) {
		Section ownedSection = jrp.createSection(owningSection);
		owningSection.getBlocks().add(ownedSection);
		ownedSection.setTitle(name);
		return ownedSection;
	}

	private TreeMap<String, String> getExamplesRow(MBTPathInfo pi, ArrayList<Object> path,
			MBTGraph<MBTVertex, MBTEdge> g) {
		TreeMap<String, String> exampleData = new TreeMap<String, String>();
		if (pi.getParameters().isEmpty()) {
			return exampleData;
		}
		for (String p : pi.getParameters().split(",")) {
			exampleData.put(p, "");
		}
		for (Object o : path) {
			if (o instanceof MBTEdge) {
				MBTEdge e = (MBTEdge) o;
				MBTGraph<MBTVertex, MBTEdge> edgeGraph = getGraphOld(g.getEdgeSource(e).getLabel());
				if (edgeGraph != null) {
					ArrayList<Object> edgePath = getPath(edgeGraph, edgeGraph.getStartVertex(), pi);
					for (int i = 2; i < edgePath.size() - 1; i += 2) {
						String cs = getLabel(edgePath.get(i));
						// Strip out the row number
						String key = cs.replaceFirst("[0-9]+ ", "");
						if (exampleData.get(key) != null) {
							// if the field name matches something then replace the value
							exampleData.put(key, getLabel(edgePath.get(i + 1)));
							((MBTEdge) edgePath.get(i + 1)).setLabel("{" + key + "}");
						}
					}
				}
			}
		}
		return exampleData;

	}

	private MBTGraph<MBTVertex, MBTEdge> getGraphOld(String graphName) {
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
					path.add(0, e);
					path.add(0, vertex);
				}
			}
			// handle end of background path. In the future autodetect the background to
			// avoid this
			if (path == null) {
				path = new ArrayList<Object>();
				path.add(vertex);
			}
		}
		return path;
	}

	private Section getSection(Section scenario, String exampleTitle) {
		for (StructuralNode sn : scenario.getBlocks()) {
			if (sn instanceof Section) {
				Section s = (Section) sn;
				if (s.getTitle().contentEquals(exampleTitle)) {
					return (Section) s;
				}
			}
		}
		return null;
	}
}
