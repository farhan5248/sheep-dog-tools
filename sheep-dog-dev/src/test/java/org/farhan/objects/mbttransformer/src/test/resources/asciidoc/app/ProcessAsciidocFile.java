package org.farhan.objects.mbttransformer.src.test.resources.asciidoc.app;

import java.util.HashMap;

public interface ProcessAsciidocFile {

	public void assertContent(HashMap<String, String> keyMap);

	public void setContent(HashMap<String, String> keyMap);
}
