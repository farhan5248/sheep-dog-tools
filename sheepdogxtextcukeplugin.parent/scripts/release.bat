cd ..
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=false -DallowDowngrade=true
call mvn org.farhan:sheep-dog-mgmt-maven-plugin:1.5:prepare -DpreparationGoals=clean,install
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=true
call git add pom.xml
call git commit -m "Upgrading dependency versions"
call mvn deploy
cd scripts 