package org.farhan.common;

public class FeatureFileObject extends FileObject {

	private static String stepName;

	protected void addStep(String stepName) {
		FeatureFileObject.stepName = stepName;
	}

	public static String getStep() {
		return stepName;
	}
}
