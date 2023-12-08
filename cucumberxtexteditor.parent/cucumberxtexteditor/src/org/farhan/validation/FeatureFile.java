package org.farhan.validation;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.farhan.CucumberStandaloneSetup;
import org.farhan.cucumber.Feature;
import java.io.FileInputStream;
import java.io.InputStream;
import com.google.inject.Injector;

public class FeatureFile {

	private File theFile;
	Feature theFeature;

	public FeatureFile(File theFile) {
		this.theFile = theFile;
	}

	public void readFile() throws Exception {
		Injector injector = new CucumberStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createURI("dummy:/" + theFile.getAbsolutePath()));
		InputStream in = new FileInputStream(theFile);
		resource.load(in, resourceSet.getLoadOptions());
		theFeature = (Feature) resource.getContents().get(0);
	}

}
