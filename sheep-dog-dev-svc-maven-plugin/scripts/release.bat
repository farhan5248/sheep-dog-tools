cd ..
call mvn clean
call mvn release:clean
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=false
call mvn -B release:prepare -Dmaven.test.skip=true -DcheckModificationExcludeList=pom.xml
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=true
call git add pom.xml
call git commit -m "Upgrading dependency versions"
call mvn install -DskipTests
cd scripts 