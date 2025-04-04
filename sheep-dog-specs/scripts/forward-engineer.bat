cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-maven-plugin:1.21:asciidoctor-to-uml -Dtag="%1" -DrepoDir=""
cd scripts 