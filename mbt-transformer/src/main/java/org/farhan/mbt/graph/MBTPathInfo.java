package org.farhan.mbt.graph;

import java.util.TreeSet;

public class MBTPathInfo {

	private String description;
	private String index;
	private String name;
	private String tags;
	private String parameters;

	public MBTPathInfo() {
		this.index = "";
		this.name = "";
		this.tags = "";
		this.description = "";
		this.parameters = "";
	}

	public MBTPathInfo(String index, String name, String tags, String description, String parameters) {
		this.index = index;
		this.name = name;
		this.tags = tags;
		this.description = description;
		this.parameters = parameters;
	}

	public String getParameters() {
		return parameters;
	}

	public String getDescription() {
		return description;
	}

	public String getIndex() {
		return index;
	}

	public String getName() {
		return name;
	}

	public String getTags() {
		return tags;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String toString() {
		String text = "Path";
		text += "\n\tindex:" + index;
		text += "\n\tname:" + name;
		text += "\n\ttag:" + tags;
		text += "\n\tparameters:" + parameters;
		text += "\n\tdescription:";
		for (String line : description.split("\n")) {
			text += "\n\t\t" + line;
		}
		return text;
	}

	public boolean isCoveredBy(MBTEdge e) {
		String[] indices = e.getTag().split(",");
		for (String i : indices) {
			if (index.contentEquals(i)) {
				return true;
			}
		}
		return false;
	}
}
