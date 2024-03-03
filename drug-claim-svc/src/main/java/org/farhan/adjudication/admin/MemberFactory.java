package org.farhan.adjudication.admin;

import java.util.TreeMap;

public class MemberFactory {

	private static TreeMap<String, Member> memberList = new TreeMap<String, Member>();

	public static Member create(String certificate) {
		if (memberList.get(certificate) != null) {
			return memberList.get(certificate);
		} else {
			return memberList.put(certificate, new Member(certificate));
		}
	}

	public static Member get(String certificate) {
		return memberList.get(certificate);
	}

	public static void reset() {
		memberList = new TreeMap<String, Member>();
	}
}
