package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ToGraphLayerConverter {

	protected abstract void selectLayerFiles(String layerSelectionCriteria) throws Exception;

	protected abstract ArrayList<ConvertibleFile> getLayerFiles(String layer);

	protected void transformLayerFiles(String layer) throws Exception {
		for (ConvertibleFile layerFile : getLayerFiles(layer)) {
			transformLayerFile(layerFile);
		}
	}

	protected abstract void transformLayerFile(ConvertibleFile layerFile) throws Exception;
}
