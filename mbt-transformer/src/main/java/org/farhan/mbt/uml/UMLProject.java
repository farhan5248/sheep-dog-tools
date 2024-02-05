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

public class UMLProject extends ConvertibleProject {

	private ArrayList<ConvertibleObject> firstLayerObjects;
	private ArrayList<ConvertibleObject> secondLayerObjects;
	private ArrayList<ConvertibleObject> thirdLayerObjects;

	// TODO remove theSystem from all the UML Factory methods
	public Model theSystem;

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
		// TODO test removing this or at least comment it out
		UMLResourcesUtil.init(resourceSet);
		Resource resource = resourceSet.getResource(uri, true);
		// TODO why is this needed? The Xtext generated code doesn't use this
		resource.load(Collections.EMPTY_MAP);
		for (EObject e : resource.getContents()) {
			theSystem = (Model) e;
		}
	}

	@Override
	public void save() throws Exception {

		URI uri = URI.createFileURI(getDir("").getAbsolutePath()).appendSegment(theSystem.getName())
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

	// TODO move the code to load and initialise all the objects lists. Then this
	// method just returns the specific object list
	public ArrayList<Class> getLayerClasses(String layer) {
		if (layer.contentEquals(firstLayerName)) {
			return PackageFactory.getPackagedClasses(theSystem.getNestedPackage(firstLayerName));
		} else if (layer.contentEquals(secondLayerName)) {
			return PackageFactory.getPackagedClasses(theSystem.getNestedPackage(secondLayerName));
		} else if (layer.contentEquals(thirdLayerName)) {
			return PackageFactory.getPackagedClasses(theSystem.getNestedPackage(thirdLayerName));
		}
		return null;
	}

	@Override
	public String getFileType(String layer) {
		return ".uml";
	}

	@Override
	public ArrayList<ConvertibleObject> getObjects(String layer) {
		ArrayList<ConvertibleObject> layerFiles = null;
		switch (layer) {
		case firstLayerName:
			layerFiles = firstLayerObjects;
			break;
		case secondLayerName:
			layerFiles = secondLayerObjects;
			break;
		case thirdLayerName:
			layerFiles = thirdLayerObjects;
			break;
		}
		return layerFiles;
	}

	@Override
	public ConvertibleObject createObject(String name) {
		// TODO move getClass code here. This only creates a class if one doesn't exist.
		return null;
	}

}
