package org.farhan;

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

		MBTGraph<AttributeVertex, AttributeWeightedEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		System.out.println(g.toString());
		Assertions.assertEquals(
				"Set Object as follows " + "([start, end, insurer, group, certificate], "
						+ "[=(start,insurer), 5=(insurer,group), 10=(group,certificate), 15=(certificate,end)])",
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

		MBTGraph<AttributeVertex, AttributeWeightedEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		System.out.println(g.toString());
		Assertions.assertEquals("Set Object as follows " + "([start, end, insurer, group, certificate], "
				+ "[=(start,insurer), 5=(insurer,group), 10=(group,certificate), 15=(certificate,end), 12=(certificate,end)])",
				g.toString());
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

		MBTGraph<AttributeVertex, AttributeWeightedEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		System.out.println(g.toString());
		Assertions.assertEquals("Set Object as follows " + "([start, end, insurer, group, certificate], "
				+ "[=(start,insurer), 5=(insurer,group), 10=(group,certificate), 15=(certificate,end), 4=(insurer,group), 8=(group,certificate), 12=(certificate,end)])",
				g.toString());
	}

}
