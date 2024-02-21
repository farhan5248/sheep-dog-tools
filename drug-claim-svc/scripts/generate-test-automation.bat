cd ..
call mvn clean
call mvn org.farhan:mbt-maven-plugin:cucumber-to-uml -Dtag="unit"
call mvn org.farhan:mbt-maven-plugin:uml-to-cucumber
cd scripts 