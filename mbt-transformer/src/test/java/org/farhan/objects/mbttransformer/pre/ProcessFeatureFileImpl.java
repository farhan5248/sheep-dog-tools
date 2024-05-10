package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FeatureFileObject;
import org.farhan.objects.mbttransformer.ProcessFeatureFile;

public class ProcessFeatureFileImpl extends FeatureFileObject implements ProcessFeatureFile {

	@Override
	public void assertBackgroundSectionDescription(HashMap<String, String> keyMap) {
		assertAbstractScenarioDescription(keyMap.get("Name"), keyMap.get("Description"));
	}

	@Override
	public void assertBackgroundSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertBackgroundStepsDocStringSectionContent(HashMap<String, String> keyMap) {
		assertDocString(keyMap.get("Name"), keyMap.get("Step"), keyMap.get("Content"));
	}

	@Override
	public void assertBackgroundStepsDocStringSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertBackgroundStepsDocStringSectionStep(HashMap<String, String> keyMap) {
		assertStepExists(keyMap.get("Name"), keyMap.get("Step"));
	}

	@Override
	public void assertBackgroundStepsSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertBackgroundStepsSectionStep(HashMap<String, String> keyMap) {
		assertStepExists(keyMap.get("Name"), keyMap.get("Step"));
	}

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
	public void assertScenarioOutlineExamplesTableSectionExamples(HashMap<String, String> keyMap) {
		assertScenarioOutlineExamplesExists(keyMap.get("Name"), keyMap.get("Examples"));
	}

	@Override
	public void assertScenarioOutlineExamplesTableSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenarioOutlineExamplesTableSectionRow(HashMap<String, String> keyMap) {
		assertScenarioOutlineExamplesTableRowExists(keyMap.get("Name"), keyMap.get("Examples"), keyMap.get("Row"));
	}

	@Override
	public void assertScenarioOutlinesSectionDescription(HashMap<String, String> keyMap) {
		assertAbstractScenarioDescription(keyMap.get("Name"), keyMap.get("Description"));
	}

	@Override
	public void assertScenarioOutlinesSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenarioOutlinesSectionTags(HashMap<String, String> keyMap) {
		assertAbstractScenarioTags(keyMap.get("Name"), keyMap.get("Tags"));
	}

	@Override
	public void assertScenarioOutlineStepsStepTableSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenarioOutlineStepsStepTableSectionRow(HashMap<String, String> keyMap) {
		assertAbstractScenarioStepDataTableRowExists(keyMap.get("Name"), keyMap.get("Step"), keyMap.get("Row"));
	}

	@Override
	public void assertScenarioOutlineStepsStepTableSectionStep(HashMap<String, String> keyMap) {
		assertStepExists(keyMap.get("Name"), keyMap.get("Step"));
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
	public void assertScenariosStepsSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenariosStepsSectionStep(HashMap<String, String> keyMap) {
		assertStepExists(keyMap.get("Name"), keyMap.get("Step"));
	}

	@Override
	public void assertScenarioStepsStepTableSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenarioStepsStepTableSectionRow(HashMap<String, String> keyMap) {
		assertAbstractScenarioStepDataTableRowExists(keyMap.get("Name"), keyMap.get("Step"), keyMap.get("Row"));
	}

	@Override
	public void assertScenarioStepsStepTableSectionStep(HashMap<String, String> keyMap) {
		assertStepExists(keyMap.get("Name"), keyMap.get("Step"));
	}

	@Override
	public void assertScenarioStepsDocStringSectionContent(HashMap<String, String> keyMap) {
		assertDocString(keyMap.get("Name"), keyMap.get("Step"), keyMap.get("Content"));
	}

	@Override
	public void assertScenarioStepsDocStringSectionName(HashMap<String, String> keyMap) {
		assertAbstractScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenarioStepsDocStringSectionStep(HashMap<String, String> keyMap) {
		assertStepExists(keyMap.get("Name"), keyMap.get("Step"));
	}

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
