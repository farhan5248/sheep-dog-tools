cd ..
call mvn clean generate-sources
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=false -DallowDowngrade=true
call mvn org.farhan:sheep-dog-mgmt-maven-plugin:1.0-SNAPSHOT:prepare
call mvn install -DskipTests
call mvn org.farhan:sheep-dog-mgmt-maven-plugin:1.0-SNAPSHOT:perform
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=true
call git add pom.xml
call git commit -m "Upgrading dependency versions"
call mvn install -DskipTests
call mvn clean
cd scripts 