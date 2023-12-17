package org.farhan.mbt.conv.cucumber;

import org.eclipse.uml2.uml.Model;
import org.farhan.conv.core.ConversionMojo;
import org.farhan.conv.core.FirstLayerConverter;
import org.farhan.conv.core.FirstLayerLinker;
import org.farhan.conv.core.OtherLayerConverter;
import org.farhan.conv.core.OtherLayerLinker;

public class ConvertCucumberToUMLPSTMojo extends ConversionMojo {

	@Override
	protected OtherLayerConverter getOtherLayerConverter(Model theSystem) {
		return new CucumberOtherLayerConverter(theSystem);
	}

	@Override
	protected FirstLayerConverter getFirstLayerConverter(Model theSystem) {
		return new CucumberFirstLayerConverter(theSystem);
	}

	@Override
	protected OtherLayerLinker getOtherLayerLinker(Model theSystem) {
		return new CucumberOtherLayerLinker(theSystem);
	}

	@Override
	protected FirstLayerLinker getFirstLayerLinker(Model theSystem) {
		return new CucumberFirstLayerLinker(theSystem);
	}

}
