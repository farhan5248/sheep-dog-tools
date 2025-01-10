sudo su - actions-runner
cd actions-runner
./config.sh --url https://github.com/farhan5248/sheep-dog-tools --token $GITHUB_TOKEN --labels "farhan5248-ubuntu"
./run.sh