package org.farhan.mbt.uml;

import java.io.IOException;
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

public class UMLProject extends Project {

	// TODO remove UMLProject.theSystem from all the UML Factory methods
	public static Model theSystem;

	public static void init() {
		theSystem = ModelFactory.getModel("pst");
		PackageFactory.addPackage(theSystem, UMLProject.firstLayerPackageName);
		PackageFactory.addPackage(theSystem, UMLProject.secondLayerPackageName);
		PackageFactory.addPackage(theSystem, UMLProject.thirdLayerPackageName);

	}

	public static Model readFiles() throws IOException {
		URI uri = URI.createFileURI(getUmlDir().getAbsolutePath()).appendSegment(theSystem.getName())
				.appendFileExtension(UMLResource.FILE_EXTENSION);
		ResourceSet resourceSet = new ResourceSetImpl();
		UMLResourcesUtil.init(resourceSet);
		Resource resource = resourceSet.getResource(uri, true);
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
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, "true");
		resource.save(options);
	}

	public static ArrayList<Class> getFirstLayerClasses() {
		return PackageFactory.getPackagedClasses(theSystem.getNestedPackage(Project.firstLayerPackageName));
	}

	public static ArrayList<Class> getSecondLayerClasses() {
		return PackageFactory.getPackagedClasses(theSystem.getNestedPackage(Project.secondLayerPackageName));
	}

	public static ArrayList<Class> getThirdLayerClasses() {
		return PackageFactory.getPackagedClasses(theSystem.getNestedPackage(Project.thirdLayerPackageName));
	}

}
