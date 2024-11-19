package org.farhan.common;

import java.util.ArrayList;

import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.Converter;
import org.junit.jupiter.api.Assertions;

import com.google.inject.Key;

public abstract class GoalObject extends TestObject {

	private ArrayList<FileObject> getFileClasses() throws Exception {
		ArrayList<FileObject> files = new ArrayList<FileObject>();
		for (Key<?> b : Config.classes.getBindings().keySet()) {
			if (b.getTypeLiteral().toString().endsWith("File")
					&& b.getTypeLiteral().toString().startsWith("org.farhan.objects.mbttransformer.")) {
				FileObject object = (FileObject) Config.classes.getInstance(b);
				if (object.attributes.get("content") != null) {
					files.add(object);
				}
			}
		}
		return files;
	}

	protected void runGoal(String goal) {
		try {
			String tags = attributes.get("tags");
			if (tags == null) {
				tags = "";
			}
			Class<?> mojoClass = Class.forName(goal);
			Converter mojo = (Converter) mojoClass.getConstructor(String.class, ObjectRepository.class)
					.newInstance(tags, this);

			for (FileObject object : getFileClasses()) {
				this.put(tags, object.attributes.get("path"), object.attributes.get("content"));
			}
			mojo.mojoGoal();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + getStackTraceAsString(e));
		}
	}
}
