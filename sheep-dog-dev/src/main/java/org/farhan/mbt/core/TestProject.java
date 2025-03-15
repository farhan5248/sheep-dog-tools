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

public class TestProject {

	protected ObjectRepository fa;
	public String tags = "";
	public final String TEST_CASES = "specs";
	public final String TEST_STEPS = "stepdefs";
	private Model umlElement;
	protected ArrayList<TestSuite> firstLayerObjects;
	protected ArrayList<StepObject> secondLayerObjects;

	public TestProject(String tags, ObjectRepository fa) {
		firstLayerObjects = new ArrayList<TestSuite>();
		secondLayerObjects = new ArrayList<StepObject>();
		this.fa = fa;
		this.tags = tags;
		umlElement = UMLFactory.eINSTANCE.createModel();
		umlElement.setName("pst");
		umlElement.createNestedPackage(TEST_CASES);
		umlElement.createNestedPackage(TEST_STEPS);
	}

	public StepObject addStepObject(String qualifiedName) {
		if (getPackagedElement(qualifiedName, null) == null) {
			StepObject stepObject = new StepObject(qualifiedName, this);
			secondLayerObjects.add(stepObject);
			return stepObject;
		}
		return null;
	}

	public TestSuite addTestSuite(String qualifiedName) {
		if (getPackagedElement(qualifiedName, null) == null) {
			TestSuite testSuite = new TestSuite(qualifiedName, this);
			firstLayerObjects.add(testSuite);
			return testSuite;
		}
		return null;
	}

	public String getDir() {
		return "uml/";
	}

	public PackageableElement getPackagedElement(String qualifiedName, Package nestingPackage) {
		if (nestingPackage == null) {
			nestingPackage = umlElement;
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

	public StepObject getStepObject(String qualifiedName) {
		for (StepObject so : secondLayerObjects) {
			if (so.getUmlElement().getQualifiedName().contentEquals(qualifiedName)) {
				return so;
			}
		}
		return null;
	}

	public ArrayList<StepObject> getStepObjectList() {
		return secondLayerObjects;
	}

	public TestSuite getTestSuite(String qualifiedName) {
		for (TestSuite ts : firstLayerObjects) {
			if (ts.getUmlElement().getQualifiedName().contentEquals(qualifiedName)) {
				return ts;
			}
		}
		return null;
	}

	public ArrayList<TestSuite> getTestSuiteList() {
		return firstLayerObjects;
	}

	public Model getUmlElement() {
		return umlElement;
	}

	public void init() throws Exception {
		String path = getDir() + umlElement.getName() + "." + UMLResource.FILE_EXTENSION;
		if (fa.contains(tags, path)) {
			URI uri = URI.createFileURI(path);
			ResourceSet resourceSet = UMLResourcesUtil.init(new ResourceSetImpl());
			Resource resource = resourceSet.createResource(uri);
			InputStream content = new ByteArrayInputStream(fa.get(tags, path).getBytes(StandardCharsets.UTF_8));
			resource.load(content, Collections.EMPTY_MAP);
			umlElement = (Model) resource.getContents().getFirst();
			ArrayList<Class> objects = getPackagedElements(umlElement.getNestedPackage(TEST_CASES));
			for (Class c : objects) {
				firstLayerObjects.add(new TestSuite(c, this));
			}
			objects = getPackagedElements(umlElement.getNestedPackage(TEST_STEPS));
			for (Class c : objects) {
				secondLayerObjects.add(new StepObject(c, this));
			}
		}
	}

	public void save() throws Exception {
		String path = getDir() + umlElement.getName() + "." + UMLResource.FILE_EXTENSION;
		URI uri = URI.createFileURI(path);
		ResourceSet resourceSet = new ResourceSetImpl();
		UMLResourcesUtil.init(resourceSet);
		XMLResource resource = (XMLResource) resourceSet.createResource(uri);
		resource.getContents().add(umlElement);
		// Looks like I have this for interaction message signatures that point nowhere
		// This option lets files get saved with referenced to non-existing objects
		Map<Object, Object> options = resource.getDefaultSaveOptions();
		options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, "true");
		OutputStream os = new ByteArrayOutputStream();
		resource.save(os, options);
		fa.put(tags, path, os.toString());
	}
}
