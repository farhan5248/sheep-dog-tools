/*
 * generated by Xtext 2.32.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Feature";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0_0());
					}
					lv_tags_0_0=ruleTag
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFeatureRule());
						}
						add(
							$current,
							"tags",
							lv_tags_0_0,
							"org.xtext.example.mydsl.MyDsl.Tag");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			this_EOL_1=RULE_EOL
			{
				newLeafNode(this_EOL_1, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_0_1());
			}
		)?
		otherlv_2='Feature:'
		{
			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFeatureKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getNamePhraseParserRuleCall_2_0());
				}
				lv_name_3_0=rulePhrase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"org.xtext.example.mydsl.MyDsl.Phrase");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_4=RULE_EOL
		{
			newLeafNode(this_EOL_4, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_4_0());
				}
				lv_statements_5_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					add(
						$current,
						"statements",
						lv_statements_5_0,
						"org.xtext.example.mydsl.MyDsl.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getAbstractScenariosAbstractScenarioParserRuleCall_5_0());
				}
				lv_abstractScenarios_6_0=ruleAbstractScenario
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					add(
						$current,
						"abstractScenarios",
						lv_abstractScenarios_6_0,
						"org.xtext.example.mydsl.MyDsl.AbstractScenario");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleAbstractScenario
entryRuleAbstractScenario returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractScenarioRule()); }
	iv_ruleAbstractScenario=ruleAbstractScenario
	{ $current=$iv_ruleAbstractScenario.current; }
	EOF;

// Rule AbstractScenario
ruleAbstractScenario returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0());
		}
		this_Background_0=ruleBackground
		{
			$current = $this_Background_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1());
		}
		this_Scenario_1=ruleScenario
		{
			$current = $this_Scenario_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioOutlineParserRuleCall_2());
		}
		this_ScenarioOutline_2=ruleScenarioOutline
		{
			$current = $this_ScenarioOutline_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBackground
entryRuleBackground returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBackgroundRule()); }
	iv_ruleBackground=ruleBackground
	{ $current=$iv_ruleBackground.current; }
	EOF;

// Rule Background
ruleBackground returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Background:'
		{
			newLeafNode(otherlv_0, grammarAccess.getBackgroundAccess().getBackgroundKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBackgroundAccess().getNamePhraseParserRuleCall_1_0());
				}
				lv_name_1_0=rulePhrase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBackgroundRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.Phrase");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_2=RULE_EOL
		{
			newLeafNode(this_EOL_2, grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBackgroundAccess().getStatementsStatementParserRuleCall_3_0());
				}
				lv_statements_3_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBackgroundRule());
					}
					add(
						$current,
						"statements",
						lv_statements_3_0,
						"org.xtext.example.mydsl.MyDsl.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_4_0());
				}
				lv_steps_4_0=ruleStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBackgroundRule());
					}
					add(
						$current,
						"steps",
						lv_steps_4_0,
						"org.xtext.example.mydsl.MyDsl.Step");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleScenario
entryRuleScenario returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenarioRule()); }
	iv_ruleScenario=ruleScenario
	{ $current=$iv_ruleScenario.current; }
	EOF;

// Rule Scenario
ruleScenario returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0_0());
					}
					lv_tags_0_0=ruleTag
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getScenarioRule());
						}
						add(
							$current,
							"tags",
							lv_tags_0_0,
							"org.xtext.example.mydsl.MyDsl.Tag");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			this_EOL_1=RULE_EOL
			{
				newLeafNode(this_EOL_1, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_0_1());
			}
		)?
		otherlv_2='Scenario:'
		{
			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getScenarioKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getNamePhraseParserRuleCall_2_0());
				}
				lv_name_3_0=rulePhrase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"org.xtext.example.mydsl.MyDsl.Phrase");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_4=RULE_EOL
		{
			newLeafNode(this_EOL_4, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_0());
				}
				lv_statements_5_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					add(
						$current,
						"statements",
						lv_statements_5_0,
						"org.xtext.example.mydsl.MyDsl.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0());
				}
				lv_steps_6_0=ruleStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					add(
						$current,
						"steps",
						lv_steps_6_0,
						"org.xtext.example.mydsl.MyDsl.Step");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleScenarioOutline
entryRuleScenarioOutline returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenarioOutlineRule()); }
	iv_ruleScenarioOutline=ruleScenarioOutline
	{ $current=$iv_ruleScenarioOutline.current; }
	EOF;

// Rule ScenarioOutline
ruleScenarioOutline returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getScenarioOutlineAccess().getTagsTagParserRuleCall_0_0_0());
					}
					lv_tags_0_0=ruleTag
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
						}
						add(
							$current,
							"tags",
							lv_tags_0_0,
							"org.xtext.example.mydsl.MyDsl.Tag");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			this_EOL_1=RULE_EOL
			{
				newLeafNode(this_EOL_1, grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_0_1());
			}
		)?
		otherlv_2='Scenario Outline:'
		{
			newLeafNode(otherlv_2, grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getNamePhraseParserRuleCall_2_0());
				}
				lv_name_3_0=rulePhrase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"org.xtext.example.mydsl.MyDsl.Phrase");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_4=RULE_EOL
		{
			newLeafNode(this_EOL_4, grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getStatementsStatementParserRuleCall_4_0());
				}
				lv_statements_5_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
					}
					add(
						$current,
						"statements",
						lv_statements_5_0,
						"org.xtext.example.mydsl.MyDsl.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_5_0());
				}
				lv_steps_6_0=ruleStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
					}
					add(
						$current,
						"steps",
						lv_steps_6_0,
						"org.xtext.example.mydsl.MyDsl.Step");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioOutlineAccess().getExamplesExamplesParserRuleCall_6_0());
				}
				lv_examples_7_0=ruleExamples
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioOutlineRule());
					}
					add(
						$current,
						"examples",
						lv_examples_7_0,
						"org.xtext.example.mydsl.MyDsl.Examples");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleExamples
entryRuleExamples returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExamplesRule()); }
	iv_ruleExamples=ruleExamples
	{ $current=$iv_ruleExamples.current; }
	EOF;

// Rule Examples
ruleExamples returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getExamplesAccess().getTagsTagParserRuleCall_0_0_0());
					}
					lv_tags_0_0=ruleTag
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExamplesRule());
						}
						add(
							$current,
							"tags",
							lv_tags_0_0,
							"org.xtext.example.mydsl.MyDsl.Tag");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			this_EOL_1=RULE_EOL
			{
				newLeafNode(this_EOL_1, grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_0_1());
			}
		)?
		otherlv_2='Examples:'
		{
			newLeafNode(otherlv_2, grammarAccess.getExamplesAccess().getExamplesKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExamplesAccess().getNamePhraseParserRuleCall_2_0());
				}
				lv_name_3_0=rulePhrase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExamplesRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"org.xtext.example.mydsl.MyDsl.Phrase");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_4=RULE_EOL
		{
			newLeafNode(this_EOL_4, grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExamplesAccess().getStatementsStatementParserRuleCall_4_0());
				}
				lv_statements_5_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExamplesRule());
					}
					add(
						$current,
						"statements",
						lv_statements_5_0,
						"org.xtext.example.mydsl.MyDsl.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getExamplesAccess().getTheExamplesTableExamplesTableParserRuleCall_5_0());
				}
				lv_theExamplesTable_6_0=ruleExamplesTable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExamplesRule());
					}
					set(
						$current,
						"theExamplesTable",
						lv_theExamplesTable_6_0,
						"org.xtext.example.mydsl.MyDsl.ExamplesTable");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExamplesTable
entryRuleExamplesTable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExamplesTableRule()); }
	iv_ruleExamplesTable=ruleExamplesTable
	{ $current=$iv_ruleExamplesTable.current; }
	EOF;

// Rule ExamplesTable
ruleExamplesTable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getExamplesTableAccess().getRowsRowParserRuleCall_0());
			}
			lv_rows_0_0=ruleRow
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getExamplesTableRule());
				}
				add(
					$current,
					"rows",
					lv_rows_0_0,
					"org.xtext.example.mydsl.MyDsl.Row");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleStepTable
entryRuleStepTable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStepTableRule()); }
	iv_ruleStepTable=ruleStepTable
	{ $current=$iv_ruleStepTable.current; }
	EOF;

// Rule StepTable
ruleStepTable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getStepTableAccess().getRowsRowParserRuleCall_0());
			}
			lv_rows_0_0=ruleRow
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getStepTableRule());
				}
				add(
					$current,
					"rows",
					lv_rows_0_0,
					"org.xtext.example.mydsl.MyDsl.Row");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleRow
entryRuleRow returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRowRule()); }
	iv_ruleRow=ruleRow
	{ $current=$iv_ruleRow.current; }
	EOF;

// Rule Row
ruleRow returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRowAccess().getCellsCellParserRuleCall_0_0());
				}
				lv_cells_0_0=ruleCell
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRowRule());
					}
					add(
						$current,
						"cells",
						lv_cells_0_0,
						"org.xtext.example.mydsl.MyDsl.Cell");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_1='|'
		{
			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getVerticalLineKeyword_1());
		}
		this_EOL_2=RULE_EOL
		{
			newLeafNode(this_EOL_2, grammarAccess.getRowAccess().getEOLTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleCell
entryRuleCell returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCellRule()); }
	iv_ruleCell=ruleCell
	{ $current=$iv_ruleCell.current; }
	EOF;

// Rule Cell
ruleCell returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_cell_0_0='|'
				{
					newLeafNode(lv_cell_0_0, grammarAccess.getCellAccess().getCellVerticalLineKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCellRule());
					}
					setWithLastConsumed($current, "cell", lv_cell_0_0, "|");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCellAccess().getNamePhraseParserRuleCall_1_0());
				}
				lv_name_1_0=rulePhrase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCellRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.Phrase");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStep
entryRuleStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStepRule()); }
	iv_ruleStep=ruleStep
	{ $current=$iv_ruleStep.current; }
	EOF;

// Rule Step
ruleStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStepAccess().getGivenParserRuleCall_0());
		}
		this_Given_0=ruleGiven
		{
			$current = $this_Given_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStepAccess().getWhenParserRuleCall_1());
		}
		this_When_1=ruleWhen
		{
			$current = $this_When_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStepAccess().getThenParserRuleCall_2());
		}
		this_Then_2=ruleThen
		{
			$current = $this_Then_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStepAccess().getAndParserRuleCall_3());
		}
		this_And_3=ruleAnd
		{
			$current = $this_And_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStepAccess().getButParserRuleCall_4());
		}
		this_But_4=ruleBut
		{
			$current = $this_But_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStepAccess().getAsteriskParserRuleCall_5());
		}
		this_Asterisk_5=ruleAsterisk
		{
			$current = $this_Asterisk_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDocString
entryRuleDocString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDocStringRule()); }
	iv_ruleDocString=ruleDocString
	{ $current=$iv_ruleDocString.current; }
	EOF;

// Rule DocString
ruleDocString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='"""'
		{
			newLeafNode(otherlv_0, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_0());
		}
		this_EOL_1=RULE_EOL
		{
			newLeafNode(this_EOL_1, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDocStringAccess().getStatementsStatementParserRuleCall_2_0());
				}
				lv_statements_2_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDocStringRule());
					}
					add(
						$current,
						"statements",
						lv_statements_2_0,
						"org.xtext.example.mydsl.MyDsl.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='"""'
		{
			newLeafNode(otherlv_3, grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_3());
		}
		this_EOL_4=RULE_EOL
		{
			newLeafNode(this_EOL_4, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleGiven
entryRuleGiven returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGivenRule()); }
	iv_ruleGiven=ruleGiven
	{ $current=$iv_ruleGiven.current; }
	EOF;

// Rule Given
ruleGiven returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Given'
		{
			newLeafNode(otherlv_0, grammarAccess.getGivenAccess().getGivenKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGivenAccess().getNamePhraseParserRuleCall_1_0());
				}
				lv_name_1_0=rulePhrase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGivenRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.Phrase");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_2=RULE_EOL
		{
			newLeafNode(this_EOL_2, grammarAccess.getGivenAccess().getEOLTerminalRuleCall_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGivenAccess().getTheStepTableStepTableParserRuleCall_3_0_0());
					}
					lv_theStepTable_3_0=ruleStepTable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGivenRule());
						}
						set(
							$current,
							"theStepTable",
							lv_theStepTable_3_0,
							"org.xtext.example.mydsl.MyDsl.StepTable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGivenAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
					}
					lv_theDocString_4_0=ruleDocString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGivenRule());
						}
						set(
							$current,
							"theDocString",
							lv_theDocString_4_0,
							"org.xtext.example.mydsl.MyDsl.DocString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleWhen
entryRuleWhen returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhenRule()); }
	iv_ruleWhen=ruleWhen
	{ $current=$iv_ruleWhen.current; }
	EOF;

// Rule When
ruleWhen returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='When'
		{
			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getWhenKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhenAccess().getNamePhraseParserRuleCall_1_0());
				}
				lv_name_1_0=rulePhrase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhenRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.Phrase");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_2=RULE_EOL
		{
			newLeafNode(this_EOL_2, grammarAccess.getWhenAccess().getEOLTerminalRuleCall_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getWhenAccess().getTheStepTableStepTableParserRuleCall_3_0_0());
					}
					lv_theStepTable_3_0=ruleStepTable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWhenRule());
						}
						set(
							$current,
							"theStepTable",
							lv_theStepTable_3_0,
							"org.xtext.example.mydsl.MyDsl.StepTable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getWhenAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
					}
					lv_theDocString_4_0=ruleDocString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWhenRule());
						}
						set(
							$current,
							"theDocString",
							lv_theDocString_4_0,
							"org.xtext.example.mydsl.MyDsl.DocString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleThen
entryRuleThen returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getThenRule()); }
	iv_ruleThen=ruleThen
	{ $current=$iv_ruleThen.current; }
	EOF;

// Rule Then
ruleThen returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Then'
		{
			newLeafNode(otherlv_0, grammarAccess.getThenAccess().getThenKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getThenAccess().getNamePhraseParserRuleCall_1_0());
				}
				lv_name_1_0=rulePhrase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getThenRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.Phrase");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_2=RULE_EOL
		{
			newLeafNode(this_EOL_2, grammarAccess.getThenAccess().getEOLTerminalRuleCall_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getThenAccess().getTheStepTableStepTableParserRuleCall_3_0_0());
					}
					lv_theStepTable_3_0=ruleStepTable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThenRule());
						}
						set(
							$current,
							"theStepTable",
							lv_theStepTable_3_0,
							"org.xtext.example.mydsl.MyDsl.StepTable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThenAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
					}
					lv_theDocString_4_0=ruleDocString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThenRule());
						}
						set(
							$current,
							"theDocString",
							lv_theDocString_4_0,
							"org.xtext.example.mydsl.MyDsl.DocString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleAnd
entryRuleAnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndRule()); }
	iv_ruleAnd=ruleAnd
	{ $current=$iv_ruleAnd.current; }
	EOF;

// Rule And
ruleAnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='And'
		{
			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAndAccess().getNamePhraseParserRuleCall_1_0());
				}
				lv_name_1_0=rulePhrase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAndRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.Phrase");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_2=RULE_EOL
		{
			newLeafNode(this_EOL_2, grammarAccess.getAndAccess().getEOLTerminalRuleCall_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getAndAccess().getTheStepTableStepTableParserRuleCall_3_0_0());
					}
					lv_theStepTable_3_0=ruleStepTable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndRule());
						}
						set(
							$current,
							"theStepTable",
							lv_theStepTable_3_0,
							"org.xtext.example.mydsl.MyDsl.StepTable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getAndAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
					}
					lv_theDocString_4_0=ruleDocString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndRule());
						}
						set(
							$current,
							"theDocString",
							lv_theDocString_4_0,
							"org.xtext.example.mydsl.MyDsl.DocString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleBut
entryRuleBut returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButRule()); }
	iv_ruleBut=ruleBut
	{ $current=$iv_ruleBut.current; }
	EOF;

// Rule But
ruleBut returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='But'
		{
			newLeafNode(otherlv_0, grammarAccess.getButAccess().getButKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getButAccess().getNamePhraseParserRuleCall_1_0());
				}
				lv_name_1_0=rulePhrase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getButRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.Phrase");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_2=RULE_EOL
		{
			newLeafNode(this_EOL_2, grammarAccess.getButAccess().getEOLTerminalRuleCall_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getButAccess().getTheStepTableStepTableParserRuleCall_3_0_0());
					}
					lv_theStepTable_3_0=ruleStepTable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getButRule());
						}
						set(
							$current,
							"theStepTable",
							lv_theStepTable_3_0,
							"org.xtext.example.mydsl.MyDsl.StepTable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getButAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
					}
					lv_theDocString_4_0=ruleDocString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getButRule());
						}
						set(
							$current,
							"theDocString",
							lv_theDocString_4_0,
							"org.xtext.example.mydsl.MyDsl.DocString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleAsterisk
entryRuleAsterisk returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAsteriskRule()); }
	iv_ruleAsterisk=ruleAsterisk
	{ $current=$iv_ruleAsterisk.current; }
	EOF;

// Rule Asterisk
ruleAsterisk returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='*'
		{
			newLeafNode(otherlv_0, grammarAccess.getAsteriskAccess().getAsteriskKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAsteriskAccess().getNamePhraseParserRuleCall_1_0());
				}
				lv_name_1_0=rulePhrase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAsteriskRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.Phrase");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_2=RULE_EOL
		{
			newLeafNode(this_EOL_2, grammarAccess.getAsteriskAccess().getEOLTerminalRuleCall_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getAsteriskAccess().getTheStepTableStepTableParserRuleCall_3_0_0());
					}
					lv_theStepTable_3_0=ruleStepTable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAsteriskRule());
						}
						set(
							$current,
							"theStepTable",
							lv_theStepTable_3_0,
							"org.xtext.example.mydsl.MyDsl.StepTable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getAsteriskAccess().getTheDocStringDocStringParserRuleCall_3_1_0());
					}
					lv_theDocString_4_0=ruleDocString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAsteriskRule());
						}
						set(
							$current,
							"theDocString",
							lv_theDocString_4_0,
							"org.xtext.example.mydsl.MyDsl.DocString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStatementAccess().getNamePhraseParserRuleCall_0_0());
				}
				lv_name_0_0=rulePhrase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatementRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.xtext.example.mydsl.MyDsl.Phrase");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_1=RULE_EOL
		{
			newLeafNode(this_EOL_1, grammarAccess.getStatementAccess().getEOLTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRulePhrase
entryRulePhrase returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPhraseRule()); }
	iv_rulePhrase=rulePhrase
	{ $current=$iv_rulePhrase.current.getText(); }
	EOF;

// Rule Phrase
rulePhrase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getPhraseAccess().getIDTerminalRuleCall());
		}
	)+
;

// Entry rule entryRuleTag
entryRuleTag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTagRule()); }
	iv_ruleTag=ruleTag
	{ $current=$iv_ruleTag.current; }
	EOF;

// Rule Tag
ruleTag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@'
		{
			newLeafNode(otherlv_0, grammarAccess.getTagAccess().getCommercialAtKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTagAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTagRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.ID");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_'|'.'|'0'..'9')*;

RULE_WS : (' '|'\t')+;

RULE_SL_COMMENT : '#' ~(('\r'|'\n'))* RULE_EOL;

RULE_EOL : '\r\n'+;