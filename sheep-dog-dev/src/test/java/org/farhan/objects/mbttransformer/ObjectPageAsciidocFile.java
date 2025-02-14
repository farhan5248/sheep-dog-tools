package org.farhan.objects.mbttransformer;

import java.util.HashMap;

public interface ObjectPageAsciidocFile {

    public void setContent(HashMap<String, String> keyMap);

    public void assertPresent(HashMap<String, String> keyMap);

    public void assertStepDefinitionParametersTableSectionName(HashMap<String, String> keyMap);

    public void assertStepDefinitionParametersTableSectionParameters(HashMap<String, String> keyMap);

    public void assertStepDefinitionParametersTableSectionRow(HashMap<String, String> keyMap);

    public void assertStepDefinitionSectionName(HashMap<String, String> keyMap);

    public void assertStepDefinitionSectionDescription(HashMap<String, String> keyMap);

    public void assertObjectSectionName(HashMap<String, String> keyMap);

    public void assertObjectSectionStatements(HashMap<String, String> keyMap);
}
