package org.farhan.mbt.tests.formatting;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.farhan.mbt.tests.SheepDogInjectorProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(SheepDogInjectorProvider.class)
public class DocStringFormattingTest extends FormattingTest {

	private StringBuilder getExpected() {

		StringBuilder sb = new StringBuilder();
		sb.append("= Feature: This is a test feature\n");
		sb.append("\n");
		sb.append("== Scenario: Submit a drug claim\n");
		sb.append("\n");
		sb.append("=== Given do step one\n");
		sb.append("\n");
		sb.append("----\n");
		sb.append("Line1 \n");
		sb.append("\n");
		sb.append("\n");
		sb.append("  Line2 \n");
		sb.append("\n");
		sb.append("\n");
		sb.append("----\n");
		sb.append("\n");
		assertNoFeatureErrors(sb);
		return sb;
	}

	@Test
	public void formatDocStringNoIssues() {

		assertFormatted((FormatterTestRequest it) -> {
			it.setToBeFormatted(getExpected().toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatDocStringMoreSpaces() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("= Feature: This is a test feature\n");
			sb.append("\n");
			sb.append("== Scenario: Submit a drug claim\n");
			sb.append("\n");
			sb.append("=== Given do step one\n");
			sb.append("\n");
			sb.append(" ---- \n");
			sb.append("Line1 \n");
			sb.append("\n");
			sb.append("\n");
			sb.append("  Line2 \n");
			sb.append("\n");
			sb.append("\n");
			sb.append(" ---- \n");
			sb.append("\n");
			assertNoFeatureErrors(sb);
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}
}
