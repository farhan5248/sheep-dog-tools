package org.farhan.mbt.uml;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Property;

public class PropertyFactory {
	public static Property getProperty(Class propertyOwner, String propertyName, Class propertyType) {

		if (propertyType != null && propertyType != propertyOwner) {
			ElementImport propertyTypeImport = ElementImportFactory.getElementImportByAlias(propertyOwner,
					propertyType.getName());
			if (propertyTypeImport == null) {
				propertyTypeImport = ElementImportFactory.getElementImport(propertyOwner,
						propertyType.getQualifiedName());
			}
		}

		Property theProperty = propertyOwner.getOwnedAttribute(propertyName, propertyType);
		if (theProperty == null) {
			theProperty = propertyOwner.createOwnedAttribute(propertyName, propertyType);
		}
		return theProperty;
	}

	public Property addProperty(Interface theInterface, String propertyName, Interface propertyType) {
		Property theProperty = theInterface.getOwnedAttribute(propertyName, propertyType);
		if (theProperty == null) {
			theProperty = theInterface.createOwnedAttribute(propertyName, propertyType);
		}
		return theProperty;
	}

	public Property addProperty(Activity theActivity, String propertyName, Interface propertyType) {
		Property theProperty = theActivity.getOwnedAttribute(propertyName, propertyType);
		if (theProperty == null) {
			theProperty = theActivity.createOwnedAttribute(propertyName, propertyType);
		}
		return theProperty;
	}

	public static Property getProperty(Class theClass, String name) {
		for (Property p : theClass.getOwnedAttributes()) {
			if (p.getName().contentEquals(name)) {
				return p;
			}
		}
		return null;
	}
}
