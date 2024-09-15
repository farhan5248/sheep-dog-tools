package org.farhan.mbt.tests.validating;

import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.farhan.mbt.tests.parsing.ParsingTest;

import com.google.inject.Inject;

public class ValidatingTest extends ParsingTest {

	@Inject
	protected ValidationTestHelper validationTestHelper;

}
