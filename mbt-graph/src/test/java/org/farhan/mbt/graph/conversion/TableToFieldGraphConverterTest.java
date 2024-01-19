package org.farhan.mbt.graph.conversion;

import org.farhan.mbt.graph.MBTVertex;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TableToFieldGraphConverterTest {

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 */
	void singleOutgoingEdgeFromAllVertices() {

		MBTTable table = new MBTTable("Set Object as follows");
		table.addRow("insurer", "group", "certificate");
		table.addRow("5", "10", "15");

		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		System.out.println(g.toString());
		Assertions.assertEquals("Set Object as follows " + "([start, end, insurer, group, certificate], "
				+ "[start ->  -> insurer=(start,insurer), " + "insurer -> 5 -> group=(insurer,group), "
				+ "group -> 10 -> certificate=(group,certificate), " + "certificate -> 15 -> end=(certificate,end)])",
				g.toString());
	}

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 * |       5 |    10 |          12 |
	 */
	void multipleOutgoingEdgesFromOneVertice() {

		MBTTable table = new MBTTable("Set Object as follows");
		table.addRow("insurer", "group", "certificate");
		table.addRow("5", "10", "15");
		table.addRow("5", "10", "12");

		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		System.out.println(g.toString());
		Assertions.assertEquals("Set Object as follows " + "([start, end, insurer, group, certificate], "
				+ "[start ->  -> insurer=(start,insurer), " + "insurer -> 5 -> group=(insurer,group), "
				+ "group -> 10 -> certificate=(group,certificate), " + "certificate -> 15 -> end=(certificate,end), "
				+ "certificate -> 12 -> end=(certificate,end)])", g.toString());
	}

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 * |       4 |     8 |          12 |
	 */
	void multipleOutgoingEdgesFromAllVertices() {

		MBTTable table = new MBTTable("Set Object as follows");
		table.addRow("insurer", "group", "certificate");
		table.addRow("5", "10", "15");
		table.addRow("4", "8", "12");

		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		System.out.println(g.toString());
		Assertions.assertEquals("Set Object as follows " + "([start, end, insurer, group, certificate], "
				+ "[start ->  -> insurer=(start,insurer), " + "insurer -> 5 -> group=(insurer,group), "
				+ "group -> 10 -> certificate=(group,certificate), " + "certificate -> 15 -> end=(certificate,end), "
				+ "insurer -> 4 -> group=(insurer,group), " + "group -> 8 -> certificate=(group,certificate), "
				+ "certificate -> 12 -> end=(certificate,end)])", g.toString());
	}

}
