package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.PharmacyNightlyPaymentRequestStepsJavaFile;

public class PharmacyNightlyPaymentRequestStepsJavaFileImpl extends FileObject implements PharmacyNightlyPaymentRequestStepsJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
