package org.farhan.mbt.conv.cucumber;

import java.io.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.farhan.CucumberStandaloneSetup;
import org.farhan.cucumber.Feature;
import org.farhan.mbt.conv.core.ConvertibleFile;

public class CucumberFeatureFile implements ConvertibleFile {

	private File theFile;
	// TODO make this private later
	public Feature theFeature;

	public CucumberFeatureFile(File theFile) {
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
		URI uri = URI.createFileURI(theFile.getAbsolutePath());
		CucumberStandaloneSetup.doSetup();
		Resource res = new ResourceSetImpl().getResource(uri, true);
		theFeature = (Feature) res.getContents().get(0);
		// TODO validate it or throw an exception
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub

	}

}
