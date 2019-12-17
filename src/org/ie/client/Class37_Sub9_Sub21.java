package org.ie.client;

/* Class37_Sub9_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub21 extends Class37_Sub9 {
	public static int anInt3303;
	public static int anInt3304;
	public static RSString aClass16_3305;
	public static int anInt3306 = 0;
	public static int anInt3307;
	public int anInt3308;
	public int anInt3309;
	public static int anInt3310;
	public static int anInt3311;
	public static RSString aClass16_3312;
	public int[] anIntArray3313;
	public static int currentTypedKeyCachePosition;
	public int anInt3315 = -1;
	public static int anInt3316;
	public static int anInt3317;
	public static int anInt3318;
	public static RSString aClass16_3319;
	public static Class37_Sub4_Sub9_Sub1 aClass37_Sub4_Sub9_Sub1_3320;
	public static int anInt3321;

	public Class37_Sub9_Sub21() {
		super(0, false);
	}

	public static void method853(int i) {
		anInt3310++;
		anInt3306 = 0;
		Class37_Sub9_Sub11.anInt3098 = 0;
		Class37_Sub9_Sub34.method907(22884);
		Class37_Sub12.method997(-111);
		Class37_Sub4_Sub7_Sub1.method498(false);
		Class37_Sub9_Sub34.method909(89);
		for (int i_0_ = 0; i_0_ < anInt3306; i_0_++) {
			int i_1_ = Applet_Sub1.anIntArray30[i_0_];
			if ((Class37_Sub7.loopCycle ^ 0xffffffff) != ((Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_1_].anInt3641) ^ 0xffffffff))
				Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_1_] = null;
		}
		if (NodeSub.anInt1844 != Class83.byteVector.pos)
			throw new RuntimeException("gpp1 pos:"
					+ (Class83.byteVector.pos) + " psize:"
					+ NodeSub.anInt1844);
		if (i == -25828) {
			for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (Class19.anInt487 ^ 0xffffffff); i_2_++) {
				if ((Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[Class26.anIntArray657[i_2_]]) == null)
					throw new RuntimeException("gpp2 pos:" + i_2_ + " size:"
							+ Class19.anInt487);
			}
		}
	}

	public int method757(int i) {
		if (i <= 70)
			method856((byte) 26);
		anInt3304++;
		return anInt3315;
	}

	public void method750(ByteVector class37_sub11, int i, boolean bool) {
		if ((i ^ 0xffffffff) == -1)
			anInt3315 = class37_sub11.getUnsignedShort();
		if (bool != true)
			method854((byte) -118);
		anInt3318++;
	}

	public int[][] method759(byte i, int i_3_) {
		int[][] is = aClass33_1946.method298(false, i_3_);
		if (i <= 111)
			method854((byte) 10);
		if (aClass33_1946.aBoolean767 && method855(true)) {
			int[] is_4_ = is[1];
			int[] is_5_ = is[0];
			int[] is_6_ = is[2];
			int i_7_ = anInt3308
					* (anInt3309 == Class37_Sub14.anInt2121 ? i_3_ : i_3_
							* anInt3309 / Class37_Sub14.anInt2121);
			if (Class32.anInt743 == anInt3308) {
				for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (Class32.anInt743 ^ 0xffffffff); i_8_++) {
					int i_9_ = anIntArray3313[i_7_++];
					is_6_[i_8_] = Class37_Sub4_Sub7.method490(
							i_9_ << 1096357860, 4080);
					is_4_[i_8_] = Class37_Sub4_Sub7.method490(
							i_9_ >> 1835102436, 4080);
					is_5_[i_8_] = (Class37_Sub4_Sub7.method490(16711680, i_9_) >> -600161876);
				}
			} else {
				for (int i_10_ = 0; i_10_ < Class32.anInt743; i_10_++) {
					int i_11_ = anInt3308 * i_10_ / Class32.anInt743;
					int i_12_ = anIntArray3313[i_11_ + i_7_];
					is_6_[i_10_] = Class37_Sub4_Sub7.method490(
							i_12_ << -44866364, 4080);
					is_4_[i_10_] = (Class37_Sub4_Sub7.method490(65280, i_12_) >> 283675748);
					is_5_[i_10_] = (Class37_Sub4_Sub7
							.method490(i_12_, 16711680) >> 1902719340);
				}
			}
		}
		anInt3307++;
		return is;
	}

	public static int method854(byte i) {
		if (i != 52)
			method856((byte) -31);
		anInt3303++;
		int i_13_ = RSString.method153(Class37_Sub9_Sub1.anInt2916, OverridedInterface.anInt1888,
				Class19.anInt483);
		if ((-Class37_Sub25.anInt2286 + i_13_ ^ 0xffffffff) > -801
				&& ((Class1.aByteArrayArrayArray63[Class37_Sub9_Sub1.anInt2916][Class19.anInt483 >> -205117753][OverridedInterface.anInt1888 >> -1000517785]) & 0x4 ^ 0xffffffff) != -1)
			return Class37_Sub9_Sub1.anInt2916;
		return 3;
	}

	public boolean method855(boolean bool) {
		anInt3316++;
		if (anIntArray3313 != null)
			return true;
		if (bool != true)
			method854((byte) 37);
		if (anInt3315 >= 0) {
			Sprite class37_sub4_sub9_sub3 = Class37_Sub9_Sub6
					.method781(anInt3315, 107,
							(Class37_Sub4_Sub15.aClass15_2859));
			class37_sub4_sub9_sub3.method642();
			anInt3309 = class37_sub4_sub9_sub3.height;
			anIntArray3313 = class37_sub4_sub9_sub3.pixels;
			anInt3308 = class37_sub4_sub9_sub3.width;
			return true;
		}
		return false;
	}

	public static void method856(byte i) {
		if (i <= 27)
			aClass16_3305 = null;
		aClass16_3319 = null;
		aClass16_3305 = null;
		aClass16_3312 = null;
		aClass37_Sub4_Sub9_Sub1_3320 = null;
	}

	public static int method857(int i, int i_14_, int i_15_) {
		if (i != -44866364)
			return -38;
		anInt3311++;
		long l = (long) (i_14_ + (i_15_ << 2059403280));
		if (Class60.aClass37_Sub4_Sub13_1152 == null
				|| (Class60.aClass37_Sub4_Sub13_1152.hash ^ 0xffffffffffffffffL) != (l ^ 0xffffffffffffffffL))
			return 0;
		return ((Class49.aClass37_Sub11_1006.pos * 99 / (-Class60.aClass37_Sub4_Sub13_1152.aByte2788 + Class49.aClass37_Sub11_1006.buf.length)) + 1);
	}

	static {
		aClass16_3305 = Class37_Sub2.create_rsstring("::gc");
		currentTypedKeyCachePosition = 0;
		aClass16_3312 = Class37_Sub2.create_rsstring("title)3jpg");
		aClass16_3319 = Class37_Sub2.create_rsstring("title_mute");
		anInt3321 = 0;
	}
}
