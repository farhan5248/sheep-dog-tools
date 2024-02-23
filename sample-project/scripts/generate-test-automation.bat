cd ..
call mvn clean
call mvn org.farhan:mbt-maven-plugin:cucumber-to-uml -Dtag="%1"
call mvn org.farhan:mbt-maven-plugin:uml-to-cucumber -Dtag="%1"
cd scripts 