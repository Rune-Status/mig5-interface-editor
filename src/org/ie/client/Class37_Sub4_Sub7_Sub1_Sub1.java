package org.ie.client;

/* Class37_Sub4_Sub7_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub7_Sub1_Sub1 extends Class37_Sub4_Sub7_Sub1 {
	public static RSString aClass16_3931 = Class37_Sub2.create_rsstring(
			"Aug");
	public static RSString aClass16_3932;
	public static RSString aClass16_3933;
	public static RSString aClass16_3934 = (Class37_Sub2.create_rsstring(
			"Ung-Ultige Verbindung mit einem Anmelde)2Server)3"));
	public static RSString aClass16_3935;
	public static RSString aClass16_3936;
	public static RSString aClass16_3937;
	public static RSString aClass16_3938;
	public static int anInt3939;
	public static RSString aClass16_3940;
	public static int anInt3941;
	public static int anInt3942;
	public static RSString aClass16_3943;
	public static RSString aClass16_3944 = Class37_Sub2.create_rsstring(
			"Nov");
	public static int scrollModifier;
	public static int anInt3946;
	public static RSString aClass16_3947;
	public static boolean[] aBooleanArray3948;
	public static int anInt3949;
	public static int anInt3950;
	public static RSString[] aClass16Array3951;
	public static RSString aClass16_3952;
	public static int anInt3953;
	public static RSString aClass16_3954;
	public Class37_Sub4_Sub15 aClass37_Sub4_Sub15_3955;
	public static RSString aClass16_3956;
	public static int pressed_childs_x;
	public static int anInt3958;
	public static RSString aClass16_3959;

	public boolean method497(int i) {
		anInt3939++;
		if (i != 20542)
			return false;
		if (aClass37_Sub4_Sub15_3955 == null)
			return false;
		return true;
	}

	public Class37_Sub4_Sub7_Sub6 method493(boolean bool) {
		anInt3949++;
		if (aClass37_Sub4_Sub15_3955 == null)
			return null;
		Class37_Sub4_Sub12 class37_sub4_sub12 = ((anInt3655 ^ 0xffffffff) != 0
				&& anInt3689 == 0 ? Class37_Sub9_Sub22
				.method861(anInt3655) : null);
		if (bool != true)
			aClass16_3959 = null;
		Class37_Sub4_Sub12 class37_sub4_sub12_0_ = (anInt3647 == -1
				|| ((anInt3647 ^ 0xffffffff) == (anInt3701 ^ 0xffffffff) && class37_sub4_sub12 != null) ? null
				: Class37_Sub9_Sub22.method861(anInt3647));
		Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = aClass37_Sub4_Sub15_3955
				.method715(class37_sub4_sub12_0_, class37_sub4_sub12,
						anInt3677, anInt3638, (byte) -93);
		if (class37_sub4_sub7_sub6 == null)
			return null;
		class37_sub4_sub7_sub6.method555();
		anInt3691 = class37_sub4_sub7_sub6.anInt2627;
		if ((anInt3636 ^ 0xffffffff) != 0 && anInt3654 != -1) {
			Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6_1_ = Class76
					.method1285((byte) 97, anInt3636)
					.method731(anInt3654, true);
			if (class37_sub4_sub7_sub6_1_ != null) {
				class37_sub4_sub7_sub6_1_.method543(0, -anInt3693, 0);
				class37_sub4_sub7_sub6 = class37_sub4_sub7_sub6
						.method549(class37_sub4_sub7_sub6_1_);
			}
		}
		if ((aClass37_Sub4_Sub15_3955.anInt2858 ^ 0xffffffff) == -2)
			class37_sub4_sub7_sub6.aBoolean3836 = true;
		return class37_sub4_sub7_sub6;
	}

	public static int method502(int i, int i_2_) {
		return i ^ i_2_;
	}

	public static int method503(byte i) {
		if (i != 41)
			return -1;
		int i_3_ = 3;
		if (Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 < 310) {
			int i_4_ = Class19.anInt483 >> 1856091623;
			int i_5_ = OverridedInterface.anInt1888 >> 873819015;
			int i_6_ = (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666 >> -1650489017);
			int i_7_ = (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642 >> 1954378439);
			if (((Class1.aByteArrayArrayArray63[Class37_Sub9_Sub1.anInt2916][i_4_][i_5_]) & 0x4) != 0)
				i_3_ = Class37_Sub9_Sub1.anInt2916;
			int i_8_;
			if (i_6_ <= i_4_)
				i_8_ = -i_6_ + i_4_;
			else
				i_8_ = i_6_ - i_4_;
			int i_9_;
			if (i_5_ >= i_7_)
				i_9_ = -i_7_ + i_5_;
			else
				i_9_ = i_7_ - i_5_;
			if (i_9_ < i_8_) {
				int i_10_ = 32768;
				int i_11_ = i_9_ * 65536 / i_8_;
				while ((i_4_ ^ 0xffffffff) != (i_6_ ^ 0xffffffff)) {
					if ((i_6_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff))
						i_4_++;
					else if (i_6_ < i_4_)
						i_4_--;
					i_10_ += i_11_;
					if ((0x4 & (Class1.aByteArrayArrayArray63[Class37_Sub9_Sub1.anInt2916][i_4_][i_5_]) ^ 0xffffffff) != -1)
						i_3_ = Class37_Sub9_Sub1.anInt2916;
					if (i_10_ >= 65536) {
						i_10_ -= 65536;
						if ((i_5_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff)) {
							if ((i_7_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff))
								i_5_--;
						} else
							i_5_++;
						if (((Class1.aByteArrayArrayArray63[Class37_Sub9_Sub1.anInt2916][i_4_][i_5_]) & 0x4 ^ 0xffffffff) != -1)
							i_3_ = Class37_Sub9_Sub1.anInt2916;
					}
				}
			} else {
				int i_12_ = 32768;
				int i_13_ = i_8_ * 65536 / i_9_;
				while (i_5_ != i_7_) {
					i_12_ += i_13_;
					if ((i_5_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff)) {
						if (i_5_ > i_7_)
							i_5_--;
					} else
						i_5_++;
					if ((0x4 & (Class1.aByteArrayArrayArray63[Class37_Sub9_Sub1.anInt2916][i_4_][i_5_])) != 0)
						i_3_ = Class37_Sub9_Sub1.anInt2916;
					if ((i_12_ ^ 0xffffffff) <= -65537) {
						i_12_ -= 65536;
						if (i_6_ > i_4_)
							i_4_++;
						else if (i_4_ > i_6_)
							i_4_--;
						if ((0x4 & (Class1.aByteArrayArrayArray63[Class37_Sub9_Sub1.anInt2916][i_4_][i_5_]) ^ 0xffffffff) != -1)
							i_3_ = Class37_Sub9_Sub1.anInt2916;
					}
				}
			}
		}
		if ((0x4 & (Class1.aByteArrayArrayArray63[Class37_Sub9_Sub1.anInt2916][(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666 >> 297405575)][(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642 >> -2053889497)])) != 0)
			i_3_ = Class37_Sub9_Sub1.anInt2916;
		anInt3946++;
		return i_3_;
	}

	public static void method504(int i) {
		aClass16_3937 = null;
		aClass16_3934 = null;
		aClass16_3952 = null;
		aClass16_3931 = null;
		aBooleanArray3948 = null;
		if (i != 1954378439)
			aClass16_3932 = null;
		aClass16_3943 = null;
		aClass16_3959 = null;
		aClass16_3944 = null;
		aClass16_3935 = null;
		aClass16_3956 = null;
		aClass16_3940 = null;
		aClass16_3947 = null;
		aClass16_3954 = null;
		aClass16_3932 = null;
		aClass16_3938 = null;
		aClass16_3933 = null;
		aClass16Array3951 = null;
		aClass16_3936 = null;
	}

	public static void method505(RSString rSString, int i,
			RSString class16_14_) {
			Class38.method1052(rSString, i, 38, class16_14_, null);
	}

	static {
		aClass16_3936 = Class37_Sub2.create_rsstring("Mar");
		aClass16_3932 = Class37_Sub2.create_rsstring("Jun");
		aBooleanArray3948 = new boolean[100];
		anInt3950 = 2301979;
		anInt3942 = 1;
		aClass16_3947 = Class37_Sub2.create_rsstring("Sep");
		scrollModifier = 0;
		aClass16_3935 = Class37_Sub2.create_rsstring("May");
		aClass16_3938 = Class37_Sub2.create_rsstring("Feb");
		aClass16_3956 = Class37_Sub2.create_rsstring("Loaded input handler");
		aClass16_3943 = Class37_Sub2.create_rsstring("Dec");
		aClass16_3937 = Class37_Sub2.create_rsstring("Apr");
		aClass16_3940 = Class37_Sub2.create_rsstring("Jan");
		aClass16_3952 = Class37_Sub2.create_rsstring("Jul");
		anInt3953 = 0;
		aClass16_3954 = Class37_Sub2.create_rsstring("Texturen geladen)3");
		aClass16_3933 = Class37_Sub2.create_rsstring("Oct");
		aClass16Array3951 = new RSString[] { aClass16_3940, aClass16_3938,
				aClass16_3936, aClass16_3937, aClass16_3935, aClass16_3932,
				aClass16_3952, aClass16_3931, aClass16_3947, aClass16_3933,
				aClass16_3944, aClass16_3943 };
		aClass16_3959 = aClass16_3956;
		pressed_childs_x = 0;
	}
}
