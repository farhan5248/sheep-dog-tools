[The project purpose is in the wiki](https://github.com/farhan5248/lean-sheep-dog-tools/wiki)
If you share some of my experiences then you might find the code here useful. 

# Project structure

These are the 4 projects. 
1. **sheep-dog-test** - Demonstrates how to add a jar to an Xtext project. This has the code that is reused in the Xtext editors in this repo.
2. **sheepdogxtextcukeplugin.parent** - This is the Eclipse plugin that the testers use to write their test cases. 
3. **sheep-dog-dev** - This converts the test cases into UML models and converts those into Cucumber and Java or anything else. I'll try wrapping this in other build tools in the future.
4. **sheep-dog-maven-plugin** - This is a Maven plug-in that's just a wrapper around sheep-dog-dev. The developer can make a batch script to do a git pull and run this to refresh the test data/automation that they need to continue their red-green-refactor cycles. 

# How to

I've tried to document and develop these projects for folks who are new to Xtext and Maven plugin development. 
I'd read the pages in this order.
1. [How to create the plugins](How-to-create-the-plugins)
2. [How to build the plugins](How-to-build-the-plugins)
2. [How to run the plugins](How-to-run-the-plugins)
4. [How to modify the plugins](How-to-modify-the-plugins)
5. [How to test the plugins](How-to-test-the-plugins)
6. [How to release the plugins](How-to-release-the-plugins)