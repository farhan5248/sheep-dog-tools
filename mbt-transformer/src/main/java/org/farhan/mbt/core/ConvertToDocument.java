package org.farhan.mbt.core;

import java.util.ArrayList;

import org.farhan.mbt.asciidoctor.AsciiDoctorProject;

public abstract class ConvertToDocument implements MojoGoal {

	protected AsciiDoctorProject tgtPrj;

	protected abstract void save() throws Exception;

	protected abstract void initProjects() throws Exception;

	public void mojoGoal() throws Exception {

		initProjects();
		loadFeatures();
		convertFeatures();
		save();
	}

	protected abstract void convertFeature(ConvertibleObject object) throws Exception;

	protected void convertFeatures() throws Exception {
		for (ConvertibleObject co : getFeatures(tgtPrj.FIRST_LAYER)) {
			convertFeature(co);
		}
	}

	protected abstract ArrayList<ConvertibleObject> getFeatures(String layer);

	protected abstract void loadFeatures() throws Exception;

}
