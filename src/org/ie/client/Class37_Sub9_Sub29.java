package org.ie.client;

/* Class37_Sub9_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub29 extends Class37_Sub9 {
	public static int anInt3441;
	public static RSString aClass16_3442;
	public static RSString aClass16_3443;
	public static RSString aClass16_3444 = Class37_Sub2.create_rsstring("Mem:");
	public static int anInt3445;
	public static int anInt3446;
	public static RSString aClass16_3447;
	public static int anInt3448;
	public static RSString aClass16_3449;
	public static RSString[] aClass16Array3450;
	public static int anInt3451;
	public static volatile int currentMouseClick;
	public static RSString aClass16_3453;
	public static RSInterface[][] mainInterfaceArray;
	public int anInt3455 = 6;
	public static int anInt3456;
	public static int anInt3457;
	public static int anInt3458;

	public void method750(ByteVector class37_sub11, int i, boolean bool) {
		if (bool != true)
			currentMouseClick = 47;
		int i_0_ = i;
		do {
			if (i_0_ != 0) {
				if ((i_0_ ^ 0xffffffff) != -2)
					break;
			} else {
				anInt3455 = class37_sub11.getUnsignedByte();
				break;
			}
			aBoolean1943 = class37_sub11.getUnsignedByte() == 1;
		} while (false);
		anInt3458++;
	}

	public int[] method761(int i, int i_1_) {
		anInt3451++;
		if (i > -125)
			return null;
		int[] is = aClass38_1966.method1049(i_1_, true);
		if (aClass38_1966.aBoolean850) {
			int[] is_2_ = this.method760(i_1_, 0, -54);
			int[] is_3_ = this.method760(i_1_, 1, -43);
			for (int i_4_ = 0; (Class32.anInt743 ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++)
				is[i_4_] = method888(is_2_[i_4_], (byte) 110, is_3_[i_4_]);
		}
		return is;
	}

	public int method888(int i, byte i_5_, int i_6_) {
		anInt3456++;
		if (i_5_ <= 48)
			return 57;
		int i_7_ = anInt3455;
		while_106_: do {
			while_105_: do {
				while_104_: do {
					while_103_: do {
						while_102_: do {
							while_101_: do {
								while_100_: do {
									while_99_: do {
										while_98_: do {
											while_97_: do {
												do {
													if (i_7_ != 1) {
														if ((i_7_ ^ 0xffffffff) != -3) {
															if ((i_7_ ^ 0xffffffff) != -4) {
																if (i_7_ != 4) {
																	if (i_7_ != 5) {
																		if (i_7_ != 6) {
																			if (i_7_ != 7) {
																				if ((i_7_ ^ 0xffffffff) != -9) {
																					if ((i_7_ ^ 0xffffffff) != -10) {
																						if (i_7_ != 10) {
																							if ((i_7_ ^ 0xffffffff) != -12) {
																								if ((i_7_ ^ 0xffffffff) != -13)
																									break while_106_;
																							} else
																								break while_104_;
																							break while_105_;
																						}
																					} else
																						break while_102_;
																					break while_103_;
																				}
																			} else
																				break while_100_;
																			break while_101_;
																		}
																	} else
																		break while_98_;
																	break while_99_;
																}
															} else
																break;
															break while_97_;
														}
													} else
														return i_6_ + i;
													return i + -i_6_;
												} while (false);
												return i_6_ * i >> -1968750068;
											} while (false);
											if ((i_6_ ^ 0xffffffff) == -1)
												return 4096;
											return (i << 1829298732) / i_6_;
										} while (false);
										return (-((-i_6_ + 4096) * (4096 - i) >> -1000825012) + 4096);
									} while (false);
									if (i_6_ < 2048)
										return i * i_6_ >> 263396011;
									return (-((-i_6_ + 4096) * (4096 - i) >> -1365076789) + 4096);
								} while (false);
								if (i != 4096)
									return (i_6_ << -646554996) / (-i + 4096);
								return 4096;
							} while (false);
							if ((i ^ 0xffffffff) != -1)
								return (-((4096 - i_6_ << -1722912404) / i) + 4096);
							return 0;
						} while (false);
						if (i < i_6_)
							return i;
						return i_6_;
					} while (false);
					if (i_6_ < i)
						return i;
					return i_6_;
				} while (false);
				if (i > i_6_)
					return -i_6_ + i;
				return -i + i_6_;
			} while (false);
			return -(i_6_ * i >> 84963243) + i_6_ + i;
		} while (false);
		return i;
	}

	public static void method889(boolean bool) {
		Class37_Sub9_Sub4.aClass65_2973.clear();
		anInt3448++;
		if (bool != false)
			method891((byte) -51);
	}

	public Class37_Sub9_Sub29() {
		super(2, false);
	}

	public int[][] method759(byte i, int i_8_) {
		anInt3446++;
		int[][] is = aClass33_1946.method298(false, i_8_);
		if (aClass33_1946.aBoolean767) {
			int[][] is_9_ = this.method762(0, i_8_, (byte) -100);
			int[][] is_10_ = this.method762(1, i_8_, (byte) -104);
			int[] is_11_ = is[0];
			int[] is_12_ = is[1];
			int[] is_13_ = is[2];
			int[] is_14_ = is_9_[0];
			int[] is_15_ = is_9_[1];
			int[] is_16_ = is_9_[2];
			int[] is_17_ = is_10_[0];
			int[] is_18_ = is_10_[1];
			int[] is_19_ = is_10_[2];
			for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > (Class32.anInt743 ^ 0xffffffff); i_20_++) {
				is_11_[i_20_] = method888(is_14_[i_20_], (byte) 57,
						is_17_[i_20_]);
				is_12_[i_20_] = method888(is_15_[i_20_], (byte) 98,
						is_18_[i_20_]);
				is_13_[i_20_] = method888(is_16_[i_20_], (byte) 89,
						is_19_[i_20_]);
			}
		}
		if (i < 111)
			method891((byte) 23);
		return is;
	}

	public static void method890(int i) {
		aClass16_3443 = null;
		mainInterfaceArray = null;
		aClass16_3442 = null;
		aClass16_3453 = null;
		aClass16_3447 = null;
		aClass16_3444 = null;
		aClass16_3449 = null;
		aClass16Array3450 = null;
		int i_21_ = -53 % (-i / 61);
	}

	public static void method891(byte i) {
		anInt3441++;
		for (Class37_Sub4_Sub7_Sub7 class37_sub4_sub7_sub7 = (Class37_Sub4_Sub7_Sub7) Class19.aClass58_481
				.getFirst(); class37_sub4_sub7_sub7 != null; class37_sub4_sub7_sub7 = ((Class37_Sub4_Sub7_Sub7) Class19.aClass58_481
				.getNext())) {
			if (class37_sub4_sub7_sub7.anInt3855 != Class37_Sub9_Sub1.anInt2916
					|| class37_sub4_sub7_sub7.aBoolean3840)
				class37_sub4_sub7_sub7.unlink();
			else if ((Class37_Sub7.loopCycle ^ 0xffffffff) <= (class37_sub4_sub7_sub7.anInt3843 ^ 0xffffffff)) {
				class37_sub4_sub7_sub7.method570(Class37_Sub9_Sub37.anInt3589,
						(byte) 84);
				if (!class37_sub4_sub7_sub7.aBoolean3840)
					Class38.aClass67_847.method1238(
							class37_sub4_sub7_sub7.anInt3855,
							class37_sub4_sub7_sub7.anInt3847,
							class37_sub4_sub7_sub7.anInt3856,
							class37_sub4_sub7_sub7.anInt3857, 60,
							class37_sub4_sub7_sub7, 0, -1, false);
				else
					class37_sub4_sub7_sub7.unlink();
			}
		}
		if (i < 28)
			aClass16_3442 = null;
	}

	static {
		aClass16_3442 = Class37_Sub2.create_rsstring("weiss:");
		aClass16_3447 = Class37_Sub2.create_rsstring("scrollbar");
		aClass16_3449 = Class37_Sub2.create_rsstring("Mitglieder)2Welt");
		aClass16Array3450 = new RSString[100];
		aClass16_3453 = Class37_Sub2.create_rsstring("Players");
		aClass16_3443 = aClass16_3453;
		anInt3457 = 0;
		currentMouseClick = 0;
	}
}
