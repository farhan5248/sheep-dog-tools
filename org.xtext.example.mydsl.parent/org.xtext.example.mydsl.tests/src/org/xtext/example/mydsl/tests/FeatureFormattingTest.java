package org.xtext.example.mydsl.tests;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyDslInjectorProvider.class)
public class FeatureFormattingTest extends FormattingTest {

	private StringBuilder getExpected() {

		StringBuilder sb = new StringBuilder();
		sb.append("@tag1 @tag2 @tag3\r\n");
		sb.append("Feature: This is a test feature\r\n");
		sb.append("\r\n");
		sb.append("  This is the description\r\n");
		sb.append("  This is the second line of the description\r\n");
		sb.append("\r\n");
		return sb;
	}

	@Test
	public void formatFeatureNoIssues() {

		assertFormatted((FormatterTestRequest it) -> {
			it.setToBeFormatted(getExpected().toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatFeatureMoreSpaces() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append(" @tag1  @tag2  @tag3 \r\n");
			sb.append(" Feature:  This is a test feature \r\n");
			sb.append(" This is the description \r\n");
			sb.append(" This is the second line of the description \r\n");
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatFeatureFewerSpaces() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("@tag1 @tag2 @tag3\r\n");
			sb.append("Feature: This is a test feature\r\n");
			sb.append("This is the description\r\n");
			sb.append("This is the second line of the description\r\n");
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatFeatureMoreEOL() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("@tag1 @tag2 @tag3\r\n");
			sb.append("\r\n");
			sb.append("Feature: This is a test feature\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("  This is the description\r\n");
			sb.append("\r\n");
			sb.append("  This is the second line of the description\r\n");
			sb.append("\r\n");
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}
}
