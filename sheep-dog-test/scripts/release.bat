cd ..
call mvn clean
call mvn release:clean
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=false
call mvn -B -Darguments=-DskipTests release:prepare -DcheckModificationExcludeList=pom.xml
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=true
call git add pom.xml
call git commit -m "Upgrading dependency versions"
call mvn install -DskipTests
cd scripts 