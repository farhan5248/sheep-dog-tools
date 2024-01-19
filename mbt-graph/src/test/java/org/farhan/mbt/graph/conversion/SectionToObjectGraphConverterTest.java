package org.farhan.mbt.graph.conversion;

import org.farhan.mbt.graph.MBTVertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

		ArrayList<String> list = new ArrayList<String>();
		list.add("Step 1");
		Map<String, ArrayList<String>> lists = new HashMap<String, ArrayList<String>>();
		lists.put("Section name", list);
		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromMultiList(lists, "Feature Name");
		System.out.println(g.toString());

		Assertions.assertEquals(
				"Feature Name ([start, end, Step 1], [start ->  -> Step 1=(start,Step 1), Step 1 ->  -> end=(Step 1,end)])",
				g.toString());
	}

	@Test
	/**
	 * 
	 */
	void manySectionOneVertexOneEdge() {

		Map<String, ArrayList<String>> lists = new HashMap<String, ArrayList<String>>();
		ArrayList<String> scenario1 = new ArrayList<String>();
		scenario1.add("Step 1");
		lists.put("Scenario 1", scenario1);
		ArrayList<String> scenario2 = new ArrayList<String>();
		scenario2.add("Step 1");
		lists.put("Scenario 2", scenario2);
		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromMultiList(lists, "Feature Name");
		System.out.println(g.toString());

		Assertions.assertEquals("Feature Name " + "([start, end, Step 1], "
				+ "[start ->  -> Step 1=(start,Step 1), Step 1 ->  -> end=(Step 1,end)])", g.toString());
	}

	@Test
	/**
	 * 
	 */
	void oneSectionManyVertexOneEdge() {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Step 1");
		list.add("Step 2");
		Map<String, ArrayList<String>> lists = new HashMap<String, ArrayList<String>>();
		lists.put("Scenario name", list);
		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromMultiList(lists, "Feature Name");
		System.out.println(g.toString());

		Assertions.assertEquals("Feature Name " + "([start, end, Step 1, Step 2], "
				+ "[start ->  -> Step 1=(start,Step 1), Step 1 ->  -> Step 2=(Step 1,Step 2), Step 2 ->  -> end=(Step 2,end)])",
				g.toString());
	}

	@Test
	/**
	 * TODO 
	 */
	void linkObjectGraphToFieldGraph() {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Step 1");
		Map<String, ArrayList<String>> lists = new HashMap<String, ArrayList<String>>();
		lists.put("Scenario name", list);

		MBTTable fieldTable = new MBTTable("Step 1");
		fieldTable.addRow("ins", "grp", "crt");
		fieldTable.addRow("5", "10", "15");

		MBTGraph<MBTVertex, MBTEdge> objectGraph = TableToMBTGraphConverter.createFromMultiList(lists, "Feature Name");
		MBTGraph<MBTVertex, MBTEdge> fieldGraph = TableToMBTGraphConverter.createFromMultipleColumns(fieldTable);
		MBTEdge edge = (MBTEdge) objectGraph.outgoingEdgesOf(objectGraph.getVertex("Step 1")).toArray()[0];
		edge.setValue(fieldGraph);

		System.out.println(edge.getValue().toString());
		Assertions.assertEquals("Step 1 " + "([start, end, ins, grp, crt], "
				+ "[start ->  -> ins=(start,ins), ins -> 5 -> grp=(ins,grp), grp -> 10 -> crt=(grp,crt), crt -> 15 -> end=(crt,end)])",
				edge.getValue().toString());
	}
}
