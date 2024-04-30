package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FeatureFileObject;
import org.farhan.objects.mbttransformer.ProcessFeatureFile;

public class ProcessFeatureFileImpl extends FeatureFileObject implements ProcessFeatureFile {

	@Override
	public void assertBackgroundStepsDocStringSectionContent(HashMap<String, String> keyMap) {
		assertBackgroundStepDocString(keyMap.get("Name"), keyMap.get("Step"), keyMap.get("Content"));
	}

	@Override
	public void assertBackgroundStepsDocStringSectionName(HashMap<String, String> keyMap) {
		assertBackgroundExists(keyMap.get("Name"));
	}

	@Override
	public void assertBackgroundStepsDocStringSectionStep(HashMap<String, String> keyMap) {
		assertBackgroundStepExists(keyMap.get("Name"), keyMap.get("Step"));
	}

	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

	@Override
	public void assertFeatureSectionName(HashMap<String, String> keyMap) {
		assertFeatureExists(keyMap.get("Name"));
	}

	@Override
	public void assertFeatureSectionTags(HashMap<String, String> keyMap) {
		assertFeatureTags(keyMap.get("Name"), keyMap.get("Tags"));
	}

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		assertDocumentExists();
	}

	@Override
	public void assertScenarioOutlineExamplesTableSectionExamples(HashMap<String, String> keyMap) {
		assertScenarioOutlineExamplesExists(keyMap.get("Name"), keyMap.get("Examples"));
	}

	@Override
	public void assertScenarioOutlineExamplesTableSectionName(HashMap<String, String> keyMap) {
		assertScenarioOutlineExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenarioOutlineExamplesTableSectionRow(HashMap<String, String> keyMap) {
		assertScenarioOutlineExamplesTableRowExists(keyMap.get("Name"), keyMap.get("Examples"), keyMap.get("Row"));
	}

	@Override
	public void assertScenarioOutlineStepsDataTableSectionName(HashMap<String, String> keyMap) {
		assertScenarioOutlineExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenarioOutlineStepsDataTableSectionRow(HashMap<String, String> keyMap) {
		assertScenarioOutlineStepDataTableRowExists(keyMap.get("Name"), keyMap.get("Step"), keyMap.get("Row"));
	}

	@Override
	public void assertScenarioOutlineStepsDataTableSectionStep(HashMap<String, String> keyMap) {
		assertScenarioOutlineStepExists(keyMap.get("Name"), keyMap.get("Step"));
	}

	@Override
	public void assertScenariosSectionDescription(HashMap<String, String> keyMap) {
		assertScenarioDescription(keyMap.get("Name"), keyMap.get("Description"));
	}

	@Override
	public void assertScenariosSectionName(HashMap<String, String> keyMap) {
		assertScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenariosSectionTags(HashMap<String, String> keyMap) {
		assertScenarioTags(keyMap.get("Name"), keyMap.get("Tags"));
	}

	@Override
	public void assertScenariosStepsSectionName(HashMap<String, String> keyMap) {
		assertScenarioExists(keyMap.get("Name"));
	}

	@Override
	public void assertScenariosStepsSectionStep(HashMap<String, String> keyMap) {
		assertScenarioStepExists(keyMap.get("Name"), keyMap.get("Step"));
	}

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
