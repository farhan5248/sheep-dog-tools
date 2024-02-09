package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ConvertToCode implements MojoGoal{

	protected abstract ArrayList<ToCodeConverter> getLayerConverters();

	protected abstract void save() throws Exception;

	protected abstract void initProjects() throws Exception;

	public void mojoGoal() throws Exception {

		initProjects();
		for (ToCodeConverter c : getLayerConverters()) {
			c.selectObjects();
			c.convertObjects();
		}
		save();
	}

}
