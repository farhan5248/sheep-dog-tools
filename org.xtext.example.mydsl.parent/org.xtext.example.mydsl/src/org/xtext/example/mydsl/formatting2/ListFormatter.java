package org.xtext.example.mydsl.formatting2;

public class ListFormatter extends Formatter {

	protected static boolean isLast;
	protected static boolean isFirst;
	

	public static void isLast(boolean isLast) {
		ListFormatter.isLast = isLast;
	}

	public static void isFirst(boolean isFirst) {
		ListFormatter.isFirst = isFirst;
	}
}
