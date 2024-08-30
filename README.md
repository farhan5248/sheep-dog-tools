# Introduction

This repo has example projects on how to upskill manual testers by applying Toyota Production System concepts, most importantly Kaizen.
Keeping the improvement kata in mind, the direction of challenge is to gradually adopt more BDD and MBT.
The adoption happens with the support of tools like Eclipse Xtext, UML and EMF frameworks, Cucumber, Java, Graph Models, Maven and GraphWalker.

I've done this with a QA team of almost 50+ individuals. I'm putting as much of my knowledge that I've accumulated so far using models for coding/testing in this repo as an example.
Hopefully this makes it easier for someone else who's interested in doing such things.
I made a [presentation](https://prezi.com/view/yNpSiGMbioX8lNp5tS2q/) to give some more background and share my experience if it helps.

When I went looking for information back in 2017 and sometimes even today it's a little hard to find any on how to upskill a team of testers through on the job learning.
There is tonnes of information on why manual testers should become programmers and automate test but my focus is not that. 
It's how to get the testers to use a Domain Specific Language (DSL) that let's them write test cases that are automatically transformed into test automation that supports developers doing Red-Green-Refactor.

The difference here is on making it easier for developers to run the automated tests that drive their development. 
Being a TDD practioner, I feel like paying someone else to automate a test and run it for me is like paying someone else to go to the gym for me. 
They'll use all the tools and get the workout but it needs to be me doing that.

Why Sheep Dog? I'm a dog person and when I heard Ryan Tierney (Lean Made Simple podcast) use the sheep dog analogy, it resonated with me. 
Basically if you send in a bulldog to do the job, it runs into the middle of the flock barking and disrupting everything.
With a sheep dog, you never see it. You see the grass around the sheep move, you see the sheep move and everything happens quietly and peacefully.
When I thought about how to transform my team, I realised heroic effort was unsustainable and big bang changes were bound to be too much effort.
Instead it had to be this gradual organic evolution of our ways of working similar to a sheep dog moving a flock.

# Structure

These are the 4 projects and the order in which they should be built.
1. sheep-dog-test - Demonstrates how to add a jar to an Xtext project. This has the code that is reused in the Xtext editors in this repo.
2. sheep-dog-xtext-plugin - This is currently cucumberxtexteditor.parent. This is the Eclipse plugin that the testers use to write their test cases. They'd then push their changes to a git repo at least daily.
3. sheep-dog-dev - This converts the test cases into UML models and converts them into Cucumber and Java or anything else. In the future I'll generate JavaScript and Python as well.
4. sheep-dog-maven-plugin - This is a Maven plug-in that's just a wrapper around sheep-dog-dev. The developer can make a batch script to do a git pull and run this to refresh the test data/automation that they need to continue their red-green-refactor cycles. 