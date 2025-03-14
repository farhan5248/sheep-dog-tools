package org.farhan.mbt.core;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAnnotation;

public class TestData extends UMLElement {

	private EAnnotation umlElement;
	public TestData(String name, TestCase parent) {
		umlElement = createAnnotation(parent.getUmlElement(), name);
	}

	public void setTable(ArrayList<String> headers) {
		String value = "";
		for (String e : headers) {
			value += e + "|";
		}
		umlElement.getDetails().put("0", value);
	}

	public void addRow(ArrayList<String> examplesRow) {
		String value = "";
		for (String e : examplesRow) {
			value += e + "|";
		}
		umlElement.getDetails().put(String.valueOf(umlElement.getDetails().size()), value);
	}

}
