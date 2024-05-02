package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.AdocFileObject;
import org.farhan.objects.mbttransformer.ProcessAdocFile;

public class ProcessAdocFileImpl extends AdocFileObject implements ProcessAdocFile {

	@Override
	public void assertBackgroundSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertBackgroundStepsSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertBackgroundStepsSectionStep(HashMap<String, String> keyMap) {
		assertStepExists(keyMap.get("Name"), keyMap.get("Step"));
	}

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

	@Override
	public void assertFeatureSectionName(HashMap<String, String> keyMap) {
		assertFeatureName(keyMap.get("Name"));
	}

	@Override
	public void assertFeatureSectionTags(HashMap<String, String> keyMap) {
		assertFeatureTags(keyMap.get("Name"), keyMap.get("Tags"));
	}

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		assertObjectExists();
	}

	@Override
	public void assertScenariosSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenariosStepsSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenariosStepsSectionStep(HashMap<String, String> keyMap) {
		assertStepExists(keyMap.get("Name"), keyMap.get("Step"));
	}

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	@Override
	public void assertScenariosStepsDocStringSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenariosStepsDocStringSectionStep(HashMap<String, String> keyMap) {
		assertStepExists(keyMap.get("Name"), keyMap.get("Step"));
	}

	@Override
	public void assertScenariosStepsDocStringSectionContent(HashMap<String, String> keyMap) {
		assertDocString(keyMap.get("Name"), keyMap.get("Step"), keyMap.get("Content"));
	}

}
