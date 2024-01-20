package org.farhan.mbt.asciidoctor;

import org.farhan.mbt.graph.MBTVertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.farhan.mbt.asciidoctor.AdocToMBTGraphConverter;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SectionToObjectGraphConverterTest {

	@Test
	/**
	 * 
	 */
	void oneSectionOneVertexOneEdge() {

		MBTGraph<MBTVertex, MBTEdge> g = AdocToMBTGraphConverter.createFromAdoc("oneSectionOneVertexOneEdge.adoc");
		Assertions.assertEquals(
				"Feature Name ([start, end, Step 1], [start ->  -> Step 1=(start,Step 1), Step 1 ->  -> end=(Step 1,end)])",
				g.toString());
	}

	@Test
	/**
	 * 
	 */
	void manySectionOneVertexOneEdge() {

		MBTGraph<MBTVertex, MBTEdge> g = AdocToMBTGraphConverter.createFromAdoc("manySectionOneVertexOneEdge.adoc");
		Assertions.assertEquals("Feature Name " + "([start, end, Step 1], "
				+ "[start ->  -> Step 1=(start,Step 1), Step 1 ->  -> end=(Step 1,end)])", g.toString());
	}

	@Test
	/**
	 * 
	 */
	void oneSectionManyVertexOneEdge() {

		MBTGraph<MBTVertex, MBTEdge> g = AdocToMBTGraphConverter.createFromAdoc("oneSectionManyVertexOneEdge.adoc");
		Assertions.assertEquals("Feature Name " + "([start, end, Step 1, Step 2], "
				+ "[start ->  -> Step 1=(start,Step 1), Step 1 ->  -> Step 2=(Step 1,Step 2), Step 2 ->  -> end=(Step 2,end)])",
				g.toString());
	}

}
