cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.18:cucumber-to-uml -Dtag="%1"
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.18:uml-to-asciidoctor -Dtag="%1"
cd scripts 