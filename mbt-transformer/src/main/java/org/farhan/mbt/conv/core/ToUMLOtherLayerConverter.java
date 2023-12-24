package org.farhan.mbt.conv.core;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Package;
import org.farhan.mbt.conv.uml.PackageFactory;
import org.farhan.mbt.conv.uml.UMLProject;

public abstract class ToUMLOtherLayerConverter extends ToUMLLayerConverter {

	@Override
	final protected void selectLayerFiles(String layer) {
		// TODO this isn't tested yet
		ArrayList<File> layerFiles = new ArrayList<File>();
		Package upperLayerPackage = PackageFactory.getPackageRecursively(UMLProject.theSystem, "pst::" + layer);
		if (upperLayerPackage != null) {
			ArrayList<Class> upperLayerClasses = PackageFactory.getPackagedClasses(upperLayerPackage);
			HashMap<String, Class> importedClasses = new HashMap<String, Class>();
			for (Class c : upperLayerClasses) {
				for (ElementImport ei : c.getElementImports()) {
					Class importedClass = (Class) ei.getImportedElement();
					importedClasses.put(importedClass.getName(), importedClass);
				}
			}
			for (Class c : importedClasses.values()) {

				if (!c.getQualifiedName().contains("::io::cucumber::") && !c.getQualifiedName().contains("::common::")
						&& !c.getQualifiedName().contains("::libraries::")) {
					layerFiles.add(new File(convertQualifiedNameToAbsolutePath(c.getQualifiedName())));
				}
			}
		}

	}
}