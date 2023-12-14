package org.farhan.featureToUml;

import org.farhan.cucumber.Feature;
import org.farhan.mbt.conv.cucumber.FeatureLoader;

import io.cucumber.java.en.Given;

public class StepDefinitions {
	@Given("The body application, stomach is empty")
	public void I_have_cukes_in_my_belly() {
		String content = "Feature: Belly\r\n"
				+ "\r\n"
				+ "  Scenario: a few cukes\r\n"
				+ "    Given The body application, stomach is empty";
		Feature feature = new FeatureLoader().loadModel(content);
		System.out.println(feature.getName());
		System.out.println(feature.getAbstractScenarios().getFirst().getSteps().getFirst().getName());
	}
}