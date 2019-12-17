package org.ie.client;

/* Class37_Sub9_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class37_Sub9_Sub34 extends Class37_Sub9 {
	public static int anInt3529;
	public int anInt3530;
	public static int anInt3531;
	public static int anInt3532;
	public int anInt3533;
	public static int anInt3534;
	public static int anInt3535;
	public static int anInt3536;
	public static RSString aClass16_3537 = Class37_Sub2.create_rsstring("(U3");
	public int anInt3538;
	public int anInt3539;
	public static int anInt3540;
	public int anInt3541;
	public static int anInt3542;
	public static int anInt3543;
	public int anInt3544;
	public int anInt3545 = 5;
	public static Cache aClass65_3546 = new Cache(50);
	public int[][] anIntArrayArray3547;
	public static int anInt3548;
	public int anInt3549;
	public static int anInt3550;
	public int anInt3551;
	public int anInt3552;
	public static int anInt3553;
	public static RSString aClass16_3554 = Class37_Sub2.create_rsstring("Unerwartete Antwort vom Anmelde)2Server)3");
	public static Class15_Sub1 aClass15_Sub1_3555;
	public static long aLong3556;
	public static Deque aClass58_3557 = new Deque();
	public static int anInt3558 = 0;
	public static RSString aClass16_3559 = Class37_Sub2.create_rsstring("oder ung-Ultiges Passwort)3");

	public Class37_Sub9_Sub34() {
		super(0, true);
		anInt3533 = 2;
		anInt3539 = 2048;
		anInt3549 = 5;
		anInt3538 = 0;
		anInt3551 = 25;
		anInt3552 = 1;
	}

	public void method750(ByteVector class37_sub11, int i, boolean bool) {
		anInt3529++;
		int i_0_ = i;
		while_117_: do {
			while_116_: do {
				while_115_: do {
					while_114_: do {
						while_113_: do {
							do {
								if ((i_0_ ^ 0xffffffff) != -1) {
									if ((i_0_ ^ 0xffffffff) != -2) {
										if (i_0_ != 2) {
											if (i_0_ != 3) {
												if ((i_0_ ^ 0xffffffff) != -5) {
													if ((i_0_ ^ 0xffffffff) != -6) {
														if (i_0_ == 6)
															break while_116_;
														break while_117_;
													}
												} else
													break while_114_;
												break while_115_;
											}
										} else
											break;
										break while_113_;
									}
								} else {
									anInt3545 = anInt3549 = class37_sub11
											.getUnsignedByte();
									break while_117_;
								}
								anInt3538 = class37_sub11.getUnsignedByte();
								break while_117_;
							} while (false);
							anInt3539 = class37_sub11.getUnsignedShort();
							break while_117_;
						} while (false);
						anInt3533 = class37_sub11.getUnsignedByte();
						break while_117_;
					} while (false);
					anInt3552 = class37_sub11.getUnsignedByte();
					break while_117_;
				} while (false);
				anInt3545 = class37_sub11.getUnsignedByte();
				break while_117_;
			} while (false);
			anInt3549 = class37_sub11.getUnsignedByte();
		} while (false);
		if (bool != true)
			method908(-109, 59, -114, null, -17, 116);
	}

	public static void method907(int i) {
		anInt3540++;
		if (i != 22884)
			anInt3558 = 51;
		Class83.byteVector.method993(false);
		int i_1_ = Class83.byteVector.method996(1, i ^ 0x5932);
		if (i_1_ != 0) {
			int i_2_ = Class83.byteVector.method996(2, 72);
			if (i_2_ == 0)
				Class36.anIntArray809[Class37_Sub9_Sub11.anInt3098++] = 2047;
			else if (i_2_ == 1) {
				int i_3_ = Class83.byteVector.method996(3, 17);
				Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.method495(
						false, -3523, i_3_);
				int i_4_ = Class83.byteVector.method996(1, 34);
				if (i_4_ == 1)
					Class36.anIntArray809[Class37_Sub9_Sub11.anInt3098++] = 2047;
			} else if (i_2_ == 2) {
				int i_5_ = Class83.byteVector.method996(3, 62);
				Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.method495(true,
						-3523, i_5_);
				int i_6_ = Class83.byteVector.method996(3, 125);
				Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.method495(true,
						-3523, i_6_);
				int i_7_ = Class83.byteVector.method996(1, 87);
				if ((i_7_ ^ 0xffffffff) == -2)
					Class36.anIntArray809[Class37_Sub9_Sub11.anInt3098++] = 2047;
			} else if (i_2_ == 3) {
				int i_8_ = Class83.byteVector.method996(1, 54);
				if (i_8_ == 1)
					Class36.anIntArray809[Class37_Sub9_Sub11.anInt3098++] = 2047;
				int i_9_ = Class83.byteVector.method996(1, 22);
				int i_10_ = Class83.byteVector.method996(7, 60);
				Class37_Sub9_Sub1.anInt2916 = Class83.byteVector
						.method996(2, 115);
				int i_11_ = Class83.byteVector.method996(7, 22);
				Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.method499(
						i_11_, i_10_, i_9_ == 1, i + -23009);
			}
		}
	}

	public static void method908(int i, int i_12_, int i_13_,
			Class37_Sub4_Sub11 class37_sub4_sub11, int i_14_, int i_15_) {
		anInt3553++;
		if (i != 0)
			method907(-107);
		Class37_Sub7 class37_sub7 = new Class37_Sub7();
		int i_16_ = class37_sub4_sub11.anInt2731;
		class37_sub7.anInt1903 = i_12_;
		class37_sub7.anInt1909 = class37_sub4_sub11.anInt2692;
		class37_sub7.anIntArray1895 = class37_sub4_sub11.anIntArray2714;
		class37_sub7.anInt1892 = 128 * i_14_;
		class37_sub7.anInt1908 = class37_sub4_sub11.anInt2727;
		class37_sub7.anInt1914 = 128 * i_15_;
		class37_sub7.anInt1905 = class37_sub4_sub11.anInt2705 * 128;
		class37_sub7.anInt1910 = class37_sub4_sub11.anInt2709;
		int i_17_ = class37_sub4_sub11.anInt2743;
		if (i_13_ == 1 || (i_13_ ^ 0xffffffff) == -4) {
			i_16_ = class37_sub4_sub11.anInt2743;
			i_17_ = class37_sub4_sub11.anInt2731;
		}
		class37_sub7.anInt1907 = (i_15_ - -i_17_) * 128;
		class37_sub7.anInt1913 = (i_14_ - -i_16_) * 128;
		if (class37_sub4_sub11.anIntArray2702 != null) {
			class37_sub7.aClass37_Sub4_Sub11_1901 = class37_sub4_sub11;
			class37_sub7.method744(-870);
		}
		NodeSub.aClass58_1857.addLast(class37_sub7);
		if (class37_sub7.anIntArray1895 != null)
			class37_sub7.anInt1918 = (class37_sub7.anInt1908 - -(int) ((double) (-class37_sub7.anInt1908 + class37_sub7.anInt1909) * Math
					.random()));
	}

	public static void method909(int i) {
		anInt3535++;
		for (int i_18_ = 0; i_18_ < Class37_Sub9_Sub11.anInt3098; i_18_++) {
			int i_19_ = Class36.anIntArray809[i_18_];
			Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_19_];
			int i_20_ = Class83.byteVector.getUnsignedByte();
			if ((0x20 & i_20_) != 0)
				i_20_ += (Class83.byteVector.getUnsignedByte() << -2098354520);
			Class22.method234(88, class37_sub4_sub7_sub1_sub2, i_20_, i_19_);
		}
		if (i <= 46)
			anInt3558 = -119;
	}

	public int[] method761(int i, int i_21_) {
		int[] is = aClass38_1966.method1049(i_21_, true);
		anInt3531++;
		if (i >= -125)
			method908(116, -24, 120, null, -18, 13);
		while_118_: do {
			if (aClass38_1966.aBoolean850) {
				int i_22_ = Class37_Sub4_Sub16.anIntArray2871[i_21_];
				int i_23_ = anInt3533;
				do {
					if ((i_23_ ^ 0xffffffff) != -3) {
						if (i_23_ != 1)
							break;
					} else {
						for (i_23_ = 0; Class32.anInt743 > i_23_; i_23_++) {
							int i_24_ = Class84.anIntArray1528[i_23_];
							int[] is_25_ = method910(i_24_, true, i_22_, 2);
							is[i_23_] = is_25_[1] + -is_25_[0];
						}
						break while_118_;
					}
					for (i_23_ = 0; ((i_23_ ^ 0xffffffff) > (Class32.anInt743 ^ 0xffffffff)); i_23_++) {
						int i_26_ = Class84.anIntArray1528[i_23_];
						is[i_23_] = method910(i_26_, true, i_22_, 2)[1];
					}
					break while_118_;
				} while (false);
				for (i_23_ = 0; (i_23_ ^ 0xffffffff) > (Class32.anInt743 ^ 0xffffffff); i_23_++) {
					int i_27_ = Class84.anIntArray1528[i_23_];
					is[i_23_] = method910(i_27_, true, i_22_, 1)[0];
				}
			}
		} while (false);
		return is;
	}

	public int[] method910(int i, boolean bool, int i_28_, int i_29_) {
		anInt3534++;
		if (bool != true)
			anInt3558 = -81;
		int[] is = new int[i_29_];
		for (int i_30_ = 0; i_29_ > i_30_; i_30_++)
			is[i_30_] = 2147483647;
		i += anInt3544;
		i_28_ += anInt3541;
		if (i > 4096)
			i -= 4096;
		if (i_28_ > 4096)
			i_28_ -= 4096;
		int i_31_ = anInt3545 * i >> -1782996212;
		int i_32_ = i_28_ * anInt3549 >> 46921516;
		int i_33_ = 2147483647;
		int i_34_ = -1;
		int i_35_ = -1;
		int i_36_ = 2147483647;
		int i_37_ = anInt3545 <= 2 ? anInt3545 - 1 : 2;
		int i_38_ = anInt3549 <= 2 ? anInt3549 + -1 : 2;
		for (int i_39_ = -i_37_; (i_39_ ^ 0xffffffff) >= (i_37_ ^ 0xffffffff); i_39_++) {
			for (int i_40_ = -i_38_; (i_40_ ^ 0xffffffff) >= (i_38_ ^ 0xffffffff); i_40_++) {
				int i_41_ = i_39_ + i_31_;
				if (i_41_ < 0)
					i_41_ += anInt3545;
				int i_42_ = i_40_ + i_32_;
				if ((anInt3545 ^ 0xffffffff) >= (i_41_ ^ 0xffffffff))
					i_41_ -= anInt3545;
				if (i_42_ < 0)
					i_42_ += anInt3549;
				if (anInt3549 <= i_42_)
					i_42_ -= anInt3549;
				int i_43_ = i_42_ * anInt3545 - -i_41_;
				int i_44_ = anIntArrayArray3547[i_43_][0];
				int i_45_ = anIntArrayArray3547[i_43_][1];
				int i_46_ = -i_44_ + i;
				if ((i_46_ ^ 0xffffffff) > -1)
					i_46_ = -i_46_;
				int i_47_ = -i_45_ + i_28_;
				if (i_47_ < 0)
					i_47_ = -i_47_;
				if (i_47_ > 2048)
					i_47_ = -i_47_ + 4096;
				if (i_46_ > 2048)
					i_46_ = -i_46_ + 4096;
				int i_48_ = i_47_ * i_47_ + i_46_ * i_46_ >> 148267756;
				if (i_48_ < i_33_) {
					if ((i_34_ ^ 0xffffffff) != 0) {
						i_36_ = i_33_;
						i_34_ = i_35_;
					} else {
						i_36_ = i_48_;
						i_34_ = i_43_;
					}
					i_35_ = i_43_;
					i_33_ = i_48_;
				} else if (((i_35_ ^ 0xffffffff) == (i_34_ ^ 0xffffffff) && (i_34_ ^ 0xffffffff) != (i_43_ ^ 0xffffffff))
						|| ((i_48_ ^ 0xffffffff) > (i_36_ ^ 0xffffffff) && (i_43_ ^ 0xffffffff) != (i_35_ ^ 0xffffffff))) {
					i_34_ = i_43_;
					i_36_ = i_48_;
				}
			}
		}
		int i_49_ = -anIntArrayArray3547[i_35_][0] + i;
		int i_50_ = i_28_ - anIntArrayArray3547[i_35_][1];
		if ((i_49_ ^ 0xffffffff) > -1)
			i_49_ = -i_49_;
		if ((i_49_ ^ 0xffffffff) < -2049)
			i_49_ = -i_49_ + 4096;
		int i_51_ = i - anIntArrayArray3547[i_34_][0];
		if ((i_51_ ^ 0xffffffff) > -1)
			i_51_ = -i_51_;
		int i_52_ = -anIntArrayArray3547[i_34_][1] + i_28_;
		if ((i_51_ ^ 0xffffffff) < -2049)
			i_51_ = -i_51_ + 4096;
		if (i_50_ < 0)
			i_50_ = -i_50_;
		if (i_50_ > 2048)
			i_50_ = -i_50_ + 4096;
		if (i_52_ < 0)
			i_52_ = -i_52_;
		if (i_52_ > 2048)
			i_52_ = 4096 + -i_52_;
		int i_53_ = anInt3552;
		do {
			if ((i_53_ ^ 0xffffffff) != -2) {
				if ((i_53_ ^ 0xffffffff) != -3) {
					i_36_ = i_51_ * i_51_ + i_52_ * i_52_;
					i_33_ = i_49_ * i_49_ - -(i_50_ * i_50_);
					break;
				}
			} else {
				i_33_ = (int) Math
						.sqrt((double) (i_49_ * i_49_ - -(i_50_ * i_50_)));
				i_36_ = (int) Math
						.sqrt((double) (i_51_ * i_51_ - -(i_52_ * i_52_)));
				break;
			}
			i_33_ = Math.max(i_49_, i_50_);
			i_36_ = Math.max(i_51_, i_52_);
		} while (false);
		if (i_29_ > 1)
			is[1] = i_36_ * anInt3530;
		is[0] = i_33_ * anInt3530;
		return is;
	}

	public static void method911(byte i) {
		aClass16_3537 = null;
		aClass15_Sub1_3555 = null;
		aClass16_3554 = null;
		if (i != -76)
			method911((byte) -3);
		aClass65_3546 = null;
		aClass58_3557 = null;
		aClass16_3559 = null;
	}

	public static Class37_Sub4_Sub15 method912(int i, int i_54_) {
		int i_55_ = 42 % ((i - -26) / 44);
		Class37_Sub4_Sub15 class37_sub4_sub15 = ((Class37_Sub4_Sub15) Class37_Sub3_Sub3.aClass65_2339
				.get((long) i_54_));
		anInt3532++;
		if (class37_sub4_sub15 != null)
			return class37_sub4_sub15;
		byte[] is = RSString.aClass15_1645.getFile(9, i_54_);
		class37_sub4_sub15 = new Class37_Sub4_Sub15();
		class37_sub4_sub15.anInt2842 = i_54_;
		if (is != null)
			class37_sub4_sub15.method717((byte) 30, new ByteVector(is));
		class37_sub4_sub15.method718(false);
		Class37_Sub3_Sub3.aClass65_2339.put(class37_sub4_sub15, (long) i_54_);
		return class37_sub4_sub15;
	}

	public void method913(int i) {
		anInt3550++;
		if (i != -4096)
			anInt3544 = 78;
		Random random = new Random((long) anInt3538);
		int i_56_ = 4096 / anInt3549;
		anInt3551 = anInt3549 * anInt3545;
		anIntArrayArray3547 = new int[anInt3551][2];
		anInt3541 = i_56_ >> -180648255;
		int i_57_ = anInt3539 * anInt3541 >> 509625996;
		int i_58_ = 4096 / anInt3545;
		anInt3544 = i_58_ >> 402703457;
		int i_59_ = anInt3539 * anInt3544 >> -1610404404;
		for (int i_60_ = 0; (i_60_ ^ 0xffffffff) > (anInt3549 ^ 0xffffffff); i_60_++) {
			int i_61_ = i_60_ * i_56_;
			for (int i_62_ = 0; i_62_ < anInt3545; i_62_++) {
				int i_63_ = anInt3545 * i_60_ - -i_62_;
				int i_64_ = (i_59_
						* (-4096 + Class20.method216(8192, random, (byte) -57)) >> -555339316);
				int i_65_ = (i_57_
						* (-4096 + Class20.method216(8192, random, (byte) -74)) >> -428371508);
				anIntArrayArray3547[i_63_][0] = i_58_ * i_62_ + i_64_;
				anIntArrayArray3547[i_63_][1] = i_65_ - -i_61_;
			}
		}
		anInt3530 = anInt3545 > anInt3549 ? anInt3545 : anInt3549;
	}

	public void method752(int i) {
		method913(i ^ 0xffe);
		anInt3548++;
		if (i != -2)
			anInt3545 = -42;
	}
}
