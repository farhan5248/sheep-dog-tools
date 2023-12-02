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

The `CucumberHighlightingConfiguration` is used to define the different styles. 
You identify each style with an ID.

```java
	public static final String DEFAULT_ID = "default";
	public static final String KEYWORD_FSE_ID = "keywordfse";
	public static final String KEYWORD_GWT_ID = "keywordgwt";
	public static final String SL_COMMENT_ID = "comment";
	public static final String STRING_ID = "string";
	public static final String TAG_ID = "tag";
	public static final String PARAMETER_ID = "parameter";
	public static final String DOC_ID = "document";
```

You also give them names for the `Window > Preferences` like so.

```java
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(KEYWORD_FSE_ID, "Keyword FSE", keywordFeatureScenarioExamplesTextStyle());
		acceptor.acceptDefaultHighlighting(KEYWORD_GWT_ID, "Keyword GWT", keywordGivenWhenThenTextStyle());
		acceptor.acceptDefaultHighlighting(SL_COMMENT_ID, "Comment", commentTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_ID, "String", stringTextStyle());
		acceptor.acceptDefaultHighlighting(PARAMETER_ID, "Parameter", parameterTextStyle());
		acceptor.acceptDefaultHighlighting(TAG_ID, "Tag", tagTextStyle());
		acceptor.acceptDefaultHighlighting(DOC_ID, "Document", documentTextStyle());
	}
```

Then you define each style. Each style can re-use an existing one.

```java
	public static TextStyle defaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}

	public static TextStyle documentTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(64, 128, 64));
		return textStyle;
	}

	public static TextStyle keywordFeatureScenarioExamplesTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(128, 128, 0));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
```

The `CucumberAntlrTokenToAttributeIdMapper` maps tokens to custom ID that you create. 
There are two types of tokens, terminal ones begining with `RULE` and the type ones which have the keyword like `Given:`.
Make sure you cover all the terminals and types in your `.xtext` file.

```java
		switch (tokenName) {
		case "RULE_EOL":
			// nothing to do here
...
		case "RULE_SL_COMMENT":
			return CucumberHighlightingConfiguration.SL_COMMENT_ID;
		case "'Feature:'":
			return CucumberHighlightingConfiguration.KEYWORD_FSE_ID;
...
			return CucumberHighlightingConfiguration.KEYWORD_GWT_ID;
		case "'But'":
			return CucumberHighlightingConfiguration.KEYWORD_GWT_ID;
		case "'*'":
			return CucumberHighlightingConfiguration.KEYWORD_GWT_ID;
		case "'|'":
			return CucumberHighlightingConfiguration.DEFAULT_ID;
		case "'\"\"\"'":
			return CucumberHighlightingConfiguration.DOC_ID;
		case "'@'":
			return CucumberHighlightingConfiguration.TAG_ID;
		default:
			return CucumberHighlightingConfiguration.DEFAULT_ID;
		}
```

## Highlighting parts of tokens

The `CucumberSemanticHighlightingCalculator` is for things that don't have tokens like `Scenario Outline` parameters.
You can get creative with this, like if you see a table header doesn't have a param in the outline itself, you can highlight the header name.

```java
	private void provideHighlightingForParameters(String name, INode node, int current,
			IHighlightedPositionAcceptor acceptor) {
		int start = name.indexOf('<', current);
		int stop = name.indexOf('>', start);
		if (start > 0 && stop > 0 && name.charAt(start + 1) != ' ') {
			acceptor.addPosition(node.getTotalOffset() + start, stop - start + 1,
					CucumberHighlightingConfiguration.PARAMETER_ID);
			this.provideHighlightingForParameters(name, node, stop + 1, acceptor);
		}
	}
```
	
In this example, I'm assigning the tag name the same colour as the keyword `@`.

```java
	private void provideHighlightingForTags(Tag tag, IHighlightedPositionAcceptor acceptor) {
		INode node = NodeModelUtils.getNode(tag);
		acceptor.addPosition(node.getTotalOffset(), node.getText().length(),
				CucumberHighlightingConfiguration.TAG_ID);
	}
``` 
