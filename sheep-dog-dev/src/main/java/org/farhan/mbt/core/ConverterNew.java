package org.farhan.mbt.core;

import java.util.ArrayList;

import org.farhan.mbt.cucumber.AbstractScenario;
import org.farhan.mbt.cucumber.CucumberFeatureWrapper;

public abstract class ConverterNew {

	protected String tags = "";
	protected ConvertibleProject srcPrj;
	protected ConvertibleProject tgtPrj;
	protected ObjectRepository fa;

	public ConverterNew(String tags, ObjectRepository fa) {
		this.tags = tags;
		this.fa = fa;
	}

	public abstract String convertObject(String tags, String path, String content) throws Exception;

	public abstract void initProjects() throws Exception;

	// TODO move these to UML Project
	protected String convertPath(String fullName) {
		String qualifiedName = fullName.replace(",", "").trim();
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(tgtPrj.TEST_CASES), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(tgtPrj.TEST_CASES), "");
		qualifiedName = qualifiedName.replace("/", "::");
		qualifiedName = "pst::" + srcPrj.TEST_CASES + qualifiedName;
		return qualifiedName;
	}

	protected String convertQualifiedName(String fullName) {
		String pathName = fullName;
		// This is only used in feature file to uml
		pathName = pathName.replace("pst::" + srcPrj.TEST_CASES, tgtPrj.getDir(tgtPrj.TEST_CASES));
		pathName = pathName.replace("::", "/");
		pathName = pathName + tgtPrj.getFileExt(tgtPrj.TEST_CASES);
		return pathName;
	}

}
