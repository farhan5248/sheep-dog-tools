# Formatting

## Initial Generated Files

```
cucumberxtexteditor/src/org/farhan/formatting2/CucumberFormatter.java
```

## Navigating File Contents

You can use the getter but won't work on keywords or terminals.
Terminals and Types are also called "call rules"

For each type, go through the children
1. it's a keyword, grammar access it, get region
2. it's a call rule, aka terminal or type
a. if it's a terminal, grammar access it, get region
b. if it's a type, it's either all terminals (String) or not
i. if it's all terminals, like Phrase, grammar access it, get region
ii. if it's not all terminals, references Types, go through its children

Get TODO markdown comments from formatting code

## Formatting Hidden Regions

This is for stuff you define as hidden like `hidden(WS, SL_COMMENT)`.

Point out how the space/indent thing doesn't always work they way you want it.

## Formatting Text Regions

In my `.xtext` file, `EOL` are treated as statement terminators like `;` in Java. So they weren't included as a hidden element.

If you want to format the spaces around the non-hidden stuff like number of `EOL` in my case or aligning `Given` and `And` then you'd work directly with the text.