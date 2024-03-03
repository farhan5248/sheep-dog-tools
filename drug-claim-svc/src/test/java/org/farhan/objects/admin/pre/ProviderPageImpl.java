package org.farhan.objects.admin.pre;

import java.util.HashMap;

import org.farhan.adjudication.admin.ProviderFactory;
import org.farhan.common.AdminPre;
import org.farhan.objects.admin.ProviderPage;

public class ProviderPageImpl extends AdminPre implements ProviderPage{

    public void setProvider(HashMap<String, String> keyMap) {
    	ProviderFactory.create(keyMap.get("Provider"));
	}
}
