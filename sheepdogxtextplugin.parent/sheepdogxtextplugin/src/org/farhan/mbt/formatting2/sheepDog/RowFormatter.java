package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.sheepDog.Cell;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.RowElements;
import org.farhan.mbt.sheepDog.Row;

public class RowFormatter extends Formatter {

	private Row theRow;

	public RowFormatter(Row Row) {
		this.theRow = Row;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		RowElements a = ga.getRowAccess();
		for (Cell c : theRow.getCellList()) {
			CellFormatter formatter = new CellFormatter(c);
			formatter.isLast(isLastElement(c, theRow.getCellList()));
			formatter.isFirst(isFirstElement(c, theRow.getCellList()));
			formatter.format(doc, ga, df);
		}
		formatEOL1RuleCall(df.getRegion(theRow, a.getEOLTerminalRuleCall_1()), doc);
	}

}
