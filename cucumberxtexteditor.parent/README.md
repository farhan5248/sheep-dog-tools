# Cucumber Text Editor

These are the steps to create the project.
They're just notes for now, I'll get back to them with more details later.

## Create Xtext Project

You can follow the tutorial steps but if you want to just start coding to play around with this, I'd just do these steps first.

1. In Eclipse, click on File > New > Project.
2. In the New Project Wizard select Xtext > Xtext Project and click Next
3. Fill out the form:
a. Project name is whatever you want to call your Eclipse project. In the begining this is also used as the Maven artifact ID and group ID. Whatever you choose will have parent appended to it automatically.
b. Name is some package name like thing. I put my group ID followed by Cucumber so org.farhan.Cucumber
c. Extensions is feature since I want to associate those files with this editor
4. click on Next
5. Select Eclipse plug-in, Create Feature, Create Update Site, Maven for Preferred Build System

## Add Customisations

These are all the files to change. Some notes:
1. For the pom it's the group ID
2. For the Java ones, it's the code itself like highlighting or colouring or validation etc.
3. The rest are updated automatically when you run generate sources.

cucumberxtexteditor.parent/pom.xml
cucumberxtexteditor.parent/cucumberxtexteditor/pom.xml
cucumberxtexteditor.parent/cucumberxtexteditor/META-INF/MANIFEST.MF
cucumberxtexteditor.parent/cucumberxtexteditor/src/org/farhan/GenerateCucumber.mwe2
cucumberxtexteditor.parent/cucumberxtexteditor/src/org/farhan/formatting2/CucumberFormatter.java
cucumberxtexteditor.parent/cucumberxtexteditor/src/org/farhan/generator/CucumberGenerator.xtend
cucumberxtexteditor.parent/cucumberxtexteditor/src/org/farhan/validation/CucumberValidator.java
cucumberxtexteditor.parent/cucumberxtexteditor/src-gen/org/farhan/AbstractCucumberRuntimeModule.java
cucumberxtexteditor.parent/cucumberxtexteditor/xtend-gen/org/farhan/generator/CucumberGenerator.java
cucumberxtexteditor.parent/cucumberxtexteditor.feature/pom.xml
cucumberxtexteditor.parent/cucumberxtexteditor.ide/pom.xml
cucumberxtexteditor.parent/cucumberxtexteditor.repository/pom.xml
cucumberxtexteditor.parent/cucumberxtexteditor.target/pom.xml
cucumberxtexteditor.parent/cucumberxtexteditor.tests/pom.xml
cucumberxtexteditor.parent/cucumberxtexteditor.tests/src/org/farhan/tests/CucumberParsingTest.xtend
cucumberxtexteditor.parent/cucumberxtexteditor.tests/src/org/farhan/tests/FormatterTest.xtend
cucumberxtexteditor.parent/cucumberxtexteditor.tests/xtend-gen/org/farhan/tests/CucumberParsingTest.java
cucumberxtexteditor.parent/cucumberxtexteditor.tests/xtend-gen/org/farhan/tests/FormatterTest.java
cucumberxtexteditor.parent/cucumberxtexteditor.ui/pom.xml
cucumberxtexteditor.parent/cucumberxtexteditor.ui/src/org/farhan/ui/CucumberUiModule.java
cucumberxtexteditor.parent/cucumberxtexteditor.ui/src/org/farhan/ui/quickfix/CucumberQuickfixProvider.java
cucumberxtexteditor.parent/cucumberxtexteditor.ui/src/org/farhan/ui/syntaxcoloring/CucumberAntlrTokenToAttributeIdMapper.java
cucumberxtexteditor.parent/cucumberxtexteditor.ui/src/org/farhan/ui/syntaxcoloring/CucumberHighlightingConfiguration.java
cucumberxtexteditor.parent/cucumberxtexteditor.ui/src/org/farhan/ui/syntaxcoloring/CucumberSemanticHighlightingCalculator.java
cucumberxtexteditor.parent/cucumberxtexteditor.ui/src-gen/org/farhan/ui/AbstractCucumberUiModule.java
cucumberxtexteditor.parent/cucumberxtexteditor.ui.tests/pom.xml

## Test the setup

There's two ways to do this, one within Eclipse when you're coding/debugging/testing etc and one via Maven 

| Task | Eclipse | Maven |
| ---- | ------- | ----- |
| Generate code | right click on the .xtext file, Run As > Generate Xtext Artifacts | mvn generate-sources |
| Run tests | right click the .tests project > Run As > JUnit Plug-in Test | mvn test |
| Test plug-in in Eclipse | right click the dsl (not postfix) project > Run As > Eclipse Application. It should start another Eclipse Instance | mvn install. The plug-in is in the repository directory, it's the zip file. Help > Install New Software > Add > Archive > Open  > Add > Select All > Finish |
