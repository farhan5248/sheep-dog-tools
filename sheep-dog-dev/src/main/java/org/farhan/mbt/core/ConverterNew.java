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

	// TODO this is temp until I delete the second layer of feature files
	protected String convertSrcPath(String path, String layer) {
		return convertPath(path, srcPrj, tgtPrj, layer);
	}

	protected String convertSrcPath(String path) {
		return convertPath(path, srcPrj, tgtPrj);
	}

	protected String convertTgtPath(String path) {
		return convertPath(path, tgtPrj, srcPrj);
	}

	private String convertPath(String path, ConvertibleProject filesPrj, ConvertibleProject modelPrj) {
		String layer = filesPrj.TEST_CASES;
		if (path.startsWith(filesPrj.getDir(filesPrj.TEST_STEPS))) {
			layer = filesPrj.TEST_STEPS;
		}
		if (path.startsWith(filesPrj.getDir(filesPrj.TEST_OBJECTS))) {
			layer = filesPrj.TEST_OBJECTS;
		}
		return convertPath(path, filesPrj, modelPrj, layer);
	}

	private String convertPath(String path, ConvertibleProject filesPrj, ConvertibleProject modelPrj, String layer) {
		String qualifiedName = path.replace(",", "").trim();
		qualifiedName = qualifiedName.replace(filesPrj.getFileExt(layer), "");
		qualifiedName = qualifiedName.replace(filesPrj.getDir(layer), "");
		qualifiedName = qualifiedName.replace("/", "::");
		qualifiedName = "pst::" + layer + qualifiedName;
		return qualifiedName;
	}
}
