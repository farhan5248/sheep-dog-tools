cd ..
call mvn clean
call mvn dependency:copy-dependencies -DoutputDirectory=target/dependency
call mvn deploy:deploy-file -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github -DgroupId=org.eclipse.core -DartifactId=runtime -Dpackaging=jar -Dversion=3.29.0.v20230726-0617                 
call mvn deploy:deploy-file -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github -DgroupId=org.eclipse.emf -DartifactId=ecore -Dpackaging=jar -Dversion=2.35.0.v20230829-0934                    
call mvn deploy:deploy-file -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github -DgroupId=org.eclipse.emf -DartifactId=ecore.xmi -Dpackaging=jar -Dversion=2.35.0.v20230801-1141                
call mvn deploy:deploy-file -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github -DgroupId=org.eclipse.emf -DartifactId=mapping.ecore2xml -Dpackaging=jar -Dversion=2.12.0.v20230211-1150        
call mvn deploy:deploy-file -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github -DgroupId=org.eclipse.emf -DartifactId=common -Dpackaging=jar -Dversion=2.29.0.v20230916-0637                   
call mvn deploy:deploy-file -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github -DgroupId=org.eclipse.equinox -DartifactId=common -Dpackaging=jar -Dversion=3.18.100.v20230730-1117             
call mvn deploy:deploy-file -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github -DgroupId=org.antlr -DartifactId=runtime -Dpackaging=jar -Dversion=3.2.0.v20220404-1927                         
call mvn deploy:deploy-file -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github -DgroupId=org.eclipse.xtext -DartifactId=xtext -Dpackaging=jar -Dversion=2.32.0.v20230827-1315                  
call mvn deploy:deploy-file -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github -DgroupId=org.eclipse.xtext -DartifactId=util -Dpackaging=jar -Dversion=2.32.0.v20230827-1315                   
call mvn deploy:deploy-file -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github -DgroupId=org.eclipse.xtext -DartifactId=xbase.lib -Dpackaging=jar -Dversion=2.33.0.v20231121-0955              
call mvn deploy:deploy-file -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github -DgroupId=org.eclipse.uml2 -DartifactId=uml.profile.standard -Dpackaging=jar -Dversion=1.5.0.v20221116-1811     
call mvn deploy:deploy-file -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github -DgroupId=org.eclipse.uml2 -DartifactId=common -Dpackaging=jar -Dversion=2.5.0.v20221116-1811                   
call mvn deploy:deploy-file -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github -DgroupId=org.eclipse.uml2 -DartifactId=types -Dpackaging=jar -Dversion=2.5.0.v20221116-1811                    
call mvn deploy:deploy-file -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github -DgroupId=org.eclipse.uml2 -DartifactId=uml.resources -Dpackaging=jar -Dversion=5.5.0.v20221116-1811            
call mvn deploy:deploy-file -Dfile=target/dependency -Durl=https://maven.pkg.github.com/farhan5248/claims-adjudication-ai -DrepositoryId=github -DgroupId=org.eclipse.uml2 -DartifactId=uml -Dpackaging=jar -Dversion=5.5.0.v20210228-1829                      
cd scripts 

