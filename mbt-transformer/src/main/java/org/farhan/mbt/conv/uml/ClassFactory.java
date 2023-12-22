package org.farhan.mbt.conv.uml;

import java.util.ArrayList;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.farhan.mbt.conv.cucumber.CucumberJavaFile;

public class ClassFactory {

	public static Class getClass(Package nestingPackage, String qualifiedName) {

		Class theClass = (Class) PackageFactory.getPackagedElement(qualifiedName, nestingPackage);

		if (theClass == null) {
			// First create the package structure
			Package owningPackage = PackageFactory.addPackageRecursively(nestingPackage, qualifiedName);
			// Then create the class
			theClass = owningPackage.createOwnedClass(UMLNameTranslator.getName(qualifiedName), false);
		}
		return theClass;
	}

	public static ArrayList<Class> getClasses(Package nestingPackage) {
		ArrayList<Class> classes = new ArrayList<Class>();
		for (PackageableElement pe : nestingPackage.getPackagedElements()) {
			if (pe instanceof Class) {
				classes.add((Class) pe);
			} else if (pe instanceof Package) {
				classes.addAll(getClasses((Package) pe));
			}
		}
		return classes;
	}

	public static Class getClassByMessage(Model nestingPackage, String messageName, String qualifiedName) {

		for (Class c : PackageFactory.getPackagedClasses(nestingPackage)) {

			Interaction anInteraction = InteractionFactory.getInteraction(c, messageName, false);
			if (anInteraction != null) {
				return c;
			}
		}
		return getClass(nestingPackage, qualifiedName);
	}

}
