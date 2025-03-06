cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.17:cucumber-to-uml -Dtag="%1"
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.17:uml-to-asciidoctor -Dtag="%1"
cd scripts 