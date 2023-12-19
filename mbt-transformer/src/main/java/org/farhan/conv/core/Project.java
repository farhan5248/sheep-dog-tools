package org.farhan.conv.core;

import java.io.File;
import java.util.ArrayList;

public class Project {

	public static String baseDir;
	public static String umlDir = "target/uml/";
	public static String tags;

	public static String firstLayerPackageName = "specs";
	public static String secondLayerPackageName = "stepdefs";
	public static String thirdLayerPackageName = "objects";

	public static ArrayList<File> firstLayerFiles;
	public static ArrayList<File> secondLayerFiles;
	public static ArrayList<File> thirdLayerFiles;

}
