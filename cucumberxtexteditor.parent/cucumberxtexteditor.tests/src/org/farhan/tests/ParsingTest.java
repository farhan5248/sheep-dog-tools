package org.farhan.tests;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.farhan.cucumber.Feature;
import org.junit.jupiter.api.Assertions;

import com.google.inject.Inject;

public class ParsingTest {

	@Inject
	protected ParseHelper<Feature> parseHelper;

	@Inject
	protected ValidationTestHelper validationTestHelper;

	protected void assertNoErrors(StringBuilder sb) throws Exception {
		Feature result = parseHelper.parse(sb.toString());
		Assertions.assertNotNull(result);
		List<Diagnostic> errors = result.eResource().getErrors();
		Assertions.assertTrue(errors.isEmpty(), "Unexpected errors: " + IterableExtensions.join(errors, ", "));
	}

	protected void assertErrors(StringBuilder sb) throws Exception {
		Feature result = parseHelper.parse(sb.toString());
		Assertions.assertNotNull(result);
		List<Diagnostic> errors = result.eResource().getErrors();
		Assertions.assertTrue(!errors.isEmpty(), "There should be errors");
	}
}
