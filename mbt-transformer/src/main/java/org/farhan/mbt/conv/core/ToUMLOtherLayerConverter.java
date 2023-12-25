package org.farhan.mbt.conv.core;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.farhan.mbt.conv.cucumber.CucumberJavaFile;
import org.farhan.mbt.conv.cucumber.CucumberNameConverter;
import org.farhan.mbt.conv.cucumber.CucumberProject;
import org.farhan.mbt.conv.uml.UMLProject;

public abstract class ToUMLOtherLayerConverter extends ToUMLLayerConverter {

	@Override
	final protected void selectLayerFiles(String layer) {
		ArrayList<Class> upperLayerClasses;
		ArrayList<ConvertibleFile> layerFiles;
		if (UMLProject.secondLayerPackageName.contentEquals(layer)) {
			upperLayerClasses = UMLProject.getFirstLayerClasses();
			// TODO this is inefficient, it's reading every file unnecessarily, move the
			// call to read() here. The same applies to the first layer. Basically move file
			// reading out of the project to the converters to be more selective
			layerFiles = CucumberProject.getSecondLayerFiles();
		} else {
			upperLayerClasses = UMLProject.getSecondLayerClasses();
			layerFiles = CucumberProject.getThirdLayerFiles();
		}

		// Instead of reading a file twice, make a short list to save time reading each
		// file
		HashMap<String, Class> layerClassShortList = new HashMap<String, Class>();
		for (Class c : upperLayerClasses) {
			for (ElementImport ei : c.getElementImports()) {
				Class importedClass = (Class) ei.getImportedElement();
				layerClassShortList.put(importedClass.getQualifiedName(), importedClass);
			}
		}
		for (int i = layerFiles.size() - 1; i >= 0; i--) {
			if (!isFileSelected(layerFiles.get(i), layerClassShortList)) {
				layerFiles.remove(i);
			}
		}
	}

	private boolean isFileSelected(ConvertibleFile convertibleFile, HashMap<String, Class> layerClassShortList) {
		CucumberJavaFile cjf = (CucumberJavaFile) convertibleFile;
		String qName = CucumberNameConverter.convertJavaPathToQualifiedName(cjf.getFile().getAbsolutePath());
		return layerClassShortList.containsKey(qName);
	}
}