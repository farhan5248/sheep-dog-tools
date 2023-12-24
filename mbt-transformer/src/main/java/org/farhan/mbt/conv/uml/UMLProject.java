package org.farhan.mbt.conv.uml;

import java.io.File;
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
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.farhan.conv.core.Project;

public class UMLProject {

	public static Model theSystem;

	public static void init() {
		theSystem = ModelFactory.getModel("pst");
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

	public static Model readFiles() throws IOException {
		File umlDir = new File(Project.baseDir + Project.umlDir);
		URI uri = URI.createFileURI(umlDir.getAbsolutePath()).appendSegment(theSystem.getName())
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

	public static void writeFiles(File umlDir) throws Exception {

		URI uri = URI.createFileURI(umlDir.getAbsolutePath()).appendSegment(theSystem.getName())
				.appendFileExtension(UMLResource.FILE_EXTENSION);
		ResourceSet resourceSet = new ResourceSetImpl();
		UMLResourcesUtil.init(resourceSet);
		XMLResource resource = (XMLResource) resourceSet.createResource(uri);
		resource.getContents().add(theSystem);
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, "true");
		resource.save(options);
	}

	public static ArrayList<?> getFirstLayerClasses() {
		return getPackageClasses(theSystem.getNestedPackage(Project.firstLayerPackageName));
	}

	public static ArrayList<?> getSecondLayerClasses() {
		return getPackageClasses(theSystem.getNestedPackage(Project.secondLayerPackageName));
	}

	public static ArrayList<?> getThirdLayerClasses() {
		return getPackageClasses(theSystem.getNestedPackage(Project.thirdLayerPackageName));
	}

}
