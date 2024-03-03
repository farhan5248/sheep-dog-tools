package org.farhan.objects.admin.post;

import java.util.HashMap;

import org.farhan.common.AdminPost;
import org.farhan.objects.admin.MemberPage;

public class MemberPageImpl extends AdminPost implements MemberPage {

	@Override
	public void setCertificate(HashMap<String, String> keyMap) {
		addParamter("certificate", keyMap.get("Certificate"));
		sendRequest("member");
	}

}
