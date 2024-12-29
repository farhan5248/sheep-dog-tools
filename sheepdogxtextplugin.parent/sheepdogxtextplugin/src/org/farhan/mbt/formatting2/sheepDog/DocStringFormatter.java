package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.DocStringElements;
import org.farhan.mbt.sheepDog.DocString;
import org.farhan.mbt.sheepDog.Line;

public class DocStringFormatter extends Formatter {

	private DocString theDocString;

	public DocStringFormatter(DocString theDocString) {
		this.theDocString = theDocString;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		DocStringElements a = ga.getDocStringAccess();
		formatKeywordNoSpace(df.getRegion(theDocString, a.getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_0()), doc);
		formatEOL1RuleCall(df.getRegion(theDocString, a.getEOLTerminalRuleCall_1()), doc);
		formatKeywordNoSpace(df.getRegion(theDocString, a.getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_3()), doc);
		formatEOL2RuleCall(df.getRegion(theDocString, a.getEOLTerminalRuleCall_4()), doc);
		for (Line s : theDocString.getLines()) {
			LineFormatter formatter = new LineFormatter(s);
			formatter.isLast(isLastElement(s, theDocString.getLines()));
			formatter.format(doc, ga, df);
		}
	}

}
