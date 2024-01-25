package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ToGraphLayerConverter {

	protected abstract void selectLayerFiles(String layerSelectionCriteria) throws Exception;

	protected void transformLayerFiles(ArrayList<ConvertibleFile> layerFiles) throws Exception {

		for (ConvertibleFile layerFile : layerFiles) {
			// TODO replace this with a logger
			System.out.println(layerFile.getFile().getAbsolutePath());
			transformLayerFile(layerFile);
		}
	}
	
	protected abstract void transformLayerFile(ConvertibleFile layerFile) throws Exception;
}
