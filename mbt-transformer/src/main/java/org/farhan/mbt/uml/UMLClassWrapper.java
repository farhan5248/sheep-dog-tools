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

	public Class theClass;
	private File theFile;

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

	public void load() throws Exception {

		// Only read the model file if it hasn't been loaded before. This will change
		// when each class has its own model file
		if (isNotLoaded) {
			URI uri = URI.createFileURI(theFile.getAbsolutePath()).appendSegment(parentProject.theSystem.getName())
					.appendFileExtension(UMLResource.FILE_EXTENSION);
			ResourceSet resourceSet = new ResourceSetImpl();
			// This is to load a UML model outside of Eclipse through Maven
			UMLResourcesUtil.init(resourceSet);
			Resource resource = resourceSet.getResource(uri, true);
			// The EMPTY_MAP is passed since I have no options
			resource.load(Collections.EMPTY_MAP);
			for (EObject e : resource.getContents()) {
				parentProject.theSystem = (Model) e;
			}
			isNotLoaded = false;
		}
	}

	@Override
	public void save() throws Exception {
		// TODO This will be implemented once I put each UML class in its own .uml file
	}

}
