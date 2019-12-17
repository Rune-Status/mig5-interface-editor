package org.ie.client;

/* Class52_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class52_Sub1 extends Class52 {
	public int anInt2293;
	public static int anInt2294;
	public long aLong2295;
	public static int anInt2296;
	public int anInt2297;
	public static int[] anIntArray2298;
	public static Cache aClass65_2299 = new Cache(64);
	public int anInt2300;
	public static int anInt2301;
	public long[] aLongArray2302 = new long[10];
	public static int anInt2303 = 0;
	public static RSString aClass16_2304 = (Class37_Sub2
			.create_rsstring(
					"Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3"));
	public static int anInt2305;
	public static byte[][][] aByteArrayArrayArray2306;
	public int anInt2307;
	public static int anInt2308;
	public static Class15_Sub1 aClass15_Sub1_2309;

	public static void method1131(int i, int i_0_, int i_1_, int i_3_) {
		Class37_Sub13 class37_sub13 = ((Class37_Sub13) Class37_Sub4_Sub7_Sub1.aClass13_3670
				.get((long) i_1_));
		if (class37_sub13 == null) {
			class37_sub13 = new Class37_Sub13();
			Class37_Sub4_Sub7_Sub1.aClass13_3670.put(class37_sub13,
					(long) i_1_);
		}
		if (i_0_ >= class37_sub13.anIntArray2116.length) {
			int[] is = new int[i_0_ - -1];
			int[] is_4_ = new int[i_0_ + 1];
			for (int i_5_ = 0; class37_sub13.anIntArray2116.length > i_5_; i_5_++) {
				is[i_5_] = class37_sub13.anIntArray2116[i_5_];
				is_4_[i_5_] = class37_sub13.anIntArray2108[i_5_];
			}
			for (int i_6_ = class37_sub13.anIntArray2116.length; i_6_ < i_0_; i_6_++) {
				is[i_6_] = -1;
				is_4_[i_6_] = 0;
			}
			class37_sub13.anIntArray2116 = is;
			class37_sub13.anIntArray2108 = is_4_;
		}
		class37_sub13.anIntArray2116[i_0_] = i_3_;
		class37_sub13.anIntArray2108[i_0_] = i;
	}

	public int method1129(int i, byte i_7_, int i_8_) {
		anInt2301++;
		int i_9_ = anInt2293;
		anInt2293 = 300;
		int i_10_ = anInt2297;
		anInt2297 = 1;
		aLong2295 = Class71.method1263();
		if (i_7_ != 119)
			return -127;
		if (aLongArray2302[anInt2300] == 0L) {
			anInt2293 = i_9_;
			anInt2297 = i_10_;
		} else if (aLong2295 > aLongArray2302[anInt2300])
			anInt2293 = (int) ((long) (2560 * i_8_) / (-aLongArray2302[anInt2300] + aLong2295));
		if (anInt2293 < 25)
			anInt2293 = 25;
		if (anInt2293 > 256) {
			anInt2293 = 256;
			anInt2297 = (int) ((long) i_8_ + -((-aLongArray2302[anInt2300] + aLong2295) / 10L));
		}
		if (anInt2297 > i_8_)
			anInt2297 = i_8_;
		aLongArray2302[anInt2300] = aLong2295;
		anInt2300 = (anInt2300 + 1) % 10;
		if (anInt2297 > 1) {
			for (int i_11_ = 0; i_11_ < 10; i_11_++) {
				if ((aLongArray2302[i_11_] ^ 0xffffffffffffffffL) != -1L)
					aLongArray2302[i_11_] = aLongArray2302[i_11_]
							+ (long) anInt2297;
			}
		}
		int i_12_ = 0;
		if (anInt2297 < i)
			anInt2297 = i;
		Class37_Sub9_Sub20.method846((long) anInt2297, (byte) 58);
		while ((anInt2307 ^ 0xffffffff) > -257) {
			anInt2307 += anInt2293;
			i_12_++;
		}
		anInt2307 &= 0xff;
		return i_12_;
	}

	public static int method1132(int i, int i_13_, int i_14_, int i_15_,
			byte i_16_, int i_17_, int i_18_) {
		if ((0x1 & i_15_) == 1) {
			int i_19_ = i_14_;
			i_14_ = i_18_;
			i_18_ = i_19_;
		}
		anInt2296++;
		i &= 0x3;
		if (i_16_ <= 48)
			return -107;
		if (i == 0)
			return i_13_;
		if ((i ^ 0xffffffff) == -2)
			return -i_17_ + 8 + -i_14_;
		if (i == 2)
			return 1 - i_18_ + (7 - i_13_);
		return i_17_;
	}

	public void method1127(int i) {
		anInt2294++;
		if (i != 5)
			method1132(-93, -70, 65, 103, (byte) -59, 27, -88);
		for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > -11; i_20_++)
			aLongArray2302[i_20_] = 0L;
	}

	public static void method1133(int i) {
		aClass16_2304 = null;
		aClass65_2299 = null;
		int i_21_ = 96 / ((i - 63) / 50);
		anIntArray2298 = null;
		aByteArrayArrayArray2306 = null;
		aClass15_Sub1_2309 = null;
	}

	public Class52_Sub1() {
		anInt2297 = 1;
		anInt2307 = 0;
		anInt2293 = 256;
		aLong2295 = Class71.method1263();
		for (int i = 0; i < 10; i++)
			aLongArray2302[i] = aLong2295;
	}
}
