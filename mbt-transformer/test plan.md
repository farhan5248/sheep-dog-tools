For lists, test empty and non-empty
For non-empty test 1,2,3 to ensure begining, middle and end elements are handled correctly


Feature:
	(tags+=Tag+ EOL)?                     0, 1, 2, 3 Tag
	'Feature:' name=Phrase EOL            1 Phrase
	statements+=Statement*                0, 1, 2, 3 Statement
	abstractScenarios+=AbstractScenario*; 0 Scenario


Feature:
	'Feature:' name=Phrase EOL   1 Phrase
Scenario:
	(tags+=Tag+ EOL)?            0, 1, 2, 3 Tag
	'Scenario:' name=Phrase EOL  1 Phrase
	statements+=Statement*       0, 1, 2, 3 Statement
	steps+=Step*;                1, 2, 3 Step
Step:
	Given | When | Then | And | But | Asterisk;    1 Given


Feature:
	'Feature:' name=Phrase EOL   1 Phrase
Scenario:
	'Scenario:' name=Phrase EOL  1 Phrase
	steps+=Step*;                1 Step
Step:
	Given | When | Then | And | But | Asterisk;    1


Feature:
	'Feature:' name=Phrase EOL   1 Phrase
Scenario:
	'Scenario:' name=Phrase EOL  1 Phrase
	steps+=Step*;                1 Step
Step:
	Given | When | Then | And | But | Asterisk;    1 Given
StepTable:
	rows+=Row+;                         1, 2, 3 Row
Row:
	cells+=Cell+ '|' EOL;               1, 2, 3, Cell  

	
Feature:
	'Feature:' name=Phrase EOL   1 Phrase
Scenario:
	'Scenario:' name=Phrase EOL  1 Phrase
	steps+=Step*;                1 Step
Step:
	Given | When | Then | And | But | Asterisk;    1 Given
DocString:
	'"""' EOL
	lines+=Line*                 1, 2, 3 Line
	'"""' EOL;

	
Feature:
	'Feature:' name=Phrase EOL    1 Phrase
Background:
	'Background:' name=Phrase EOL 1 Phrase
	statements+=Statement*        0, 1, 2, 3 Statement
	steps+=Step*;                 1, 2, 3 Step
Scenario:
	'Scenario:' name=Phrase EOL  1 Phrase
	steps+=Step*;                1 Step
Step:
	Given | When | Then | And | But | Asterisk;    1 Given


Feature:
	'Feature:' name=Phrase EOL    1 Phrase
ScenarioOutline:
	(tags+=Tag+ EOL)?                   0, 1, 2, 3 Tag
	'Scenario Outline:' name=Phrase EOL 1 Phrase
	statements+=Statement*              0, 1, 2, 3 Statement
	steps+=Step*                        1, 2, 3 Step
    examples+=Examples+;                1, 2, 3 Examples
Step:
	Given | When | Then | And | But | Asterisk;    1 Given
Examples:
	(tags+=Tag+ EOL)?                   1, 2, 3 Tag
	'Examples:' name=Phrase EOL         1 Phrase
	statements+=Statement*              1, 2, 3 Statement
	theExamplesTable=ExamplesTable;     1 ExamplesTable
ExamplesTable:
	rows+=Row+;                         1, Row
Row:
	cells+=Cell+ '|' EOL;               1, Cell  


Feature:
	'Feature:' name=Phrase EOL    1 Phrase
ScenarioOutline:
	'Scenario Outline:' name=Phrase EOL 1 Phrase
	steps+=Step*                        1 Step
    examples+=Examples+;                1 Examples
Step:
	Given | When | Then | And | But | Asterisk;    1 Given
Examples:
	'Examples:' name=Phrase EOL         1 Phrase
	theExamplesTable=ExamplesTable;     1 ExamplesTable
ExamplesTable:
	rows+=Row+;                         1, 2, 3 Row
Row:
	cells+=Cell+ '|' EOL;               1, 2, 3, Cell  