package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.TagsElements;
import org.farhan.mbt.sheepDog.Tags;

public class TagsFormatter extends Formatter {

	private Tags tags;

	public TagsFormatter(Tags tags) {
		this.tags = tags;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		TagsElements a = ga.getTagsAccess();
		formatKeywordNoSpace(df.getRegion(tags, a.getTagsKeyword_0()), doc);
		formatTitle(df.getRegion(tags, a.getNameWORDTerminalRuleCall_1_0()), doc);
		formatKeywordNoSpace(df.getRegion(tags, a.getRightSquareBracketKeyword_2()), doc);
		formatEOL1RuleCall(df.getRegion(tags, a.getEOLTerminalRuleCall_3()), doc);
	}
}
