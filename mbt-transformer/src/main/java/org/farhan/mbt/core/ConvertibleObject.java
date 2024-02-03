package org.farhan.mbt.core;

import java.io.File;

public interface ConvertibleObject {

	// Remove this and do this in the constructor
	public void setFile(File theFile);

	// rename this to get
	public File getFile();

	// there shouldn't be read vs get, just the get and if it has to read something,
	// it can do it
	public void read() throws Exception;

	// rename this to save. even for the UML file, try saving it for each class so
	// it that if blows up, perhaps something can be saved?
	public void write() throws Exception;
}
