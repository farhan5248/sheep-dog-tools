package org.farhan.common;

import java.io.File;
import java.util.ArrayList;

import org.farhan.mbt.core.Utilities;
import org.farhan.objects.mbttransformer.AsciidoctorToUmlGoal;
import org.farhan.objects.mbttransformer.BlahObjectPageStepsJavaFile;
import org.farhan.objects.mbttransformer.CucumberToUmlGoal;
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

	public void deleteDir(File dir, String extension) {
		ArrayList<File> filesList = recursivelyListFilesAndDirectories(dir, extension);
		for (File f : filesList) {
			f.delete();
		}
	}

	public ArrayList<File> recursivelyListFilesAndDirectories(File aDir, String extension) {
		ArrayList<File> theFiles = new ArrayList<File>();
		if (aDir.exists()) {
			for (String s : aDir.list()) {
				File tempFile = new File(aDir.getAbsolutePath() + File.separator + s);
				if (tempFile.isDirectory()) {
					theFiles.addAll(recursivelyListFilesAndDirectories(tempFile, extension));
					theFiles.add(tempFile);
				} else if (tempFile.getAbsolutePath().toLowerCase().endsWith(extension.toLowerCase())) {
					theFiles.add(tempFile);
				}
			}
		}
		return theFiles;
	}

	@Before
	public void deleteFiles() throws Exception {
		deleteDir(new File(getWorkingDir()), "");
	}

	@Override
	protected void configure() {
		bind(AsciidoctorToUmlGoal.class).to(AsciidoctorToUmlGoalImpl.class);
		bind(BlahObjectPageStepsJavaFile.class).to(BlahObjectPageStepsJavaFileImpl.class);
		bind(CucumberToUmlGoal.class).to(CucumberToUmlGoalImpl.class);
		bind(ObjectPageJavaFile.class).to(ObjectPageJavaFileImpl.class);
		bind(ProcessAsciidocFile.class).to(ProcessAsciidocFileImpl.class);
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