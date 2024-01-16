package org.farhan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.google.common.graph.Graphs;

public class SectionToObjectGraphConverterTest {

	@Test
	/**
	 * 
	 */
	void multipleSectionsToGraph() {

		MBTTable objectTable = new MBTTable("Scenario name goes here");
		objectTable.addRow("Step");
		objectTable.addRow("Send home page request");
		objectTable.addRow("Send search request");
		objectTable.addRow("Verify results");

		MBTGraph<AttributeVertex, AttributeWeightedEdge> g = TableToMBTGraphConverter
				.createFromSingleColumn(objectTable);
		System.out.println(g.toString());
		Assertions.assertEquals("Scenario name goes here "
				+ "([start, end, Send home page request, Send search request, Verify results], "
				+ "[=(start,Send home page request), Send search request=(Send search request,Verify results), Verify results=(Verify results,end)])",
				g.toString());
	}

	@Test
	/**
	 * 
	 */
	void singleSectionToGraph() {

		MBTTable objectTable = new MBTTable("Scenario name goes here");
		objectTable.addRow("Step");
		objectTable.addRow("Send home page request");

		MBTGraph<AttributeVertex, AttributeWeightedEdge> g = TableToMBTGraphConverter
				.createFromSingleColumn(objectTable);
		System.out.println(g.toString());
		Assertions.assertEquals(
				"Scenario name goes here " + "([start, end, Send home page request], "
						+ "[=(start,Send home page request), Send home page request=(Send home page request,end)])",
				g.toString());
	}

	@Test
	/**
	 * 
	 */
	void linkObjectGraphToFieldGraph() {

		MBTTable objectTable = new MBTTable("Scenario name goes here");
		objectTable.addRow("Step");
		objectTable.addRow("Send home page request");

		MBTTable fieldTable = new MBTTable("Send home page request");
		fieldTable.addRow("insurer", "group", "certificate");
		fieldTable.addRow("5", "10", "15");

		MBTGraph<AttributeVertex, AttributeWeightedEdge> objectGraph = TableToMBTGraphConverter
				.createFromSingleColumn(objectTable);

		MBTGraph<AttributeVertex, AttributeWeightedEdge> fieldGraph = TableToMBTGraphConverter
				.createFromMultipleColumns(fieldTable);

		AttributeVertex vertice = objectGraph.vertexSet().stream()
				.filter(step -> step.getLabel().contentEquals("Send home page request")).findAny().get();
		vertice.addAttribute("graph", fieldGraph);

		System.out.println(vertice.getAttribute("graph").toString());
		Assertions.assertEquals(
				"Send home page request " + "([start, end, insurer, group, certificate], "
						+ "[=(start,insurer), 5=(insurer,group), 10=(group,certificate), 15=(certificate,end)])",
				vertice.getAttribute("graph").toString());
	}
}
