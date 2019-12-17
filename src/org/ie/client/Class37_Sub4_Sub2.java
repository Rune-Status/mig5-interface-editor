package org.ie.client;

/* Class37_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub2 extends NodeSub {
	public static int anInt2518;
	public int anInt2519;
	public int anInt2520;
	public static long aLong2521 = 0L;
	public static int anInt2522;
	public int anInt2523;
	public int anInt2524;
	public boolean aBoolean2525 = false;
	public static RSString aClass16_2526 = Class37_Sub2
			.create_rsstring("This world is running a closed Beta)3");
	public Class17 aClass17_2527;
	public static long[] aLongArray2528 = new long[32];
	public static int anInt2529;
	public static int anInt2530;
	public int anInt2531;
	public static int anInt2532;
	public int[] anIntArray2533;
	public static int[] anIntArray2534;
	public int anInt2535;
	public boolean aBoolean2536;
	public static RSString aClass16_2537 = Class37_Sub2
			.create_rsstring("<col=ff9040>");
	public static int anInt2538;
	public static RSString aClass16_2539 = aClass16_2526;
	public boolean aBoolean2540;
	public float aFloat2541;

	public boolean method455(Class15 class15, Interface3 interface3,
			boolean bool) {
		try {
			anInt2538++;
			if (bool != true)
				method455(null, null, false);
			return aClass17_2527.method186(interface3, class15, (byte) -83);
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
					("ac.F(" + (class15 != null ? "{...}" : "null") + ','
							+ (interface3 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	public static Sprite[] method456(int i, int i_0_, Class15 class15, byte i_1_) {
		anInt2530++;
		if (i_1_ <= 44)
			aLong2521 = 0L;
		if (!Class37_Sub12.method1001(i, class15, (byte) 124, i_0_))
			return null;
		return Class37_Sub4_Sub7.method492(124);
	}

	public int[] method457(int i, Interface3 interface3, Class15 class15,
			int i_2_) {
		try {
			anInt2518++;
			if (!aClass17_2527.method186(interface3, class15, (byte) -89))
				return null;
			int i_3_ = -98 % ((-44 - i) / 60);
			int i_4_ = ((anInt2531 ^ 0xffffffff) >= (i_2_ ^ 0xffffffff) ? anInt2531
					: i_2_);
			return aClass17_2527.method183(i_4_, 1.0F, i_4_, false, class15,
					true, interface3);
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("ac.B("
					+ i + ',' + (interface3 != null ? "{...}" : "null") + ','
					+ (class15 != null ? "{...}" : "null") + ',' + i_2_ + ')'));
		}
	}

	public void method458(int i, int i_5_) {
		anInt2532++;
		if (anIntArray2533 != null) {
			if ((anInt2535 ^ 0xffffffff) != -1) {
				if (anIntArray2534 == null
						|| anIntArray2534.length < anIntArray2533.length)
					anIntArray2534 = new int[anIntArray2533.length];
				int i_6_;
				if (anIntArray2533.length != 4096)
					i_6_ = 128;
				else
					i_6_ = 64;
				int i_7_ = i_6_ * (i * anInt2524);
				if (anInt2535 == 2)
					i_7_ = -i_7_;
				int i_8_ = anIntArray2533.length;
				int i_9_ = -1 + i_8_;
				for (int i_10_ = 0; i_10_ < i_8_; i_10_++) {
					int i_11_ = i_10_ - -i_7_ & i_9_;
					anIntArray2534[i_10_] = anIntArray2533[i_11_];
				}
				int[] is = anIntArray2533;
				anIntArray2533 = anIntArray2534;
				anIntArray2534 = is;
			}
			if (anInt2520 != 0) {
				if (anIntArray2534 == null
						|| anIntArray2534.length < anIntArray2533.length)
					anIntArray2534 = new int[anIntArray2533.length];
				int i_12_ = anIntArray2533.length;
				int i_13_;
				if ((anIntArray2533.length ^ 0xffffffff) != -4097)
					i_13_ = 128;
				else
					i_13_ = 64;
				int i_14_ = anInt2524 * i;
				if (anInt2520 == 1)
					i_14_ = -i_14_;
				int i_15_ = i_13_ + -1;
				for (int i_16_ = 0; (i_12_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_ += i_13_) {
					for (int i_17_ = 0; (i_13_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
						int i_18_ = i_16_ - -i_17_;
						int i_19_ = (i_17_ + i_14_ & i_15_) + i_16_;
						anIntArray2534[i_18_] = anIntArray2533[i_19_];
					}
				}
				int[] is = anIntArray2533;
				anIntArray2533 = anIntArray2534;
				anIntArray2534 = is;
			}
		}
	}

	public int[] method459(int i, float f, Interface3 interface3,
			Class15 class15, int i_20_) {
		try {
			anInt2529++;
			if (anIntArray2533 == null || aFloat2541 != f) {
				if (!aClass17_2527.method186(interface3, class15, (byte) -90))
					return null;
				int i_21_ = anInt2531 <= i_20_ ? anInt2531 : i_20_;
				anIntArray2533 = aClass17_2527.method183(i_21_, f, i_21_, true,
						class15, true, interface3);
				aFloat2541 = f;
			}
			if (i != -10538)
				anInt2524 = -52;
			return anIntArray2533;
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3
					.method516(runtimeexception, ("ac.A(" + i + ',' + f + ','
							+ (interface3 != null ? "{...}" : "null") + ','
							+ (class15 != null ? "{...}" : "null") + ','
							+ i_20_ + ')'));
		}
	}

	public static void method460(int i) {
		aLongArray2528 = null;
		aClass16_2537 = null;
		int i_22_ = -22 / ((-45 - i) / 32);
		aClass16_2526 = null;
		aClass16_2539 = null;
		anIntArray2534 = null;
	}

	public Class37_Sub4_Sub2(ByteVector class37_sub11) {
		aClass17_2527 = new Class17(class37_sub11);
		int i = class37_sub11.getUnsignedByte();
		aBoolean2540 = (0x2 & i ^ 0xffffffff) != -1;
		aBoolean2536 = (0x1 & i) != 0;
		anInt2531 = class37_sub11.getUnsignedByte();
		anInt2519 = class37_sub11.getUnsignedShort();
		anInt2523 = class37_sub11.getUnsignedByte();
		if (anInt2523 == 255)
			anInt2523 = 256;
		int i_23_ = class37_sub11.getUnsignedByte();
		int i_24_ = class37_sub11.getUnsignedByte();
		anInt2520 = i_23_ >> -118381690 & 0x3;
		anInt2535 = 0x3 & i_24_ >> 1604718438;
		anInt2524 = (0x3f & i_24_) - 6;
		class37_sub11.getUnsignedByte();
		class37_sub11.getUnsignedByte();
	}

	public Class37_Sub4_Sub2() {
		aClass17_2527 = new Class17();
		aBoolean2536 = true;
		anInt2531 = 1;
	}
}
