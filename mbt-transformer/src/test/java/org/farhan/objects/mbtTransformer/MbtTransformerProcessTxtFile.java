package org.farhan.objects.mbtTransformer;

import java.util.HashMap;
import io.cucumber.java.PendingException;
import org.farhan.common.objects.MbtTransformer;

public class MbtTransformerProcessTxtFile extends MbtTransformer {

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
