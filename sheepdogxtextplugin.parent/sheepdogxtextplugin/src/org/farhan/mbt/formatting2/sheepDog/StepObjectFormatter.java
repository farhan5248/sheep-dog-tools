package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.StepObjectElements;
import org.farhan.mbt.sheepDog.StepObject;
import org.farhan.mbt.sheepDog.Statement;
import org.farhan.mbt.sheepDog.StepDefinition;

public class StepObjectFormatter extends Formatter {

	private StepObject theStepObject;

	public StepObjectFormatter(StepObject theStepObject) {
		this.theStepObject = theStepObject;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		StepObjectElements a = ga.getStepObjectAccess();

		formatKeywordTrailingSpace(df.getRegion(theStepObject, a.getEqualsSignKeyword_0()), doc);
		formatKeywordTrailingSpace(df.getRegion(theStepObject, a.getStepObjectKeyword_1()), doc);
		formatTitle(df.getRegion(theStepObject, a.getNameTitleParserRuleCall_2_0()), doc);
		formatEOL2RuleCall(df.getRegion(theStepObject, a.getEOLTerminalRuleCall_3()), doc);
		for (Statement s : theStepObject.getStatementList()) {
			StatementFormatter formatter = new StatementFormatter(s);
			formatter.isLast(isLastElement(s, theStepObject.getStatementList()));
			formatter.format(doc, ga, df);
		}
		for (StepDefinition s : theStepObject.getStepDefinitionList()) {
			StepDefinitionFormatter formatter = new StepDefinitionFormatter(s);
			formatter.format(doc, ga, df);
		}
	}

}
