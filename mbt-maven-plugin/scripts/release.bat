cd ..
call mvn clean
call mvn release:clean
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=false
REM call mvn -B release:prepare -Dmaven.test.skip=true -DcheckModificationExcludeList=pom.xml,scripts/release.bat
REM call mvn install -Dmaven.test.skip=true
REM call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=true
REM call git add pom.xml
REM call git commit -m "Upgrading dependency versions"
cd scripts 