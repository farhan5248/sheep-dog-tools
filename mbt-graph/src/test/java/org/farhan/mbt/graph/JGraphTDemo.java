/*
 * (C) Copyright 2003-2023, by Barak Naveh and Contributors.
 *
 * JGraphT : a free Java graph-theory library
 *
 * See the CONTRIBUTORS.md file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the
 * GNU Lesser General Public License v2.1 or later
 * which is available at
 * http://www.gnu.org/licenses/old-licenses/lgpl-2.1-standalone.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR LGPL-2.1-or-later
 */
package org.farhan.mbt.graph;

import org.jgrapht.*;
import org.jgrapht.graph.*;
import org.jgrapht.nio.*;
import org.jgrapht.nio.dot.*;
import org.jgrapht.traverse.*;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * A simple introduction to using JGraphT.
 *
 * @author Barak Naveh
 */
public final class JGraphTDemo {
	private JGraphTDemo() {
	} // ensure non-instantiability.

	/**
	 * The starting point for the demo.
	 *
	 * @param args ignored.
	 *
	 * @throws URISyntaxException if invalid URI is constructed.
	 * @throws ExportException    if graph cannot be exported.
	 */
	public static void main(String[] args) throws URISyntaxException, ExportException {

		// create a graph based on URI objects
		Graph<URI, DefaultEdge> hrefGraph = createHrefGraph();
		renderHrefGraph(hrefGraph);
		System.out.println();
	}

	private static Graph<URI, DefaultEdge> createHrefGraph() throws URISyntaxException {

		Graph<URI, DefaultEdge> g = new DefaultDirectedGraph<>(DefaultEdge.class);

		URI google = new URI("http://www.google.com");
		URI wikipedia = new URI("http://www.wikipedia.org");
		URI jgrapht = new URI("http://www.jgrapht.org");

		// add the vertices
		g.addVertex(google);
		g.addVertex(wikipedia);
		g.addVertex(jgrapht);

		// add edges to create linking structure
		g.addEdge(jgrapht, wikipedia);
		g.addEdge(google, jgrapht);
		g.addEdge(google, wikipedia);
		g.addEdge(wikipedia, google);

		return g;
	}

	private static void renderHrefGraph(Graph<URI, DefaultEdge> hrefGraph) throws ExportException {

		DOTExporter<URI, DefaultEdge> exporter = new DOTExporter<>(v -> v.getHost().replace('.', '_'));
		exporter.setVertexAttributeProvider((v) -> {
			Map<String, Attribute> map = new LinkedHashMap<>();
			map.put("label", DefaultAttribute.createAttribute(v.toString()));
			return map;
		});
		Writer writer = new StringWriter();
		exporter.exportGraph(hrefGraph, writer);
		System.out.println(writer.toString());
	}

}