package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.TestDataElements;
import org.farhan.mbt.sheepDog.TestData;
import org.farhan.mbt.sheepDog.Statement;

public class TestDataFormatter extends Formatter {

	private TestData theTestData;

	public TestDataFormatter(TestData theTestData) {
		this.theTestData = theTestData;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		TestDataElements a = ga.getTestDataAccess();
		if (theTestData.getTagList() != null) {
			TagsFormatter formatter = new TagsFormatter(theTestData.getTagList());
			formatter.format(doc, ga, df);
		}

		formatKeywordTrailingSpace(df.getRegion(theTestData, a.getEqualsSignEqualsSignEqualsSignKeyword_1()), doc);
		formatKeywordTrailingSpace(df.getRegion(theTestData, a.getTestDataKeyword_2()), doc);
		formatTitle(df.getRegion(theTestData, a.getNameTitleParserRuleCall_3_0()), doc);
		formatEOL2RuleCall(df.getRegion(theTestData, a.getEOLTerminalRuleCall_4()), doc);

		for (Statement s : theTestData.getStatementList()) {
			StatementFormatter formatter = new StatementFormatter(s);
			formatter.isLast(isLastElement(s, theTestData.getStatementList()));
			formatter.format(doc, ga, df);
		}

		if (theTestData.getTable() != null) {
			TableFormatter formatter = new TableFormatter(theTestData.getTable());
			formatter.format(doc, ga, df);
		}
	}

}
