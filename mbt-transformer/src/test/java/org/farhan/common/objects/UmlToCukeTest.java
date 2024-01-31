package org.farhan.common.objects;

import java.io.File;
import org.farhan.cucumber.CucumberFactory;
import org.farhan.cucumber.Statement;
import org.farhan.mbt.cucumber.CucumberFeatureFile;
import org.junit.jupiter.api.Test;

public class UmlToCukeTest {

	@Test
	public void testFileCreation() {
		CucumberFeatureFile cff = new CucumberFeatureFile(new File("Test Functionality.feature"));
		Statement statement;
		statement = CucumberFactory.eINSTANCE.createStatement();
		statement.setName("This is a feature");
		cff.theFeature.getStatements().add(statement);
		statement = CucumberFactory.eINSTANCE.createStatement();
		statement.setName("This is its description");
		cff.theFeature.getStatements().add(statement);
		statement = CucumberFactory.eINSTANCE.createStatement();
		statement.setName("This is another line");
		cff.theFeature.getStatements().add(statement);
		cff.write();
	}
}
