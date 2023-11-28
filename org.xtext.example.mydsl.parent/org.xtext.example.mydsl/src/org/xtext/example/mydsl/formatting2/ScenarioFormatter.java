package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.xtext.example.mydsl.myDsl.Scenario;
import org.xtext.example.mydsl.myDsl.Tag;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.ScenarioElements;

public class ScenarioFormatter extends AbstractScenarioFormatter {

	public ScenarioFormatter(Scenario theScenario) {
		super(theScenario);
	}

	@Override
	protected AbstractParserRuleElementFinder getAccess(MyDslGrammarAccess ga) {
		return ga.getScenarioAccess();
	}

	@Override
	protected void formatTags(IFormattableDocument doc, MyDslGrammarAccess ga, MyDslFormatter df) {
		Scenario theScenario = (Scenario) theAbstractScenario;
		if (!theScenario.getTags().isEmpty()) {
			for (Tag t : theScenario.getTags()) {
				TagFormatter formatter = new TagFormatter(t);
				formatter.isLast(isLastElement(t, theScenario.getTags()));
				formatter.isFirst(isFirstElement(t, theScenario.getTags()));
				formatter.format(doc, ga, df);
			}
			formatEOL1RuleCall(df.getRegion(theScenario, ga.getScenarioAccess().getEOLTerminalRuleCall_0_1()), doc);
		}
	}

	@Override
	protected Keyword getKeyword(AbstractParserRuleElementFinder a) {
		return ((ScenarioElements) a).getScenarioKeyword_1();
	}

	@Override
	protected RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a) {
		return ((ScenarioElements) a).getEOLTerminalRuleCall_3();
	}

	@Override
	protected RuleCall getPhraseRuleCall(AbstractParserRuleElementFinder a) {
		return ((ScenarioElements) a).getNamePhraseParserRuleCall_2_0();
	}

	@Override
	protected void formatExamples(IFormattableDocument doc, MyDslGrammarAccess ga, MyDslFormatter df) {
		// Nothing to do here
	}

}
