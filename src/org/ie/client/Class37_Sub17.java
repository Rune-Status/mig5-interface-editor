package org.ie.client;

/* Class37_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub17 extends Node {
	public static Class37_Sub4_Sub9_Sub1[] aClass37_Sub4_Sub9_Sub1Array2158;
	public static short[][] aShortArrayArray2159;
	public static Class15 aClass15_2160;
	public static RSString aClass16_2161 = Class37_Sub2.create_rsstring(
			"gr-Un:");
	public static int anInt2162;
	public static Cache aClass65_2163;
	public static Class15_Sub1 aClass15_Sub1_2164;
	public static boolean aBoolean2165 = false;
	public static int anInt2166;
	public Class50 aClass50_2167;
	public boolean aBoolean2168;
	public int anInt2169 = 0;
	public Class75 aClass75_2170;
	public int anInt2171;
	public boolean aBoolean2172;
	public int anInt2173;
	public Class41 aClass41_2174;
	public int anInt2175;
	public Class63 aClass63_2176;
	public int anInt2177;
	public Class39 aClass39_2178;
	public int anInt2179;
	public int anInt2180;
	public int anInt2181;
	public int anInt2182;
	public Class76 aClass76_2183;
	public boolean aBoolean2184;
	public int anInt2185;
	public Class27[] aClass27Array2186;
	public int[] anIntArray2187 = new int[5];
	public static int anInt2188;
	public Class37_Sub17 aClass37_Sub17_2189;
	public int anInt2190;

	public static void method1012(int i) {
		aClass16_2161 = null;
		aClass65_2163 = null;
		aClass15_Sub1_2164 = null;
		aClass15_2160 = null;
		aShortArrayArray2159 = null;
		if (i == 2)
			aClass37_Sub4_Sub9_Sub1Array2158 = null;
	}

	public static int method1013(int i, int i_0_, int i_1_, int i_2_) {
		anInt2162++;
		if (i <= 101)
			return 43;
		if ((Class1.aByteArrayArrayArray63[i_0_][i_1_][i_2_] & 0x8 ^ 0xffffffff) != -1)
			return 0;
		if ((i_0_ ^ 0xffffffff) < -1
				&& (Class1.aByteArrayArrayArray63[1][i_1_][i_2_] & 0x2) != 0)
			return -1 + i_0_;
		return i_0_;
	}

	public static void method1014(int i) {
		System.out
				.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
		anInt2166++;
		if (i != 20)
			anInt2188 = 43;
	}

	public Class37_Sub17(int i, int i_3_, int i_4_) {
		aClass27Array2186 = new Class27[5];
		anInt2171 = i_4_;
		anInt2190 = i_3_;
		anInt2182 = anInt2175 = i;
	}

	static {
		aClass65_2163 = new Cache(20);
	}
}
