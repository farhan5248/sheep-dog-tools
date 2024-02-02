package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ToGraphConversionMojo {

	protected abstract ArrayList<ToGraphLayerConverter> getLayerConverters();

	protected abstract void writeFiles() throws Exception;

	protected abstract void initProjects();

	public void mojoGoal() throws Exception {

		initProjects();
		for (ToGraphLayerConverter c : getLayerConverters()) {
			c.selectLayerFiles();
			c.convertObjects();
		}
		writeFiles();
	}
}
