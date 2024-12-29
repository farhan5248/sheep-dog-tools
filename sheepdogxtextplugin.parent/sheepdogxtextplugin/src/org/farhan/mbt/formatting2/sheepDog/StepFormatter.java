package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.sheepDog.Step;

public abstract class StepFormatter extends Formatter {

	protected Step theStep;

	public StepFormatter(Step theStep) {
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
		formatTitleNoSpace(df.getRegion(theStep, getPhraseRuleCall(a)), doc);
		formatEOL2RuleCall(df.getRegion(theStep, getEOLRuleCall(a)), doc);

		if (theStep.getTheStepTable() != null) {
			TableFormatter formatter = new TableFormatter(theStep.getTheStepTable());
			formatter.format(doc, ga, df);
		}
		if (theStep.getTheDocString() != null) {
			DocStringFormatter formatter2 = new DocStringFormatter(theStep.getTheDocString());
			formatter2.format(doc, ga, df);
		}
	}

}
