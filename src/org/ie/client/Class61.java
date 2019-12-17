package org.ie.client;

/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class61 {
	public static int[] anIntArray1160;
	public int[] anIntArray1161;
	public static int[] anIntArray1162 = new int[500];
	public boolean aBoolean1163;
	public static int[] anIntArray1164 = new int[500];
	public static int[] anIntArray1165;
	public int[] anIntArray1166;
	public int anInt1167;
	public Class37_Sub25 aClass37_Sub25_1168 = null;
	public int[] anIntArray1169;
	public int[] anIntArray1170;

	public static void method1169() {
		anIntArray1165 = null;
		anIntArray1164 = null;
		anIntArray1160 = null;
		anIntArray1162 = null;
	}

	public Class61(byte[] is, Class37_Sub25 class37_sub25) {
		aBoolean1163 = false;
		anInt1167 = -1;
		aClass37_Sub25_1168 = class37_sub25;
		ByteVector class37_sub11 = new ByteVector(is);
		ByteVector class37_sub11_0_ = new ByteVector(is);
		class37_sub11.pos = 2;
		int i = class37_sub11.getUnsignedByte();
		int i_1_ = -1;
		int i_2_ = 0;
		class37_sub11_0_.pos = class37_sub11.pos + i;
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			int i_4_ = class37_sub11.getUnsignedByte();
			if (i_4_ > 0) {
				if (aClass37_Sub25_1168.anIntArray2277[i_3_] != 0) {
					for (int i_5_ = i_3_ - 1; i_5_ > i_1_; i_5_--) {
						if (aClass37_Sub25_1168.anIntArray2277[i_5_] == 0) {
							anIntArray1165[i_2_] = i_5_;
							anIntArray1164[i_2_] = 0;
							anIntArray1160[i_2_] = 0;
							anIntArray1162[i_2_] = 0;
							i_2_++;
							break;
						}
					}
				}
				anIntArray1165[i_2_] = i_3_;
				int i_6_ = 0;
				if (aClass37_Sub25_1168.anIntArray2277[i_3_] == 3)
					i_6_ = 128;
				if ((i_4_ & 0x1) != 0)
					anIntArray1164[i_2_] = class37_sub11_0_.method959(-128);
				else
					anIntArray1164[i_2_] = i_6_;
				if ((i_4_ & 0x2) != 0)
					anIntArray1160[i_2_] = class37_sub11_0_.method959(105);
				else
					anIntArray1160[i_2_] = i_6_;
				if ((i_4_ & 0x4) != 0)
					anIntArray1162[i_2_] = class37_sub11_0_.method959(-24);
				else
					anIntArray1162[i_2_] = i_6_;
				i_1_ = i_3_;
				i_2_++;
				if (aClass37_Sub25_1168.anIntArray2277[i_3_] == 5)
					aBoolean1163 = true;
			}
		}
		if (class37_sub11_0_.pos != is.length)
			throw new RuntimeException();
		anInt1167 = i_2_;
		anIntArray1170 = new int[i_2_];
		anIntArray1166 = new int[i_2_];
		anIntArray1161 = new int[i_2_];
		anIntArray1169 = new int[i_2_];
		for (int i_7_ = 0; i_7_ < i_2_; i_7_++) {
			anIntArray1170[i_7_] = anIntArray1165[i_7_];
			anIntArray1166[i_7_] = anIntArray1164[i_7_];
			anIntArray1161[i_7_] = anIntArray1160[i_7_];
			anIntArray1169[i_7_] = anIntArray1162[i_7_];
		}
	}

	static {
		anIntArray1160 = new int[500];
		anIntArray1165 = new int[500];
	}
}
