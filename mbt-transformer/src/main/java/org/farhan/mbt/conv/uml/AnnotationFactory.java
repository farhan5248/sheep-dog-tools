package org.farhan.mbt.conv.uml;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.ValueSpecification;

public class AnnotationFactory {

	public static EAnnotation getAnnotation(Interaction anInteraction, String name) {
		return anInteraction.createEAnnotation(name);
	}

	public static EAnnotation getAnnotation(ValueSpecification argument, String name) {
		return argument.createEAnnotation(name);
	}

	public static EAnnotation getAnnotation(ValueSpecification vs, String name, String key, String value) {
		EAnnotation a = getAnnotation(vs, name);
		a.getDetails().put("0", value);
		return a;
	}

}
