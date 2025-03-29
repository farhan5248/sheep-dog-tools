cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.19-SNAPSHOT:cucumber-to-uml -Dtag="%1"
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.19-SNAPSHOT:uml-to-asciidoctor -Dtag="%1"
cd scripts 