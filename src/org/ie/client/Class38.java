package org.ie.client;

/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class38 {
	public static RSString aClass16_824;
	public static int anInt825;
	public static int anInt826;
	public static RSString aClass16_827;
	public int anInt828 = 0;
	public static int anInt829;
	public static RSString aClass16_830;
	public static RSString aClass16_831 = Class37_Sub2.create_rsstring(
			" ");
	public Deque aClass58_832;
	public static int anInt833;
	public static int anInt834;
	public static RSString aClass16_835;
	public Class37_Sub16[] aClass37_Sub16Array836;
	public static int anInt837 = 2;
	public int anInt838;
	public static int anInt839;
	public static RSString aClass16_840;
	public int anInt841 = -1;
	public static RSString aClass16_842;
	public static RSString aClass16_843;
	public int[][] anIntArrayArray844;
	public static int anInt845;
	public static RSString aClass16_846;
	public static Class67 aClass67_847;
	public static int anInt848;
	public int anInt849;
	public boolean aBoolean850;
	public static int anInt851;
	public static int anInt852;

	public static void method1048(int i) {
		if (i == -15581) {
			for (Class37_Sub7 class37_sub7 = (Class37_Sub7) NodeSub.aClass58_1857
					.getFirst(); class37_sub7 != null; class37_sub7 = (Class37_Sub7) NodeSub.aClass58_1857
					.getNext()) {
				if (class37_sub7.aClass37_Sub3_Sub4_1896 != null) {
					Class1.aClass37_Sub3_Sub2_59
							.method353(class37_sub7.aClass37_Sub3_Sub4_1896);
					class37_sub7.aClass37_Sub3_Sub4_1896 = null;
				}
				if (class37_sub7.aClass37_Sub3_Sub4_1917 != null) {
					Class1.aClass37_Sub3_Sub2_59
							.method353(class37_sub7.aClass37_Sub3_Sub4_1917);
					class37_sub7.aClass37_Sub3_Sub4_1917 = null;
				}
			}
			anInt825++;
			NodeSub.aClass58_1857.clear();
		}
	}

	public int[] method1049(int i, boolean bool) {
		anInt826++;
		if (bool != true)
			anIntArrayArray844 = null;
		if (anInt849 != anInt838) {
			if (anInt838 != 1) {
				Class37_Sub16 class37_sub16 = aClass37_Sub16Array836[i];
				if (aBoolean850 = class37_sub16 == null) {
					if ((anInt838 ^ 0xffffffff) >= (anInt828 ^ 0xffffffff)) {
						Class37_Sub16 class37_sub16_0_ = (Class37_Sub16) aClass58_832
								.getLast();
						class37_sub16 = new Class37_Sub16(i,
								class37_sub16_0_.anInt2156);
						aClass37_Sub16Array836[class37_sub16_0_.anInt2148] = null;
						class37_sub16_0_.unlink();
					} else {
						class37_sub16 = new Class37_Sub16(i, anInt828);
						anInt828++;
					}
					aClass37_Sub16Array836[i] = class37_sub16;
				}
				aClass58_832.addFront(class37_sub16);
				return anIntArrayArray844[class37_sub16.anInt2156];
			}
			aBoolean850 = (anInt841 ^ 0xffffffff) != (i ^ 0xffffffff);
			anInt841 = i;
			return anIntArrayArray844[0];
		}
		aBoolean850 = aClass37_Sub16Array836[i] == null;
		aClass37_Sub16Array836[i] = Class19.aClass37_Sub16_472;
		return anIntArrayArray844[i];
	}

	public static int method1050(int i, int i_1_, RSInterface rSInterface) {
		anInt852++;
		if (rSInterface.cs1opcodes == null
				|| (i_1_ ^ 0xffffffff) <= (rSInterface.cs1opcodes.length ^ 0xffffffff))
			return -2;
		try {
			int i_2_ = 0;
			int[] is = rSInterface.cs1opcodes[i_1_];
			if (i != -29842)
				aClass16_830 = null;
			int i_3_ = 0;
			int i_4_ = 0;
			for (;;) {
				int i_5_ = is[i_3_++];
				int i_6_ = 0;
				int i_7_ = 0;
				if ((i_5_ ^ 0xffffffff) == -1)
					return i_2_;
				if ((i_5_ ^ 0xffffffff) == -16)
					i_7_ = 1;
				if ((i_5_ ^ 0xffffffff) == -2)
					i_6_ = Class82.anIntArray1696[is[i_3_++]];
				if ((i_5_ ^ 0xffffffff) == -3)
					i_6_ = Class68.anIntArray1324[is[i_3_++]];
				if (i_5_ == 3)
					i_6_ = Class37_Sub12.anIntArray2104[is[i_3_++]];
				if ((i_5_ ^ 0xffffffff) == -17)
					i_7_ = 2;
				if ((i_5_ ^ 0xffffffff) == -18)
					i_7_ = 3;
				if ((i_5_ ^ 0xffffffff) == -5) {
					int i_8_ = is[i_3_++] << -2062183792;
					i_8_ += is[i_3_++];
					RSInterface class18_9_ = Class37_Sub9_Sub14.getInterface(
							i_8_);
					int i_10_ = is[i_3_++];
					if (i_10_ != -1
							&& (!Class46.loadItem(i_10_, (byte) 124).membersObject || Class37_Sub4_Sub13.aBoolean2791)) {
						for (int i_11_ = 0; i_11_ < class18_9_.inv.length; i_11_++) {
							if ((1 + i_10_ ^ 0xffffffff) == (class18_9_.inv[i_11_] ^ 0xffffffff))
								i_6_ += class18_9_.invStackSize[i_11_];
						}
					}
				}
				if (i_5_ == 5)
					i_6_ = Class37_Sub23.varpData[is[i_3_++]];
				if (i_5_ == 6)
					i_6_ = (Class17.anIntArray307[-1
							+ Class68.anIntArray1324[is[i_3_++]]]);
				if ((i_5_ ^ 0xffffffff) == -8)
					i_6_ = (Class37_Sub23.varpData[is[i_3_++]] * 100 / 46875);
				if ((i_5_ ^ 0xffffffff) == -9)
					i_6_ = (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3978);
				if (i_5_ == 9) {
					for (int i_12_ = 0; i_12_ < 25; i_12_++) {
						if (Class37_Sub4_Sub7_Sub3.aBooleanArray3748[i_12_])
							i_6_ += Class68.anIntArray1324[i_12_];
					}
				}
				if (i_5_ == 10) {
					int i_13_ = is[i_3_++] << 20671440;
					i_13_ += is[i_3_++];
					RSInterface class18_14_ = Class37_Sub9_Sub14.getInterface(
							i_13_);
					int i_15_ = is[i_3_++];
					if (i_15_ != -1
							&& (!Class46.loadItem(i_15_, (byte) 80).membersObject || Class37_Sub4_Sub13.aBoolean2791)) {
						for (int i_16_ = 0; i_16_ < class18_14_.inv.length; i_16_++) {
							if ((i_15_ - -1 ^ 0xffffffff) == (class18_14_.inv[i_16_] ^ 0xffffffff)) {
								i_6_ = 999999999;
								break;
							}
						}
					}
				}
				if ((i_5_ ^ 0xffffffff) == -12)
					i_6_ = Class37_Sub4_Sub16.anInt2864;
				if (i_5_ == 12)
					i_6_ = Class33.anInt761;
				if ((i_5_ ^ 0xffffffff) == -14) {
					int i_17_ = Class37_Sub23.varpData[is[i_3_++]];
					int i_18_ = is[i_3_++];
					i_6_ = (i_17_ & 1 << i_18_ ^ 0xffffffff) != -1 ? 1 : 0;
				}
				if ((i_5_ ^ 0xffffffff) == -15) {
					int i_19_ = is[i_3_++];
					i_6_ = ByteVector.method983(i_19_, 124);
				}
				if ((i_5_ ^ 0xffffffff) == -19)
					i_6_ = (Class37_Sub18.anInt2200 + ((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666) >> -909385657));
				if ((i_5_ ^ 0xffffffff) == -20)
					i_6_ = ((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642) >> 413310695)
							- -Class15_Sub1.anInt1738;
				if (i_5_ == 20)
					i_6_ = is[i_3_++];
				if ((i_7_ ^ 0xffffffff) != -1)
					i_4_ = i_7_;
				else {
					if (i_4_ == 0)
						i_2_ += i_6_;
					if ((i_4_ ^ 0xffffffff) == -2)
						i_2_ -= i_6_;
					if ((i_4_ ^ 0xffffffff) == -3 && i_6_ != 0)
						i_2_ /= i_6_;
					if (i_4_ == 3)
						i_2_ *= i_6_;
					i_4_ = 0;
				}
			}
		} catch (Exception exception) {
			return -1;
		}
	}

	public static void method1051(int i) {
		aClass16_824 = null;
		aClass67_847 = null;
		aClass16_840 = null;
		if (i <= -122) {
			aClass16_842 = null;
			aClass16_843 = null;
			aClass16_846 = null;
			aClass16_831 = null;
			aClass16_830 = null;
			aClass16_827 = null;
			aClass16_835 = null;
		}
	}

	public static void method1052(RSString rSString, int i, int i_20_,
			RSString class16_21_, RSString class16_22_) {
		for (int i_23_ = 99; (i_23_ ^ 0xffffffff) < -1; i_23_--) {
			Class41.anIntArray902[i_23_] = Class41.anIntArray902[-1 + i_23_];
			Class37_Sub9_Sub29.aClass16Array3450[i_23_] = Class37_Sub9_Sub29.aClass16Array3450[-1 + i_23_];
			ByteVector.aClass16Array2041[i_23_] = ByteVector.aClass16Array2041[-1 + i_23_];
			Class37_Sub12.aClass16Array2093[i_23_] = Class37_Sub12.aClass16Array2093[-1 + i_23_];
		}
		Queue.anInt1447 = Class83.anInt1515;
		Class8.anInt168++;
		Class41.anIntArray902[0] = i;
		Class37_Sub9_Sub29.aClass16Array3450[0] = rSString;
		ByteVector.aClass16Array2041[0] = class16_21_;
		Class37_Sub12.aClass16Array2093[0] = class16_22_;
	}

	public int[][] method1053(int i) {
		anInt848++;
		if ((anInt849 ^ 0xffffffff) != (anInt838 ^ 0xffffffff))
			throw new RuntimeException("Can only retrieve a full image cache");
		if (i <= 16)
			return null;
		for (int i_24_ = 0; anInt838 > i_24_; i_24_++)
			aClass37_Sub16Array836[i_24_] = Class19.aClass37_Sub16_472;
		return anIntArrayArray844;
	}

	public static void method1054(RSString rSString, int i, byte i_25_,
			boolean bool, Class15 class15, RSString class16_26_) {
		try {
			anInt834++;
			int i_27_ = class15.method123((byte) 32, rSString);
			if (i_25_ <= 31)
				aClass16_842 = null;
			int i_28_ = class15.method128(class16_26_, -91, i_27_);
			Class15.method120(i, i_28_, bool, -15793, class15, i_27_);
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("lc.I("
					+ (rSString != null ? "{...}" : "null") + ',' + i + ','
					+ i_25_ + ',' + bool + ','
					+ (class15 != null ? "{...}" : "null") + ','
					+ (class16_26_ != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1055(byte i) {
		Class83.byteVector.method993(false);
		anInt833++;
		int i_29_ = Class83.byteVector.method996(8, 14);
		if ((i_29_ ^ 0xffffffff) > (Class76.anInt1436 ^ 0xffffffff)) {
			for (int i_30_ = i_29_; Class76.anInt1436 > i_30_; i_30_++)
				Applet_Sub1.anIntArray30[Class37_Sub9_Sub21.anInt3306++] = Class37_Sub4_Sub16.anIntArray2869[i_30_];
		}
		if (i == -12) {
			if ((Class76.anInt1436 ^ 0xffffffff) > (i_29_ ^ 0xffffffff))
				throw new RuntimeException("gnpov1");
			Class76.anInt1436 = 0;
			for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > (i_29_ ^ 0xffffffff); i_31_++) {
				int i_32_ = Class37_Sub4_Sub16.anIntArray2869[i_31_];
				Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_32_]);
				int i_33_ = Class83.byteVector.method996(1, i ^ ~0x39);
				if ((i_33_ ^ 0xffffffff) == -1) {
					Class37_Sub4_Sub16.anIntArray2869[Class76.anInt1436++] = i_32_;
					class37_sub4_sub7_sub1_sub1.anInt3641 = Class37_Sub7.loopCycle;
				} else {
					int i_34_ = Class83.byteVector.method996(2, 60);
					if ((i_34_ ^ 0xffffffff) == -1) {
						Class37_Sub4_Sub16.anIntArray2869[Class76.anInt1436++] = i_32_;
						class37_sub4_sub7_sub1_sub1.anInt3641 = Class37_Sub7.loopCycle;
						Class36.anIntArray809[Class37_Sub9_Sub11.anInt3098++] = i_32_;
					} else if ((i_34_ ^ 0xffffffff) == -2) {
						Class37_Sub4_Sub16.anIntArray2869[Class76.anInt1436++] = i_32_;
						class37_sub4_sub7_sub1_sub1.anInt3641 = Class37_Sub7.loopCycle;
						int i_35_ = Class83.byteVector.method996(3, 99);
						class37_sub4_sub7_sub1_sub1.method495(false, i + -3511,
								i_35_);
						int i_36_ = Class83.byteVector.method996(1, 118);
						if (i_36_ == 1)
							Class36.anIntArray809[Class37_Sub9_Sub11.anInt3098++] = i_32_;
					} else if (i_34_ == 2) {
						Class37_Sub4_Sub16.anIntArray2869[Class76.anInt1436++] = i_32_;
						class37_sub4_sub7_sub1_sub1.anInt3641 = Class37_Sub7.loopCycle;
						int i_37_ = Class83.byteVector.method996(3, i ^ ~0x3e);
						class37_sub4_sub7_sub1_sub1.method495(true, i ^ 0xdc9,
								i_37_);
						int i_38_ = Class83.byteVector.method996(3, 43);
						class37_sub4_sub7_sub1_sub1.method495(true, -3523,
								i_38_);
						int i_39_ = Class83.byteVector.method996(1, 98);
						if ((i_39_ ^ 0xffffffff) == -2)
							Class36.anIntArray809[Class37_Sub9_Sub11.anInt3098++] = i_32_;
					} else if ((i_34_ ^ 0xffffffff) == -4)
						Applet_Sub1.anIntArray30[Class37_Sub9_Sub21.anInt3306++] = i_32_;
				}
			}
		}
	}

	public static void method1056(boolean bool) {
		if (bool != true)
			aClass16_830 = null;
		anInt829++;
		if (Signlink.aString1039.toLowerCase().indexOf("microsoft") != -1) {
			Class37_Sub5.keycodes[188] = 71;
			Class37_Sub5.keycodes[186] = 57;
			Class37_Sub5.keycodes[189] = 26;
			Class37_Sub5.keycodes[223] = 28;
			Class37_Sub5.keycodes[191] = 73;
			Class37_Sub5.keycodes[192] = 58;
			Class37_Sub5.keycodes[220] = 74;
			Class37_Sub5.keycodes[222] = 59;
			Class37_Sub5.keycodes[190] = 72;
			Class37_Sub5.keycodes[187] = 27;
			Class37_Sub5.keycodes[221] = 43;
			Class37_Sub5.keycodes[219] = 42;
		} else {
			if (Signlink.aMethod1035 == null) {
				Class37_Sub5.keycodes[222] = 59;
				Class37_Sub5.keycodes[192] = 58;
			} else {
				Class37_Sub5.keycodes[520] = 59;
				Class37_Sub5.keycodes[222] = 58;
				Class37_Sub5.keycodes[192] = 28;
			}
			Class37_Sub5.keycodes[92] = 74;
			Class37_Sub5.keycodes[46] = 72;
			Class37_Sub5.keycodes[93] = 43;
			Class37_Sub5.keycodes[47] = 73;
			Class37_Sub5.keycodes[45] = 26;
			Class37_Sub5.keycodes[61] = 27;
			Class37_Sub5.keycodes[59] = 57;
			Class37_Sub5.keycodes[91] = 42;
			Class37_Sub5.keycodes[44] = 71;
		}
	}

	public Class38(int i, int i_40_, int i_41_) {
		aClass58_832 = new Deque();
		aBoolean850 = false;
		aClass37_Sub16Array836 = new Class37_Sub16[i_40_];
		anInt849 = i_40_;
		anInt838 = i;
		anIntArrayArray844 = new int[i][i_41_];
	}

	public void method1057(byte i) {
		anInt839++;
		if (i == -92) {
			for (int i_42_ = 0; (anInt838 ^ 0xffffffff) < (i_42_ ^ 0xffffffff); i_42_++)
				anIntArrayArray844[i_42_] = null;
			aClass37_Sub16Array836 = null;
			anIntArrayArray844 = null;
			aClass58_832.clear();
			aClass58_832 = null;
		}
	}

	static {
		aClass16_827 = aClass16_831;
		aClass16_840 = Class37_Sub2.create_rsstring("Login limit exceeded)3");
		aClass16_824 = Class37_Sub2.create_rsstring(" is already on your ignore list)3");
		aClass16_843 = Class37_Sub2.create_rsstring(":duelreq:");
		aClass16_835 = aClass16_840;
		aClass16_830 = Class37_Sub2.create_rsstring("<col=80ff00>");
		anInt851 = 0;
		aClass16_842 = Class37_Sub2.create_rsstring("Titelbild geladen)3");
		aClass16_846 = aClass16_824;
	}
}
