# Project Goals

## Sharing Knowledge

First, it's to share my knowledge around MDD and MBT etc using Eclipse, EMF, Cucumber, Java, UML, Graph Models, Camunda, Maven.

I'm basically putting all my knowledge that I've accumulated so far using models for coding/testing in this repo as an example.
When I went looking for information 15 years ago and sometimes even today it's a little hard to find it.
It's also hard to find a complete example of how to use frameworks within the [Eclipse Modelling Project](https://projects.eclipse.org/projects/modeling). 
Hopefully this makes it easier for someone else who's interested in doing such things.

## Research

Secondly it's to do research on trying to train an AI to do what a rule based engine does using data created through MBT.

As my QA team developed more feature files, I realised that maintaining that was taking more time. 
MBT helps here if you think of each scenario as describing a path through a graph model.
If you're not sure what that looks like you can read this document [here](https://blog.cleancoder.com/uncle-bob/2018/06/06/PickledState.html) by Robert C. Martin (Uncle Bob).

So once one has all the rules in this model and are able to generate thousands or even millions of scenarios with data, I'm curious to know if I can feed that data to an AI.
I've tried this with ChatGPT and so far it has worked out well except for the fact that it couldn't do math to determine which is the lesser between two numbers.
At the minimum I want it to select configuration but I'm optimistic that it can do enough math with [Code Interpreter](https://platform.openai.com/docs/assistants/tools).

Why would I do this? I worked on a drug benefit adjudication system.
I was thinking that instead of trying to re-write 20-40 years of COBOL code, why not just train an AI by running the 100,000+ test cases against it.
One big advantage is that you democratise the knowledge that's in the code because now anyone, not just a developer can get information about the system.
Like you don't need to ask a developer to read the code to tell you what they system is doing, you'd just ask the AI to give you an example.

How would I trust that it's trained well enough? 
I'd keep increasing the number of test cases/ training data (thanks to an MBT tool) until the AI gets it right. 
Also I'd first just use it as a massive knowledge base internally before putting it into production.
Lastly, I'd run it in production along side the current system and just feed it data from the previous night and compare the outputs.
