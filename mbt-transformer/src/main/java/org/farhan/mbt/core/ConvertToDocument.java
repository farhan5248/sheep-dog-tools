package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ConvertToDocument implements MojoGoal{

	protected abstract ArrayList<ToDocumentConverter> getLayerConverters();

	protected abstract void save() throws Exception;

	protected abstract void initProjects() throws Exception;

	public void mojoGoal() throws Exception {

		initProjects();
		for (ToDocumentConverter c : getLayerConverters()) {
			c.selectObjects();
			c.convertObjects();
		}
		save();
	}

}
