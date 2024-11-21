package org.farhan.mbt.uml;

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
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.ObjectRepository;

public class UMLProject extends ConvertibleProject {

	private ArrayList<ConvertibleObject> firstLayerObjects;

	private Model theSystem;

	public UMLProject(String tags, ObjectRepository fa) {
		super(fa);
		firstLayerObjects = new ArrayList<ConvertibleObject>();
		theSystem = UMLFactory.eINSTANCE.createModel();
		theSystem.setName("pst");
		theSystem.createNestedPackage(FIRST_LAYER);
		ConvertibleProject.tags = tags;
	}

	@Override
	public String getDir(String layer) {
		return "uml/";
	}

	@Override
	public void load() throws Exception {
		URI uri = URI.createFileURI(getDir("")).appendSegment(theSystem.getName())
				.appendFileExtension(UMLResource.FILE_EXTENSION);
		// UMLResourcesUtil is to load a UML model outside of Eclipse through Maven
		ResourceSet resourceSet = UMLResourcesUtil.init(new ResourceSetImpl());
		Resource resource = resourceSet.createResource(uri);
		InputStream content = new ByteArrayInputStream(
				fa.get(tags, uri.toFileString()).getBytes(StandardCharsets.UTF_8));
		resource.load(content, Collections.EMPTY_MAP);
		theSystem = (Model) resource.getContents().getFirst();
		ArrayList<Class> objects = getPackagedClasses(theSystem.getNestedPackage(FIRST_LAYER));
		for (Class c : objects) {
			createObject(c.getQualifiedName());
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
		URI uri = URI.createFileURI(getDir("")).appendSegment(theSystem.getName()).appendFileExtension(getFileExt(""));
		ResourceSet resourceSet = new ResourceSetImpl();
		UMLResourcesUtil.init(resourceSet);
		XMLResource resource = (XMLResource) resourceSet.createResource(uri);
		resource.getContents().add(theSystem);
		// Looks like I have this for interaction message signatures that point nowhere
		// This option lets files get saved with referenced to non-existing objects
		Map<Object, Object> options = resource.getDefaultSaveOptions();
		options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, "true");
		OutputStream os = new ByteArrayOutputStream();
		resource.save(os, options);
		fa.put(tags, uri.toFileString(), os.toString());
	}

	@Override
	public String getFileExt(String layer) {
		return UMLResource.FILE_EXTENSION;
	}

	@Override
	public ArrayList<ConvertibleObject> getObjects(String layer) {
		return firstLayerObjects;
	}

	@Override
	public ConvertibleObject createObject(String name) {
		Class theClass = (Class) getPackagedElement(name, null);
		if (theClass == null) {
			theClass = addClassWithPackages(name);
		}
		UMLClassWrapper ucw = new UMLClassWrapper(this, theClass);
		firstLayerObjects.add(ucw);
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
