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
	public void assertScenariosSectionDescription(HashMap<String, String> keyMap) {
		assertAbstractScenarioDescription(keyMap.get("Name"), keyMap.get("Description"));
	}

	@Override
	public void assertScenariosSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenariosSectionTags(HashMap<String, String> keyMap) {
		assertAbstractScenarioTags(keyMap.get("Name"), keyMap.get("Tags"));
	}

	@Override
	public void assertScenariosStepsDocStringSectionContent(HashMap<String, String> keyMap) {
		assertDocString(keyMap.get("Name"), keyMap.get("Step"), keyMap.get("Content"));
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
	public void assertScenariosStepsSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenariosStepsSectionStep(HashMap<String, String> keyMap) {
		assertStepExists(keyMap.get("Name"), keyMap.get("Step"));
	}

	@Override
	public void assertScenariosStepsStepTableSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenariosStepsStepTableSectionRow(HashMap<String, String> keyMap) {
		assertAbstractScenarioStepDataTableRowExists(keyMap.get("Name"), keyMap.get("Step"), keyMap.get("Row"));
	}

	@Override
	public void assertScenariosStepsStepTableSectionStep(HashMap<String, String> keyMap) {
		assertStepExists(keyMap.get("Name"), keyMap.get("Step"));
	}

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

}
