package org.farhan.mbt.uml;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.Utilities;

public class UMLProject extends ConvertibleProject {

	private ArrayList<ConvertibleObject> firstLayerObjects;
	private ArrayList<ConvertibleObject> secondLayerObjects;
	private ArrayList<ConvertibleObject> thirdLayerObjects;
	private ArrayList<ConvertibleObject> fourthLayerObjects;

	private Model theSystem;

	public UMLProject() {
		firstLayerObjects = new ArrayList<ConvertibleObject>();
		secondLayerObjects = new ArrayList<ConvertibleObject>();
		thirdLayerObjects = new ArrayList<ConvertibleObject>();
		fourthLayerObjects = new ArrayList<ConvertibleObject>();

		// TODO move this to writeFiles after maintaining the classes in the lists above
		theSystem = UMLFactory.eINSTANCE.createModel();
		theSystem.setName("pst");
		theSystem.createNestedPackage(FIRST_LAYER);
		theSystem.createNestedPackage(SECOND_LAYER);
		theSystem.createNestedPackage(THIRD_LAYER);
	}

	@Override
	public File getDir(String layer) {
		File aFile = null;
		aFile = new File(baseDir + "target/uml/");
		aFile.mkdirs();
		return aFile;
	}

	public void load() throws Exception {
		URI uri = URI.createFileURI(getDir("").getAbsolutePath()).appendSegment(theSystem.getName())
				.appendFileExtension(UMLResource.FILE_EXTENSION);
		ResourceSet resourceSet = new ResourceSetImpl();
		// This is to load a UML model outside of Eclipse through Maven
		UMLResourcesUtil.init(resourceSet);
		Resource resource = resourceSet.getResource(uri, true);
		// The EMPTY_MAP is passed since I have no options
		resource.load(Collections.EMPTY_MAP);
		for (EObject e : resource.getContents()) {
			theSystem = (Model) e;
		}
		// TODO in the future the code above will be in the wrapper and the code below
		// will be in the ConvertUMLTo class
		ArrayList<Class> objects = getPackagedClasses(theSystem.getNestedPackage(FIRST_LAYER));
		for (Class c : objects) {
			try {
				createObject(c.getQualifiedName()).load();
			} catch (Exception e) {
				Utilities.getStackTraceAsString(e);
			}
		}
	}

	private ArrayList<Class> getPackagedClasses(Package aPackage) {
		ArrayList<Class> classes = new ArrayList<Class>();
		for (PackageableElement pe : aPackage.getPackagedElements()) {
			if (pe instanceof Class) {
				classes.add((Class) pe);
			} else if (pe instanceof Package) {
				classes.addAll(getPackagedClasses((Package) pe));
			}
		}
		return classes;
	}

	@Override
	public void save() throws Exception {
		URI uri = URI.createFileURI(getDir("").getAbsolutePath()).appendSegment(theSystem.getName())
				.appendFileExtension(getFileExt(""));
		ResourceSet resourceSet = new ResourceSetImpl();
		UMLResourcesUtil.init(resourceSet);
		XMLResource resource = (XMLResource) resourceSet.createResource(uri);
		resource.getContents().add(theSystem);
		// Looks like I have this for interaction message signatures that point nowhere
		// This option lets files get saved with referenced to non-existing objects
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, "true");
		resource.save(options);
	}

	@Override
	public String getFileExt(String layer) {
		return UMLResource.FILE_EXTENSION;
	}

	@Override
	public ArrayList<ConvertibleObject> getObjects(String layer) {
		ArrayList<ConvertibleObject> layerObjects = null;
		switch (layer) {
		case FIRST_LAYER:
			layerObjects = firstLayerObjects;
			break;
		case SECOND_LAYER:
			layerObjects = secondLayerObjects;
			break;
		case THIRD_LAYER:
			layerObjects = thirdLayerObjects;
			break;
		}
		return layerObjects;
	}

	@Override
	public ConvertibleObject createObject(String name) {

		// TODO in the future convert qualified name to path when each class is stored
		// individually
		Class theClass = (Class) getPackagedElement(name, null);
		if (theClass == null) {
			theClass = addClassWithPackages(name);
		}
		UMLClassWrapper ucw = new UMLClassWrapper(this, theClass);
		if (name.contains("::" + FIRST_LAYER + "::")) {
			firstLayerObjects.add(ucw);
		} else if (name.contains("::" + SECOND_LAYER + "::")) {
			secondLayerObjects.add(ucw);
		} else if (name.contains("::" + THIRD_LAYER + "::")) {
			thirdLayerObjects.add(ucw);
		} else {
			fourthLayerObjects.add(ucw);
		}
		return ucw;
	}

	private Class addClassWithPackages(String qualifiedName) {
		Class theClass = null;
		Package owningPackage = theSystem;
		String[] qualifiedNameParts = qualifiedName.replace(theSystem.getQualifiedName() + "::", "").split("::");
		for (int i = 0; i < qualifiedNameParts.length; i++) {
			if (i == qualifiedNameParts.length - 1) {
				theClass = owningPackage.createOwnedClass(qualifiedNameParts[i], false);
			} else {
				owningPackage = addPackage(owningPackage, qualifiedNameParts[i]);
			}
		}
		return theClass;
	}

	private Package addPackage(Package nestingPackage, String name) {
		Package thePackage = nestingPackage.getNestedPackage(name);
		if (thePackage == null) {
			thePackage = nestingPackage.createNestedPackage(name);
		}
		return thePackage;
	}

	public PackageableElement getPackagedElement(String qualifiedName, Package nestingPackage) {
		if (nestingPackage == null) {
			nestingPackage = theSystem;
		}
		for (PackageableElement pe : nestingPackage.getPackagedElements()) {
			if (pe instanceof Package) {
				PackageableElement anElement = getPackagedElement(qualifiedName, (Package) pe);
				if (anElement != null) {
					return anElement;
				}
			} else {
				if (pe.getQualifiedName().toLowerCase().contentEquals(qualifiedName.toLowerCase())) {
					return pe;
				}
				if (pe instanceof Class) {
					Class c = (Class) pe;
					for (Behavior b : c.getOwnedBehaviors()) {
						if (b.getQualifiedName().toLowerCase().contentEquals(qualifiedName.toLowerCase())) {
							return b;
						}
					}
				}
			}
		}
		return null;
	}
}
