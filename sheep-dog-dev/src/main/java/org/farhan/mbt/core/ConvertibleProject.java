package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ConvertibleProject {

	public static final String FIRST_LAYER = "specs";
	public static final String SECOND_LAYER = "stepdefs";
	public static final String THIRD_LAYER = "objects";

	// TODO make these two private and handle all file read/writes through the
	// project
	public static String tags = "";
	protected ObjectRepository fa;

	public ConvertibleProject(ObjectRepository fa) {
		this.fa = fa;
	}

	public abstract ConvertibleObject createObject(String name) throws Exception;

	public abstract String getDir(String layer);

	public abstract String getFileExt(String layer);

	public abstract ArrayList<ConvertibleObject> getObjects(String layer);

	public abstract void load() throws Exception;

	public abstract void save() throws Exception;
}
