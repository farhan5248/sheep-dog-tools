package org.farhan.mbt.core;

import java.util.ArrayList;

import org.farhan.mbt.graph.JGraphTProject;

public abstract class ToGraphConverter {

	protected JGraphTProject target;

	protected abstract String getLayer();

	protected abstract void selectObjects() throws Exception;

	protected abstract ArrayList<ConvertibleObject> getObjects(String layer);

	protected void convertObjects() throws Exception {
		for (ConvertibleObject layerFile : getObjects(getLayer())) {
			convertObject(layerFile);
		}
	}

	protected abstract void convertObject(ConvertibleObject layerFile) throws Exception;

	protected abstract String convertObjectName(String fullName);

}
