package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.DocStringElements;
import org.farhan.mbt.sheepDog.DocString;

public class DocStringFormatter extends Formatter {

	private DocString theDocString;

	public DocStringFormatter(DocString theDocString) {
		this.theDocString = theDocString;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		DocStringElements a = ga.getDocStringAccess();
		formatTitleNoSpace(df.getRegion(theDocString, a.getNameRAWTEXTTerminalRuleCall_0_0()), doc);
		formatEOL2RuleCall(df.getRegion(theDocString, a.getEOLTerminalRuleCall_1()), doc);
	}

}
