package org.ie.client;

import org.ie.Main;

/* Class37_Sub9_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub13 extends Class37_Sub9 {
	public static int anInt3125;
	public static KeyboardHandler keyboardHandler;
	public static int anInt3127;
	public static int anInt3128;
	public static RSString aClass16_3129;
	public static RSString aClass16_3130 = Class37_Sub2.create_rsstring("The server is being updated)3");
	public static RSString aClass16_3131;
	public static int anInt3132;
	public static int anInt3133;
	public static int anInt3134;
	public int[][] anIntArrayArray3135;
	public static int anInt3136;
	public static int anInt3137;
	public static int anInt3138;
	public static Class37_Sub4_Sub9_Sub1[] aClass37_Sub4_Sub9_Sub1Array3139;
	public static ByteVector aClass37_Sub11_3140;
	public static int anInt3141;
	public static RSString aClass16_3142;

	public int[][] method759(byte i, int i_0_) {
		if (i < 111)
			aClass37_Sub4_Sub9_Sub1Array3139 = null;
		anInt3136++;
		int[][] is = aClass33_1946.method298(false, i_0_);
		if (aClass33_1946.aBoolean767) {
			int i_1_ = anIntArrayArray3135.length;
			int[] is_2_ = this.method760(i_0_, 0, -72);
			int[] is_3_ = is[0];
			int[] is_4_ = is[1];
			int[] is_5_ = is[2];
			if (i_1_ > 0) {
				for (int i_6_ = 0; Class32.anInt743 > i_6_; i_6_++) {
					int i_7_ = 0;
					int i_8_ = is_2_[i_6_];
					for (int i_9_ = 0; (i_1_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
						if ((anIntArrayArray3135[i_9_][0] ^ 0xffffffff) < (i_8_ ^ 0xffffffff))
							break;
						i_7_++;
					}
					if ((i_7_ ^ 0xffffffff) <= (i_1_ ^ 0xffffffff)) {
						int[] is_10_ = anIntArrayArray3135[-1 + i_1_];
						is_3_[i_6_] = is_10_[1];
						is_4_[i_6_] = is_10_[2];
						is_5_[i_6_] = is_10_[3];
					} else {
						int[] is_11_ = anIntArrayArray3135[i_7_];
						if ((i_7_ ^ 0xffffffff) < -1) {
							int[] is_12_ = anIntArrayArray3135[-1 + i_7_];
							int i_13_ = ((i_8_ + -is_12_[0] << -291318036) / (-is_12_[0] + is_11_[0]));
							int i_14_ = 4096 + -i_13_;
							is_3_[i_6_] = (i_14_ * is_12_[1] + i_13_
									* is_11_[1] >> -76443316);
							is_4_[i_6_] = (is_12_[2] * i_14_ + is_11_[2]
									* i_13_ >> 1794492588);
							is_5_[i_6_] = (i_13_ * is_11_[3]
									- -(i_14_ * is_12_[3]) >> -1085507540);
						} else {
							is_3_[i_6_] = is_11_[1];
							is_4_[i_6_] = is_11_[2];
							is_5_[i_6_] = is_11_[3];
						}
					}
				}
			} else {
				for (int i_15_ = 0; Class32.anInt743 > i_15_; i_15_++) {
					is_3_[i_15_] = 0;
					is_4_[i_15_] = 0;
					is_5_[i_15_] = 0;
				}
			}
		}
		return is;
	}

	public void method750(ByteVector class37_sub11, int i, boolean bool) {
		if ((i ^ 0xffffffff) == -1) {
			int i_16_ = class37_sub11.getUnsignedByte();
			if ((i_16_ ^ 0xffffffff) != -1)
				method815(3, i_16_);
			else {
				anIntArrayArray3135 = new int[class37_sub11.getUnsignedByte()][4];
				for (int i_17_ = 0; ((anIntArrayArray3135.length ^ 0xffffffff) < (i_17_ ^ 0xffffffff)); i_17_++) {
					anIntArrayArray3135[i_17_][0] = class37_sub11
							.getUnsignedShort();
					anIntArrayArray3135[i_17_][1] = class37_sub11
							.getUnsignedByte() << -1731286492;
					anIntArrayArray3135[i_17_][2] = class37_sub11
							.getUnsignedByte() << -1044437340;
					anIntArrayArray3135[i_17_][3] = class37_sub11
							.getUnsignedByte() << 1581911812;
				}
			}
		}
		anInt3133++;
		if (bool != true)
			method815(1, -100);
	}

	public static void method812(int i) {
		if (i != 1)
			method816(-54);
		for (int i_18_ = 0; Class37_Sub3_Sub1.anInt2329 > i_18_; i_18_++) {
			Class83.anIntArray1520[i_18_]--;
			if ((Class83.anIntArray1520[i_18_] ^ 0xffffffff) > 9) {
				Class37_Sub3_Sub1.anInt2329--;
				for (int i_19_ = i_18_; ((Class37_Sub3_Sub1.anInt2329 ^ 0xffffffff) < (i_19_ ^ 0xffffffff)); i_19_++) {
					Class46.anIntArray988[i_19_] = Class46.anIntArray988[1 + i_19_];
					Class37_Sub9_Sub32.aClass11Array3505[i_19_] = Class37_Sub9_Sub32.aClass11Array3505[i_19_ + 1];
					Class37_Sub4_Sub10.anIntArray2681[i_19_] = Class37_Sub4_Sub10.anIntArray2681[i_19_
							- -1];
					Class83.anIntArray1520[i_19_] = Class83.anIntArray1520[1 + i_19_];
					Class37_Sub4_Sub13.anIntArray2800[i_19_] = Class37_Sub4_Sub13.anIntArray2800[1 + i_19_];
				}
				i_18_--;
			} else {
				Class11 class11 = Class37_Sub9_Sub32.aClass11Array3505[i_18_];
				if (class11 == null) {
					class11 = Class11.method88(NodeSub.aClass15_Sub1_1862,
							Class46.anIntArray988[i_18_], 0);
					if (class11 == null)
						continue;
					Class83.anIntArray1520[i_18_] += class11.method89();
					Class37_Sub9_Sub32.aClass11Array3505[i_18_] = class11;
				}
				if (Class83.anIntArray1520[i_18_] < 0) {
					int i_20_;
					if (Class37_Sub4_Sub13.anIntArray2800[i_18_] != 0) {
						int i_21_ = 128 * (0xff & (Class37_Sub4_Sub13.anIntArray2800[i_18_]));
						int i_22_ = ((0xff8bf6 & Class37_Sub4_Sub13.anIntArray2800[i_18_]) >> -2098238512);
						int i_23_ = (64 + 128 * i_22_ + -(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666));
						if ((i_23_ ^ 0xffffffff) > -1)
							i_23_ = -i_23_;
						int i_24_ = 0xff & (Class37_Sub4_Sub13.anIntArray2800[i_18_] >> -2039899320);
						int i_25_ = (128 * i_24_ + (64 + -(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642)));
						if ((i_25_ ^ 0xffffffff) > -1)
							i_25_ = -i_25_;
						int i_26_ = i_23_ - (-i_25_ + 128);
						if (i_26_ > i_21_) {
							Class83.anIntArray1520[i_18_] = -100;
							continue;
						}
						if ((i_26_ ^ 0xffffffff) > -1)
							i_26_ = 0;
						i_20_ = (-i_26_ + i_21_) * Class43.anInt957 / i_21_;
					} else
						i_20_ = Canvas_Sub1.anInt45;
					if (i_20_ > 0) {
						Class37_Sub22_Sub1 class37_sub22_sub1 = class11
								.method86().method1026(Class86.aClass30_1579);
						Class37_Sub3_Sub4 class37_sub3_sub4 = Class37_Sub3_Sub4
								.method392(class37_sub22_sub1, 100, i_20_);
						class37_sub3_sub4.method429(-1
								+ (Class37_Sub4_Sub10.anIntArray2681[i_18_]));
						Class1.aClass37_Sub3_Sub2_59
								.method350(class37_sub3_sub4);
					}
					Class83.anIntArray1520[i_18_] = -100;
				}
			}
		}
		anInt3125++;
		if (Class55.aBoolean1071 && !Class37_Sub9.method756(i + 125)) {
			if (Class37_Sub9_Sub17.anInt3223 != 0 && Queue.anInt1442 != -1)
				Class15.method120(Class37_Sub9_Sub17.anInt3223, 0, false,
						-15793, Class54.aClass15_Sub1_1060, Queue.anInt1442);
			Class55.aBoolean1071 = false;
		}
	}

	public Class37_Sub9_Sub13() {
		super(1, false);
	}

	public static boolean method813(int i, int i_27_) {
		if ((0x1 & i_27_ >> i + 1) == 0)
			return false;
		return true;
	}

	public static void method814(int i) {
		anInt3137++;
		if (!Class37_Sub20.menu_open) {
			Class37_Sub9_Sub14.aClass16Array3151[0] = Class37_Sub9_Sub23.aClass16_3347;
			anInt3134 = 1;
			Class37_Sub9_Sub20.anIntArray3300[0] = 1004;
			Class37_Sub9_Sub37.aClass16Array3593[0] = Class37_Sub9_Sub8.aClass16_3045;
		}
		if ((Main.gamepanel ^ 0xffffffff) != 0)
			Class37_Sub4_Sub15.method712((byte) 61, Main.gamepanel);
		if (i != 2)
			aClass37_Sub11_3140 = null;
		for (int i_29_ = 0; ((Class37_Sub9_Sub37.anInt3597 ^ 0xffffffff) < (i_29_ ^ 0xffffffff)); i_29_++) {
			if (Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_29_])
				Class37_Sub9_Sub1.rectClipDraw[i_29_] = true;
			Class37_Sub9_Sub36.aBooleanArray3587[i_29_] = Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_29_];
			Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_29_] = false;
		}
		Class84.anInt1531 = -1;
		Class37_Sub4_Sub4.aClass18_2579 = null;
		Class60.anInt1154 = -1;
		Hashtable.anInt216 = Class37_Sub7.loopCycle;
		if (Main.gamepanel != -1) {
			Class37_Sub9_Sub37.anInt3597 = 0;
			Class37_Sub23.method1030(0, Main.gamepanel, 765, 0, (byte) 111,
					0, -1, 503, 0);
		}
		Graphics2D.method590();
		Class76.method1286((byte) -39);
		if (!Class37_Sub20.menu_open) {
			if (Class84.anInt1531 != -1)
				Class50.method1115(Class84.anInt1531, Class60.anInt1154,
						(byte) 41);
		} else
			Class71.method1266(8458);
		if ((Class37_Sub4_Sub13.anInt2793 ^ 0xffffffff) == -4) {
			for (int i_30_ = 0; Class37_Sub9_Sub37.anInt3597 > i_30_; i_30_++) {
				if (!Class37_Sub9_Sub36.aBooleanArray3587[i_30_]) {
					if (Class37_Sub9_Sub1.rectClipDraw[i_30_])
						Graphics2D.method586(
								Class71.anIntArray1364[i_30_],
								Class43.anIntArray961[i_30_],
								Class37_Sub11_Sub1.anIntArray3611[i_30_],
								Class37_Sub4_Sub7_Sub7.anIntArray3842[i_30_],
								16711680, 128);
				} else
					Graphics2D.method586(Class71.anIntArray1364[i_30_],
							Class43.anIntArray961[i_30_],
							(Class37_Sub11_Sub1.anIntArray3611[i_30_]),
							(Class37_Sub4_Sub7_Sub7.anIntArray3842[i_30_]),
							16711935, 128);
			}
		}
		//RSInterface.method192(//TODO idk disabling anyway
		//		(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666),
		//		Class37_Sub9_Sub1.anInt2916, Class37_Sub9_Sub37.anInt3589, 86,
		//		(Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642));
		Class37_Sub9_Sub37.anInt3589 = 0;
	}

	public void method815(int i, int i_31_) {
		anInt3132++;
		while_70_: do {
			if (i_31_ != 0) {
				int i_32_ = i_31_;
				while_69_: do {
					while_68_: do {
						while_67_: do {
							while_66_: do {
								do {
									if (i_32_ != 1) {
										if ((i_32_ ^ 0xffffffff) != -3) {
											if (i_32_ != 3) {
												if ((i_32_ ^ 0xffffffff) != -5) {
													if (i_32_ != 5) {
														if ((i_32_ ^ 0xffffffff) != -7)
															break while_69_;
													} else
														break while_67_;
													break while_68_;
												}
											} else
												break;
											break while_66_;
										}
									} else {
										anIntArrayArray3135 = new int[2][4];
										anIntArrayArray3135[0][0] = 0;
										anIntArrayArray3135[1][0] = 4096;
										anIntArrayArray3135[0][2] = 0;
										anIntArrayArray3135[1][2] = 4096;
										anIntArrayArray3135[0][1] = 0;
										anIntArrayArray3135[0][3] = 0;
										anIntArrayArray3135[1][3] = 4096;
										anIntArrayArray3135[1][1] = 4096;
										break while_70_;
									}
									anIntArrayArray3135 = new int[8][4];
									anIntArrayArray3135[0][0] = 0;
									anIntArrayArray3135[0][3] = 2361;
									anIntArrayArray3135[0][2] = 2602;
									anIntArrayArray3135[1][0] = 2867;
									anIntArrayArray3135[1][2] = 1799;
									anIntArrayArray3135[2][0] = 3072;
									anIntArrayArray3135[2][2] = 1734;
									anIntArrayArray3135[3][2] = 1220;
									anIntArrayArray3135[3][0] = 3276;
									anIntArrayArray3135[0][1] = 2650;
									anIntArrayArray3135[1][1] = 2313;
									anIntArrayArray3135[1][3] = 1558;
									anIntArrayArray3135[4][2] = 963;
									anIntArrayArray3135[4][0] = 3481;
									anIntArrayArray3135[2][3] = 1413;
									anIntArrayArray3135[3][3] = 947;
									anIntArrayArray3135[5][2] = 2152;
									anIntArrayArray3135[5][0] = 3686;
									anIntArrayArray3135[6][0] = 3891;
									anIntArrayArray3135[4][3] = 722;
									anIntArrayArray3135[2][1] = 2618;
									anIntArrayArray3135[3][1] = 2296;
									anIntArrayArray3135[7][0] = 4096;
									anIntArrayArray3135[5][3] = 1766;
									anIntArrayArray3135[6][3] = 915;
									anIntArrayArray3135[6][2] = 1060;
									anIntArrayArray3135[7][2] = 1413;
									anIntArrayArray3135[4][1] = 2072;
									anIntArrayArray3135[7][3] = 1140;
									anIntArrayArray3135[5][1] = 2730;
									anIntArrayArray3135[6][1] = 2232;
									anIntArrayArray3135[7][1] = 1686;
									break while_70_;
								} while (false);
								anIntArrayArray3135 = new int[7][4];
								anIntArrayArray3135[0][1] = 0;
								anIntArrayArray3135[1][1] = 0;
								anIntArrayArray3135[0][2] = 0;
								anIntArrayArray3135[2][1] = 0;
								anIntArrayArray3135[0][0] = 0;
								anIntArrayArray3135[1][2] = 4096;
								anIntArrayArray3135[3][1] = 4096;
								anIntArrayArray3135[4][1] = 4096;
								anIntArrayArray3135[1][0] = 663;
								anIntArrayArray3135[2][2] = 4096;
								anIntArrayArray3135[5][1] = 4096;
								anIntArrayArray3135[3][2] = 4096;
								anIntArrayArray3135[2][0] = 1363;
								anIntArrayArray3135[3][0] = 2048;
								anIntArrayArray3135[6][1] = 0;
								anIntArrayArray3135[4][0] = 2727;
								anIntArrayArray3135[4][2] = 0;
								anIntArrayArray3135[0][3] = 4096;
								anIntArrayArray3135[5][0] = 3411;
								anIntArrayArray3135[1][3] = 4096;
								anIntArrayArray3135[5][2] = 0;
								anIntArrayArray3135[2][3] = 0;
								anIntArrayArray3135[3][3] = 0;
								anIntArrayArray3135[4][3] = 0;
								anIntArrayArray3135[5][3] = 4096;
								anIntArrayArray3135[6][0] = 4096;
								anIntArrayArray3135[6][2] = 0;
								anIntArrayArray3135[6][3] = 4096;
								break while_70_;
							} while (false);
							anIntArrayArray3135 = new int[6][4];
							anIntArrayArray3135[0][3] = 0;
							anIntArrayArray3135[0][0] = 0;
							anIntArrayArray3135[0][1] = 0;
							anIntArrayArray3135[1][1] = 0;
							anIntArrayArray3135[0][2] = 0;
							anIntArrayArray3135[1][0] = 1843;
							anIntArrayArray3135[1][3] = 1493;
							anIntArrayArray3135[1][2] = 0;
							anIntArrayArray3135[2][2] = 0;
							anIntArrayArray3135[2][0] = 2457;
							anIntArrayArray3135[2][1] = 0;
							anIntArrayArray3135[3][2] = 1124;
							anIntArrayArray3135[2][3] = 2939;
							anIntArrayArray3135[3][1] = 0;
							anIntArrayArray3135[4][1] = 546;
							anIntArrayArray3135[3][0] = 2781;
							anIntArrayArray3135[5][1] = 4096;
							anIntArrayArray3135[3][3] = 3565;
							anIntArrayArray3135[4][3] = 4031;
							anIntArrayArray3135[4][2] = 3084;
							anIntArrayArray3135[5][3] = 4096;
							anIntArrayArray3135[4][0] = 3481;
							anIntArrayArray3135[5][2] = 4096;
							anIntArrayArray3135[5][0] = 4096;
							break while_70_;
						} while (false);
						anIntArrayArray3135 = new int[16][4];
						anIntArrayArray3135[0][3] = 321;
						anIntArrayArray3135[1][3] = 562;
						anIntArrayArray3135[0][0] = 0;
						anIntArrayArray3135[0][2] = 192;
						anIntArrayArray3135[0][1] = 80;
						anIntArrayArray3135[1][1] = 321;
						anIntArrayArray3135[2][1] = 578;
						anIntArrayArray3135[1][0] = 155;
						anIntArrayArray3135[3][1] = 947;
						anIntArrayArray3135[2][3] = 803;
						anIntArrayArray3135[1][2] = 449;
						anIntArrayArray3135[2][2] = 690;
						anIntArrayArray3135[3][3] = 1140;
						anIntArrayArray3135[2][0] = 389;
						anIntArrayArray3135[4][3] = 1509;
						anIntArrayArray3135[5][3] = 1413;
						anIntArrayArray3135[3][0] = 671;
						anIntArrayArray3135[4][0] = 897;
						anIntArrayArray3135[3][2] = 995;
						anIntArrayArray3135[4][2] = 1397;
						anIntArrayArray3135[6][3] = 1333;
						anIntArrayArray3135[5][2] = 1429;
						anIntArrayArray3135[5][0] = 1175;
						anIntArrayArray3135[6][0] = 1368;
						anIntArrayArray3135[7][0] = 1507;
						anIntArrayArray3135[6][2] = 1461;
						anIntArrayArray3135[7][2] = 1525;
						anIntArrayArray3135[8][2] = 1590;
						anIntArrayArray3135[4][1] = 1285;
						anIntArrayArray3135[8][0] = 1736;
						anIntArrayArray3135[9][2] = 2056;
						anIntArrayArray3135[9][0] = 2088;
						anIntArrayArray3135[10][0] = 2355;
						anIntArrayArray3135[11][0] = 2691;
						anIntArrayArray3135[7][3] = 1702;
						anIntArrayArray3135[12][0] = 3031;
						anIntArrayArray3135[10][2] = 2586;
						anIntArrayArray3135[11][2] = 3148;
						anIntArrayArray3135[8][3] = 2056;
						anIntArrayArray3135[12][2] = 3710;
						anIntArrayArray3135[13][2] = 3421;
						anIntArrayArray3135[5][1] = 1525;
						anIntArrayArray3135[14][2] = 3148;
						anIntArrayArray3135[13][0] = 3522;
						anIntArrayArray3135[15][2] = 2505;
						anIntArrayArray3135[6][1] = 1734;
						anIntArrayArray3135[9][3] = 2666;
						anIntArrayArray3135[14][0] = 3727;
						anIntArrayArray3135[7][1] = 1413;
						anIntArrayArray3135[8][1] = 1108;
						anIntArrayArray3135[15][0] = 4096;
						anIntArrayArray3135[9][1] = 1766;
						anIntArrayArray3135[10][1] = 2409;
						anIntArrayArray3135[10][3] = 3276;
						anIntArrayArray3135[11][3] = 3228;
						anIntArrayArray3135[12][3] = 3196;
						anIntArrayArray3135[11][1] = 3116;
						anIntArrayArray3135[12][1] = 3806;
						anIntArrayArray3135[13][3] = 3019;
						anIntArrayArray3135[13][1] = 3437;
						anIntArrayArray3135[14][3] = 3228;
						anIntArrayArray3135[14][1] = 3116;
						anIntArrayArray3135[15][1] = 2377;
						anIntArrayArray3135[15][3] = 2746;
						break while_70_;
					} while (false);
					anIntArrayArray3135 = new int[4][4];
					anIntArrayArray3135[0][2] = 4096;
					anIntArrayArray3135[1][2] = 4096;
					anIntArrayArray3135[2][2] = 4096;
					anIntArrayArray3135[0][3] = 0;
					anIntArrayArray3135[0][0] = 2048;
					anIntArrayArray3135[1][0] = 2867;
					anIntArrayArray3135[0][1] = 0;
					anIntArrayArray3135[1][3] = 0;
					anIntArrayArray3135[3][2] = 0;
					anIntArrayArray3135[2][3] = 0;
					anIntArrayArray3135[1][1] = 4096;
					anIntArrayArray3135[2][0] = 3276;
					anIntArrayArray3135[2][1] = 4096;
					anIntArrayArray3135[3][1] = 4096;
					anIntArrayArray3135[3][3] = 0;
					anIntArrayArray3135[3][0] = 4096;
					break while_70_;
				} while (false);
				throw new RuntimeException("Invalid gradient preset");
			}
		} while (false);
		if (i == 3) {
			/* empty */
		}
	}

	public static void method816(int i) {
		if (i == 3) {
			aClass37_Sub11_3140 = null;
			aClass16_3131 = null;
			keyboardHandler = null;
			aClass16_3142 = null;
			aClass16_3130 = null;
			aClass37_Sub4_Sub9_Sub1Array3139 = null;
			aClass16_3129 = null;
		}
	}

	public void method752(int i) {
		if (i != -2)
			aClass16_3129 = null;
		anInt3138++;
		if (anIntArrayArray3135 == null)
			method815(3, 1);
	}

	public static int method817(int i, int i_33_) {
		return i | i_33_;
	}

	static {
		aClass16_3129 = Class37_Sub2.create_rsstring("(Z");
		aClass16_3131 = aClass16_3130;
		anInt3134 = 0;
		keyboardHandler = new KeyboardHandler();
		aClass37_Sub11_3140 = new ByteVector(new byte[5000]);
		aClass16_3142 = Class37_Sub2.create_rsstring("Keine Antwort vom Server)3");
		anInt3141 = 0;
	}
}
