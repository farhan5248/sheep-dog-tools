package org.farhan.mbt.conv.cucumber;

import java.io.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.farhan.CucumberStandaloneSetup;
import org.farhan.cucumber.Feature;

public class CucumberFeatureFile {

	public Feature theFeature;
	private File theFile;

	public CucumberFeatureFile(File theFile) {
		this.theFile = theFile;
	}

	public void readFile() {

		URI uri = URI.createFileURI(theFile.getAbsolutePath());
		CucumberStandaloneSetup.doSetup();
		Resource res = new ResourceSetImpl().getResource(uri, true);
		theFeature = (Feature) res.getContents().get(0);
	}

}
