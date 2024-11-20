package org.farhan.mbt.maven;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.farhan.mbt.core.ObjectRepository;

public class FileObjectRepository implements ObjectRepository {

	public String targetDir;

	public void setTargetDir(String baseDir) {
		this.targetDir = baseDir + "target/";
	}

	@Override
	public ArrayList<String> list(String tags, String path, String extension) {
		path = path.replaceAll("\\\\+", "/").replaceAll("/+", "/");
		path = targetDir + (tags.isEmpty() ? "" : tags + "/") + path;
		ArrayList<String> theFiles = new ArrayList<String>();
		File aDir = new File(path);
		if (aDir.exists()) {
			for (String s : aDir.list()) {
				File aDirObj = new File(path + "/" + s);
				String aDirObjPath = aDirObj.getPath().replaceAll("\\\\+", "/")
						.replace(targetDir + (tags.isEmpty() ? "" : tags + "/"), "");
				if (aDirObj.isDirectory()) {
					theFiles.addAll(list(tags, aDirObjPath, extension));
				} else if (aDirObj.getPath().toLowerCase().endsWith(extension.toLowerCase())) {
					theFiles.add(aDirObjPath);
				}
			}
		}
		return theFiles;
	}

	@Override
	public boolean contains(String tags, String path) {
		path = path.replaceAll("\\\\+", "/").replaceAll("/+", "/");
		path = targetDir + (tags.isEmpty() ? "" : tags + "/") + path;
		return new File(path).exists();
	}

	@Override
	public String get(String tags, String path) throws Exception {
		path = path.replaceAll("\\\\+", "/").replaceAll("/+", "/");
		path = targetDir + (tags.isEmpty() ? "" : tags + "/") + path;
		return new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
	}

	@Override
	public void put(String tags, String path, String content) throws Exception {
		path = path.replaceAll("\\\\+", "/").replaceAll("/+", "/");
		path = targetDir + (tags.isEmpty() ? "" : tags + "/") + path;
		new File(path).getParentFile().mkdirs();
		PrintWriter aPrintWriter = new PrintWriter(new File(path), StandardCharsets.UTF_8);
		aPrintWriter.print(content);
		aPrintWriter.flush();
		aPrintWriter.close();
	}

}
