package org.farhan.ui.syntaxcoloring;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.farhan.cucumber.Examples;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.ScenarioOutline;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.Tag;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class CucumberSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
		if (resource == null || resource.getParseResult() == null || resource.getContents().size() <= 0) {
			return;
		}
		Feature feature = (Feature) resource.getContents().get(0);
		for (Tag tag : feature.getTags()) {
			provideHighlightingForTags(tag, acceptor);
		}
		for (Object child : feature.getAbstractScenarios()) {
			if (child instanceof Scenario) {
				Scenario scenario = (Scenario) child;
				provideHighlightingForSteps(scenario.getSteps(), acceptor);
				for (Tag tag : scenario.getTags()) {
					provideHighlightingForTags(tag, acceptor);
				}
			} else if (child instanceof ScenarioOutline) {
				ScenarioOutline outline = (ScenarioOutline) child;
				provideHighlightingForSteps(outline.getSteps(), acceptor);
				for (Tag tag : outline.getTags()) {
					provideHighlightingForTags(tag, acceptor);
				}
				for (Examples example : outline.getExamples()) {
					for (Tag tag : example.getTags()) {
						provideHighlightingForTags(tag, acceptor);
					}
				}
			}
		}
	}

	private void provideHighlightingForSteps(EList<Step> steps, IHighlightedPositionAcceptor acceptor) {
		for (Step step : steps) {
			INode node = NodeModelUtils.getNode(step);
			if (step.eContainer() instanceof ScenarioOutline && step.getName() != null) {
				this.provideHighlightingForParameters(node.getText(), node, 0, acceptor);
			}
		}
	}

	private void provideHighlightingForParameters(String name, INode node, int current,
			IHighlightedPositionAcceptor acceptor) {
		int start = name.indexOf('<', current);
		int stop = name.indexOf('>', start);
		if (start > 0 && stop > 0 && name.charAt(start + 1) != ' ') {
			acceptor.addPosition(node.getTotalOffset() + start, stop - start + 1,
					CucumberHighlightingConfiguration.PARAMETER_ID);
			this.provideHighlightingForParameters(name, node, stop + 1, acceptor);
		}
	}

	private void provideHighlightingForTags(Tag tag, IHighlightedPositionAcceptor acceptor) {
		INode node = NodeModelUtils.getNode(tag);
		acceptor.addPosition(node.getTotalOffset(), node.getText().length(),
				CucumberHighlightingConfiguration.TAG_ID);
	}
}
