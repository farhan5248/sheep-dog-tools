package org.farhan.mbt.uml;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.ValueSpecification;

public class AnnotationFactory {

	public static EAnnotation getAnnotation(Interaction anInteraction, String name) {
		EAnnotation a = anInteraction.getEAnnotation(name);
		if (a == null) {
			a = anInteraction.createEAnnotation(name);
		}
		return a;
	}

	public static EAnnotation getAnnotation(ValueSpecification argument, String name) {
		EAnnotation a = argument.getEAnnotation(name);
		if (a == null) {
			a = argument.createEAnnotation(name);
		}
		return a;
	}

	public static EAnnotation getAnnotation(Interaction anInteraction, String name, String key, String value) {
		EAnnotation a = getAnnotation(anInteraction, name);
		a.getDetails().put(key, value);
		return a;
	}

	public static EAnnotation getAnnotation(ValueSpecification vs, String name, String key, String value) {
		EAnnotation a = getAnnotation(vs, name);
		a.getDetails().put(key, value);
		return a;
	}

}
