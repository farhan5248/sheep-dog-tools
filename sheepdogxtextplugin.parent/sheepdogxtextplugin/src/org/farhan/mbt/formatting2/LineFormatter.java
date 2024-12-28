package org.farhan.mbt.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.StatementElements;
import org.farhan.mbt.sheepDog.Line;

public class LineFormatter extends Formatter {
	private Line theLine;

	public LineFormatter(Line theStatement) {
		this.theLine = theStatement;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		StatementElements a = ga.getStatementAccess();
		formatTitleNoSpace(df.getRegion(theLine, a.getNameTitleParserRuleCall_0_0()), doc);
		// Don't format a.getEOLTerminalRuleCall_1()
	}
}
