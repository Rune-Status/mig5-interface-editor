package org.ie.client;

/* Class37_Sub9_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub15 extends Class37_Sub9 {
	public int[][] anIntArrayArray3157;
	public static RSString aClass16_3158 = Class37_Sub2.create_rsstring("Loaded sprites");
	public static Class15 aClass15_3159;
	public static RSString aClass16_3160;
	public int anInt3161 = 0;
	public static RSString aClass16_3162;
	public static int anInt3163;
	public static RSString aClass16_3164;
	public static RSString aClass16_3165;
	public static int anInt3166;
	public static int anInt3167;
	public static RSString aClass16_3168 = Class37_Sub2.create_rsstring("Create a free account");
	public static int anInt3169;
	public static RSString aClass16_3170 = Class37_Sub2.create_rsstring("Keine Antwort vom Anmelde)2Server)3");
	public static int anInt3171;
	public int[] anIntArray3172;
	public static int anInt3173;
	public static int anInt3174;
	public static ByteVector[] aClass37_Sub11Array3175;
	public static int anInt3176;
	public static int anInt3177;
	public static RSString aClass16_3178;
	public int[] anIntArray3179;
	public static int anInt3180;
	public static RSString aClass16_3181;
	public static int pressed_childs_y;

	public static void method822() {
		for (OverridedInterface class37_sub6 = (OverridedInterface) Class76.overridedInterfaces
				.getFirst(); class37_sub6 != null; class37_sub6 = (OverridedInterface) Class76.overridedInterfaces
				.getNext()) {
			int i_0_ = class37_sub6.interfaceId;
			if (InterfaceClickMask.loadExists(i_0_)) {
				boolean bool = true;
				RSInterface[] class18s = Class37_Sub9_Sub29.mainInterfaceArray[i_0_];
				for (int i_1_ = 0; i_1_ < class18s.length; i_1_++) {
					if (class18s[i_1_] != null) {
						bool = class18s[i_1_].newFormat;
						break;
					}
				}
				if (!bool) {
					int i_2_ = (int) class37_sub6.hash;
					RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_2_);
					if (rSInterface != null)
						Class73.refreshInterface(rSInterface);
				}
			}
		}
	}

	public int[] method761(int i, int i_3_) {
		int[] is = aClass38_1966.method1049(i_3_, true);
		if (i >= -125)
			anIntArray3172 = null;
		anInt3180++;
		while_71_: do {
			if (aClass38_1966.aBoolean850) {
				int[] is_4_ = this.method760(i_3_, 0, -81);
				int i_5_ = anInt3161;
				do {
					if (i_5_ != 2) {
						if (i_5_ != 1)
							break;
					} else {
						for (i_5_ = 0; ((Class32.anInt743 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)); i_5_++) {
							int i_6_ = is_4_[i_5_];
							int i_7_;
							for (i_7_ = 1; i_7_ < -1
									+ anIntArrayArray3157.length; i_7_++) {
								if ((anIntArrayArray3157[i_7_][0] ^ 0xffffffff) < (i_6_ ^ 0xffffffff))
									break;
							}
							int[] is_8_ = anIntArrayArray3157[-1 + i_7_];
							int[] is_9_ = anIntArrayArray3157[i_7_];
							int i_10_ = method826(-28401, -2 + i_7_)[1];
							int i_11_ = is_8_[1];
							int i_12_ = is_9_[1];
							int i_13_ = method826(-28401, 1 + i_7_)[1];
							int i_14_ = i_11_ + -i_10_ + (-i_12_ + i_13_);
							int i_15_ = ((-is_8_[0] + i_6_ << -467335092) / (is_9_[0] + -is_8_[0]));
							int i_16_ = i_15_ * i_15_ >> 494001356;
							int i_17_ = i_10_ - (i_11_ - -i_14_);
							int i_18_ = i_12_ + -i_10_;
							int i_19_ = ((i_15_ * i_14_ >> 1275534700) * i_16_ >> 1956249356);
							int i_20_ = i_17_ * i_16_ >> 974423468;
							int i_21_ = i_11_;
							int i_22_ = i_15_ * i_18_ >> 1437217740;
							is[i_5_] = i_21_ + (i_22_ + i_19_ - -i_20_);
						}
						break while_71_;
					}
					for (i_5_ = 0; (Class32.anInt743 ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
						int i_23_ = is_4_[i_5_];
						int i_24_;
						for (i_24_ = 1; ((anIntArrayArray3157.length - 1 ^ 0xffffffff) < (i_24_ ^ 0xffffffff)); i_24_++) {
							if (anIntArrayArray3157[i_24_][0] > i_23_)
								break;
						}
						int[] is_25_ = anIntArrayArray3157[i_24_];
						int[] is_26_ = anIntArrayArray3157[i_24_ - 1];
						int i_27_ = ((i_23_ - is_26_[0] << -558772308) / (-is_26_[0] + is_25_[0]));
						int i_28_ = (-(Class37_Sub4_Sub7_Sub2.anIntArray3711[0xff & i_27_ >> -1533740891]) + 4096 >> -37631935);
						int i_29_ = 4096 - i_28_;
						is[i_5_] = (i_29_ * is_26_[1] - -(is_25_[1] * i_28_) >> -1233495572);
					}
					break while_71_;
				} while (false);
				for (i_5_ = 0; (Class32.anInt743 ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
					int i_30_ = is_4_[i_5_];
					int i_31_;
					for (i_31_ = 1; anIntArrayArray3157.length - 1 > i_31_; i_31_++) {
						if ((i_30_ ^ 0xffffffff) > (anIntArrayArray3157[i_31_][0] ^ 0xffffffff))
							break;
					}
					int[] is_32_ = anIntArrayArray3157[i_31_];
					int[] is_33_ = anIntArrayArray3157[-1 + i_31_];
					int i_34_ = ((i_30_ - is_33_[0] << -1609325812) / (-is_33_[0] + is_32_[0]));
					int i_35_ = -i_34_ + 4096;
					is[i_5_] = (i_35_ * is_33_[1] - -(is_32_[1] * i_34_) >> -661043220);
				}
			}
		} while (false);
		return is;
	}

	public static void method823(Applet_Sub1 applet_sub1, int i) {
		if (i != 0)
			method823(null, -20);
		anInt3174++;
		if (Class37_Sub4_Sub13.aBoolean2799)
			Class37_Sub9_Sub19.method838(applet_sub1, i + 13634);
		else {
			if (Class37_Sub9_Sub28.lastMouseClick == 1
					&& (Class33.lastClickX ^ 0xffffffff) <= -716
					&& (Class37_Sub13.lastClickY ^ 0xffffffff) <= -454) {
				Class52.aBoolean1050 = !Class52.aBoolean1050;
				if (!Class52.aBoolean1050)
					Class38.method1054(RSItem.aClass16_2508, 255,
							(byte) 87, false, Class54.aClass15_Sub1_1060,
							Class37_Sub9_Sub33.aClass16_3524);
				else
					Class37_Sub9_Sub4.method778(false);
			}
			if (Class32.anInt740 != 5) {
				Class37_Sub9_Sub34.anInt3558++;
				if ((Class32.anInt740 ^ 0xffffffff) == -11) {
					if ((Class10.anInt193 ^ 0xffffffff) != -3
							&& Class37_Sub9_Sub25.anInt3382 == 0) {
						if ((Class37_Sub9_Sub28.lastMouseClick ^ 0xffffffff) == -2) {
							int i_36_ = 5;
							int i_37_ = 100;
							int i_38_ = 463;
							int i_39_ = 35;
							if (Class33.lastClickX >= i_36_
									&& i_37_ + i_36_ >= Class33.lastClickX
									&& ((i_38_ ^ 0xffffffff) >= (Class37_Sub13.lastClickY ^ 0xffffffff))
									&& i_38_ - -i_39_ >= Class37_Sub13.lastClickY) {
								Class37_Sub9_Sub9.method800(4594);
								return;
							}
						}
						if (Class37_Sub9.aClass22_1954 != null)
							Class37_Sub9_Sub9.method800(4594);
					}
					int i_40_ = Class37_Sub9_Sub28.lastMouseClick;
					int i_41_ = Class37_Sub13.lastClickY;
					int i_42_ = Class33.lastClickX;
					if ((RSInterface.anInt339 ^ 0xffffffff) == -1) {
						boolean bool = false;
						int i_43_ = 291;
						int i_44_ = 302;
						if (i_40_ == 1
								&& i_42_ >= -75 + i_44_
								&& (i_44_ + 75 ^ 0xffffffff) <= (i_42_ ^ 0xffffffff)
								&& (i_43_ - 20 ^ 0xffffffff) >= (i_41_ ^ 0xffffffff)
								&& (i_41_ ^ 0xffffffff) >= (i_43_ + 20 ^ 0xffffffff)) {
							Class37_Sub9_Sub31.anInt3495 = 0;
							RSInterface.anInt339 = 3;
						}
						if ((Class37_Sub9_Sub17.anInt3219 ^ 0xffffffff) != -1) {
							while (Class46.method1106(i)) {
								if ((Class37_Sub4_Sub3.currentTypedKeyCode ^ 0xffffffff) == -85) {
									bool = true;
									break;
								}
							}
						}
						i_44_ = 462;
						if (bool
								|| ((i_40_ ^ 0xffffffff) == -2
										&& (i_42_ ^ 0xffffffff) <= (i_44_ + -75 ^ 0xffffffff)
										&& (75 + i_44_ ^ 0xffffffff) <= (i_42_ ^ 0xffffffff)
										&& (i_43_ + -20 ^ 0xffffffff) >= (i_41_ ^ 0xffffffff) && ((20 + i_43_ ^ 0xffffffff) <= (i_41_ ^ 0xffffffff)))) {
							Class37_Sub9_Sub33.aClass16_3521 = Canvas_Sub1.aClass16_56;
							Class37_Sub9_Sub33.aClass16_3528 = RSItem.aClass16_2444;
							Class37_Sub9_Sub33.aClass16_3520 = RSItem.aClass16_2422;
							RSInterface.anInt339 = 2;
							Class37_Sub9_Sub31.anInt3495 = 0;
						}
					} else if (RSInterface.anInt339 == 2) {
						int i_45_ = 302;
						int i_46_ = 231;
						i_46_ += 30;
						int i_47_ = 321;
						if (i_40_ == 1
								&& (i_46_ + -15 ^ 0xffffffff) >= (i_41_ ^ 0xffffffff)
								&& (i_41_ ^ 0xffffffff) > (i_46_ ^ 0xffffffff))
							Class37_Sub9_Sub31.anInt3495 = 0;
						i_46_ += 15;
						if (i_40_ == 1 && i_46_ - 15 <= i_41_ && i_41_ < i_46_)
							Class37_Sub9_Sub31.anInt3495 = 1;
						i_46_ += 15;
						if (i_40_ == 1
								&& (i_45_ + -75 ^ 0xffffffff) >= (i_42_ ^ 0xffffffff)
								&& (75 + i_45_ ^ 0xffffffff) <= (i_42_ ^ 0xffffffff)
								&& (-20 + i_47_ ^ 0xffffffff) >= (i_41_ ^ 0xffffffff)
								&& (i_41_ ^ 0xffffffff) >= (20 + i_47_ ^ 0xffffffff)) {
							Class37_Sub9_Sub33.aClass16_3526 = Class37_Sub9_Sub33.aClass16_3526
									.method167(-1).method164(70);
							if ((Class37_Sub9_Sub33.aClass16_3526
									.length() ^ 0xffffffff) == -1)
								Class32_Sub1.method293((byte) -126,
										(RSItem.aClass16_2438),
										(RSItem.aClass16_2516),
										Class35.aClass16_787);
							else if ((Class37_Sub9_Sub33.password
									.length() ^ 0xffffffff) == -1)
								Class32_Sub1.method293((byte) -125,
										RSItem.aClass16_2461,
										RSItem.aClass16_2490,
										Class37_Sub18.aClass16_2191);
							else {
								Class32_Sub1.method293((byte) -126,
										(RSItem.aClass16_2450),
										(RSItem.aClass16_2488),
										Class76.aClass16_1432);
								Class37_Sub4_Sub3.setGameState(20);
							}
						} else {
							i_45_ = 462;
							if ((i_40_ ^ 0xffffffff) == -2
									&& i_45_ + -75 <= i_42_
									&& (75 + i_45_ ^ 0xffffffff) <= (i_42_ ^ 0xffffffff)
									&& (-20 + i_47_ ^ 0xffffffff) >= (i_41_ ^ 0xffffffff)
									&& ((20 + i_47_ ^ 0xffffffff) <= (i_41_ ^ 0xffffffff))) {
								//Class37_Sub9_Sub33.aClass16_3526 = Class37_Sub9_Sub33.aClass16_3524;
								RSInterface.anInt339 = 0;
								//Class37_Sub9_Sub33.aClass16_3525 = Class37_Sub9_Sub33.aClass16_3524;
							}
							while (Class46.method1106(i)) {
								boolean bool = false;
								for (int i_48_ = 0; ((i_48_ ^ 0xffffffff) > (Class45.aClass16_972
										.length() ^ 0xffffffff)); i_48_++) {
									if ((Class88.currenyTypedKeyChar ^ 0xffffffff) == (Class45.aClass16_972
											.charAt(i_48_) ^ 0xffffffff)) {
										bool = true;
										break;
									}
								}
								if ((Class37_Sub9_Sub31.anInt3495 ^ 0xffffffff) != -1) {
									if (Class37_Sub9_Sub31.anInt3495 == 1) {
										if ((Class37_Sub4_Sub3.currentTypedKeyCode ^ 0xffffffff) == -86
												&& (Class37_Sub9_Sub33.password
														.length() ^ 0xffffffff) < -1)
											Class37_Sub9_Sub33.password = (Class37_Sub9_Sub33.password
													.method169(
															0,
															0,
															-1
																	+ (Class37_Sub9_Sub33.password
																			.length())));
										if ((Class37_Sub4_Sub3.currentTypedKeyCode ^ 0xffffffff) == -85
												|| (Class37_Sub4_Sub3.currentTypedKeyCode == 80))
											Class37_Sub9_Sub31.anInt3495 = 0;
										if ((Class37_Sub9_Sub17.anInt3219 ^ 0xffffffff) != -1
												&& (Class37_Sub4_Sub3.currentTypedKeyCode ^ 0xffffffff) == -85) {
											Class37_Sub9_Sub33.aClass16_3526 = Class37_Sub9_Sub33.aClass16_3526
													.method167(i ^ 0xffffffff)
													.method164(70);
											if (Class37_Sub9_Sub33.aClass16_3526
													.length() == 0)
												Class32_Sub1
														.method293(
																(byte) -125,
																(RSItem.aClass16_2438),
																(RSItem.aClass16_2516),
																Class35.aClass16_787);
											else {
												if ((Class37_Sub9_Sub33.password
														.length() ^ 0xffffffff) == -1)
													Class32_Sub1
															.method293(
																	(byte) -125,
																	(RSItem.aClass16_2461),
																	(RSItem.aClass16_2490),
																	(Class37_Sub18.aClass16_2191));
												else {
													Class32_Sub1
															.method293(
																	(byte) -128,
																	(RSItem.aClass16_2450),
																	(RSItem.aClass16_2488),
																	(Class76.aClass16_1432));
													Class37_Sub4_Sub3
															.setGameState(20);
													break;
												}
												break;
											}
											break;
										}
										if (bool
												&& Class37_Sub9_Sub33.password
														.length() < 20)
											Class37_Sub9_Sub33.password = (Class37_Sub9_Sub33.password
													.method144(
															Class88.currenyTypedKeyChar,
															false));
									}
								} else {
									if ((Class37_Sub4_Sub3.currentTypedKeyCode ^ 0xffffffff) == -86
											&& Class37_Sub9_Sub33.aClass16_3526
													.length() > 0)
										Class37_Sub9_Sub33.aClass16_3526 = (Class37_Sub9_Sub33.aClass16_3526
												.method169(
														0,
														0,
														(Class37_Sub9_Sub33.aClass16_3526
																.length() - 1)));
									if ((Class37_Sub4_Sub3.currentTypedKeyCode ^ 0xffffffff) == -85
											|| Class37_Sub4_Sub3.currentTypedKeyCode == 80)
										Class37_Sub9_Sub31.anInt3495 = 1;
									if (bool
											&& (Class37_Sub9_Sub33.aClass16_3526
													.length() ^ 0xffffffff) > -13)
										Class37_Sub9_Sub33.aClass16_3526 = (Class37_Sub9_Sub33.aClass16_3526
												.method144(Class88.currenyTypedKeyChar,
														false));
								}
							}
						}
					} else if (RSInterface.anInt339 == 3) {
						int i_49_ = 382;
						int i_50_ = 321;
						if (i_40_ == 1
								&& (i_42_ ^ 0xffffffff) <= (-75 + i_49_ ^ 0xffffffff)
								&& i_49_ + 75 >= i_42_
								&& i_41_ >= i_50_ + -20
								&& (i_41_ ^ 0xffffffff) >= (20 + i_50_ ^ 0xffffffff))
							RSInterface.anInt339 = 0;
					}
				}
			}
		}
	}

	public Class37_Sub9_Sub15() {
		super(1, true);
	}

	public void method824(byte i) {
		anInt3171++;
		int[] is = anIntArrayArray3157[0];
		int[] is_51_ = anIntArrayArray3157[-2 + anIntArrayArray3157.length];
		int i_52_ = -34 % ((i - -32) / 41);
		int[] is_53_ = anIntArrayArray3157[1];
		int[] is_54_ = anIntArrayArray3157[anIntArrayArray3157.length - 1];
		anIntArray3179 = new int[] { -is_53_[0] + is[0] + is[0],
				is[1] - -is[1] + -is_53_[1] };
		anIntArray3172 = new int[] { is_51_[0] + (is_51_[0] - is_54_[0]),
				is_51_[1] - (is_54_[1] - is_51_[1]) };
	}

	public void method750(ByteVector class37_sub11, int i, boolean bool) {
		if ((i ^ 0xffffffff) == -1) {
			anInt3161 = class37_sub11.getUnsignedByte();
			anIntArrayArray3157 = new int[class37_sub11.getUnsignedByte()][2];
			for (int i_55_ = 0; anIntArrayArray3157.length > i_55_; i_55_++) {
				anIntArrayArray3157[i_55_][0] = class37_sub11.getUnsignedShort();
				anIntArrayArray3157[i_55_][1] = class37_sub11.getUnsignedShort();
			}
		}
		anInt3176++;
		if (bool != true)
			pressed_childs_y = -49;
	}

	public void method752(int i) {
		anInt3166++;
		if (anIntArrayArray3157 == null)
			anIntArrayArray3157 = new int[][] { new int[2], { 4096, 4096 } };
		if (anIntArrayArray3157.length < 2)
			throw new RuntimeException(
					"Curve operation requires at least two markers");
		if ((anInt3161 ^ 0xffffffff) == -3)
			method824((byte) 42);
		Class37_Sub9_Sub28.method884(i ^ 0x7d);
		if (i != -2)
			aClass16_3160 = null;
	}

	public static void method825(int i) {
		aClass16_3165 = null;
		aClass16_3170 = null;
		aClass16_3164 = null;
		aClass16_3181 = null;
		aClass16_3162 = null;
		aClass16_3158 = null;
		aClass37_Sub11Array3175 = null;
		aClass15_3159 = null;
		aClass16_3160 = null;
		if (i == 7605) {
			aClass16_3178 = null;
			aClass16_3168 = null;
		}
	}

	public int[] method826(int i, int i_56_) {
		anInt3163++;
		if (i_56_ < 0)
			return anIntArray3179;
		if ((i_56_ ^ 0xffffffff) <= (anIntArrayArray3157.length ^ 0xffffffff))
			return anIntArray3172;
		if (i != -28401)
			aClass16_3158 = null;
		return anIntArrayArray3157[i_56_];
	}

	static {
		aClass16_3165 = Class37_Sub2.create_rsstring("yellow:");
		anInt3169 = 0;
		aClass16_3164 = aClass16_3158;
		aClass16_3160 = (Class37_Sub2.create_rsstring("Startseite auf (WSpielkonto wiederherstellen(W)3"));
		aClass37_Sub11Array3175 = new ByteVector[2048];
		aClass16_3162 = aClass16_3168;
		aClass16_3178 = aClass16_3165;
		aClass16_3181 = aClass16_3165;
		pressed_childs_y = 0;
	}
}
