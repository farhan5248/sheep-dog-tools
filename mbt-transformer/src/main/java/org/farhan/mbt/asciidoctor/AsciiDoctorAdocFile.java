package org.farhan.mbt.asciidoctor;

import java.io.File;

import org.asciidoctor.Options;
import org.asciidoctor.Asciidoctor.Factory;
import org.asciidoctor.ast.Document;
import org.farhan.mbt.core.ConvertibleObject;

public class AsciiDoctorAdocFile implements ConvertibleObject {

	private File theFile;
	public Document theDoc;

	public AsciiDoctorAdocFile(File theFile) {
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
			theDoc = Factory.create().loadFile(theFile, Options.builder().build());
		}
	}

	@Override
	public void write() {
	}

}
