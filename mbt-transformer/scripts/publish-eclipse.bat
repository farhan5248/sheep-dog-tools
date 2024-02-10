cd ..
call mvn clean
call mvn dependency:copy-dependencies -DoutputDirectory=target/dependency
call mvn deploy:deploy-file -DgroupId=org.eclipse.core -DartifactId=runtime -Dversion=3.29.0.v20230726-0617 -Dpackaging=jar -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github
cd scripts 

