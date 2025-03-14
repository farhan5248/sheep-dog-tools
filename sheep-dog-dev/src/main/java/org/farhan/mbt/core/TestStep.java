package org.farhan.mbt.core;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.ValueSpecification;

public class TestStep {

	public Message umlElement;
	private TestStepParent parent;

	public TestStep(String name, TestStepParent parent) {
		this.parent = parent;
		String keyword = name.split(" ")[0];
		umlElement = this.parent.getUmlElement().createMessage(name.substring(keyword.length() + 1));
	}

	public void setStepKeyword(String keyword) {
		if (!keyword.endsWith(":")) {
			keyword += ":";
		}
		createAnnotation(umlElement, "Step", "Keyword", keyword);
	}

	public void setStepNameLong(String stepNameLong) {
		String keyword = stepNameLong.split(" ")[0];
		if (!keyword.endsWith(":")) {
			stepNameLong = stepNameLong.replaceFirst("^" + keyword, keyword + ":");
		}
		createAnnotation(umlElement, "Step", "LongName", stepNameLong);
	}

	private EAnnotation createAnnotation(Message aMessage, String name, String key, String value) {
		EAnnotation a = aMessage.getEAnnotation(name);
		if (a == null) {
			a = aMessage.createEAnnotation(name);
		}
		a.getDetails().put(key, value);
		return a;
	}

	public void setDocString(String content) {
		ValueSpecification vs = createArgument("docString", "");
		String[] lines = content.split("\n");
		for (int i = 0; i < lines.length; i++) {
			createAnnotation(vs, "docString", String.valueOf(i), lines[i]);
		}
	}

	private ValueSpecification createArgument(String name, String value) {
		LiteralString ls = (LiteralString) umlElement.getArgument(name, null);
		if (ls == null) {
			ls = UMLFactory.eINSTANCE.createLiteralString();
			ls = (LiteralString) umlElement.createArgument(name, null, ls.eClass());
			ls.setName(name);
			ls.setValue(value);
		}
		return ls;
	}

	private EAnnotation createAnnotation(ValueSpecification vs, String name, String key, String value) {
		EAnnotation a = vs.getEAnnotation(name);
		if (a == null) {
			a = vs.createEAnnotation(name);
		}
		a.getDetails().put(key, value);
		return a;
	}

	public void setStepTable(ArrayList<ArrayList<String>> stepTableRowList) {
		ValueSpecification table = createArgument("dataTable", "");
		// header
		String row = "";
		for (int i = 0; i < stepTableRowList.get(0).size(); i++) {
			row += stepTableRowList.get(0).get(i) + " |";
		}
		createAnnotation(table, "dataTable", String.valueOf(0), row);
		// body
		for (int i = 1; i < stepTableRowList.size(); i++) {
			row = "";
			ArrayList<String> bodyRow = stepTableRowList.get(i);
			for (int j = 0; j < bodyRow.size(); j++) {
				row += stepTableRowList.get(i).get(j).replace("{", "<").replace("}", ">") + " |";
			}
			createAnnotation(table, "dataTable", String.valueOf(i), row);
		}
	}

}
