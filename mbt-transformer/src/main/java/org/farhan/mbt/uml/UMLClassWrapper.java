package org.farhan.mbt.uml;

import java.io.File;
import org.eclipse.uml2.uml.Class;
import org.farhan.mbt.core.ConvertibleObject;

public class UMLClassWrapper implements ConvertibleObject {

	public Class theClass;

	public UMLClassWrapper(Class theClass) {
		this.theClass = theClass;
	}

	@Override
	public void setFile(File theFile) {
		// TODO This will be implemented once I put each UML class in its own .uml file
	}

	@Override
	public File getFile() {
		// TODO This will be implemented once I put each UML class in its own .uml file
		return null;
	}

	@Override
	public void read() throws Exception {
		// TODO This will be changed once I put each UML class in its own .uml file

	}

	@Override
	public void write() throws Exception {
		// TODO This will be implemented once I put each UML class in its own .uml file
	}

}
