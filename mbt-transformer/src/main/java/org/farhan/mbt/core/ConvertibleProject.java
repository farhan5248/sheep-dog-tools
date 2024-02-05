package org.farhan.mbt.core;

import java.io.File;
import java.util.ArrayList;

public abstract class ConvertibleProject {

	// TODO make getters and setters
	public static String tags = "";
	public static String baseDir = "";

	public static final String FIRST_LAYER = "specs";
	public static final String SECOND_LAYER = "stepdefs";
	public static final String THIRD_LAYER = "objects";
	// TODO mabye delete this?
	public static final String FOURTH_LAYER = "common";

	public abstract File getDir(String layer);

	public abstract String getFileExt(String layer);

	public abstract ArrayList<ConvertibleObject> getObjects(String layer);

	public abstract void save() throws Exception;

	public abstract ConvertibleObject createObject(String name);
}
