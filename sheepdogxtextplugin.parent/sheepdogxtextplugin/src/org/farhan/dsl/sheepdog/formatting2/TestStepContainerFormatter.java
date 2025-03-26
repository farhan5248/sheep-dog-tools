package org.farhan.dsl.sheepdog.formatting2;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.farhan.dsl.sheepdog.services.SheepDogGrammarAccess;
import org.farhan.dsl.sheepdog.sheepDog.TestStepContainer;
import org.farhan.dsl.sheepdog.sheepDog.And;
import org.farhan.dsl.sheepdog.sheepDog.Given;
import org.farhan.dsl.sheepdog.sheepDog.Statement;
import org.farhan.dsl.sheepdog.sheepDog.TestStep;
import org.farhan.dsl.sheepdog.sheepDog.Then;
import org.farhan.dsl.sheepdog.sheepDog.When;

public abstract class TestStepContainerFormatter extends Formatter {
	protected TestStepContainer theAbstractScenario;

	public TestStepContainerFormatter(TestStepContainer theAbstractScenario) {
		this.theAbstractScenario = theAbstractScenario;
	}

	protected TestStepFormatter newStepFormatter(TestStep theStep) {
		if (theStep instanceof Given) {
			return new GivenFormatter((Given) theStep);
		} else if (theStep instanceof When) {
			return new WhenFormatter((When) theStep);
		} else if (theStep instanceof Then) {
			return new ThenFormatter((Then) theStep);
		} else {
			return new AndFormatter((And) theStep);
		}
	}

	protected abstract AbstractParserRuleElementFinder getAccess(SheepDogGrammarAccess ga);

	protected abstract void formatExamples(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df);

	protected abstract Keyword getEqualsKeyword(AbstractParserRuleElementFinder a);

	protected abstract Keyword getKeyword(AbstractParserRuleElementFinder a);

	protected abstract RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a);

	protected abstract RuleCall getTitleRuleCall(AbstractParserRuleElementFinder a);

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		AbstractParserRuleElementFinder a = getAccess(ga);
		if (theAbstractScenario.getTagList() != null) {
			TagsFormatter formatter = new TagsFormatter(theAbstractScenario.getTagList());
			formatter.format(doc, ga, df);
		}

		formatKeywordTrailingSpace(df.getRegion(theAbstractScenario, getEqualsKeyword(a)), doc);
		formatKeywordTrailingSpace(df.getRegion(theAbstractScenario, getKeyword(a)), doc);
		formatTitle(df.getRegion(theAbstractScenario, getTitleRuleCall(a)), doc);
		formatEOL2RuleCall(df.getRegion(theAbstractScenario, getEOLRuleCall(a)), doc);
		for (Statement s : theAbstractScenario.getStatementList()) {
			StatementFormatter formatter = new StatementFormatter(s);
			formatter.isLast(isLastElement(s, theAbstractScenario.getStatementList()));
			formatter.format(doc, ga, df);
		}
		for (TestStep s : theAbstractScenario.getTestStepList()) {
			TestStepFormatter formatter = newStepFormatter(s);
			formatter.isLast(isLastElement(s, theAbstractScenario.getTestStepList()));
			// formatter.isLastEOLDouble(s.getTheStepTable() == null && s.getTheDocString() == null);
			formatter.format(doc, ga, df);
		}
		formatExamples(doc, ga, df);
	}
}
