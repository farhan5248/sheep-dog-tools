package org.farhan.mbt.asciidoctor;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.Options;
import org.asciidoctor.Asciidoctor.Factory;
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Cell;
import org.asciidoctor.ast.Document;
import org.asciidoctor.ast.Row;
import org.asciidoctor.ast.Section;
import org.asciidoctor.ast.StructuralNode;
import org.asciidoctor.ast.Table;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTTable;
import org.farhan.mbt.graph.MBTVertex;

public class AdocToMBTGraphConverter {

	public static MBTGraph<MBTVertex, MBTEdge> createEmpty(String name) {
		MBTGraph<MBTVertex, MBTEdge> g = new MBTGraph<>(MBTEdge.class);
		g.setName(name);
		g.createStartVertex();
		g.createEndVertex();
		return g;
	}

	public static MBTGraph<MBTVertex, MBTEdge> createFromAdoc(String fileName) {
		Asciidoctor asciidoctor = Factory.create();
		Document adoc = asciidoctor.loadFile(new File(fileName), Options.builder().build());
		MBTGraph<MBTVertex, MBTEdge> g = createEmpty(adoc.getDoctitle());
		for (StructuralNode block : adoc.getBlocks()) {
			if (block instanceof Section) {
				createFromSection(g, (Section) block);
			}
		}
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
				MBTGraph<MBTVertex, MBTEdge> g = createEmpty(step.getTitle());
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

}
