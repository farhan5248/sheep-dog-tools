package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.TextElements;
import org.farhan.mbt.sheepDog.Text;

public class TextFormatter extends Formatter {

	private Text theDocString;

	public TextFormatter(Text theDocString) {
		this.theDocString = theDocString;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		TextElements a = ga.getTextAccess();
		formatTitleNoSpace(df.getRegion(theDocString, a.getNameRAWTEXTTerminalRuleCall_0_0()), doc);
		formatEOL2RuleCall(df.getRegion(theDocString, a.getEOLTerminalRuleCall_1()), doc);
	}

}
