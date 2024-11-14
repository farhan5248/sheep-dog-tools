cd ..
call mvn clean
call mvn release:clean
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=false -DallowDowngrade=true
call mvn -B -Darguments=-DskipTests release:prepare -DcheckModificationExcludeList=pom.xml
call mvn -B -Darguments=-DskipTests release:perform -DlocalCheckout=true -Dgoals=install
call mvn org.codehaus.mojo:versions-maven-plugin:update-properties -DallowSnapshots=true
call git add pom.xml
call git commit -m "Upgrading dependency versions"
call mvn install -DskipTests
call mvn clean
cd scripts 