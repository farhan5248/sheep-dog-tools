package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.sheepDog.TestStep;

public abstract class TestStepFormatter extends Formatter {

	protected TestStep theStep;

	public TestStepFormatter(TestStep theStep) {
		this.theStep = theStep;
	}

	protected abstract AbstractParserRuleElementFinder getAccess(SheepDogGrammarAccess ga);

	protected abstract Keyword getEqualsKeyword(AbstractParserRuleElementFinder a);

	protected abstract Keyword getKeyword(AbstractParserRuleElementFinder a);

	protected abstract RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a);

	protected abstract RuleCall getPhraseRuleCall(AbstractParserRuleElementFinder a);

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		AbstractParserRuleElementFinder a = getAccess(ga);
		formatKeywordTrailingSpace(df.getRegion(theStep, getEqualsKeyword(a)), doc);
		formatKeywordTrailingSpace(df.getRegion(theStep, getKeyword(a)), doc);
		formatTitle(df.getRegion(theStep, getPhraseRuleCall(a)), doc);
		formatEOL2RuleCall(df.getRegion(theStep, getEOLRuleCall(a)), doc);

		if (theStep.getTable() != null) {
			TableFormatter formatter = new TableFormatter(theStep.getTable());
			formatter.format(doc, ga, df);
		}
		if (theStep.getText() != null) {
			TextFormatter formatter2 = new TextFormatter(theStep.getText());
			formatter2.format(doc, ga, df);
		}
	}

}
