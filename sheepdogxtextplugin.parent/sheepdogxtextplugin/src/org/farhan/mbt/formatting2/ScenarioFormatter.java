package org.farhan.mbt.formatting2;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.ScenarioElements;
import org.farhan.mbt.sheepDog.Scenario;

public class ScenarioFormatter extends AbstractScenarioFormatter {

	public ScenarioFormatter(Scenario theScenario) {
		super(theScenario);
	}

	@Override
	protected AbstractParserRuleElementFinder getAccess(SheepDogGrammarAccess ga) {
		return ga.getScenarioAccess();
	}

	@Override
	protected void formatExamples(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Keyword getKeyword(AbstractParserRuleElementFinder a) {
		return ((ScenarioElements) a).getScenarioKeyword_2();
	}

	@Override
	protected RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a) {
		return ((ScenarioElements) a).getEOLTerminalRuleCall_4();
	}

	@Override
	protected RuleCall getTitleRuleCall(AbstractParserRuleElementFinder a) {
		return ((ScenarioElements) a).getNameTitleParserRuleCall_3_0();
	}

	@Override
	protected Keyword getEqualsKeyword(AbstractParserRuleElementFinder a) {
		return ((ScenarioElements) a).getEqualsSignEqualsSignKeyword_1();
	}

}
