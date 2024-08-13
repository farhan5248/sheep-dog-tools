cd ..
call mvn clean
call mvn org.farhan:mbt-maven-plugin:1.8-SNAPSHOT:cucumber-to-uml -Dtag="%1"
call mvn org.farhan:mbt-maven-plugin:1.8-SNAPSHOT:uml-to-asciidoctor -Dtag="%1"
cd scripts 