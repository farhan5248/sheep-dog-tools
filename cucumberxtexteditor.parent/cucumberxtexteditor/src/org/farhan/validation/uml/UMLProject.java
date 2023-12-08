package org.farhan.validation.uml;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

public class UMLProject {

	public static Model initProject(String modelName) {
		Model theSystem = ModelFactory.getModel(modelName);
		ModelFactory.getSubModel(theSystem, "Logical", "");
		return theSystem;
	}

	public static Model readUMLFile(Model theSystem, File umlDir) throws IOException {

		URI uri = URI.createFileURI(umlDir.getAbsolutePath()).appendSegment(theSystem.getName())
				.appendFileExtension(UMLResource.FILE_EXTENSION);
		// Create a resource-set to contain the resource(s) that we are saving
		ResourceSet resourceSet = new ResourceSetImpl();

		UMLResourcesUtil.init(resourceSet);

		// Load the input resource and loop through its contents
		Resource resource = resourceSet.getResource(uri, true);
		resource.load(Collections.EMPTY_MAP);

		for (EObject e : resource.getContents()) {

			// TODO, check if the eObject is named assure-claims
			theSystem = (Model) e;
		}
		return theSystem;
	}

	public static void writeUMLFile(Model theSystem, File umlDir) throws IOException {

		URI uri = URI.createFileURI(umlDir.getAbsolutePath()).appendSegment(theSystem.getName())
				.appendFileExtension(UMLResource.FILE_EXTENSION);

		// Create a resource-set to contain the resource(s) that we are saving
		ResourceSet resourceSet = new ResourceSetImpl();

		// Initialize registrations of resource factories, library models,
		// profiles, Ecore metadata, and other dependencies required for
		// serializing and working with UML resources. This is only necessary in
		// applications that are not hosted in the Eclipse platform run-time, in
		// which case these registrations are discovered automatically from
		// Eclipse extension points.
		UMLResourcesUtil.init(resourceSet);

		// Create the output resource and add our model package to it.
		XMLResource resource = (XMLResource) resourceSet.createResource(uri);
		resource.getContents().add(theSystem);

		// Handle Resource$IOWrappedException
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, "true");
		// And save
		resource.save(options);
	}

}
