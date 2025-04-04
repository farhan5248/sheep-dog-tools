cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.22-SNAPSHOT:asciidoctor-to-uml -Dtag="%1" -DrepoDir=""
cd scripts 