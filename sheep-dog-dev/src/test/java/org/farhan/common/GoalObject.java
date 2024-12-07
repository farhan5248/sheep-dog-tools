package org.farhan.common;

import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.Converter;
import org.farhan.mbt.core.ConverterNew;
import org.junit.jupiter.api.Assertions;

public abstract class GoalObject extends TestObject {

	protected String[] dirs = { "src/test/resources/asciidoc/", "src/test/resources/cucumber/",
			"src/test/java/org/farhan/objects/", "src/test/java/org/farhan/stepdefs/" };
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
				for (String dir : dirs) {
					for (String fileName : sr.list(dir, "")) {
						or.put(tags, fileName, sr.get(fileName));
					}
				}
			}

			mojo.convert();

			if (!mojo.getClass().getName().endsWith("ToUML")) {
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

	protected void runGoalNew(String goal) {

		try {
			tags = attributes.get("tags");
			Class<?> mojoClass = Class.forName(goal);
			ConverterNew mojo = (ConverterNew) mojoClass.getConstructor(String.class, ObjectRepository.class)
					.newInstance(tags, or);
			mojo.initProjects();

			if (mojo.getClass().getName().endsWith("ToUML")) {
				for (int i = 0; i < 2; i++) {
					for (String fileName : sr.list(dirs[i], "")) {
						mojo.convertObject(tags, fileName, sr.get(fileName));
					}
				}
			} else {
				for (int i = 0; i < 4; i++) {
					for (String fileName : sr.list(dirs[i], "")) {
						String content = mojo.convertObject(tags, fileName, sr.get(fileName));
						if (!content.isEmpty()) {
							sr.put(fileName, content);
						}
					}
				}
			}
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + getStackTraceAsString(e));
		}
	}
}
