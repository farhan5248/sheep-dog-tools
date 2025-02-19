package org.farhan.mbt.core;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

public abstract class Converter {

	protected String tags = "";
	protected ConvertibleProject project;
	protected UMLModel model;
	protected ObjectRepository fa;
	protected Logger log;

	public Converter(String tags, ObjectRepository fa, Logger log) {
		this.tags = tags;
		this.fa = fa;
		this.log = log;
	}

	public abstract void initProjects() throws Exception;

	public void clearObjects() throws Exception {
		fa.clear(tags);
	}

	public ArrayList<String> getObjectNames() throws Exception {
		// TODO this is temp hack until I figure out how to manage the objects, the
		// project files and model better
		return null;
	}

	public abstract String convertObject(String path, String content) throws Exception;

	protected String removeDelimiterAndCapitalize(String text, String delimiter) {
		// TODO move this to path converter superclass?
		String[] nameParts = text.split(delimiter);
		text = "";
		for (String s : nameParts) {
			text += StringUtils.capitalize(s);
		}
		return text;
	}
}
