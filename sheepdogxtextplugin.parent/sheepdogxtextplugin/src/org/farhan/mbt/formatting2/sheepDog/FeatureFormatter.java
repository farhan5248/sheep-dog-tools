package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.FeatureElements;
import org.farhan.mbt.sheepDog.AbstractScenario;
import org.farhan.mbt.sheepDog.Background;
import org.farhan.mbt.sheepDog.Feature;
import org.farhan.mbt.sheepDog.Scenario;
import org.farhan.mbt.sheepDog.Statement;

public class FeatureFormatter extends Formatter {

	private Feature theFeature;

	public FeatureFormatter(Feature theFeature) {
		this.theFeature = theFeature;
	}

	private AbstractScenarioFormatter newAbstractScenarioFormatter(AbstractScenario s) {
		if (s instanceof Background) {
			return new BackgroundFormatter((Background) s);
		} else {
			return new ScenarioFormatter((Scenario) s);
		}
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		FeatureElements a = ga.getFeatureAccess();

		if (theFeature.getTags() != null) {
			FeatureTagsFormatter formatter = new FeatureTagsFormatter(theFeature.getTags());
			formatter.format(doc, ga, df);
		}

		formatKeywordTrailingSpace(df.getRegion(theFeature, a.getEqualsSignKeyword_1()), doc);
		formatKeywordTrailingSpace(df.getRegion(theFeature, a.getFeatureKeyword_2()), doc);
		formatTitle(df.getRegion(theFeature, a.getNameTitleParserRuleCall_3_0()), doc);
		formatEOL2RuleCall(df.getRegion(theFeature, a.getEOLTerminalRuleCall_4()), doc);
		for (Statement s : theFeature.getStatements()) {
			StatementFormatter formatter = new StatementFormatter(s);
			formatter.isLast(isLastElement(s, theFeature.getStatements()));
			formatter.format(doc, ga, df);
		}
		for (AbstractScenario s : theFeature.getAbstractScenarios()) {
			AbstractScenarioFormatter formatter = newAbstractScenarioFormatter(s);
			formatter.format(doc, ga, df);
		}
	}

}
