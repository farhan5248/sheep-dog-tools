package org.farhan.mbt.cucumberuml;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToUMLConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.CucumberJavaWrapper;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.stmt.Statement;

public class JavaToUMLConverter extends ToUMLConverter {

	private UMLClassWrapper ucw;
	private CucumberProject source;

	public JavaToUMLConverter(String layer, CucumberProject source, UMLProject target) {
		this.layer = layer;
		this.source = source;
		this.target = target;
	}

	@Override
	protected String getLayer() {
		return layer;
	}

	@Override
	protected void convertObjects() throws Exception {
		super.convertObjects();
		if (source.SECOND_LAYER.contentEquals(getLayer())) {
			linkLayerFiles(getLayer());
		}
	}

	@Override
	final protected void selectObjects() throws Exception {
		ArrayList<ConvertibleObject> prevLayerClasses = null;
		if (source.SECOND_LAYER.contentEquals(getLayer())) {
			prevLayerClasses = target.getObjects(source.FIRST_LAYER);
		} else if (source.THIRD_LAYER.contentEquals(layer)) {
			prevLayerClasses = target.getObjects(source.SECOND_LAYER);
		}
		// Instead of reading a file twice, make a short list to save time reading each
		// file
		HashMap<String, Class> layerClassShortList = new HashMap<String, Class>();
		for (ConvertibleObject co : prevLayerClasses) {
			UMLClassWrapper c = (UMLClassWrapper) co;
			for (ElementImport ei : c.theClass.getElementImports()) {
				Class importedClass = (Class) ei.getImportedElement();
				layerClassShortList.put(importedClass.getQualifiedName(), importedClass);
			}
		}
		ArrayList<File> files = Utilities.recursivelyListFiles(source.getDir(layer), source.getFileExt(layer));
		for (File f : files) {
			source.createObject(f.getAbsolutePath()).load();
			if (!isFileSelected(source.getObjects(layer).getLast(), layerClassShortList)) {
				source.getObjects(layer).removeLast();
			}
		}
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return source.getObjects(layer);
	}

	private boolean isFileSelected(ConvertibleObject convertibleFile, HashMap<String, Class> layerClassShortList) {
		CucumberJavaWrapper cjf = (CucumberJavaWrapper) convertibleFile;
		String qualifiedName = convertObjectName(cjf.getFile().getAbsolutePath());
		return layerClassShortList.containsKey(qualifiedName);
	}

	@Override
	protected void convertObject(ConvertibleObject layerFile) throws Exception {
		CucumberJavaWrapper jcw = (CucumberJavaWrapper) layerFile;
		String qualifiedName = convertObjectName(jcw.getFile().getAbsolutePath());
		ucw = (UMLClassWrapper) target.createObject(qualifiedName);
	}

	@Override
	protected void convertImports(ConvertibleObject layerFile) throws Exception {
		CucumberJavaWrapper jcw = (CucumberJavaWrapper) layerFile;
		if (jcw.javaClass.getTypes().size() > 0) {
			// Wrap this in CommentFactory.getComment. getComment should do nothing if the
			// content is empty
			Optional<Comment> comment = jcw.javaClass.getType(0).getComment();
			if (comment.isPresent()) {
				ucw.theClass.createOwnedComment().setBody(comment.get().getContent());
			}
			for (ImportDeclaration i : jcw.javaClass.getImports()) {
				i.getNameAsString();
				if (!i.getNameAsString().endsWith("Factory")) {
					// Don't include the factory import because it's a detail of dependency
					// injection is implemented
					String importedClassName = convertImportNameToQualifiedName(i.getNameAsString());
					UMLClassWrapper ucwi = (UMLClassWrapper) target.createObject(importedClassName);
					createElementImport(ucw.theClass, ucwi.theClass);
				}
			}
		}
	}

	@Override
	protected void convertBehaviours(ConvertibleObject layerFile) throws Exception {
		CucumberJavaWrapper jcw = (CucumberJavaWrapper) layerFile;
		for (MethodDeclaration md : jcw.javaClass.getType(0).getMethods()) {
			// TODO determine if this interaction is empty
			Interaction anInteraction = getInteraction(ucw.theClass, md.getNameAsString(), true);

			// Wrap this in CommentFactory.getComment. getComment should do nothing if the
			// content is empty
			String body;
			if (md.getJavadocComment().isPresent()) {
				body = md.getJavadocComment().get().getContent().replace(" * ", "");
			} else {
				body = "";
			}
			// TODO this should replace the existing comment, not add more
			anInteraction.createOwnedComment().setBody(body);
			if (md.getAnnotations().size() > 0) {
				createAnnotation(anInteraction, md.getAnnotation(0).toString());
			}
			for (Parameter p : md.getParameters()) {
				// TODO this should probably empty out the parameters if any exist
				getParameter(anInteraction, p.getNameAsString(), "", "in");
			}
			convertInteractionMessages(anInteraction, md.getBody().get().getStatements());
		}
	}

	@Override
	protected void convertInteractionMessages(Interaction anInteraction, List<?> steps) throws Exception {
		// TODO if there's already a body, don't add the java code to it, just do
		// nothing
		for (Object o : steps) {
			Statement s = (Statement) o;
			if (s.getChildNodes().get(0) instanceof MethodCallExpr) {
				MethodCallExpr mce = (MethodCallExpr) s.getChildNodes().get(0);
				convertMessage(anInteraction, mce);
			}
		}
	}

