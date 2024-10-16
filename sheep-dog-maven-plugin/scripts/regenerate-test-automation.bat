cd ..
call mvn clean
call mvn org.farhan:sheep-dog-maven-plugin:1.16:cucumber-to-uml -Dtag="%1"
call mvn org.farhan:sheep-dog-maven-plugin:1.16:uml-to-cucumber -Dtag="%1"
cd scripts 