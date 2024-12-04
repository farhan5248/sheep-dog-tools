package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ConvertibleProject {

	public static final String TEST_CASES = "specs";
	public static final String TEST_STEPS = "stepdefs";
	public static final String TEST_OBJECTS = "objects";
	// TODO replace TEST_STEPS with OBJECT_STEPS and create OBJECT_FIELDS

	// TODO make these two private and handle all file read/writes through the
	// project
	public static String tags = "";
	protected ObjectRepository fa;

	public ConvertibleProject(ObjectRepository fa) {
		this.fa = fa;
	}

	public abstract ConvertibleObject createObject(String name);

	public abstract String getDir(String layer);

	public abstract String getFileExt(String layer);

	public abstract ArrayList<ConvertibleObject> getObjects(String layer);

	public abstract void load() throws Exception;

	public abstract void save() throws Exception;
}
