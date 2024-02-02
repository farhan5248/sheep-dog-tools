package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ToGraphLayerConverter {

	protected abstract String getLayer();

	protected abstract void selectLayerFiles() throws Exception;

	protected abstract ArrayList<ConvertibleObject> getLayerFiles(String layer);

	protected void convertObjects() throws Exception {
		for (ConvertibleObject layerFile : getLayerFiles(getLayer())) {
			convertObject(layerFile);
		}
	}

	protected abstract void convertObject(ConvertibleObject layerFile) throws Exception;
}
