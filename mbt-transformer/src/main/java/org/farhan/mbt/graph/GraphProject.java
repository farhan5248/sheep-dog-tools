package org.farhan.mbt.graph;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.eclipse.uml2.uml.Model;
import org.farhan.mbt.core.ConvertibleFile;
import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.CucumberFeatureFile;

public class GraphProject extends Project {

	private static ArrayList<ConvertibleFile> firstLayerGraphs;

	public static File getFirstLayerDir() {
		return new File(baseDir + "target/Graphs/");
	}
	
	public static String getFirstLayerFileType() {
		return ".txt";
	}
	
	public static void init() {
		firstLayerGraphs = new ArrayList<ConvertibleFile>();
	}

	public static void readFiles() throws Exception {
		
		ArrayList<File> files = Utilities.recursivelyListFiles(getFirstLayerDir(), getFirstLayerFileType());
		for (File f : files) {
			GraphTextFile gtf = new GraphTextFile(f);
			firstLayerGraphs.add(gtf);
			gtf.read();
		}
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

	public static ArrayList<ConvertibleFile> getFirstLayerGraphs() {
		return firstLayerGraphs;
	}

	public static ArrayList<ConvertibleFile> getFirstLayerFiles() {
		return firstLayerGraphs;
	}

	public static ArrayList<ConvertibleFile> getSecondLayerFiles() {
		return new ArrayList<ConvertibleFile>();
	}

	public static ArrayList<ConvertibleFile> getThirdLayerFiles() {
		return new ArrayList<ConvertibleFile>();
	}

}
