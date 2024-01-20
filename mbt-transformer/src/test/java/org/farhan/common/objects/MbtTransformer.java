package org.farhan.common.objects;

import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.mbt.uml.ArgumentFactory;
import org.farhan.mbt.uml.CommentFactory;
import org.farhan.mbt.uml.ElementImportFactory;
import org.farhan.mbt.uml.LifelineFactory;
import org.farhan.mbt.uml.MessageFactory;
import org.farhan.mbt.uml.PackageFactory;
import org.farhan.mbt.uml.ParameterFactory;
import org.farhan.mbt.uml.PropertyFactory;
import org.farhan.mbt.uml.UMLProject;
import org.junit.jupiter.api.Assertions;

public abstract class MbtTransformer extends FileObject {

	public void assertModelExists() {

		assertFileExists();
		// TODO why do I need to read the files when checking if it's present?
		try {
			UMLProject.init();
			UMLProject.readFiles();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

	protected void assertClassExists(String className) {
		Class theClass = (Class) PackageFactory.getPackagedElement(UMLProject.theSystem.getName() + "::" + className,
				UMLProject.theSystem);
		Assertions.assertTrue(theClass != null, "Class " + className + " doesn't exist");

	}

	protected void assertClassCommentValue(String className, String commentBody) {
		Class theClass = (Class) PackageFactory.getPackagedElement(UMLProject.theSystem.getName() + "::" + className,
				UMLProject.theSystem);
		Comment comment = CommentFactory.getComment(theClass, 0);
		Assertions.assertTrue(comment != null, "Class " + className + " Comment " + commentBody + " doesn't exist");
		Assertions.assertEquals(commentBody, comment.getBody());

	}

	protected void assertClassAliasValue(String className, String alias) {
		Class theClass = (Class) PackageFactory.getPackagedElement(UMLProject.theSystem.getName() + "::" + className,
				UMLProject.theSystem);
		ElementImport elementImport = ElementImportFactory.getElementImportByAlias(theClass, alias);
		Assertions.assertTrue(elementImport != null, "Class " + className + " Alias " + alias + " doesn't exist");

	}

	protected void assertClassImportedElementValue(String className, String importedElement) {
		Class theClass = (Class) PackageFactory.getPackagedElement(UMLProject.theSystem.getName() + "::" + className,
				UMLProject.theSystem);
		ElementImport elementImport = ElementImportFactory.getElementImport(theClass, importedElement);
		Assertions.assertTrue(elementImport != null,
				"Class " + className + " Imported Element " + importedElement + " doesn't exist");

	}

	protected void assertClassPropertyNameExists(String className, String propertyName) {
		Class theClass = (Class) PackageFactory.getPackagedElement(UMLProject.theSystem.getName() + "::" + className,
				UMLProject.theSystem);
		Property property = PropertyFactory.getProperty(theClass, propertyName);
		Assertions.assertTrue(property != null,
				"Class " + className + " Property Name " + propertyName + " doesn't exist");

	}

	protected void assertClassPropertyTypeValue(String className, String propertyName, String propertyType) {
		Class theClass = (Class) PackageFactory.getPackagedElement(UMLProject.theSystem.getName() + "::" + className,
				UMLProject.theSystem);
		Property property = PropertyFactory.getProperty(theClass, propertyName);
		Assertions.assertTrue(property != null,
				"Class " + className + " Property Name " + propertyName + " doesn't exist");
		Assertions.assertEquals(propertyType, property.getType().getQualifiedName(),
				"Class " + className + " Property Type " + propertyType + " doesn't match");

	}

	protected void assertInteractionNameExists(String className, String interactionName) {
		Interaction interaction = (Interaction) PackageFactory.getPackagedElement(
				UMLProject.theSystem.getName() + "::" + className + "::" + interactionName, UMLProject.theSystem);
		Assertions.assertTrue(interaction != null,
				"Class " + className + " Interaction " + interactionName + " doesn't exist");

	}

	protected void assertInteractionNameExists(String interactionName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(UMLProject.theSystem.getName() + "::" + interactionName, UMLProject.theSystem);
		Assertions.assertTrue(interaction != null, "Interaction " + interactionName + " doesn't exist");

	}

	protected void assertInteractionParameterNameExists(String interactionName, String parameterName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(UMLProject.theSystem.getName() + "::" + interactionName, UMLProject.theSystem);
		if (parameterName.contentEquals("has none")) {
			Assertions.assertTrue(interaction.getOwnedParameters().isEmpty(),
					"Interaction " + interaction + " has parameters");
		} else {
			Parameter parameter = ParameterFactory.getParameter(interaction, parameterName);
			Assertions.assertTrue(parameter != null,
					"Interaction " + interactionName + " Parameter " + parameterName + " doesn't exist");
		}

	}

	protected void assertInteractionCommentValue(String interactionName, String commentBody) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(UMLProject.theSystem.getName() + "::" + interactionName, UMLProject.theSystem);
		Comment comment = CommentFactory.getComment(interaction, 0);
		Assertions.assertTrue(comment != null,
				"Interaction " + interactionName + " Comment " + commentBody + " doesn't exist");
		Assertions.assertEquals(commentBody, comment.getBody());

	}

	protected void assertInteractionAnnotationNameExists(String interactionName, String annotationName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(UMLProject.theSystem.getName() + "::" + interactionName, UMLProject.theSystem);
		EAnnotation annotation = null;
		for (EAnnotation e : interaction.getEAnnotations()) {
			if (e.getSource().contentEquals(annotationName)) {
				annotation = e;
				break;
			}
		}
		Assertions.assertTrue(annotation != null,
				"Interaction " + interactionName + " Annotation " + annotationName + " doesn't exist");

	}

	protected void assertInteractionAnnotationDetailExists(String interactionName, String annotationName,
			String annotationDetail) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(UMLProject.theSystem.getName() + "::" + interactionName, UMLProject.theSystem);
		EAnnotation annotation = null;
		for (EAnnotation e : interaction.getEAnnotations()) {
			if (e.getSource().contentEquals(annotationName)) {
				annotation = e;
				break;
			}
		}
		Entry<String, String> detail = null;
		for (Entry<String, String> d : annotation.getDetails()) {
			String e = d.getKey() + " -> " + d.getValue();
			if (e.contentEquals(annotationDetail)) {
				detail = d;
				break;
			}
		}
		Assertions.assertTrue(detail != null, "Interaction " + interactionName + " Annotation " + annotationName
				+ " Annotation Detail " + annotationDetail + " doesn't exist");

	}

