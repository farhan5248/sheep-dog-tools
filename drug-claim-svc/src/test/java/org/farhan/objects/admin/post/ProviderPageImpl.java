package org.farhan.objects.admin.post;

import java.util.HashMap;

import org.farhan.common.AdminPost;
import org.farhan.objects.admin.ProviderPage;

public class ProviderPageImpl extends AdminPost implements ProviderPage{

    public void setProvider(HashMap<String, String> keyMap) {
		addParamter("provider", keyMap.get("Provider"));
		sendRequest("provider");
	}
}
