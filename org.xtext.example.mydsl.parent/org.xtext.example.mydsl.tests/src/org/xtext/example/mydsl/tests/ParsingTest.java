package org.xtext.example.mydsl.tests;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.xtext.example.mydsl.myDsl.Feature;

import com.google.inject.Inject;

public class ParsingTest {

	@Inject
	protected ParseHelper<Feature> parseHelper;

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
