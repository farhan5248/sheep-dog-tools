package org.farhan.conv.core;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.uml2.uml.Interaction;
import org.farhan.conv.validation.FinalStepValidator;
import org.farhan.conv.validation.InitialStepValidator;
import org.farhan.conv.validation.Layer1Validator;
import org.farhan.conv.validation.OutputStepValidator;

public abstract class FirstLayerConverter extends LayerConverter {

	private class StateMachine {
		String machineName;
		String currentState;

	}

	void setMachineName(String machineName) {
		theMachine.machineName = Utilities.toUpperCamelCase(machineName);
	}

	protected void setCurrentState(String currentState) {
		theMachine.currentState = Utilities.toUpperCamelCase(currentState);
		if (theMachine.currentState.endsWith("Request")) {
			theMachine.currentState = theMachine.currentState.replace("Request", "Service");
		}
	}

	public String getMachineName() {
		return theMachine.machineName;
	}

	public String getCurrentState() {
		return theMachine.currentState;
	}

	private StateMachine theMachine;

	public FirstLayerConverter() {
		super();
		theMachine = new StateMachine();
	}

	@Override
	final protected ArrayList<File> selectLayerFiles(String layer) throws Exception {
		// TODO why do I need the layer name again?
		Project.firstLayerFiles = Utilities.recursivelyListFiles(getLayerDir(), getLayerFileType());
		for (int i = Project.firstLayerFiles.size() - 1; i >= 0; i--) {
			if (!isFileSelected(Project.firstLayerFiles.get(i))) {
				Project.firstLayerFiles.remove(i);
			}
		}
		return Project.firstLayerFiles;
	}

	protected abstract boolean isFileSelected(File theFile) throws Exception;

	protected void resetCurrentApplicationObject() {
		setMachineName("UnknownApplication");
		setCurrentState("Home Page");
	}

	protected void setCurrentMachineAndState(String messageName) {
		String appType = "";
		String appName = getMachineName();
		String objectName = getCurrentState();

		if (Layer1Validator.isInputStart(messageName)) {
		} else if (Layer1Validator.isOutputStart(messageName)) {
			objectName = Utilities.regexFind(OutputStepValidator.getRegex(), messageName, 4);
			if (objectName == null) {
				objectName = Utilities.regexFind(OutputStepValidator.getRegex(), messageName, 9);
			}
			if (objectName != null) {
				setCurrentState(objectName.trim());
			}
		} else if (Layer1Validator.isTransitionStart(messageName)) {
			objectName = Layer1Validator.getStepObjectName(messageName) + " "
					+ Layer1Validator.getStepObjectType(messageName);
			setCurrentState(objectName);
		} else if (Layer1Validator.isInitialStart(messageName) || Layer1Validator.isFinalStart(messageName)) {
			if (Layer1Validator.isFinalStart(messageName)) {
				appType = Utilities.regexFind(FinalStepValidator.getRegex(), messageName, 3).trim();
				appName = Utilities.regexFind(FinalStepValidator.getRegex(), messageName, 2).trim();
			} else {
				appType = Utilities.regexFind(InitialStepValidator.getRegex(), messageName, 3).trim();
				appName = Utilities.regexFind(InitialStepValidator.getRegex(), messageName, 2).trim();
			}
			setMachineName(appName);
			if (appType.contentEquals("application")) {
				setCurrentState("Home Page");
			} else if (appType.contentEquals("service")) {
				setCurrentState("Authenticated State");
			} else {
				setCurrentState("Home Directory");
			}
		}

	}

	protected void mergeComment(Interaction anInteraction, int index, String newComment) {

		if (anInteraction.getOwnedComments().size() >= index) {
			String oldComment = anInteraction.getOwnedComments().get(index).getBody();
			anInteraction.getOwnedComments().get(index).unsetBody();
			anInteraction.getOwnedComments().get(index).setBody(oldComment + "\n\n" + newComment);
		}
	}

	protected String[] getMessageParameters(String messageName) {
		String[] splitTestStepName = messageName.split("where", 2);
		String[] csvlistArray = {};
		if (splitTestStepName.length > 1) {
			csvlistArray = splitTestStepName[1].split(",");
			// This is to handle multiple variable names like two ${p}
			for (int i = 0; i < csvlistArray.length; i++) {
				// TODO this delimiter might break for the use of the word is between double
				// quotes
				String attributeName = csvlistArray[i].trim().split(" is ")[0];
				String valueName = csvlistArray[i].trim().split(" is ")[1];
				csvlistArray[i] = attributeName + " is " + valueName;
			}
			return csvlistArray;
		} else {
			return csvlistArray;
		}
	}

}
