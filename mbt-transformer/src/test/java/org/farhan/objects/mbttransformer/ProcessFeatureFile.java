package org.farhan.objects.mbttransformer;

import java.util.HashMap;

public interface ProcessFeatureFile {

    public void setContent(HashMap<String, String> keyMap);

    public void assertPresent(HashMap<String, String> keyMap);

    public void assertFeatureSectionName(HashMap<String, String> keyMap);

    public void assertFeatureSectionTags(HashMap<String, String> keyMap);

    public void assertBackgroundStepsDocStringSectionName(HashMap<String, String> keyMap);

    public void assertBackgroundStepsDocStringSectionStep(HashMap<String, String> keyMap);

    public void assertBackgroundStepsDocStringSectionContent(HashMap<String, String> keyMap);

    public void assertScenariosSectionName(HashMap<String, String> keyMap);

    public void assertScenariosSectionTags(HashMap<String, String> keyMap);

    public void assertScenariosSectionDescription(HashMap<String, String> keyMap);

    public void assertScenariosStepsSectionName(HashMap<String, String> keyMap);

    public void assertScenariosStepsSectionStep(HashMap<String, String> keyMap);

    public void assertScenarioOutlineStepsDataTableSectionName(HashMap<String, String> keyMap);

    public void assertScenarioOutlineStepsDataTableSectionStep(HashMap<String, String> keyMap);

    public void assertScenarioOutlineStepsDataTableSectionRow(HashMap<String, String> keyMap);

    public void assertScenarioOutlineExamplesTableSectionName(HashMap<String, String> keyMap);

    public void assertScenarioOutlineExamplesTableSectionExamples(HashMap<String, String> keyMap);

    public void assertScenarioOutlineExamplesTableSectionRow(HashMap<String, String> keyMap);
}
