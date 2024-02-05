package org.farhan.mbt.core;

import java.io.File;

public interface ConvertibleObject {

	// Remove this and do this in the constructor
	public void setFile(File theFile);

	// rename this to get
	public File getFile();

	public void load() throws Exception;

	public void save() throws Exception;
}
