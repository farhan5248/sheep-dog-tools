package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ConvertToGraph implements MojoGoal {

	protected abstract ArrayList<ToGraphConverter> getLayerConverters();

	protected abstract void save() throws Exception;

	protected abstract void initProjects() throws Exception;

	public void mojoGoal() throws Exception {

		initProjects();
		for (ToGraphConverter c : getLayerConverters()) {
			c.selectObjects();
			c.convertObjects();
		}
		save();
	}
}
