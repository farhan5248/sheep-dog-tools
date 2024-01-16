package org.farhan;

import java.util.ArrayList;

public class MBTTable {

	private String caption;
	private ArrayList<ArrayList<String>> rowList;

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public MBTTable(String caption) {
		this.caption = caption;
		rowList = new ArrayList<ArrayList<String>>();
	}

	public void addRow(String c1, String c2, String c3) {

		ArrayList<String> row = new ArrayList<String>();
		row.add(c1);
		row.add(c2);
		row.add(c3);
		rowList.add(row);
	}

	public ArrayList<String> get(int row) {
		return rowList.get(row);
	}

	public int size() {
		return rowList.size();
	}

	public void addRow(String c1) {
		ArrayList<String> row = new ArrayList<String>();
		row.add(c1);
		rowList.add(row);
	}

	public ArrayList<ArrayList<String>> getRows() {
		return rowList;
	}
}
