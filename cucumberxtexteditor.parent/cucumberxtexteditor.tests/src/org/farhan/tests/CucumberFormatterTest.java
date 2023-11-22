package org.farhan.tests;

import org.eclipse.xtext.formatting2.FormatterPreferenceKeys;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.formatter.FormatterTestHelper;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.google.inject.Inject;

@ExtendWith(InjectionExtension.class)
@InjectWith(CucumberInjectorProvider.class)
public class CucumberFormatterTest {
	@Inject
	private FormatterTestHelper formatterTestHelper;

	public void assertFormatted(Procedure1<FormatterTestRequest> init) {
		formatterTestHelper.assertFormatted(new Procedure1<FormatterTestRequest>() {
			@Override
			public void apply(FormatterTestRequest p) {
				p.preferences(m -> m.put(FormatterPreferenceKeys.lineSeparator, "\n"));
				init.apply(p);
			}
		});
	}
	
	@Test
	public void formatFeatureWithTitle() {
		assertFormatted((FormatterTestRequest it) -> {
			it.setToBeFormatted("  Feature:  Claims are adjudicated  \n");
			it.setExpectation("Feature: Claims are adjudicated\n");
		});
	}

	@Test
	public void formatFeatureWithDescription() {
		assertFormatted((FormatterTestRequest it) -> {
			it.setToBeFormatted("Feature:  Claims are adjudicated  \n  Descriptive text 1  \n  Descriptive text 2  \n  Descriptive text 3  \n");
			it.setExpectation("Feature: Claims are adjudicated\n  Descriptive text 1\n  Descriptive text 2\n  Descriptive text 3\n");
		});
	}

	@Test
	public void formatFeatureWithTagSingle() {
		assertFormatted((FormatterTestRequest it) -> {
			it.setToBeFormatted("  @tag  \r\nFeature: Claims are adjudicated\n");
			it.setExpectation("@tag\r\nFeature: Claims are adjudicated\n");
		});
	}

	@Test
	public void formatFeatureWithTagMultiple() {
		assertFormatted((FormatterTestRequest it) -> {
			it.setToBeFormatted("  @tag1    @tag2  \r\nFeature: Claims are adjudicated\n");
			it.setExpectation("@tag1 @tag2\r\nFeature: Claims are adjudicated\n");
		});
	}

}
