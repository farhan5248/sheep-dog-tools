package org.farhan.mbt.core;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAnnotation;

public class StepParameters extends UMLElement {

	private EAnnotation umlElement;

	public StepParameters(String name, StepDefinition parent) {
		umlElement = createAnnotation(parent.getUmlElement(), name);
	}

	public void addRow(ArrayList<String> stepParametersRow) {
		String value = "";
		for (String e : stepParametersRow) {
			value += e + "|";
		}
		umlElement.getDetails().put(String.valueOf(umlElement.getDetails().size()), value);
	}

	public void addTable(ArrayList<String> headers) {
		String value = "";
		for (String e : headers) {
			value += e + "|";
		}
		umlElement.getDetails().put("0", value);
	}
}
