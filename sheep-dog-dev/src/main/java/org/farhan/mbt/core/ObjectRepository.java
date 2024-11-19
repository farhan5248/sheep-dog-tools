package org.farhan.mbt.core;

import java.util.ArrayList;

public interface ObjectRepository {
	
	// TODO rename list to getModelObjectsSteps, getModelTestCases, getModelObjectFields and remove the constants
	public final String JAVA = ".java";
	public final String FEATURE = ".feature";
	public final String ASCIIDOC = ".asciidoc";

	public ArrayList<String> list(String tags, String path, String extension);

	public String get(String tags, String path) throws Exception;

	public void put(String tags, String path, String content) throws Exception;

	public boolean contains(String tags, String path);
}
