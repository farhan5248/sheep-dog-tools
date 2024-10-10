package org.farhan.objects.admin.pre;

import java.util.HashMap;

import org.farhan.adjudication.admin.MemberFactory;
import org.farhan.common.AdminPre;
import org.farhan.objects.admin.MemberPage;

public class MemberPageImpl extends AdminPre implements MemberPage {

	@Override
	public void setCertificate(HashMap<String, String> keyMap) {
		MemberFactory.create(keyMap.get("Certificate"));
	}
}
