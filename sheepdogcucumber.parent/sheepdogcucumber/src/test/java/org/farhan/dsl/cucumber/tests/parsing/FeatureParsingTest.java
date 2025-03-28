/*
 * generated by Xtext 2.32.0
 */
package org.farhan.dsl.cucumber.tests.parsing;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.farhan.dsl.cucumber.tests.CucumberInjectorProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(CucumberInjectorProvider.class)
public class FeatureParsingTest extends ParsingTest {

	@Test
	public void parseFeatureWithName() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		assertNoFeatureErrors(sb);
	}

	@Test
	public void parseFeatureWithoutName() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature:\n");
		assertFeatureErrors(sb);
	}

	@Test
	public void parseFeatureWithoutNameEOL() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature");
		assertFeatureErrors(sb);
	}

	@Test
	public void parseFeatureWithTags() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("@tag1\n");
		sb.append("Feature: This is a test feature\n");
		assertNoFeatureErrors(sb);
	}

	@Test
	public void parseFeatureWithDescription() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		sb.append("This is the description\n");
		sb.append("This is the second line of the description\n");
		assertNoFeatureErrors(sb);
	}

	@Test
	public void parseFeatureWithoutDescriptionEOL() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		sb.append("This is the description");
		assertFeatureErrors(sb);
	}

	@Test
	public void parseFeatureWithEverything() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("@tag1 @tag2 @tag3\n");
		sb.append("Feature: This is a test feature\n");
		sb.append("This is the description\n");
		sb.append("This is the second line of the description\n");
		assertNoFeatureErrors(sb);
	}

}
