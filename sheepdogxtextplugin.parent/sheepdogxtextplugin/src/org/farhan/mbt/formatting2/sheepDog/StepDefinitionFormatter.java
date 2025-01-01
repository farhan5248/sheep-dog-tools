package org.farhan.mbt.formatting2.sheepDog;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.farhan.mbt.formatting2.SheepDogFormatter;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.services.SheepDogGrammarAccess.StepDefinitionElements;
import org.farhan.mbt.sheepDog.Statement;
import org.farhan.mbt.sheepDog.StepDefinition;
import org.farhan.mbt.sheepDog.StepParameters;

public class StepDefinitionFormatter extends Formatter {

	private StepDefinition theStepDefinition;

	public StepDefinitionFormatter(StepDefinition theStepDefinition) {
		this.theStepDefinition = theStepDefinition;
	}

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		StepDefinitionElements a = ga.getStepDefinitionAccess();

		formatKeywordTrailingSpace(df.getRegion(theStepDefinition, a.getEqualsSignEqualsSignKeyword_0()), doc);
		formatKeywordTrailingSpace(df.getRegion(theStepDefinition, a.getDefinitionKeyword_1()), doc);
		formatTitle(df.getRegion(theStepDefinition, a.getNameTitleParserRuleCall_2_0()), doc);
		formatEOL2RuleCall(df.getRegion(theStepDefinition, a.getEOLTerminalRuleCall_3()), doc);
		for (Statement s : theStepDefinition.getStatements()) {
			StatementFormatter formatter = new StatementFormatter(s);
			formatter.isLast(isLastElement(s, theStepDefinition.getStatements()));
			formatter.format(doc, ga, df);
		}
		for (StepParameters e : theStepDefinition.getStepParameters()) {
			StepParametersFormatter formatter = new StepParametersFormatter(e);
			formatter.format(doc, ga, df);
		}
	}
}