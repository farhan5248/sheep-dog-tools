package org.farhan.tests;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(CucumberInjectorProvider.class)
public class BackgroundFormattingTest extends FormattingTest {

	private StringBuilder getExpected() {

		StringBuilder sb = new StringBuilder();
		sb.append("Feature: This is a test feature\r\n");
		sb.append("\r\n");
		sb.append("  Background: Setup a cardholder\r\n");
		sb.append("\r\n");
		sb.append("    First setup a group\r\n");
		sb.append("    Next setup the cardholder\r\n");
		sb.append("    Next setup their family\r\n");
		sb.append("\r\n");
		sb.append("    Given do step one\r\n");
		sb.append("     When do step three\r\n");
		sb.append("\r\n");
		assertNoErrors(sb);
		return sb;
	}

	@Test
	public void formatBackgroundNoIssues() {

		assertFormatted((FormatterTestRequest it) -> {
			it.setToBeFormatted(getExpected().toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatBackgroundMoreSpaces() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("  Feature:   This is a test feature  \r\n");
			sb.append("\r\n");
			sb.append("    Background:   Setup a cardholder  \r\n");
			sb.append("\r\n");
			sb.append("      First setup a group  \r\n");
			sb.append("      Next setup the cardholder  \r\n");
			sb.append("      Next setup their family  \r\n");
			sb.append("\r\n");
			sb.append("      Given   do step one  \r\n");
			sb.append("       When   do step three  \r\n");
			sb.append("\r\n");
			assertNoErrors(sb);
			it.setToBeFormatted(sb.toString());
			it.setExpectation(getExpected().toString());
		});
	}

	@Test
	public void formatBackgroundFewerSpaces() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("Feature: This is a test feature\r\n");
			sb.append("\r\n");
			sb.append("Background: Setup a cardholder\r\n");
			sb.append("\r\n");
			sb.append("First setup a group\r\n");
			sb.append("Next setup the cardholder\r\n");
			sb.append("Next setup their family\r\n");
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
	public void formatBackgroundMoreEOL() {

		assertFormatted((FormatterTestRequest it) -> {
			StringBuilder sb = new StringBuilder();
			sb.append("Feature: This is a test feature\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("  Background: Setup a cardholder\r\n");
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("    First setup a group\r\n");
			sb.append("    Next setup the cardholder\r\n");
			sb.append("    Next setup their family\r\n");
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
