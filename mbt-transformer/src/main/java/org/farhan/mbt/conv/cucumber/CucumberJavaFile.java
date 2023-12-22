package org.farhan.mbt.conv.cucumber;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.conv.core.ConvertibleFile;
import org.farhan.conv.core.Utilities;
import org.farhan.mbt.conv.uml.ParameterFactory;
import org.farhan.mbt.conv.uml.UMLNameTranslator;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier.Keyword;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.utils.SourceRoot;

public class CucumberJavaFile implements ConvertibleFile {

	private File theFile;
	// TODO make this private later
	public CompilationUnit javaClass;

	public CucumberJavaFile(File theFile) {
		setFile(theFile);
	}

	@Override
	public void setFile(File theFile) {
		this.theFile = theFile;
	}

	@Override
	public File getFile() {
		return theFile;
	}

	@Override
	public void read() {
		if (theFile.exists()) {
			// TODO delete these commented out lines if this all works
			// new SourceRoot(CucumberProject.getSecondLayerDir().toPath());
			SourceRoot javaSrcDir = new SourceRoot(theFile.getParentFile().toPath());
			// javaSrcDir.parse(convertJavaPathToJavaPackage(theFile.getAbsolutePath()),
			// theFile.getName());
			javaClass = javaSrcDir.parse("", theFile.getName());
		}
	}

	@Override
	public void write() {
		File parentDir = theFile.getParentFile();
		parentDir.mkdirs();
		SourceRoot javaSrcDir = new SourceRoot(parentDir.toPath());
		javaSrcDir.add(javaClass);
		javaSrcDir.saveAll();
	}

}
