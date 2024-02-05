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

	private void createFromSection(MBTGraph<MBTVertex, MBTEdge> g, Section scenario) {

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

	private void createFromTable(MBTEdge inputs, Section step) {

		// loop through the blocks which are tables
		for (StructuralNode block : step.getBlocks()) {
			if (block instanceof Table) {
				// TODO this inner graph will have an associate file, so instead of saving the
				// graph in one massive file, make it a pointer to the actual file for now
				JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) target.createObject(convertObjectName(step.getTitle()));
				Table table = (Table) block;
				// get vertices from table
				ArrayList<MBTVertex> vertices = new ArrayList<MBTVertex>();
				// TODO validate the table has at least two rows
				for (Row r : table.getHeader()) {
					for (Cell c : r.getCells()) {
						vertices.add(gtf.theGraph.createVertex(c.getText()));
					}
				}
				// go through each row and convert to edge
				for (int i = 0; i < table.getBody().size(); i++) {

					gtf.theGraph.createEdgeWithInput(gtf.theGraph.getStartVertex(), vertices.getFirst(), "", "");

					Row row = table.getBody().get(i);
					for (int j = 0; j < vertices.size() - 1; j++) {
						String label = row.getCells().get(j).getText();
						if (!label.isEmpty()) {
							gtf.theGraph.createEdgeWithInput(vertices.get(j), vertices.get(j + 1), label, label);
						}
					}
					// TODO this assumes the last column isn't blank
					gtf.theGraph.createEdgeWithInput(vertices.getLast(), gtf.theGraph.getEndVertex(),
							row.getCells().getLast().getText(), row.getCells().getLast().getText());
				}
				inputs.setValue(gtf.theGraph);
			}
		}
	}

	@Override
	protected void selectObjects() throws Exception {
	}

	@Override
	protected void convertObject(ConvertibleObject layerFile) throws Exception {
		anAsciiDoctorFile = (AsciiDoctorAdocWrapper) layerFile;
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) target
				.createObject(convertObjectName(anAsciiDoctorFile.getFile().getName()));
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
