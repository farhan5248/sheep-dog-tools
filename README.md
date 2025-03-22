# Introduction

I'm a developer and former dev team lead and manager. I spent most of my time on architecture, design and automated deployments but always found QA took weeks to months to complete their test execution phase.
Eventually I decided to lead a large QA team to figure out why and help them evolve. 
That one QA team had multiple QA teams of almost 50+ individuals. I'm putting as much of my knowledge that I've accumulated so far using models for coding/testing in this repo as an example.
Hopefully this makes it easier for someone else who's interested in doing such things.

I upskilled the manual testers in my QA team by applying Toyota Production System concepts, most importantly Kaizen.
Keeping the improvement kata in mind, the direction of challenge is to gradually adopt more BDD and MBT.
The adoption happens with the support of tools like Eclipse Xtext, UML and EMF frameworks, Cucumber, Java, Graph Models, Maven, PlantUML, D3.js and GraphWalker.
I recently came across the term Deming Driven Testing which I like very much because it describes the approach I took accurately.

To understand the context within which I've used these tools and frameworks, I created this [Prezi presentation](https://prezi.com/view/yNpSiGMbioX8lNp5tS2q/). 
[More information is in the wiki](https://github.com/farhan5248/lean-sheep-dog-tools/wiki), including what the plug-ins do, how to create/modify them and how to organically adopt them. 

# Projects

Description of the projects.
1. **sheep-dog-test** - Contains semantic validation rules. Used in the **sheepdogxtextplugin.parent** to demonstrate added a dependency.
2. **sheepdogxtextplugin.parent** - Eclipse DSL plug-in that the testers use to write their test cases in the ubiquitous language.
3. **sheepdogxtextcukeplugin.parent** - Example of using Xtext to generate an API for a language like Cucumber feature files.
4. **sheep-dog-dev** - Converts the test cases into UML models and converts those into Cucumber and Java.
5. **sheep-dog-maven-plugin** - Maven plug-in that's just a wrapper around **sheep-dog-dev**. 
6. **sheep-dog-dev-svc** - Wraps **sheep-dog-dev** as a Spring Boot service
7. **sheep-dog-dev-svc-maven-plugin** - Maven plug-in for **sheep-dog-dev-svc**.
8. **sheep-dog-mgmt-maven-plugin** - The Maven release plug-in doesn't work for the xtext projects so I made this to mimic the behavior.

# Workflows

These workflows run the Maven release plug-in on the `main` branch.
1. sheep-dog-dev.yml
2. sheep-dog-dev-maven-plugin.yml
3. sheep-dog-dev-svc.yml
4. sheep-dog-dev-svc-maven-plugin.yml
5. sheep-dog-mgmt-maven-plugin.yml
6. sheep-dog-test.yml
7. sheep-dog-xtext-cuke-plugin.yml
8. sheep-dog-xtext-plugin.yml

This workflow runs `mvn clean deploy` on the `develop` branch
1. sheep-dog-snapshot.yml

These are re-usable workflows 
1. deploy.yml
2. merge.yml
3. release.yml
4. snapshot.yml
5. snapshot-docker.yml

# Xtext Notes for Maven Users

I've only used Maven my entire career. I've used it with Java and other languages like packaging tar files, SQL/PLSQL with Liquibase etc. 
I'm a newbie when it comes to working in the Eclipse project world. 
I've put some notes here that might be useful if you're in the boat.

# Test

Originally I thought that as I work on the validation regular expressions, I'd start to use the `sheepdogxtextcukeplugin` to write feature files to test itself. 
However this is not easily done; it was really tricky to integrate Cucumber into the project so I gave up. 
Instead I'll have to generate plain jUnit tests derived from the Asciidoctor specifications in `sheep-dog-specs`. 
I think I'd need to understand all the annotations involved and what's being injected when. Another problem is that the usual `mvn test` command won't even run the Cucumber tests because of the packaging type plug-in which runs its own test runner etc.

# Run

There's two ways to do this, one within Eclipse when you're coding/debugging/testing etc and one when you want to install it like a typical plug-in.

Right click the `sheepdogxtextcukeplugin` project then select `Run As > Eclipse Application`.  It should start another Eclipse Instance.

The plug-in is the zip file in the `.repository` directory. Install it by selecting `Help > Install New Software > Add > Archive > Open  > Add > Select All > Finish`. 

# Release

In general, even though Xtext supports Maven integration, it's basically ignoring almost everything you do with Maven. It's almost like Maven is just used as the program to call some Eclipse specific code (Tycho I believe) through the command line perhaps. For example `mvn test` doesn't work like you'd expect. 
The Maven release process doesn't touch the `feature.xml` or `MANIFEST.MF` files. 
Eventually I had to make the `sheep-dog-mgmt-maven-plugin` to mimic what the release plugin does. 
