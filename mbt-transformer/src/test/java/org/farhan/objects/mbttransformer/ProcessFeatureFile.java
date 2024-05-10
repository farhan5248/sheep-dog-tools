package org.farhan.objects.mbttransformer;

import java.util.HashMap;

public interface ProcessFeatureFile {

    public void assertBackgroundSectionDescription(HashMap<String, String> keyMap);

    public void assertBackgroundSectionName(HashMap<String, String> keyMap);

    public void assertBackgroundStepsDocStringSectionContent(HashMap<String, String> keyMap);

    public void assertBackgroundStepsDocStringSectionName(HashMap<String, String> keyMap);

    public void assertBackgroundStepsDocStringSectionStep(HashMap<String, String> keyMap);

    public void assertBackgroundStepsSectionName(HashMap<String, String> keyMap);

    public void assertBackgroundStepsSectionStep(HashMap<String, String> keyMap);

    public void assertFeatureSectionName(HashMap<String, String> keyMap);

    public void assertFeatureSectionTags(HashMap<String, String> keyMap);

    public void assertPresent(HashMap<String, String> keyMap);

    public void assertScenarioOutlineExamplesTableSectionExamples(HashMap<String, String> keyMap);

    public void assertScenarioOutlineExamplesTableSectionName(HashMap<String, String> keyMap);

    public void assertScenarioOutlineExamplesTableSectionRow(HashMap<String, String> keyMap);

    public void assertScenarioOutlinesSectionDescription(HashMap<String, String> keyMap);

    public void assertScenarioOutlinesSectionName(HashMap<String, String> keyMap);

    public void assertScenarioOutlinesSectionTags(HashMap<String, String> keyMap);

    public void assertScenarioOutlineStepsStepTableSectionName(HashMap<String, String> keyMap);

    public void assertScenarioOutlineStepsStepTableSectionRow(HashMap<String, String> keyMap);

    public void assertScenarioOutlineStepsStepTableSectionStep(HashMap<String, String> keyMap);

    public void assertScenariosSectionDescription(HashMap<String, String> keyMap);

    public void assertScenariosSectionName(HashMap<String, String> keyMap);

    public void assertScenariosSectionTags(HashMap<String, String> keyMap);

    public void assertScenariosStepsSectionName(HashMap<String, String> keyMap);

    public void assertScenariosStepsSectionStep(HashMap<String, String> keyMap);

    public void assertScenarioStepsStepTableSectionName(HashMap<String, String> keyMap);

    public void assertScenarioStepsStepTableSectionRow(HashMap<String, String> keyMap);

    public void assertScenarioStepsStepTableSectionStep(HashMap<String, String> keyMap);

    public void assertScenarioStepsDocStringSectionContent(HashMap<String, String> keyMap);

    public void assertScenarioStepsDocStringSectionName(HashMap<String, String> keyMap);

    public void assertScenarioStepsDocStringSectionStep(HashMap<String, String> keyMap);

    public void setContent(HashMap<String, String> keyMap);
}
