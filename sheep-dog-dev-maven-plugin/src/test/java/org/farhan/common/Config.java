package org.farhan.common;

import java.io.File;
import org.farhan.objects.mbttransformer.AsciidoctorToUmlGoal;
import org.farhan.objects.mbttransformer.CucumberToUmlGoal;
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
import org.farhan.objects.mbttransformer.src.test.java.org.farhan.objects.blah.ObjectPageJavaFile;
import org.farhan.objects.mbttransformer.src.test.java.org.farhan.stepdefs.blah.BlahObjectPageStepsJavaFile;
import org.farhan.objects.mbttransformer.src.test.resources.asciidoc.app.ProcessAsciidocFile;
import org.farhan.objects.mbttransformer.src.test.resources.asciidoc.stepdefs.blahapplication.ObjectPageAsciidocFile;
import org.farhan.objects.mbttransformer.src.test.resources.cucumber.app.ProcessFeatureFile;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.InjectorSource;
import io.cucumber.java.Before;

public final class Config extends AbstractModule implements InjectorSource {

	public static String getWorkingDir() {
		return "target/src-gen/";
	}

	public void deleteDir(File aDir) {
		if (aDir.exists()) {
			for (String s : aDir.list()) {
				File f = new File(aDir.getAbsolutePath() + File.separator + s);
				if (f.isDirectory()) {
					deleteDir(f);
				}
				f.delete();
			}
		}
	}

	@Before
	public void before() {
		deleteDir(new File(getWorkingDir()));
	}

	@Override
	protected void configure() {
		bind(AsciidoctorToUmlGoal.class).to(AsciidoctorToUmlGoalImpl.class);
		bind(BlahObjectPageStepsJavaFile.class).to(FileImpl.class);
		bind(ObjectPageJavaFile.class).to(FileImpl.class);
		bind(CucumberToUmlGoal.class).to(CucumberToUmlGoalImpl.class);
		bind(ObjectPageAsciidocFile.class).to(FileImpl.class);
		bind(ProcessAsciidocFile.class).to(FileImpl.class);
		bind(org.farhan.objects.mbttransformer.src.test.resources.asciidoc.ProcessAsciidocFile.class)
				.to(FileImpl.class);
		bind(org.farhan.objects.specprj.src.test.resources.asciidoc.app.ProcessAsciidocFile.class)
		.to(FileImpl.class);
		bind(org.farhan.objects.specprj.src.test.resources.asciidoc.ProcessAsciidocFile.class)
		.to(FileImpl.class);
		bind(ProcessFeatureFile.class).to(FileImpl.class);
		bind(org.farhan.objects.mbttransformer.src.test.resources.cucumber.ProcessFeatureFile.class).to(FileImpl.class);
		bind(org.farhan.objects.codeprj.src.test.resources.cucumber.ProcessFeatureFile.class).to(FileImpl.class);
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