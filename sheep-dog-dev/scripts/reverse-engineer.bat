cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.23-SNAPSHOT:cucumber-to-uml -Dtag="%1" -DrepoDir=../sheep-dog-specs/
cd scripts 