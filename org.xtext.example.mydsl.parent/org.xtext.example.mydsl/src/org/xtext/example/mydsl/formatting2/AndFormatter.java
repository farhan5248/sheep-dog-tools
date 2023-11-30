package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.xtext.example.mydsl.myDsl.And;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.AndElements;

public class AndFormatter extends StepFormatter {

	public AndFormatter(And theAnd) {
		super(theAnd);
	}

	@Override
	protected AbstractParserRuleElementFinder getAccess(MyDslGrammarAccess ga) {
		return ga.getAndAccess();
	}

	@Override
	protected Keyword getKeyword(AbstractParserRuleElementFinder a) {
		return ((AndElements) a).getAndKeyword_0();
	}

	@Override
	protected RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a) {
		return ((AndElements) a).getEOLTerminalRuleCall_2();
	}

	@Override
	protected RuleCall getPhraseRuleCall(AbstractParserRuleElementFinder a) {
		return ((AndElements) a).getNamePhraseParserRuleCall_1_0();
	}

	@Override
	protected void formatKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
		replace(doc, iSR, getIndent() + "  " + iSR.getText() + " ");
	}

}