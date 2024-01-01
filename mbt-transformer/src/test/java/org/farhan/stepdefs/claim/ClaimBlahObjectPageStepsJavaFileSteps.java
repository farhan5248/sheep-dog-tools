package org.farhan.stepdefs.claim;

import org.farhan.common.objects.ClaimFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class ClaimBlahObjectPageStepsJavaFileSteps extends TestSteps {

    @Given("^The claim project, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be as follows$")
    public void TheClaimProjectBlahObjectPageStepsJavaFileWillBeAsFollows(String docString) {
        ClaimFactory.get("BlahObjectPageStepsFile").assertAttributes(docString);
    }

    @Given("^The claim project, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file is as follows$")
    public void TheClaimProjectBlahObjectPageStepsJavaFileIsAsFollows(String docString) {
        ClaimFactory.get("BlahObjectPageStepsFile").setAttributes(docString);
    }
}
