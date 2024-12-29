package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.StatementElements;
import org.farhan.mbt.sheepDog.Statement;

public class StatementFormatter extends Formatter {

	private Statement theStatement;

	public StatementFormatter(Statement theStatement) {
		this.theStatement = theStatement;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		StatementElements a = ga.getStatementAccess();
		formatTitleNoSpace(df.getRegion(theStatement, a.getNameTitleParserRuleCall_0_0()), doc);
		formatEOL2MaxRuleCall(df.getRegion(theStatement, a.getEOLTerminalRuleCall_1()), doc);
	}

	protected void formatTitleNoSpace(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());
	}

}
