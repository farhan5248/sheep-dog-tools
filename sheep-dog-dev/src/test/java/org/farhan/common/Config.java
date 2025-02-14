package org.farhan.common;

import java.io.File;
import org.farhan.objects.mbttransformer.AsciidoctorToUmlGoal;
import org.farhan.objects.mbttransformer.BlahHomePageStepsJavaFile;
import org.farhan.objects.mbttransformer.BlahLoginPageStepsJavaFile;
import org.farhan.objects.mbttransformer.BlahLogoutPageStepsJavaFile;
import org.farhan.objects.mbttransformer.BlahObjectPageStepsJavaFile;
import org.farhan.objects.mbttransformer.CucumberToUmlGoal;
import org.farhan.objects.mbttransformer.HomePageAsciidocFile;
import org.farhan.objects.mbttransformer.HomePageJavaFile;
import org.farhan.objects.mbttransformer.LoginPageAsciidocFile;
import org.farhan.objects.mbttransformer.LoginPageJavaFile;
import org.farhan.objects.mbttransformer.LogoutPageAsciidocFile;
import org.farhan.objects.mbttransformer.LogoutPageJavaFile;
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
import org.farhan.objects.mbttransformer.impl.ObjectPageAsciidocFileImpl;
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
		bind(BlahHomePageStepsJavaFile.class).to(BlahObjectPageStepsJavaFileImpl.class);
		bind(BlahLoginPageStepsJavaFile.class).to(BlahObjectPageStepsJavaFileImpl.class);
		bind(BlahLogoutPageStepsJavaFile.class).to(BlahObjectPageStepsJavaFileImpl.class);
		bind(CucumberToUmlGoal.class).to(CucumberToUmlGoalImpl.class);
		bind(ObjectPageJavaFile.class).to(ObjectPageJavaFileImpl.class);
		bind(HomePageJavaFile.class).to(ObjectPageJavaFileImpl.class);
		bind(LoginPageJavaFile.class).to(ObjectPageJavaFileImpl.class);
		bind(LogoutPageJavaFile.class).to(ObjectPageJavaFileImpl.class);
		bind(ProcessAsciidocFile.class).to(ProcessAsciidocFileImpl.class);
		bind(ObjectPageAsciidocFile.class).to(ObjectPageAsciidocFileImpl.class);
		bind(HomePageAsciidocFile.class).to(ObjectPageAsciidocFileImpl.class);
		bind(LoginPageAsciidocFile.class).to(ObjectPageAsciidocFileImpl.class);
		bind(LogoutPageAsciidocFile.class).to(ObjectPageAsciidocFileImpl.class);
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