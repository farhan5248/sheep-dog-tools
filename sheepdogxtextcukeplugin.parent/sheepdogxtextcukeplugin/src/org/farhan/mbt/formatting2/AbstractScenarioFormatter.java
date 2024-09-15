package org.farhan.mbt.formatting2;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.farhan.mbt.cucumber.AbstractScenario;
import org.farhan.mbt.cucumber.And;
import org.farhan.mbt.cucumber.Asterisk;
import org.farhan.mbt.cucumber.But;
import org.farhan.mbt.cucumber.Given;
import org.farhan.mbt.cucumber.Statement;
import org.farhan.mbt.cucumber.Step;
import org.farhan.mbt.cucumber.Then;
import org.farhan.mbt.cucumber.When;
import org.farhan.mbt.services.CucumberGrammarAccess;

public abstract class AbstractScenarioFormatter extends Formatter {

	protected AbstractScenario theAbstractScenario;

	public AbstractScenarioFormatter(AbstractScenario theAbstractScenario) {
		this.theAbstractScenario = theAbstractScenario;
	}

	protected StepFormatter newStepFormatter(Step theStep) {
		if (theStep instanceof Given) {
			return new GivenFormatter((Given) theStep);
		} else if (theStep instanceof When) {
			return new WhenFormatter((When) theStep);
		} else if (theStep instanceof Then) {
			return new ThenFormatter((Then) theStep);
		} else if (theStep instanceof And) {
			return new AndFormatter((And) theStep);
		} else if (theStep instanceof But) {
			return new ButFormatter((But) theStep);
		} else if (theStep instanceof Asterisk) {
			return new AsteriskFormatter((Asterisk) theStep);
		} else {
			return null;
		}
	}

	protected abstract AbstractParserRuleElementFinder getAccess(CucumberGrammarAccess ga);

	protected abstract void formatTags(IFormattableDocument doc, CucumberGrammarAccess a, CucumberFormatter df);

	protected abstract void formatExamples(IFormattableDocument doc, CucumberGrammarAccess ga, CucumberFormatter df);

	protected abstract Keyword getKeyword(AbstractParserRuleElementFinder a);

	protected abstract RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a);

	protected abstract RuleCall getPhraseRuleCall(AbstractParserRuleElementFinder a);

	public void format(IFormattableDocument doc, CucumberGrammarAccess ga, CucumberFormatter df) {
		AbstractParserRuleElementFinder a = getAccess(ga);
		formatTags(doc, ga, df);
		formatKeyword(df.getRegion(theAbstractScenario, getKeyword(a)), doc);
		formatPhraseRuleCall(df.getRegion(theAbstractScenario, getPhraseRuleCall(a)), doc);
		formatEOL2RuleCall(df.getRegion(theAbstractScenario, getEOLRuleCall(a)), doc);
		for (Statement s : theAbstractScenario.getStatements()) {
			StatementFormatter formatter = new StatementFormatter(s);
			formatter.isLast(isLastElement(s, theAbstractScenario.getStatements()));
			formatter.setIndent(4);
			formatter.isLastEOLDouble(true);
			formatter.format(doc, ga, df);
		}
		for (Step s : theAbstractScenario.getSteps()) {
			StepFormatter formatter = newStepFormatter(s);
			formatter.isLast(isLastElement(s, theAbstractScenario.getSteps()));
			formatter.setIndent(4);
			formatter.isLastEOLDouble(s.getTheStepTable() == null && s.getTheDocString() == null);
			formatter.format(doc, ga, df);
		}
		formatExamples(doc, ga, df);
	}

}
