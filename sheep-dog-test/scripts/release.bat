cd ..
call mvn clean release:clean
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=false -DallowDowngrade=true
call mvn -B release:prepare -DcheckModificationExcludeList=pom.xml -DpreparationGoals=deploy
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=true
call git add pom.xml
call git commit -m "Upgrading dependency versions"
call mvn deploy
cd scripts 