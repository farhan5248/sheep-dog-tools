# Syntax-Colouring

## Initial Generated Files

```
cucumberxtexteditor.ui/src/org/farhan/ui/CucumberUiModule.java
cucumberxtexteditor.ui/src/org/farhan/ui/quickfix/CucumberQuickfixProvider.java
cucumberxtexteditor.ui/src/org/farhan/ui/syntaxcoloring/CucumberAntlrTokenToAttributeIdMapper.java
cucumberxtexteditor.ui/src/org/farhan/ui/syntaxcoloring/CucumberHighlightingConfiguration.java
cucumberxtexteditor.ui/src/org/farhan/ui/syntaxcoloring/CucumberSemanticHighlightingCalculator.java
cucumberxtexteditor.ui/src-gen/org/farhan/ui/AbstractCucumberUiModule.java
```

## Highlighting whole tokens

The `CucumberAntlrTokenToAttributeIdMapper` maps tokens to custom ID that you create.
The `CucumberHighlightingConfiguration` is used to assign colours etc to each of those ID.
The `CucumberSemanticHighlightingCalculator` is for things that don't have tokens. For example `Scenario Outline` parameters.
You can get creative with this, like if you see a table header doesn't have a param in the outline itself, you can highlight the header name.

## Highlighting parts of tokens

Explain how to highlight specific nodes like GWTAB* and tags vs parameters (not defined in grammar)