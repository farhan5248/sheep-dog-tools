package org.farhan.common.objects;

import java.io.File;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTVertex;
import org.farhan.mbt.uml.UMLProject;
import org.junit.jupiter.api.Assertions;

public abstract class MbtTransformer extends FileObject {

	protected JGraphTProject graphProject;
	protected UMLProject umlProject;

	private MBTEdge getEdgeByString(MBTGraph<MBTVertex, MBTEdge> g, String edgeName) {
		// TODO replace with g.edgeSet().contains(new MBTEdge(edgeName)) when moving
		// graph code here
		MBTEdge edge = null;
		for (MBTEdge e : g.edgeSet()) {
			String eString = g.getEdgeSource(e).getLabel() + " -> " + e.getValue() + " -> "
					+ g.getEdgeTarget(e).getLabel();
			if (edgeName.contentEquals(eString)) {
				edge = e;
				break;
			}
		}
		return edge;
	}

	private MBTEdge getEdgeBySourceVertex(MBTGraph<MBTVertex, MBTEdge> g, String sourceVertex) {
		return (MBTEdge) g.outgoingEdgesOf(g.getVertex(sourceVertex)).toArray()[0];
	}

	protected void assertVerticesVertexNameExists(String vertexName) {
		// TODO temporarily commented out until I can distinguish parent from child
		// graphs
		// Assertions.assertEquals(1,
		// graphProject.getObjects(graphProject.firstLayerName).size());
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.FIRST_LAYER).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = gtf.theGraph;
		Assertions.assertTrue(g.vertexSet().contains(new MBTVertex(vertexName)),
				"Vertex " + vertexName + " doesn't exist");
	}

	protected void assertEdgesEdgeNameExists(String edgeName) {
		// TODO temporarily commented out until I can distinguish parent from child
		// graphs
		// Assertions.assertEquals(1,
		// graphProject.getObjects(graphProject.firstLayerName).size());
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.FIRST_LAYER).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = gtf.theGraph;
		Assertions.assertTrue(getEdgeByString(g, edgeName) != null, "Edge " + edgeName + " doesn't exist");
	}

	protected void assertEdgesGraphEdgeNameExists(String sourceVertex, String graphEdgeName) {
		// TODO temporarily commented out until I can distinguish parent from child
		// graphs
		// Assertions.assertEquals(1,
		// graphProject.getObjects(graphProject.firstLayerName).size());
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.FIRST_LAYER).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = gtf.theGraph;
		MBTEdge edge = getEdgeBySourceVertex(g, sourceVertex);
		Assertions.assertTrue(edge != null, "Edge " + sourceVertex + " doesn't exist");
		MBTGraph<MBTVertex, MBTEdge> g1 = (MBTGraph<MBTVertex, MBTEdge>) edge.getValue();
		Assertions.assertTrue(getEdgeByString(g1, graphEdgeName) != null,
				"Graph Edge " + graphEdgeName + " doesn't exist");
	}

	protected void assertEdgesGraphVertexNameExists(String sourceVertex, String graphVertexName) {
		// TODO temporarily commented out until I can distinguish parent from child
		// graphs
		// Assertions.assertEquals(1,
		// graphProject.getObjects(graphProject.firstLayerName).size());
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.FIRST_LAYER).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = gtf.theGraph;
		MBTEdge edge = getEdgeBySourceVertex(g, sourceVertex);
		Assertions.assertTrue(edge != null, "Edge " + sourceVertex + " doesn't exist");
		MBTGraph<MBTVertex, MBTEdge> g1 = (MBTGraph<MBTVertex, MBTEdge>) edge.getValue();
		Assertions.assertTrue(g1.vertexSet().contains(new MBTVertex(graphVertexName)),
				"Vertex " + graphVertexName + " doesn't exist");
	}

	protected void assertGraphModelExists() {
		// TODO this is a temp hack until I review the test code and find a way to
		// refresh the list of objects, my brain is fried for now
		assertFileExists();
		File f = new File(ConvertibleProject.baseDir + keyValue.get("path"));
		try {
			graphProject = new JGraphTProject();
			graphProject.createObject(f.getAbsolutePath()).load();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

	public void assertModelExists() {

		assertFileExists();
		// TODO After theSystem has a getter, remove this because that getter should
		// initialise theSystem by reading the model
		try {
			umlProject = new UMLProject();
			umlProject.load();
			umlProject.loadObjects(umlProject.FIRST_LAYER);
			umlProject.loadObjects(umlProject.SECOND_LAYER);
			umlProject.loadObjects(umlProject.THIRD_LAYER);
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

	protected void assertClassExists(String className) {
		Class theClass = (Class) umlProject.getPackagedElement(umlProject.theSystem.getName() + "::" + className,
				umlProject.theSystem);
		Assertions.assertTrue(theClass != null, "Class " + className + " doesn't exist");

	}

	protected void assertClassCommentValue(String className, String commentBody) {
		Class theClass = (Class) umlProject.getPackagedElement(umlProject.theSystem.getName() + "::" + className,
				umlProject.theSystem);
		Comment comment = theClass.getOwnedComments().get(0);
		Assertions.assertTrue(comment != null, "Class " + className + " Comment " + commentBody + " doesn't exist");
		Assertions.assertEquals(commentBody, comment.getBody());

	}

	protected void assertClassImportedElementValue(String className, String importedElement) {
		Class theClass = (Class) umlProject.getPackagedElement(umlProject.theSystem.getName() + "::" + className,
				umlProject.theSystem);
		Class importedClass = (Class) umlProject.getPackagedElement(importedElement, umlProject.theSystem);
		ElementImport elementImport = null;
		for (ElementImport ei : theClass.getElementImports()) {
			if (ei.getImportedElement().getQualifiedName().contentEquals(importedClass.getQualifiedName())) {
				elementImport = ei;
				break;
			}
		}
		Assertions.assertTrue(elementImport != null,
				"Class " + className + " Imported Element " + importedElement + " doesn't exist");

	}

	protected void assertClassPropertyNameExists(String className, String propertyName) {
		Class theClass = (Class) umlProject.getPackagedElement(umlProject.theSystem.getName() + "::" + className,
				umlProject.theSystem);
		Property property = getProperty(theClass, propertyName);
		Assertions.assertTrue(property != null,
				"Class " + className + " Property Name " + propertyName + " doesn't exist");
	}

	protected void assertClassPropertyTypeValue(String className, String propertyName, String propertyType) {
		Class theClass = (Class) umlProject.getPackagedElement(umlProject.theSystem.getName() + "::" + className,
				umlProject.theSystem);
		Property property = getProperty(theClass, propertyName);
		Assertions.assertTrue(property != null,
				"Class " + className + " Property Name " + propertyName + " doesn't exist");
		Assertions.assertEquals(propertyType, property.getType().getQualifiedName(),
				"Class " + className + " Property Type " + propertyType + " doesn't match");
	}

	protected void assertInteractionNameExists(String className, String interactionName) {
		Interaction interaction = (Interaction) umlProject.getPackagedElement(
				umlProject.theSystem.getName() + "::" + className + "::" + interactionName, umlProject.theSystem);
		Assertions.assertTrue(interaction != null,
				"Class " + className + " Interaction " + interactionName + " doesn't exist");
	}

	private Property getProperty(Class theClass, String name) {
		for (Property p : theClass.getOwnedAttributes()) {
			if (p.getName().contentEquals(name)) {
				return p;
			}
		}
		return null;
	}

	protected void assertInteractionNameExists(String interactionName) {
		Interaction interaction = (Interaction) umlProject
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		Assertions.assertTrue(interaction != null, "Interaction " + interactionName + " doesn't exist");

	}

	protected void assertInteractionParameterNameExists(String interactionName, String parameterName) {
		Interaction interaction = (Interaction) umlProject
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		if (parameterName.contentEquals("has none")) {
			Assertions.assertTrue(interaction.getOwnedParameters().isEmpty(),
					"Interaction " + interaction + " has parameters");
		} else {
			Parameter parameter = interaction.getOwnedParameter(parameterName, null);
			Assertions.assertTrue(parameter != null,
					"Interaction " + interactionName + " Parameter " + parameterName + " doesn't exist");
		}
	}

	protected void assertInteractionCommentValue(String interactionName, String commentBody) {
		Interaction interaction = (Interaction) umlProject
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		Comment comment = interaction.getOwnedComments().get(0);
		Assertions.assertTrue(comment != null,
				"Interaction " + interactionName + " Comment " + commentBody + " doesn't exist");
		Assertions.assertEquals(commentBody, comment.getBody());

	}

	protected void assertInteractionAnnotationNameExists(String interactionName, String annotationName) {
		Interaction interaction = (Interaction) umlProject
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
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
		Interaction interaction = (Interaction) umlProject
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
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
		Interaction interaction = (Interaction) umlProject
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		Lifeline lifeline = interaction.getLifeline(lifelineName);
		Assertions.assertTrue(lifeline != null,
				"Interaction " + interactionName + " Lifeline " + lifelineName + " doesn't exist");

	}

	protected void assertInteractionLifelineRepresentsValue(String interactionName, String lifelineName,
			String lifelineRepresents) {
		Interaction interaction = (Interaction) umlProject
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		Lifeline lifeline = interaction.getLifeline(lifelineName);
		ConnectableElement represents = lifeline.getRepresents();
		Assertions.assertTrue(represents != null, "Interaction " + interactionName + " Lifeline " + lifelineName
				+ " Lifeline Represents " + lifelineName + " doesn't exist");
		Assertions.assertEquals(lifelineRepresents, represents.getQualifiedName());

	}

	protected void assertInteractionLifelineCoveredValue(String interactionName, String messageOccurenceName,
			String lifelineCovered) {
		Interaction interaction = (Interaction) umlProject
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		MessageOccurrenceSpecification messageOccurence = getMessageOccurence(interaction, messageOccurenceName);
		Lifeline covered = messageOccurence.getCovered(lifelineCovered);
		Assertions.assertTrue(covered != null, "Interaction " + interactionName + " Message Occurence "
				+ messageOccurenceName + " Lifeline Covered " + lifelineCovered + " doesn't exist");
		Assertions.assertEquals(lifelineCovered, covered.getName());

	}

	protected void assertInteractionMessageValue(String interactionName, String messageName) {
		Interaction interaction = (Interaction) umlProject
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		Message message = getMessage(interaction, messageName);
		Assertions.assertTrue(message != null,
				"Interaction " + interactionName + " Message " + messageName + " doesn't exist");

	}

	protected void assertInteractionMessageArgumentNameExists(String interactionName, String messageName,
			String argumentName) {
		Interaction interaction = (Interaction) umlProject
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		Message message = getMessage(interaction, messageName);
		ValueSpecification vs = (LiteralString) message.getArgument(argumentName, null);
		Assertions.assertTrue(vs != null, "Interaction " + interactionName + " Message " + messageName
				+ " Argument Name " + argumentName + " doesn't exist");

	}

	protected void assertInteractionMessageAnnotationNameExists(String interactionName, String messageName,
			String annotationName) {
		Interaction interaction = (Interaction) umlProject
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		Message message = getMessage(interaction, messageName);
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
		Interaction interaction = (Interaction) umlProject
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		Message message = getMessage(interaction, messageName);
		ValueSpecification vs = (LiteralString) message.getArgument(argumentName, null);

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
		Interaction interaction = (Interaction) umlProject
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		MessageOccurrenceSpecification messageOccurence = getMessageOccurence(interaction, messageOccurenceName);
		Assertions.assertTrue(messageOccurence != null,
				"Interaction " + interactionName + " Message Occurence " + messageOccurenceName + " doesn't exist");

	}

	protected Message getMessage(Interaction interaction, String name) {
		for (NamedElement ne : interaction.getOwnedMembers()) {
			if (ne.getName().contentEquals(name)) {
				return (Message) ne;
			}
		}
		return null;
	}

	protected MessageOccurrenceSpecification getMessageOccurence(Interaction interaction, String name) {
		for (NamedElement ne : interaction.getOwnedMembers()) {
			if (ne.getName().contentEquals(name)) {
				return (MessageOccurrenceSpecification) ne;
			}
		}
		return null;
	}

}
