package org.farhan.mbt.asciidoctorgraph;

import java.io.File;
import java.util.ArrayList;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;
import org.farhan.mbt.asciidoctor.AsciiDoctorAdocWrapper;
import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToGraphConverter;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTVertex;

public class AdocToGraphConverter extends ToGraphConverter {

	private AsciiDoctorAdocWrapper anAsciiDoctorFile;
	private String layer;

	AsciiDoctorProject source;

	public AdocToGraphConverter(String layer, AsciiDoctorProject source, JGraphTProject target) {
		this.layer = layer;
		this.source = source;
		this.target = target;
	}

	@Override
	protected String getLayer() {
		return layer;
	}

	public static MBTGraph<MBTVertex, MBTEdge> createEmptyGraph(String name) {
		MBTGraph<MBTVertex, MBTEdge> g = new MBTGraph<>(MBTEdge.class);
		g.setName(name);
		g.createStartVertex();
		g.createEndVertex();
		return g;
	}

	private static void createFromSection(MBTGraph<MBTVertex, MBTEdge> g, Section scenario) {

		ArrayList<Section> steps = new ArrayList<Section>();
		for (StructuralNode block : scenario.getBlocks()) {
			if (block instanceof Section) {
				steps.add((Section) block);
			}
		}
		g.createEdgeWithVertices(g.getStartVertex().getLabel(), steps.getFirst().getTitle(), "", null);
		for (int i = 0; i < steps.size() - 1; i++) {
			String source = steps.get(i).getTitle();
			String target = steps.get(i + 1).getTitle();
			MBTEdge inputs = g.createEdgeWithVertices(source, target, scenario.getTitle(), null);
			createFromTable(inputs, steps.get(i));
		}
		MBTEdge inputs = g.createEdgeWithVertices(steps.getLast().getTitle(), g.getEndVertex().getLabel(),
				scenario.getTitle(), null);
		createFromTable(inputs, steps.getLast());
	}

	private static void createFromTable(MBTEdge inputs, Section step) {

		// loop through the blocks which are tables
		for (StructuralNode block : step.getBlocks()) {
			if (block instanceof Table) {
				MBTGraph<MBTVertex, MBTEdge> g = createEmptyGraph(step.getTitle());
				Table table = (Table) block;
				// get vertices from table
				ArrayList<MBTVertex> vertices = new ArrayList<MBTVertex>();
				// TODO validate the table has at least two rows
				for (Row r : table.getHeader()) {
					for (Cell c : r.getCells()) {
						vertices.add(g.createVertex(c.getText()));
					}
				}
				// go through each row and convert to edge
				for (int i = 0; i < table.getBody().size(); i++) {

					g.createEdgeWithInput(g.getStartVertex(), vertices.getFirst(), "", "");

					Row row = table.getBody().get(i);
					for (int j = 0; j < vertices.size() - 1; j++) {
						String label = row.getCells().get(j).getText();
						if (!label.isEmpty()) {
							g.createEdgeWithInput(vertices.get(j), vertices.get(j + 1), label, label);
						}
					}
					// TODO this assumes the last column isn't blank
					g.createEdgeWithInput(vertices.getLast(), g.getEndVertex(), row.getCells().getLast().getText(),
							row.getCells().getLast().getText());
				}
				inputs.setValue(g);
			}
		}
	}

	@Override
	protected void selectObjects() throws Exception {
		// TODO this should be filterLayerFiles since it's removing files
	}

	@Override
	protected void convertObject(ConvertibleObject layerFile) throws Exception {
		anAsciiDoctorFile = (AsciiDoctorAdocWrapper) layerFile;
		JGraphTGraphWrapper gtf = new JGraphTGraphWrapper(new File(convertObjectName(anAsciiDoctorFile.getFile().getName())));
		for (StructuralNode block : anAsciiDoctorFile.theDoc.getBlocks()) {
			if (block instanceof Section) {
				createFromSection(gtf.theGraph, (Section) block);
			}
		}
		// TODO the project should hide object creation and list management
		target.getObjects(target.firstLayerName).add(gtf);
	}

	@Override
	protected String convertObjectName(String fullName) {
		return target.getDir(target.firstLayerName).getAbsolutePath() + File.separator
				+ fullName.replace(source.getFileType(source.firstLayerName), "")
				+ target.getFileType(target.firstLayerName);
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return source.getObjects(layer);
	}

}
