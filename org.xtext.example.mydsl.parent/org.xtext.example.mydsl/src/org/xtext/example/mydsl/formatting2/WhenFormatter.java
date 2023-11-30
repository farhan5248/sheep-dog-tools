package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.xtext.example.mydsl.myDsl.When;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.WhenElements;

public class WhenFormatter extends StepFormatter {
	public WhenFormatter(When theWhen) {
		super(theWhen);
	}

	@Override
	protected AbstractParserRuleElementFinder getAccess(MyDslGrammarAccess ga) {
		return ga.getWhenAccess();
	}

	@Override
	protected Keyword getKeyword(AbstractParserRuleElementFinder a) {
		return ((WhenElements) a).getWhenKeyword_0();
	}

	@Override
	protected RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a) {
		return ((WhenElements) a).getEOLTerminalRuleCall_2();
	}

	@Override
	protected RuleCall getPhraseRuleCall(AbstractParserRuleElementFinder a) {
		return ((WhenElements) a).getNamePhraseParserRuleCall_1_0();
	}

	@Override
	protected void formatKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		replace(doc, iSR, getIndent() + " " + iSR.getText() + " ");
	}

}