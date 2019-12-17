package org.ie.client;

/* Class37_Sub4_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub15 extends NodeSub {
	public boolean aBoolean2811;
	public static int anInt2812;
	public static RSString aClass16_2813 = Class37_Sub2.create_rsstring(
			"oder benutzen Sie eine andere Welt)3");
	public int anInt2814;
	public int anInt2815 = -1;
	public static RSString aClass16_2816;
	public static int anInt2817;
	public static RSString aClass16_2818;
	public int anInt2819;
	public int[] anIntArray2820;
	public short[] aShortArray2821;
	public int anInt2822;
	public boolean aBoolean2823;
	public int[] anIntArray2824;
	public int anInt2825 = -1;
	public static int anInt2826;
	public static RSString aClass16_2827;
	public int anInt2828;
	public int anInt2829;
	public short[] aShortArray2830;
	public static RSString aClass16_2831 = (Class37_Sub2.create_rsstring(
			"Spieler)3 Bitte w-=hlen Sie eine andere Welt)3"));
	public int anInt2832;
	public static RSString aClass16_2833;
	public int anInt2834;
	public static Class15 aClass15_2835;
	public short[] aShortArray2836;
	public int anInt2837;
	public static int anInt2838;
	public static int anInt2839;
	public static int anInt2840;
	public static int anInt2841;
	public int anInt2842;
	public static int anInt2843;
	public int anInt2844;
	public static int anInt2845;
	public int anInt2846;
	public boolean aBoolean2847;
	public static int anInt2848;
	public static RSString aClass16_2849;
	public static int anInt2850;
	public static RSString aClass16_2851 = Class37_Sub2.create_rsstring(
			"wave:");
	public RSString aClass16_2852;
	public int anInt2853;
	public int anInt2854;
	public int anInt2855;
	public int[] anIntArray2856;
	public static RSString aClass16_2857;
	public int anInt2858;
	public static Class15 aClass15_2859;
	public int anInt2860;
	public RSString[] aClass16Array2861;
	public short[] aShortArray2862;
	public boolean aBoolean2863;

	public static void method712(byte i, int i_0_) {
		if (i != 61)
			aClass15_2835 = null;
		anInt2845++;
		if (InterfaceClickMask.loadExists(i_0_))
			Class37_Sub5.method734(1115623280, (Class37_Sub9_Sub29.mainInterfaceArray[i_0_]), -1);
	}

	public static void method713(byte i) {
		aClass15_2859 = null;
		aClass16_2857 = null;
		aClass16_2827 = null;
		aClass16_2849 = null;
		aClass16_2818 = null;
		aClass16_2833 = null;
		if (i < -22) {
			aClass16_2813 = null;
			aClass16_2831 = null;
			aClass16_2816 = null;
			aClass16_2851 = null;
			aClass15_2835 = null;
		}
	}

	public void method714(byte i, int i_1_, ByteVector class37_sub11) {
		anInt2840++;
		if (i_1_ != 1) {
			if (i_1_ == 2)
				aClass16_2852 = class37_sub11.getRS2String();
			else if ((i_1_ ^ 0xffffffff) != -13) {
				if (i_1_ == 13)
					anInt2814 = class37_sub11.getUnsignedShort();
				else if ((i_1_ ^ 0xffffffff) != -15) {
					if (i_1_ == 15)
						anInt2837 = class37_sub11.getUnsignedShort();
					else if (i_1_ != 16) {
						if (i_1_ != 17) {
							if ((i_1_ ^ 0xffffffff) <= -31 && i_1_ < 35) {
								aClass16Array2861[-30 + i_1_] = class37_sub11
										.getRS2String();
								if (aClass16Array2861[-30 + i_1_].method159(
										ByteVector.hiddenString, (byte) 125))
									aClass16Array2861[-30 + i_1_] = null;
							} else if (i_1_ != 40) {
								if ((i_1_ ^ 0xffffffff) != -42) {
									if (i_1_ != 60) {
										if ((i_1_ ^ 0xffffffff) != -94) {
											if (i_1_ == 95)
												anInt2819 = class37_sub11
														.getUnsignedShort();
											else if ((i_1_ ^ 0xffffffff) == -98)
												anInt2854 = class37_sub11
														.getUnsignedShort();
											else if (i_1_ != 98) {
												if (i_1_ != 99) {
													if (i_1_ == 100)
														anInt2832 = (class37_sub11
																.method982((byte) 122));
													else if (i_1_ == 101)
														anInt2853 = ((class37_sub11
																.method982((byte) 105)) * 5);
													else if (i_1_ != 102) {
														if (i_1_ == 103)
															anInt2834 = (class37_sub11
																	.getUnsignedShort());
														else if (i_1_ == 106) {
															anInt2846 = (class37_sub11
																	.getUnsignedShort());
															if (anInt2846 == 65535)
																anInt2846 = -1;
															anInt2825 = (class37_sub11
																	.getUnsignedShort());
															if (anInt2825 == 65535)
																anInt2825 = -1;
															int i_2_ = (class37_sub11
																	.getUnsignedByte());
															anIntArray2824 = (new int[1 + i_2_]);
															for (int i_3_ = 0; ((i_3_ ^ 0xffffffff) >= (i_2_ ^ 0xffffffff)); i_3_++) {
																anIntArray2824[i_3_] = (class37_sub11
																		.getUnsignedShort());
																if (((anIntArray2824[i_3_]) ^ 0xffffffff) == -65536)
																	anIntArray2824[i_3_] = -1;
															}
														} else if (i_1_ == 107)
															aBoolean2811 = false;
														else if ((i_1_ ^ 0xffffffff) == -110)
															aBoolean2847 = false;
													} else
														anInt2829 = (class37_sub11
																.getUnsignedShort());
												} else
													aBoolean2863 = true;
											} else
												anInt2855 = class37_sub11
														.getUnsignedShort();
										} else
											aBoolean2823 = false;
									} else {
										int i_4_ = class37_sub11
												.getUnsignedByte();
										anIntArray2856 = new int[i_4_];
										for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
											anIntArray2856[i_5_] = class37_sub11
													.getUnsignedShort();
									}
								} else {
									int i_6_ = class37_sub11
											.getUnsignedByte();
									aShortArray2862 = new short[i_6_];
									aShortArray2830 = new short[i_6_];
									for (int i_7_ = 0; ((i_6_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
										aShortArray2862[i_7_] = (short) class37_sub11
												.getUnsignedShort();
										aShortArray2830[i_7_] = (short) class37_sub11
												.getUnsignedShort();
									}
								}
							} else {
								int i_8_ = class37_sub11.getUnsignedByte();
								aShortArray2836 = new short[i_8_];
								aShortArray2821 = new short[i_8_];
								for (int i_9_ = 0; i_8_ > i_9_; i_9_++) {
									aShortArray2821[i_9_] = (short) class37_sub11
											.getUnsignedShort();
									aShortArray2836[i_9_] = (short) class37_sub11
											.getUnsignedShort();
								}
							}
						} else {
							anInt2815 = class37_sub11.getUnsignedShort();
							anInt2822 = class37_sub11.getUnsignedShort();
							anInt2860 = class37_sub11.getUnsignedShort();
							anInt2844 = class37_sub11.getUnsignedShort();
						}
					} else
						anInt2828 = class37_sub11.getUnsignedShort();
				} else
					anInt2815 = class37_sub11.getUnsignedShort();
			} else
				anInt2858 = class37_sub11.getUnsignedByte();
		} else {
			int i_10_ = class37_sub11.getUnsignedByte();
			anIntArray2820 = new int[i_10_];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
				anIntArray2820[i_11_] = class37_sub11.getUnsignedShort();
		}
		if (i <= 126)
			method712((byte) 12, -58);
	}

	public Class37_Sub4_Sub7_Sub6 method715(
			Class37_Sub4_Sub12 class37_sub4_sub12,
			Class37_Sub4_Sub12 class37_sub4_sub12_12_, int i, int i_13_,
			byte i_14_) {
		try {
			anInt2817++;
			if (anIntArray2824 != null) {
				Class37_Sub4_Sub15 class37_sub4_sub15_15_ = method719((byte) -113);
				if (class37_sub4_sub15_15_ == null)
					return null;
				return class37_sub4_sub15_15_.method715(class37_sub4_sub12,
						class37_sub4_sub12_12_, i, i_13_, (byte) 74);
			}
			Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = ((Class37_Sub4_Sub7_Sub6) Class37_Sub9_Sub32.aClass65_3503
					.get((long) anInt2842));
			int i_16_ = -38 % ((-32 - i_14_) / 58);
			if (class37_sub4_sub7_sub6 == null) {
				boolean bool = false;
				for (int i_17_ = 0; anIntArray2820.length > i_17_; i_17_++) {
					if (!Class37_Sub9_Sub7.aClass15_3031.method115(-9350,
							anIntArray2820[i_17_], 0))
						bool = true;
				}
				if (bool)
					return null;
				Class37_Sub4_Sub7_Sub4[] class37_sub4_sub7_sub4s = new Class37_Sub4_Sub7_Sub4[anIntArray2820.length];
				for (int i_18_ = 0; ((anIntArray2820.length ^ 0xffffffff) < (i_18_ ^ 0xffffffff)); i_18_++)
					class37_sub4_sub7_sub4s[i_18_] = Class37_Sub4_Sub7_Sub4
							.method529((Class37_Sub9_Sub7.aClass15_3031),
									(anIntArray2820[i_18_]), 0);
				Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4;
				if (class37_sub4_sub7_sub4s.length != 1)
					class37_sub4_sub7_sub4 = (new Class37_Sub4_Sub7_Sub4(
							class37_sub4_sub7_sub4s,
							class37_sub4_sub7_sub4s.length));
				else
					class37_sub4_sub7_sub4 = class37_sub4_sub7_sub4s[0];
				if (aShortArray2821 != null) {
					for (int i_19_ = 0; aShortArray2821.length > i_19_; i_19_++)
						class37_sub4_sub7_sub4.method535(
								(aShortArray2821[i_19_]),
								(aShortArray2836[i_19_]));
				}
				if (aShortArray2862 != null) {
					for (int i_20_ = 0; ((i_20_ ^ 0xffffffff) > (aShortArray2862.length ^ 0xffffffff)); i_20_++)
						class37_sub4_sub7_sub4.method525(
								(aShortArray2862[i_20_]),
								(aShortArray2830[i_20_]));
				}
				class37_sub4_sub7_sub6 = class37_sub4_sub7_sub4.method518(
						anInt2832 + 64, anInt2853 + 850, -30, -50, -30, true,
						true);
				Class37_Sub9_Sub32.aClass65_3503.put(class37_sub4_sub7_sub6,
						(long) anInt2842);
			}
			Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6_21_;
			if (class37_sub4_sub12_12_ == null || class37_sub4_sub12 == null) {
				if (class37_sub4_sub12_12_ != null)
					class37_sub4_sub7_sub6_21_ = class37_sub4_sub12_12_
							.method704(class37_sub4_sub7_sub6, i, 65535);
				else if (class37_sub4_sub12 != null)
					class37_sub4_sub7_sub6_21_ = class37_sub4_sub12.method704(
							class37_sub4_sub7_sub6, i_13_, 65535);
				else
					class37_sub4_sub7_sub6_21_ = class37_sub4_sub7_sub6
							.method559(true);
			} else
				class37_sub4_sub7_sub6_21_ = class37_sub4_sub12_12_.method701(
						i, class37_sub4_sub7_sub6, (byte) -89,
						class37_sub4_sub12, i_13_);
			if ((anInt2854 ^ 0xffffffff) != -129 || anInt2855 != 128)
				class37_sub4_sub7_sub6_21_.method552(anInt2854, anInt2855,
						anInt2854);
			return class37_sub4_sub7_sub6_21_;
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("r.B("
					+ (class37_sub4_sub12 != null ? "{...}" : "null") + ','
					+ (class37_sub4_sub12_12_ != null ? "{...}" : "null") + ','
					+ i + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	public static void method716(int i, Class14 class14) {
		Class15_Sub1.aClass14_1746 = class14;
		anInt2850++;
		if (i != -1)
			method713((byte) -46);
	}

	public void method717(byte i, ByteVector class37_sub11) {
		anInt2841++;
		int i_22_ = -28 / ((-33 - i) / 63);
		for (;;) {
			int i_23_ = class37_sub11.getUnsignedByte();
			if (i_23_ == 0)
				break;
			method714((byte) 127, i_23_, class37_sub11);
		}
	}

	public void method718(boolean bool) {
		if (bool != false)
			anInt2844 = -92;
		anInt2839++;
	}

	public Class37_Sub4_Sub15 method719(byte i) {
		int i_24_ = -83 % ((-9 - i) / 38);
		int i_25_ = -1;
		if (anInt2846 != -1)
			i_25_ = ByteVector.method983(anInt2846, 121);
		else if (anInt2825 != -1)
			i_25_ = Class37_Sub23.varpData[anInt2825];
		anInt2812++;
		if ((i_25_ ^ 0xffffffff) > -1
				|| (i_25_ ^ 0xffffffff) <= (anIntArray2824.length ^ 0xffffffff)
				|| (anIntArray2824[i_25_] ^ 0xffffffff) == 0)
			return null;
		return Class37_Sub9_Sub34.method912(67, anIntArray2824[i_25_]);
	}

	public Class37_Sub4_Sub7_Sub4 method720(int i) {
		anInt2826++;
		if (anIntArray2824 != null) {
			Class37_Sub4_Sub15 class37_sub4_sub15_26_ = method719((byte) 78);
			if (class37_sub4_sub15_26_ == null)
				return null;
			return class37_sub4_sub15_26_.method720(-1);
		}
		if (anIntArray2856 == null)
			return null;
		boolean bool = false;
		if (i != -1)
			return null;
		for (int i_27_ = 0; i_27_ < anIntArray2856.length; i_27_++) {
			if (!Class37_Sub9_Sub7.aClass15_3031.method115(i + -9349,
					anIntArray2856[i_27_], 0))
				bool = true;
		}
		if (bool)
			return null;
		Class37_Sub4_Sub7_Sub4[] class37_sub4_sub7_sub4s = new Class37_Sub4_Sub7_Sub4[anIntArray2856.length];
		for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > (anIntArray2856.length ^ 0xffffffff); i_28_++)
			class37_sub4_sub7_sub4s[i_28_] = Class37_Sub4_Sub7_Sub4
					.method529((Class37_Sub9_Sub7.aClass15_3031),
							anIntArray2856[i_28_], 0);
		Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4;
		if ((class37_sub4_sub7_sub4s.length ^ 0xffffffff) == -2)
			class37_sub4_sub7_sub4 = class37_sub4_sub7_sub4s[0];
		else
			class37_sub4_sub7_sub4 = new Class37_Sub4_Sub7_Sub4(
					class37_sub4_sub7_sub4s, class37_sub4_sub7_sub4s.length);
		if (aShortArray2821 != null) {
			for (int i_29_ = 0; (aShortArray2821.length ^ 0xffffffff) < (i_29_ ^ 0xffffffff); i_29_++)
				class37_sub4_sub7_sub4.method535(aShortArray2821[i_29_],
						aShortArray2836[i_29_]);
		}
		if (aShortArray2862 != null) {
			for (int i_30_ = 0; (aShortArray2862.length ^ 0xffffffff) < (i_30_ ^ 0xffffffff); i_30_++)
				class37_sub4_sub7_sub4.method525(aShortArray2862[i_30_],
						aShortArray2830[i_30_]);
		}
		return class37_sub4_sub7_sub4;
	}

	public boolean method721(int i) {
		anInt2838++;
		if (anIntArray2824 == null)
			return true;
		int i_31_ = -1;
		if (anInt2846 != -1)
			i_31_ = ByteVector.method983(anInt2846, 127);
		else if (anInt2825 != -1)
			i_31_ = Class37_Sub23.varpData[anInt2825];
		if ((i_31_ ^ 0xffffffff) > -1
				|| (i_31_ ^ 0xffffffff) <= (anIntArray2824.length ^ 0xffffffff)
				|| anIntArray2824[i_31_] == -1)
			return false;
		if (i <= 125)
			anInt2844 = -32;
		return true;
	}

	public Class37_Sub4_Sub15() {
		anInt2822 = -1;
		aBoolean2823 = true;
		anInt2814 = -1;
		anInt2829 = -1;
		anInt2819 = -1;
		anInt2832 = 0;
		aBoolean2811 = true;
		anInt2834 = 32;
		aClass16_2852 = Class37_Sub9_Sub3.aClass16_2939;
		aBoolean2847 = true;
		anInt2837 = -1;
		anInt2846 = -1;
		anInt2853 = 0;
		anInt2844 = -1;
		anInt2854 = 128;
		anInt2828 = -1;
		aClass16Array2861 = new RSString[5];
		anInt2855 = 128;
		anInt2858 = 1;
		anInt2860 = -1;
		aBoolean2863 = false;
	}

	static {
		aClass16_2827 = aClass16_2851;
		aClass16_2857 = Class37_Sub2.create_rsstring("Das ist eine Mitglieder)2Welt(Q");
		aClass16_2816 = aClass16_2851;
		aClass16_2833 = Class37_Sub2.create_rsstring("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");
		aClass16_2849 = Class37_Sub2.create_rsstring("Sorry invited players only)3");
		aClass16_2818 = aClass16_2849;
	}
}
