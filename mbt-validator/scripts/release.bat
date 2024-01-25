cd ..
call mvn release:clean
call mvn -B release:prepare -Dmaven.test.skip=false
cd scripts