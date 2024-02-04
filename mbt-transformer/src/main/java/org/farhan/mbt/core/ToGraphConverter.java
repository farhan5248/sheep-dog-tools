package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ToGraphConverter {

	protected abstract String getLayer();

	protected abstract void selectLayerObjects() throws Exception;

	protected abstract ArrayList<ConvertibleObject> getLayerObjects(String layer);

	protected void convertObjects() throws Exception {
		for (ConvertibleObject layerFile : getLayerObjects(getLayer())) {
			convertObject(layerFile);
		}
	}

	protected abstract void convertObject(ConvertibleObject layerFile) throws Exception;
}
