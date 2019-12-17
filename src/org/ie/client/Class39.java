package org.ie.client;

/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class39 {
	public static int anInt853;
	public static int anInt854;
	public static Class37_Sub4_Sub9_Sub2_Sub1 aClass37_Sub4_Sub9_Sub2_Sub1_855;
	public static int anInt856;
	public Class37_Sub4_Sub7 aClass37_Sub4_Sub7_857;
	public static RSString aClass16_858 = (Class37_Sub2.create_rsstring("Please subscribe)1 or use a different world)3"));
	public static RSString aClass16_859 = aClass16_858;
	public static int anInt860;
	public int anInt861;
	public static int anInt862;
	public int anInt863;
	public int anInt864;
	public static RSString aClass16_865 = Class37_Sub2.create_rsstring("Diese Welt ist voll)3");
	public int anInt866;
	public static Cache aClass65_867 = new Cache(30);
	public int anInt868;
	public static int anInt869;
	public static int anInt870;
	public static int[] anIntArray871;
	public static int keyPressAmount;
	public static RSString aClass16_873 = Class37_Sub2.create_rsstring("");
	public static int anInt874;

	public static void method1058(int i) {
		aClass16_858 = null;
		anIntArray871 = null;
		aClass16_859 = null;
		aClass16_865 = null;
		aClass65_867 = null;
		aClass16_873 = null;
		aClass37_Sub4_Sub9_Sub2_Sub1_855 = null;
		if (i != -4)
			aClass37_Sub4_Sub9_Sub2_Sub1_855 = null;
	}

	public static byte[] method1059(byte[] is, byte i) {
		anInt869++;
		int i_0_ = is.length;
		if (i != 7)
			aClass16_865 = null;
		byte[] is_1_ = new byte[i_0_];
		Class53.method1135(is, 0, is_1_, 0, i_0_);
		return is_1_;
	}

	public static void method1060(byte i, ByteVector class37_sub11) {
		int i_2_ = 125 / ((i - -12) / 61);
		if (Class71.aClass42_1363 != null) {
			try {
				Class71.aClass42_1363.method1081(0L, 0);
				Class71.aClass42_1363.method1082(class37_sub11.buf,
						class37_sub11.pos, -119, 24);
			} catch (Exception exception) {
				/* empty */
			}
		}
		class37_sub11.pos += 24;
		anInt870++;
	}

	public static void method1061(RSInterface rSInterface, boolean bool, int i, int i_3_) {
		anInt853++;
		if (rSInterface.actionType == 1) {
			Class37_Sub9_Sub3.method774(46, rSInterface.bitPacked,
					rSInterface.tooltip, 0, true,
					Class37_Sub9_Sub8.aClass16_3045, 0);
			Class45.anInt976++;
		}
		if (rSInterface.actionType == 2 && !Class37_Sub4_Sub5.aBoolean2595) {
			RSString rSString = Class37_Sub9_Sub37
					.method924(rSInterface, (byte) -105);
			if (rSString != null) {
				Class37_Sub9_Sub18.anInt3242++;
				Class37_Sub9_Sub3
						.method774(13, rSInterface.bitPacked, rSString, -1, true,
								Class37_Sub9_Sub27.method881((new RSString[] { Class82.aClass16_1690,
										rSInterface.spellName })), 0);
			}
		}
		if (rSInterface.actionType == 3) {
			Class37_Sub9_Sub3.method774(14, rSInterface.bitPacked,
					Class37_Sub9_Sub19.aClass16_3255, 0, true,
					Class37_Sub9_Sub8.aClass16_3045, 0);
			Class37_Sub9_Sub27.anInt3405++;
		}
		if ((rSInterface.actionType ^ 0xffffffff) == -5) {
			RuntimeException_Sub1.anInt1628++;
			Class37_Sub9_Sub3.method774(20, rSInterface.bitPacked,
					rSInterface.tooltip, 0, !bool,
					Class37_Sub9_Sub8.aClass16_3045, 0);
		}
		if (bool != false)
			method1062(87, 103, 102, -116, 34);
		if ((rSInterface.actionType ^ 0xffffffff) == -6) {
			Class37_Sub9_Sub3.method774(10, rSInterface.bitPacked,
					rSInterface.tooltip, 0, true,
					Class37_Sub9_Sub8.aClass16_3045, 0);
			NodeSub.anInt1860++;
		}
		if (rSInterface.actionType == 6 && Class79.aClass18_1489 == null) {
			Class37_Sub9_Sub3.method774(25, rSInterface.bitPacked,
					rSInterface.tooltip, -1, true,
					Class37_Sub9_Sub8.aClass16_3045, 0);
			Class37_Sub4_Sub15.anInt2848++;
		}
		if (rSInterface.type == 2) {
			int i_4_ = 0;
			for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (rSInterface.height ^ 0xffffffff); i_5_++) {
				for (int i_6_ = 0; rSInterface.width > i_6_; i_6_++) {
					int i_7_ = (rSInterface.invSpritePadX + 32) * i_6_;
					int i_8_ = (32 + rSInterface.invSpritePadY) * i_5_;
					if (i_4_ < 20) {
						i_8_ += rSInterface.spriteY[i_4_];
						i_7_ += rSInterface.spriteX[i_4_];
					}
					if ((i ^ 0xffffffff) <= (i_7_ ^ 0xffffffff)
							&& (i_8_ ^ 0xffffffff) >= (i_3_ ^ 0xffffffff)
							&& (i_7_ + 32 ^ 0xffffffff) < (i ^ 0xffffffff)
							&& i_8_ + 32 > i_3_) {
						Class37_Sub4_Sub7_Sub7.anInt3850 = i_4_;
						Class37_Sub4_Sub4.aClass18_2579 = rSInterface;
						if (rSInterface.inv[i_4_] > 0) {
							RSItem class37_sub4_sub1 = Class46
									.loadItem((rSInterface.inv[i_4_])
											+ -1, (byte) 92);
							if ((Class37_Sub14.anInt2122 ^ 0xffffffff) != -2
									|| !(Class79.method1295((byte) 74,
											RuntimeException_Sub1.get_click_mask(
													rSInterface)))) {
								if (Class37_Sub4_Sub5.aBoolean2595
										&& (Class79
												.method1295(
														(byte) 127,
														RuntimeException_Sub1
																.get_click_mask(
																		rSInterface)))) {
									if ((Class37_Sub4_Sub12.anInt2759 & 0x10 ^ 0xffffffff) == -17) {
										Class37_Sub9_Sub3
												.method774(
														28,
														rSInterface.bitPacked,
														Class37_Sub9_Sub1.aClass16_2912,
														i_4_,
														true,
														(Class37_Sub9_Sub27
																.method881(
																		(new RSString[] {
																				Class60.aClass16_1142,
																				Class88.aClass16_1609,
																				(class37_sub4_sub1.itemName) }))),
														class37_sub4_sub1.itemId);
										Class37_Sub15.anInt2143++;
									}
								} else {
									Class69.anInt1337++;
									RSString[] class16s = class37_sub4_sub1.actions;
									if (Class32.aBoolean744)
										class16s = Class37_Sub18.method1017(
												class16s, 5);
									if (Class79.method1295((byte) 112,
											RuntimeException_Sub1.get_click_mask(
													rSInterface))) {
										for (int i_9_ = 4; (i_9_ ^ 0xffffffff) <= -4; i_9_--) {
											if (class16s != null
													&& class16s[i_9_] != null) {
												Class37_Sub23.anInt2226++;
												int i_10_;
												if (i_9_ == 3)
													i_10_ = 43;
												else
													i_10_ = 57;
												Class37_Sub9_Sub3
														.method774(
																i_10_,
																rSInterface.bitPacked,
																class16s[i_9_],
																i_4_,
																true,
																(Class37_Sub9_Sub27
																		.method881(
																				(new RSString[] {
																						(Class37_Sub4_Sub2.aClass16_2537),
																						(class37_sub4_sub1.itemName) }))),
																(class37_sub4_sub1.itemId));
											} else if ((i_9_ ^ 0xffffffff) == -5) {
												Class37_Sub9_Sub3
														.method774(
																57,
																rSInterface.bitPacked,
																(Class37_Sub1.aClass16_1796),
																i_4_,
																true,
																(Class37_Sub9_Sub27
																		.method881(
																				(new RSString[] {
																						(Class37_Sub4_Sub2.aClass16_2537),
																						(class37_sub4_sub1.itemName) }))),
																(class37_sub4_sub1.itemId));
												Class37_Sub4_Sub7_Sub1_Sub2.anInt3976++;
											}
										}
									}
									if (Class37_Sub9_Sub24.method869(
											RuntimeException_Sub1.get_click_mask(
													rSInterface), 0)) {
										Class76.anInt1424++;
										Class37_Sub9_Sub3
												.method774(
														5,
														rSInterface.bitPacked,
														Class37_Sub9_Sub27.aClass16_3404,
														i_4_,
														!bool,
														(Class37_Sub9_Sub27
																.method881(
																		(new RSString[] {
																				(Class37_Sub4_Sub2.aClass16_2537),
																				(class37_sub4_sub1.itemName) }))),
														class37_sub4_sub1.itemId);
									}
									if ((Class79.method1295((byte) -28,
											RuntimeException_Sub1.get_click_mask(
													rSInterface)))
											&& class16s != null) {
										for (int i_11_ = 2; (i_11_ ^ 0xffffffff) <= -1; i_11_--) {
											if (class16s[i_11_] != null) {
												int i_12_ = 0;
												InterfaceClickMask.anInt1987++;
												if ((i_11_ ^ 0xffffffff) == -1)
													i_12_ = 38;
												if ((i_11_ ^ 0xffffffff) == -2)
													i_12_ = 30;
												if ((i_11_ ^ 0xffffffff) == -3)
													i_12_ = 12;
												Class37_Sub9_Sub3
														.method774(
																i_12_,
																rSInterface.bitPacked,
																class16s[i_11_],
																i_4_,
																true,
																(Class37_Sub9_Sub27
																		.method881(
																				(new RSString[] {
																						(Class37_Sub4_Sub2.aClass16_2537),
																						(class37_sub4_sub1.itemName) }))),
																(class37_sub4_sub1.itemId));
											}
										}
									}
									class16s = rSInterface.oiActions;
									if (Class32.aBoolean744)
										class16s = Class37_Sub18.method1017(
												class16s, 5);
									if (class16s != null) {
										for (int i_13_ = 4; i_13_ >= 0; i_13_--) {
											if (class16s[i_13_] != null) {
												Class37_Sub9_Sub15.anInt3167++;
												int i_14_ = 0;
												if ((i_13_ ^ 0xffffffff) == -1)
													i_14_ = 37;
												if (i_13_ == 1)
													i_14_ = 39;
												if ((i_13_ ^ 0xffffffff) == -3)
													i_14_ = 41;
												if (i_13_ == 3)
													i_14_ = 58;
												if ((i_13_ ^ 0xffffffff) == -5)
													i_14_ = 21;
												Class37_Sub9_Sub3
														.method774(
																i_14_,
																rSInterface.bitPacked,
																class16s[i_13_],
																i_4_,
																true,
																(Class37_Sub9_Sub27
																		.method881(
																				(new RSString[] {
																						(Class37_Sub4_Sub2.aClass16_2537),
																						(class37_sub4_sub1.itemName) }))),
																(class37_sub4_sub1.itemId));
											}
										}
									}
									Class37_Sub9_Sub3
											.method774(
													1005,
													rSInterface.bitPacked,
													Class37_Sub4_Sub7_Sub7.aClass16_3844,
													i_4_,
													true,
													(Class37_Sub9_Sub27
															.method881(
																	(new RSString[] {
																			Class37_Sub4_Sub2.aClass16_2537,
																			(class37_sub4_sub1.itemName) }))),
													class37_sub4_sub1.itemId);
								}
							} else if ((rSInterface.bitPacked != Class37_Sub9_Sub21.anInt3317)
									|| i_4_ != MouseHandler.anInt174) {
								Class37_Sub9_Sub3
										.method774(
												44,
												rSInterface.bitPacked,
												Class37_Sub9_Sub27.aClass16_3404,
												i_4_,
												true,
												(Class37_Sub9_Sub27
														.method881(
																(new RSString[] {
																		Class64.aClass16_1218,
																		Class88.aClass16_1609,
																		class37_sub4_sub1.itemName }))),
												class37_sub4_sub1.itemId);
								OverridedInterface.anInt1883++;
							}
						}
					}
					i_4_++;
				}
			}
		}
		if (rSInterface.newFormat) {
			if (Class37_Sub4_Sub5.aBoolean2595) {
				if (Class37_Sub9_Sub33.method902(true, RuntimeException_Sub1
						.get_click_mask(rSInterface))
						&& (Class37_Sub4_Sub12.anInt2759 & 0x20) == 32) {
					ByteVector.anInt2043++;
					Class37_Sub9_Sub3.method774(35, rSInterface.bitPacked,
							Class37_Sub9_Sub1.aClass16_2912, rSInterface.anInt334,
							true,
							(Class37_Sub9_Sub27.method881((new RSString[] {
									Class60.aClass16_1142,
									Class37_Sub4_Sub7_Sub1_Sub2.aClass16_3960,
									rSInterface.action_name }))), 0);
				}
			} else {
				for (int i_15_ = 9; (i_15_ ^ 0xffffffff) <= -6; i_15_--) {
					RSString rSString = Class20.getAction(rSInterface, i_15_);
					if (rSString != null) {
						Class37_Sub9_Sub3.method774(1006, rSInterface.bitPacked,
								rSString, rSInterface.anInt334, true,
								rSInterface.action_name, 1 + i_15_);
						Class37_Sub9.anInt1958++;
					}
				}
				RSString rSString = Class37_Sub9_Sub37.method924(rSInterface,
						(byte) 88);
				if (rSString != null) {
					Class37_Sub9_Sub3.method774(13, rSInterface.bitPacked, rSString,
							rSInterface.anInt334, !bool, rSInterface.action_name, 0);
					Class37_Sub9_Sub18.anInt3242++;
				}
				for (int i_16_ = 4; (i_16_ ^ 0xffffffff) <= -1; i_16_--) {
					RSString class16_17_ = Class20.getAction(rSInterface, i_16_);
					if (class16_17_ != null) {
						Class37_Sub9_Sub3.method774(16, rSInterface.bitPacked,
								class16_17_, rSInterface.anInt334, true,
								rSInterface.action_name, 1 + i_16_);
						Class37_Sub9.anInt1958++;
					}
				}
				if (Cache.method1185(-113, RuntimeException_Sub1.get_click_mask(
						rSInterface))) {
					Class37_Sub9_Sub3.method774(25, rSInterface.bitPacked,
							Class71.continueString, rSInterface.anInt334, !bool,
							(Class37_Sub9_Sub8.aClass16_3045), 0);
					Class37_Sub4_Sub15.anInt2848++;
				}
			}
		}
	}

	public static void method1062(int i, int i_18_, int i_19_, int i_20_,
			int i_21_) {
		if (i_19_ == Class37_Sub14.anInt2122 && !Class37_Sub4_Sub5.aBoolean2595) {
			Class37_Sub9_Sub3.method774(2, i_21_ - i_18_,
					Class66.aClass16_1263, i_20_ + -i, true,
					Class37_Sub9_Sub8.aClass16_3045, 0);
			Class37_Sub23.anInt2229++;
		}
		anInt854++;
		int i_22_ = -1;
		for (int i_23_ = 0; i_23_ < Class37_Sub4_Sub7_Sub6_Sub1.anInt4019; i_23_++) {
			int i_24_ = Class37_Sub4_Sub7_Sub6_Sub1.anIntArray4038[i_23_];
			int i_25_ = i_24_ >> -1365688473 & 0x7f;
			int i_26_ = i_24_ >> 22314013 & 0x3;
			int i_27_ = i_24_ >> -1517302578 & 0x7fff;
			int i_28_ = i_24_ & 0x7f;
			if (i_22_ != i_24_) {
				i_22_ = i_24_;
				if (i_26_ == 2
						&& (Class38.aClass67_847.method1239(
								(Class37_Sub9_Sub1.anInt2916), i_28_, i_25_,
								i_24_) ^ 0xffffffff) <= -1) {
					Class37_Sub4_Sub11 class37_sub4_sub11 = Class37_Sub9_Sub8
							.method794(i_27_, 28067);
					if (class37_sub4_sub11.anIntArray2702 != null)
						class37_sub4_sub11 = class37_sub4_sub11
								.method681((byte) 107);
					if (class37_sub4_sub11 == null)
						continue;
					if ((Class37_Sub14.anInt2122 ^ 0xffffffff) == -2) {
						Class37_Sub9_Sub3
								.method774(
										50,
										i_25_,
										Class37_Sub9_Sub27.aClass16_3404,
										i_28_,
										true,
										(Class37_Sub9_Sub27
												.method881(
														(new RSString[] {
																Class64.aClass16_1218,
																Class84.aClass16_1522,
																class37_sub4_sub11.aClass16_2745 }))),
										i_24_);
						Class79.anInt1468++;
					} else if (!Class37_Sub4_Sub5.aBoolean2595) {
						RSString[] class16s = class37_sub4_sub11.aClass16Array2691;
						Class37_Sub9_Sub5.anInt2990++;
						if (Class32.aBoolean744)
							class16s = Class37_Sub18.method1017(class16s, 5);
						if (class16s != null) {
							for (int i_29_ = 4; i_29_ >= 0; i_29_--) {
								if (class16s[i_29_] != null) {
									Class54.anInt1062++;
									int i_30_ = 0;
									if ((i_29_ ^ 0xffffffff) == -1)
										i_30_ = 48;
									if (i_29_ == 1)
										i_30_ = 11;
									if (i_29_ == 2)
										i_30_ = 19;
									if ((i_29_ ^ 0xffffffff) == -4)
										i_30_ = 17;
									if (i_29_ == 4)
										i_30_ = 1001;
									Class37_Sub9_Sub3
											.method774(
													i_30_,
													i_25_,
													class16s[i_29_],
													i_28_,
													true,
													(Class37_Sub9_Sub27
															.method881(
																	(new RSString[] {
																			Class69.aClass16_1338,
																			(class37_sub4_sub11.aClass16_2745) }))),
													i_24_);
								}
							}
						}
						Class37_Sub9_Sub3
								.method774(
										1003,
										i_25_,
										Class37_Sub4_Sub7_Sub7.aClass16_3844,
										i_28_,
										true,
										(Class37_Sub9_Sub27
												.method881(
														(new RSString[] {
																Class69.aClass16_1338,
																class37_sub4_sub11.aClass16_2745 }))),
										class37_sub4_sub11.anInt2746 << -1419023058);
					} else if ((Class37_Sub4_Sub12.anInt2759 & 0x4 ^ 0xffffffff) == -5) {
						Class37_Sub9_Sub3
								.method774(
										23,
										i_25_,
										Class37_Sub9_Sub1.aClass16_2912,
										i_28_,
										true,
										(Class37_Sub9_Sub27
												.method881(
														(new RSString[] {
																Class60.aClass16_1142,
																Class84.aClass16_1522,
																class37_sub4_sub11.aClass16_2745 }))),
										i_24_);
						Class37_Sub4_Sub2.anInt2522++;
					}
				}
				if ((i_26_ ^ 0xffffffff) == -2) {
					Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_27_]);
					if (((class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955.anInt2858) ^ 0xffffffff) == -2
							&& (0x7f & class37_sub4_sub7_sub1_sub1.anInt3666 ^ 0xffffffff) == -65
							&& ((0x7f & class37_sub4_sub7_sub1_sub1.anInt3642) == 64)) {
						for (int i_31_ = 0; Class76.anInt1436 > i_31_; i_31_++) {
							Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1_32_ = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[Class37_Sub4_Sub16.anIntArray2869[i_31_]]);
							if (class37_sub4_sub7_sub1_sub1_32_ != null
									&& (class37_sub4_sub7_sub1_sub1 != class37_sub4_sub7_sub1_sub1_32_)
									&& ((class37_sub4_sub7_sub1_sub1_32_.aClass37_Sub4_Sub15_3955.anInt2858) ^ 0xffffffff) == -2
									&& (class37_sub4_sub7_sub1_sub1_32_.anInt3666 == class37_sub4_sub7_sub1_sub1.anInt3666)
									&& ((class37_sub4_sub7_sub1_sub1.anInt3642 ^ 0xffffffff) == ((class37_sub4_sub7_sub1_sub1_32_.anInt3642) ^ 0xffffffff)))
								Class68
										.method1244(
												Class37_Sub4_Sub16.anIntArray2869[i_31_],
												i_28_,
												i_25_,
												(class37_sub4_sub7_sub1_sub1_32_.aClass37_Sub4_Sub15_3955),
												false);
						}
						for (int i_33_ = 0; ((i_33_ ^ 0xffffffff) > (Class19.anInt487 ^ 0xffffffff)); i_33_++) {
							Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[Class26.anIntArray657[i_33_]]);
							if (class37_sub4_sub7_sub1_sub2 != null
									&& ((class37_sub4_sub7_sub1_sub2.anInt3666 ^ 0xffffffff) == (class37_sub4_sub7_sub1_sub1.anInt3666 ^ 0xffffffff))
									&& (class37_sub4_sub7_sub1_sub1.anInt3642 == class37_sub4_sub7_sub1_sub2.anInt3642))
								Class37_Sub9_Sub3.method773((byte) -20, i_28_,
										Class26.anIntArray657[i_33_], i_25_,
										class37_sub4_sub7_sub1_sub2);
						}
					}
					Class68
							.method1244(
									i_27_,
									i_28_,
									i_25_,
									(class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955),
									false);
				}
				if ((i_26_ ^ 0xffffffff) == -1) {
					Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_27_];
					if ((class37_sub4_sub7_sub1_sub2.anInt3666 & 0x7f ^ 0xffffffff) == -65
							&& ((0x7f & class37_sub4_sub7_sub1_sub2.anInt3642) == 64)) {
						for (int i_34_ = 0; Class76.anInt1436 > i_34_; i_34_++) {
							Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[Class37_Sub4_Sub16.anIntArray2869[i_34_]]);
							if (class37_sub4_sub7_sub1_sub1 != null
									&& ((class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955.anInt2858) ^ 0xffffffff) == -2
									&& (class37_sub4_sub7_sub1_sub1.anInt3666 == class37_sub4_sub7_sub1_sub2.anInt3666)
									&& ((class37_sub4_sub7_sub1_sub2.anInt3642 ^ 0xffffffff) == (class37_sub4_sub7_sub1_sub1.anInt3642 ^ 0xffffffff)))
								Class68
										.method1244(
												(Class37_Sub4_Sub16.anIntArray2869[i_34_]),
												i_28_,
												i_25_,
												(class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955),
												false);
						}
						for (int i_35_ = 0; ((i_35_ ^ 0xffffffff) > (Class19.anInt487 ^ 0xffffffff)); i_35_++) {
							Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2_36_ = (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[Class26.anIntArray657[i_35_]]);
							if (class37_sub4_sub7_sub1_sub2_36_ != null
									&& (class37_sub4_sub7_sub1_sub2 != class37_sub4_sub7_sub1_sub2_36_)
									&& ((class37_sub4_sub7_sub1_sub2.anInt3666 ^ 0xffffffff) == ((class37_sub4_sub7_sub1_sub2_36_.anInt3666) ^ 0xffffffff))
									&& ((class37_sub4_sub7_sub1_sub2_36_.anInt3642 ^ 0xffffffff) == (class37_sub4_sub7_sub1_sub2.anInt3642 ^ 0xffffffff)))
								Class37_Sub9_Sub3.method773((byte) -98, i_28_,
										Class26.anIntArray657[i_35_], i_25_,
										class37_sub4_sub7_sub1_sub2_36_);
						}
					}
					Class37_Sub9_Sub3.method773((byte) 122, i_28_, i_27_,
							i_25_, class37_sub4_sub7_sub1_sub2);
				}
				if (i_26_ == 3) {
					Deque landscape = (Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[Class37_Sub9_Sub1.anInt2916][i_28_][i_25_]);
					if (landscape != null) {
						for (Class37_Sub4_Sub7_Sub3 class37_sub4_sub7_sub3 = ((Class37_Sub4_Sub7_Sub3) landscape
								.getLast()); class37_sub4_sub7_sub3 != null; class37_sub4_sub7_sub3 = ((Class37_Sub4_Sub7_Sub3) landscape
								.getPrevious())) {
							RSItem class37_sub4_sub1 = Class46
									.loadItem(
											(class37_sub4_sub7_sub3.anInt3752),
											(byte) 105);
							if ((Class37_Sub14.anInt2122 ^ 0xffffffff) == -2) {
								Class37_Sub9_Sub34.anInt3536++;
								Class37_Sub9_Sub3
										.method774(
												29,
												i_25_,
												Class37_Sub9_Sub27.aClass16_3404,
												i_28_,
												true,
												(Class37_Sub9_Sub27
														.method881(
																(new RSString[] {
																		Class64.aClass16_1218,
																		Class88.aClass16_1609,
																		class37_sub4_sub1.itemName }))),
												class37_sub4_sub7_sub3.anInt3752);
							} else if (!Class37_Sub4_Sub5.aBoolean2595) {
								Class15_Sub1.anInt1748++;
								RSString[] class16s = class37_sub4_sub1.groundActions;
								if (Class32.aBoolean744)
									class16s = Class37_Sub18.method1017(
											class16s, (i_19_ ^ 0x5));
								for (int i_37_ = 4; i_37_ >= 0; i_37_--) {
									if (class16s == null
											|| class16s[i_37_] == null) {
										if (i_37_ == 2) {
											Class37_Sub9_Sub3
													.method774(
															24,
															i_25_,
															Class55.aClass16_1066,
															i_28_,
															true,
															(Class37_Sub9_Sub27
																	.method881(
																			(new RSString[] {
																					(Class37_Sub4_Sub2.aClass16_2537),
																					(class37_sub4_sub1.itemName) }))),
															(class37_sub4_sub7_sub3.anInt3752));
											Class37_Sub7.anInt1893++;
										}
									} else {
										Class37_Sub9_Sub20.anInt3277++;
										int i_38_ = 0;
										if ((i_37_ ^ 0xffffffff) == -1)
											i_38_ = 4;
										if ((i_37_ ^ 0xffffffff) == -2)
											i_38_ = 18;
										if (i_37_ == 2)
											i_38_ = 24;
										if (i_37_ == 3)
											i_38_ = 45;
										if (i_37_ == 4)
											i_38_ = 42;
										Class37_Sub9_Sub3
												.method774(
														i_38_,
														i_25_,
														class16s[i_37_],
														i_28_,
														true,
														(Class37_Sub9_Sub27
																.method881(
																		(new RSString[] {
																				(Class37_Sub4_Sub2.aClass16_2537),
																				(class37_sub4_sub1.itemName) }))),
														class37_sub4_sub7_sub3.anInt3752);
									}
								}
								Class37_Sub9_Sub3
										.method774(
												1002,
												i_25_,
												Class37_Sub4_Sub7_Sub7.aClass16_3844,
												i_28_,
												true,
												(Class37_Sub9_Sub27
														.method881(
																(new RSString[] {
																		Class37_Sub4_Sub2.aClass16_2537,
																		class37_sub4_sub1.itemName }))),
												class37_sub4_sub7_sub3.anInt3752);
							} else if ((0x1 & Class37_Sub4_Sub12.anInt2759 ^ 0xffffffff) == -2) {
								Class37_Sub9_Sub3
										.method774(
												31,
												i_25_,
												Class37_Sub9_Sub1.aClass16_2912,
												i_28_,
												true,
												(Class37_Sub9_Sub27
														.method881(
																(new RSString[] {
																		Class60.aClass16_1142,
																		Class88.aClass16_1609,
																		class37_sub4_sub1.itemName }))),
												class37_sub4_sub7_sub3.anInt3752);
								Class3.anInt84++;
							}
						}
					}
				}
			}
		}
	}

	public static void method1063(boolean bool) {
		anInt856++;
		Class32_Sub1.aClass65_1780.clear();
		if (bool != true)
			method1059(null, (byte) -64);
	}

	public static void method1064(
			Class37_Sub4_Sub7_Sub1 class37_sub4_sub7_sub1, byte i) {
		anInt860++;
		if (class37_sub4_sub7_sub1.anInt3668 != 0) {
			if (class37_sub4_sub7_sub1.anInt3653 != -1
					&& class37_sub4_sub7_sub1.anInt3653 < 32768) {
				Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[class37_sub4_sub7_sub1.anInt3653]);
				if (class37_sub4_sub7_sub1_sub1 != null) {
					int i_39_ = (-class37_sub4_sub7_sub1_sub1.anInt3666 + class37_sub4_sub7_sub1.anInt3666);
					int i_40_ = (-class37_sub4_sub7_sub1_sub1.anInt3642 + class37_sub4_sub7_sub1.anInt3642);
					if (i_39_ != 0 || i_40_ != 0)
						class37_sub4_sub7_sub1.anInt3681 = ((int) (325.949 * Math
								.atan2((double) i_39_, (double) i_40_)) & 0x7ff);
				}
			}
			if (class37_sub4_sub7_sub1.anInt3653 >= 32768) {
				int i_41_ = class37_sub4_sub7_sub1.anInt3653 + -32768;
				if (Class37_Sub9_Sub5.anInt2998 == i_41_)
					i_41_ = 2047;
				Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_41_];
				if (class37_sub4_sub7_sub1_sub2 != null) {
					int i_42_ = (class37_sub4_sub7_sub1.anInt3666 - class37_sub4_sub7_sub1_sub2.anInt3666);
					int i_43_ = (-class37_sub4_sub7_sub1_sub2.anInt3642 + class37_sub4_sub7_sub1.anInt3642);
					if ((i_42_ ^ 0xffffffff) != -1 || i_43_ != 0)
						class37_sub4_sub7_sub1.anInt3681 = (int) (Math.atan2(
								(double) i_42_, (double) i_43_) * 325.949) & 0x7ff;
				}
			}
			if ((class37_sub4_sub7_sub1.anInt3687 != 0 || (class37_sub4_sub7_sub1.anInt3679 ^ 0xffffffff) != -1)
					&& (class37_sub4_sub7_sub1.anInt3645 == 0 || class37_sub4_sub7_sub1.anInt3665 > 0)) {
				int i_44_ = (-((-Class37_Sub18.anInt2200 + (class37_sub4_sub7_sub1.anInt3687 - Class37_Sub18.anInt2200)) * 64) + class37_sub4_sub7_sub1.anInt3666);
				int i_45_ = (-((-Class15_Sub1.anInt1738 + (-Class15_Sub1.anInt1738 + class37_sub4_sub7_sub1.anInt3679)) * 64) + class37_sub4_sub7_sub1.anInt3642);
				if ((i_44_ ^ 0xffffffff) != -1 || (i_45_ ^ 0xffffffff) != -1)
					class37_sub4_sub7_sub1.anInt3681 = 0x7ff & (int) (Math
							.atan2((double) i_44_, (double) i_45_) * 325.949);
				class37_sub4_sub7_sub1.anInt3679 = 0;
				class37_sub4_sub7_sub1.anInt3687 = 0;
			}
			if (i != 113)
				anInt874 = -80;
			int i_46_ = ((class37_sub4_sub7_sub1.anInt3681 - class37_sub4_sub7_sub1.anInt3663) & 0x7ff);
			if ((i_46_ ^ 0xffffffff) != -1) {
				class37_sub4_sub7_sub1.anInt3637++;
				if (i_46_ <= 1024) {
					class37_sub4_sub7_sub1.anInt3663 += class37_sub4_sub7_sub1.anInt3668;
					boolean bool = true;
					if (((i_46_ ^ 0xffffffff) > (class37_sub4_sub7_sub1.anInt3668 ^ 0xffffffff))
							|| i_46_ > -class37_sub4_sub7_sub1.anInt3668 + 2048) {
						class37_sub4_sub7_sub1.anInt3663 = class37_sub4_sub7_sub1.anInt3681;
						bool = false;
					}
					if ((class37_sub4_sub7_sub1.anInt3701 == class37_sub4_sub7_sub1.anInt3647)
							&& (((class37_sub4_sub7_sub1.anInt3637 ^ 0xffffffff) < -26) || bool)) {
						if (class37_sub4_sub7_sub1.anInt3696 != -1)
							class37_sub4_sub7_sub1.anInt3647 = class37_sub4_sub7_sub1.anInt3696;
						else
							class37_sub4_sub7_sub1.anInt3647 = class37_sub4_sub7_sub1.anInt3657;
					}
				} else {
					class37_sub4_sub7_sub1.anInt3663 -= class37_sub4_sub7_sub1.anInt3668;
					boolean bool = true;
					if (((i_46_ ^ 0xffffffff) > (class37_sub4_sub7_sub1.anInt3668 ^ 0xffffffff))
							|| 2048 + -class37_sub4_sub7_sub1.anInt3668 < i_46_) {
						class37_sub4_sub7_sub1.anInt3663 = class37_sub4_sub7_sub1.anInt3681;
						bool = false;
					}
					if (((class37_sub4_sub7_sub1.anInt3647 ^ 0xffffffff) == (class37_sub4_sub7_sub1.anInt3701 ^ 0xffffffff))
							&& (class37_sub4_sub7_sub1.anInt3637 > 25 || bool)) {
						if ((class37_sub4_sub7_sub1.anInt3686 ^ 0xffffffff) != 0)
							class37_sub4_sub7_sub1.anInt3647 = class37_sub4_sub7_sub1.anInt3686;
						else
							class37_sub4_sub7_sub1.anInt3647 = class37_sub4_sub7_sub1.anInt3657;
					}
				}
				class37_sub4_sub7_sub1.anInt3663 &= 0x7ff;
			} else
				class37_sub4_sub7_sub1.anInt3637 = 0;
		}
	}

	static {
		keyPressAmount = 0;
	}
}
