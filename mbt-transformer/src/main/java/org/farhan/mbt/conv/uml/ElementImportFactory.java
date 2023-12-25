package org.farhan.mbt.conv.uml;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;

public class ElementImportFactory {

	public static ElementImport getElementImport(Class aClass, String qualifiedName) {
		ElementImport anElementImport;
		for (ElementImport ei : aClass.getElementImports()) {
			// TODO remove the lowercase
			if (ei.getImportedElement().getQualifiedName().toLowerCase().contentEquals(qualifiedName.toLowerCase())) {
				return ei;
			}
		}
		// If we reached this point, theres no import by that name
		Class aClassImport = ClassFactory.getClass(aClass.getModel(), qualifiedName);
		anElementImport = aClass.createElementImport(aClassImport);
		anElementImport.setAlias(aClassImport.getName());
		return anElementImport;
	}

	public static ElementImport getElementImportByAlias(Class aClass, String alias) {
		for (ElementImport ei : aClass.getElementImports()) {
			if (ei.getAlias().toLowerCase().contentEquals(alias.toLowerCase())) {
				return ei;
			}
		}
		return null;
	}
}
