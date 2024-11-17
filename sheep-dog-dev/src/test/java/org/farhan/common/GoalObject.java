package org.farhan.common;

import java.io.File;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.MojoGoal;
import org.junit.jupiter.api.Assertions;

public abstract class GoalObject extends TestObject {

	protected void runGoal(String goal) {
		try {
			if (attributes.get("tags") == null) {
				attributes.put("tags", "");
			}
			Class<?> mojoClass = Class.forName(goal);
			MojoGoal mojo = (MojoGoal) mojoClass.getConstructor(String.class, ObjectRepository.class)
					.newInstance(attributes.get("tags"), this);
			String srcDir = new File(Config.getWorkingDir() + attributes.get("component") + "/src/test/")
					.getAbsolutePath();
			ConvertibleProject.baseDir = Config.getWorkingDir() + attributes.get("component") + "/target/mbt/";

			for (String fileName : list(srcDir, "")) {
				mojo.addFile(fileName.replace(srcDir, ""), get(fileName));
			}
			mojo.mojoGoal();
			for (String fileName : mojo.getFileList()) {
				put(srcDir + fileName, mojo.getFileContents(fileName));
			}
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + getStackTraceAsString(e));
		}
	}
}
