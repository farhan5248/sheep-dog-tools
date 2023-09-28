package org.farhan.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.xbase.formatting2.XbaseFormatter;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.CucumberPackage;
import org.farhan.cucumber.Feature;

public class CucumberFormatter extends XbaseFormatter {

	protected void _format(Feature feature, IFormattableDocument document) {
		// ISemanticRegion featureRegion = regionFor(feature).keyword("Feature:");

		// the first line of text should not have any trailing spaces, just one leading
		// one.
		document.surround(regionFor(feature).feature(CucumberPackage.Literals.FEATURE__TITLE), it -> {
			it.setNewLines(4);
		});

		for (AbstractScenario scenario : feature.getScenarios()) {
			format(scenario, document);
		}
	}

	protected void _format(AbstractScenario scenario, IFormattableDocument document) {
		ISemanticRegion scenarioRegion = regionFor(scenario).keyword("Scenario");
		// document.prepend(scenarioRegion, this::indent);
	}
}
