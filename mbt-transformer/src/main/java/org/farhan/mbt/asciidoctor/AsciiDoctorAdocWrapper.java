package org.farhan.mbt.asciidoctor;

import java.io.File;

import org.asciidoctor.Options;
import org.asciidoctor.Asciidoctor.Factory;
import org.asciidoctor.ast.Block;
import org.asciidoctor.ast.Document;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Utilities;

public class AsciiDoctorAdocWrapper implements ConvertibleObject {

	private File theFile;
	private Document theDoc;

	public AsciiDoctorAdocWrapper(File theFile) {
		setFile(theFile);
		theDoc = Factory.create().load("= " + theFile.getName(), Options.builder().build());
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
			theDoc = Factory.create().loadFile(theFile, Options.builder().build());
		}
	}

	@Override
	public void save() throws Exception {
		String fileContents = docToString();
		Utilities.writeFile(theFile, fileContents);
	}

	private String docToString() {
		String text = "";
		text += ":tags: " + theDoc.getAttribute("tags") + "\n";
		text += "= " + theDoc.getTitle() + "\n";
		text += "\n";
		text += blockToText() + "\n";
		return text;
	}

	private String blockToText() {
		return ((Block) theDoc.getBlocks().getFirst()).getSource();
	}

	@Override
	public Object get() {
		return theDoc;
	}

}
