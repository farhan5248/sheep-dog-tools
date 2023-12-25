# Testing

## Initial Generated Files

Only the `CucumberParsingTest.java` is generated. 
If you see an `.xtend` file, change the `GenerateCucumber.mwe2` file settings.

```
cucumberxtexteditor.tests/src/org/farhan/tests/CucumberParsingTest.java
```

You can add extra tests like I've done but I don't know how to delete the CucumberParsingTest.
Also being a Maven person, I don't like having the tests in a completely different directory.
I think in the future, if I have the time and interest, I might try to figure out how to re-wire this all.

## Using the editor to test itself

Originally I thought that at some point, probably as I work on the validation regular expressions, I'd start to use the `cucumberxtexteditor` to write feature files to test itself.
However this is not possible for the forseable future. It was really tricky to integrate Cucumber into the test project and so I gave up.
I think I need to understand all the annotations involved and what's being injected when.
Another problem is that the usual `mvn test` command won't even run the Cucumber tests because of the packaging type plug-in which runs its own test runner etc.

While purely programming language tests work well for small things, I personally find testing things like validation or the model transformations easier with BDD style scenarios and a DSL.
For now I'm using Cucumber to test the standalone jar that I'm making and then I'll add that jar to this project and make some simple unit tests to make sure the jar integrates correctly.
What I'll do in the future if I have time is have this plug-in create java code automatically from a feature file.
This way I won't need Cucumber as a tool to run the code but I have the benefit of using `.feature` files.