	protected void assertInteractionLifelineExists(String interactionName, String lifelineName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(UMLProject.theSystem.getName() + "::" + interactionName, UMLProject.theSystem);
		Lifeline lifeline = LifelineFactory.getLifeline(interaction, lifelineName);
		Assertions.assertTrue(lifeline != null,
				"Interaction " + interactionName + " Lifeline " + lifelineName + " doesn't exist");

	}

	protected void assertInteractionLifelineRepresentsValue(String interactionName, String lifelineName,
			String lifelineRepresents) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(UMLProject.theSystem.getName() + "::" + interactionName, UMLProject.theSystem);
		Lifeline lifeline = LifelineFactory.getLifeline(interaction, lifelineName);
		ConnectableElement represents = lifeline.getRepresents();
		Assertions.assertTrue(represents != null, "Interaction " + interactionName + " Lifeline " + lifelineName
				+ " Lifeline Represents " + lifelineName + " doesn't exist");
		Assertions.assertEquals(lifelineRepresents, represents.getQualifiedName());

	}

	protected void assertInteractionLifelineCoveredValue(String interactionName, String messageOccurenceName,
			String lifelineCovered) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(UMLProject.theSystem.getName() + "::" + interactionName, UMLProject.theSystem);
		MessageOccurrenceSpecification messageOccurence = MessageFactory.getMessageOccurence(interaction,
				messageOccurenceName);
		Lifeline covered = messageOccurence.getCovered(lifelineCovered);
		Assertions.assertTrue(covered != null, "Interaction " + interactionName + " Message Occurence "
				+ messageOccurenceName + " Lifeline Covered " + lifelineCovered + " doesn't exist");
		Assertions.assertEquals(lifelineCovered, covered.getName());

	}

	protected void assertInteractionMessageValue(String interactionName, String messageName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(UMLProject.theSystem.getName() + "::" + interactionName, UMLProject.theSystem);
		Message message = MessageFactory.getMessage(interaction, messageName);
		Assertions.assertTrue(message != null,
				"Interaction " + interactionName + " Message " + messageName + " doesn't exist");

	}

	protected void assertInteractionMessageArgumentNameExists(String interactionName, String messageName,
			String argumentName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(UMLProject.theSystem.getName() + "::" + interactionName, UMLProject.theSystem);
		Message message = MessageFactory.getMessage(interaction, messageName);
		ValueSpecification vs = ArgumentFactory.getArgument(message, argumentName, "", false);
		Assertions.assertTrue(vs != null, "Interaction " + interactionName + " Message " + messageName
				+ " Argument Name " + argumentName + " doesn't exist");

	}

	protected void assertInteractionMessageAnnotationNameExists(String interactionName, String messageName,
			String annotationName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(UMLProject.theSystem.getName() + "::" + interactionName, UMLProject.theSystem);
		Message message = MessageFactory.getMessage(interaction, messageName);
		EAnnotation annotation = null;
		for (EAnnotation e : message.getEAnnotations()) {
			if (e.getSource().contentEquals(annotationName)) {
				annotation = e;
				break;
			}
		}
		Assertions.assertTrue(annotation != null, "Interaction " + interactionName + " Message " + messageName
				+ " Annotation " + annotationName + " doesn't exist");

	}

	protected void assertInteractionMessageAnnotationDetailExists(String interactionName, String messageName,
			String argumentName, String annotationDetail) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(UMLProject.theSystem.getName() + "::" + interactionName, UMLProject.theSystem);
		Message message = MessageFactory.getMessage(interaction, messageName);
		ValueSpecification vs = ArgumentFactory.getArgument(message, argumentName, "", false);

		// TODO make an AnnotationFactory
		EAnnotation annotation = null;
		for (EAnnotation e : vs.getEAnnotations()) {
			if (e.getSource().contentEquals(argumentName)) {
				annotation = e;
				break;
			}
		}
		Entry<String, String> detail = null;
		for (Entry<String, String> d : annotation.getDetails()) {
			String e = d.getKey() + " -> " + d.getValue();
			if (e.contentEquals(annotationDetail)) {
				detail = d;
				break;
			}
		}
		Assertions.assertTrue(detail != null, "Interaction " + interactionName + " Message " + messageName
				+ " Argument Name " + argumentName + " Annotation Detail " + annotationDetail + " doesn't exist");

	}

	protected void assertInteractionMessageOccurenceExists(String interactionName, String messageOccurenceName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(UMLProject.theSystem.getName() + "::" + interactionName, UMLProject.theSystem);
		MessageOccurrenceSpecification messageOccurence = MessageFactory.getMessageOccurence(interaction,
				messageOccurenceName);
		Assertions.assertTrue(messageOccurence != null,
				"Interaction " + interactionName + " Message Occurence " + messageOccurenceName + " doesn't exist");

	}

}
