package org.farhan.mbt.cucumber;

import java.io.File;

import org.farhan.mbt.core.ConvertibleObject;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.utils.SourceRoot;

public class CucumberJavaWrapper implements ConvertibleObject {

	private File theFile;
	private CompilationUnit javaClass;

	public CucumberJavaWrapper(File theFile) {
		setFile(theFile);
		javaClass = new CompilationUnit();
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
	public void load() {
		if (theFile.exists()) {
			SourceRoot javaSrcDir = new SourceRoot(theFile.getParentFile().toPath());
			javaClass = javaSrcDir.parse("", theFile.getName());
		}
	}

	@Override
	public void save() {
		File parentDir = theFile.getParentFile();
		parentDir.mkdirs();
		SourceRoot javaSrcDir = new SourceRoot(parentDir.toPath());
		javaSrcDir.add(javaClass);
		javaSrcDir.saveAll();
	}

	@Override
	public Object get() {
		return javaClass;
	}

}
