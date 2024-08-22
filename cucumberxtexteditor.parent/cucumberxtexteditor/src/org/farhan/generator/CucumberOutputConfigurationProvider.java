package org.farhan.generator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class CucumberOutputConfigurationProvider implements IOutputConfigurationProvider {

	public final static String STEP_DEFS = "STEP_DEFS";

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {

		HashSet<OutputConfiguration> set = new HashSet<OutputConfiguration>();
		createConfigs();
		for (String name : ocpMap.keySet()) {
			set.add(ocpMap.get(name));
		}
		return set;
	}

	public static HashMap<String, OutputConfiguration> ocpMap = new HashMap<String, OutputConfiguration>();

	public static void createConfigs() {
		OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
		defaultOutput.setDescription("Output Folder");
		defaultOutput.setOutputDirectory("./src-gen");
		defaultOutput.setOverrideExistingResources(true);
		defaultOutput.setCreateOutputDirectory(true);
		defaultOutput.setCleanUpDerivedResources(true);
		defaultOutput.setSetDerivedProperty(true);
		ocpMap.put(defaultOutput.getName(), defaultOutput);

		OutputConfiguration onceOutput = new OutputConfiguration(STEP_DEFS);
		onceOutput.setDescription("Step Definitions");
		onceOutput.setOutputDirectory("./src-gen-step-defs");
		onceOutput.setOverrideExistingResources(false);
		onceOutput.setCreateOutputDirectory(true);
		onceOutput.setCleanUpDerivedResources(false);
		// TODO maybe set this to false in the future
		onceOutput.setSetDerivedProperty(true);
		ocpMap.put(onceOutput.getName(), onceOutput);
	}

}
