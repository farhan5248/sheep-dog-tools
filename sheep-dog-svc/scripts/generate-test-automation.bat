cd ..
call mvn clean
call mvn org.farhan:sheep-dog-maven-plugin:1.17:asciidoctor-to-uml -Dtag="%1"
call mvn org.farhan:sheep-dog-maven-plugin:1.17:uml-to-cucumber -Dtag="%1"
cd scripts 