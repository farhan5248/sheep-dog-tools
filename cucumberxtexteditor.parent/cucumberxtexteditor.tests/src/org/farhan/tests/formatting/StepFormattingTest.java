package org.farhan.tests.formatting;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.farhan.tests.CucumberInjectorProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(CucumberInjectorProvider.class)
public class StepFormattingTest extends FormattingTest {

	private StringBuilder getExpected() {

		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\r\n");
		sb.append("\r\n");
		sb.append("  Scenario: Submit a drug claim\r\n");
		sb.append("\r\n");
		sb.append("    Given do step one\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("     When do step three\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("     Then do step four\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("      And do step two\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("      But do step five\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("        * do step six\r\n");
		sb.append("          | Header1 | Header2 |\r\n");
		sb.append("          |   data1 |   data2 |\r\n");
		sb.append("    Given do step one\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("          Line1\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("     When do step three\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("          Line1\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("     Then do step four\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("          Line1\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("      And do step two\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("          Line1\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("      But do step five\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("          Line1\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("        * do step six\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("          Line1\r\n");
		sb.append("          \"\"\"\r\n");
		sb.append("\r\n");
		assertNoErrors(sb);
		return sb;
	}

	@Test
	public void formatStepNoIssues() {

		assertFormatted((FormatterTestRequest it) -> {
			it.setToBeFormatted(getExpected().toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatStepMoreSpaces() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("Feature: This is a test feature\r\n");
			sb.append("\r\n");
			sb.append("  Scenario: Submit a drug claim\r\n");
			sb.append("\r\n");
			sb.append("     Given do step one\r\n");
			sb.append("           |  Header1  |  Header2  | \r\n");
			sb.append("           |    data1  |    data2  | \r\n");
			sb.append("      When do step three\r\n");
			sb.append("           |  Header1  |  Header2  | \r\n");
			sb.append("           |    data1  |    data2  | \r\n");
			sb.append("      Then do step four\r\n");
			sb.append("           |  Header1  |  Header2  | \r\n");
			sb.append("           |    data1  |    data2  | \r\n");
			sb.append("       And do step two\r\n");
			sb.append("           |  Header1  |  Header2  | \r\n");
			sb.append("           |    data1  |    data2  | \r\n");
			sb.append("       But do step five\r\n");
			sb.append("           |  Header1  |  Header2  | \r\n");
			sb.append("           |    data1  |    data2  | \r\n");
			sb.append("         * do step six\r\n");
			sb.append("           |  Header1  |  Header2  | \r\n");
			sb.append("           |    data1  |    data2  | \r\n");
			sb.append("     Given do step one\r\n");
			sb.append("           \"\"\"\r\n");
			sb.append("          Line1\r\n");
			sb.append("           \"\"\"\r\n");
			sb.append("      When do step three\r\n");
			sb.append("           \"\"\"\r\n");
			sb.append("          Line1\r\n");
			sb.append("           \"\"\"\r\n");
			sb.append("      Then do step four\r\n");
			sb.append("           \"\"\"\r\n");
			sb.append("          Line1\r\n");
			sb.append("           \"\"\"\r\n");
			sb.append("       And do step two\r\n");
			sb.append("           \"\"\"\r\n");
			sb.append("          Line1\r\n");
			sb.append("           \"\"\"\r\n");
			sb.append("       But do step five\r\n");
			sb.append("           \"\"\"\r\n");
			sb.append("          Line1\r\n");
			sb.append("           \"\"\"\r\n");
			sb.append("         * do step six\r\n");
			sb.append("           \"\"\"\r\n");
			sb.append("          Line1\r\n");
			sb.append("           \"\"\"\r\n");
			sb.append("\r\n");
			assertNoErrors(sb);
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatStepFewerSpaces() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("Feature: This is a test feature\r\n");
			sb.append("\r\n");
			sb.append("Scenario: Submit a drug claim\r\n");
			sb.append("\r\n");
			sb.append("Given do step one\r\n");
			sb.append("| Header1 | Header2 |\r\n");
			sb.append("| data1 | data2 |\r\n");
			sb.append(" When do step three\r\n");
			sb.append(" | Header1 | Header2 |\r\n");
			sb.append(" | data1 | data2 |\r\n");
			sb.append(" Then do step four\r\n");
			sb.append(" | Header1 | Header2 |\r\n");
			sb.append(" | data1 | data2 |\r\n");
			sb.append(" And do step two\r\n");
			sb.append(" | Header1 | Header2 |\r\n");
			sb.append(" | data1 | data2 |\r\n");
			sb.append(" But do step five\r\n");
			sb.append(" | Header1 | Header2 |\r\n");
			sb.append(" | data1 | data2 |\r\n");
			sb.append(" * do step six\r\n");
			sb.append(" | Header1 | Header2 |\r\n");
			sb.append(" | data1 | data2 |\r\n");
			sb.append("Given do step one\r\n");
			sb.append(" \"\"\"\r\n");
			sb.append(" Line1\r\n");
			sb.append(" \"\"\"\r\n");
			sb.append(" When do step three\r\n");
			sb.append(" \"\"\"\r\n");
			sb.append(" Line1\r\n");
			sb.append(" \"\"\"\r\n");
			sb.append(" Then do step four\r\n");
			sb.append(" \"\"\"\r\n");
			sb.append(" Line1\r\n");
			sb.append(" \"\"\"\r\n");
			sb.append(" And do step two\r\n");
			sb.append(" \"\"\"\r\n");
			sb.append(" Line1\r\n");
			sb.append(" \"\"\"\r\n");
			sb.append(" But do step five\r\n");
			sb.append(" \"\"\"\r\n");
			sb.append(" Line1\r\n");
			sb.append(" \"\"\"\r\n");
			sb.append(" * do step six\r\n");
			sb.append(" \"\"\"\r\n");
			sb.append(" Line1\r\n");
			sb.append(" \"\"\"\r\n");
			sb.append("\r\n");
			assertNoErrors(sb);
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatStepMoreEOL() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("Feature: This is a test feature\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("  Scenario: Submit a drug claim\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("    Given do step one\r\n");
			sb.append("\r\n");
			sb.append("          | Header1 | Header2 |\r\n");
			sb.append("\r\n");
			sb.append("          |   data1 |   data2 |\r\n");
			sb.append("\r\n");
			sb.append("     When do step three\r\n");
			sb.append("\r\n");
			sb.append("          | Header1 | Header2 |\r\n");
			sb.append("\r\n");
			sb.append("          |   data1 |   data2 |\r\n");
			sb.append("\r\n");
			sb.append("     Then do step four\r\n");
			sb.append("\r\n");
			sb.append("          | Header1 | Header2 |\r\n");
			sb.append("\r\n");
			sb.append("          |   data1 |   data2 |\r\n");
			sb.append("\r\n");
			sb.append("      And do step two\r\n");
			sb.append("\r\n");
			sb.append("          | Header1 | Header2 |\r\n");
			sb.append("\r\n");
			sb.append("          |   data1 |   data2 |\r\n");
			sb.append("\r\n");
			sb.append("      But do step five\r\n");
			sb.append("\r\n");
			sb.append("          | Header1 | Header2 |\r\n");
			sb.append("\r\n");
			sb.append("          |   data1 |   data2 |\r\n");
			sb.append("\r\n");
			sb.append("        * do step six\r\n");
			sb.append("\r\n");
			sb.append("          | Header1 | Header2 |\r\n");
			sb.append("\r\n");
			sb.append("          |   data1 |   data2 |\r\n");
			sb.append("\r\n");
			sb.append("    Given do step one\r\n");
			sb.append("\r\n");
			sb.append("          \"\"\"\r\n");
			sb.append("\r\n");
			sb.append("          Line1\r\n");
			sb.append("\r\n");
			sb.append("          \"\"\"\r\n");
			sb.append("\r\n");
			sb.append("     When do step three\r\n");
			sb.append("\r\n");
			sb.append("          \"\"\"\r\n");
			sb.append("\r\n");
			sb.append("          Line1\r\n");
			sb.append("\r\n");
			sb.append("          \"\"\"\r\n");
			sb.append("\r\n");
			sb.append("     Then do step four\r\n");
			sb.append("\r\n");
			sb.append("          \"\"\"\r\n");
			sb.append("\r\n");
			sb.append("          Line1\r\n");
			sb.append("\r\n");
			sb.append("          \"\"\"\r\n");
			sb.append("\r\n");
			sb.append("      And do step two\r\n");
			sb.append("\r\n");
			sb.append("          \"\"\"\r\n");
			sb.append("\r\n");
			sb.append("          Line1\r\n");
			sb.append("\r\n");
			sb.append("          \"\"\"\r\n");
			sb.append("\r\n");
			sb.append("      But do step five\r\n");
			sb.append("\r\n");
			sb.append("          \"\"\"\r\n");
			sb.append("\r\n");
			sb.append("          Line1\r\n");
			sb.append("\r\n");
			sb.append("          \"\"\"\r\n");
			sb.append("\r\n");
			sb.append("        * do step six\r\n");
			sb.append("\r\n");
			sb.append("          \"\"\"\r\n");
			sb.append("\r\n");
			sb.append("          Line1\r\n");
			sb.append("\r\n");
			sb.append("          \"\"\"\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			assertNoErrors(sb);
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}
}
