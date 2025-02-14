package org.farhan.common;

import java.io.File;
import org.farhan.objects.mbttransformer.AsciidoctorToUmlGoal;
import org.farhan.objects.mbttransformer.BlahObjectPageStepsJavaFile;
import org.farhan.objects.mbttransformer.CucumberToUmlGoal;
import org.farhan.objects.mbttransformer.Object1PageAsciidocFile;
import org.farhan.objects.mbttransformer.ObjectPageAsciidocFile;
import org.farhan.objects.mbttransformer.ObjectPageJavaFile;
import org.farhan.objects.mbttransformer.ProcessAsciidocFile;
import org.farhan.objects.mbttransformer.ProcessFeatureFile;
import org.farhan.objects.mbttransformer.PstUmlFile;
import org.farhan.objects.mbttransformer.UmlToAsciidoctorGoal;
import org.farhan.objects.mbttransformer.UmlToCucumberGoal;
import org.farhan.objects.mbttransformer.UmlToCucumberGuiceGoal;
import org.farhan.objects.mbttransformer.UmlToCucumberSpringGoal;
import org.farhan.objects.mbttransformer.impl.AsciidoctorToUmlGoalImpl;
import org.farhan.objects.mbttransformer.impl.BlahObjectPageStepsJavaFileImpl;
import org.farhan.objects.mbttransformer.impl.CucumberToUmlGoalImpl;
import org.farhan.objects.mbttransformer.impl.Object1PageAsciidocFileImpl;
import org.farhan.objects.mbttransformer.impl.ObjectPageJavaFileImpl;
import org.farhan.objects.mbttransformer.impl.ProcessAsciidocFileImpl;
import org.farhan.objects.mbttransformer.impl.ProcessFeatureFileImpl;
import org.farhan.objects.mbttransformer.impl.PstUmlFileImpl;
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

	public static Injector classes;

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
	public void deleteFiles() throws Exception {
		deleteDir(new File(getWorkingDir()));
	}

	@Override
	protected void configure() {
		bind(AsciidoctorToUmlGoal.class).to(AsciidoctorToUmlGoalImpl.class);
		bind(BlahObjectPageStepsJavaFile.class).to(BlahObjectPageStepsJavaFileImpl.class);
		bind(CucumberToUmlGoal.class).to(CucumberToUmlGoalImpl.class);
		bind(ObjectPageJavaFile.class).to(ObjectPageJavaFileImpl.class);
		bind(ProcessAsciidocFile.class).to(ProcessAsciidocFileImpl.class);
		bind(Object1PageAsciidocFile.class).to(Object1PageAsciidocFileImpl.class);
		// TODO rename Object1 to Object
		bind(ObjectPageAsciidocFile.class).to(Object1PageAsciidocFileImpl.class);
		bind(ProcessFeatureFile.class).to(ProcessFeatureFileImpl.class);
		bind(PstUmlFile.class).to(PstUmlFileImpl.class);
		bind(UmlToAsciidoctorGoal.class).to(UmlToAsciidoctorGoalImpl.class);
		bind(UmlToCucumberGoal.class).to(UmlToCucumberGoalImpl.class);
		bind(UmlToCucumberSpringGoal.class).to(UmlToCucumberSpringGoalImpl.class);
		bind(UmlToCucumberGuiceGoal.class).to(UmlToCucumberGuiceGoalImpl.class);
	}

	@Override
	public Injector getInjector() {
		classes = Guice.createInjector(Stage.DEVELOPMENT, CucumberModules.createScenarioModule(), new Config());
		return classes;
	}
}