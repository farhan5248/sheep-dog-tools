package org.farhan.stepdefs.claim;

import org.farhan.common.objects.ClaimFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class ClaimBlah2JsonRequestStepsJavaFileSteps extends TestSteps {

    @Given("^The claim project, src/test/java/org/farhan/stepdefs/blah2/Blah2JsonRequestSteps.java file will be as follows$")
    public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
        ClaimFactory.get("Blah2JsonRequestStepsFile").assertAttributes(docString);
    }
}
