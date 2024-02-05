package org.farhan.mbt.uml;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;

public class ClassFactory {

	public static Class getClass(Package nestingPackage, String qualifiedName) {

		Class theClass = (Class) PackageFactory.getPackagedElement(qualifiedName, nestingPackage);
		if (theClass == null) {
			theClass = addClassWithPackages(nestingPackage, qualifiedName);
		}
		return theClass;
	}

	public static Class addClassWithPackages(Package nestingPackage, String qualifiedName) {
		Class theClass = null;
		Package owningPackage = nestingPackage;
		String[] qualifiedNameParts = qualifiedName.replace(nestingPackage.getQualifiedName() + "::", "").split("::");
		for (int i = 0; i < qualifiedNameParts.length; i++) {
			if (i == qualifiedNameParts.length - 1) {
				theClass = owningPackage.createOwnedClass(qualifiedNameParts[i], false);
			} else {
				owningPackage = addPackage(owningPackage, qualifiedNameParts[i]);
			}
		}
		return theClass;
	}

	public static Package addPackage(Package nestingPackage, String name) {
		Package thePackage = nestingPackage.getNestedPackage(name);
		if (thePackage == null) {
			thePackage = nestingPackage.createNestedPackage(name);
		}
		return thePackage;
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
