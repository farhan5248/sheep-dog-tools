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
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.Utilities;

public class UMLProject extends ConvertibleProject {

	private ArrayList<ConvertibleObject> firstLayerObjects;
	private ArrayList<ConvertibleObject> secondLayerObjects;
	private ArrayList<ConvertibleObject> thirdLayerObjects;

	// TODO remove theSystem from all the UML Factory methods
	public static Model theSystem;

	public UMLProject() {
		firstLayerObjects = new ArrayList<ConvertibleObject>();
		secondLayerObjects = new ArrayList<ConvertibleObject>();
		thirdLayerObjects = new ArrayList<ConvertibleObject>();

		// TODO move this to writeFiles after maintaining the classes in the lists above
		theSystem = ModelFactory.getModel("pst");
		theSystem.createNestedPackage(firstLayerName);
		theSystem.createNestedPackage(secondLayerName);
		theSystem.createNestedPackage(thirdLayerName);
	}

	@Override
	public File getDir(String layer) {
		File aFile = null;
		aFile = new File(baseDir + "target/uml/");
		aFile.mkdirs();
		return aFile;
	}

	@Override
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
		loadObjects(firstLayerName, firstLayerObjects);
		loadObjects(secondLayerName, secondLayerObjects);
		loadObjects(thirdLayerName, thirdLayerObjects);
	}

	private void loadObjects(String layer, ArrayList<ConvertibleObject> layerFiles) {
		layerFiles.clear();
		ArrayList<Class> objects = PackageFactory.getPackagedClasses(theSystem.getNestedPackage(layer));
		for (Class c : objects) {
			try {
				createObject(c.getQualifiedName()).read();
			} catch (Exception e) {
				Utilities.getStackTraceAsString(e);
			}
		}
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
		case firstLayerName:
			layerObjects = firstLayerObjects;
			break;
		case secondLayerName:
			layerObjects = secondLayerObjects;
			break;
		case thirdLayerName:
			layerObjects = thirdLayerObjects;
			break;
		}
		return layerObjects;
	}

	@Override
	public ConvertibleObject createObject(String name) {

		// TODO in the future convert qualified name to path when each class is stored
		// individually
		Class theClass = ClassFactory.getClass(theSystem, name);
		UMLClassWrapper cff = new UMLClassWrapper(theClass);
		if (name.contains("::" + firstLayerName + "::")) {
			firstLayerObjects.add(cff);
		} else if (name.contains("::" + secondLayerName + "::")) {
			secondLayerObjects.add(cff);
		} else if (name.contains("::" + thirdLayerName + "::")) {
			thirdLayerObjects.add(cff);
		}
		return cff;
	}

}
