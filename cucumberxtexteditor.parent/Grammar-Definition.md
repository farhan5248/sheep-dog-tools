# Code Generation

## Initial Generated Files

These get updated but I only update the `.mwe2` file and the `.xtext` file.

```
cucumberxtexteditor/src/org/farhan/Cucumber.xtext
cucumberxtexteditor/src/org/farhan/GenerateCucumber.mwe2
cucumberxtexteditor/src/org/farhan/generator/CucumberGenerator.xtend
cucumberxtexteditor/src-gen/org/farhan/AbstractCucumberRuntimeModule.java
cucumberxtexteditor/xtend-gen/org/farhan/generator/CucumberGenerator.java
```

## Defining Language Grammar

There's keywords, terminals and types. You define types using keyword, terminals and types.

1. Keywords are literal strings like `Given:`. 
2. Terminals are like literals, they're defined with regular expressions.
3. Types have assignments, keywords and terminals.

When creating your `.xtext` file you need to keep an eye on the generated Java classes.
Like I first tried having one `Step` keyword with `(Given|When|Then|And|But|*)` but then I didn't get a Java class per keyword, just one for `Step`.
So I guess you have to balance that duplication in your `.xtext` file.

Types can be like interfaces or abstract classes like `Step` or `Abstract Scenario`.

```xtext
AbstractScenario:
	Background | Scenario | ScenarioOutline;

Step:
	Given | When | Then | And | But | Asterisk;
```

Types can also be like classes with named attributes that make up the setters/getters like `Given:` or `Feature:`.

```xtext
Feature:
	(tags+=Tag+ EOL)?
	'Feature:' name=Phrase EOL
	statements+=Statement*
	abstractScenarios+=AbstractScenario*;

Given:
	'Given' name=Phrase EOL
	(theStepTable=StepTable | theDocString=DocString)?;
```

Some attributes are collections like `rows` or `cells`. 

```xtext
ExamplesTable:
	rows+=Row+;

StepTable:
	rows+=Row+;

Row:
	cells+=Cell+ '|' EOL;

Cell:
	cell='|' name=Phrase;
```

If `*` is used for lists, then the getter returns an empty list.
If `+` is used for lists but but optional, then the getter returns null instead of a list object.

```java
		for (Statement s : theFeature.getStatements()) {

			StatementFormatter formatter = new StatementFormatter(s);
			formatter.isLast(isLastElement(s, theFeature.getStatements()));
			formatter.setIndent(2);
			formatter.isLastEOLDouble(true);
			formatter.format(doc, ga, df);
		}
```

Some attributes are optional like `(theStepTable=StepTable | theDocString=DocString)?;`. 
The one that isn't set is null.

```java
	public void format(IFormattableDocument doc, CucumberGrammarAccess ga, CucumberFormatter df) {

		AbstractParserRuleElementFinder a = getAccess(ga);
		formatKeyword(df.getRegion(theStep, getKeyword(a)), doc);
		formatPhraseRuleCall(df.getRegion(theStep, getPhraseRuleCall(a)), doc);
		formatEOL12RuleCall(df.getRegion(theStep, getEOLRuleCall(a)), doc);
		if (theStep.getTheStepTable() != null) {
			StepTableFormatter formatter = new StepTableFormatter(theStep.getTheStepTable());
			formatter.setIndent(10);
			formatter.isEOLDouble(isLast);
			formatter.format(doc, ga, df);
		}
		if (theStep.getTheDocString() != null) {
			DocStringFormatter formatter2 = new DocStringFormatter(theStep.getTheDocString());
			formatter2.setIndent(10);
			formatter2.isEOLDouble(isLast);
			formatter2.format(doc, ga, df);
		}
	}
```