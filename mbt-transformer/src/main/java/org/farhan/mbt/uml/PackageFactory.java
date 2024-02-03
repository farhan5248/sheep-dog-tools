package org.farhan.mbt.uml;

import java.util.ArrayList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;

public class PackageFactory {

	public static Package getPackageRecursively(Package nestingPackage, String qualifiedName) {
		Package owningPackage = nestingPackage;
		String[] qualifiedNameParts = qualifiedName.replace(nestingPackage.getQualifiedName() + "::", "").split("::");
		for (int i = 0; i < qualifiedNameParts.length; i++) {
			owningPackage = owningPackage.getNestedPackage(qualifiedNameParts[i]);
		}
		return owningPackage;
	}

	public static PackageableElement getPackagedElement(String qualifiedName, Package nestingPackage) {
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

	public static ArrayList<Class> getPackagedClasses(Package aPackage) {
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

	public static ArrayList<Interaction> getPackagedInteractions(Model theSystem, String layer) {

		ArrayList<Interaction> layerInteractions = new ArrayList<Interaction>();
		Package upperLayerPackage = PackageFactory.getPackageRecursively(theSystem, "pst::" + layer);
		if (upperLayerPackage != null) {
			ArrayList<Class> layerClasses = PackageFactory.getPackagedClasses(upperLayerPackage);
			for (Class c : layerClasses) {
				for (Behavior b : c.getOwnedBehaviors()) {
					Interaction i = (Interaction) b;
					layerInteractions.add(i);
				}
			}
		}
		return layerInteractions;
	}

}
