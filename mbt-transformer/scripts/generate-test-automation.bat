cd ..
call mvn clean
call mvn org.farhan:mbt-maven-plugin:1.6-SNAPSHOT:cucumber-to-uml -Dtag="%1"
call mvn org.farhan:mbt-maven-plugin:1.6-SNAPSHOT:uml-to-cucumber -Dtag="%1"
cd scripts 