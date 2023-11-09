# Project Structure

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
