package org.farhan.mbt.core;

import java.io.File;

public interface ConvertibleObject {

	public void setFile(File theFile);

	public File getFile();

	public void read() throws Exception;

	public void write() throws Exception;
}
