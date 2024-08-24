package org.farhan.generator;

import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.util.RuntimeIOException;

public class Temp implements IFileSystemAccess2 {

	@Override
	public void generateFile(String fileName, CharSequence contents) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateFile(String fileName, String outputConfigurationName, CharSequence contents) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFile(String fileName, String outputConfigurationName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public URI getURI(String path, String outputConfiguration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI getURI(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void generateFile(String fileName, String outputCfgName, InputStream content) throws RuntimeIOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateFile(String fileName, InputStream content) throws RuntimeIOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InputStream readBinaryFile(String fileName, String outputCfgName) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream readBinaryFile(String fileName) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CharSequence readTextFile(String fileName, String outputCfgName) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CharSequence readTextFile(String fileName) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFile(String path, String outputConfigurationName) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFile(String path) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return false;
	}

}
