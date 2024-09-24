package org.farhan.mbt.ui.contentassist;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map.Entry;

import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.farhan.mbt.cucumber.And;
import org.farhan.mbt.cucumber.Asterisk;
import org.farhan.mbt.cucumber.But;
import org.farhan.mbt.cucumber.Given;
import org.farhan.mbt.cucumber.Row;
import org.farhan.mbt.cucumber.Step;
import org.farhan.mbt.cucumber.StepTable;
import org.farhan.mbt.cucumber.Then;
import org.farhan.mbt.cucumber.When;
import org.farhan.helper.LanguageAccessImpl;
import org.farhan.helper.Proposal;
import org.farhan.helper.StepDefinitionHelper;

/**
 * See
 * https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
public class CucumberProposalProvider extends AbstractCucumberProposalProvider {

	public void completeGiven_TheStepTable(Given step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeGiven_TheStepTable(step, assignment, context, acceptor);
		completeTheStepTable(step, assignment, context, acceptor);
	}

	public void completeWhen_TheStepTable(When step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeWhen_TheStepTable(step, assignment, context, acceptor);
		completeTheStepTable(step, assignment, context, acceptor);
	}

	public void completeThen_TheStepTable(Then step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeThen_TheStepTable(step, assignment, context, acceptor);
		completeTheStepTable(step, assignment, context, acceptor);
	}

	public void completeAnd_TheStepTable(And step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeAnd_TheStepTable(step, assignment, context, acceptor);
		completeTheStepTable(step, assignment, context, acceptor);
	}

	public void completeBut_TheStepTable(But step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeBut_TheStepTable(step, assignment, context, acceptor);
		completeTheStepTable(step, assignment, context, acceptor);
	}

	public void completeAsterisk_TheStepTable(Asterisk step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeAsterisk_TheStepTable(step, assignment, context, acceptor);
		completeTheStepTable(step, assignment, context, acceptor);
	}

	public void completeStepTable_Rows(StepTable stepTable, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		// TODO automatically create columns to match header
	}

	public void completeRow_Cells(Row row, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		// TODO if it's the first row, suggest a name based on all names used in the
		// step definition parameters for this step definition
	}

	public void completeGiven_Name(Given step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeGiven_Name(step, assignment, context, acceptor);
		completeName(step, assignment, context, acceptor);
	}

	public void completeWhen_Name(When step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeWhen_Name(step, assignment, context, acceptor);
		completeName(step, assignment, context, acceptor);
	}

	public void completeThen_Name(Then step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeThen_Name(step, assignment, context, acceptor);
		completeName(step, assignment, context, acceptor);
	}

	public void completeAnd_Name(And step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeAnd_Name(step, assignment, context, acceptor);
		completeName(step, assignment, context, acceptor);
	}

	public void completeBut_Name(But step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeBut_Name(step, assignment, context, acceptor);
		completeName(step, assignment, context, acceptor);
	}

	public void completeAsterisk_Name(Asterisk step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeAsterisk_Name(step, assignment, context, acceptor);
		completeName(step, assignment, context, acceptor);
	}

	private void completeTheStepTable(Step step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		try {
			for (Entry<String, Proposal> p : StepDefinitionHelper.proposeStepTable(new LanguageAccessImpl(step))
					.entrySet()) {
				ConfigurableCompletionProposal proposal = (ConfigurableCompletionProposal) createCompletionProposal(
						p.getValue().getReplacement(), p.getValue().getDisplay(), null, context);
				if (proposal != null) {
					proposal.setAdditionalProposalInfo(p.getValue().getDocumentation());
					acceptor.accept(proposal);
				}
			}
		} catch (Exception e) {
			logError(e, step.getName());
		}
	}

	private void completeName(Step step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		try {
			// TODO rename propose to proposeStep
			for (Entry<String, Proposal> p : StepDefinitionHelper.propose(new LanguageAccessImpl(step)).entrySet()) {
				ConfigurableCompletionProposal proposal = (ConfigurableCompletionProposal) createCompletionProposal(
						p.getValue().getReplacement(), p.getValue().getDisplay(), null, context);
				if (proposal != null) {
					proposal.setAdditionalProposalInfo(p.getValue().getDocumentation());
					acceptor.accept(proposal);
				}
			}
		} catch (Exception e) {
			logError(e, step.getName());
		}
	}

	private void logError(Exception e, String name) {
		// TODO inject the logger instead
		System.out.println("There was an error listing proposals for: " + name);
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		System.out.println(sw.toString());
	}
}
