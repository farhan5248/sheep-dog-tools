package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ToUMLConversionMojo {

	protected abstract ArrayList<ToUMLLayerConverter> getLayerConverters();

	protected abstract void save() throws Exception;

	protected abstract void initProjects();

	public void mojoGoal() throws Exception {

		initProjects();
		for (ToUMLLayerConverter c : getLayerConverters()) {
			c.selectLayerObjects();
			c.convertObjects();
		}
		save();
	}
}
