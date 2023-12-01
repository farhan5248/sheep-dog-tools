# Cucumber Text Editor

These are the steps to create the project.
They're just notes for now, I'll get back to them with more details later.

## Create Xtext Project

You can follow the tutorial steps but if you want to just start coding to play around with this, I'd just do these steps first.

1. In Eclipse, select `File > New > Project`.
2. In the `New Project Wizard` select `Xtext > Xtext Project > Next`
3. Fill out the form as follows and then click `Next`:
a. `Project name` is whatever you want to call your Eclipse project. In the beginning this is also used as the Maven `artifactID` and `groupID`. Whatever you choose will have parent appended to it automatically.
b. `Name` is some package name like thing. I put my `groupID` followed by Cucumber so `org.farhan.Cucumber`
c. `Extensions` is feature since I want to associate those files with this editor
5. Select `Eclipse plug-in`, `Create Feature`, `Create Update Site`, `Maven` for `Preferred Build System`

## Test the initial project

There's two ways to do this, one within Eclipse when you're coding/debugging/testing etc and one via Maven 

| Task | Eclipse | Maven | Notes |
| ---- | ------- | ----- | ----- |
| Generate code | Right click on the `.xtext` file, then select Run As > Generate Xtext Artifacts | `mvn generate-sources` | |
| Run tests | Right click the `.tests` project, then select Run As > JUnit Plug-in Test | `mvn install` | `mvn test` doesn't work, it'll state that there are no files in `src/test/java`
| Test plug-in in Eclipse | Right click the dsl (no postfix) project > Run As > Eclipse Application. It should start another Eclipse Instance | `mvn install` | The plug-in is in the `.repository` directory, it's the zip file. Help > Install New Software > Add > Archive > Open  > Add > Select All > Finish | 

## Customise the plug-in

Once you have the initial project, you'll want to customise it.
You can go over the files changes by the type of work.

| Work |
| ---- |
| [Code Generation](Code-Generation.md) |
| [Continuous Integration](Continuous-Integration.md) |
| [Formatting](Formatting.md) |
| [Validation](Validation.md) |
| [Testing](Testing.md) |
| [Syntax Colouring](Syntax-Colouring.md) |
