package org.farhan.conv.core;

import java.io.File;
import java.util.ArrayList;

public class Project {

	public static String baseDir;
	public static String umlDir = "target/uml/";
	public static String tags;

	public static String firstLayerPackageName = "interactions";
	public static String secondLayerPackageName = "subsystems";
	public static String thirdLayerPackageName = "components";

	public static ArrayList<File> firstLayerFiles;
	public static ArrayList<File> secondLayerFiles;
	public static ArrayList<File> thirdLayerFiles;

}
