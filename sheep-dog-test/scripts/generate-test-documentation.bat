cd ..
call mvn clean
call mvn org.farhan:sheep-dog-maven-plugin:LATEST:cucumber-to-uml -Dtag="%1"
call mvn org.farhan:sheep-dog-maven-plugin:LATEST:uml-to-asciidoctor -Dtag="%1"
cd scripts 