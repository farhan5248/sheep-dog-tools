cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.22-SNAPSHOT:uml-to-asciidoctor -Dtag="%1" -DrepoDir=""
cd scripts 