cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.22-SNAPSHOT:uml-to-cucumber-spring -Dtag="%1" -DrepoDir=../sheep-dog-specs/
cd scripts 