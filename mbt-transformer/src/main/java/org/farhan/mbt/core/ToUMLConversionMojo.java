package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ToUMLConversionMojo {

	protected abstract ArrayList<ToUMLConverter> getLayerConverters();

	protected abstract void save() throws Exception;

	protected abstract void initProjects();

	public void mojoGoal() throws Exception {

		initProjects();
		for (ToUMLConverter c : getLayerConverters()) {
			c.selectObjects();
			c.convertObjects();
		}
		save();
	}
}
