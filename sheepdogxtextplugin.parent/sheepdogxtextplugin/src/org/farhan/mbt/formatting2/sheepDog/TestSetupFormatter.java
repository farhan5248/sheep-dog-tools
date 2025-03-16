package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.TestSetupElements;
import org.farhan.mbt.sheepDog.TestSetup;

public class TestSetupFormatter extends TestStepContainerFormatter {

	public TestSetupFormatter(TestSetup theBackground) {
		super(theBackground);
	}

	@Override
	protected AbstractParserRuleElementFinder getAccess(SheepDogGrammarAccess ga) {
		return ga.getTestSetupAccess();
	}

	@Override
	protected void formatExamples(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Keyword getKeyword(AbstractParserRuleElementFinder a) {
		return ((TestSetupElements) a).getTestSetupKeyword_2();
	}

	@Override
	protected RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a) {
		return ((TestSetupElements) a).getEOLTerminalRuleCall_4();
	}

	@Override
	protected RuleCall getTitleRuleCall(AbstractParserRuleElementFinder a) {
		return ((TestSetupElements) a).getNameTitleParserRuleCall_3_0();
	}

	@Override
	protected Keyword getEqualsKeyword(AbstractParserRuleElementFinder a) {
		return ((TestSetupElements) a).getEqualsSignEqualsSignKeyword_1();
	}

}
