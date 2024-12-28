package org.farhan.mbt.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.ExamplesElements;
import org.farhan.mbt.sheepDog.Examples;
import org.farhan.mbt.sheepDog.Statement;

public class ExampleFormatter extends Formatter {

	private Examples theExamples;

	public ExampleFormatter(Examples theExamples) {
		this.theExamples = theExamples;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		ExamplesElements a = ga.getExamplesAccess();
		if (theExamples.getTags() != null) {
			AbstractScenarioTagsFormatter formatter = new AbstractScenarioTagsFormatter(theExamples.getTags());
			formatter.format(doc, ga, df);
		}

		formatKeywordTrailingSpace(df.getRegion(theExamples, a.getEqualsSignEqualsSignEqualsSignKeyword_1()), doc);
		formatKeywordTrailingSpace(df.getRegion(theExamples, a.getExamplesKeyword_2()), doc);
		formatTitleNoSpace(df.getRegion(theExamples, a.getNameTitleParserRuleCall_3_0()), doc);
		formatEOL2RuleCall(df.getRegion(theExamples, a.getEOLTerminalRuleCall_4()), doc);

		for (Statement s : theExamples.getStatements()) {
			StatementFormatter formatter = new StatementFormatter(s);
			formatter.isLast(isLastElement(s, theExamples.getStatements()));
			formatter.format(doc, ga, df);
		}

		if (theExamples.getTheExamplesTable() != null) {
			TableFormatter formatter = new TableFormatter(theExamples.getTheExamplesTable());
			formatter.format(doc, ga, df);
		}
	}

}
