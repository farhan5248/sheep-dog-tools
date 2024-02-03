package org.farhan.mbt.core;

import java.io.File;
import java.util.ArrayList;

public abstract class Project {

	// TODO make getters and setters
	public static String tags = "";
	public static String baseDir = "";

	public String firstLayerName = "specs";
	public String secondLayerName = "stepdefs";
	public String thirdLayerName = "objects";
	public String fourthLayerName = "common";

	public abstract File getLayerDir(String layer);

	public abstract String getLayerFileType(String layer);

	// TODO this method shouldn't read the files, that happens in select layer files
	public abstract ArrayList<ConvertibleObject> getLayerObjects(String layer);

	public abstract void save() throws Exception;

	// TODO there shouldn't be a read files method in general since all reads happen
	// in select layer files. At most this is needed for testing
	public abstract void load() throws Exception;
}
