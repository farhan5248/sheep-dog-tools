package org.farhan.mbt.ui.quickfix;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.farhan.mbt.cucumber.Step;
import org.farhan.mbt.generator.CucumberGenerator;
import org.farhan.mbt.validation.CucumberValidator;

/**
 * Custom quickfixes.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
public class CucumberQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(CucumberValidator.MISSING_STEP_DEF)
	public void createDefinition(final Issue issue, IssueResolutionAcceptor acceptor) {

		acceptor.accept(issue, "Create definition", "Create a step definition in the step object", "upcase.png",
				new IModification() {
					public void apply(IModificationContext context) throws BadLocationException {
						Resource resource = new ResourceSetImpl().getResource(issue.getUriToProblem(), true);
						Step step = (Step) resource.getEObject(issue.getUriToProblem().toString().split("#")[1]);
						CucumberGenerator.doGenerate(step);
					}
				});

		for (String issueData : issue.getData()) {
			acceptor.accept(issue, "Rename step object to: " + issueData, "Rename the step object to an existing one",
					"upcase.png", new IModification() {
						public void apply(IModificationContext context) throws BadLocationException {
							Resource resource = new ResourceSetImpl().getResource(issue.getUriToProblem(), true);
							Step step = (Step) resource.getEObject(issue.getUriToProblem().toString().split("#")[1]);
							IXtextDocument xtextDocument = context.getXtextDocument();
							xtextDocument.replace(issue.getOffset(), step.getName().length(), issueData);
						}
					});
		}
	}

	@Fix(CucumberValidator.INVALID_NAME)
	public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize name", "Capitalize the name", "upcase.png", new IModification() {
			public void apply(IModificationContext context) throws BadLocationException {
				IXtextDocument xtextDocument = context.getXtextDocument();
				String firstLetter = xtextDocument.get(issue.getOffset(), 1);
				xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
			}
		});
	}

	@Fix(CucumberValidator.INVALID_HEADER)
	public void capitalizeStepTableName(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize step table name", "Capitalize the step table name.", "upcase.png",
				new IModification() {
					public void apply(IModificationContext context) throws BadLocationException {
						IXtextDocument xtextDocument = context.getXtextDocument();
						String oldHeader = issue.getData()[0];
						String newHeader = oldHeader.substring(0, 1).toUpperCase() + oldHeader.substring(1);
						String oldRow = xtextDocument.get(issue.getOffset(), issue.getLength());
						String newRow = oldRow.replace(oldHeader, newHeader);
						xtextDocument.replace(issue.getOffset(), issue.getLength(), newRow);
					}
				});
	}

}
