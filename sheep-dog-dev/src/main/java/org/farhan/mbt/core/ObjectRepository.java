package org.farhan.mbt.core;

import java.util.ArrayList;

public interface ObjectRepository {

	public ArrayList<String> list(String path, String extension);

	public String get(String path) throws Exception;

	public void put(String path, String content) throws Exception;

	public boolean contains(String path);
}
