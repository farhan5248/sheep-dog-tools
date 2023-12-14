package org.farhan.conv.core;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Package;
import org.farhan.mbt.conv.uml.PackageFactory;


public abstract class OtherLayerConverter extends LayerConverter {

	@Override
	final protected ArrayList<File> selectLayerFiles(String layer) {
		ArrayList<File> layerFiles = new ArrayList<File>();
		Package upperLayerPackage = PackageFactory.getPackageRecursively(theSystem,
				"pst::" + layer);
		if (upperLayerPackage != null) {
			// get all classes from previous layer
			ArrayList<Class> upperLayerClasses = PackageFactory.getPackagedClasses(upperLayerPackage);
			// get all imported classes referenced in previous layer
			HashMap<String, Class> importedClasses = new HashMap<String, Class>();
			for (Class c : upperLayerClasses) {
				for (ElementImport ei : c.getElementImports()) {
					Class importedClass = (Class) ei.getImportedElement();
					importedClasses.put(importedClass.getName(), importedClass);
				}
			}
			// Loop through imported classes and get file paths of files
			for (Class c : importedClasses.values()) {

				// TODO make isImportedClassIncluded in each platform converter.
				if (!c.getQualifiedName().contains("::io::cucumber::") && !c.getQualifiedName().contains("::common::")
						&& !c.getQualifiedName().contains("::libraries::")) {
					layerFiles.add(new File(convertClassQualifiedNameToPath(c.getQualifiedName())));
				}
			}
		}

		return layerFiles;
	}
}