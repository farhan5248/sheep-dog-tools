package org.farhan.mbt.tests.formatting;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.farhan.mbt.tests.SheepDogInjectorProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(SheepDogInjectorProvider.class)
public class ScenarioFormattingTest extends FormattingTest {

	private StringBuilder getExpected() {

		StringBuilder sb = new StringBuilder();
		sb.append("= Test-Suite: This is a test feature\n");
		sb.append("\n");
		sb.append("[tags=\"tag1\"]\n");
		sb.append("== Test-Case: Submit a claim\n");
		sb.append("\n");
		sb.append("Basic EDI claim\n");
		sb.append("No deductible\n");
		sb.append("\n");
		sb.append("=== Given: do step one\n");
		sb.append("\n");
		assertNoFeatureErrors(sb);
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
			sb.append("=  Test-Suite: This is a test feature\n");
			sb.append("\n");
			sb.append("[tags=\"tag1\"]\n");
			sb.append(" ==  Test-Case:  Submit a claim \n");
			sb.append("\n");
			sb.append(" Basic EDI claim \n");
			sb.append(" No deductible \n");
			sb.append("\n");
			sb.append("===  Given: do step one \n");
			sb.append("\n");
			assertNoFeatureErrors(sb);
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatScenarioFewerSpaces() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("=Test-Suite:This is a test feature\n");
			sb.append("\n");
			sb.append("[tags=\"tag1\"]\n");
			sb.append("==Test-Case:Submit a claim\n");
			sb.append("\n");
			sb.append("Basic EDI claim\n");
			sb.append("No deductible\n");
			sb.append("\n");
			sb.append("===Given: do step one\n");
			sb.append("\n");
			assertNoFeatureErrors(sb);
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatScenarioMoreEOL() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("= Test-Suite: This is a test feature\n");
			sb.append("\n");
			sb.append("\n");
			sb.append("[tags=\"tag1\"]\n");
			sb.append("\n");
			sb.append("== Test-Case: Submit a claim\n");
			sb.append("\n");
			sb.append("\n");
			sb.append("Basic EDI claim\n");
			sb.append("No deductible\n");
			sb.append("\n");
			sb.append("\n");
			sb.append("=== Given: do step one\n");
			sb.append("\n");
			sb.append("\n");
			assertNoFeatureErrors(sb);
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}
}
