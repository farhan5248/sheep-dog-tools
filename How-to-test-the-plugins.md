# Xtext plugin

## Using the editor to test itself

While purely programming language tests work well for small things, I personally find testing things like validation or the model transformations easier with BDD style scenarios and a DSL. Originally I thought that at some point, probably as I work on the validation regular expressions, I'd start to use the `cucumberxtexteditor` to write feature files to test itself. However this is not possible for the forseable future. It was really tricky to integrate Cucumber into the test project and so I gave up. I think I need to understand all the annotations involved and what's being injected when. Another problem is that the usual `mvn test` command won't even run the Cucumber tests because of the packaging type plug-in which runs its own test runner etc.

