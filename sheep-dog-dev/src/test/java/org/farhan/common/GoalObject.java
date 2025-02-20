package org.farhan.common;

import org.farhan.mbt.core.ObjectRepository;

import java.util.ArrayList;

import org.farhan.mbt.core.Converter;
import org.farhan.mbt.core.Logger;
import org.junit.jupiter.api.Assertions;

public abstract class GoalObject extends TestObject {

	protected String[] dirs = { "src/test/resources/asciidoc/", "src/test/resources/cucumber/" };
	protected ObjectRepository or;
	protected SourceRepository sr;
	protected LoggerImpl log;
	protected String tags;

	public GoalObject() {
		or = new FileObjectRepository();
		sr = new SourceRepository();
		log = new LoggerImpl();
		attributes.put("tags", "");
	}

	protected void runGoal(String goal) {

		try {
			tags = attributes.get("tags");
			Class<?> mojoClass = Class.forName(goal);
			Converter mojo = (Converter) mojoClass.getConstructor(String.class, ObjectRepository.class, Logger.class)
					.newInstance(tags, or, log);

			if (mojo.getClass().getName().endsWith("ToUML")) {
				mojo.clearObjects();
				for (String dir : dirs) {
					ArrayList<String> tempFiles = new ArrayList<String>();
					for (String fileName : sr.list(dir, "")) {
						if (fileName.startsWith(dir + "stepdefs")) {
							tempFiles.add(fileName);
						} else {
							mojo.convertObject(fileName, sr.get(fileName));
						}
					}
					for (String fileName : tempFiles) {
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
