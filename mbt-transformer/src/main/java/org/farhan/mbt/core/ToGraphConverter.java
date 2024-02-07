package org.farhan.mbt.core;

import java.util.ArrayList;

import org.farhan.mbt.graph.JGraphTProject;

public abstract class ToGraphConverter {

	protected String layer;
	protected JGraphTProject tgtPrj;
	
	protected String getLayer() {
		return layer;
	}
	protected abstract void selectObjects() throws Exception;

	protected abstract ArrayList<ConvertibleObject> getObjects(String layer);

	protected void convertObjects() throws Exception {
		for (ConvertibleObject co : getObjects(getLayer())) {
			convertObject(co);
			convertElements(co);
		}
	}

	protected abstract void convertObject(ConvertibleObject object) throws Exception;

	protected abstract void convertElements(ConvertibleObject object) throws Exception;

	protected abstract String convertObjectName(String fullName);

}
