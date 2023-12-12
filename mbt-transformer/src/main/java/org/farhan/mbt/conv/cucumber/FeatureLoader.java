package org.farhan.mbt.conv.cucumber;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.farhan.CucumberStandaloneSetup;
import org.farhan.cucumber.*;

public class FeatureLoader {

	public static void main(String[] args) throws IOException {

		String content = "Feature: Functionality";
		Feature feature = new FeatureLoader().loadModel(content);
		System.out.println(feature.getName());
	}

	public Feature loadModel(String content) {

		try {
			File temp = File.createTempFile("Test", ".feature");
			URI uri = URI.createFileURI(temp.getAbsolutePath());
			BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
			bw.write(content);
			bw.close();
			CucumberStandaloneSetup.doSetup();
			Resource res = new ResourceSetImpl().getResource(uri, true);
			Feature feature = (Feature) res.getContents().get(0);
			return feature;
		}

		catch (IOException e) {
			System.out.println("Error loading Feature model");
			return null;
		}
	}

}