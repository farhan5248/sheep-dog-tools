cd ..
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=false -DallowDowngrade=true
call mvn release:clean
call mvn -B release:prepare -DcheckModificationExcludeList=pom.xml -DpreparationGoals=deploy
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=true
call mvn deploy
call git add pom.xml
call git commit -m "Upgrading dependency versions"
call git push
cd scripts 