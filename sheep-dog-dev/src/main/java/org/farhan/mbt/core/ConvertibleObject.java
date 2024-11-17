package org.farhan.mbt.core;

import java.io.File;

public interface ConvertibleObject {

	// TODO remove get and setFile, get() should be enough
	public void setFile(File theFile);

	public File getFile();

	public void load(ObjectRepository fa) throws Exception;

	public void save(ObjectRepository fa) throws Exception;

	public Object get();
}
