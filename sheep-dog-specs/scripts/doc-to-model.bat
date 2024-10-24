echo %TIME%
cd ..
call mvn clean
call mvn org.farhan:sheep-dog-dev-svc-maven-plugin:1.1-SNAPSHOT:asciidoctor-to-uml -Dtag="%1"
cd scripts
echo %TIME%