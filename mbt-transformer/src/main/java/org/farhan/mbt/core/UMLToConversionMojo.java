package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class UMLToConversionMojo {

	protected abstract ArrayList<UMLToLayerConverter> getLayerConverters();

	protected abstract void save() throws Exception;

	protected abstract void initProjects() throws Exception;

	public void mojoGoal() throws Exception {

		initProjects();
		for (UMLToLayerConverter c : getLayerConverters()) {
			c.selectLayerFiles();
			c.convertObjects();
		}
		save();
	}

}
