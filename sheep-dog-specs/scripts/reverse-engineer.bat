cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.23-SNAPSHOT:uml-to-asciidoctor -Dtag="%1" -DrepoDir=""
cd scripts 