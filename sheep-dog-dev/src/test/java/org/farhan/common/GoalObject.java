package org.farhan.common;

import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.Converter;
import org.junit.jupiter.api.Assertions;

public abstract class GoalObject extends TestObject {

	public GoalObject() {
		attributes.put("tags", "");
	}

	protected void runGoal(String goal) {
		ObjectRepository or = new FileObjectRepository();
		SourceRepository sr = new SourceRepository();
		String tags = attributes.get("tags");
		String[] dirs = { "src/test/resources/asciidoc/", "src/test/resources/cucumber/",
				"src/test/java/org/farhan/objects/", "src/test/java/org/farhan/stepdefs/" };
		try {

			Class<?> mojoClass = Class.forName(goal);
			Converter mojo = (Converter) mojoClass.getConstructor(String.class, ObjectRepository.class)
					.newInstance(tags, or);

			if (goal.endsWith("ToUML")) {
				for (String dir : dirs) {
					for (String fileName : sr.list(dir, "")) {
						or.put(tags, fileName, sr.get(fileName));
					}
				}
			}

			mojo.mojoGoal();

			if (!goal.endsWith("ToUML")) {
				for (String dir : dirs) {
					for (String fileName : or.list(tags, dir, "")) {
						sr.put(fileName, or.get(tags, fileName));
					}
				}
			}
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + getStackTraceAsString(e));
		}
	}
}