	// TODO this is a duplicate method from UMLToCucumberOtherLayerConverter.
	private boolean isSecondLayer(Class layerClass) {
		if (layerClass.getQualifiedName().contains("::" + source.SECOND_LAYER + "::")) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	protected void convertMessage(Interaction anInteraction, Object o) {
		MethodCallExpr mce = (MethodCallExpr) o;
		Class owningClass = (Class) anInteraction.getOwner();
		// TODO change this, don't store how the DI is achieved in the UML model
		// TODO When creating the ElementImport, for now I'm assuming the class is
		// directly under the app package name and not anywhere else. In the future make
		// the search smarter and look through all the classes in the package. That will
		// also assume that the class name is unique
		if (isSecondLayer(owningClass)) {
			String qualifiedName = getObjectQualifiedNameFromFactory(mce);
			UMLClassWrapper ucw = (UMLClassWrapper) target.createObject(qualifiedName);
			Class nextLayerClass = ucw.theClass;
			createElementImport(owningClass, nextLayerClass);
			owningClass.createOwnedAttribute(nextLayerClass.getName(), nextLayerClass);
			Message theMessage = getMessage(anInteraction, nextLayerClass, mce.getName().asString());
			mce.getArguments();
			for (Expression e : mce.getArguments()) {
				String arg = "";
				if (e instanceof NameExpr) {
					arg = e.asNameExpr().getNameAsString();
				} else if (e instanceof StringLiteralExpr) {
					arg = "\"" + e.asStringLiteralExpr().asString().replace("\"", "\\\"") + "\"";
				} else if (e instanceof BinaryExpr) {
					arg = e.asBinaryExpr().toString();
				} else if (e instanceof ObjectCreationExpr) {
					arg = e.asObjectCreationExpr().toString();
				} else if (e instanceof MethodCallExpr) {
					arg = e.asMethodCallExpr().toString();
				} else {
					// TODO throw an exception to find new expressions
					arg = e.asNameExpr().getNameAsString();
				}
				// when reading java source, the name of the arguments isn't known so I use the
				// value as the name
				createArgument(theMessage, arg, arg, true);
			}
		} else {
			// TODO handle layer 3 java code
		}
	}

	private String getObjectQualifiedNameFromFactory(MethodCallExpr mce) {
		// Get the app name from the factory class
		String appName = mce.getChildNodes().getFirst().getChildNodes().getFirst().toString().replace("Factory", "")
				.toLowerCase();
		// get the object name from the argument of the factory class
		String objectName = mce.getChildNodes().getFirst().getChildNodes().getLast().toString().replace("\"", "");
		// make the qualified name
		String qualifiedName = target.theSystem.getName() + "::" + target.THIRD_LAYER + "::" + appName + "::"
				+ objectName;
		return qualifiedName;
	}

	@Override
	protected String convertObjectName(String fullName) {
		String qualifiedName = fullName.trim();
		qualifiedName = qualifiedName.replace(".java", "");
		qualifiedName = qualifiedName.replace(source.getDir(source.SECOND_LAYER).getAbsolutePath(),
				source.SECOND_LAYER);
		qualifiedName = qualifiedName.replace(source.getDir(source.THIRD_LAYER).getAbsolutePath(), source.THIRD_LAYER);
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::" + qualifiedName;
		return qualifiedName;
	}

	protected String convertImportNameToQualifiedName(String importName) {
		// TODO preserve org.farhan
		String qualifiedName = importName.replace(".", "::");
		if (qualifiedName.startsWith("org::farhan::")) {
			return qualifiedName.replace("org::farhan::", "pst::");
		} else {
			return "pst::" + qualifiedName;
		}
	}

	@Override
	protected void addNextLayerInteractionMessages(Interaction targetInteraction, Message m) {
	}

	@Override
	protected String getNextLayerClassQualifiedName(Interaction targetInteraction) {

		Class interactionOwner = (Class) targetInteraction.getOwner();
		return interactionOwner.getQualifiedName().replace(target.SECOND_LAYER, target.THIRD_LAYER).replace("Steps",
				"");
	}

	@Override
	protected ArrayList<String> getNextLayerInteractionNamesfromMessage(Message m) {
		ArrayList<String> newTitles = new ArrayList<String>();
		if (m.getName().startsWith("set") || m.getName().startsWith("assert")) {
			if (m.getName().endsWith("Attributes")) {
				String prefix = m.getName().replace("Attributes", "");

				ValueSpecification vs;
				vs = createArgument(m, "section", "", false);
				String sectionName = "";
				if (vs != null) {
					sectionName = ((LiteralString) vs).getValue();
				}
				vs = createArgument(m, "keyMap", "", false);
				if (vs != null) {
					// it's a data table
					String[] attributes = vs.getEAnnotation("keyMap").getDetails().getFirst().getValue().split("\\|");
					for (String a : attributes) {
						// TODO validate data table headers to always start with a capital letter
						newTitles.add(getMethodName(prefix + sectionName + a, true));
					}
				} else {
					// it's a doc string
					newTitles.add(getMethodName(prefix + sectionName + "Content", true));
				}
			} else {
				// TODO sections can be specified for setIsEmpty etc
				// could be setIsEmpty or setIsInvalid
				newTitles.add(m.getName());
			}
		} else {
			// could be a send for a transition/edge
			newTitles.add(m.getName());
		}
		return newTitles;
	}

	@Override
	protected void addNextLayerInteractionParameters(Interaction targetInteraction, Message m) {

		ValueSpecification vs;

		vs = createArgument(m, "keyMap", "", false);
		if (vs != null) {
			getParameter(targetInteraction, "keyMap", "", "in");
		}
		vs = createArgument(m, "contents", "", false);
		if (vs != null) {
			getParameter(targetInteraction, "contents", "", "in");
		}
	}

	@Override
	protected Interaction addNextLayerInteraction(String methodName, Message m) {
		return getInteraction(getNextLayerClassFromMessage(m), methodName, true);
	}

}
