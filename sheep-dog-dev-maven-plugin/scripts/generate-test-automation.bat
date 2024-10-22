cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-svc-maven-plugin:1.0-SNAPSHOT:asciidoctor-to-uml -Dtag="%1"
call mvn org.farhan:sheep-dog-dev-svc-maven-plugin:1.0-SNAPSHOT:uml-to-cucumber -Dtag="%1"
cd scripts 