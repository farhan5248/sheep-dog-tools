package org.farhan.mbt.core;

import java.util.ArrayList;

import org.farhan.mbt.asciidoctor.AsciiDoctorProject;

public abstract class ToDocumentConverter {

	protected String layer;
	protected AsciiDoctorProject tgtPrj;

	protected String getLayer() {
		return layer;
	}

	protected abstract void selectObjects() throws Exception;

	protected abstract ArrayList<ConvertibleObject> getObjects(String layer);

	protected void convertObjects() throws Exception {
		for (ConvertibleObject co : getObjects(getLayer())) {
			convertObject(co);
			convertAbstractScenarios(co);
		}
	}

	protected abstract void convertObject(ConvertibleObject object) throws Exception;

	protected abstract void convertAbstractScenarios(ConvertibleObject object) throws Exception;

	protected abstract String convertObjectName(String fullName);
}
