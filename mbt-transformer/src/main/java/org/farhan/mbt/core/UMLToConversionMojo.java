package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class UMLToConversionMojo {

	protected abstract ArrayList<UMLToConverter> getLayerConverters();

	protected abstract void save() throws Exception;

	protected abstract void initProjects() throws Exception;

	public void mojoGoal() throws Exception {

		initProjects();
		for (UMLToConverter c : getLayerConverters()) {
			c.selectLayerFiles();
			c.convertObjects();
		}
		save();
	}

}
