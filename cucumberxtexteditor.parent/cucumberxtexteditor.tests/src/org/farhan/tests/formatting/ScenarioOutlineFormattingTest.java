package org.farhan.tests.formatting;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.farhan.tests.CucumberInjectorProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(CucumberInjectorProvider.class)
public class ScenarioOutlineFormattingTest extends FormattingTest {

	private StringBuilder getExpected() {

		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\r\n");
		sb.append("\r\n");
		sb.append("  @tag1\r\n");
		sb.append("  Scenario Outline: Submit a claim\r\n");
		sb.append("\r\n");
		sb.append("    Basic EDI claim\r\n");
		sb.append("    No deductible\r\n");
		sb.append("\r\n");
		sb.append("    Given do step one\r\n");
		sb.append("     When do step three\r\n");
		sb.append("\r\n");
		sb.append("    Examples: Describe what this data is about\r\n");
		sb.append("\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("\r\n");
		assertNoErrors(sb);
		return sb;
	}

	@Test
	public void formatScenarioOutlineNoIssues() {

		assertFormatted((FormatterTestRequest it) -> {
			it.setToBeFormatted(getExpected().toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatScenarioOutlineMoreSpaces() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("  Feature:   This is a test feature  \r\n");
			sb.append("\r\n");
			sb.append("    @tag1  \r\n");
			sb.append("    Scenario Outline: Submit a claim  \r\n");
			sb.append("\r\n");
			sb.append("      Basic EDI claim  \r\n");
			sb.append("      No deductible  \r\n");
			sb.append("\r\n");
			sb.append("      Given do step one  \r\n");
			sb.append("       When do step three  \r\n");
			sb.append("\r\n");
			sb.append("      Examples:   Describe what this data is about  \r\n");
			sb.append("\r\n");
			sb.append("            |   Header1   |   Header2   |  \r\n");
			sb.append("\r\n");
			assertNoErrors(sb);
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatScenarioOutlineFewerSpaces() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("Feature: This is a test feature\r\n");
			sb.append("\r\n");
			sb.append("@tag1\r\n");
			sb.append("Scenario Outline: Submit a claim\r\n");
			sb.append("\r\n");
			sb.append("Basic EDI claim\r\n");
			sb.append("No deductible\r\n");
			sb.append("\r\n");
			sb.append("Given do step one\r\n");
			sb.append("When do step three\r\n");
			sb.append("\r\n");
			sb.append("Examples: Describe what this data is about\r\n");
			sb.append("\r\n");
			sb.append("| Header1 | Header2 |\r\n");
			sb.append("\r\n");
			assertNoErrors(sb);
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatScenarioOutlineMoreEOL() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("Feature: This is a test feature\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("  @tag1\r\n");
			sb.append("  Scenario Outline: Submit a claim\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("    Basic EDI claim\r\n");
			sb.append("    No deductible\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("    Given do step one\r\n");
			sb.append("\r\n");
			sb.append("     When do step three\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("    Examples: Describe what this data is about\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("          | Header1 | Header2 |\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			assertNoErrors(sb);
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}
}
