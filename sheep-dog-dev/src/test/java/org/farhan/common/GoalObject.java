package org.farhan.common;

import java.io.File;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.core.MojoGoal;
import org.farhan.mbt.core.Utilities;
import org.junit.jupiter.api.Assertions;

public abstract class GoalObject extends TestObject {

	protected String tags = "";

	protected void runGoal(String goal) {
		try {
			Class<?> mojoClass = Class.forName(goal);
			MojoGoal mojo = (MojoGoal) mojoClass.getConstructor().newInstance();
			ConvertibleProject.baseDir = "target/src-gen/" + this.keyValue.get("component") + "/target/mbt/";
			File srcDir = new File("target/src-gen/" + this.keyValue.get("component") + "/src/test/");
			for (File aFile : Utilities.recursivelyListFiles(srcDir, "")) {
				mojo.addFile(aFile.getAbsolutePath().replace(srcDir.getAbsolutePath(), ""), Utilities.readFile(aFile));
			}
			mojo.mojoGoal(tags);
			for (String fileName : mojo.getFileList()) {
				Utilities.writeFile(new File(srcDir.getAbsolutePath() + fileName), mojo.getFileContents(fileName));
			}
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}
}
