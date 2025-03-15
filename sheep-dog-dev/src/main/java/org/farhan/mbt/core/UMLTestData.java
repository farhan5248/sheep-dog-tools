package org.farhan.mbt.core;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAnnotation;

public class UMLTestData extends UMLElement {

	private EAnnotation umlElement;

	public UMLTestData(String name, UMLTestCase parent) {
		umlElement = createAnnotation(parent.getUmlElement(), name);
	}

	public UMLTestData(EAnnotation umlElement, UMLTestCase parent) {
		this.umlElement = umlElement;
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

	public String getName() {
		return umlElement.getSource();
	}

	public ArrayList<String> getTable() {
		ArrayList<String> paramNames = new ArrayList<String>();
		for (String cell : umlElement.getDetails().getFirst().getValue().split("\\|")) {
			paramNames.add(cell);
		}
		return paramNames;
	}

	public ArrayList<ArrayList<String>> getRowList() {
		ArrayList<ArrayList<String>> examplesRowList = new ArrayList<ArrayList<String>>();
		int rowCnt = umlElement.getDetails().size();
		for (int i = 1; i < rowCnt; i++) {
			String[] row = umlElement.getDetails().get(i).getValue().split("\\|");
			ArrayList<String> cellList = new ArrayList<String>();
			int cellCnt = row.length;
			for (int j = 0; j < cellCnt; j++) {
				cellList.add(row[j]);
			}
			examplesRowList.add(cellList);
		}
		return examplesRowList;
	}

}
