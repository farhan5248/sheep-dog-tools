package org.farhan.mbt.uml;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;

public class ElementImportFactory {

	public static ElementImport getOrAddElementImport(Class owner, Class importedClass) {
		for (ElementImport ei : owner.getElementImports()) {
			if (ei.getImportedElement().getQualifiedName().contentEquals(importedClass.getQualifiedName())) {
				return ei;
			}
		}
		return createElementImport(owner, importedClass);
	}

	public static ElementImport getElementImport(Class owner, String importedClassName) {
		for (ElementImport ei : owner.getElementImports()) {
			if (ei.getImportedElement().getQualifiedName().contentEquals(importedClassName)) {
				return ei;
			}
		}
		return null;
	}

	public static ElementImport createElementImport(Class owner, Class importedClass) {
		ElementImport anElementImport = owner.createElementImport(importedClass);
		anElementImport.setAlias(importedClass.getName());
		return anElementImport;
	}

	public static ElementImport getElementImportByAlias(Class owner, String alias) {
		// TODO combine this and the other import into one. If the name has :: it's a
		// qualified name so search by that else search by the alias
		for (ElementImport ei : owner.getElementImports()) {
			if (ei.getAlias().contentEquals(alias)) {
				return ei;
			}
		}
		return null;
	}
}
