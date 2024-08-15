package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.PharmacyClaimResponseStepsJavaFile;

public class PharmacyClaimResponseStepsJavaFileImpl extends FileObject implements PharmacyClaimResponseStepsJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
