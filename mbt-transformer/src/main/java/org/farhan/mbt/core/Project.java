package org.farhan.mbt.core;

import java.io.File;

public class Project {

	// TODO make getters and setters
	public static String tags;
	public static String baseDir;
	private static String umlDir = "target/uml/";

	public static String firstLayerPackageName = "specs";
	public static String secondLayerPackageName = "stepdefs";
	public static String thirdLayerPackageName = "objects";
	public static String fourthLayerPackageName = "common";

	public static File getUmlDir() {
		return new File(baseDir + umlDir);
	}

}
