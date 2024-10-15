cd ..
call docker image build --build-arg email=farhan.sheikh.5248@gmail.com -t farhan5248/sheep-dog-svc:latest .
call docker container run --name="sheep-dog-svc-lcl" --hostname="mbt.sheepdog.org" -v "C:\Users\Farhan\git\lean-sheep-dog-tools\sheep-dog-svc\target\mbt:/target/mbt" --rm -d -p 8080:8080 farhan5248/sheep-dog-svc:latest
call docker container ls -a
cd scripts 


