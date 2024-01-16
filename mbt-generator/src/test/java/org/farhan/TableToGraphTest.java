package org.farhan;

import java.util.ArrayList;
import java.util.Set;
import org.jgrapht.graph.DirectedWeightedPseudograph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TableToGraphTest {

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

		ArrayList<AttributePath> paths = PathGenerator.getAllPaths(g, GraphHelper.getStartVertice(g));
		for (AttributePath p : paths) {
			System.out.println(p.toString());
		}

		Assertions.assertEquals(1, paths.size());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 10 -> certificate -> 15 -> end",
				paths.getFirst().toString());
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

		ArrayList<AttributePath> paths = PathGenerator.getAllPaths(g, GraphHelper.getStartVertice(g));
		for (AttributePath p : paths) {
			System.out.println(p.toString());
		}
		Assertions.assertEquals(2, paths.size());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 10 -> certificate -> 15 -> end",
				paths.getFirst().toString());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 10 -> certificate -> 12 -> end",
				paths.getLast().toString());
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

		ArrayList<AttributePath> paths = PathGenerator.getAllPaths(g, GraphHelper.getStartVertice(g));
		for (AttributePath p : paths) {
			System.out.println(p.toString());
		}
		Assertions.assertEquals(8, paths.size());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 10 -> certificate -> 15 -> end",
				paths.getFirst().toString());
		Assertions.assertEquals("start ->  -> insurer -> 4 -> group -> 8 -> certificate -> 12 -> end",
				paths.getLast().toString());
	}

}
