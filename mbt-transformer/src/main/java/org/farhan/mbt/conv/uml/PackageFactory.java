package org.farhan.mbt.conv.uml;

import java.util.ArrayList;

import org.eclipse.uml2.uml.Activity;
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

	public static Package addPackageRecursively(Package nestingPackage, String qualifiedName) {
		Package owningPackage = nestingPackage;
		String[] qualifiedNameParts = qualifiedName.replace(nestingPackage.getQualifiedName() + "::", "").split("::");
		for (int i = 0; i < qualifiedNameParts.length - 1; i++) {
			owningPackage = addPackage(owningPackage, qualifiedNameParts[i]);
		}
		return owningPackage;
	}

	public static Package addPackage(Package nestingPackage, String name) {
		Package thePackage = nestingPackage.getNestedPackage(name);
		if (thePackage == null) {
			thePackage = nestingPackage.createNestedPackage(name);
		}
		return thePackage;
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
			}
		}
		return null;
	}

	public static ArrayList<Activity> getPackagedActivities(Package aPackage) {
		ArrayList<Activity> activities = new ArrayList<Activity>();
		for (PackageableElement pe : aPackage.getPackagedElements()) {
			if (pe instanceof Activity) {
				activities.add((Activity) pe);
			} else if (pe instanceof Package) {
				activities.addAll(getPackagedActivities((Package) pe));
			}
		}
		return activities;
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

	public static ArrayList<Package> getApplicationsPackages(Model theSystem, String owningModelName) {
		Model owningModel = (Model) theSystem.getMember(owningModelName);
		Package components = (Package) owningModel.getPackagedElement("components");
		ArrayList<Package> thePackages = new ArrayList<Package>();
		for (PackageableElement pe : components.getPackagedElements()) {
			if (pe instanceof Package) {
				Package aPackage = (Package) pe;
				thePackages.add(aPackage);
			}
		}
		return thePackages;
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
