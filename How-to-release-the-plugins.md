# Xtext plugin

In general, even though Xtext supports Maven integration, it's basically ignoring everything you do with Maven. It's almost like Maven is just used as the program to call some Eclipse specific code (Tycho I believe) through the command line. For example `mvn test` doesn't work like you'd expect them to. To do a release, I had to make a program to do what the release plugin does. Perhaps this has changed at the time I write this.

The Maven release process doesn't touch the `feature.xml` or `MANIFEST.MF` files so I make two commits for now to simulate that process. 
I made a simple program in `mgmt-tasks` for now to do this. I'll probably make a custom Xtext release plug-in to make this less tedious.
These are the files to change if you're doing it manually.

## Create Release version

Do search and replace for the following
1. `<version>1.X.0-SNAPSHOT</version>` with `<version>1.X.0</version>` in `pom.xml`
2. `Bundle-Version: 1.X.0.qualifier` with `Bundle-Version: 1.X.0` in `MANIFEST.MF`
3. `version="1.X.0.qualifier"` with `version="1.X.0.qualifier"` in `feature.xml`

Do this for any dependent jars
1. `<sheep-dog-test.version>1.X.0-SNAPSHOT</sheep-dog-test.version>` with `<sheep-dog-test.version>1.X.0</sheep-dog-test.version>` in `pom.xml`

There should be 15 file changes in git. 
Commit everything with this message `[maven-release-plugin] prepare release cucumberxtexteditor-1.X.0`
Create a tag for `cucumberxtexteditor-1.X.0`.

## Create SNAPSHOT version

Do search and replace for the following
1. `<version>1.X.0</version>` with `<version>1.X+1.0-SNAPSHOT</version>` in `pom.xml`
2. `Bundle-Version: 1.X.0` with `Bundle-Version: 1.X+1.0.qualifier` in `MANIFEST.MF`
3. `version="1.X.0"` with `version="1.X+1.0.qualifier"` in `feature.xml`

Do this for any dependent jars
1. `<sheep-dog-test.version>1.X.0</sheep-dog-test.version>` with `<sheep-dog-test.version>1.X+1.0-SNAPSHOT</sheep-dog-test.version>` in `pom.xml`

There should be 15 file changes in git. 
Commit everything with this message `[maven-release-plugin] prepare for next development iteration`.
