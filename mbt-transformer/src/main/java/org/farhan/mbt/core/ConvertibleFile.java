package org.farhan.mbt.core;

import java.io.File;

public interface ConvertibleFile {

	public void setFile(File theFile);

	public File getFile();
	
	public void read();
	
	public void write();
}
