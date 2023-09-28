package org.farhan.ui.syntaxcoloring;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.resource.XtextResource;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.ScenarioOutline;
import org.farhan.cucumber.Step;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class CucumberSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {

	// this is used to walk through the entire document and apply styles like to
	// outline parameters with <>
	// default code
	// https://github.com/eclipse/xtext-core/blob/master/org.eclipse.xtext.ide/src/org/eclipse/xtext/ide/editor/syntaxcoloring/DefaultSemanticHighlightingCalculator.java

	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null || resource.getContents().size() <= 0) {
			return;
		}
		Feature feature = (Feature) resource.getContents().get(0);
		if (feature.getBackground() != null) {
			provideHighlightingForSteps(feature.getBackground().getSteps(), acceptor);
		}
		for (Object child : feature.getScenarios()) {
			if (child instanceof Scenario) {
				Scenario scenario = (Scenario) child;
				provideHighlightingForSteps(scenario.getSteps(), acceptor);
			}
			if (child instanceof ScenarioOutline) {
				ScenarioOutline outline = (ScenarioOutline) child;
				provideHighlightingForSteps(outline.getSteps(), acceptor);
			}
		}
	}

	private void provideHighlightingForSteps(EList<Step> steps, IHighlightedPositionAcceptor acceptor) {
		for (Step step : steps) {
			INode node = NodeModelUtils.getNode(step);
			acceptor.addPosition(node.getOffset(), node.getText().trim().indexOf(" "),
					CucumberHighlightingConfiguration.KEYWORD_ID);
			if (step.eContainer() instanceof ScenarioOutline && step.getTitle() != null) {
				this.provideHighlightingForPlaceholders(node.getText(), node, 0, acceptor);
			}
		}
	}

	private void provideHighlightingForPlaceholders(String description, INode node, int current,
			IHighlightedPositionAcceptor acceptor) {
		int start = description.indexOf('<', current);
		int stop = description.indexOf('>', start);
		if (start > 0 && stop > 0 && description.charAt(start + 1) != ' ') {
			acceptor.addPosition(node.getTotalOffset() + start, stop - start + 1,
					CucumberHighlightingConfiguration.PARAMETER);
			this.provideHighlightingForPlaceholders(description, node, stop + 1, acceptor);
		}
	}
}
