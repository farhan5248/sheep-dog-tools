package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.PharmacyClaimRequestStepsJavaFile;

public class PharmacyClaimRequestStepsJavaFileImpl extends FileObject implements PharmacyClaimRequestStepsJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
