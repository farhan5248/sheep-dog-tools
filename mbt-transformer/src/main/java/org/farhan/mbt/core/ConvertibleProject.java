package org.farhan.mbt.core;

import java.io.File;
import java.util.ArrayList;

public abstract class ConvertibleProject {

	// TODO this should be passed in from the mojo so remove this in the future.
	public static String tags = "";
	public static String baseDir = "";

	public static final String FIRST_LAYER = "specs";
	public static final String SECOND_LAYER = "stepdefs";
	public static final String THIRD_LAYER = "objects";

	public abstract File getDir(String layer);

	public abstract String getFileExt(String layer);

	// TODO this should probably be a sorted map so it's easy to find objects
	public abstract ArrayList<ConvertibleObject> getObjects(String layer);

	public abstract void save() throws Exception;

	public abstract ConvertibleObject createObject(String name);
}
