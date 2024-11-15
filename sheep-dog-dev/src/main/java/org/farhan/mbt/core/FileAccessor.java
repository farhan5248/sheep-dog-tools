package org.farhan.mbt.core;

import java.io.File;
import java.util.ArrayList;

public interface FileAccessor {

	public ArrayList<File> recursivelyListFiles(File aDir, String extension);

	public String readFile(File aFile) throws Exception;

	public void writeFile(File aFile, String content) throws Exception;
}
