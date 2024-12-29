package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.BackgroundElements;
import org.farhan.mbt.sheepDog.Background;

public class BackgroundFormatter extends AbstractScenarioFormatter {

	public BackgroundFormatter(Background theBackground) {
		super(theBackground);
	}

	@Override
	protected AbstractParserRuleElementFinder getAccess(SheepDogGrammarAccess ga) {
		return ga.getBackgroundAccess();
	}

	@Override
	protected void formatExamples(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Keyword getKeyword(AbstractParserRuleElementFinder a) {
		return ((BackgroundElements) a).getBackgroundKeyword_2();
	}

	@Override
	protected RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a) {
		return ((BackgroundElements) a).getEOLTerminalRuleCall_4();
	}

	@Override
	protected RuleCall getTitleRuleCall(AbstractParserRuleElementFinder a) {
		return ((BackgroundElements) a).getNameTitleParserRuleCall_3_0();
	}

	@Override
	protected Keyword getEqualsKeyword(AbstractParserRuleElementFinder a) {
		return ((BackgroundElements) a).getEqualsSignEqualsSignKeyword_1();
	}

}
