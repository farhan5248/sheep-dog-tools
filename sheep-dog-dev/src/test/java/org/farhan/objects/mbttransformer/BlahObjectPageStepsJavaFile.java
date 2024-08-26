package org.farhan.objects.mbttransformer;

import java.util.HashMap;

public interface BlahObjectPageStepsJavaFile {

	public void assertContent(HashMap<String, String> keyMap);

	public void assertFieldsSectionAnnotation(HashMap<String, String> keyMap);

	public void assertFieldsSectionMethodName(HashMap<String, String> keyMap);

	public void assertFieldsSectionParameterName(HashMap<String, String> keyMap);

	public void assertFieldsSectionParameterType(HashMap<String, String> keyMap);

	public void assertFieldsSectionReturnType(HashMap<String, String> keyMap);

	public void assertFieldsSectionStatement(HashMap<String, String> keyMap);

	public void assertFieldsSectionVisibility(HashMap<String, String> keyMap);

	public void assertObjectSectionImport(HashMap<String, String> keyMap);

	public void assertObjectSectionInterfaceName(HashMap<String, String> keyMap);

	public void assertObjectSectionPackage(HashMap<String, String> keyMap);

	public void assertPresent(HashMap<String, String> keyMap);

	public void setContent(HashMap<String, String> keyMap);
}
