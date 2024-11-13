package org.farhan.common;

import java.io.File;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.MojoGoal;
import org.farhan.mbt.core.Utilities;
import org.junit.jupiter.api.Assertions;

public abstract class GoalObject extends TestObject {

	protected void runGoal(String goal) {
		try {
			if (attributes.get("tags") == null) {
				attributes.put("tags", "");
			}
			Class<?> mojoClass = Class.forName(goal);
			MojoGoal mojo = (MojoGoal) mojoClass.getConstructor(String.class).newInstance(attributes.get("tags"));
			File srcDir = new File(Config.getWorkingDir() + attributes.get("component") + "/src/test/");
			ConvertibleProject.baseDir = Config.getWorkingDir() + attributes.get("component") + "/target/mbt/";
			
			for (File aFile : Utilities.recursivelyListFiles(srcDir, "")) {
				mojo.addFile(aFile.getAbsolutePath().replace(srcDir.getAbsolutePath(), ""), Utilities.readFile(aFile));
			}
			mojo.mojoGoal();
			for (String fileName : mojo.getFileList()) {
				Utilities.writeFile(new File(srcDir.getAbsolutePath() + fileName), mojo.getFileContents(fileName));
			}
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}
