package org.farhan.mbt.core;

import java.io.File;
import java.util.ArrayList;

public abstract class ConvertibleProject {

	// TODO make getters and setters
	public static String tags = "";
	public static String baseDir = "";

	public final String firstLayerName = "specs";
	public final String secondLayerName = "stepdefs";
	public final String thirdLayerName = "objects";
	public final String fourthLayerName = "common";

	public abstract File getDir(String layer);

	public abstract String getFileExt(String layer);

	// TODO this method shouldn't read the files, that happens in select layer files
	public abstract ArrayList<ConvertibleObject> getObjects(String layer);

	public abstract void save() throws Exception;

	// TODO there shouldn't be a read files method in general since all reads happen
	// in select layer files. At most this is needed for testing
	public abstract void load() throws Exception;

	public abstract ConvertibleObject createObject(String name);
}
