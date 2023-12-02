# Testing

## Initial Generated Files

Only the `CucumberParsingTest.java` is generated. 
If you see an `.xtend` file, change the `GenerateCucumber.mwe2` file settings.
You can add extra tests like I've done.

```
cucumberxtexteditor.tests/src/org/farhan/tests/CucumberParsingTest.java
```

## Using the editor to test itself

At some point, probably as I work on the validation regular expressions, I'll start to use the `cucumberxtexteditor` to write feature files to test itself.

While unit testing works well for small things, I personally find testing validation or the model transformations easier with BDD style scenarios and a DSL.

I'll put notes here on how to integrate cucumber into this project given that `mvn test` doesn't work out of the box. I might even move the tests into the main project instead of keeping them outside. When I do that, I'll then have to figure out how to stop the auto-generation of tests, perhaps by updating the parent `pom.xml`.