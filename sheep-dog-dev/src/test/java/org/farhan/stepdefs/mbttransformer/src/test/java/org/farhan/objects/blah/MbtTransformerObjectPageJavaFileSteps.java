package org.farhan.stepdefs.mbttransformer.src.test.java.org.farhan.objects.blah;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.src.test.java.org.farhan.objects.blah.ObjectPageJavaFile;

@ScenarioScoped
public class MbtTransformerObjectPageJavaFileSteps extends TestSteps {

	@Inject
	public MbtTransformerObjectPageJavaFileSteps(ObjectPageJavaFile object) {
		super(object);
	}

	@Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file Fields section will be created as follows$")
	public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahObjectPageJavaFileFieldsSectionWillBeCreatedAsFollows(
			DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
		object.assertInputOutputs(dataTable, "FieldsSection");
	}

	@Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file is created as follows$")
	public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahObjectPageJavaFileIsCreatedAsFollows(
			String docString) {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
		object.setInputOutputs("Content", docString);
	}

	@Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file Object section will be created as follows$")
	public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahObjectPageJavaFileObjectSectionWillBeCreatedAsFollows(
			DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
		object.assertInputOutputs(dataTable, "ObjectSection");
	}

	@Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be created as follows$")
	public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahObjectPageJavaFileWillBeCreatedAsFollows(
			String docString) {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
		object.assertInputOutputs("Content", docString);
	}

	@Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be present$")
	public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsBlahObjectPageJavaFileWillBePresent() {
		object.setComponent("mbt-transformer");
		object.setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
		object.assertInputOutputs("Present");
	}
}
