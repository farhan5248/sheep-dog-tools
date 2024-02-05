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
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTVertex;
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

	protected JGraphTProject graphProject;
	protected UMLProject umlProject;

	public MbtTransformer() {
		graphProject = new JGraphTProject();
		umlProject = new UMLProject();
	}

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
		// TODO temporarily commented out until I can distinguish parent from child graphs
		//Assertions.assertEquals(1, graphProject.getObjects(graphProject.firstLayerName).size());
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.firstLayerName).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = gtf.theGraph;
		Assertions.assertTrue(g.vertexSet().contains(new MBTVertex(vertexName)),
				"Vertex " + vertexName + " doesn't exist");
	}

	protected void assertEdgesEdgeNameExists(String edgeName) {
		// TODO temporarily commented out until I can distinguish parent from child graphs
		//Assertions.assertEquals(1, graphProject.getObjects(graphProject.firstLayerName).size());
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.firstLayerName).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = gtf.theGraph;
		Assertions.assertTrue(getEdgeByString(g, edgeName) != null, "Edge " + edgeName + " doesn't exist");
	}

	protected void assertEdgesGraphEdgeNameExists(String sourceVertex, String graphEdgeName) {
		// TODO temporarily commented out until I can distinguish parent from child graphs
		//Assertions.assertEquals(1, graphProject.getObjects(graphProject.firstLayerName).size());
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.firstLayerName).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = gtf.theGraph;
		MBTEdge edge = getEdgeBySourceVertex(g, sourceVertex);
		Assertions.assertTrue(edge != null, "Edge " + sourceVertex + " doesn't exist");
		MBTGraph<MBTVertex, MBTEdge> g1 = (MBTGraph<MBTVertex, MBTEdge>) edge.getValue();
		Assertions.assertTrue(getEdgeByString(g1, graphEdgeName) != null,
				"Graph Edge " + graphEdgeName + " doesn't exist");
	}

	protected void assertEdgesGraphVertexNameExists(String sourceVertex, String graphVertexName) {
		// TODO temporarily commented out until I can distinguish parent from child graphs
		//Assertions.assertEquals(1, graphProject.getObjects(graphProject.firstLayerName).size());
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.firstLayerName).getFirst();
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
		try {
			graphProject.load();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

	public void assertModelExists() {

		assertFileExists();
		// TODO After theSystem has a getter, remove this because that getter should
		// initialise theSystem by reading the model
		try {
			umlProject.load();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

	protected void assertClassExists(String className) {
		Class theClass = (Class) PackageFactory.getPackagedElement(umlProject.theSystem.getName() + "::" + className,
				umlProject.theSystem);
		Assertions.assertTrue(theClass != null, "Class " + className + " doesn't exist");

	}

	protected void assertClassCommentValue(String className, String commentBody) {
		Class theClass = (Class) PackageFactory.getPackagedElement(umlProject.theSystem.getName() + "::" + className,
				umlProject.theSystem);
		Comment comment = CommentFactory.getComment(theClass, 0);
		Assertions.assertTrue(comment != null, "Class " + className + " Comment " + commentBody + " doesn't exist");
		Assertions.assertEquals(commentBody, comment.getBody());

	}

	protected void assertClassAliasValue(String className, String alias) {
		Class theClass = (Class) PackageFactory.getPackagedElement(umlProject.theSystem.getName() + "::" + className,
				umlProject.theSystem);
		ElementImport elementImport = ElementImportFactory.getElementImportByAlias(theClass, alias);
		Assertions.assertTrue(elementImport != null, "Class " + className + " Alias " + alias + " doesn't exist");

	}

	protected void assertClassImportedElementValue(String className, String importedElement) {
		Class theClass = (Class) PackageFactory.getPackagedElement(umlProject.theSystem.getName() + "::" + className,
				umlProject.theSystem);
		ElementImport elementImport = ElementImportFactory.getElementImport(theClass, importedElement);
		Assertions.assertTrue(elementImport != null,
				"Class " + className + " Imported Element " + importedElement + " doesn't exist");

	}

	protected void assertClassPropertyNameExists(String className, String propertyName) {
		Class theClass = (Class) PackageFactory.getPackagedElement(umlProject.theSystem.getName() + "::" + className,
				umlProject.theSystem);
		Property property = PropertyFactory.getProperty(theClass, propertyName);
		Assertions.assertTrue(property != null,
				"Class " + className + " Property Name " + propertyName + " doesn't exist");

	}

	protected void assertClassPropertyTypeValue(String className, String propertyName, String propertyType) {
		Class theClass = (Class) PackageFactory.getPackagedElement(umlProject.theSystem.getName() + "::" + className,
				umlProject.theSystem);
		Property property = PropertyFactory.getProperty(theClass, propertyName);
		Assertions.assertTrue(property != null,
				"Class " + className + " Property Name " + propertyName + " doesn't exist");
		Assertions.assertEquals(propertyType, property.getType().getQualifiedName(),
				"Class " + className + " Property Type " + propertyType + " doesn't match");

	}

	protected void assertInteractionNameExists(String className, String interactionName) {
		Interaction interaction = (Interaction) PackageFactory.getPackagedElement(
				umlProject.theSystem.getName() + "::" + className + "::" + interactionName, umlProject.theSystem);
		Assertions.assertTrue(interaction != null,
				"Class " + className + " Interaction " + interactionName + " doesn't exist");

	}

	protected void assertInteractionNameExists(String interactionName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		Assertions.assertTrue(interaction != null, "Interaction " + interactionName + " doesn't exist");

	}

	protected void assertInteractionParameterNameExists(String interactionName, String parameterName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
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
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		Comment comment = CommentFactory.getComment(interaction, 0);
		Assertions.assertTrue(comment != null,
				"Interaction " + interactionName + " Comment " + commentBody + " doesn't exist");
		Assertions.assertEquals(commentBody, comment.getBody());

	}

	protected void assertInteractionAnnotationNameExists(String interactionName, String annotationName) {
		Interaction interaction = (Interaction) PackageFactory
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
		Interaction interaction = (Interaction) PackageFactory
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
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		Lifeline lifeline = LifelineFactory.getLifeline(interaction, lifelineName);
		Assertions.assertTrue(lifeline != null,
				"Interaction " + interactionName + " Lifeline " + lifelineName + " doesn't exist");

	}

	protected void assertInteractionLifelineRepresentsValue(String interactionName, String lifelineName,
			String lifelineRepresents) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		Lifeline lifeline = LifelineFactory.getLifeline(interaction, lifelineName);
		ConnectableElement represents = lifeline.getRepresents();
		Assertions.assertTrue(represents != null, "Interaction " + interactionName + " Lifeline " + lifelineName
				+ " Lifeline Represents " + lifelineName + " doesn't exist");
		Assertions.assertEquals(lifelineRepresents, represents.getQualifiedName());

	}

	protected void assertInteractionLifelineCoveredValue(String interactionName, String messageOccurenceName,
			String lifelineCovered) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		MessageOccurrenceSpecification messageOccurence = MessageFactory.getMessageOccurence(interaction,
				messageOccurenceName);
		Lifeline covered = messageOccurence.getCovered(lifelineCovered);
		Assertions.assertTrue(covered != null, "Interaction " + interactionName + " Message Occurence "
				+ messageOccurenceName + " Lifeline Covered " + lifelineCovered + " doesn't exist");
		Assertions.assertEquals(lifelineCovered, covered.getName());

	}

	protected void assertInteractionMessageValue(String interactionName, String messageName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		Message message = MessageFactory.getMessage(interaction, messageName);
		Assertions.assertTrue(message != null,
				"Interaction " + interactionName + " Message " + messageName + " doesn't exist");

	}

	protected void assertInteractionMessageArgumentNameExists(String interactionName, String messageName,
			String argumentName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		Message message = MessageFactory.getMessage(interaction, messageName);
		ValueSpecification vs = ArgumentFactory.getArgument(message, argumentName, "", false);
		Assertions.assertTrue(vs != null, "Interaction " + interactionName + " Message " + messageName
				+ " Argument Name " + argumentName + " doesn't exist");

	}

	protected void assertInteractionMessageAnnotationNameExists(String interactionName, String messageName,
			String annotationName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
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
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
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
				.getPackagedElement(umlProject.theSystem.getName() + "::" + interactionName, umlProject.theSystem);
		MessageOccurrenceSpecification messageOccurence = MessageFactory.getMessageOccurence(interaction,
				messageOccurenceName);
		Assertions.assertTrue(messageOccurence != null,
				"Interaction " + interactionName + " Message Occurence " + messageOccurenceName + " doesn't exist");

	}

}
