package org.farhan.objects.mbtTransformer;

import java.util.HashMap;
import io.cucumber.java.PendingException;
import org.farhan.common.objects.MbtTransformer;

public class MbtTransformerProcessAdocFile extends MbtTransformer {

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
