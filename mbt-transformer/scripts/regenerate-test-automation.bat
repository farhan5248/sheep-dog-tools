cd ..
call mvn clean
call mvn org.farhan:mbt-maven-plugin:1.7-SNAPSHOT:cucumber-to-uml -Dtag="%1"
call mvn org.farhan:mbt-maven-plugin:1.7-SNAPSHOT:uml-to-cucumber -Dtag="%1"
cd scripts 