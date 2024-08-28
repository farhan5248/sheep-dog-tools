package org.farhan.formatting2;

import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.farhan.cucumber.Step;
import org.farhan.services.CucumberGrammarAccess;
import org.farhan.services.CucumberGrammarAccess.StepElements;

public class StepFormatter extends Formatter {

	protected Step theStep;

	public StepFormatter(Step theStep) {
		this.theStep = theStep;
	}

	protected AbstractParserRuleElementFinder getAccess(CucumberGrammarAccess ga) {
		return ga.getStepAccess();
	}

	protected Alternatives getKeyword(AbstractParserRuleElementFinder a) {
		return ((StepElements) a).getAlternatives_0();
	}

	protected RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a) {
		return ((StepElements) a).getEOLTerminalRuleCall_2();
	}

	protected RuleCall getPhraseRuleCall(AbstractParserRuleElementFinder a) {
		return ((StepElements) a).getNamePhraseParserRuleCall_1_0();
	}

	protected void formatKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		replace(doc, iSR, getIndent() + indent.repeat(5 - iSR.getText().length()) + iSR.getText() + " ");
	}

	public void format(IFormattableDocument doc, CucumberGrammarAccess ga, CucumberFormatter df) {

		AbstractParserRuleElementFinder a = getAccess(ga);
		formatKeyword(df.getRegion(theStep, getKeyword(a)), doc);
		formatPhraseRuleCall(df.getRegion(theStep, getPhraseRuleCall(a)), doc);
		formatEOL12RuleCall(df.getRegion(theStep, getEOLRuleCall(a)), doc);
		if (theStep.getTheStepTable() != null) {
			StepTableFormatter formatter = new StepTableFormatter(theStep.getTheStepTable());
			formatter.setIndent(10);
			formatter.isEOLDouble(isLast);
			formatter.format(doc, ga, df);
		}
		if (theStep.getTheDocString() != null) {
			DocStringFormatter formatter2 = new DocStringFormatter(theStep.getTheDocString());
			formatter2.setIndent(10);
			formatter2.isEOLDouble(isLast);
			formatter2.format(doc, ga, df);
		}
	}

}
