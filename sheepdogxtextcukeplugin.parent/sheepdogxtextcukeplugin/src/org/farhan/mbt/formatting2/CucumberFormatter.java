package org.farhan.mbt.formatting2;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.AbstractJavaFormatter;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.farhan.mbt.cucumber.Feature;
import org.farhan.mbt.cucumber.StepObject;
import org.farhan.mbt.services.CucumberGrammarAccess;
import com.google.inject.Inject;

public class CucumberFormatter extends AbstractJavaFormatter {

	@Inject
	CucumberGrammarAccess ga;

	protected void format(Feature theFeature, IFormattableDocument doc) {

		FeatureFormatter formatter = new FeatureFormatter(theFeature);
		formatter.setIndent(0);
		formatter.format(doc, ga, this);
	}
	
	protected void format(StepObject theStepObject, IFormattableDocument doc) {

		StepObjectFormatter formatter = new StepObjectFormatter(theStepObject);
		formatter.setIndent(0);
		formatter.format(doc, ga, this);
	}

	public ISemanticRegion getRegion(EObject eo, RuleCall ruleCall) {
		return regionFor(eo).ruleCall(ruleCall);
	}

	public ISemanticRegion getRegion(EObject eo, Keyword keyword) {
		// You can also search for the keyword using keyword("Feature:");
		return regionFor(eo).keyword(keyword);
	}
}