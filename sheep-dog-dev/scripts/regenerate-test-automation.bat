cd ..
call mvn clean
call mvn org.farhan:sheep-dog-maven-plugin:1.12:cucumber-to-uml -Dtag="%1"
call mvn org.farhan:sheep-dog-maven-plugin:1.12:uml-to-cucumber -Dtag="%1"
cd scripts 