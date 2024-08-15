package org.farhan.mbt.core;

import java.io.File;

public interface ConvertibleObject {

	// Remove this and do this in the constructor
	public void setFile(File theFile);

	public File getFile();

	public void load() throws Exception;

	public void save() throws Exception;

	public Object get();
}
