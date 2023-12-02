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

## Navigating File Contents

There's keywords, terminals and types. You define terminals and types using keyword, terminals and types.

Keywords are literal strings like `Given:`. Terminals are like literals, they're defined with regular expressions.
Types have assignments, keywords and terminals.

Notes about types
1. Types can be like interfaces or abstract like `Step` or `Abstract Scenario`.
2. Types can also be like classes with named attributes that make up the setters/getters like `Given:` or `Feature:`.
3. Some attributes are collections like `statements` or `rows`. 
4. If `*` is used for lists, then the getter returns an empty list.
5. If `+` is used for lists but but optional, then the getter returns null instead of a list object.
6. Some attributes are optional like `(theStepTable=StepTable | theDocString=DocString)?;`. The one that isn't set is null.


