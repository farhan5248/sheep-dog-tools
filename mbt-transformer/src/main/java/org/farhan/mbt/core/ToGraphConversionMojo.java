package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ToGraphConversionMojo {

	// TODO there aren't supposed to be linkers anymore and there should just be a
	// list of converters for layers, so if there's 1 or 4 the pattern stays the
	// same. This class would just register a list of them and a
	// getNextLayerConverter would be called in a loop
	protected ToGraphFirstLayerConverter firstLayerConverter;

	protected abstract ToGraphFirstLayerConverter getFirstLayerConverter();

	protected abstract ArrayList<ConvertibleFile> getFirstLayerFiles();

	protected abstract void writeFiles() throws Exception;

	protected abstract void initProjects();

	public void mojoGoal() throws Exception {

		initProjects();
		firstLayerConverter = getFirstLayerConverter();
		firstLayerConverter.selectLayerFiles(Project.firstLayerPackageName);
		firstLayerConverter.transformLayerFiles(getFirstLayerFiles());
		writeFiles();
	}
}
