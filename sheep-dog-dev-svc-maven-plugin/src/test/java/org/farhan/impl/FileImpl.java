package org.farhan.impl;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.specprj.src.test.resources.asciidoc.specs.app.ProcessAsciidocFile;
import org.farhan.objects.specprj.src.test.resources.asciidoc.stepdefs.blahapplication.ObjectPageAsciidocFile;
import org.farhan.objects.codeprj.srcgen.test.java.org.farhan.objects.blah.ObjectPageJavaFile;
import org.farhan.objects.codeprj.srcgen.test.java.org.farhan.stepdefs.blah.BlahObjectPageStepsJavaFile;
import org.farhan.objects.codeprj.srcgen.test.resources.cucumber.specs.app.ProcessFeatureFile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class FileImpl extends FileObject
		implements BlahObjectPageStepsJavaFile, ProcessAsciidocFile, ProcessFeatureFile, ObjectPageAsciidocFile,
		ObjectPageJavaFile, org.farhan.objects.codeprj.srcgen.test.resources.cucumber.specs.ProcessFeatureFile,
		org.farhan.objects.specprj.src.test.resources.asciidoc.specs.ProcessAsciidocFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		assertObjectExists();
	}

	@Override
	public void assertScenariosStepsDocStringSectionName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenariosStepsDocStringSectionStep(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenariosStepsDocStringSectionContent(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenariosStepsStepTableSectionName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenariosStepsStepTableSectionStep(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenariosStepsStepTableSectionRow(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertBackgroundStepsSectionName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertBackgroundStepsSectionStep(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertBackgroundSectionName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertBackgroundSectionDescription(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertFeatureSectionName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertFeatureSectionTags(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertFeatureSectionStatements(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenarioOutlineExamplesTableSectionName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenarioOutlineExamplesTableSectionExamples(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenarioOutlineExamplesTableSectionRow(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenarioOutlineStepsDataTableSectionName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenarioOutlineStepsDataTableSectionStep(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenarioOutlinesSectionName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenarioOutlinesSectionTags(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenarioOutlinesSectionDescription(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenarioStepsDataTableSectionName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenarioStepsDataTableSectionStep(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenarioStepsDataTableSectionRow(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenarioStepsDocStringSectionName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenarioStepsDocStringSectionStep(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenarioStepsDocStringSectionContent(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenariosStepsSectionName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenariosStepsSectionStep(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenariosSectionName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenariosSectionTags(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertScenariosSectionDescription(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertObjectSectionInterfaceName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertObjectSectionName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertObjectSectionStatements(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertStepDefinitionParametersTableSectionName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertStepDefinitionParametersTableSectionParameters(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertStepDefinitionParametersTableSectionRow(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertStepDefinitionSectionName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertStepDefinitionSectionDescription(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDeleted(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertFieldsSectionMethodName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertFieldsSectionAnnotation(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertFieldsSectionVisibility(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertFieldsSectionReturnType(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertFieldsSectionStatement(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertFieldsSectionParameterName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertFieldsSectionParameterType(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertObjectSectionImport(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertObjectSectionClassName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertObjectSectionPackage(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertObjectSectionExtends(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertObjectSectionConstructorName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertObjectSectionStatement(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertObjectSectionClassAnnotation(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assertObjectSectionConstructorAnnotation(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub
		
	}
}
