package org.farhan.ui.syntaxcoloring;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.ScenarioOutline;
import org.farhan.cucumber.Step;
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
		for (Object child : feature.getAbstractScenarios()) {
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
					CucumberHighlightingConfiguration.KEYWORD_GWT_ID);
			if (step.eContainer() instanceof ScenarioOutline && step.getName() != null) {
				this.provideHighlightingForParameters(node.getText(), node, 0, acceptor);
			}
		}
	}

	private void provideHighlightingForParameters(String description, INode node, int current,
			IHighlightedPositionAcceptor acceptor) {
		int start = description.indexOf('<', current);
		int stop = description.indexOf('>', start);
		if (start > 0 && stop > 0 && description.charAt(start + 1) != ' ') {
			acceptor.addPosition(node.getTotalOffset() + start, stop - start + 1,
					CucumberHighlightingConfiguration.PARAMETER_ID);
			this.provideHighlightingForParameters(description, node, stop + 1, acceptor);
		}
	}
}
