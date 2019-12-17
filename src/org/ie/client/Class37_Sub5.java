package org.ie.client;

/* Class37_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub5 extends Node {
	public byte[] aByteArray1863;
	public static int anInt1864;
	public static int anInt1865;
	public Class69 aClass69_1866;
	public int anInt1867;
	public Class15_Sub1 aClass15_Sub1_1868;
	public static int anInt1869;
	public static int anInt1870;
	public static Class37_Sub14 aClass37_Sub14_1871 = new Class37_Sub14(0, 0);
	public static RSString aClass16_1872;
	public static RSString aClass16_1873;
	public static RSString aClass16_1874 = (Class37_Sub2.create_rsstring("Zu viele Anmelde)2Versuche von Ihrer Adresse"));
	public static int anInt1875;
	public static RSString aClass16_1876;
	public static int anInt1877;
	public static int anInt1878;
	public static int[] keycodes = { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	public static void method734(int i, RSInterface[] class18s, int i_0_) {
		anInt1865++;
		for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (class18s.length ^ 0xffffffff); i_1_++) {
			try {
				RSInterface rSInterface = class18s[i_1_];
				if (rSInterface != null && (i_0_ ^ 0xffffffff) == (rSInterface.parentId ^ 0xffffffff) && (!rSInterface.newFormat || !Class66.isVisible(rSInterface))) {
					if ((rSInterface.type ^ 0xffffffff) == -1) {
						if (!rSInterface.newFormat && Class66.isVisible(rSInterface) && Class42.aClass18_942 != rSInterface)
							continue;
						method734(1115623280, class18s, rSInterface.bitPacked);
						if (rSInterface.aClass18Array450 != null)
							method734(1115623280, rSInterface.aClass18Array450, rSInterface.bitPacked);
						OverridedInterface class37_sub6 = ((OverridedInterface) (Class76.overridedInterfaces.get((long) rSInterface.bitPacked)));
						if (class37_sub6 != null)
							Class37_Sub4_Sub15.method712((byte) 61, class37_sub6.interfaceId);
					}
					if (rSInterface.type == 6) {
						if ((rSInterface.disabledAnim ^ 0xffffffff) != 0 || rSInterface.enabledAnim != -1) {
							boolean bool = Class37_Sub4_Sub3.method470(rSInterface, i + -1115623276);
							int i_2_;
							if (!bool)
								i_2_ = rSInterface.disabledAnim;
							else
								i_2_ = rSInterface.enabledAnim;
							if ((i_2_ ^ 0xffffffff) != 0) {
								Class37_Sub4_Sub12 class37_sub4_sub12 = Class37_Sub9_Sub22.method861(i_2_);
								rSInterface.anInt323 += Class37_Sub9_Sub37.anInt3589;
								if (class37_sub4_sub12.anIntArray2780.length < rSInterface.anInt443)
									rSInterface.anInt443 = 0;
								while (((class37_sub4_sub12.anIntArray2780[rSInterface.anInt443]) ^ 0xffffffff) > (rSInterface.anInt323 ^ 0xffffffff)) {
									rSInterface.anInt323 -= (class37_sub4_sub12.anIntArray2780[rSInterface.anInt443]);
									rSInterface.anInt443++;
									if ((rSInterface.anInt443 ^ 0xffffffff) <= ((class37_sub4_sub12.anIntArray2761).length ^ 0xffffffff)) {
										rSInterface.anInt443 -= class37_sub4_sub12.anInt2777;
										if ((rSInterface.anInt443 ^ 0xffffffff) > -1 || (rSInterface.anInt443 >= (class37_sub4_sub12.anIntArray2761).length))
											rSInterface.anInt443 = 0;
									}
									Class73.refreshInterface(rSInterface);
								}
							}
						}
						if (rSInterface.anInt344 != 0 && !rSInterface.newFormat) {
							int i_3_ = rSInterface.anInt344 >> -481958480;
							i_3_ *= Class37_Sub9_Sub37.anInt3589;
							int i_4_ = rSInterface.anInt344 << 1115623280 >> 1189254256;
							i_4_ *= Class37_Sub9_Sub37.anInt3589;
							rSInterface.rotateY = i_4_ + rSInterface.rotateY & 0x7ff;
							rSInterface.rotateX = i_3_ + rSInterface.rotateX & 0x7ff;
							Class73.refreshInterface(rSInterface);
						}
					}
				}
			}catch (Exception e) {
				continue;
			}
		}
	}

	public static void method735(int i, Class15 class15) {
		anInt1870++;
		Class37_Sub16.aClass15_2152 = class15;
		if (i > -31)
			method736(null, 85, 97, -90, null, -69, 105);
	}

	public static void method736(byte[] is, int i, int i_5_, int i_6_, Class20[] class20s, int i_7_, int i_8_) {
		do {
			try {
				for (int i_9_ = 0; i_9_ < 4; i_9_++) {
					for (int i_10_ = 0; i_10_ < 64; i_10_++) {
						for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -65; i_11_++) {
							if (i_10_ + i_8_ > 0 && i_8_ + i_10_ < 103 && i_6_ + i_11_ > 0 && (i_6_ + i_11_ ^ 0xffffffff) > -104)
								class20s[i_9_].anIntArrayArray554[i_10_ + i_8_][i_6_ + i_11_] = (Class37_Sub4_Sub7.method490((class20s[i_9_].anIntArrayArray554[i_10_ + i_8_][i_6_ + i_11_]), -16777217));
						}
					}
				}
				anInt1869++;
				ByteVector class37_sub11 = new ByteVector(is);
				for (int i_12_ = 0; i_12_ < 4; i_12_++) {
					for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -65; i_13_++) {
						for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -65; i_14_++)
							Class87.method1325(i_5_, i_7_, 0, i_8_ + i_13_, i_12_, -9890, class37_sub11, i_14_ - -i_6_);
					}
				}
				if (i == -1)
					break;
				method738((byte) -105, 9);
			} catch (RuntimeException runtimeexception) {
				throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("dh.B(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_5_ + ',' + i_6_ + ',' + (class20s != null ? "{...}" : "null") + ',' + i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method737(int i) {
		keycodes = null;
		int i_15_ = -43 % ((i - 3) / 44);
		aClass16_1873 = null;
		aClass16_1872 = null;
		aClass16_1876 = null;
		aClass37_Sub14_1871 = null;
		aClass16_1874 = null;
	}

	public static void method738(byte i, int i_16_) {
		/*
		 * anInt1864++; if ((i_16_ ^ 0xffffffff) <= -1) { int i_17_ =
		 * Deque.anIntArray1128[i_16_]; int i_18_ =
		 * Class37_Sub4_Sub14.anIntArray2809[i_16_]; int i_19_ =
		 * Class37_Sub9_Sub20.anIntArray3300[i_16_]; if (i >= -47) method734(1,
		 * null, 94); if ((i_19_ ^ 0xffffffff) <= -2001) i_19_ -= 2000; int
		 * i_20_ = Class62.anIntArray1183[i_16_]; if (i_19_ == 1) {
		 * Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 =
		 * (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]); if
		 * (class37_sub4_sub7_sub1_sub1 != null) {
		 * Class37_Sub4_Sub8.anInt2646++; NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub1.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub1.anIntArray3669[0], 0,
		 * 1, true); Class37_Sub9_Sub8.anInt3057 = 0; Applet_Sub1.anInt8 =
		 * Class33.lastClickX; Class19.anInt490 = 2; Class27.anInt676 =
		 * Class37_Sub13.lastClickY;
		 * Class42.aClass37_Sub11_Sub1_936.method989(160);
		 * Class42.aClass37_Sub11_Sub1_936.method962(i_20_, false); } } if
		 * ((i_19_ ^ 0xffffffff) == -44) { Class50.anInt1024++;
		 * Class42.aClass37_Sub11_Sub1_936.method989(141);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_20_);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_17_);
		 * Class42.aClass37_Sub11_Sub1_936.method947(i_18_); Class42.anInt939 =
		 * 0; Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
		 * .getInterface(i_18_); Class2.anInt75 = i_17_; } if (i_19_ == 1005) {
		 * RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_18_); if
		 * (rSInterface != null && rSInterface.invStackSize[i_17_] >= 100000)
		 * Class37_Sub4_Sub7_Sub1_Sub1 .method505(
		 * Class37_Sub9_Sub8.aClass16_3045, 0, (Class37_Sub9_Sub27 .method881(
		 * (new RSString[] { Class37_Sub9_Sub24 .method870(
		 * (rSInterface.invStackSize[i_17_]), (byte) -114),
		 * Class37_Sub9_Sub7.aClass16_3040, (Class46 .loadItem( i_20_, (byte)
		 * 92).itemName) })))); else { Class37_Sub9_Sub22.anInt3339++;
		 * Class42.aClass37_Sub11_Sub1_936.method989(47);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_); }
		 * Class42.anInt939 = 0; Class37_Sub4_Sub13.aClass18_2797 =
		 * Class37_Sub9_Sub14 .getInterface(i_18_); Class2.anInt75 = i_17_; } if
		 * ((i_19_ ^ 0xffffffff) == -51 && Class37_Sub4_Sub10.method676(i_20_,
		 * i_17_, i_18_, 0)) { Class42.aClass37_Sub11_Sub1_936.method989(134);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_17_ +
		 * Class37_Sub18.anInt2200);
		 * Class42.aClass37_Sub11_Sub1_936.method945(MouseHandler.anInt174);
		 * Class37_Sub9_Sub7.anInt3028++;
		 * Class42.aClass37_Sub11_Sub1_936.method962( 0x7fff & i_20_ >>
		 * 196251534, false); Class42.aClass37_Sub11_Sub1_936.method957(true,
		 * i_18_ + Class15_Sub1.anInt1738);
		 * Class42.aClass37_Sub11_Sub1_936.method943(
		 * Class37_Sub9_Sub21.anInt3317, -103);
		 * Class42.aClass37_Sub11_Sub1_936.method962(Class57.anInt1101, false);
		 * } if ((i_19_ ^ 0xffffffff) == -59) { Class37_Sub9_Sub34.anInt3543++;
		 * Class42.aClass37_Sub11_Sub1_936.method989(55);
		 * Class42.aClass37_Sub11_Sub1_936.method965(i_17_);
		 * Class42.aClass37_Sub11_Sub1_936.method966(i_18_);
		 * Class42.aClass37_Sub11_Sub1_936.method962(i_20_, false);
		 * Class42.anInt939 = 0; Class37_Sub4_Sub13.aClass18_2797 =
		 * Class37_Sub9_Sub14 .getInterface(i_18_); Class2.anInt75 = i_17_; } if
		 * (i_19_ == 6) { Class37_Sub4_Sub7_Sub1_Sub1
		 * class37_sub4_sub7_sub1_sub1 =
		 * (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]); if
		 * (class37_sub4_sub7_sub1_sub1 != null) { NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub1.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub1.anIntArray3669[0], 0,
		 * 1, true); Class37_Sub7.anInt1900++; Applet_Sub1.anInt8 =
		 * Class33.lastClickX; Class27.anInt676 = Class37_Sub13.lastClickY;
		 * Class37_Sub9_Sub8.anInt3057 = 0; Class19.anInt490 = 2;
		 * Class42.aClass37_Sub11_Sub1_936.method989(157);
		 * Class42.aClass37_Sub11_Sub1_936.method965(KeyboardHandler.anInt558);
		 * Class42.aClass37_Sub11_Sub1_936.method973(Class32.anInt737,
		 * -1629130328); Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
		 * } } if (i_19_ == 47) { Class37_Sub4_Sub7_Sub1_Sub2
		 * class37_sub4_sub7_sub1_sub2 =
		 * Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_]; if
		 * (class37_sub4_sub7_sub1_sub2 != null) { NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub2.anIntArray3669[0], 0,
		 * 1, true); Class37_Sub9_Sub8.anInt3057 = 0; Class62.anInt1174++;
		 * Class19.anInt490 = 2; Applet_Sub1.anInt8 = Class33.lastClickX;
		 * Class27.anInt676 = Class37_Sub13.lastClickY;
		 * Class42.aClass37_Sub11_Sub1_936.method989(244);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_20_); } } if (i_19_ ==
		 * 15) { Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 =
		 * Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_]; if
		 * (class37_sub4_sub7_sub1_sub2 != null) { Applet_Sub1.anInt20++;
		 * NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub2.anIntArray3669[0], 0,
		 * 1, true); Class19.anInt490 = 2; Class37_Sub9_Sub8.anInt3057 = 0;
		 * Class27.anInt676 = Class37_Sub13.lastClickY; Applet_Sub1.anInt8 =
		 * Class33.lastClickX; Class42.aClass37_Sub11_Sub1_936.method989(84);
		 * Class42.aClass37_Sub11_Sub1_936.method965(i_20_); } } if ((i_19_ ^
		 * 0xffffffff) == -39) { Class36.anInt806++;
		 * Class42.aClass37_Sub11_Sub1_936.method989(89);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
		 * Class42.aClass37_Sub11_Sub1_936.method947(i_18_);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_17_); Class42.anInt939 =
		 * 0; Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
		 * .getInterface(i_18_); Class2.anInt75 = i_17_; } if ((i_19_ ^
		 * 0xffffffff) == -50) { Class37_Sub4_Sub7_Sub1_Sub2
		 * class37_sub4_sub7_sub1_sub2 =
		 * Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_]; if
		 * (class37_sub4_sub7_sub1_sub2 != null) {
		 * Class37_Sub9_Sub19.anInt3270++; NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub2.anIntArray3669[0], 0,
		 * 1, true); Class37_Sub9_Sub8.anInt3057 = 0; Applet_Sub1.anInt8 =
		 * Class33.lastClickX; Class27.anInt676 = Class37_Sub13.lastClickY;
		 * Class19.anInt490 = 2; Class42.aClass37_Sub11_Sub1_936.method989(214);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_); } } if (i_19_
		 * == 24) { boolean bool = (NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, i_17_,
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 0, 0, i_18_, 0, 0, true)); Class8.anInt159++; if (!bool)
		 * bool = (NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, i_17_,
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, i_18_, 0, 1, true)); Class37_Sub9_Sub8.anInt3057 =
		 * 0; Applet_Sub1.anInt8 = Class33.lastClickX; Class19.anInt490 = 2;
		 * Class27.anInt676 = Class37_Sub13.lastClickY;
		 * Class42.aClass37_Sub11_Sub1_936.method989(105);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_20_);
		 * Class42.aClass37_Sub11_Sub1_936.method962( Class37_Sub18.anInt2200 +
		 * i_17_, false); Class42.aClass37_Sub11_Sub1_936.method962(i_18_ +
		 * Class15_Sub1.anInt1738, false); } if ((i_19_ ^ 0xffffffff) == -19) {
		 * Class37_Sub9_Sub19.anInt3268++; boolean bool = (NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, i_17_,
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 0, 0, i_18_, 0, 0, true)); if (!bool) bool = (NodeSub
		 * .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, i_17_,
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, i_18_, 0, 1, true)); Applet_Sub1.anInt8 =
		 * Class33.lastClickX; Class27.anInt676 = Class37_Sub13.lastClickY;
		 * Class19.anInt490 = 2; Class37_Sub9_Sub8.anInt3057 = 0;
		 * Class42.aClass37_Sub11_Sub1_936.method989(230);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_20_);
		 * Class42.aClass37_Sub11_Sub1_936.method962(i_17_ +
		 * Class37_Sub18.anInt2200, false);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_18_ +
		 * Class15_Sub1.anInt1738); } if (i_19_ == 34) {
		 * Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 =
		 * Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_]; if
		 * (class37_sub4_sub7_sub1_sub2 != null) { Class85.anInt1543++; NodeSub
		 * .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub2.anIntArray3669[0], 0,
		 * 1, true); Class27.anInt676 = Class37_Sub13.lastClickY;
		 * Applet_Sub1.anInt8 = Class33.lastClickX; Class37_Sub9_Sub8.anInt3057
		 * = 0; Class19.anInt490 = 2;
		 * Class42.aClass37_Sub11_Sub1_936.method989(35);
		 * Class42.aClass37_Sub11_Sub1_936.method947(Class32.anInt737);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true,
		 * KeyboardHandler.anInt558); } } if ((i_19_ ^ 0xffffffff) == -58) {
		 * Class42.aClass37_Sub11_Sub1_936.method989(71);
		 * Class42.aClass37_Sub11_Sub1_936.method973(i_18_, -1629130328);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
		 * RSItem.anInt2513++; Class42.aClass37_Sub11_Sub1_936.method962(i_17_,
		 * false); Class42.anInt939 = 0; Class37_Sub4_Sub13.aClass18_2797 =
		 * Class37_Sub9_Sub14 .getInterface(i_18_); Class2.anInt75 = i_17_; } if
		 * (i_19_ == 25 && Class79.aClass18_1489 == null) {
		 * Class37_Sub9_Sub11.method808(false, i_17_, i_18_);
		 * Class79.aClass18_1489 = Class37_Sub9_Sub35.method914(i_18_, i_17_);
		 * Class73.refreshInterface(Class79.aClass18_1489); } if ((i_19_ ^
		 * 0xffffffff) == -10) { Class37_Sub4_Sub7_Sub1_Sub1
		 * class37_sub4_sub7_sub1_sub1 =
		 * (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]); if
		 * (class37_sub4_sub7_sub1_sub1 != null) { NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub1.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub1.anIntArray3669[0], 0,
		 * 1, true); Class37_Sub9_Sub8.anInt3057 = 0; Applet_Sub1.anInt8 =
		 * Class33.lastClickX; Class37_Sub9_Sub29.anInt3445++; Class27.anInt676
		 * = Class37_Sub13.lastClickY; Class19.anInt490 = 2;
		 * Class42.aClass37_Sub11_Sub1_936.method989(24);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_20_); } } if ((i_19_ ^
		 * 0xffffffff) == -22) { Class42.aClass37_Sub11_Sub1_936.method989(125);
		 * Class42.aClass37_Sub11_Sub1_936.method973(i_18_, -1629130328);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_17_);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_20_);
		 * Class37_Sub9_Sub2.anInt2929++; Class42.anInt939 = 0;
		 * Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
		 * .getInterface(i_18_); Class2.anInt75 = i_17_; } if ((i_19_ ^
		 * 0xffffffff) == -45) { Class37_Sub9_Sub17.anInt3221++;
		 * Class42.aClass37_Sub11_Sub1_936.method989(206);
		 * Class42.aClass37_Sub11_Sub1_936.method965(MouseHandler.anInt174);
		 * Class42.aClass37_Sub11_Sub1_936.method943(i_18_, 125);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, Class57.anInt1101);
		 * Class42.aClass37_Sub11_Sub1_936.method962(i_17_, false);
		 * Class42.aClass37_Sub11_Sub1_936.method943(
		 * Class37_Sub9_Sub21.anInt3317, 125);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
		 * Class42.anInt939 = 0; Class37_Sub4_Sub13.aClass18_2797 =
		 * Class37_Sub9_Sub14 .getInterface(i_18_); Class2.anInt75 = i_17_; } if
		 * (i_19_ == 36) { Class37_Sub4_Sub7_Sub1_Sub2
		 * class37_sub4_sub7_sub1_sub2 =
		 * Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_]; if
		 * (class37_sub4_sub7_sub1_sub2 != null) { NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub2.anIntArray3669[0], 0,
		 * 1, true); Class37_Sub9_Sub4.anInt2960++; Class37_Sub9_Sub8.anInt3057
		 * = 0; Class19.anInt490 = 2; Applet_Sub1.anInt8 = Class33.lastClickX;
		 * Class27.anInt676 = Class37_Sub13.lastClickY;
		 * Class42.aClass37_Sub11_Sub1_936.method989(211);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_); } } if (i_19_
		 * == 1001) { KeyboardHandler.anInt562++;
		 * Class37_Sub4_Sub10.method676(i_20_, i_17_, i_18_, 0);
		 * Class42.aClass37_Sub11_Sub1_936.method989(4);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true,
		 * Class37_Sub18.anInt2200 + i_17_);
		 * Class42.aClass37_Sub11_Sub1_936.method962( i_20_ >> -1202336402 &
		 * 0x7fff, false); Class42.aClass37_Sub11_Sub1_936.method962(
		 * Class15_Sub1.anInt1738 + i_18_, false); } if (i_19_ == 1007) {
		 * Class37_Sub9_Sub8.anInt3057 = 0; Class27.anInt676 =
		 * Class37_Sub13.lastClickY; Class19.anInt490 = 2; Applet_Sub1.anInt8 =
		 * Class33.lastClickX; Class37_Sub4_Sub7_Sub1_Sub1
		 * class37_sub4_sub7_sub1_sub1 =
		 * (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]); if
		 * (class37_sub4_sub7_sub1_sub1 != null) { Class37_Sub4_Sub15
		 * class37_sub4_sub15 =
		 * class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955; if
		 * (class37_sub4_sub15.anIntArray2824 != null) class37_sub4_sub15 =
		 * class37_sub4_sub15 .method719((byte) -114); if (class37_sub4_sub15 !=
		 * null) { Class37_Sub9_Sub26.anInt3393++;
		 * Class42.aClass37_Sub11_Sub1_936.method989(178);
		 * Class42.aClass37_Sub11_Sub1_936
		 * .method945(class37_sub4_sub15.anInt2842); } } } if ((i_19_ ^
		 * 0xffffffff) == -41) { Class37_Sub4_Sub7_Sub1_Sub2
		 * class37_sub4_sub7_sub1_sub2 =
		 * Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_]; if
		 * (class37_sub4_sub7_sub1_sub2 != null) { NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub2.anIntArray3669[0], 0,
		 * 1, true); RSItem.anInt2448++; Applet_Sub1.anInt8 =
		 * Class33.lastClickX; Class37_Sub9_Sub8.anInt3057 = 0; Class27.anInt676
		 * = Class37_Sub13.lastClickY; Class19.anInt490 = 2;
		 * Class42.aClass37_Sub11_Sub1_936.method989(116);
		 * Class42.aClass37_Sub11_Sub1_936.method965(i_20_); } } if (i_19_ == 7)
		 * { Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 =
		 * Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_]; if
		 * (class37_sub4_sub7_sub1_sub2 != null) { Class37_Sub23.anInt2223++;
		 * NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub2.anIntArray3669[0], 0,
		 * 1, true); Class27.anInt676 = Class37_Sub13.lastClickY;
		 * Class37_Sub9_Sub8.anInt3057 = 0; Applet_Sub1.anInt8 =
		 * Class33.lastClickX; Class19.anInt490 = 2;
		 * Class42.aClass37_Sub11_Sub1_936.method989(185);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_); } } if (i_19_
		 * == 12) { InterfaceClickMask.anInt1989++;
		 * Class42.aClass37_Sub11_Sub1_936.method989(41);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_17_);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_20_);
		 * Class42.aClass37_Sub11_Sub1_936.method947(i_18_); Class42.anInt939 =
		 * 0; Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
		 * .getInterface(i_18_); Class2.anInt75 = i_17_; } if (i_19_ == 30) {
		 * client.anInt1724++; Class42.aClass37_Sub11_Sub1_936.method989(124);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_17_);
		 * Class42.aClass37_Sub11_Sub1_936.method965(i_20_);
		 * Class42.aClass37_Sub11_Sub1_936.method966(i_18_); Class42.anInt939 =
		 * 0; Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
		 * .getInterface(i_18_); Class2.anInt75 = i_17_; } if ((i_19_ ^
		 * 0xffffffff) == -30) { Class64.anInt1215++; boolean bool = (NodeSub
		 * .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, i_17_,
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 0, 0, i_18_, 0, 0, true)); if (!bool) bool = (NodeSub
		 * .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, i_17_,
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, i_18_, 0, 1, true)); Class27.anInt676 =
		 * Class37_Sub13.lastClickY; Applet_Sub1.anInt8 = Class33.lastClickX;
		 * Class37_Sub9_Sub8.anInt3057 = 0; Class19.anInt490 = 2;
		 * Class42.aClass37_Sub11_Sub1_936.method989(208);
		 * Class42.aClass37_Sub11_Sub1_936.method965(MouseHandler.anInt174);
		 * Class42.aClass37_Sub11_Sub1_936.method945(Class15_Sub1.anInt1738 +
		 * i_18_); Class42.aClass37_Sub11_Sub1_936.method962(i_20_, false);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_17_ +
		 * Class37_Sub18.anInt2200);
		 * Class42.aClass37_Sub11_Sub1_936.method966(Class37_Sub9_Sub21
		 * .anInt3317);
		 * Class42.aClass37_Sub11_Sub1_936.method945(Class57.anInt1101); } if
		 * ((i_19_ ^ 0xffffffff) == -18) { Class4.anInt100++;
		 * Class37_Sub4_Sub10.method676(i_20_, i_17_, i_18_, 0);
		 * Class42.aClass37_Sub11_Sub1_936.method989(145);
		 * Class42.aClass37_Sub11_Sub1_936.method965(i_17_ -
		 * -Class37_Sub18.anInt2200);
		 * Class42.aClass37_Sub11_Sub1_936.method962(i_18_ -
		 * -Class15_Sub1.anInt1738, false);
		 * Class42.aClass37_Sub11_Sub1_936.method965((0x1fffd1cc & i_20_) >>
		 * 169262414); } if (i_19_ == 13) { RSInterface rSInterface =
		 * Class37_Sub9_Sub35.method914(i_18_, i_17_); if (rSInterface != null)
		 * { NodeSub.method436(1); Class37_Sub11_Sub1.method987(i_17_, i_18_,
		 * Class10.method85(RuntimeException_Sub1.get_click_mask(rSInterface),
		 * false), 18193); Class37_Sub14.anInt2122 = 0;
		 * Class37_Sub9_Sub1.aClass16_2912 = Class37_Sub9_Sub37
		 * .method924(rSInterface, (byte) 57); if
		 * (Class37_Sub9_Sub1.aClass16_2912 == null)
		 * Class37_Sub9_Sub1.aClass16_2912 = Class35.aClass16_790; if
		 * (rSInterface.scriped) Class60.aClass16_1142 =
		 * (Class37_Sub9_Sub27.method881( new RSString[] {
		 * rSInterface.action_name, Class25.aClass16_636 })); else
		 * Class60.aClass16_1142 = (Class37_Sub9_Sub27.method881( new RSString[]
		 * { Class82.aClass16_1690, rSInterface.spellName, Class25.aClass16_636
		 * })); } } else { if (i_19_ == 14) Class62.method1173(); if (i_19_ ==
		 * 1002) { Class37_Sub9_Sub22.anInt3339++; Class19.anInt490 = 2;
		 * Class37_Sub9_Sub8.anInt3057 = 0; Class27.anInt676 =
		 * Class37_Sub13.lastClickY; Applet_Sub1.anInt8 = Class33.lastClickX;
		 * Class42.aClass37_Sub11_Sub1_936.method989(47);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_); } if (i_19_
		 * == 20) { Class37_Sub9_Sub12.anInt3114++;
		 * Class42.aClass37_Sub11_Sub1_936.method989(215);
		 * Class42.aClass37_Sub11_Sub1_936.method947(i_18_); RSInterface
		 * rSInterface = Class37_Sub9_Sub14.getInterface(i_18_); if
		 * (rSInterface.cs1opcodes != null && ((rSInterface.cs1opcodes[0][0] ^
		 * 0xffffffff) == -6)) { int i_21_ = rSInterface.cs1opcodes[0][1];
		 * Class37_Sub23.anIntArray2237[i_21_] = 1 -
		 * Class37_Sub23.anIntArray2237[i_21_]; Cache.method1183(i_21_, (byte)
		 * -3); } } if ((i_19_ ^ 0xffffffff) == -3)
		 * Class38.aClass67_847.method1204( Class37_Sub9_Sub1.anInt2916, i_17_,
		 * i_18_); if ((i_19_ ^ 0xffffffff) == -40) { Class19.anInt473++;
		 * Class42.aClass37_Sub11_Sub1_936.method989(107);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_17_);
		 * Class42.aClass37_Sub11_Sub1_936.method947(i_18_);
		 * Class42.aClass37_Sub11_Sub1_936.method965(i_20_); Class42.anInt939 =
		 * 0; Class37_Sub4_Sub13.aClass18_2797 = Class37_Sub9_Sub14
		 * .getInterface(i_18_); Class2.anInt75 = i_17_; } if (i_19_ == 46) {
		 * boolean bool = true; RSInterface rSInterface =
		 * Class37_Sub9_Sub14.getInterface(i_18_); if ((rSInterface.contentType
		 * ^ 0xffffffff) < -1) bool = Class37_Sub25.method1042(3, rSInterface);
		 * if (bool) { Class42.aClass37_Sub11_Sub1_936.method989(215);
		 * Class37_Sub9_Sub12.anInt3114++;
		 * Class42.aClass37_Sub11_Sub1_936.method947(i_18_); } } if ((i_19_ ^
		 * 0xffffffff) == -38) { Class42.aClass37_Sub11_Sub1_936.method989(241);
		 * Class37_Sub7.anInt1916++;
		 * Class42.aClass37_Sub11_Sub1_936.method965(i_17_);
		 * Class42.aClass37_Sub11_Sub1_936.method973(i_18_, -1629130328);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
		 * Class42.anInt939 = 0; Class37_Sub4_Sub13.aClass18_2797 =
		 * Class37_Sub9_Sub14.getInterface(i_18_); Class2.anInt75 = i_17_; } if
		 * ((i_19_ ^ 0xffffffff) == -27) { Class37_Sub4_Sub7_Sub1_Sub1
		 * class37_sub4_sub7_sub1_sub1 =
		 * (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]); if
		 * (class37_sub4_sub7_sub1_sub1 != null) { NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub1.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub1.anIntArray3669[0], 0,
		 * 1, true); Class37_Sub9_Sub8.anInt3057 = 0; Class27.anInt676 =
		 * Class37_Sub13.lastClickY; Class37_Sub9_Sub25.anInt3384++;
		 * Class19.anInt490 = 2; Applet_Sub1.anInt8 = Class33.lastClickX;
		 * Class42.aClass37_Sub11_Sub1_936.method989(196);
		 * Class42.aClass37_Sub11_Sub1_936.method962(i_20_, false); } } if
		 * (i_19_ == 48) { Class37_Sub4_Sub10.method676(i_20_, i_17_, i_18_, 0);
		 * Class42.aClass37_Sub11_Sub1_936.method989(31);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_17_ -
		 * -Class37_Sub18.anInt2200); Class37_Sub13.anInt2107++;
		 * Class42.aClass37_Sub11_Sub1_936.method965(0x7fff & i_20_ >>
		 * -2014034258); Class42.aClass37_Sub11_Sub1_936.method965(i_18_ -
		 * -Class15_Sub1.anInt1738); } if ((i_19_ ^ 0xffffffff) == -42) {
		 * Class42.aClass37_Sub11_Sub1_936.method989(102);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
		 * Class15.anInt262++; Class42.aClass37_Sub11_Sub1_936.method943(i_18_,
		 * 127); Class42.aClass37_Sub11_Sub1_936.method965(i_17_);
		 * Class42.anInt939 = 0; Class37_Sub4_Sub13.aClass18_2797 =
		 * Class37_Sub9_Sub14 .getInterface(i_18_); Class2.anInt75 = i_17_; } if
		 * (i_19_ == 11) { Class37_Sub4_Sub10.method676(i_20_, i_17_, i_18_, 0);
		 * Class14.anInt243++; Class42.aClass37_Sub11_Sub1_936.method989(203);
		 * Class42.aClass37_Sub11_Sub1_936.method965(i_17_ -
		 * -Class37_Sub18.anInt2200); Class42.aClass37_Sub11_Sub1_936.method962(
		 * i_20_ >> -2083371858 & 0x7fff, false);
		 * Class42.aClass37_Sub11_Sub1_936.method945(Class15_Sub1.anInt1738 +
		 * i_18_); } if (i_19_ == 23 && Class37_Sub4_Sub10.method676(i_20_,
		 * i_17_, i_18_, 0)) { Class66.anInt1244++;
		 * Class42.aClass37_Sub11_Sub1_936.method989(205);
		 * Class42.aClass37_Sub11_Sub1_936.method945((i_20_ & 0x1fffcfc5) >>
		 * -2025098802); Class42.aClass37_Sub11_Sub1_936.method957(true, i_17_ +
		 * Class37_Sub18.anInt2200);
		 * Class42.aClass37_Sub11_Sub1_936.method966(Class32.anInt737);
		 * Class42.aClass37_Sub11_Sub1_936.method945(KeyboardHandler.anInt558);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true,
		 * Class15_Sub1.anInt1738 + i_18_); } if ((i_19_ ^ 0xffffffff) == -9) {
		 * Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 =
		 * (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]); if
		 * (class37_sub4_sub7_sub1_sub1 != null) { Class55.anInt1068++; NodeSub
		 * .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub1.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub1.anIntArray3669[0], 0,
		 * 1, true); Class37_Sub9_Sub8.anInt3057 = 0; Class27.anInt676 =
		 * Class37_Sub13.lastClickY; Class19.anInt490 = 2; Applet_Sub1.anInt8 =
		 * Class33.lastClickX; Class42.aClass37_Sub11_Sub1_936.method989(56);
		 * Class42.aClass37_Sub11_Sub1_936.method962(i_20_, false); } } if
		 * ((i_19_ ^ 0xffffffff) == -29) {
		 * Class42.aClass37_Sub11_Sub1_936.method989(238);
		 * Class37_Sub1.anInt1800++;
		 * Class42.aClass37_Sub11_Sub1_936.method966(i_18_);
		 * Class42.aClass37_Sub11_Sub1_936.method962(i_20_, false);
		 * Class42.aClass37_Sub11_Sub1_936.method962(KeyboardHandler.anInt558,
		 * false); Class42.aClass37_Sub11_Sub1_936.method965(i_17_);
		 * Class42.aClass37_Sub11_Sub1_936.method947(Class32.anInt737);
		 * Class42.anInt939 = 0; Class37_Sub4_Sub13.aClass18_2797 =
		 * Class37_Sub9_Sub14 .getInterface(i_18_); Class2.anInt75 = i_17_; } if
		 * ((i_19_ ^ 0xffffffff) == -4) { Class37_Sub4_Sub7_Sub1_Sub2
		 * class37_sub4_sub7_sub1_sub2 =
		 * Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_]; if
		 * (class37_sub4_sub7_sub1_sub2 != null) { NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub2.anIntArray3669[0], 0,
		 * 1, true); MouseHandler.anInt184++; Class27.anInt676 =
		 * Class37_Sub13.lastClickY; Class19.anInt490 = 2;
		 * Class37_Sub9_Sub8.anInt3057 = 0; Applet_Sub1.anInt8 =
		 * Class33.lastClickX; Class42.aClass37_Sub11_Sub1_936.method989(96);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_); } } if
		 * ((i_19_ ^ 0xffffffff) == -36) { Class17.anInt305++;
		 * Class42.aClass37_Sub11_Sub1_936.method989(242);
		 * Class42.aClass37_Sub11_Sub1_936.method965(KeyboardHandler.anInt558);
		 * Class42.aClass37_Sub11_Sub1_936.method943(i_18_, 125);
		 * Class42.aClass37_Sub11_Sub1_936.method965(i_17_);
		 * Class42.aClass37_Sub11_Sub1_936.method966(Class32.anInt737); } if
		 * ((i_19_ ^ 0xffffffff) == -43) { boolean bool = (NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, i_17_,
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 0, 0, i_18_, 0, 0, true)); if (!bool) bool = (NodeSub
		 * .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, i_17_,
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, i_18_, 0, 1, true)); Class27.anInt676 =
		 * Class37_Sub13.lastClickY; Applet_Sub1.anInt8 = Class33.lastClickX;
		 * Class19.anInt490 = 2; Class37_Sub9_Sub8.anInt3057 = 0;
		 * Class42.aClass37_Sub11_Sub1_936.method989(254);
		 * Class42.aClass37_Sub11_Sub1_936.method945(Class37_Sub18.anInt2200 +
		 * i_17_); Class42.aClass37_Sub11_Sub1_936.method957(true, i_20_);
		 * Class37_Sub4_Sub7_Sub3.anInt3743++;
		 * Class42.aClass37_Sub11_Sub1_936.method965(i_18_ +
		 * Class15_Sub1.anInt1738); } if (i_19_ == 16 || i_19_ == 1006)
		 * Class37_Sub4_Sub5.method485(i_20_, i_18_, i_17_,
		 * Class37_Sub9_Sub37.aClass16Array3593[i_16_]); if (i_19_ == 4) {
		 * Class37_Sub4_Sub15.anInt2843++; boolean bool = (NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, i_17_,
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 0, 0, i_18_, 0, 0, true)); if (!bool) bool = (NodeSub
		 * .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, i_17_,
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, i_18_, 0, 1, true)); Class37_Sub9_Sub8.anInt3057 =
		 * 0; Class27.anInt676 = Class37_Sub13.lastClickY; Applet_Sub1.anInt8 =
		 * Class33.lastClickX; Class19.anInt490 = 2;
		 * Class42.aClass37_Sub11_Sub1_936.method989(8);
		 * Class42.aClass37_Sub11_Sub1_936.method962(i_20_, false);
		 * Class42.aClass37_Sub11_Sub1_936.method962(i_18_ -
		 * -Class15_Sub1.anInt1738, false);
		 * Class42.aClass37_Sub11_Sub1_936.method962(i_17_ +
		 * Class37_Sub18.anInt2200, false); } if ((i_19_ ^ 0xffffffff) == -1004)
		 * { Class19.anInt490 = 2; Applet_Sub1.anInt8 = Class33.lastClickX;
		 * Class37_Sub2.anInt1814++; Class37_Sub9_Sub8.anInt3057 = 0;
		 * Class27.anInt676 = Class37_Sub13.lastClickY;
		 * Class42.aClass37_Sub11_Sub1_936.method989(226);
		 * Class42.aClass37_Sub11_Sub1_936.method962( i_20_ >> 938302542 &
		 * 0x7fff, false); } if (i_19_ == 5) { NodeSub.method436(1); RSInterface
		 * rSInterface = Class37_Sub9_Sub14.getInterface(i_18_);
		 * Class37_Sub14.anInt2122 = 1; Class37_Sub9_Sub21.anInt3317 = i_18_;
		 * Class57.anInt1101 = i_20_; MouseHandler.anInt174 = i_17_;
		 * Class73.refreshInterface(rSInterface); Class64.aClass16_1218 =
		 * (Class37_Sub9_Sub27 .method881(new RSString[] {
		 * Class37_Sub4_Sub2.aClass16_2537, (Class46.loadItem(i_20_, (byte)
		 * 96).itemName), Class25.aClass16_636 })); if (Class64.aClass16_1218 ==
		 * null) Class64.aClass16_1218 = Class37_Sub9_Sub17.aClass16_3226; }
		 * else { if ((i_19_ ^ 0xffffffff) == -34) { Class37_Sub4_Sub7_Sub1_Sub1
		 * class37_sub4_sub7_sub1_sub1 =
		 * (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]); if
		 * (class37_sub4_sub7_sub1_sub1 != null) {
		 * Class37_Sub9_Sub30.anInt3467++; NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub1.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub1.anIntArray3669[0], 0,
		 * 1, true); Applet_Sub1.anInt8 = Class33.lastClickX;
		 * Class37_Sub9_Sub8.anInt3057 = 0; Class19.anInt490 = 2;
		 * Class27.anInt676 = Class37_Sub13.lastClickY;
		 * Class42.aClass37_Sub11_Sub1_936.method989( 13);
		 * Class42.aClass37_Sub11_Sub1_936.method962(i_20_, false);
		 * Class42.aClass37_Sub11_Sub1_936.method973(
		 * Class37_Sub9_Sub21.anInt3317, -1629130328);
		 * Class42.aClass37_Sub11_Sub1_936.method962( MouseHandler.anInt174,
		 * false); Class42.aClass37_Sub11_Sub1_936.method945(Class57.anInt1101);
		 * } } if ((i_19_ ^ 0xffffffff) == -11) {
		 * Class37_Sub9_Sub12.anInt3114++;
		 * Class42.aClass37_Sub11_Sub1_936.method989(215);
		 * Class42.aClass37_Sub11_Sub1_936.method947(i_18_); RSInterface
		 * rSInterface = Class37_Sub9_Sub14.getInterface(i_18_); if
		 * (rSInterface.cs1opcodes != null && ((rSInterface.cs1opcodes[0][0] ^
		 * 0xffffffff) == -6)) { int i_22_ = rSInterface.cs1opcodes[0][1]; if
		 * (rSInterface.requiredValues[0] !=
		 * Class37_Sub23.anIntArray2237[i_22_]) {
		 * Class37_Sub23.anIntArray2237[i_22_] = rSInterface.requiredValues[0];
		 * Cache.method1183(i_22_, (byte) -3); } } } if ((i_19_ ^ 0xffffffff) ==
		 * -23) { Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 =
		 * (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_]); if
		 * (class37_sub4_sub7_sub1_sub2 != null) { Class39.anInt862++; NodeSub
		 * .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub2.anIntArray3669[0], 0,
		 * 1, true); Class27.anInt676 = Class37_Sub13.lastClickY;
		 * Class37_Sub9_Sub8.anInt3057 = 0; Class19.anInt490 = 2;
		 * Applet_Sub1.anInt8 = Class33.lastClickX;
		 * Class42.aClass37_Sub11_Sub1_936.method989( 204);
		 * Class42.aClass37_Sub11_Sub1_936.method965( Class57.anInt1101);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_20_);
		 * Class42.aClass37_Sub11_Sub1_936.method943(
		 * Class37_Sub9_Sub21.anInt3317, -14);
		 * Class42.aClass37_Sub11_Sub1_936.method945(MouseHandler.anInt174); } }
		 * if (i_19_ == 51) { Class37_Sub4_Sub7_Sub1_Sub1
		 * class37_sub4_sub7_sub1_sub1 =
		 * (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_20_]); if
		 * (class37_sub4_sub7_sub1_sub1 != null) { NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub1.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub1.anIntArray3669[0], 0,
		 * 1, true); Class37_Sub7.anInt1915++; Class19.anInt490 = 2;
		 * Applet_Sub1.anInt8 = Class33.lastClickX; Class27.anInt676 =
		 * Class37_Sub13.lastClickY; Class37_Sub9_Sub8.anInt3057 = 0;
		 * Class42.aClass37_Sub11_Sub1_936.method989( 21);
		 * Class42.aClass37_Sub11_Sub1_936.method965( i_20_); } } if (i_19_ ==
		 * 45) { Class37_Sub9_Sub8.anInt3047++; boolean bool = (NodeSub
		 * .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, i_17_,
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 0, 0, i_18_, 0, 0, true)); if (!bool) bool = (NodeSub
		 * .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, i_17_,
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, i_18_, 0, 1, true)); Class19.anInt490 = 2;
		 * Class37_Sub9_Sub8.anInt3057 = 0; Class27.anInt676 =
		 * Class37_Sub13.lastClickY; Applet_Sub1.anInt8 = Class33.lastClickX;
		 * Class42.aClass37_Sub11_Sub1_936.method989(175);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_20_);
		 * Class42.aClass37_Sub11_Sub1_936.method965(Class15_Sub1.anInt1738 +
		 * i_18_); Class42.aClass37_Sub11_Sub1_936.method957(true, i_17_ -
		 * -Class37_Sub18.anInt2200); } if ((i_19_ ^ 0xffffffff) == -33) {
		 * Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 =
		 * (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_20_]); if
		 * (class37_sub4_sub7_sub1_sub2 != null) {
		 * Class37_Sub9_Sub13.anInt3127++; NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, class37_sub4_sub7_sub1_sub2.anIntArray3669[0], 0,
		 * 1, true); Class19.anInt490 = 2; Applet_Sub1.anInt8 =
		 * Class33.lastClickX; Class27.anInt676 = Class37_Sub13.lastClickY;
		 * Class37_Sub9_Sub8.anInt3057 = 0;
		 * Class42.aClass37_Sub11_Sub1_936.method989( 247);
		 * Class42.aClass37_Sub11_Sub1_936.method945(i_20_); } } if ((i_19_ ^
		 * 0xffffffff) == -20) { Class49.anInt1010++;
		 * Class37_Sub4_Sub10.method676(i_20_, i_17_, i_18_, 0);
		 * Class42.aClass37_Sub11_Sub1_936.method989(174);
		 * Class42.aClass37_Sub11_Sub1_936.method957(true, i_17_ -
		 * -Class37_Sub18.anInt2200); Class42.aClass37_Sub11_Sub1_936.method962(
		 * i_20_ >> -771723058 & 0x7fff, false);
		 * Class42.aClass37_Sub11_Sub1_936.method962( Class15_Sub1.anInt1738 +
		 * i_18_, false); } if ((i_19_ ^ 0xffffffff) == -32) { boolean bool =
		 * (NodeSub .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, i_17_,
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 0, 0, i_18_, 0, 0, true));
		 * Class37_Sub9_Sub33.anInt3515++; if (!bool) bool = (NodeSub
		 * .method434(
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]),
		 * 0, i_17_,
		 * (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]),
		 * false, 2, 0, 1, 0, i_18_, 0, 1, true)); Class37_Sub9_Sub8.anInt3057 =
		 * 0; Applet_Sub1.anInt8 = Class33.lastClickX; Class19.anInt490 = 2;
		 * Class27.anInt676 = Class37_Sub13.lastClickY;
		 * Class42.aClass37_Sub11_Sub1_936.method989(190);
		 * Class42.aClass37_Sub11_Sub1_936.method945(Class37_Sub18.anInt2200 +
		 * i_17_); Class42.aClass37_Sub11_Sub1_936.method945(i_20_);
		 * Class42.aClass37_Sub11_Sub1_936.method962( Class15_Sub1.anInt1738 +
		 * i_18_, false); Class42.aClass37_Sub11_Sub1_936.method973(
		 * Class32.anInt737, -1629130328);
		 * Class42.aClass37_Sub11_Sub1_936.method945(KeyboardHandler.anInt558);
		 * } if (Class37_Sub14.anInt2122 != 0) { Class37_Sub14.anInt2122 = 0;
		 * Class73.refreshInterface((Class37_Sub9_Sub14.getInterface(
		 * Class37_Sub9_Sub21.anInt3317))); } if
		 * (Class37_Sub4_Sub5.aBoolean2595) NodeSub.method436(1); if
		 * (Class37_Sub4_Sub13.aClass18_2797 != null && Class42.anInt939 == 0)
		 * Class73 .refreshInterface(Class37_Sub4_Sub13.aClass18_2797); } } }
		 */
	}

	static {
		anInt1875 = -1;
		aClass16_1876 = Class37_Sub2.create_rsstring("cyan:");
		aClass16_1873 = aClass16_1876;
		aClass16_1872 = aClass16_1876;
	}
}
