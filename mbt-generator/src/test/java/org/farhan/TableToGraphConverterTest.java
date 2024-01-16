package org.farhan;

import java.util.ArrayList;
import org.jgrapht.graph.DirectedWeightedPseudograph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TableToGraphConverterTest {

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 */
	void singleOutgoingEdgeFromAllVertices() {

		ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
		ArrayList<String> row;
		// headers
		row = new ArrayList<String>();
		row.add("insurer");
		row.add("group");
		row.add("certificate");
		table.add(row);
		// row 1
		row = new ArrayList<String>();
		row.add("5");
		row.add("10");
		row.add("15");
		table.add(row);

		DirectedWeightedPseudograph<AttributeVertex, AttributeWeightedEdge> g = TableToGraphConverter
				.createGraphFromTable(table);
		System.out.println(g.toString());
		Assertions.assertEquals(
				"([start, end, insurer, group, certificate],"
						+ " [=(start,insurer), 5=(insurer,group), 10=(group,certificate), 15=(certificate,end)])",
				g.toString());
	}

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 * |       5 |    10 |          12 |
	 */
	void multipleOutgoingEdgesFromOneVertice() {

		ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
		ArrayList<String> row;
		// headers
		row = new ArrayList<String>();
		row.add("insurer");
		row.add("group");
		row.add("certificate");
		table.add(row);
		// row 1
		row = new ArrayList<String>();
		row.add("5");
		row.add("10");
		row.add("15");
		table.add(row);
		// row 2
		row = new ArrayList<String>();
		row.add("5");
		row.add("10");
		row.add("12");
		table.add(row);

		DirectedWeightedPseudograph<AttributeVertex, AttributeWeightedEdge> g = TableToGraphConverter
				.createGraphFromTable(table);
		System.out.println(g.toString());
		Assertions.assertEquals("([start, end, insurer, group, certificate],"
				+ " [=(start,insurer), 5=(insurer,group), 10=(group,certificate), 15=(certificate,end), 12=(certificate,end)])",
				g.toString());
	}

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 * |       4 |     8 |          12 |
	 */
	void multipleOutgoingEdgesFromAllVertices() {

		ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
		ArrayList<String> row;
		// headers
		row = new ArrayList<String>();
		row.add("insurer");
		row.add("group");
		row.add("certificate");
		table.add(row);
		// row 1
		row = new ArrayList<String>();
		row.add("5");
		row.add("10");
		row.add("15");
		table.add(row);
		// row 2
		row = new ArrayList<String>();
		row.add("4");
		row.add("8");
		row.add("12");
		table.add(row);

		DirectedWeightedPseudograph<AttributeVertex, AttributeWeightedEdge> g = TableToGraphConverter
				.createGraphFromTable(table);
		System.out.println(g.toString());
		Assertions.assertEquals("([start, end, insurer, group, certificate],"
				+ " [=(start,insurer), 5=(insurer,group), 10=(group,certificate), 15=(certificate,end), 4=(insurer,group), 8=(group,certificate), 12=(certificate,end)])",
				g.toString());
	}

}
