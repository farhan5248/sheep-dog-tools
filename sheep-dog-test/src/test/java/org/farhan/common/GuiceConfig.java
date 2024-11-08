package org.farhan.common;

import org.farhan.objects.xtext.DailyBatchjobFile;
import org.farhan.objects.xtext.GenerationAction;
import org.farhan.objects.xtext.InputFileFeatureFile;
import org.farhan.objects.xtext.ProcessFeatureFile;
import org.farhan.objects.xtext.QuickfixDialog;
import org.farhan.objects.xtext.ScenarioValidationAction;
import org.farhan.objects.xtext.ScenarioValidationDialog;
import org.farhan.objects.xtext.StepTableProposalAction;
import org.farhan.objects.xtext.SuggestionAction;
import org.farhan.objects.xtext.SuggestionDialog;
import org.farhan.objects.xtext.ValidationAction;
import org.farhan.objects.xtext.ValidationDialog;
import org.farhan.objects.xtext.impl.DailyBatchjobFileImpl;
import org.farhan.objects.xtext.impl.GenerationActionImpl;
import org.farhan.objects.xtext.impl.InputFileFeatureFileImpl;
import org.farhan.objects.xtext.impl.ProcessFeatureFileImpl;
import org.farhan.objects.xtext.impl.QuickfixDialogImpl;
import org.farhan.objects.xtext.impl.ScenarioValidationActionImpl;
import org.farhan.objects.xtext.impl.ScenarioValidationDialogImpl;
import org.farhan.objects.xtext.impl.StepTableProposalActionImpl;
import org.farhan.objects.xtext.impl.SuggestionActionImpl;
import org.farhan.objects.xtext.impl.SuggestionDialogImpl;
import org.farhan.objects.xtext.impl.ValidationActionImpl;
import org.farhan.objects.xtext.impl.ValidationDialogImpl;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.InjectorSource;

public final class GuiceConfig extends AbstractModule implements InjectorSource {

	@Override
	protected void configure() {
		bind(DailyBatchjobFile.class).to(DailyBatchjobFileImpl.class);
		bind(GenerationAction.class).to(GenerationActionImpl.class);
		bind(InputFileFeatureFile.class).to(InputFileFeatureFileImpl.class);
		bind(ProcessFeatureFile.class).to(ProcessFeatureFileImpl.class);
		bind(QuickfixDialog.class).to(QuickfixDialogImpl.class);
		bind(ScenarioValidationAction.class).to(ScenarioValidationActionImpl.class);
		bind(ScenarioValidationDialog.class).to(ScenarioValidationDialogImpl.class);
		bind(StepTableProposalAction.class).to(StepTableProposalActionImpl.class);
		bind(SuggestionAction.class).to(SuggestionActionImpl.class);
		bind(SuggestionDialog.class).to(SuggestionDialogImpl.class);
		bind(ValidationAction.class).to(ValidationActionImpl.class);
		bind(ValidationDialog.class).to(ValidationDialogImpl.class);
	}

	@Override
	public Injector getInjector() {
		return Guice.createInjector(Stage.DEVELOPMENT, CucumberModules.createScenarioModule(), new GuiceConfig());
	}
}