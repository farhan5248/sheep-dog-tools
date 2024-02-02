package org.farhan.mbt.graph;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.eclipse.uml2.uml.Model;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.CucumberFeatureFile;

public class GraphProject extends Project {

	private static ArrayList<ConvertibleObject> firstLayerGraphs;

	public static File getFirstLayerDir() {
		return new File(baseDir + "target/Graphs/");
	}
	
	public static String getFirstLayerFileType() {
		return ".txt";
	}
	
	public static void init() {
		firstLayerGraphs = new ArrayList<ConvertibleObject>();
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
		for (ConvertibleObject cf : firstLayerGraphs) {
			try {
				cf.write();
			} catch (Exception e) {
				System.out.println(Utilities.getStackTraceAsString(e));
			}
		}
	}

	public static ArrayList<ConvertibleObject> getFirstLayerGraphs() {
		return firstLayerGraphs;
	}

	public static ArrayList<ConvertibleObject> getFirstLayerFiles() {
		return firstLayerGraphs;
	}

	public static ArrayList<ConvertibleObject> getSecondLayerFiles() {
		return new ArrayList<ConvertibleObject>();
	}

	public static ArrayList<ConvertibleObject> getThirdLayerFiles() {
		return new ArrayList<ConvertibleObject>();
	}

}
