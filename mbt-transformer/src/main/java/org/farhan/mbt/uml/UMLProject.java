package org.farhan.mbt.uml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.Utilities;

public class UMLProject extends Project {

	// TODO remove UMLProject.theSystem from all the UML Factory methods
	public static Model theSystem;

	public static void init() {
		theSystem = ModelFactory.getModel("pst");
		PackageFactory.addPackage(theSystem, UMLProject.firstLayerPackageName);
		PackageFactory.addPackage(theSystem, UMLProject.secondLayerPackageName);
		PackageFactory.addPackage(theSystem, UMLProject.thirdLayerPackageName);

	}

	public static Model readFiles() throws Exception {
		URI uri = URI.createFileURI(getUmlDir().getAbsolutePath()).appendSegment(theSystem.getName())
				.appendFileExtension(UMLResource.FILE_EXTENSION);
		ResourceSet resourceSet = new ResourceSetImpl();
		// TODO test removing this or at least comment it out
		UMLResourcesUtil.init(resourceSet);
		Resource resource = resourceSet.getResource(uri, true);
		// TODO why is this needed? The Xtext generated code doesn't use this
		resource.load(Collections.EMPTY_MAP);
		for (EObject e : resource.getContents()) {
			theSystem = (Model) e;
		}
		return theSystem;
	}

	public static void writeFiles() throws Exception {

		URI uri = URI.createFileURI(getUmlDir().getAbsolutePath()).appendSegment(theSystem.getName())
				.appendFileExtension(UMLResource.FILE_EXTENSION);
		ResourceSet resourceSet = new ResourceSetImpl();
		UMLResourcesUtil.init(resourceSet);
		XMLResource resource = (XMLResource) resourceSet.createResource(uri);
		resource.getContents().add(theSystem);
		// Looks like I have this for interaction message signatures that point nowhere
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, "true");
		resource.save(options);
	}

	public static ArrayList<Class> getLayerClasses(String layer) {
		if (layer.contentEquals(Project.firstLayerPackageName)) {
			return PackageFactory.getPackagedClasses(theSystem.getNestedPackage(Project.firstLayerPackageName));
		} else if (layer.contentEquals(Project.secondLayerPackageName)) {
			return PackageFactory.getPackagedClasses(theSystem.getNestedPackage(Project.secondLayerPackageName));
		} else if (layer.contentEquals(Project.thirdLayerPackageName)) {
			return PackageFactory.getPackagedClasses(theSystem.getNestedPackage(Project.thirdLayerPackageName));
		}
		return null;
	}

}
