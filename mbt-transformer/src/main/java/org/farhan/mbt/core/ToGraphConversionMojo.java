package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ToGraphConversionMojo {

	protected abstract ArrayList<ToGraphConverter> getLayerConverters();

	protected abstract void save() throws Exception;

	protected abstract void initProjects();

	public void mojoGoal() throws Exception {

		initProjects();
		for (ToGraphConverter c : getLayerConverters()) {
			c.selectLayerObjects();
			c.convertObjects();
		}
		save();
	}
}
