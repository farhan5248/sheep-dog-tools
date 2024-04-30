package org.farhan.objects.mbttransformer;

import java.util.HashMap;

public interface ProcessAdocFile {

	public void assertContent(HashMap<String, String> keyMap);

	public void setContent(HashMap<String, String> keyMap);

	public void assertPresent(HashMap<String, String> keyMap);

	public void assertFeatureSectionName(HashMap<String, String> keyMap);

	public void assertFeatureSectionTags(HashMap<String, String> keyMap);

	public void assertBackgroundSectionName(HashMap<String, String> keyMap);

	public void assertBackgroundStepsSectionName(HashMap<String, String> keyMap);

	public void assertBackgroundStepsSectionStep(HashMap<String, String> keyMap);

	public void assertScenariosSectionName(HashMap<String, String> keyMap);

	public void assertScenariosStepsSectionName(HashMap<String, String> keyMap);

	public void assertScenariosStepsSectionStep(HashMap<String, String> keyMap);

	public void assertScenariosStepsDocStringSectionName(HashMap<String, String> keyMap);

	public void assertScenariosStepsDocStringSectionStep(HashMap<String, String> keyMap);

	public void assertScenariosStepsDocStringSectionContent(HashMap<String, String> keyMap);
}
