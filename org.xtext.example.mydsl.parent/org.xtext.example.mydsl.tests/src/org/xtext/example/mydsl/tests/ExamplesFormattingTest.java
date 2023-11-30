package org.xtext.example.mydsl.tests;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyDslInjectorProvider.class)
public class ExamplesFormattingTest extends FormattingTest {

	private StringBuilder getExpected() {

		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\r\n");
		sb.append("\r\n");
		sb.append("  Scenario Outline: Submit a claim\r\n");
		sb.append("\r\n");
		sb.append("    Given do step one\r\n");
		sb.append("\r\n");
		sb.append("    @tag1 @tag2\r\n");
		sb.append("    Examples: Describe what this data is about\r\n");
		sb.append("\r\n");
		sb.append("      Basic EDI claim\r\n");
		sb.append("      No deductible\r\n");
		sb.append("\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("          |   data3 |   data4 |\r\n");
		sb.append("\r\n");
		return sb;
	}

	@Test
	public void formatExamplesNoIssues() {

		assertFormatted((FormatterTestRequest it) -> {
			it.setToBeFormatted(getExpected().toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatExamplesMoreSpaces() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("  Feature:   This is a test feature  \r\n");
			sb.append("\r\n");
			sb.append("    Scenario Outline:   Submit a claim  \r\n");
			sb.append("\r\n");
			sb.append("      Given do step one  \r\n");
			sb.append("\r\n");
			sb.append("      @tag1 @tag2  \r\n");
			sb.append("      Examples:   Describe what this data is about  \r\n");
			sb.append("\r\n");
			sb.append("        Basic EDI claim  \r\n");
			sb.append("        No deductible  \r\n");
			sb.append("\r\n");
			sb.append("            |   Header1   |   Header2   |  \r\n");
			sb.append("            |     data1   |     data2   |  \r\n");
			sb.append("            |     data3   |     data4   |  \r\n");
			sb.append("\r\n");
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatExamplesFewerSpaces() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("Feature: This is a test feature\r\n");
			sb.append("\r\n");
			sb.append("Scenario Outline: Submit a claim\r\n");
			sb.append("\r\n");
			sb.append("Given do step one\r\n");
			sb.append("\r\n");
			sb.append("@tag1 @tag2\r\n");
			sb.append("Examples: Describe what this data is about\r\n");
			sb.append("\r\n");
			sb.append("Basic EDI claim\r\n");
			sb.append("No deductible\r\n");
			sb.append("\r\n");
			sb.append("| Header1 | Header2 |\r\n");
			sb.append("|data1 |data2 |\r\n");
			sb.append("|data3 |data4 |\r\n");
			sb.append("\r\n");
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatExamplesMoreEOL() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("Feature: This is a test feature\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("  Scenario Outline: Submit a claim\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("    Given do step one\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("    @tag1 @tag2\r\n");
			sb.append("\r\n");
			sb.append("    Examples: Describe what this data is about\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("      Basic EDI claim\r\n");
			sb.append("\r\n");
			sb.append("      No deductible\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("          | Header1 | Header2 |\r\n");
			sb.append("\r\n");
			sb.append("          |   data1 |   data2 |\r\n");
			sb.append("\r\n");
			sb.append("          |   data3 |   data4 |\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}
}
