package org.farhan.mbt.service;

public class ModelSourceFile {

	private String tag;
	private String fileName;
	private String fileContent;

	public ModelSourceFile(String tag, String fileName, String fileContent) {
		this.tag = tag;
		this.fileName = fileName;
		this.fileContent = fileContent;
	}

	public Object getTag() {
		return tag;
	}

	public Object getFileName() {
		return fileName;
	}

	public Object getFileContent() {
		return fileContent;
	}
}
