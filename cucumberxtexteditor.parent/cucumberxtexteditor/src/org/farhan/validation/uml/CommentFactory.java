package org.farhan.validation.uml;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Interaction;

public class CommentFactory {

	public static void getComment(Class aClass, String comments) {
		Comment aComment = aClass.createOwnedComment();
		aComment.setBody(comments);
	}

	public static Comment getComment(Class theClass, int index) {
		if (theClass.getOwnedComments().size() >= (index + 1)) {
			return theClass.getOwnedComments().get(index);
		} else {
			return null;
		}
	}

	public static Comment getComment(Interaction interaction, int index) {
		return interaction.getOwnedComments().get(index);
	}

}
