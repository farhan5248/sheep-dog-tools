cd ..
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=false -DallowDowngrade=true
call mvn org.farhan:sheep-dog-mgmt-maven-plugin:1.13:prepare -DpreparationGoals=deploy
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=true
call mvn deploy
call git add *.xml
call git commit -m "Upgrading dependency versions"
cd scripts 