package org.farhan.mbt.core;

import java.io.File;
import java.util.ArrayList;

public abstract class ConvertibleProject {


	// TODO change String to File
	public static String baseDir = "";
	public static final String FIRST_LAYER = "specs";
	public static final String SECOND_LAYER = "stepdefs";
	public static final String THIRD_LAYER = "objects";

	public abstract ConvertibleObject createObject(String name);

	public abstract File getDir(String layer);

	public abstract String getFileExt(String layer);

	public abstract ArrayList<ConvertibleObject> getObjects(String layer);

	public abstract void load(String tags) throws Exception;

	public abstract void save() throws Exception;
}
