package org.farhan.generator;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class MyOutputConfigurationProvider implements IOutputConfigurationProvider {

	public final static String DEFAULT_OUTPUT_ONCE = "DEFAULT_OUTPUT_ONCE";

	public static OutputConfiguration onceOutput;

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		HashSet<OutputConfiguration> set = new HashSet<OutputConfiguration>();

		OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
		defaultOutput.setDescription("Output Folder");
		defaultOutput.setOutputDirectory("./src-gen");
		defaultOutput.setOverrideExistingResources(true);
		defaultOutput.setCreateOutputDirectory(true);
		defaultOutput.setCleanUpDerivedResources(true);
		defaultOutput.setSetDerivedProperty(true);
		set.add(defaultOutput);

		onceOutput = new OutputConfiguration(DEFAULT_OUTPUT_ONCE);
		onceOutput.setDescription("Output Folder (once)");
		onceOutput.setOutputDirectory("./src-gen-once");
		onceOutput.setOverrideExistingResources(false);
		onceOutput.setCreateOutputDirectory(true);
		onceOutput.setCleanUpDerivedResources(false);
		// TODO maybe set this to false in the future
		onceOutput.setSetDerivedProperty(true);
		set.add(onceOutput);
		return set;
	}

}
