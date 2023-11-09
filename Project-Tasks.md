# Project Tasks

This page describes the relationships between all the issues in the 4 Projects associated with this repo. 

Let's assume a team is already doing BDD. A tester writes some feature files and then they or a developer codes the test automation.
What I'm explaining here is what I told my team are the reasons for adopting and learning the following.

## Language Engineering with Cucumber and Eclipse Xtext

### Formal Syntax

If the feature files have a formal syntax, then you can generate code for test automation automatically. 
MBT generates code and tests, but if you get this far, you can at least generate the code as manual testers in my QA team did once they started using Cucumber or even Robot Framework.

- [ ] [Restructure Xtext Project by changing the mwe file](https://github.com/farhan5248/claims-adjudication-ai/issues/14)
- [ ] [Fix Xtext Editor Format](https://github.com/farhan5248/claims-adjudication-ai/issues/3)
- [ ] [Fix Xtext Editor Warnings](https://github.com/farhan5248/claims-adjudication-ai/issues/2)

### Code Maintenance

Before my team migrated to Cucumber, they were on Robot Framework and manually created the 2nd and 3rd layer page object files for a long time.
They wound up with duplicate keywords like "click the button", "click on the button", "click button" etc. 
By controlling the grammar and deriving the 2nd and 3rd layer page object files, we eliminated problems like these and others I can't recall right now :P

- [ ] [Xtext Compile code should trigger Java code creation using Java Parser](https://github.com/farhan5248/claims-adjudication-ai/issues/9)
- [ ] [Xtext Validate code should trigger UML model creation using EMF](https://github.com/farhan5248/claims-adjudication-ai/issues/8)

### Deriving Graph Models

Around 2018 we tried a tool called Eggplant AI but I guess not everyone is able to think abstractly and create models directly at first.
I've also read and experienced that creating a model from scratch has an overhead that does slow folks down.
What seems to work is reverse engineering existing BDD related files like feature files and deriving a model from that and letting someone then modify that.
So while the syntax validation of Xtext helps generate code using a UML model, the semantic validation helps with building the graph model.

## Model Based Testing with Cucumber and Graphwalker

### Updating 100,000+ Test Case Calculations

After 20 or so years and 100,000+ test cases or more later, updating the regressions would take days to weeks of back and forth.
An MBT tool does this in seconds to minutes. 

### Auto-generation of Test Cases Preventing Calculation Mistakes and Rework

For new features, testers had to hand calculate adjudication amounts and if they made a mistake, they'd have to redo the work.
MBT tools eliminate that problem and the calculations are done as the tester wanted the first time around.
Updates to new test cases are also easy to make.

## Model Driven Development with Eclipse Modelling Framework and UML 

### Code Generation

If you have enough information in the test model about the interfaces, you could transform them into something that JHipster uses for example and create the code automatically.

## Training AI to Adjudicate Drug Claims with Chat GPT

### Less Code

Apart from the Java code that triggers all the COBOL code, I see very little code being developed by a human or being generated like with JHipster. 
Updating the system would simply be a matter of specifying the new behaviour with good examples (training data).
You'd need no test cycles or defect remediation for that part of the system.
Instead of running massive regressions, finding defects, then running them again, why not treat the massive amounts of regression test data as training data and reset the system behaviour?

### Communicate with the code

In my experience, sometimes, non-developers (tester, BSA, product owner) would ask developers to check the code to confirm what it's doing.
This is because they couldn't access or understand programming languages.
However what if they could just ask something like ChatGPT to answer the questions because it had access to the very rules used in production.

### Simpler Apps

One app I worked on had dozens and perhaps hundreds of pages used to find data.
I always thought about how much time it would take for someone to learn where everything is and then click through the sometimes dozen pages to get what they want.
Imagine again just being able to ask ChatGPT for information on a customer, you wouldn't need a million web-pages, just one with a chat box.
