package org.farhan.mbt.core;

public interface ConvertibleObject {

	// TODO only the cucumberproject uses this, remove it?
	public String getPath();

	public void load(ObjectRepository fa) throws Exception;

	public void save(ObjectRepository fa) throws Exception;

	public Object get();
}
