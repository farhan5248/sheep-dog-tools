package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.xtext.example.mydsl.myDsl.AbstractScenario;
import org.xtext.example.mydsl.myDsl.And;
import org.xtext.example.mydsl.myDsl.Asterisk;
import org.xtext.example.mydsl.myDsl.But;
import org.xtext.example.mydsl.myDsl.Given;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.Step;
import org.xtext.example.mydsl.myDsl.Then;
import org.xtext.example.mydsl.myDsl.When;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

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

	public void formatKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		replace(doc, iSR, getIndent() + iSR.getText() + " ");
	}

	protected abstract AbstractParserRuleElementFinder getAccess(MyDslGrammarAccess ga);

	protected abstract void formatTags(IFormattableDocument doc, MyDslGrammarAccess a, MyDslFormatter df);

	protected abstract void formatExamples(IFormattableDocument doc, MyDslGrammarAccess ga, MyDslFormatter df);

	protected abstract Keyword getKeyword(AbstractParserRuleElementFinder a);

	protected abstract RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a);

	protected abstract RuleCall getPhraseRuleCall(AbstractParserRuleElementFinder a);

	public void format(IFormattableDocument doc, MyDslGrammarAccess ga, MyDslFormatter df) {
		AbstractParserRuleElementFinder a = getAccess(ga);
		formatTags(doc, ga, df);
		formatKeyword(df.getRegion(theAbstractScenario, getKeyword(a)), doc);
		formatNameRuleCall(df.getRegion(theAbstractScenario, getPhraseRuleCall(a)), doc);
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
