package org.farhan.mbt.core;

import java.io.File;
import java.util.ArrayList;

public abstract class MojoGoal {

	protected String tags = "";
	protected ConvertibleProject srcPrj;
	protected ConvertibleProject tgtPrj;

	protected abstract void convertFeature(ConvertibleObject co) throws Exception;

	protected void convertFeatures() throws Exception {
		for (ConvertibleObject co : getFeatures(ConvertibleProject.FIRST_LAYER)) {
			convertFeature(co);
		}
	}

	protected abstract ArrayList<ConvertibleObject> getFeatures(String layer);

	protected abstract void initProjects() throws Exception;

	protected abstract void loadFeatures() throws Exception;

	public void mojoGoal(String tags) throws Exception {
		this.tags = tags;
		initProjects();
		loadFeatures();
		convertFeatures();
		save();
	}

	protected abstract void save() throws Exception;

	protected String convertFileName(String fullName) {
		String qualifiedName = fullName.replace(",", "").trim();
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(ConvertibleProject.FIRST_LAYER), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(ConvertibleProject.FIRST_LAYER).getAbsolutePath(), "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::" + ConvertibleProject.FIRST_LAYER + qualifiedName;
		return qualifiedName;
	}

	protected String convertQualifiedName(String fullName) {
		String pathName = fullName;
		pathName = pathName.replace("pst::" + ConvertibleProject.FIRST_LAYER,
				tgtPrj.getDir(ConvertibleProject.FIRST_LAYER).getAbsolutePath());
		pathName = pathName.replace("::", File.separator);
		pathName = pathName + tgtPrj.getFileExt(ConvertibleProject.FIRST_LAYER);
		return pathName;
	}
}
