package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.FamilyDetailsResponseJavaFile;

public class FamilyDetailsResponseJavaFileImpl extends FileObject implements FamilyDetailsResponseJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
