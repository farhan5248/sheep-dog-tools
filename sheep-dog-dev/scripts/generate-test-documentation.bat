cd ..
call mvn clean
call mvn org.farhan:sheep-dog-maven-plugin:1.15-SNAPSHOT:cucumber-to-uml -Dtag="%1"
call mvn org.farhan:sheep-dog-maven-plugin:1.15-SNAPSHOT:uml-to-asciidoctor -Dtag="%1"
cd scripts 