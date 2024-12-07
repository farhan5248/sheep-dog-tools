package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ConvertibleProject {

	public final String TEST_CASES = "specs";
	public final String TEST_STEPS = "stepdefs";
	public final String TEST_OBJECTS = "objects";
	// TODO replace TEST_STEPS with OBJECT_STEPS and create OBJECT_FIELDS

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
