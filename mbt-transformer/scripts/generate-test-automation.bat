cd ..
call mvn clean
call mvn org.farhan:mbt-maven-plugin:cucumber-to-uml -Dtag=""
call mvn org.farhan:mbt-maven-plugin:uml-to-cucumber -Dtag=""
cd scripts 