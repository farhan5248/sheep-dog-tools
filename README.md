# Purpose of these projects

First, it's to share my knowledge around MDD and MBT etc using Eclipse, EMF, Cucumber, Java, UML, Graph Models, Camunda, Maven.
I'm basically putting all my knowledge that I've accumulated so far using models for coding/testing in this repo as an example.
When I went looking for information 15 years ago and sometimes even today it's a little hard to find it.
It's also hard to find a complete example of how to use frameworks within the [Eclipse Modelling Project](https://projects.eclipse.org/projects/modeling). 
Hopefully this makes it easier for someone else who's interested in doing such things.

Secondly it's to do research on trying to train an AI to do what a rule based engine does using data created through MBT.
As my QA team developed more feature files, I realised that maintaining that was taking more time. 
MBT helps here if you think of each scenario as describing a path through a graph model.
If you're not sure what that looks like you can read this document [here](https://blog.cleancoder.com/uncle-bob/2018/06/06/PickledState.html) by Robert C. Martin (Uncle Bob).
So once one has all the rules in this model and are able to generate thousands or even millions of scenarios with data, I'm curious to know if I can feed that data to an AI.
I've tried this with ChatGPT and so far it has worked out well except for the fact that it couldn't do math to determine which is the lesser between two numbers.
At the minimum I want it to select configuration but I'm optimistic that it can do enough math with [Code Interpreter](https://platform.openai.com/docs/assistants/tools).

# Scope of the model transformations

[This](https://www.researchgate.net/publication/237697446_Model_Transformers_for_Test_Generation_from_System_Models) document from ResearchGate might has a [diagram](https://www.researchgate.net/figure/Derivation-of-test-models_fig9_237697446) that I often refer to.
I'm not sure if I can put a copy here so I'm just linking to it for now; I'll sketch a simpler version out and upload it here in the future.
The diagram shows transformation between 6 sets of files. I put a simple description of what they are.

| Set | Description |
| --- | ------------|
| PIM | Requirements, I'll capture these in some [BPM with Camunda](https://camunda.com/platform/modeler/) |
| PSM | System code design, I'll use the [EMF UML API](https://download.eclipse.org/modeling/mdt/uml2/javadoc/5.5.0/)  |
| System Code | The actual code, the stuff developers work on. I'll use [JHipster](https://www.jhipster.tech/) to generate the code from the UML model. I'll also transform the UML model into Python because I want more experience with it |
| PIT | Test data selection criteria. These aren't the test cases. They're data selection rules used to create test data. I'm using [GraphWalker](https://graphwalker.github.io/) for this. I've previously used [Test Modeller](https://www.curiositysoftware.ie/test-modeller) before but Graphwalker is free. |
| PST | Test code design. Same as the PSM, I'll use EMF and UML |
| Test Code | The test cases and test automation code. I'll use Cucumber and Java for that since it's what I'm most familiar with. |

# The Agile testing pyramid and test automation

In my experience, QA testers who manually test don't put anything in Git.
When I managed a QA team, I coached everyone on my team, about 30 folks to use Cucumber, Eclipse, Git etc. 
There were seperate dev repos for all the individual systems but just one QA repo.
The question then was where should the feature files or test code go? 
Does it go into the dev repos or a new QA one?
What I suggested is that E2E tests go in the QA repo whereas the integration, component, unit in dev repos. 
I'll demo it later but basically
1. You'd clone two Git repos into the one workspace
2. Checkout both branches
3. Generate the model from the Test Code
4. Then transform that into whatever test framework and language you want in the dev repo
