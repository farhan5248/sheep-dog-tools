package org.farhan.common;

import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.Converter;
import org.junit.jupiter.api.Assertions;

public abstract class GoalObject extends TestObject {

	protected String[] dirs = { "src/test/resources/asciidoc/", "src/test/resources/cucumber/",
			"src/test/java/org/farhan/stepdefs/", "src/test/java/org/farhan/objects/" };
	protected ObjectRepository or;
	protected SourceRepository sr;
	protected String tags;

	public GoalObject() {
		or = new FileObjectRepository();
		sr = new SourceRepository();
		attributes.put("tags", "");
	}

	protected void runGoal(String goal) {

		try {
			tags = attributes.get("tags");
			Class<?> mojoClass = Class.forName(goal);
			Converter mojo = (Converter) mojoClass.getConstructor(String.class, ObjectRepository.class)
					.newInstance(tags, or);

			if (mojo.getClass().getName().endsWith("ToUML")) {
				for (int i = 0; i < 2; i++) {
					for (String fileName : sr.list(dirs[i], "")) {
						mojo.convertObject(fileName, sr.get(fileName));
					}
				}
			} else {
				for (String fileName : mojo.getObjectNames()) {
					String content = mojo.convertObject(fileName, sr.contains(fileName) ? sr.get(fileName) : "");
					if (!content.isEmpty()) {
						sr.put(fileName, content);
					}
				}
			}
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + getStackTraceAsString(e));
		}
	}
}
