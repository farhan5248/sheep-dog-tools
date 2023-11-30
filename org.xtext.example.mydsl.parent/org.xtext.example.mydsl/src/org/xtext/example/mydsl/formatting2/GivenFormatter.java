package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.xtext.example.mydsl.myDsl.Given;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.GivenElements;

public class GivenFormatter extends StepFormatter {

	public GivenFormatter(Given theGiven) {
		super(theGiven);
	}

	@Override
	protected AbstractParserRuleElementFinder getAccess(MyDslGrammarAccess ga) {
		return ga.getGivenAccess();
	}

	@Override
	protected Keyword getKeyword(AbstractParserRuleElementFinder a) {
		return ((GivenElements) a).getGivenKeyword_0();
	}

	@Override
	protected RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a) {
		return ((GivenElements) a).getEOLTerminalRuleCall_2();
	}

	@Override
	protected RuleCall getPhraseRuleCall(AbstractParserRuleElementFinder a) {
		return ((GivenElements) a).getNamePhraseParserRuleCall_1_0();
	}

	@Override
	protected void formatKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		replace(doc, iSR, getIndent() + iSR.getText() + " ");
	}

}