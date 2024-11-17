package org.farhan.mbt.maven;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.farhan.mbt.core.ObjectRepository;

public class FileObjectRepository implements ObjectRepository {

	@Override
	public ArrayList<String> list(String path, String extension) {
		ArrayList<String> theFiles = new ArrayList<String>();
		File aDir = new File(path);
		if (aDir.exists()) {
			for (String s : aDir.list()) {
				File tempFile = new File(aDir.getAbsolutePath() + File.separator + s);
				if (tempFile.isDirectory()) {
					theFiles.addAll(list(tempFile.getAbsolutePath(), extension));
				} else if (tempFile.getAbsolutePath().toLowerCase().endsWith(extension.toLowerCase())) {
					theFiles.add(tempFile.getAbsolutePath());
				}
			}
		}
		return theFiles;
	}

	@Override
	public String get(String path) throws Exception {
		return new String(Files.readAllBytes(Paths.get(new File(path).toURI())), StandardCharsets.UTF_8);
	}

	@Override
	public void put(String path, String content) throws Exception {
		new File(path).getParentFile().mkdirs();
		PrintWriter aPrintWriter = new PrintWriter(new File(path), StandardCharsets.UTF_8);
		aPrintWriter.print(content);
		aPrintWriter.flush();
		aPrintWriter.close();
	}

	@Override
	public boolean contains(String path) {
		return new File(path).exists();
	}

}
