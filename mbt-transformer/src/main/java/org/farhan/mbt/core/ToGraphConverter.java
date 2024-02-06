package org.farhan.mbt.core;

import java.util.ArrayList;

import org.farhan.mbt.graph.JGraphTProject;

public abstract class ToGraphConverter {

	protected JGraphTProject target;

	protected abstract String getLayer();

	protected abstract void selectObjects() throws Exception;

	// TODO change to getSource
	protected abstract ArrayList<ConvertibleObject> getObjects(String layer);

	protected void convertObjects() throws Exception {
		for (ConvertibleObject co : getObjects(getLayer())) {
			convertObject(co);
		}
	}

	protected abstract void convertObject(ConvertibleObject object) throws Exception;

	protected abstract String convertObjectName(String fullName);

}
