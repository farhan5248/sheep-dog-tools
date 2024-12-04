package org.farhan.mbt.core;

import java.util.ArrayList;

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
		for (ConvertibleObject co : getFeatures(ConvertibleProject.TEST_CASES)) {
			convertFeature(co);
		}
	}

	protected abstract ArrayList<ConvertibleObject> getFeatures(String layer);

	protected abstract void initProjects() throws Exception;

	protected abstract void load() throws Exception;

	public void mojoGoal() throws Exception {
		initProjects();
		load();
		convertFeatures();
		save();
	}

	protected abstract void save() throws Exception;

	// TODO move these to UML Project
	protected String convertFileName(String fullName) {
		String qualifiedName = fullName.replace(",", "").trim();
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(ConvertibleProject.TEST_CASES), "");
		// TODO probably don't need this line because there's no absolute paths anymore?
		qualifiedName = qualifiedName.replace(srcPrj.getDir(ConvertibleProject.TEST_CASES), "");
		qualifiedName = qualifiedName.replace("/", "::");
		qualifiedName = "pst::" + ConvertibleProject.TEST_CASES + qualifiedName;
		return qualifiedName;
	}

	protected String convertQualifiedName(String fullName) {
		String pathName = fullName;
		pathName = pathName.replace("pst::" + ConvertibleProject.TEST_CASES,
				tgtPrj.getDir(ConvertibleProject.TEST_CASES));
		pathName = pathName.replace("::", "/");
		pathName = pathName + tgtPrj.getFileExt(ConvertibleProject.TEST_CASES);
		return pathName;
	}

}
