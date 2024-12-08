package org.farhan.mbt.core;

import java.util.ArrayList;

import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public abstract class Converter {

	protected String tags = "";
	protected ConvertibleProject srcPrj;
	protected ConvertibleProject tgtPrj;
	protected ObjectRepository fa;

	public Converter(String tags, ObjectRepository fa) {
		this.tags = tags;
		this.fa = fa;
	}

	protected abstract void convertFeature(ConvertibleObject co) throws Exception;

	protected void convertFeatures() throws Exception {
		for (ConvertibleObject co : getFeatures(srcPrj.TEST_CASES)) {
			convertFeature(co);
		}
	}

	protected abstract ArrayList<ConvertibleObject> getFeatures(String layer);

	public abstract void initProjects() throws Exception;

	protected abstract void load() throws Exception;

	public void convert() throws Exception {
		initProjects();
		load();
		convertFeatures();
		save();
	}

	protected abstract void save() throws Exception;

	protected String convertFileName(String fullName) {
		String qualifiedName = fullName.replace(",", "").trim();
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(tgtPrj.TEST_CASES), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(tgtPrj.TEST_CASES), "");
		qualifiedName = qualifiedName.replace("/", "::");
		qualifiedName = "pst::" + srcPrj.TEST_CASES + qualifiedName;
		return qualifiedName;
	}

	protected String convertQualifiedName(String fullName) {
		String pathName = fullName;
		pathName = pathName.replace("pst::" + srcPrj.TEST_CASES, tgtPrj.getDir(tgtPrj.TEST_CASES));
		pathName = pathName.replace("::", "/");
		pathName = pathName + tgtPrj.getFileExt(tgtPrj.TEST_CASES);
		return pathName;
	}

}
