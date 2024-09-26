# Xtext plugin

Once you've the initial project created and can run it, you can start to modify it.


## Add dependencies

If you want to add dependencies, you don't add them like you would normally. 
Here's what I did.

Create a `lib` directory under the `cucumberxtexteditor` directory

Add the `sheep-dog-test` or your dependent jar to the pom

```
<properties>
	<sheep-dog-test.version>1.2-SNAPSHOT</sheep-dog-test.version>
</properties>

<dependencies>
	<dependency>
		<groupId>org.farhan</groupId>
		<artifactId>sheep-dog-test</artifactId>
		<version>${sheep-dog-test.version}</version>
	</dependency>
</dependencies>
```

Add the `maven-dependency-plugin` to copy the jars you want into the `lib` directory.
The `stripVersion` is needed to make updating the `build.properties` less tedious.

```
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-dependency-plugin</artifactId>
	<version>3.6.1</version>
	<executions>
		<execution>
			<id>copy</id>
			<phase>initialize</phase>
			<goals>
				<goal>copy-dependencies</goal>
			</goals>
			<configuration>
				<stripVersion>true</stripVersion>
				<includeGroupIds>org.farhan</includeGroupIds>
				<outputDirectory>
					${project.basedir}/../cucumberxtexteditor/lib/</outputDirectory>
			</configuration>
		</execution>
	</executions>
</plugin>
```

Update the `maven-clean-plugin` to delete the jars before downloading them again. 
Even though the `copy` goal above will overwrite the jar, the `clean` phase will remove previous versions.

```
  <plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-clean-plugin</artifactId>
    <configuration>
      <filesets combine.children="append">
...
        <fileset>
          <directory>
            ${project.basedir}/../cucumberxtexteditor/lib/</directory>
          <includes>
            <include>**/*</include>
          </includes>
        </fileset>
...
      </filesets>
    </configuration>
  </plugin>
```

Initially, copy the jar into the lib directory for the next steps.
Open the `MANIFEST.MF` file in the `cucumberxtexteditor\META-INF` directory. 
In the `Runtime` tab, `Classpath` section, click on `Add` to add the jar to the list. 
In the `Build` tab, `Binary Build` section, put a check next to the jar in the list. 
The `MANIFEST.MF`, `build.properties` and `classpath` files should all have a reference to the jar now.
Rebuild the project and then you can use the jar in your code.
Run `mvn generate-sources` to test it out as well.

## Grammar Definition

There's keywords, terminals and types. You define types using keyword, terminals and types.

1. Keywords are literal strings like `Given:`. 
2. Terminals are like literals, they're defined with regular expressions.
3. Types have assignments, keywords and terminals.

When creating your `.xtext` file you need to keep an eye on the generated Java classes.
Like I first tried having one `Step` keyword with `(Given|When|Then|And|But|*)` but then I didn't get a Java class per keyword, just one for `Step`.
So I guess you have to balance that duplication in your `.xtext` file.
The other reason for not having `(Given|When|Then|And|But|*)` is that when you create a feature file, the API automatically picks the keyword. In this case, it'll always pick `Given` and there's no simple way to override it that I know of currently.


## Code Generation

### Initial Generated Files

```
cucumberxtexteditor/src/org/farhan/generator/CucumberGenerator.xtend
```

### Java vs Xtend Generator

The goal of these example projects is to make it easier to start using Xtext.
Because of that I took the generated `CucumberGenerator.java` file and replaced the `CucumberGenerator.xtend` file.
Later if you like, you can work with Xtend but I generally have stayed away from it.
You'll find the `CucumberGenerator.java` in the `src-gen` source folder.


## Content Assist

### Initial Generated Files

```
cucumberxtexteditor.ui/src/org/farhan/ui/contentassist/CucumberProposalProvider.java
```

### Usage

The content assist is triggered when you press `CTRL+SPACE`.
I haven't figured out how to have it appear automatically like when you press `.` in Java and suggestions pop up. I'll look into that.
There's a way to add documentation which I'll code later.


## Formatting

### Initial Generated Files

```
cucumberxtexteditor/src/org/farhan/formatting2/CucumberFormatter.java
```

## Quick Fix

### Initial Generated Files

```
cucumberxtexteditor.ui/src/org/farhan/ui/quickfix/CucumberQuickfixProvider.java
```

### Usage

With this you can modify the file itself or by generating code.
It's like when using the Java editor you can create a class that doesn't exist or change the method name or type itself.
For now I haven't done anything special with the file modification quick fix.
What I want to do is have it suggest a qualified name for those that don't have a component specified.
Another quick fix is to rename an object path if there's already an object defined but with a different path.

## Syntax-Colouring

### Initial Generated Files

```
cucumberxtexteditor.ui/src/org/farhan/ui/CucumberUiModule.java
cucumberxtexteditor.ui/src/org/farhan/ui/quickfix/CucumberQuickfixProvider.java
cucumberxtexteditor.ui/src/org/farhan/ui/syntaxcoloring/CucumberAntlrTokenToAttributeIdMapper.java
cucumberxtexteditor.ui/src/org/farhan/ui/syntaxcoloring/CucumberHighlightingConfiguration.java
cucumberxtexteditor.ui/src/org/farhan/ui/syntaxcoloring/CucumberSemanticHighlightingCalculator.java
cucumberxtexteditor.ui/src-gen/org/farhan/ui/AbstractCucumberUiModule.java
```

### Highlighting whole tokens

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

### Highlighting parts of tokens

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
# Validation

## Initial Generated Files

```
cucumberxtexteditor/src/org/farhan/validation/CucumberValidator.java
```

### Usage

There's 3 types of checks, `FAST`, `NORMAL`, `EXPENSIVE`.
They're triggered when the file is modified, when it's saved and when you select the `Validate` menu item respectively.