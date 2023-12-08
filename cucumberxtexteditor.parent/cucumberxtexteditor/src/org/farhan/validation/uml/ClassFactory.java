package org.farhan.validation.uml;

import java.util.ArrayList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.farhan.validation.Utilities;

public class ClassFactory {

	public static String getName(String qualifiedName) {
		return Utilities.regexFind("(.*::)?([^:]+)", qualifiedName, 2);
	}

	public static Class getClass(Package nestingPackage, String qualifiedName) {

		Class theClass = (Class) PackageFactory.getPackagedElement(qualifiedName, nestingPackage);

		if (theClass == null) {
			Package owningPackage = PackageFactory.addPackageRecursively(nestingPackage, qualifiedName);
			theClass = owningPackage.createOwnedClass(getName(qualifiedName), false);
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

			Interaction anInteraction = InteractionFactory.getInteraction(c, getMethodName(messageName, true), false);
			if (anInteraction != null) {
				return c;
			}
		}
		return getClass(nestingPackage, qualifiedName);
	}

	public static String getMethodName(String name, boolean keepNumbers) {
		// remove arguments
		String newName = name.replaceAll("\\s{2,}.*", "");
		// remove variables
		newName = newName.replaceAll(" \\$\\{[^\\}]*\\}", "");
		// remove pound sign
		newName = newName.replace("#", "hash");
		// TODO remove anything not a number or letter, make a test before doing so

		// change first letter to upper case
		newName = Utilities.toUpperCamelCase(newName);
		if (keepNumbers) {
			newName = newName.replaceAll("[^a-zA-Z0-9]", "");
		} else {
			newName = newName.replaceAll("[^a-zA-Z]", "");
		}
		// change first character to lower case
		newName = newName.substring(0, 1).toLowerCase() + newName.substring(1);
		return newName;
	}

}
