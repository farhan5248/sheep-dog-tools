package org.farhan.mbt.core;

import java.util.ArrayList;

import org.farhan.mbt.graph.JGraphTProject;

public abstract class ToGraphConverter {

	protected String layer;
	protected JGraphTProject tgtPrj;
	
	protected String getLayer() {
		return layer;
	}
	protected abstract void selectFeatures() throws Exception;

	protected abstract ArrayList<ConvertibleObject> getSourceObjects(String layer);

	protected void convertObjects() throws Exception {
		for (ConvertibleObject co : getSourceObjects(getLayer())) {
			convertFeature(co);
			convertAbstractScenarios(co);
		}
	}

	protected abstract void convertFeature(ConvertibleObject object) throws Exception;

	protected abstract void convertAbstractScenarios(ConvertibleObject object) throws Exception;

	protected abstract String convertObjectName(String fullName);

}
