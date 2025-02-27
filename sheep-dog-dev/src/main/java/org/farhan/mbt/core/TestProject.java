package org.farhan.mbt.core;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
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

public class TestProject extends ConvertibleProject {

	private Model theModel;

	public TestProject(String tags, ObjectRepository fa) {
		super(fa);
		theModel = UMLFactory.eINSTANCE.createModel();
		theModel.setName("pst");
		theModel.createNestedPackage(TEST_CASES);
		theModel.createNestedPackage(TEST_STEPS);
		ConvertibleProject.tags = tags;
	}

	@Override
	public String getDir(String layer) {
		return "uml/";
	}

	@Override
	public void init() throws Exception {
		String path = getDir("") + theModel.getName() + getFileExt("");
		if (fa.contains(tags, path)) {
			URI uri = URI.createFileURI(path);
			ResourceSet resourceSet = UMLResourcesUtil.init(new ResourceSetImpl());
			Resource resource = resourceSet.createResource(uri);
			InputStream content = new ByteArrayInputStream(fa.get(tags, path).getBytes(StandardCharsets.UTF_8));
			resource.load(content, Collections.EMPTY_MAP);
			theModel = (Model) resource.getContents().getFirst();
			ArrayList<Class> objects = getPackagedElements(theModel.getNestedPackage(TEST_CASES));
			for (Class c : objects) {
				addObject(c.getQualifiedName());
			}
			objects = getPackagedElements(theModel.getNestedPackage(TEST_STEPS));
			for (Class c : objects) {
				addObject(c.getQualifiedName());
			}
		}
	}

	public void save() throws Exception {
		String path = getDir("") + theModel.getName() + getFileExt("");
		URI uri = URI.createFileURI(path);
		ResourceSet resourceSet = new ResourceSetImpl();
		UMLResourcesUtil.init(resourceSet);
		XMLResource resource = (XMLResource) resourceSet.createResource(uri);
		resource.getContents().add(theModel);
		// Looks like I have this for interaction message signatures that point nowhere
		// This option lets files get saved with referenced to non-existing objects
		Map<Object, Object> options = resource.getDefaultSaveOptions();
		options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, "true");
		OutputStream os = new ByteArrayOutputStream();
		resource.save(os, options);
		fa.put(tags, path, os.toString());
	}

	@Override
	public String getFileExt(String layer) {
		return "." + UMLResource.FILE_EXTENSION;
	}

	@Override
	public ArrayList<ConvertibleObject> getObjects(String layer) {
		if (layer.equalsIgnoreCase(TEST_CASES)) {
			return firstLayerObjects;
		} else if (layer.equalsIgnoreCase(TEST_STEPS)) {
			return secondLayerObjects;
		} else {
			return thirdLayerObjects;
		}
	}

	@Override
	public ConvertibleObject addObject(String qualifiedName) {
		Class theClass = (Class) getPackagedElement(qualifiedName, null);
		if (theClass == null) {
			theClass = addClass(qualifiedName);
		}
		TestSuite ucw = new TestSuite(this, theClass);
		if (qualifiedName.startsWith("pst::" + TEST_OBJECTS)) {
			thirdLayerObjects.add(ucw);
		} else if (qualifiedName.startsWith("pst::" + TEST_STEPS)) {
			secondLayerObjects.add(ucw);
		} else if (qualifiedName.startsWith("pst::" + TEST_CASES)) {
			firstLayerObjects.add(ucw);
		}
		return ucw;
	}

	private Class addClass(String qualifiedName) {
		Class theClass = null;
		Package owningPackage = theModel;
		String[] qualifiedNameParts = qualifiedName.replace(theModel.getQualifiedName() + "::", "").split("::");
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

	private ArrayList<Class> getPackagedElements(Package aPackage) {
		ArrayList<Class> classes = new ArrayList<Class>();
		for (PackageableElement pe : aPackage.getPackagedElements()) {
			if (pe instanceof Class) {
				classes.add((Class) pe);
			} else if (pe instanceof Package) {
				classes.addAll(getPackagedElements((Package) pe));
			}
		}
		return classes;
	}

	public PackageableElement getPackagedElement(String qualifiedName, Package nestingPackage) {
		if (nestingPackage == null) {
			nestingPackage = theModel;
		}
		for (PackageableElement pe : nestingPackage.getPackagedElements()) {
			if (pe instanceof Package) {
				PackageableElement anElement = getPackagedElement(qualifiedName, (Package) pe);
				if (anElement != null) {
					return anElement;
				}
			} else {
				if (pe.getQualifiedName().contentEquals(qualifiedName)) {
					return pe;
				}
				if (pe instanceof Class) {
					Class c = (Class) pe;
					for (Behavior b : c.getOwnedBehaviors()) {
						if (b.getQualifiedName().contentEquals(qualifiedName)) {
							return b;
						}
					}
				}
			}
		}
		return null;
	}

	@Override
	public void deleteObject(ConvertibleObject srcObj) {
		// TODO Auto-generated method stub

	}
}
