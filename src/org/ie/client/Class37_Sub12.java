package org.ie.client;

/* Class37_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub12 extends Node {
	public static int anInt2075;
	public int anInt2076;
	public static int anInt2077 = 0;
	public int anInt2078;
	public int anInt2079;
	public int anInt2080;
	public int anInt2081;
	public int anInt2082;
	public int anInt2083;
	public Class37_Sub3_Sub4 aClass37_Sub3_Sub4_2084;
	public int anInt2085;
	public int anInt2086;
	public static int anInt2087 = 0;
	public int anInt2088;
	public static int anInt2089;
	public int anInt2090;
	public Class37_Sub15 aClass37_Sub15_2091;
	public int anInt2092;
	public static RSString[] aClass16Array2093;
	public static int anInt2094;
	public int anInt2095;
	public Class66 aClass66_2096;
	public static int[] anIntArray2097 = { 1, 1, 1, 1 };
	public Class37_Sub22_Sub1 aClass37_Sub22_Sub1_2098;
	public int anInt2099;
	public int anInt2100;
	public static int anInt2101;
	public int anInt2102;
	public int anInt2103;
	public static int[] anIntArray2104;

	public static void method997(int i) {
		anInt2089++;
		int i_0_ = Class83.byteVector.method996(8, 103);
		if ((Class19.anInt487 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)) {
			for (int i_1_ = i_0_; (Class19.anInt487 ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++)
				Applet_Sub1.anIntArray30[Class37_Sub9_Sub21.anInt3306++] = Class26.anIntArray657[i_1_];
		}
		if ((Class19.anInt487 ^ 0xffffffff) > (i_0_ ^ 0xffffffff))
			throw new RuntimeException("gppov1");
		Class19.anInt487 = 0;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			int i_3_ = Class26.anIntArray657[i_2_];
			Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_3_];
			int i_4_ = Class83.byteVector.method996(1, 97);
			if ((i_4_ ^ 0xffffffff) == -1) {
				Class26.anIntArray657[Class19.anInt487++] = i_3_;
				class37_sub4_sub7_sub1_sub2.anInt3641 = Class37_Sub7.loopCycle;
			} else {
				int i_5_ = Class83.byteVector.method996(2, 83);
				if (i_5_ == 0) {
					Class26.anIntArray657[Class19.anInt487++] = i_3_;
					class37_sub4_sub7_sub1_sub2.anInt3641 = Class37_Sub7.loopCycle;
					Class36.anIntArray809[Class37_Sub9_Sub11.anInt3098++] = i_3_;
				} else if (i_5_ == 1) {
					Class26.anIntArray657[Class19.anInt487++] = i_3_;
					class37_sub4_sub7_sub1_sub2.anInt3641 = Class37_Sub7.loopCycle;
					int i_6_ = Class83.byteVector.method996(3, 19);
					class37_sub4_sub7_sub1_sub2.method495(false, -3523, i_6_);
					int i_7_ = Class83.byteVector.method996(1, 43);
					if ((i_7_ ^ 0xffffffff) == -2)
						Class36.anIntArray809[Class37_Sub9_Sub11.anInt3098++] = i_3_;
				} else if ((i_5_ ^ 0xffffffff) == -3) {
					Class26.anIntArray657[Class19.anInt487++] = i_3_;
					class37_sub4_sub7_sub1_sub2.anInt3641 = Class37_Sub7.loopCycle;
					int i_8_ = Class83.byteVector.method996(3, 122);
					class37_sub4_sub7_sub1_sub2.method495(true, -3523, i_8_);
					int i_9_ = Class83.byteVector.method996(3, 116);
					class37_sub4_sub7_sub1_sub2.method495(true, -3523, i_9_);
					int i_10_ = Class83.byteVector.method996(1, 63);
					if ((i_10_ ^ 0xffffffff) == -2)
						Class36.anIntArray809[Class37_Sub9_Sub11.anInt3098++] = i_3_;
				} else if (i_5_ == 3)
					Applet_Sub1.anIntArray30[Class37_Sub9_Sub21.anInt3306++] = i_3_;
			}
		}
		if (i > -44)
			anInt2077 = 82;
	}

	public static RSString createRSStringFromBuffer(byte[] buf, int off, int len) {
		RSString rSString = new RSString();
		rSString.anInt1650 = off;
		rSString.aByteArray1669 = new byte[off];
		System.arraycopy(buf, len, rSString.aByteArray1669, 0, off);
		return rSString;
	}

	public static void method999(int i) {
		aClass16Array2093 = null;
		anIntArray2104 = null;
		if (i == 16491)
			anIntArray2097 = null;
	}

	public void method1000(byte i) {
		aClass37_Sub3_Sub4_2084 = null;
		aClass37_Sub15_2091 = null;
		aClass66_2096 = null;
		aClass37_Sub22_Sub1_2098 = null;
		int i_14_ = 44 / ((-55 - i) / 38);
		anInt2075++;
	}

	public static boolean method1001(int i, Class15 class15, byte i_15_,
			int i_16_) {
		if (i_15_ != 124)
			anIntArray2104 = null;
		byte[] is = class15.getFile(i_16_, i);
		anInt2101++;
		if (is == null)
			return false;
		Class49.method1111(false, is);
		return true;
	}

	static {
		aClass16Array2093 = new RSString[100];
		anIntArray2104 = new int[25];
	}
}
