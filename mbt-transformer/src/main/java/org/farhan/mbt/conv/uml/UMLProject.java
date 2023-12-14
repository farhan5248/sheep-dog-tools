package org.farhan.mbt.conv.uml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

public class UMLProject {

	public static Model initProject(String modelName) {
		Model theSystem = ModelFactory.getModel(modelName);
		return theSystem;
	}

	public static void exportUMLFiles(Model theSystem, File umlDir) throws Exception {
		writeUMLFile(theSystem, umlDir);
	}

	public static ArrayList<Class> getPackageClasses(Package nestingPackage) {
		Class aClass;
		ArrayList<Class> theClasses = new ArrayList<Class>();
		for (PackageableElement pe : nestingPackage.getPackagedElements()) {

			if (pe instanceof Class) {
				aClass = (Class) pe;
				theClasses.add(aClass);
			} else if (pe instanceof Package) {
				theClasses.addAll(getPackageClasses((Package) pe));
			}
		}
		return theClasses;
	}

	public static ArrayList<Interface> getPackageInterfaces(Package nestingPackage) {
		Interface anInterface;
		ArrayList<Interface> theInterfaces = new ArrayList<Interface>();
		for (PackageableElement pe : nestingPackage.getPackagedElements()) {

			if (pe instanceof Interface) {
				anInterface = (Interface) pe;
				theInterfaces.add(anInterface);
			} else if (pe instanceof Component) {
				theInterfaces.addAll(getComponentInterfaces((Component) pe));
			} else if (pe instanceof Package) {
				theInterfaces.addAll(getPackageInterfaces((Package) pe));
			}
		}
		return theInterfaces;
	}

	private static ArrayList<Interface> getComponentInterfaces(Component owningComponent) {
		Interface anInterface;
		ArrayList<Interface> theInterfaces = new ArrayList<Interface>();
		for (NamedElement ne : owningComponent.getOwnedMembers()) {

			if (ne instanceof Interface) {
				anInterface = (Interface) ne;
				theInterfaces.add(anInterface);
			} else if (ne instanceof Component) {
				theInterfaces.addAll(getComponentInterfaces((Component) ne));
			}
		}
		return theInterfaces;
	}

	public static Class getPackagedClass(Package nestingPackage, String qualifiedName) {
		List<Class> allClasses = getPackageClasses(nestingPackage);
		for (Class c : allClasses) {
			if (c.getQualifiedName().contentEquals(qualifiedName)) {
				return c;
			}
		}
		return null;
	}

	public static List<Dependency> getPackageDependencies(Package nestingPackage) {

		List<Dependency> theDependencies = new ArrayList<Dependency>();
		for (Dependency d : nestingPackage.getClientDependencies()) {
			theDependencies.add(d);
		}
		for (Package p : nestingPackage.getNestedPackages()) {
			theDependencies.addAll(getPackageDependencies(p));
		}
		return theDependencies;
	}

	public static void importUMLPIM(ModelFactory theSystem) {
		// TODO After re-factoring the PIM methods to read from the PSM and separating
		// the files, update this method
	}

	public static Model importUMLFiles(Model theSystem, File umlDir) throws Exception {
		return readUMLFile(theSystem, umlDir);
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
