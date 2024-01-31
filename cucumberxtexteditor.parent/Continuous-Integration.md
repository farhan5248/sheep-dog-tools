# Continuous Integration

In general, even though Xtext supports Maven integration, it's basically ignoring everything you do with Maven.
It's almost like Maven is just used as the program to call some Eclipse stuff through the command line.
For example `mvn test` or `dependencies` don't work like you'd expect them to.

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

## Add Depdendent Jars

If you want to add dependencies, you don't add them like you would normally. 
Here's what I did.

Create a `lib` directory under the `cucumberxtexteditor` directory

Add the `maven-dependency-plugin` to copy the jars you want into the `lib` directory.

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
                <goal>copy</goal>
            </goals>
            <configuration>
                <artifactItems>
                    <artifactItem>
                        <groupId>org.farhan</groupId>
                        <artifactId>graph-validator</artifactId>
                        <version>0.0.1-SNAPSHOT</version>
                        <overWrite>true</overWrite>
                    </artifactItem>
                </artifactItems>
                <!-- other configurations here -->
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

Then open the `MANIFEST.MF` file in the `cucumberxtexteditor` directory. 
In the `Runtime` tab, `Classpath` section, click on `Add` to add the jar to the list. 
In the `Build` tab, `Binary Build` section, put a check next to the jar in the list. 
The `MANIFEST.MF`, `build.properties` and `classpath` files should all have a reference to the jar now.
Rebuild the project and then you can use the jar in your code.

## Publish New Version

The Maven release process doesn't touch the `feature.xml` or `MANIFEST.MF` files so I make two commits for now to simulate that process. 
These are the files to change

### Create Release Version Commit

Do search and replace for the following
1. `<version>1.X.0-SNAPSHOT</version>` with `<version>1.X.0</version>` in `pom.xml`
2. `Bundle-Version: 1.X.0.qualifier` with `Bundle-Version: 1.X.0` in `MANIFEST.MF`
3. `version="1.X.0.qualifier"` with `version="1.X.0.qualifier"` in `feature.xml`

There should be 15 file changes in git. 
Commit everything with this message `[maven-release-plugin] prepare release cucumberxtexteditor-1.X.0`
Create a tag for `cucumberxtexteditor-1.X.0`.

### Create SNAPSHOT Version Commit

Do search and replace for the following
1. `<version>1.X.0</version>` with `<version>1.X+1.0-SNAPSHOT</version>` in `pom.xml`
2. `Bundle-Version: 1.X.0` with `Bundle-Version: 1.X+1.0.qualifier` in `MANIFEST.MF`
3. `version="1.X.0"` with `version="1.X+1.0.qualifier"` in `feature.xml`

There should be 15 file changes in git. 
Commit everything with this message `[maven-release-plugin] prepare for next development iteration`.
