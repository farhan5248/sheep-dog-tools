package org.farhan.common;

import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.Converter;
import org.junit.jupiter.api.Assertions;

public abstract class GoalObject extends TestObject {

	public GoalObject() {
		attributes.put("tags", "");
	}

	protected void runGoal(String goal) {
		try {
			String tags = attributes.get("tags");
			Class<?> mojoClass = Class.forName(goal);
			Converter mojo = (Converter) mojoClass.getConstructor(String.class, ObjectRepository.class)
					.newInstance(tags, this);

			if (goal.endsWith("ToUML")) {
				for (String fileName : list("client", "src/test/resources/asciidoc", "")) {
					put(tags, fileName, get("client", fileName));
				}
				for (String fileName : list("client", "src/test/resources/cucumber", "")) {
					put(tags, fileName, get("client", fileName));
				}
				for (String fileName : list("client", "src/test/java/org/farhan/objects/", "")) {
					put(tags, fileName, get("client", fileName));
				}
				for (String fileName : list("client", "src/test/java/org/farhan/stepdefs/", "")) {
					put(tags, fileName, get("client", fileName));
				}
			}

			mojo.mojoGoal();

			if (goal.endsWith("ToUML")) {
				for (String fileName : list(tags, "uml/", "")) {
					put("client", fileName, get(tags, fileName));
				}
			} else {
				for (String fileName : list(tags, "src/test/resources/asciidoc", "")) {
					put("client", fileName, get(tags, fileName));
				}
				for (String fileName : list(tags, "src/test/resources/cucumber", "")) {
					put("client", fileName, get(tags, fileName));
				}
				for (String fileName : list(tags, "src/test/java/org/farhan/objects/", "")) {
					put("client", fileName, get(tags, fileName));
				}
				for (String fileName : list(tags, "src/test/java/org/farhan/stepdefs/", "")) {
					put("client", fileName, get(tags, fileName));
				}
			}
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + getStackTraceAsString(e));
		}
	}
}
