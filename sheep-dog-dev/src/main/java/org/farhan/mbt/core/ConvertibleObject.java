package org.farhan.mbt.core;

public interface ConvertibleObject {

	// TODO only the cucumberproject uses this, remove it?
	public String getPath();

	public void parse(String text) throws Exception;

	// TODO delete and replace with toString
	public void save(ObjectRepository fa) throws Exception;

	public Object get();
}
