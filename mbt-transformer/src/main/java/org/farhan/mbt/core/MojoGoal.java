package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class MojoGoal {

	protected abstract void convertFeature(ConvertibleObject co) throws Exception;

	protected void convertFeatures() throws Exception {
		for (ConvertibleObject co : getFeatures(ConvertibleProject.FIRST_LAYER)) {
			convertFeature(co);
		}
	}

	protected abstract ArrayList<ConvertibleObject> getFeatures(String layer);

	protected abstract void initProjects() throws Exception;

	protected abstract void loadFeatures() throws Exception;

	public void mojoGoal() throws Exception {
		initProjects();
		loadFeatures();
		convertFeatures();
		save();
	}

	protected abstract void save() throws Exception;
}
