package org.farhan.mbt.graph.conversion;

import org.farhan.mbt.graph.MBTVertex;

import java.util.ArrayList;

import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SectionToObjectGraphConverterTest {

	@Test
	/**
	 * 
	 */
	void oneSectionOneVertexOneEdge() {

		MBTTable objectTable = new MBTTable("Section name goes here");
		objectTable.addRow("Send home page request");

		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromSingleColumn(objectTable);

		System.out.println(g.toString());
		Assertions.assertEquals("Section name goes here " + "([start, end, Send home page request], "
				+ "[start ->  -> Send home page request=(start,Send home page request), Send home page request -> Section name goes here -> end=(Send home page request,end)])",
				g.toString());
	}

	@Test
	/**
	 * 
	 */
	void oneSectionManyVertexOneEdge() {

		MBTTable objectTable = new MBTTable("Section name");
		objectTable.addRow("Step 1");
		objectTable.addRow("Step 2");
		objectTable.addRow("Step 3");

		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromSingleColumn(objectTable);

		System.out.println(g.toString());
		Assertions.assertEquals("Section name " + "([start, end, Step 1, Step 2, Step 3], "
				+ "[start ->  -> Step 1=(start,Step 1), " + "Step 1 -> Section name -> Step 2=(Step 1,Step 2), "
				+ "Step 2 -> Section name -> Step 3=(Step 2,Step 3), " + "Step 3 -> Section name -> end=(Step 3,end)])",
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

		MBTGraph<MBTVertex, MBTEdge> objectGraph = TableToMBTGraphConverter.createFromSingleColumn(objectTable);

		MBTGraph<MBTVertex, MBTEdge> fieldGraph = TableToMBTGraphConverter.createFromMultipleColumns(fieldTable);

		MBTVertex vertice = objectGraph.getVertex("Send home page request");
		vertice.addAttribute("graph", fieldGraph);

		System.out.println(vertice.getAttribute("graph").toString());
		Assertions.assertEquals("Send home page request " + "([start, end, insurer, group, certificate], "
				+ "[start ->  -> insurer=(start,insurer), " + "insurer -> 5 -> group=(insurer,group), "
				+ "group -> 10 -> certificate=(group,certificate), " + "certificate -> 15 -> end=(certificate,end)])",
				vertice.getAttribute("graph").toString());
	}
}
