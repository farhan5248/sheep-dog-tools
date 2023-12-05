package org.farhan.tests;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(CucumberInjectorProvider.class)
public class ScenarioFormattingTest extends FormattingTest {

	private StringBuilder getExpected() {

		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\r\n");
		sb.append("\r\n");
		sb.append("  @tag1\r\n");
		sb.append("  Scenario: Submit a claim\r\n");
		sb.append("\r\n");
		sb.append("    Basic EDI claim\r\n");
		sb.append("    No deductible\r\n");
		sb.append("\r\n");
		sb.append("    Given do step one\r\n");
		sb.append("     When do step three\r\n");
		sb.append("\r\n");
		assertNoErrors(sb);
		return sb;
	}

	@Test
	public void formatScenarioNoIssues() {

		assertFormatted((FormatterTestRequest it) -> {
			it.setToBeFormatted(getExpected().toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatScenarioMoreSpaces() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("  Feature:   This is a test feature  \r\n");
			sb.append("\r\n");
			sb.append("  @tag1  \r\n");
			sb.append("    Scenario:   Submit a claim  \r\n");
			sb.append("\r\n");
			sb.append("      Basic EDI claim  \r\n");
			sb.append("      No deductible  \r\n");
			sb.append("\r\n");
			sb.append("      Given do step one  \r\n");
			sb.append("       When do step three  \r\n");
			sb.append("\r\n");
			assertNoErrors(sb);
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatScenarioFewerSpaces() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("Feature: This is a test feature\r\n");
			sb.append("\r\n");
			sb.append("@tag1\r\n");
			sb.append("Scenario: Submit a claim\r\n");
			sb.append("\r\n");
			sb.append("Basic EDI claim\r\n");
			sb.append("No deductible\r\n");
			sb.append("\r\n");
			sb.append("Given do step one\r\n");
			sb.append("When do step three\r\n");
			sb.append("\r\n");
			assertNoErrors(sb);
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatScenarioMoreEOL() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("Feature: This is a test feature\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("@tag1\r\n");
			sb.append("\r\n");
			sb.append("  Scenario: Submit a claim");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("    Basic EDI claim\r\n");
			sb.append("\r\n");
			sb.append("    No deductible\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("    Given do step one\r\n");
			sb.append("\r\n");
			sb.append("     When do step three\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			assertNoErrors(sb);
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}
}
