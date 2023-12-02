# Project Structure

# MDD in Theory

I was taught Model Driven Development in the context of a Waterfall methodology.
[This](https://www.researchgate.net/publication/237697446_Model_Transformers_for_Test_Generation_from_System_Models) document from ResearchGate has a [diagram](https://www.researchgate.net/figure/Derivation-of-test-models_fig9_237697446) that I often refer to.
I'm not sure if I'm allowed to upload a copy here so I'm just linking to it for now; I'll sketch a simpler version of the diagram and upload it here in the future.
The diagram shows transformations between 6 sets of files. I put a simple description of what they are.

| Set | Description |
| --- | ------------|
| PIM | Requirements |
| PSM | System code design |
| System Code | The actual code deployed to production |
| PIT | Test data selection criteria |
| PST | Test code design. |
| Test Code | The test cases and test automation code. |


# The Agile testing pyramid and test automation
 
When I managed a QA team, I coached everyone on my team, about 30+ folks to use Cucumber, Eclipse, Git etc. 
There were separate dev repos for all the individual systems but just one QA repo.
The manual testers never automated anything before so they never put anything in Git.
The question then was where should the feature files or test code go? 
Does it go into the dev repos or a new QA one?
What I suggested is that the feature files and E2E test automation code goes in the QA repo.
The integration, component, unit test automation code would go in dev repos. 
I'll demo it later but basically
1. You'd clone two Git repos into the one workspace
2. Checkout both branches
3. Generate the model from the Test Code
4. Then transform that into whatever test framework and language at whichever layer in the pyramind you want in the dev repo. 

If you know what dependency injection is and have read the Cucumber for Java book then you'll understand what I mean by transforming the feature file data into a unit test or an integration test in 4 above. If not, I'll demo that here. 
Also the book uses Java for both layers but what if you had multiple programming languages, that's why the model is used as an intermediary.

# MDD in Practice

Some of my practices around MDD are influenced by Scott Ambler and the [Agile Modelling](https://agilemodeling.com/) site. 
I've been consulting that site since 2008. I'll probably have to revisit that site to review which of the practices I apply here.

I've modified the diagram to take into account the testing pyramid or testing throughout the process instead of just at the end. 

![What is this](https://github.com/farhan5248/claims-adjudication-ai/blob/main/OSS%20MDD1.png)

In this view the PST has the top half of the testing pyramid test automation code. The PSM would have the bottom half for each component.
Another difference is that the PIT model is saved as a graph model in `.json` but just as working with the `.uml` model directly is not practical, I'll be using AsciiDoctor.

| Model | File Types | Description |
| ----- | ---------- | ------------|
| PIM   | `.bpm` | I'll capture these in some [BPM with Camunda](https://camunda.com/platform/modeler/) |
| PSM   | `.java` `.js` `.cs` `.uml` | System main code and test automation code design, I'll use the [EMF UML API](https://download.eclipse.org/modeling/mdt/uml2/javadoc/5.5.0/) but ideally there should be a REST api so that one is not dependent on Java if you're coding your micro-service in Python or doing some backend stuff in PL/SQL. The actual code deployed to production. I'll use [JHipster](https://www.jhipster.tech/) to generate some of the code from the UML model. I'll also transform the UML model into Python because I want more experience with it |
| PIT   | `.adoc` `.json` | I'm using AsciiDoctor and [GraphWalker](https://graphwalker.github.io/) for this. I've previously used [Test Modeller](https://www.curiositysoftware.ie/test-modeller) before but Graphwalker is free. |
| PST   | `.feature` `.java` `.uml` | Test code design for the e2e tests. I'll use Cucumber and Java for that since it's what I'm most familiar with. |

## PST

The PST `.feature` files are edited using the `cucumberxtexteditor` plug-in project.

From it, the PST UML model is generated and the `.java` files from that. 
This automates most of the work a traditional test automator would do and allows manual testers to run test automation to speed up their testing.

The second model derived from the `.feature` files is the graph model for the PIT. 
The `cucumberxtexteditor` is basically a path editor for the graph model.
It ensures each statement describes a vertice and that every 3 or more describe 2 vertices and an edge.

The third model derived is the PSM, which has both the test automation and main code.
I'll start with Java since that's what I'm familiar with but I'll try it with other programming languages as well.
The goal here is to make test automation code for developers in their Git repos with as little effort as possible.