cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.19-SNAPSHOT:uml-to-cucumber-guice -Dtag="%1" -DrepoDir=../sheep-dog-specs/
cd scripts 