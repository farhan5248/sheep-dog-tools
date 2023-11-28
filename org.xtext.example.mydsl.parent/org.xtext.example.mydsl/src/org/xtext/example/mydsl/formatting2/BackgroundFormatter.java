package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.xtext.example.mydsl.myDsl.Background;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.BackgroundElements;

public class BackgroundFormatter extends AbstractScenarioFormatter {

	public BackgroundFormatter(Background theBackground) {
		super(theBackground);
	}

	@Override
	protected AbstractParserRuleElementFinder getAccess(MyDslGrammarAccess ga) {
		return ga.getBackgroundAccess();
	}

	@Override
	protected Keyword getKeyword(AbstractParserRuleElementFinder a) {
		return ((BackgroundElements) a).getBackgroundKeyword_0();
	}

	@Override
	protected RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a) {
		return ((BackgroundElements) a).getEOLTerminalRuleCall_2();
	}

	@Override
	protected RuleCall getPhraseRuleCall(AbstractParserRuleElementFinder a) {
		return ((BackgroundElements) a).getNamePhraseParserRuleCall_1_0();
	}

	@Override
	protected void formatTags(IFormattableDocument doc, MyDslGrammarAccess ga, MyDslFormatter df) {
		// Nothing to do here
	}

	@Override
	protected void formatExamples(IFormattableDocument doc, MyDslGrammarAccess ga, MyDslFormatter df) {
		// Nothing to do here
	}

}
