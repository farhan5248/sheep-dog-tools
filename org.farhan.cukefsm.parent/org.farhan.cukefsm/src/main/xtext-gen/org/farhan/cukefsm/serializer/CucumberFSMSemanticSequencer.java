/*
 * generated by Xtext 2.32.0
 */
package org.farhan.cukefsm.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.farhan.cukefsm.cucumberFSM.CucumberFSMPackage;
import org.farhan.cukefsm.cucumberFSM.Greeting;
import org.farhan.cukefsm.cucumberFSM.Model;
import org.farhan.cukefsm.services.CucumberFSMGrammarAccess;

@SuppressWarnings("all")
public class CucumberFSMSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CucumberFSMGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CucumberFSMPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CucumberFSMPackage.GREETING:
				sequence_Greeting(context, (Greeting) semanticObject); 
				return; 
			case CucumberFSMPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Greeting returns Greeting
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Greeting(ISerializationContext context, Greeting semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CucumberFSMPackage.Literals.GREETING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CucumberFSMPackage.Literals.GREETING__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     greetings+=Greeting+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}