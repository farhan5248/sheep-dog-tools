package org.farhan.dsl.sheepdog.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.dsl.sheepdog.sheepDog.Row;
import org.farhan.dsl.sheepdog.services.SheepDogGrammarAccess;
import org.farhan.dsl.sheepdog.services.SheepDogGrammarAccess.TableElements;
import org.farhan.dsl.sheepdog.sheepDog.Table;

public class TableFormatter extends Formatter {

	private Table theStepTable;

	public TableFormatter(Table theStepTable) {
		this.theStepTable = theStepTable;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		TableElements a = ga.getTableAccess();
		formatKeywordNoSpace(df.getRegion(theStepTable, a.getPlusSignKeyword_0()), doc);
		formatEOL1RuleCall(df.getRegion(theStepTable, a.getEOLTerminalRuleCall_1()), doc);
		formatKeywordNoSpace(df.getRegion(theStepTable, a.getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_2()),
				doc);
		formatEOL1RuleCall(df.getRegion(theStepTable, a.getEOLTerminalRuleCall_3()), doc);

		for (Row r : theStepTable.getRowList()) {
			RowFormatter formatter = new RowFormatter(r);
			formatter.isLast(isLastElement(r, theStepTable.getRowList()));
			formatter.isFirst(isFirstElement(r, theStepTable.getRowList()));
			formatter.format(doc, ga, df);
		}
		formatKeywordNoSpace(df.getRegion(theStepTable, a.getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_5()),
				doc);
		formatEOL2RuleCall(df.getRegion(theStepTable, a.getEOLTerminalRuleCall_6()), doc);
	}

}
