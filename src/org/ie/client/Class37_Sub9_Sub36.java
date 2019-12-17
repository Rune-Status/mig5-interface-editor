package org.ie.client;

/* Class37_Sub9_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub36 extends Class37_Sub9 {
	public static int anInt3570;
	public static int anInt3571;
	public static int[] anIntArray3572 = new int[4000];
	public static int[][] anIntArrayArray3573;
	public static int anInt3574;
	public static int anInt3575;
	public static volatile boolean aBoolean3576 = true;
	public static RSString aClass16_3577;
	public static int anInt3578;
	public static int anInt3579 = 0;
	public static RSString aClass16_3580;
	public static int anInt3581;
	public int anInt3582 = 4096;
	public int anInt3583 = 0;
	public static int anInt3584 = 0;
	public static RSString aClass16_3585;
	public static int anInt3586;
	public static boolean[] aBooleanArray3587;

	public Class37_Sub9_Sub36() {
		super(1, true);
	}

	public static void method916(int i, int i_0_, Class20[] class20s,
			byte[] is, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
			byte i_6_) {
		try {
			anInt3570++;
			for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -9; i_7_++) {
				for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -9; i_8_++) {
					if (i_1_ - -i_7_ > 0 && i_7_ + i_1_ < 103
							&& i_8_ + i_2_ > 0
							&& (i_8_ + i_2_ ^ 0xffffffff) > -104)
						class20s[i_5_].anIntArrayArray554[i_7_ + i_1_][i_8_
								+ i_2_] = Class37_Sub4_Sub7
								.method490(
										(class20s[i_5_].anIntArrayArray554[i_7_
												+ i_1_][i_8_ + i_2_]),
										-16777217);
				}
			}
			int i_9_ = 11 % ((i_6_ - 61) / 41);
			ByteVector class37_sub11 = new ByteVector(is);
			for (int i_10_ = 0; i_10_ < 4; i_10_++) {
				for (int i_11_ = 0; i_11_ < 64; i_11_++) {
					for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -65; i_12_++) {
						if ((i_10_ ^ 0xffffffff) == (i_3_ ^ 0xffffffff)
								&& (i_11_ ^ 0xffffffff) <= (i ^ 0xffffffff)
								&& i_11_ < i + 8 && i_12_ >= i_0_
								&& i_0_ - -8 > i_12_)
							Class87.method1325(0, 0, i_4_, i_1_
									- -Node.method325(0x7 & i_11_, 104,
											i_4_, i_12_ & 0x7), i_5_, -9890,
									class37_sub11, Class71.method1260(i_4_,
											100, 0x7 & i_11_, i_12_ & 0x7)
											+ i_2_);
						else
							Class87.method1325(0, 0, 0, -1, 0, -9890,
									class37_sub11, -1);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("vf.G("
					+ i + ',' + i_0_ + ','
					+ (class20s != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_
					+ ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	public static void method917(int i) {
		aClass16_3580 = null;
		aBooleanArray3587 = null;
		aClass16_3577 = null;
		anIntArray3572 = null;
		anIntArrayArray3573 = null;
		aClass16_3585 = null;
		if (i != 32258)
			method919(-6, -101, -102);
	}

	public static Class37_Sub4_Sub4 method918(int i, int i_13_) {
		anInt3575++;
		Class37_Sub4_Sub4 class37_sub4_sub4 = ((Class37_Sub4_Sub4) client.aClass65_1728
				.get((long) i_13_));
		if (class37_sub4_sub4 != null)
			return class37_sub4_sub4;
		if (i != 8237)
			anInt3579 = -60;
		byte[] is = Class36.aClass15_800.getFile(3, i_13_);
		class37_sub4_sub4 = new Class37_Sub4_Sub4();
		if (is != null)
			class37_sub4_sub4.method473(new ByteVector(is), (byte) -46);
		client.aClass65_1728.put(class37_sub4_sub4, (long) i_13_);
		return class37_sub4_sub4;
	}

	public int[] method761(int i, int i_14_) {
		anInt3574++;
		int[] is = aClass38_1966.method1049(i_14_, true);
		if (i >= -125)
			aBoolean3576 = true;
		if (aClass38_1966.aBoolean850) {
			int[] is_15_ = this.method760(i_14_, 0, -48);
			for (int i_16_ = 0; i_16_ < Class32.anInt743; i_16_++) {
				int i_17_ = is_15_[i_16_];
				is[i_16_] = (((i_17_ ^ 0xffffffff) <= (anInt3583 ^ 0xffffffff) && (anInt3582 ^ 0xffffffff) <= (i_17_ ^ 0xffffffff)) ? 4096
						: 0);
			}
		}
		return is;
	}

	public static int method919(int i, int i_18_, int i_19_) {
		anInt3571++;
		if (i_19_ != -32594)
			aClass16_3577 = null;
		Class37_Sub13 class37_sub13 = ((Class37_Sub13) Class37_Sub4_Sub7_Sub1.aClass13_3670
				.get((long) i_18_));
		if (class37_sub13 == null)
			return -1;
		if (i < 0 || i >= class37_sub13.anIntArray2116.length)
			return -1;
		return class37_sub13.anIntArray2116[i];
	}

	public static void method920(int i, Class15 class15, Class15 class15_20_,
			Class15 class15_21_, Class15 class15_22_) {
		try {
			Class37_Sub4_Sub14.aClass15_2805 = class15_21_;
			anInt3586++;
			Class37_Sub4_Sub7_Sub7.aClass15_3837 = class15;
			ByteVector.aClass15_2025 = class15_22_;
			Class80.aClass15_1507 = class15_20_;
			Class37_Sub9_Sub29.mainInterfaceArray = (new RSInterface[Class37_Sub4_Sub14.aClass15_2805
					.method108((byte) 93)][]);
			if (i == -23499)
				Class15_Sub1.aBooleanArray1754 = new boolean[Class37_Sub4_Sub14.aClass15_2805
						.method108((byte) 64)];
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("vf.B("
					+ i + ',' + (class15 != null ? "{...}" : "null") + ','
					+ (class15_20_ != null ? "{...}" : "null") + ','
					+ (class15_21_ != null ? "{...}" : "null") + ','
					+ (class15_22_ != null ? "{...}" : "null") + ')'));
		}
	}

	public void method750(ByteVector class37_sub11, int i, boolean bool) {
		if (bool == true) {
			anInt3578++;
			int i_23_ = i;
			do {
				if ((i_23_ ^ 0xffffffff) != -1) {
					if (i_23_ != 1)
						break;
				} else {
					anInt3583 = class37_sub11.getUnsignedShort();
					break;
				}
				anInt3582 = class37_sub11.getUnsignedShort();
			} while (false);
		}
	}

	static {
		aClass16_3580 = Class37_Sub2.create_rsstring("Bitte warten Sie)3)3)3");
		aBooleanArray3587 = new boolean[100];
		aClass16_3585 = Class37_Sub2.create_rsstring("New User");
		aClass16_3577 = aClass16_3585;
	}
}
