cd ..
call mvn clean
call mvn org.farhan:mbt-maven-plugin:1.7-SNAPSHOT:asciidoctor-to-graph -Dtag="%1"
call mvn org.farhan:mbt-maven-plugin:1.7-SNAPSHOT:graph-to-uml -Dtag="%1"
call mvn org.farhan:mbt-maven-plugin:1.7-SNAPSHOT:uml-to-cucumber -Dtag="%1"
cd scripts 