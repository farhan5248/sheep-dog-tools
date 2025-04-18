package org.farhan.dsl.sheepdog.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.dsl.sheepdog.services.SheepDogGrammarAccess;
import org.farhan.dsl.sheepdog.services.SheepDogGrammarAccess.StepParametersElements;
import org.farhan.dsl.sheepdog.sheepDog.StepParameters;

public class StepParametersFormatter extends Formatter {

	private StepParameters theStepParameters;

	public StepParametersFormatter(StepParameters theStepParameters) {
		this.theStepParameters = theStepParameters;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		StepParametersElements a = ga.getStepParametersAccess();

		formatKeywordTrailingSpace(df.getRegion(theStepParameters, a.getAsteriskKeyword_0()), doc);
		formatKeywordTrailingSpace(df.getRegion(theStepParameters, a.getStepParametersKeyword_1()), doc);
		formatTitle(df.getRegion(theStepParameters, a.getNameTitleParserRuleCall_2_0()), doc);

		if (theStepParameters.getTable() != null || theStepParameters.getStatementList() != null) {
			formatEOL1RuleCall(df.getRegion(theStepParameters, a.getEOLTerminalRuleCall_3()), doc);
		} else {
			formatEOL2RuleCall(df.getRegion(theStepParameters, a.getEOLTerminalRuleCall_3()), doc);
		}

		if (theStepParameters.getStatementList() != null) {
			StatementListFormatter formatter = new StatementListFormatter(theStepParameters.getStatementList());
			formatter.format(doc, ga, df);
		}

		if (theStepParameters.getTable() != null) {
			TableFormatter formatter = new TableFormatter(theStepParameters.getTable());
			formatter.format(doc, ga, df);
		}
	}

}
