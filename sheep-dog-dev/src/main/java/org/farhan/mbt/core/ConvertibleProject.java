package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ConvertibleProject {

	protected ObjectRepository fa;
	public static String tags = "";
	// TODO replace TEST_STEPS with OBJECT_STEPS and create OBJECT_FIELDS
	// TODO maybe move these into an enumeration constant
	public final String TEST_CASES = "specs";
	public final String TEST_STEPS = "stepdefs";
	public final String TEST_OBJECTS = "objects";

	public ConvertibleProject(ObjectRepository fa) {
		this.fa = fa;
	}

	public abstract ConvertibleObject createObject(String name);

	public abstract void deleteObject(ConvertibleObject srcObj);

	public abstract String getDir(String layer);

	public abstract String getFileExt(String layer);

	public abstract ArrayList<ConvertibleObject> getObjects(String layer);

	public abstract void init() throws Exception;
}
