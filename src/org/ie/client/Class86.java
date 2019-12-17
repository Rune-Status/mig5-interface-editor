package org.ie.client;

/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class86 {
	public static RSString aClass16_1576;
	public static int[] typedKeyCodeCache;
	public static Class15 aClass15_1578;
	public static Class30 aClass30_1579;
	public static int anInt1580;
	public static RSString aClass16_1581 = Class37_Sub2.create_rsstring(
			"mapedge");
	public static int anInt1582;
	public static int anInt1583 = 1;

	public static void method1323(byte i, RSString rSString, boolean bool) {
		rSString = rSString.method147(12131);
		if (i < 88)
			typedKeyCodeCache = null;
		anInt1580++;
		short[] is = new short[16];
		int i_0_ = 0;
		for (int i_1_ = 0; i_1_ < Class35.anInt788; i_1_++) {
			RSItem class37_sub4_sub1 = Class46.loadItem(i_1_, (byte) 127);
			if ((!bool || class37_sub4_sub1.aBoolean2421)
					&& class37_sub4_sub1.itemName.method147(12131).method156(
							-126, rSString) != -1) {
				if ((i_0_ ^ 0xffffffff) <= -101) {
					InterfaceClickMask.anInt1980 = -1;
					Class78.aShortArray1459 = null;
					return;
				}
				if ((i_0_ ^ 0xffffffff) <= (is.length ^ 0xffffffff)) {
					short[] is_2_ = new short[2 * is.length];
					for (int i_3_ = 0; i_0_ > i_3_; i_3_++)
						is_2_[i_3_] = is[i_3_];
					is = is_2_;
				}
				is[i_0_++] = (short) i_1_;
			}
		}
		MouseHandler.anInt172 = 0;
		InterfaceClickMask.anInt1980 = i_0_;
		int i_4_ = i_0_;
		Class78.aShortArray1459 = is;
		while ((i_4_ ^ 0xffffffff) < -1) {
			boolean bool_5_ = true;
			i_4_--;
			for (int i_6_ = 0; i_4_ > i_6_; i_6_++) {
				RSItem class37_sub4_sub1 = Class46
						.loadItem(is[i_6_], (byte) 89);
				RSItem class37_sub4_sub1_7_ = Class46.loadItem(is[i_6_ - -1],
						(byte) 81);
				if (class37_sub4_sub1.itemName.method143(
						class37_sub4_sub1_7_.itemName, 10303) > 0) {
					bool_5_ = false;
					short i_8_ = is[i_6_];
					is[i_6_] = is[i_6_ - -1];
					is[i_6_ - -1] = i_8_;
				}
			}
			if (bool_5_)
				break;
		}
	}

	public static void method1324(byte i) {
		aClass30_1579 = null;
		aClass16_1581 = null;
		if (i != -108)
			method1323((byte) -7, null, true);
		typedKeyCodeCache = null;
		aClass16_1576 = null;
		aClass15_1578 = null;
	}

	static {
		aClass16_1576 = Class37_Sub2.create_rsstring("m");
		typedKeyCodeCache = new int[128];
	}
}
