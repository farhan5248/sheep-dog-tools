package org.farhan.helper;

public class ScenarioHelper {
	// TODO maybe move all step validation logic from the ui project here so that
	// tests can be made

	public static String validate(ILanguageAccess la) throws Exception {

		if (StepHelper.getComponent(la.getAllSteps().getFirst()).isEmpty()) {
			return "The first step must have a component";
		} else {
			return "";
		}
	}
}
