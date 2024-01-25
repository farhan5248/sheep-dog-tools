package org.farhan.mbt.graph;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.eclipse.uml2.uml.Model;
import org.farhan.mbt.core.ConvertibleFile;
import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.Utilities;

public class GraphProject extends Project {

	private static ArrayList<GraphTextFile> firstLayerGraphs;

	public static File getFirstLayerDir() {
		return new File(baseDir + "target/Graphs/");
	}
	
	public static void init() {
		firstLayerGraphs = new ArrayList<GraphTextFile>();
	}

	public static Model readFiles() throws IOException {
		return null;
	}

	public static void writeFiles() throws Exception {
		for (ConvertibleFile cf : firstLayerGraphs) {
			try {
				cf.write();
			} catch (Exception e) {
				System.out.println(Utilities.getStackTraceAsString(e));
			}
		}
	}

	public static ArrayList<GraphTextFile> getFirstLayerGraphs() {
		return firstLayerGraphs;
	}

	public static ArrayList<ConvertibleFile> getFirstLayerFiles() {
		// TODO return GraphDotFile
		return null;
	}

	public static ArrayList<ConvertibleFile> getSecondLayerFiles() {
		// TODO Auto-generated method stub
		return null;
	}

	public static ArrayList<ConvertibleFile> getThirdLayerFiles() {
		// TODO Auto-generated method stub
		return null;
	}

}
