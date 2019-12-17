package org.ie.client;

/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class57 {
	public static Class29 aClass29_1098;
	public static long[] aLongArray1099 = new long[100];
	public static int anInt1100;
	public static int anInt1101;

	public static void method1146(int i) {
		for (InterfaceClickMask class37_sub10 = (InterfaceClickMask) Class62.interface_click_masks
				.getFirst(); class37_sub10 != null; class37_sub10 = ((InterfaceClickMask) Class62.interface_click_masks
				.getNext())) {
			if (((long) i ^ 0xffffffffffffffffL) == (0xffffL & class37_sub10.hash >> 1632300400 ^ 0xffffffffffffffffL))
				class37_sub10.unlink();
		}
	}

	public static void method1147(int i) {
		aClass29_1098 = null;
		aLongArray1099 = null;
		int i_1_ = 39 / ((i - 54) / 61);
	}

	static {
		aClass29_1098 = new Class29();
	}
}
