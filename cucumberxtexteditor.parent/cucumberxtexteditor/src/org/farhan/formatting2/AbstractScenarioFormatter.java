package org.farhan.formatting2;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Statement;
import org.farhan.cucumber.Step;
import org.farhan.services.CucumberGrammarAccess;

public abstract class AbstractScenarioFormatter extends Formatter {

	protected AbstractScenario theAbstractScenario;

	public AbstractScenarioFormatter(AbstractScenario theAbstractScenario) {
		this.theAbstractScenario = theAbstractScenario;
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
			StepFormatter formatter = new StepFormatter(s);
			formatter.isLast(isLastElement(s, theAbstractScenario.getSteps()));
			formatter.setIndent(4);
			formatter.isLastEOLDouble(s.getTheStepTable() == null && s.getTheDocString() == null);
			formatter.format(doc, ga, df);
		}
		formatExamples(doc, ga, df);
	}

}
