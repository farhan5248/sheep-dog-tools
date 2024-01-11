/*
 * generated by Xtext 2.32.0
 */
package org.farhan.tests.parsing;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.farhan.tests.CucumberInjectorProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(CucumberInjectorProvider.class)
public class StepParsingTest extends ParsingTest {

	@Test
	public void parseStepWithName() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		sb.append("Scenario: Submit a drug claim\n");
		sb.append("Given do step one\n");
		sb.append("When do step three\n");
		sb.append("Then do step four\n");
		sb.append("And do step two\n");
		sb.append("But do step five\n");
		sb.append("* do step six\n");
		assertNoErrors(sb);
	}

	@Test
	public void parseStepWithoutName() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		sb.append("Scenario: Submit a drug claim\n");
		sb.append("Given\n");
		assertErrors(sb);
	}

	@Test
	public void parseStepWithoutNameEOL() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		sb.append("Scenario: Submit a drug claim\n");
		sb.append("Given do step one");
		assertErrors(sb);
	}

	@Test
	public void parseStepWithTable() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		sb.append("Scenario: Submit a drug claim\n");
		sb.append("Given do step one\n");
		sb.append("| Header1 | Header2 |\n");
		assertNoErrors(sb);
	}

	@Test
	public void parseStepWithMultirowTable() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		sb.append("Scenario: Submit a drug claim\n");
		sb.append("Given do step one\n");
		sb.append("| Header1 | Header2 |\n");
		sb.append("|   data1 |   data2 |\n");
		assertNoErrors(sb);
	}

	@Test
	public void parseStepWithoutTableEOL() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		sb.append("Scenario: Submit a drug claim\n");
		sb.append("Given do step one\n");
		sb.append("| Header1 | Header2 |");
		assertErrors(sb);
	}

	@Test
	public void parseStepWithDocString() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		sb.append("Scenario: Submit a drug claim\n");
		sb.append("Given do step one\n");
		sb.append("\"\"\"\n");
		sb.append("Line1\n");
		sb.append("\"\"\"\n");
		assertNoErrors(sb);
	}

	@Test
	public void parseStepWithMultilineDocString() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		sb.append("Scenario: Submit a drug claim\n");
		sb.append("Given do step one\n");
		sb.append("\"\"\"\n");
		sb.append("Line1\n");
		sb.append("Line2\n");
		sb.append("Line3\n");
		sb.append("\"\"\"\n");
		assertNoErrors(sb);
	}

	@Test
	public void parseStepWithoutDocStringEOL() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		sb.append("Scenario: Submit a drug claim\n");
		sb.append("Given do step one\n");
		sb.append("\"\"\"\n");
		sb.append("Line1\n");
		sb.append("\"\"\"");
		assertErrors(sb);
	}

	@Test
	public void parseStepWithDocStringEmpty() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		sb.append("Scenario: Submit a drug claim\n");
		sb.append("Given do step one\n");
		sb.append("\"\"\"\n");
		sb.append("\"\"\"\n");
		assertErrors(sb);
	}

	@Test
	public void parseStepWithDocStringIncomplete() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		sb.append("Scenario: Submit a drug claim\n");
		sb.append("Given do step one\n");
		sb.append("\"\"\"\n");
		assertErrors(sb);
	}

	@Test
	public void parseStepWithEverything() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\n");
		sb.append("Scenario: Submit a drug claim\n");
		sb.append("Given do step one\n");
		sb.append("| Header1 | Header2 |\n");
		sb.append("|   data1 |   data2 |\n");
		sb.append("When do step three\n");
		sb.append("| Header1 | Header2 |\n");
		sb.append("|   data1 |   data2 |\n");
		sb.append("Then do step four\n");
		sb.append("| Header1 | Header2 |\n");
		sb.append("|   data1 |   data2 |\n");
		sb.append("And do step two\n");
		sb.append("| Header1 | Header2 |\n");
		sb.append("|   data1 |   data2 |\n");
		sb.append("But do step five\n");
		sb.append("| Header1 | Header2 |\n");
		sb.append("|   data1 |   data2 |\n");
		sb.append("* do step six\n");
		sb.append("| Header1 | Header2 |\n");
		sb.append("|   data1 |   data2 |\n");
		sb.append("Given do step one\n");
		sb.append("\"\"\"\n");
		sb.append("Line1\n");
		sb.append("\"\"\"\n");
		sb.append("When do step three\n");
		sb.append("\"\"\"\n");
		sb.append("Line1\n");
		sb.append("\"\"\"\n");
		sb.append("Then do step four\n");
		sb.append("\"\"\"\n");
		sb.append("Line1\n");
		sb.append("\"\"\"\n");
		sb.append("And do step two\n");
		sb.append("\"\"\"\n");
		sb.append("Line1\n");
		sb.append("\"\"\"\n");
		sb.append("But do step five\n");
		sb.append("\"\"\"\n");
		sb.append("Line1\n");
		sb.append("\"\"\"\n");
		sb.append("* do step six\n");
		sb.append("\"\"\"\n");
		sb.append("Line1\n");
		sb.append("\"\"\"\n");
		assertNoErrors(sb);
	}
}