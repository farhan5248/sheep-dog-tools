# Formatting

## Initial Generated Files

```
cucumberxtexteditor/src/org/farhan/formatting2/CucumberFormatter.java
```

## Navigating File Contents

You can use the getters but that won't work for keywords or terminals.
Starting from the first rule, `Feature:` in my case, follow these steps.

1. If it's a keyword, grammar access it, get region
   ```java
   formatKeyword(df.getRegion(theFeature, a.getFeatureKeyword_1()), doc);
   ```
1. If it's a call rule, aka terminal or type
   1. If it's a terminal, grammar access it, get region
      ```java
      formatEOL2RuleCall(df.getRegion(theFeature, a.getEOLTerminalRuleCall_3()), doc);
      ```
   1. If it's a type, it's either all terminals (String) or not
      1. If it's all terminals, like Phrase, grammar access it, get region
         ```java
         formatPhraseRuleCall(df.getRegion(theFeature, a.getNamePhraseParserRuleCall_2_0()), doc);
         ```
      1. If it's not all terminals
         1. If it's a collection, go through its children
            1. If it's a list of concrete elements it's easy
            ```java
            for (Statement s : theFeature.getStatements()) {

              StatementFormatter formatter = new StatementFormatter(s);
              formatter.isLast(isLastElement(s, theFeature.getStatements()));
              formatter.setIndent(2);
              formatter.isLastEOLDouble(true);
              formatter.format(doc, ga, df);
            }
            ```
            1. Else if it's an abstract list, make a Factory to find the right constructor
               ```java
               for (AbstractScenario s : theFeature.getAbstractScenarios()) {
                 AbstractScenarioFormatter formatter = newAbstractScenarioFormatter(s);
                 formatter.setIndent(2);
                 formatter.format(doc, ga, df);
               }

               private AbstractScenarioFormatter newAbstractScenarioFormatter(AbstractScenario s) {
                 if (s instanceof Background) {
                   return new BackgroundFormatter((Background) s);
                 } else if (s instanceof Scenario) {
                   return new ScenarioFormatter((Scenario) s);
                 } else if (s instanceof ScenarioOutline) {
                   return new ScenarioOutlineFormatter((ScenarioOutline) s);
                 } else {
                   return null;
                 }
               }
               ```
         3. Else it's just another type so start from the top again.

## Regions

All 3 approaches below reference the same region, which can be tested by triggering a ConflictingFormattingException.
I stick with just the `ruleCall` for terminals and types and `keyword` for keyword strings.

```java
regionFor(model).feature(Literals.MODEL__NAME);
regionFor(model).assignment(ga.getModelAccess().getNameAssignment_1());
regionFor(model).ruleCall(ga.getModelAccess().getNamePhraseParserRuleCall_1_0());
```

## Formatting Hidden Regions

This is for stuff you define as hidden like `hidden(WS, SL_COMMENT)`.
The space/indent thing doesn't always work they way you want it.
I couldn't figure out why but I suspect it's because some default is somehow kicking in because of how I've defined the language. 
Anyways, what I basically do is strip out all the whitespace using the provided methods and then just tack on whitespace to the token themselves.

```java
public void formatPhraseRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {

  int hiddenLength = iSR.getPreviousHiddenRegion().getText().length();
  doc.prepend(iSR, it -> it.noSpace());
  doc.append(iSR, it -> it.noSpace());
  if (isMinIndentCnt && hiddenLength > getIndent().length()) {
    replace(doc, iSR, indent.repeat(hiddenLength) + iSR.getText());
  } else {
    replace(doc, iSR, getIndent() + iSR.getText());
  }
}
```

## Formatting Text Regions

In my `.xtext` file, `EOL` are treated as statement terminators like `;` in Java so they weren't included as a hidden element.

If you want to format the spaces around the non-hidden stuff like number of `EOL` in my case or aligning `Given` and `And` then you'd work directly with the text.

You'll need a class like this

```java
@SuppressWarnings("restriction")
public class TextReplacer extends AbstractTextReplacer {

  private String replacement;

  protected TextReplacer(IFormattableDocument document, ITextSegment region, String replacement) {
    super(document, region);
    this.replacement = replacement;
  }

  @Override
  public ITextReplacerContext createReplacements(ITextReplacerContext context) {
    context.addReplacement(getRegion().replaceWith(replacement));
    return context;
  }
}
```

Then invoke it like so.

```java
protected void replace(IFormattableDocument doc, ISemanticRegion iSR, String replacement) {
  doc.addReplacer(new TextReplacer(doc, iSR, replacement));
}
```