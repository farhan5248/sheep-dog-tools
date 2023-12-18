package org.farhan.objects.common;

import java.io.File;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Parameter;
import org.farhan.conv.core.Project;
import org.farhan.mbt.conv.uml.CommentFactory;
import org.farhan.mbt.conv.uml.PackageFactory;
import org.farhan.mbt.conv.uml.ParameterFactory;
import org.farhan.mbt.conv.uml.InteractionFactory;
import org.farhan.mbt.conv.uml.UMLProject;
import org.junit.jupiter.api.Assertions;

public abstract class UMLFile extends FileObject {

	protected Model theSystem;

	public void assertExists() {

		super.assertExists();
		try {
			theSystem = UMLProject.initProject(keyValue.get("model"));
			theSystem = UMLProject.importUMLFiles(theSystem, new File(Project.baseDir + Project.umlDir));
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

	protected void assertClassExists(String className) {
		Class theClass = (Class) PackageFactory.getPackagedElement(keyValue.get("model") + "::" + className, theSystem);
		Assertions.assertTrue(theClass != null, "Class " + className + " doesn't exist");
	}

	protected void assertClassCommentValue(String className, String commentBody) {
		Class theClass = (Class) PackageFactory.getPackagedElement(keyValue.get("model") + "::" + className, theSystem);
		Comment comment = CommentFactory.getComment(theClass, 0);
		Assertions.assertTrue(comment != null, "Comment " + commentBody + " doesn't exist");
		Assertions.assertEquals(commentBody, comment.getBody());
	}

	protected void assertInteractionNameExists(String className, String interactionName) {
		Class theClass = (Class) PackageFactory.getPackagedElement(keyValue.get("model") + "::" + className, theSystem);
		Interaction interaction = InteractionFactory.getInteraction(theClass, interactionName, false);
		Assertions.assertTrue(interaction != null, "Interaction " + interactionName + " doesn't exist");
	}

	protected void assertInteractionNameExists(String interactionName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		Assertions.assertTrue(interaction != null, "Interaction " + interactionName + " doesn't exist");
	}

	protected void assertInteractionParameterNameValue(String interactionName, String parameterName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		Parameter parameter = ParameterFactory.getParameter(interaction, parameterName);
		Assertions.assertTrue(parameter != null, "Parameter " + parameterName + " doesn't exist");
	}

	protected void assertInteractionCommentValue(String interactionName, String commentBody) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		Comment comment = CommentFactory.getComment(interaction, 0);
		Assertions.assertTrue(comment != null, "Comment " + commentBody + " doesn't exist");
		Assertions.assertEquals(commentBody, comment.getBody());
	}
}
