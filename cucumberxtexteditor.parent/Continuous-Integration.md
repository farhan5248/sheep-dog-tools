# Continuous Integration

## Initial Generated Files
In the `cucumberxtexteditor.parent` directory, update the `groupID`.

```
pom.xml
cucumberxtexteditor/pom.xml
cucumberxtexteditor.feature/pom.xml
cucumberxtexteditor.ide/pom.xml
cucumberxtexteditor.repository/pom.xml
cucumberxtexteditor.target/pom.xml
cucumberxtexteditor.tests/pom.xml
cucumberxtexteditor.ui/pom.xml
cucumberxtexteditor.ui.tests/pom.xml
```

## Publish New Version

The Maven release process doesn't touch the `feature.xml` or `MANIFEST.MF` files so I make two commits for now to simulate that process. 
These are the files to change

### Create Release Version Commit

Do search and replace for the following
1. `<version>1.0.X-SNAPSHOT</version>` with `<version>1.0.X</version>` in `pom.xml`
2. `Bundle-Version: 1.0.X.qualifier` with `Bundle-Version: 1.0.X` in `MANIFEST.MF`
3. `version="1.0.X.qualifier"` with `version="1.0.X.qualifier"` in `feature.xml`

There should be 15 file changes in git. 
Commit everything with this message `[maven-release-plugin] prepare release cucumberxtexteditor-1.0.0`
Create a tag for `cucumberxtexteditor-1.0.X`.

### Create SNAPSHOT Version Commit

Do search and replace for the following
1. `<version>1.0.X</version>` with `<version>1.0.X+1-SNAPSHOT</version>` in `pom.xml`
2. `Bundle-Version: 1.0.X` with `Bundle-Version: 1.0.X+1.qualifier` in `MANIFEST.MF`
3. `version="1.0.X"` with `version="1.0.X+1.qualifier"` in `feature.xml`

There should be 15 file changes in git. 
Commit everything with this message `[maven-release-plugin] prepare for next development iteration`.
