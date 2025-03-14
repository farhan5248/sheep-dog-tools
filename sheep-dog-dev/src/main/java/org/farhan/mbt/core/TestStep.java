package org.farhan.mbt.core;

import java.util.ArrayList;

import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.ValueSpecification;

public class TestStep extends UMLElement {

	private Message umlElement;

	public TestStep(String name, UMLElement parent) {
		String keyword = name.split(" ")[0];
		if (parent instanceof TestCase) {
			umlElement = ((TestCase) parent).getUmlElement().createMessage(name.substring(keyword.length() + 1));
		} else {
			umlElement = ((TestSetup) parent).getUmlElement().createMessage(name.substring(keyword.length() + 1));
		}
	}

	public void setKeyword(String keyword) {
		if (!keyword.endsWith(":")) {
			keyword += ":";
		}
		createAnnotation(umlElement, "Step", "Keyword", keyword);
	}

	public void setNameLong(String stepNameLong) {
		String keyword = stepNameLong.split(" ")[0];
		if (!keyword.endsWith(":")) {
			stepNameLong = stepNameLong.replaceFirst("^" + keyword, keyword + ":");
		}
		createAnnotation(umlElement, "Step", "LongName", stepNameLong);
	}

	public void setStepText(String content) {
		ValueSpecification vs = createArgument("docString", "");
		String[] lines = content.split("\n");
		for (int i = 0; i < lines.length; i++) {
			createAnnotation(vs, "docString", String.valueOf(i), lines[i]);
		}
	}

	public void setStepData(ArrayList<ArrayList<String>> stepTableRowList) {
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

}
