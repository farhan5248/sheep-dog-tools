package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.AbstractScenarioTagsElements;
import org.farhan.mbt.sheepDog.AbstractScenarioTags;

public class AbstractScenarioTagsFormatter extends Formatter {

	private AbstractScenarioTags tags;

	public AbstractScenarioTagsFormatter(AbstractScenarioTags tags) {
		this.tags = tags;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		AbstractScenarioTagsElements a = ga.getAbstractScenarioTagsAccess();
		formatKeywordNoSpace(df.getRegion(tags, a.getTagsKeyword_0()), doc);
		formatTitleNoSpace(df.getRegion(tags, a.getNameWORDTerminalRuleCall_1_0()), doc);
		formatKeywordNoSpace(df.getRegion(tags, a.getQuotationMarkRightSquareBracketKeyword_2()), doc);
		formatEOL1RuleCall(df.getRegion(tags, a.getEOLTerminalRuleCall_3()), doc);
	}
}
