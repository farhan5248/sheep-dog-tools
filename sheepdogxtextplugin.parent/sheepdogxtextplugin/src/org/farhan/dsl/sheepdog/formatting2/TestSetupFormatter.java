package org.farhan.dsl.sheepdog.formatting2;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.farhan.dsl.sheepdog.services.SheepDogGrammarAccess;
import org.farhan.dsl.sheepdog.services.SheepDogGrammarAccess.TestSetupElements;
import org.farhan.dsl.sheepdog.sheepDog.TestSetup;

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
		return ((TestSetupElements) a).getTestSetupKeyword_1();
	}

	@Override
	protected RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a) {
		return ((TestSetupElements) a).getEOLTerminalRuleCall_3();
	}

	@Override
	protected RuleCall getTitleRuleCall(AbstractParserRuleElementFinder a) {
		return ((TestSetupElements) a).getNameTitleParserRuleCall_2_0();
	}

	@Override
	protected Keyword getEqualsKeyword(AbstractParserRuleElementFinder a) {
		return ((TestSetupElements) a).getEqualsSignEqualsSignKeyword_0();
	}

}
