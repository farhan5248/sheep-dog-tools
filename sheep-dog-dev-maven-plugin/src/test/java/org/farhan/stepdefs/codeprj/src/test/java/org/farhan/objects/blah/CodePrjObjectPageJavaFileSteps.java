package org.farhan.stepdefs.codeprj.src.test.java.org.farhan.objects.blah;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.codeprj.src.test.java.org.farhan.objects.blah.ObjectPageJavaFile;

@ScenarioScoped
public class CodePrjObjectPageJavaFileSteps extends TestSteps {

    @Inject
    public CodePrjObjectPageJavaFileSteps(ObjectPageJavaFile object) {
        super(object);
    }

    @Given("^The code-prj project, src/test/java/org/farhan/objects/blah/ObjectPage.java file is created as follows$")
    public void theCodePrjProjectSrcTestJavaOrgFarhanObjectsBlahObjectPageJavaFileIsCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
        object.setInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be created as follows$")
    public void theCodePrjProjectSrcTestJavaOrgFarhanObjectsBlahObjectPageJavaFileWillBeCreatedAsFollows(String docString) {
        object.setComponent("code-prj");
        object.setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
        object.assertInputOutputs("Content", docString);
    }

    @Given("^The code-prj project, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be present$")
    public void theCodePrjProjectSrcTestJavaOrgFarhanObjectsBlahObjectPageJavaFileWillBePresent() {
        object.setComponent("code-prj");
        object.setPath("src/test/java/org/farhan/objects/blah/ObjectPage.java");
        object.assertInputOutputs("Present");
    }
}
