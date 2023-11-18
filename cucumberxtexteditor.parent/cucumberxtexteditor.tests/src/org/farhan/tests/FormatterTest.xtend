package org.farhan.tests

import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.formatter.FormatterTestHelper
import com.google.inject.Inject
import org.junit.jupiter.api.Test

@ExtendWith(InjectionExtension)
@InjectWith(CucumberInjectorProvider)
class FormatterTest {

	@Inject extension FormatterTestHelper

	//@Test
	def void indentLines() {
		assertFormatted[
			toBeFormatted = '''
				Feature: This is a new story
			'''
			expectation = '''
				Feature: This is a new story
			'''
		]
	}
}
