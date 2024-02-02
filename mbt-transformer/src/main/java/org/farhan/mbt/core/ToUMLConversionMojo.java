package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ToUMLConversionMojo {

	protected ToUMLFirstLayerConverter firstLayerConverter;
	protected ToUMLOtherLayerConverter otherLayerConverter;

	protected abstract ArrayList<ToUMLLayerConverter> getLayerConverters();

	protected abstract void writeFiles() throws Exception;

	protected abstract void initProjects();

	public void mojoGoal() throws Exception {

		initProjects();
		for (ToUMLLayerConverter c : getLayerConverters()) {
			c.selectLayerFiles();
			c.convertObjects();
		}
		writeFiles();
	}
}
