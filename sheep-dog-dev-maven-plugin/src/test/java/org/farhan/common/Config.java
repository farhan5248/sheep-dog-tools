package org.farhan.common;

import java.io.File;

import org.farhan.mbt.core.Utilities;
import org.farhan.objects.mbttransformer.AsciidoctorToUmlGoal;
import org.farhan.objects.mbttransformer.BlahObjectPageStepsJavaFile;
import org.farhan.objects.mbttransformer.CucumberToUmlGoal;
import org.farhan.objects.mbttransformer.ProcessAsciidocFile;
import org.farhan.objects.mbttransformer.ProcessFeatureFile;
import org.farhan.objects.mbttransformer.UmlToAsciidoctorGoal;
import org.farhan.objects.mbttransformer.UmlToCucumberGoal;
import org.farhan.objects.mbttransformer.UmlToCucumberGuiceGoal;
import org.farhan.objects.mbttransformer.UmlToCucumberSpringGoal;
import org.farhan.objects.mbttransformer.impl.AsciidoctorToUmlGoalImpl;
import org.farhan.objects.mbttransformer.impl.CucumberToUmlGoalImpl;
import org.farhan.objects.mbttransformer.impl.FileImpl;
import org.farhan.objects.mbttransformer.impl.UmlToAsciidoctorGoalImpl;
import org.farhan.objects.mbttransformer.impl.UmlToCucumberGoalImpl;
import org.farhan.objects.mbttransformer.impl.UmlToCucumberGuiceGoalImpl;
import org.farhan.objects.mbttransformer.impl.UmlToCucumberSpringGoalImpl;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.InjectorSource;
import io.cucumber.java.Before;

public final class Config extends AbstractModule implements InjectorSource {

	@Before
	public void before() {
		Utilities.deleteDir(new File("target/src-gen/"), "");
	}

	@Override
	protected void configure() {
		bind(AsciidoctorToUmlGoal.class).to(AsciidoctorToUmlGoalImpl.class);
		bind(BlahObjectPageStepsJavaFile.class).to(FileImpl.class);
		bind(CucumberToUmlGoal.class).to(CucumberToUmlGoalImpl.class);
		bind(ProcessAsciidocFile.class).to(FileImpl.class);
		bind(ProcessFeatureFile.class).to(FileImpl.class);
		bind(UmlToAsciidoctorGoal.class).to(UmlToAsciidoctorGoalImpl.class);
		bind(UmlToCucumberGoal.class).to(UmlToCucumberGoalImpl.class);
		bind(UmlToCucumberSpringGoal.class).to(UmlToCucumberSpringGoalImpl.class);
		bind(UmlToCucumberGuiceGoal.class).to(UmlToCucumberGuiceGoalImpl.class);
	}

	@Override
	public Injector getInjector() {
		return Guice.createInjector(Stage.DEVELOPMENT, CucumberModules.createScenarioModule(), new Config());
	}
}