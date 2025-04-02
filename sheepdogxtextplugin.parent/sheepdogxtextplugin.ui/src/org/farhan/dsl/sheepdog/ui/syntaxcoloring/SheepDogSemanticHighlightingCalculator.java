package org.farhan.dsl.sheepdog.ui.syntaxcoloring;

import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.farhan.dsl.common.StatementNameHelper;
import org.farhan.dsl.sheepdog.sheepDog.Statement;
import org.farhan.dsl.sheepdog.sheepDog.StepDefinition;
import org.farhan.dsl.sheepdog.sheepDog.StepObject;
import org.farhan.dsl.sheepdog.sheepDog.StepParameters;
import org.farhan.dsl.sheepdog.sheepDog.Tags;
import org.farhan.dsl.sheepdog.sheepDog.TestCase;
import org.farhan.dsl.sheepdog.sheepDog.TestData;
import org.farhan.dsl.sheepdog.sheepDog.TestSetup;
import org.farhan.dsl.sheepdog.sheepDog.TestStep;
import org.farhan.dsl.sheepdog.sheepDog.TestSuite;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class SheepDogSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
		if (resource == null || resource.getParseResult() == null || resource.getContents().size() <= 0) {
			return;
		}
		if (resource.getContents().get(0) instanceof TestSuite) {
			TestSuite testSuite = (TestSuite) resource.getContents().get(0);
			for (Statement s : testSuite.getStatementList()) {
				highlightStatement(s, acceptor, 0);
			}
			for (Object child : testSuite.getTestStepContainerList()) {
				if (child instanceof TestSetup) {
					TestSetup ts = (TestSetup) child;
					for (Statement s : ts.getStatementList()) {
						highlightStatement(s, acceptor, 0);
					}
					for (TestStep s : ts.getTestStepList()) {
						highlightTestStep(s, acceptor);
					}
					highlightTagList(ts.getTagList(), acceptor);
				} else if (child instanceof TestCase) {
					TestCase tc = (TestCase) child;
					for (Statement s : tc.getStatementList()) {
						highlightStatement(s, acceptor, 0);
					}
					for (TestStep s : tc.getTestStepList()) {
						highlightTestStep(s, acceptor);
					}
					highlightTagList(tc.getTagList(), acceptor);
					for (TestData example : tc.getTestDataList()) {
						for (Statement s : example.getStatementList()) {
							highlightStatement(s, acceptor, 0);
						}
						highlightTestData(example, acceptor);
					}
				}
			}
		} else {
			StepObject stepObject = (StepObject) resource.getContents().get(0);
			for (Statement s : stepObject.getStatementList()) {
				highlightStatement(s, acceptor, 0);
			}
			for (StepDefinition child : stepObject.getStepDefinitionList()) {
				for (Statement s : child.getStatementList()) {
					highlightStatement(s, acceptor, 0);
				}
				for (StepParameters sp : child.getStepParameterList()) {
					for (Statement s : sp.getStatementList()) {
						highlightStatement(s, acceptor, 0);
					}
				}
			}
		}
	}

	private void highlightStepParameters(TestStep testStep, IHighlightedPositionAcceptor acceptor, int current) {
		if (testStep != null) {
			INode node = NodeModelUtils.getNode(testStep);
			int start = node.getText().indexOf('<', current);
			int stop = node.getText().indexOf('>', start);
			if (start > 0 && stop > 0 && node.getText().charAt(start + 1) != ' ') {
				acceptor.addPosition(node.getTotalOffset() + start, stop - start + 1,
						SheepDogHighlightingConfiguration.TBL_ID);
				this.highlightStepParameters(testStep, acceptor, stop + 1);
			}
		}
	}

	private void highlightStatement(Statement statement, IHighlightedPositionAcceptor acceptor, int current) {
		if (statement != null) {
			INode node = NodeModelUtils.getNode(statement);
			int offset = node.getTotalOffset();
			for (String s : node.getText().split(" ")) {
				if (StatementNameHelper.isTag(s)) {
					acceptor.addPosition(offset + current, s.length(), SheepDogHighlightingConfiguration.TAG_ID);
				} else if (StatementNameHelper.isTodo(s)) {
					acceptor.addPosition(offset + current, s.length(), SheepDogHighlightingConfiguration.TODO_ID);
				} else {
					acceptor.addPosition(offset + current, s.length(), SheepDogHighlightingConfiguration.STATEMENT_ID);
				}
				current += s.length() + 1;
			}
		}
	}

	private void highlightTagList(Tags tag, IHighlightedPositionAcceptor acceptor) {
		if (tag != null) {
			INode node = NodeModelUtils.getNode(tag);
			acceptor.addPosition(node.getTotalOffset(), node.getText().length(),
					SheepDogHighlightingConfiguration.TAG_ID);
		}
	}

	private void highlightTestData(TestData example, IHighlightedPositionAcceptor acceptor) {
		// TODO this is for example table mapping

	}

	private void highlightTestStep(TestStep testStep, IHighlightedPositionAcceptor acceptor) {
		if (testStep.eContainer() instanceof TestCase && testStep.getName() != null) {
			this.highlightStepParameters(testStep, acceptor, 0);
		}
		// TODO also handle table headers
	}
}
