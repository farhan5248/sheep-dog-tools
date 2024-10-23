cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-svc-maven-plugin:1.1-SNAPSHOT:cucumber-to-uml -Dtag="%1"
call mvn org.farhan:sheep-dog-dev-svc-maven-plugin:1.1-SNAPSHOT:uml-to-cucumber -Dtag="%1"
cd scripts 