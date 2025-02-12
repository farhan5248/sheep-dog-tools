package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.FeatureTagsElements;
import org.farhan.mbt.sheepDog.FeatureTags;

public class FeatureTagsFormatter extends Formatter {

	private FeatureTags tags;

	public FeatureTagsFormatter(FeatureTags tags) {
		this.tags = tags;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		FeatureTagsElements a = ga.getFeatureTagsAccess();
		formatKeywordNoSpace(df.getRegion(tags, a.getTagsKeyword_0()), doc);
		formatTitle(df.getRegion(tags, a.getNameWORDTerminalRuleCall_1_0()), doc);
		formatEOL1RuleCall(df.getRegion(tags, a.getEOLTerminalRuleCall_2()), doc);
	}
}
