package org.farhan.mbt.uml;

import java.io.File;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.farhan.mbt.core.ConvertibleObject;

public class UMLClassWrapper implements ConvertibleObject {

	private File theFile;
	private Class theClass;

	// TODO these are probably needed until the System is moved in this class and
	// eventually removed when each class has its own file
	private UMLProject parentProject;
	private static boolean isNotLoaded;

	public UMLClassWrapper(UMLProject umlProject, Class theClass) {
		this.theClass = theClass;
		theFile = umlProject.getDir("");
		isNotLoaded = true;
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
	}

	@Override
	public File getFile() {
		return theFile;
	}

	@Override
	public void load() throws Exception {

		// Only read the model file if it hasn't been loaded before. This will change
		// when each class has its own model file
		if (isNotLoaded) {
			parentProject.load();
		}
	}

	@Override
	public void save() throws Exception {
		// TODO This will be implemented once I put each UML class in its own .uml file
	}

	@Override
	public Object get() {
		return theClass;
	}

}
