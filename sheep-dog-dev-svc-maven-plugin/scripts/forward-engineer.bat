cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.17-SNAPSHOT:asciidoctor-to-uml -Dtag="%1"
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.17-SNAPSHOT:uml-to-cucumber-spring -Dtag="%1"
cd scripts 