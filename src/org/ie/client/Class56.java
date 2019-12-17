package org.ie.client;

/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class56 {
	public RSString aClass16_1081;
	public boolean aBoolean1082;
	public static RSString aClass16_1083 = (Class37_Sub2.create_rsstring(
			"Sie haben gerade eine andere Welt verlassen)3"));
	public static RSString aClass16_1084;
	public static int anInt1085;
	public int anInt1086;
	public static RSString aClass16_1087;
	public static RSString aClass16_1088 = Class37_Sub2.create_rsstring(
			"Lade Benutzeroberfl-=che )2 ");
	public int anInt1089;
	public int anInt1090;
	public static int anInt1091;
	public static Class37_Sub4_Sub9_Sub1[] aClass37_Sub4_Sub9_Sub1Array1092;
	public int anInt1093;
	public static RSString aClass16_1094;
	public static Sprite aClass37_Sub4_Sub9_Sub3_1095;
	public static RSString aClass16_1096;
	public static RSString aClass16_1097;

	public static void method1143(byte i) {
		for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (Class37_Sub9_Sub11.anInt3098 ^ 0xffffffff); i_0_++) {
			int i_1_ = Class36.anIntArray809[i_0_];
			Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_1_];
			int i_2_ = Class83.byteVector.getUnsignedByte();
			if ((i_2_ & 0x10) != 0) {
				int i_3_ = Class83.byteVector.method956(2);
				int i_4_ = Class83.byteVector.getByteC((byte) 35);
				if (i_3_ == 65535)
					i_3_ = -1;
				if (i_3_ == class37_sub4_sub7_sub1_sub1.anInt3655 && i_3_ != -1) {
					int i_5_ = Class37_Sub9_Sub22.method861(i_3_).anInt2760;
					if ((i_5_ ^ 0xffffffff) == -2) {
						class37_sub4_sub7_sub1_sub1.anInt3677 = 0;
						class37_sub4_sub7_sub1_sub1.anInt3680 = 0;
						class37_sub4_sub7_sub1_sub1.anInt3689 = i_4_;
						class37_sub4_sub7_sub1_sub1.anInt3659 = 0;
					}
					if ((i_5_ ^ 0xffffffff) == -3)
						class37_sub4_sub7_sub1_sub1.anInt3659 = 0;
				} else if (i_3_ == -1
						|| class37_sub4_sub7_sub1_sub1.anInt3655 == -1
						|| ((Class37_Sub9_Sub22.method861(i_3_).anInt2762) >= (Class37_Sub9_Sub22
								.method861(class37_sub4_sub7_sub1_sub1.anInt3655).anInt2762))) {
					class37_sub4_sub7_sub1_sub1.anInt3655 = i_3_;
					class37_sub4_sub7_sub1_sub1.anInt3659 = 0;
					class37_sub4_sub7_sub1_sub1.anInt3640 = class37_sub4_sub7_sub1_sub1.anInt3645;
					class37_sub4_sub7_sub1_sub1.anInt3677 = 0;
					class37_sub4_sub7_sub1_sub1.anInt3689 = i_4_;
					class37_sub4_sub7_sub1_sub1.anInt3680 = 0;
				}
			}
			if ((0x4 & i_2_ ^ 0xffffffff) != -1) {
				class37_sub4_sub7_sub1_sub1.anInt3653 = Class83.byteVector
						.getUnsignedShort();
				if (class37_sub4_sub7_sub1_sub1.anInt3653 == 65535)
					class37_sub4_sub7_sub1_sub1.anInt3653 = -1;
			}
			if ((0x2 & i_2_) != 0) {
				class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955 = (Class37_Sub9_Sub34
						.method912(-119, Class83.byteVector.method956(2)));
				class37_sub4_sub7_sub1_sub1.anInt3678 = (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955.anInt2844);
				class37_sub4_sub7_sub1_sub1.anInt3696 = (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955.anInt2828);
				class37_sub4_sub7_sub1_sub1.anInt3660 = (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955.anInt2822);
				class37_sub4_sub7_sub1_sub1.anInt3668 = (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955.anInt2834);
				class37_sub4_sub7_sub1_sub1.anInt3683 = (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955.anInt2858);
				class37_sub4_sub7_sub1_sub1.anInt3701 = (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955.anInt2814);
				class37_sub4_sub7_sub1_sub1.anInt3686 = (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955.anInt2837);
				class37_sub4_sub7_sub1_sub1.anInt3676 = (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955.anInt2860);
				class37_sub4_sub7_sub1_sub1.anInt3657 = (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955.anInt2815);
			}
			if ((i_2_ & 0x40 ^ 0xffffffff) != -1) {
				class37_sub4_sub7_sub1_sub1.anInt3687 = Class83.byteVector
						.method956(2);
				class37_sub4_sub7_sub1_sub1.anInt3679 = Class83.byteVector
						.method956(2);
			}
			if ((0x80 & i_2_) != 0) {
				int i_6_ = Class83.byteVector.getUnsignedByte();
				int i_7_ = Class83.byteVector.method952((byte) 31);
				class37_sub4_sub7_sub1_sub1.method496(Class37_Sub7.loopCycle,
						i_6_, (byte) 104, i_7_);
				class37_sub4_sub7_sub1_sub1.anInt3697 = 300 + Class37_Sub7.loopCycle;
				class37_sub4_sub7_sub1_sub1.anInt3692 = Class83.byteVector
						.getUnsignedByte();
				class37_sub4_sub7_sub1_sub1.anInt3690 = Class83.byteVector
						.method967(255);
			}
			if ((0x20 & i_2_) != 0) {
				int i_8_ = Class83.byteVector.method952((byte) 91);
				int i_9_ = Class83.byteVector.method952((byte) 110);
				class37_sub4_sub7_sub1_sub1.method496(Class37_Sub7.loopCycle,
						i_8_, (byte) -48, i_9_);
				class37_sub4_sub7_sub1_sub1.anInt3697 = Class37_Sub7.loopCycle + 300;
				class37_sub4_sub7_sub1_sub1.anInt3692 = Class83.byteVector
						.method952((byte) 90);
				class37_sub4_sub7_sub1_sub1.anInt3690 = Class83.byteVector
						.method952((byte) -128);
			}
			if ((0x1 & i_2_) != 0) {
				class37_sub4_sub7_sub1_sub1.aClass16_3694 = Class83.byteVector
						.getRS2String();
				class37_sub4_sub7_sub1_sub1.anInt3662 = 100;
			}
			if ((i_2_ & 0x8) != 0) {
				class37_sub4_sub7_sub1_sub1.anInt3636 = Class83.byteVector
						.method984(-1739943584);
				int i_10_ = Class83.byteVector.getInt1(i + 8100);
				class37_sub4_sub7_sub1_sub1.anInt3664 = 0;
				class37_sub4_sub7_sub1_sub1.anInt3652 = (i_10_ & 0xffff)
						+ Class37_Sub7.loopCycle;
				class37_sub4_sub7_sub1_sub1.anInt3654 = 0;
				if (class37_sub4_sub7_sub1_sub1.anInt3652 > Class37_Sub7.loopCycle)
					class37_sub4_sub7_sub1_sub1.anInt3654 = -1;
				if (class37_sub4_sub7_sub1_sub1.anInt3636 == 65535)
					class37_sub4_sub7_sub1_sub1.anInt3636 = -1;
				class37_sub4_sub7_sub1_sub1.anInt3693 = i_10_ >> 257836912;
			}
		}
		if (i != 91)
			aClass16_1084 = null;
		anInt1085++;
	}

	public static void method1144(int i, int i_11_, int i_12_, int i_13_,
			Class67 class67, boolean bool, int i_14_, int i_15_, Class20 class20) {
		try {
			anInt1091++;
			if (!ClientScriptDef.aBoolean2613
					|| (Class1.aByteArrayArrayArray63[0][i_15_][i_14_] & 0x2 ^ 0xffffffff) != -1
					|| ((0x10 & Class1.aByteArrayArrayArray63[i_13_][i_15_][i_14_] ^ 0xffffffff) == -1 && (Class37_Sub17
							.method1013(115, i_13_, i_15_, i_14_) ^ 0xffffffff) == (Class44.anInt963 ^ 0xffffffff))) {
				if ((Class42.anInt944 ^ 0xffffffff) < (i_13_ ^ 0xffffffff))
					Class42.anInt944 = i_13_;
				Class37_Sub4_Sub11 class37_sub4_sub11 = Class37_Sub9_Sub8
						.method794(i, 28067);
				int i_16_;
				int i_17_;
				if ((i_12_ ^ 0xffffffff) == -2 || (i_12_ ^ 0xffffffff) == -4) {
					i_17_ = class37_sub4_sub11.anInt2743;
					i_16_ = class37_sub4_sub11.anInt2731;
				} else {
					i_16_ = class37_sub4_sub11.anInt2743;
					i_17_ = class37_sub4_sub11.anInt2731;
				}
				int i_18_;
				int i_19_;
				if (i_17_ + i_15_ > 104) {
					i_19_ = i_15_;
					i_18_ = i_15_ + 1;
				} else {
					i_18_ = i_15_ + (1 + i_17_ >> -562837631);
					i_19_ = (i_17_ >> -802622943) + i_15_;
				}
				int i_20_;
				int i_21_;
				if ((i_16_ + i_14_ ^ 0xffffffff) < -105) {
					i_21_ = i_14_;
					i_20_ = i_14_ + 1;
				} else {
					i_20_ = i_14_ + (i_16_ - -1 >> -880144287);
					i_21_ = i_14_ + (i_16_ >> 654220577);
				}
				int[][] is = Class64.anIntArrayArrayArray1217[i_13_];
				int i_22_ = (is[i_18_][i_20_]
						+ (is[i_19_][i_21_] + is[i_18_][i_21_] - -is[i_19_][i_20_]) >> 1514952130);
				int i_23_ = (i_15_ << 71142471) - -(i_17_ << 726885190);
				if (bool != false)
					method1143((byte) -34);
				int i_24_ = ((i << -863493650) + i_15_ + ((i_14_ << -1598226361) - -1073741824));
				int i_25_ = (i_16_ << -2123771546) + (i_14_ << 1883500839);
				if ((class37_sub4_sub11.anInt2726 ^ 0xffffffff) == -1)
					i_24_ += -2147483648;
				int i_26_ = i_11_ + (i_12_ << 1379350278);
				if (class37_sub4_sub11.anInt2719 == 1)
					i_26_ += 256;
				if (class37_sub4_sub11.method687(-9383))
					Class37_Sub9_Sub34.method908(0, i_13_, i_12_,
							class37_sub4_sub11, i_15_, i_14_);
				if ((i_11_ ^ 0xffffffff) == -23) {
					if (!ClientScriptDef.aBoolean2613
							|| class37_sub4_sub11.anInt2726 != 0
							|| class37_sub4_sub11.anInt2740 == 1
							|| class37_sub4_sub11.aBoolean2728) {
						Class37_Sub4_Sub7 class37_sub4_sub7;
						if (class37_sub4_sub11.anInt2730 != -1
								|| class37_sub4_sub11.anIntArray2702 != null)
							class37_sub4_sub7 = (new Class37_Sub4_Sub7_Sub5(i,
									22, i_12_, i_13_, i_15_, i_14_,
									class37_sub4_sub11.anInt2730, true, null));
						else
							class37_sub4_sub7 = class37_sub4_sub11.method688(
									i_25_, 64, 22, i_22_, i_23_, is, i_12_);
						class67.method1225(i_13_, i_15_, i_14_, i_22_,
								class37_sub4_sub7, i_24_, i_26_);
						if ((class37_sub4_sub11.anInt2740 ^ 0xffffffff) == -2
								&& class20 != null)
							class20.method222(26108, i_14_, i_15_);
					}
				} else if ((i_11_ ^ 0xffffffff) == -11 || i_11_ == 11) {
					Class37_Sub4_Sub7 class37_sub4_sub7;
					if (class37_sub4_sub11.anInt2730 != -1
							|| class37_sub4_sub11.anIntArray2702 != null)
						class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i, 10,
								i_12_, i_13_, i_15_, i_14_,
								(class37_sub4_sub11.anInt2730), true, null);
					else
						class37_sub4_sub7 = class37_sub4_sub11.method688(i_25_,
								64, 10, i_22_, i_23_, is, i_12_);
					if (class37_sub4_sub7 != null
							&& class67.method1203(i_13_, i_15_, i_14_, i_22_,
									i_17_, i_16_, class37_sub4_sub7,
									i_11_ != 11 ? 0 : 256, i_24_, i_26_)
							&& class37_sub4_sub11.aBoolean2694) {
						int i_27_ = 15;
						if (class37_sub4_sub7 instanceof Class37_Sub4_Sub7_Sub6) {
							i_27_ = ((Class37_Sub4_Sub7_Sub6) class37_sub4_sub7)
									.method545() / 4;
							if ((i_27_ ^ 0xffffffff) < -31)
								i_27_ = 30;
						}
						for (int i_28_ = 0; (i_17_ ^ 0xffffffff) <= (i_28_ ^ 0xffffffff); i_28_++) {
							for (int i_29_ = 0; i_16_ >= i_29_; i_29_++) {
								if ((i_27_ ^ 0xffffffff) < ((Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][i_15_
										- -i_28_][i_14_ + i_29_]) ^ 0xffffffff))
									Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][i_28_
											+ i_15_][i_14_ + i_29_] = (byte) i_27_;
							}
						}
					}
					if (class37_sub4_sub11.anInt2740 != 0 && class20 != null)
						class20.method223(i_14_, i_16_, -1, i_17_, i_15_,
								class37_sub4_sub11.aBoolean2700);
				} else if ((i_11_ ^ 0xffffffff) <= -13) {
					Class37_Sub4_Sub7 class37_sub4_sub7;
					if ((class37_sub4_sub11.anInt2730 ^ 0xffffffff) == 0
							&& class37_sub4_sub11.anIntArray2702 == null)
						class37_sub4_sub7 = class37_sub4_sub11.method688(i_25_,
								64, i_11_, i_22_, i_23_, is, i_12_);
					else
						class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i,
								i_11_, i_12_, i_13_, i_15_, i_14_,
								(class37_sub4_sub11.anInt2730), true, null);
					class67.method1203(i_13_, i_15_, i_14_, i_22_, 1, 1,
							class37_sub4_sub7, 0, i_24_, i_26_);
					if ((i_11_ ^ 0xffffffff) <= -13 && i_11_ <= 17
							&& (i_11_ ^ 0xffffffff) != -14
							&& (i_13_ ^ 0xffffffff) < -1)
						Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][i_14_] = (Class37_Sub9_Sub13
								.method817(
										(Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][i_14_]),
										2340));
					if (class37_sub4_sub11.anInt2740 != 0 && class20 != null)
						class20.method223(i_14_, i_16_, -1, i_17_, i_15_,
								class37_sub4_sub11.aBoolean2700);
				} else if ((i_11_ ^ 0xffffffff) == -1) {
					Class37_Sub4_Sub7 class37_sub4_sub7;
					if ((class37_sub4_sub11.anInt2730 ^ 0xffffffff) == 0
							&& class37_sub4_sub11.anIntArray2702 == null)
						class37_sub4_sub7 = class37_sub4_sub11.method688(i_25_,
								64, 0, i_22_, i_23_, is, i_12_);
					else
						class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i, 0,
								i_12_, i_13_, i_15_, i_14_,
								(class37_sub4_sub11.anInt2730), true, null);
					class67.method1193(i_13_, i_15_, i_14_, i_22_,
							class37_sub4_sub7, null,
							Class37_Sub14.anIntArray2126[i_12_], 0, i_24_,
							i_26_);
					if (i_12_ == 0) {
						if (class37_sub4_sub11.aBoolean2694) {
							Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][i_15_][i_14_] = (byte) 50;
							Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][i_15_][i_14_
									- -1] = (byte) 50;
						}
						if (class37_sub4_sub11.aBoolean2747)
							Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][i_14_] = (Class37_Sub9_Sub13
									.method817(
											(Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][i_14_]),
											585));
					} else if (i_12_ == 1) {
						if (class37_sub4_sub11.aBoolean2694) {
							Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][i_15_][i_14_ + 1] = (byte) 50;
							Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][i_15_
									- -1][1 + i_14_] = (byte) 50;
						}
						if (class37_sub4_sub11.aBoolean2747)
							Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][1 + i_14_] = (Class37_Sub9_Sub13
									.method817(
											(Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][1 + i_14_]),
											1170));
					} else if ((i_12_ ^ 0xffffffff) == -3) {
						if (class37_sub4_sub11.aBoolean2694) {
							Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][i_15_ + 1][i_14_] = (byte) 50;
							Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][i_15_
									- -1][i_14_ - -1] = (byte) 50;
						}
						if (class37_sub4_sub11.aBoolean2747)
							Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][1 + i_15_][i_14_] = (Class37_Sub9_Sub13
									.method817(
											(Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][1 + i_15_][i_14_]),
											585));
					} else if ((i_12_ ^ 0xffffffff) == -4) {
						if (class37_sub4_sub11.aBoolean2694) {
							Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][i_15_][i_14_] = (byte) 50;
							Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][i_15_ + 1][i_14_] = (byte) 50;
						}
						if (class37_sub4_sub11.aBoolean2747)
							Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][i_14_] = (Class37_Sub9_Sub13
									.method817(
											(Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][i_14_]),
											1170));
					}
					if (class37_sub4_sub11.anInt2740 != 0 && class20 != null)
						class20.method217(i_14_, (byte) -105,
								class37_sub4_sub11.aBoolean2700, i_11_, i_15_,
								i_12_);
					if ((class37_sub4_sub11.anInt2725 ^ 0xffffffff) != -17)
						class67.method1200(i_13_, i_15_, i_14_,
								class37_sub4_sub11.anInt2725);
				} else if ((i_11_ ^ 0xffffffff) == -2) {
					Class37_Sub4_Sub7 class37_sub4_sub7;
					if (class37_sub4_sub11.anInt2730 == -1
							&& class37_sub4_sub11.anIntArray2702 == null)
						class37_sub4_sub7 = class37_sub4_sub11.method688(i_25_,
								64, 1, i_22_, i_23_, is, i_12_);
					else
						class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i, 1,
								i_12_, i_13_, i_15_, i_14_,
								(class37_sub4_sub11.anInt2730), true, null);
					class67.method1193(i_13_, i_15_, i_14_, i_22_,
							class37_sub4_sub7, null,
							(Class37_Sub9_Sub35.anIntArray3561[i_12_]), 0,
							i_24_, i_26_);
					if (class37_sub4_sub11.aBoolean2694) {
						if ((i_12_ ^ 0xffffffff) != -1) {
							if ((i_12_ ^ 0xffffffff) != -2) {
								if (i_12_ != 2) {
									if (i_12_ == 3)
										Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][i_15_][i_14_] = (byte) 50;
								} else
									Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][1 + i_15_][i_14_] = (byte) 50;
							} else
								Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][1 + i_15_][i_14_ + 1] = (byte) 50;
						} else
							Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][i_15_][i_14_ + 1] = (byte) 50;
					}
					if (class37_sub4_sub11.anInt2740 != 0 && class20 != null)
						class20.method217(i_14_, (byte) -124,
								class37_sub4_sub11.aBoolean2700, i_11_, i_15_,
								i_12_);
				} else if (i_11_ == 2) {
					int i_30_ = i_12_ + 1 & 0x3;
					Class37_Sub4_Sub7 class37_sub4_sub7;
					Class37_Sub4_Sub7 class37_sub4_sub7_31_;
					if ((class37_sub4_sub11.anInt2730 ^ 0xffffffff) == 0
							&& class37_sub4_sub11.anIntArray2702 == null) {
						class37_sub4_sub7 = class37_sub4_sub11.method688(i_25_,
								64, 2, i_22_, i_23_, is, 4 - -i_12_);
						class37_sub4_sub7_31_ = class37_sub4_sub11.method688(
								i_25_, 64, 2, i_22_, i_23_, is, i_30_);
					} else {
						class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i, 2,
								4 + i_12_, i_13_, i_15_, i_14_,
								(class37_sub4_sub11.anInt2730), true, null);
						class37_sub4_sub7_31_ = new Class37_Sub4_Sub7_Sub5(i,
								2, i_30_, i_13_, i_15_, i_14_,
								(class37_sub4_sub11.anInt2730), true, null);
					}
					class67.method1193(i_13_, i_15_, i_14_, i_22_,
							class37_sub4_sub7, class37_sub4_sub7_31_,
							Class37_Sub14.anIntArray2126[i_12_],
							Class37_Sub14.anIntArray2126[i_30_], i_24_, i_26_);
					if (class37_sub4_sub11.aBoolean2747) {
						if ((i_12_ ^ 0xffffffff) != -1) {
							if (i_12_ == 1) {
								Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][1 + i_14_] = (Class37_Sub9_Sub13
										.method817(
												(Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][1 + i_14_]),
												1170));
								Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][1 + i_15_][i_14_] = (Class37_Sub9_Sub13
										.method817(
												(Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][1 + i_15_][i_14_]),
												585));
							} else if ((i_12_ ^ 0xffffffff) != -3) {
								if ((i_12_ ^ 0xffffffff) == -4) {
									Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][i_14_] = (Class37_Sub9_Sub13
											.method817(
													(Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][i_14_]),
													1170));
									Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][i_14_] = (Class37_Sub9_Sub13
											.method817(
													(Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][i_14_]),
													585));
								}
							} else {
								Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_ + 1][i_14_] = (Class37_Sub9_Sub13
										.method817(
												(Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_ + 1][i_14_]),
												585));
								Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][i_14_] = (Class37_Sub9_Sub13
										.method817(
												(Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][i_14_]),
												1170));
							}
						} else {
							Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][i_14_] = (Class37_Sub9_Sub13
									.method817(
											(Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][i_14_]),
											585));
							Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][1 + i_14_] = (Class37_Sub9_Sub13
									.method817(
											(Class37_Sub9_Sub1.anIntArrayArrayArray2924[i_13_][i_15_][1 + i_14_]),
											1170));
						}
					}
					if (class37_sub4_sub11.anInt2740 != 0 && class20 != null)
						class20.method217(i_14_, (byte) 89,
								class37_sub4_sub11.aBoolean2700, i_11_, i_15_,
								i_12_);
					if (class37_sub4_sub11.anInt2725 != 16)
						class67.method1200(i_13_, i_15_, i_14_,
								class37_sub4_sub11.anInt2725);
				} else if ((i_11_ ^ 0xffffffff) == -4) {
					Class37_Sub4_Sub7 class37_sub4_sub7;
					if ((class37_sub4_sub11.anInt2730 ^ 0xffffffff) != 0
							|| class37_sub4_sub11.anIntArray2702 != null)
						class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i, 3,
								i_12_, i_13_, i_15_, i_14_,
								(class37_sub4_sub11.anInt2730), true, null);
					else
						class37_sub4_sub7 = class37_sub4_sub11.method688(i_25_,
								64, 3, i_22_, i_23_, is, i_12_);
					class67.method1193(i_13_, i_15_, i_14_, i_22_,
							class37_sub4_sub7, null,
							(Class37_Sub9_Sub35.anIntArray3561[i_12_]), 0,
							i_24_, i_26_);
					if (class37_sub4_sub11.aBoolean2694) {
						if (i_12_ == 0)
							Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][i_15_][i_14_ + 1] = (byte) 50;
						else if (i_12_ != 1) {
							if (i_12_ == 2)
								Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][1 + i_15_][i_14_] = (byte) 50;
							else if ((i_12_ ^ 0xffffffff) == -4)
								Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][i_15_][i_14_] = (byte) 50;
						} else
							Class37_Sub9_Sub26.aByteArrayArrayArray3391[i_13_][i_15_ + 1][1 + i_14_] = (byte) 50;
					}
					if ((class37_sub4_sub11.anInt2740 ^ 0xffffffff) != -1
							&& class20 != null)
						class20.method217(i_14_, (byte) -126,
								class37_sub4_sub11.aBoolean2700, i_11_, i_15_,
								i_12_);
				} else if ((i_11_ ^ 0xffffffff) == -10) {
					Class37_Sub4_Sub7 class37_sub4_sub7;
					if (class37_sub4_sub11.anInt2730 == -1
							&& class37_sub4_sub11.anIntArray2702 == null)
						class37_sub4_sub7 = class37_sub4_sub11.method688(i_25_,
								64, i_11_, i_22_, i_23_, is, i_12_);
					else
						class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i,
								i_11_, i_12_, i_13_, i_15_, i_14_,
								(class37_sub4_sub11.anInt2730), true, null);
					class67.method1203(i_13_, i_15_, i_14_, i_22_, 1, 1,
							class37_sub4_sub7, 0, i_24_, i_26_);
					if ((class37_sub4_sub11.anInt2740 ^ 0xffffffff) != -1
							&& class20 != null)
						class20.method223(i_14_, i_16_, -1, i_17_, i_15_,
								class37_sub4_sub11.aBoolean2700);
					if (class37_sub4_sub11.anInt2725 != 16)
						class67.method1200(i_13_, i_15_, i_14_,
								class37_sub4_sub11.anInt2725);
				} else if (i_11_ == 4) {
					Class37_Sub4_Sub7 class37_sub4_sub7;
					if ((class37_sub4_sub11.anInt2730 ^ 0xffffffff) != 0
							|| class37_sub4_sub11.anIntArray2702 != null)
						class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i, 4,
								i_12_, i_13_, i_15_, i_14_,
								(class37_sub4_sub11.anInt2730), true, null);
					else
						class37_sub4_sub7 = class37_sub4_sub11.method688(i_25_,
								64, 4, i_22_, i_23_, is, i_12_);
					class67.method1201(i_13_, i_15_, i_14_, i_22_,
							class37_sub4_sub7, null,
							Class37_Sub14.anIntArray2126[i_12_], 0, 0, 0,
							i_24_, i_26_);
				} else if ((i_11_ ^ 0xffffffff) == -6) {
					int i_32_ = 16;
					int i_33_ = class67.method1230(i_13_, i_15_, i_14_);
					if ((i_33_ ^ 0xffffffff) != -1)
						i_32_ = (Class37_Sub9_Sub8.method794(
								0x7fff & i_33_ >> 1474908814, 28067).anInt2725);
					Class37_Sub4_Sub7 class37_sub4_sub7;
					if ((class37_sub4_sub11.anInt2730 ^ 0xffffffff) != 0
							|| class37_sub4_sub11.anIntArray2702 != null)
						class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i, 4,
								i_12_, i_13_, i_15_, i_14_,
								(class37_sub4_sub11.anInt2730), true, null);
					else
						class37_sub4_sub7 = class37_sub4_sub11.method688(i_25_,
								64, 4, i_22_, i_23_, is, i_12_);
					class67.method1201(i_13_, i_15_, i_14_, i_22_,
							class37_sub4_sub7, null,
							Class37_Sub14.anIntArray2126[i_12_], 0,
							MouseHandler.anIntArray171[i_12_] * i_32_,
							(Class37_Sub9_Sub4.anIntArray2983[i_12_] * i_32_),
							i_24_, i_26_);
				} else if (i_11_ == 6) {
					int i_34_ = 8;
					int i_35_ = class67.method1230(i_13_, i_15_, i_14_);
					if ((i_35_ ^ 0xffffffff) != -1)
						i_34_ = (Class37_Sub9_Sub8.method794(
								i_35_ >> 1138981102 & 0x7fff, 28067).anInt2725) / 2;
					Class37_Sub4_Sub7 class37_sub4_sub7;
					if (class37_sub4_sub11.anInt2730 != -1
							|| class37_sub4_sub11.anIntArray2702 != null)
						class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i, 4,
								4 + i_12_, i_13_, i_15_, i_14_,
								(class37_sub4_sub11.anInt2730), true, null);
					else
						class37_sub4_sub7 = class37_sub4_sub11.method688(i_25_,
								64, 4, i_22_, i_23_, is, 4 + i_12_);
					class67.method1201(i_13_, i_15_, i_14_, i_22_,
							class37_sub4_sub7, null, 256, i_12_,
							Class44.anIntArray965[i_12_] * i_34_,
							(Class37_Sub9_Sub9.anIntArray3081[i_12_] * i_34_),
							i_24_, i_26_);
				} else if (i_11_ == 7) {
					int i_36_ = 2 + i_12_ & 0x3;
					Class37_Sub4_Sub7 class37_sub4_sub7;
					if ((class37_sub4_sub11.anInt2730 ^ 0xffffffff) != 0
							|| class37_sub4_sub11.anIntArray2702 != null)
						class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i, 4,
								4 + i_36_, i_13_, i_15_, i_14_,
								(class37_sub4_sub11.anInt2730), true, null);
					else
						class37_sub4_sub7 = class37_sub4_sub11.method688(i_25_,
								64, 4, i_22_, i_23_, is, i_36_ + 4);
					class67.method1201(i_13_, i_15_, i_14_, i_22_,
							class37_sub4_sub7, null, 256, i_36_, 0, 0, i_24_,
							i_26_);
				} else if ((i_11_ ^ 0xffffffff) == -9) {
					int i_37_ = 8;
					int i_38_ = class67.method1230(i_13_, i_15_, i_14_);
					if (i_38_ != 0)
						i_37_ = (Class37_Sub9_Sub8.method794(
								(i_38_ & 0x1fffc312) >> 51884814, 28067).anInt2725) / 2;
					int i_39_ = 2 + i_12_ & 0x3;
					Class37_Sub4_Sub7 class37_sub4_sub7;
					Class37_Sub4_Sub7 class37_sub4_sub7_40_;
					if ((class37_sub4_sub11.anInt2730 ^ 0xffffffff) == 0
							&& class37_sub4_sub11.anIntArray2702 == null) {
						class37_sub4_sub7 = class37_sub4_sub11.method688(i_25_,
								64, 4, i_22_, i_23_, is, i_12_ - -4);
						class37_sub4_sub7_40_ = class37_sub4_sub11.method688(
								i_25_, 64, 4, i_22_, i_23_, is, i_39_ + 4);
					} else {
						class37_sub4_sub7 = new Class37_Sub4_Sub7_Sub5(i, 4,
								i_12_ - -4, i_13_, i_15_, i_14_,
								(class37_sub4_sub11.anInt2730), true, null);
						class37_sub4_sub7_40_ = new Class37_Sub4_Sub7_Sub5(i,
								4, i_39_ + 4, i_13_, i_15_, i_14_,
								(class37_sub4_sub11.anInt2730), true, null);
					}
					class67.method1201(i_13_, i_15_, i_14_, i_22_,
							class37_sub4_sub7, class37_sub4_sub7_40_, 256,
							i_12_, i_37_ * Class44.anIntArray965[i_12_],
							(Class37_Sub9_Sub9.anIntArray3081[i_12_] * i_37_),
							i_24_, i_26_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("pc.A("
					+ i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ','
					+ (class67 != null ? "{...}" : "null") + ',' + bool + ','
					+ i_14_ + ',' + i_15_ + ','
					+ (class20 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1145(byte i) {
		aClass16_1088 = null;
		aClass37_Sub4_Sub9_Sub1Array1092 = null;
		if (i != 125)
			method1144(23, -61, -54, 110, null, true, -58, 16, null);
		aClass16_1083 = null;
		aClass16_1087 = null;
		aClass16_1084 = null;
		aClass16_1096 = null;
		aClass37_Sub4_Sub9_Sub3_1095 = null;
		aClass16_1094 = null;
		aClass16_1097 = null;
	}

	static {
		aClass16_1084 = Class37_Sub2.create_rsstring("Please try again)3");
		aClass16_1087 = Class37_Sub2.create_rsstring(" has logged out)3");
		aClass16_1094 = aClass16_1084;
		aClass16_1096 = Class37_Sub2.create_rsstring("p11_full");
		aClass16_1097 = aClass16_1087;
	}
}
