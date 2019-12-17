package org.ie.client;

import org.ie.Main;

/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class43 {
	public static RSString aClass16_949;
	public static Class19 aClass19_950;
	public static int anInt951;
	public static int anInt952;
	public static int[][] anIntArrayArray953 = { { 1, 1 }, { -1, 1 },
			{ 1, -1 }, { -1, -1 } };
	public static int anInt954;
	public static int anInt955;
	public static int anInt956;
	public static int anInt957 = 127;
	public static Signlink aClass51_958;
	public static int anInt959;
	public static int anInt960;
	public static int[] anIntArray961;
	public static RSString aClass16_962;

	public static void method1089(int i) {
		anInt955++;
		if ((client.anInt1719 ^ 0xffffffff) == -1) {
			Class38.aClass67_847 = new Class67(4, 104, 104,
					Class64.anIntArrayArrayArray1217);
			for (int i_0_ = 0; i_0_ < 4; i_0_++)
				Class68.aClass20Array1322[i_0_] = new Class20(104, 104);
			Class37_Sub9_Sub16.aClass37_Sub4_Sub9_Sub3_3202 = new Sprite(
					512, 512);
			client.anInt1719 = 20;
			Class37_Sub9_Sub27.anInt3400 = 5;
			Class37_Sub9_Sub33.aClass16_3522 = Class20.aClass16_543;
		} else if (client.anInt1719 == 20) {
			int[] is = new int[9];
			for (int i_1_ = 0; i_1_ < 9; i_1_++) {
				int i_2_ = 15 + (32 * i_1_ + 128);
				int i_3_ = Rasterizer.anIntArray3910[i_2_];
				int i_4_ = 600 + 3 * i_2_;
				is[i_1_] = i_3_ * i_4_ >> 2110031760;
			}
			Class67.method1236(is, 500, 800, 512, 334);
			Class37_Sub9_Sub33.aClass16_3522 = Class37_Sub9_Sub28.aClass16_3436;
			Class37_Sub9_Sub27.anInt3400 = 10;
			client.anInt1719 = 30;
		} else {
			if (i != 600)
				anIntArrayArray953 = null;
			if (client.anInt1719 == 30) {
				Class69.aClass15_Sub1_1335 = Class37_Sub4_Sub7_Sub5.method540(
						true, true, 0, (byte) 121, false);
				Class69.aClass15_Sub1_1330 = Class37_Sub4_Sub7_Sub5.method540(
						true, true, 1, (byte) 20, false);
				Class14.aClass15_Sub1_242 = Class37_Sub4_Sub7_Sub5.method540(
						false, true, 2, (byte) 116, true);
				Canvas_Sub1.aClass15_Sub1_46 = Class37_Sub4_Sub7_Sub5
						.method540(true, true, 3, (byte) 27, false);
				NodeSub.aClass15_Sub1_1862 = Class37_Sub4_Sub7_Sub5
						.method540(true, true, 4, (byte) 37, false);
				Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740 = Class37_Sub4_Sub7_Sub5
						.method540(true, true, 5, (byte) 70, true);
				Class54.aClass15_Sub1_1060 = Class37_Sub4_Sub7_Sub5.method540(
						true, false, 6, (byte) 20, true);
				Class29.aClass15_Sub1_711 = Class37_Sub4_Sub7_Sub5.method540(
						true, true, 7, (byte) 33, false);
				Class60.aClass15_Sub1_1151 = Class37_Sub4_Sub7_Sub5.method540(
						true, true, 8, (byte) 90, false);
				Class37_Sub11_Sub1.aClass15_Sub1_3609 = Class37_Sub4_Sub7_Sub5
						.method540(false, true, 9, (byte) 108, true);
				Class52_Sub1.aClass15_Sub1_2309 = Class37_Sub4_Sub7_Sub5
						.method540(true, true, 10, (byte) 103, false);
				Class36.aClass15_Sub1_796 = Class37_Sub4_Sub7_Sub5.method540(
						true, true, 11, (byte) 45, false);
				Class37_Sub9_Sub34.aClass15_Sub1_3555 = Class37_Sub4_Sub7_Sub5
						.method540(true, true, 12, (byte) 103, false);
				Class37_Sub9_Sub2.aClass15_Sub1_2932 = Class37_Sub4_Sub7_Sub5
						.method540(false, true, 13, (byte) 110, true);
				Class37_Sub20.aClass15_Sub1_2216 = Class37_Sub4_Sub7_Sub5
						.method540(true, false, 14, (byte) 25, false);
				Class37_Sub17.aClass15_Sub1_2164 = Class37_Sub4_Sub7_Sub5
						.method540(true, true, 15, (byte) 73, false);
				client.anInt1719 = 40;
				Class37_Sub9_Sub27.anInt3400 = 20;
				Class37_Sub9_Sub33.aClass16_3522 = RSString.aClass16_1682;
			} else if (client.anInt1719 == 40) {
				int i_5_ = 0;
				i_5_ += (Class69.aClass15_Sub1_1335.method135((byte) 85) * 4 / 100);
				i_5_ += (Class69.aClass15_Sub1_1330.method135((byte) 60) * 4 / 100);
				i_5_ += (Class14.aClass15_Sub1_242.method135((byte) 51) * 2 / 100);
				i_5_ += (2 * Canvas_Sub1.aClass15_Sub1_46.method135((byte) 118) / 100);
				i_5_ += (NodeSub.aClass15_Sub1_1862.method135((byte) 112) * 6 / 100);
				i_5_ += 4 * Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740
						.method135((byte) 99) / 100;
				i_5_ += (2 * Class54.aClass15_Sub1_1060.method135((byte) 92) / 100);
				i_5_ += (60 * Class29.aClass15_Sub1_711.method135((byte) 94) / 100);
				i_5_ += (2 * Class60.aClass15_Sub1_1151.method135((byte) 48) / 100);
				i_5_ += Class37_Sub11_Sub1.aClass15_Sub1_3609
						.method135((byte) 96) * 2 / 100;
				i_5_ += (Class52_Sub1.aClass15_Sub1_2309.method135((byte) 119) * 2 / 100);
				i_5_ += (2 * Class36.aClass15_Sub1_796.method135((byte) 57) / 100);
				i_5_ += 2 * Class37_Sub9_Sub34.aClass15_Sub1_3555
						.method135((byte) 48) / 100;
				i_5_ += 2 * Class37_Sub9_Sub2.aClass15_Sub1_2932
						.method135((byte) 85) / 100;
				i_5_ += (Class37_Sub20.aClass15_Sub1_2216.method135((byte) 70) * 2 / 100);
				i_5_ += 2 * Class37_Sub17.aClass15_Sub1_2164
						.method135((byte) 66) / 100;
				if (i_5_ != 100) {
					if (i_5_ != 0)
						Class37_Sub9_Sub33.aClass16_3522 = (Class37_Sub9_Sub27
								.method881((new RSString[] {
										Class32_Sub1.aClass16_1793,
										Class37_Sub9_Sub24.method870(i_5_,
												(byte) -114),
										Class37_Sub4_Sub4.aClass16_2582 })));
					Class37_Sub9_Sub27.anInt3400 = 30;
				} else {
					Class37_Sub9_Sub33.aClass16_3522 = Class37_Sub4_Sub7_Sub5.aClass16_3821;
					client.anInt1719 = 45;
					Class37_Sub9_Sub27.anInt3400 = 30;
				}
			} else if ((client.anInt1719 ^ 0xffffffff) == -46) {
				Class37_Sub9_Sub18.method836(!ClientScriptDef.aBoolean2613,
						2, 22050, (byte) 59);
				Class37_Sub3_Sub3 class37_sub3_sub3 = new Class37_Sub3_Sub3();
				class37_sub3_sub3.method370(9, 128, 109);
				Class88.aClass24_1605 = Class17.method188(
						Class37_Sub9.aCanvas1967, Class80.aClass51_1508, 22050,
						-1, 0);
				Class88.aClass24_1605.method245(0, class37_sub3_sub3);
				Class37_Sub4_Sub4.method481(NodeSub.aClass15_Sub1_1862,
						Class37_Sub20.aClass15_Sub1_2216, class37_sub3_sub3,
						7201, Class37_Sub17.aClass15_Sub1_2164);
				Class37_Sub4_Sub7.aClass24_2638 = Class17.method188(
						Class37_Sub9.aCanvas1967, Class80.aClass51_1508, 2048,
						-1, 1);
				Class1.aClass37_Sub3_Sub2_59 = new Class37_Sub3_Sub2();
				Class37_Sub4_Sub7.aClass24_2638.method245(0,
						Class1.aClass37_Sub3_Sub2_59);
				Class86.aClass30_1579 = new Class30(22050, Class33.anInt765);
				Class37_Sub9_Sub27.anInt3400 = 35;
				Class37_Sub9_Sub33.aClass16_3522 = InterfaceClickMask.aClass16_1997;
				client.anInt1719 = 50;
			} else if (client.anInt1719 == 50) {
				int i_6_ = 0;
				if (NodeSub.aClass37_Sub4_Sub9_Sub2_Sub1_1848 != null)
					i_6_++;
				else
					NodeSub.aClass37_Sub4_Sub9_Sub2_Sub1_1848 = (Class37_Sub9_Sub6
							.method787(Class56.aClass16_1096,
									Class37_Sub9_Sub2.aClass15_Sub1_2932,
									Class37_Sub9_Sub8.aClass16_3045,
									(byte) 121, Class60.aClass15_Sub1_1151));
				if (Class17.aClass37_Sub4_Sub9_Sub2_Sub1_315 != null)
					i_6_++;
				else
					Class17.aClass37_Sub4_Sub9_Sub2_Sub1_315 = (Class37_Sub9_Sub6
							.method787(Class10.aClass16_201,
									Class37_Sub9_Sub2.aClass15_Sub1_2932,
									Class37_Sub9_Sub8.aClass16_3045,
									(byte) 120, Class60.aClass15_Sub1_1151));
				if (Class37_Sub4_Sub7_Sub2.aClass37_Sub4_Sub9_Sub2_Sub1_3724 == null)
					Class37_Sub4_Sub7_Sub2.aClass37_Sub4_Sub9_Sub2_Sub1_3724 = (Class37_Sub9_Sub6
							.method787(Class37_Sub4_Sub7_Sub5.aClass16_3810,
									Class37_Sub9_Sub2.aClass15_Sub1_2932,
									Class37_Sub9_Sub8.aClass16_3045,
									(byte) 114, Class60.aClass15_Sub1_1151));
				else
					i_6_++;
				if (i_6_ < 3) {
					Class37_Sub9_Sub33.aClass16_3522 = (Class37_Sub9_Sub27
							.method881((new RSString[] {
									Class73.aClass16_1391,
									Class37_Sub9_Sub24.method870(
											i_6_ * 100 / 3, (byte) -114),
									Class37_Sub4_Sub4.aClass16_2582 })));
					Class37_Sub9_Sub27.anInt3400 = 40;
				} else {
					Class37_Sub9_Sub33.aClass16_3522 = RuntimeException_Sub1.aClass16_1624;
					Class37_Sub9_Sub27.anInt3400 = 40;
					client.anInt1719 = 60;
				}
			} else if ((client.anInt1719 ^ 0xffffffff) == -61) {
				/*int i_7_ = Class37_Sub9_Sub20.method848(
						(Class52_Sub1.aClass15_Sub1_2309), -114,
						Class60.aClass15_Sub1_1151);
				int i_8_ = Class82.method1303(6);
				if ((i_7_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) {
					Class37_Sub9_Sub33.aClass16_3522 = (Class37_Sub9_Sub27
							.method881(121, (new RSString[] {
									Class22.aClass16_575,
									Class37_Sub9_Sub24.method870(i_7_ * 100
											/ i_8_, (byte) -114),
									Class37_Sub4_Sub4.aClass16_2582 })));
					Class37_Sub9_Sub27.anInt3400 = 50;
				} else {*/
					Class37_Sub9_Sub33.aClass16_3522 = Class37_Sub9_Sub32.aClass16_3506;
					Class37_Sub9_Sub27.anInt3400 = 50;
					client.anInt1719 = 70;
				//}
			} else if ((client.anInt1719 ^ 0xffffffff) == -71) {
				if (!Class14.aClass15_Sub1_242.method114((byte) -114)) {
					Class37_Sub9_Sub33.aClass16_3522 = (Class37_Sub9_Sub27
							.method881((new RSString[] {
									Class37_Sub9_Sub19.aClass16_3273,
									(Class37_Sub9_Sub24.method870(
											Class14.aClass15_Sub1_242
													.method136((byte) -16),
											(byte) -114)),
									Class37_Sub4_Sub4.aClass16_2582 })));
					Class37_Sub9_Sub27.anInt3400 = 60;
				} else {
					NodeSub.method439(i ^ ~0x231,
							Class14.aClass15_Sub1_242);
					Class37_Sub1.method330(Class14.aClass15_Sub1_242, 110);
					Class37_Sub4_Sub7_Sub3.method515(Class29.aClass15_Sub1_711,
							Class14.aClass15_Sub1_242, 3);
					Class22.method232(127, Class14.aClass15_Sub1_242,
							ClientScriptDef.aBoolean2613,
							Class29.aClass15_Sub1_711);
					Class37_Sub4_Sub3.method469(Class29.aClass15_Sub1_711,
							Class14.aClass15_Sub1_242, 114);
					Class37_Sub9_Sub8.method795(
							Class37_Sub4_Sub13.aBoolean2791,
							Class14.aClass15_Sub1_242, (byte) 102,
							NodeSub.aClass37_Sub4_Sub9_Sub2_Sub1_1848,
							Class29.aClass15_Sub1_711);
					Class3.method45(Class69.aClass15_Sub1_1335, Class69.aClass15_Sub1_1330,
							Class14.aClass15_Sub1_242);
					Applet_Sub1.method22(Class29.aClass15_Sub1_711, (byte) 93,
							Class14.aClass15_Sub1_242);
					Class84.method1318(Class14.aClass15_Sub1_242, 0);
					Deque.method1153(Class14.aClass15_Sub1_242, 19014);
					Class37_Sub9_Sub36.method920(-23499,
							Class29.aClass15_Sub1_711,
							Class60.aClass15_Sub1_1151,
							Canvas_Sub1.aClass15_Sub1_46,
							(Class37_Sub9_Sub2.aClass15_Sub1_2932));
					Class37_Sub5.method735(-120, Class14.aClass15_Sub1_242);
					Class60.method1165(24434, Class14.aClass15_Sub1_242);
					client.anInt1719 = 80;
					Class37_Sub9_Sub27.anInt3400 = 60;
					Class37_Sub9_Sub33.aClass16_3522 = RSString.aClass16_1638;
				}
			} else if (client.anInt1719 == 80) {
				int i_9_ = 0;
				/*if (Class37_Sub9_Sub28.aClass37_Sub4_Sub9_Sub3_3430 != null)
					i_9_++;
				else
					Class37_Sub9_Sub28.aClass37_Sub4_Sub9_Sub3_3430 = Class45
							.method1095(false, Class60.aClass15_Sub1_1151,
									Class37_Sub9_Sub8.aClass16_3045,
									Class36.aClass16_799);
				if (Class59.aClass37_Sub4_Sub9_Sub3_1135 == null)
					Class59.aClass37_Sub4_Sub9_Sub3_1135 = Class45.method1095(
							false, Class60.aClass15_Sub1_1151,
							Class37_Sub9_Sub8.aClass16_3045,
							Class86.aClass16_1581);
				else
					i_9_++;
				if (Class20.aClass37_Sub4_Sub9_Sub1Array529 == null)
					Class20.aClass37_Sub4_Sub9_Sub1Array529 = Class46
							.method1104(Class60.aClass15_Sub1_1151,
									Class37_Sub9_Sub8.aClass16_3045, 999999999,
									Class37_Sub9_Sub7.aClass16_3029);
				else
					i_9_++;
				if (Class37_Sub9_Sub22.aClass37_Sub4_Sub9_Sub3Array3329 != null)
					i_9_++;
				else
					Class37_Sub9_Sub22.aClass37_Sub4_Sub9_Sub3Array3329 = Class33
							.method302(116, Class37_Sub9.aClass16_1968,
									Class37_Sub9_Sub8.aClass16_3045,
									Class60.aClass15_Sub1_1151);
				if (Class59.aClass37_Sub4_Sub9_Sub3Array1133 != null)
					i_9_++;
				else
					Class59.aClass37_Sub4_Sub9_Sub3Array1133 = Class33
							.method302(123, Class37_Sub4_Sub4.aClass16_2586,
									Class37_Sub9_Sub8.aClass16_3045,
									Class60.aClass15_Sub1_1151);
				if (Class32_Sub1.aClass37_Sub4_Sub9_Sub3Array1785 != null)
					i_9_++;
				else
					Class32_Sub1.aClass37_Sub4_Sub9_Sub3Array1785 = Class33
							.method302(127, Class50.aClass16_1015,
									Class37_Sub9_Sub8.aClass16_3045,
									Class60.aClass15_Sub1_1151);
				if (Class37_Sub9_Sub20.aClass37_Sub4_Sub9_Sub3Array3302 != null)
					i_9_++;
				else
					Class37_Sub9_Sub20.aClass37_Sub4_Sub9_Sub3Array3302 = Class33
							.method302(118, aClass16_949,
									Class37_Sub9_Sub8.aClass16_3045,
									Class60.aClass15_Sub1_1151);
				if (Class37_Sub25.aClass37_Sub4_Sub9_Sub3Array2291 != null)
					i_9_++;
				else
					Class37_Sub25.aClass37_Sub4_Sub9_Sub3Array2291 = Class33
							.method302(127, Class59.aClass16_1138,
									Class37_Sub9_Sub8.aClass16_3045,
									Class60.aClass15_Sub1_1151);
				if (Class37_Sub9_Sub19.aClass37_Sub4_Sub9_Sub3Array3262 == null)
					Class37_Sub9_Sub19.aClass37_Sub4_Sub9_Sub3Array3262 = Class33
							.method302(124, Class26.aClass16_662,
									Class37_Sub9_Sub8.aClass16_3045,
									Class60.aClass15_Sub1_1151);
				else
					i_9_++;
				if (Class76.aClass37_Sub4_Sub9_Sub3Array1435 == null)
					Class76.aClass37_Sub4_Sub9_Sub3Array1435 = Class33
							.method302(117, client.aClass16_1722,
									Class37_Sub9_Sub8.aClass16_3045,
									Class60.aClass15_Sub1_1151);
				else
					i_9_++;
				if (Class72.aClass37_Sub4_Sub9_Sub3Array1377 == null)
					Class72.aClass37_Sub4_Sub9_Sub3Array1377 = Class33
							.method302(116,
									(Class37_Sub4_Sub7_Sub3.aClass16_3755),
									Class37_Sub9_Sub8.aClass16_3045,
									Class60.aClass15_Sub1_1151);
				else
					i_9_++;
				if (Class56.aClass37_Sub4_Sub9_Sub1Array1092 != null)
					i_9_++;
				else
					Class56.aClass37_Sub4_Sub9_Sub1Array1092 = Class46
							.method1104(Class60.aClass15_Sub1_1151,
									Class37_Sub9_Sub8.aClass16_3045,
									i ^ 0x3b9acba7,
									Class37_Sub9_Sub29.aClass16_3447);
				if (Class10.aClass37_Sub4_Sub9_Sub1Array191 != null)
					i_9_++;
				else
					Class10.aClass37_Sub4_Sub9_Sub1Array191 = Class46
							.method1104(Class60.aClass15_Sub1_1151,
									Class37_Sub9_Sub8.aClass16_3045, 999999999,
									(Class37_Sub4_Sub7_Sub1_Sub2.aClass16_3979));
				if (Canvas_Sub1.aClass37_Sub4_Sub9_Sub1_47 != null)
					i_9_++;
				else
					Canvas_Sub1.aClass37_Sub4_Sub9_Sub1_47 = Class30.method277(
							Class37_Sub9_Sub8.aClass16_3045, -1094018352,
							Class37_Sub1.aClass16_1798,
							Class60.aClass15_Sub1_1151);
				if ((i_9_ ^ 0xffffffff) > -15) {
					Class37_Sub9_Sub33.aClass16_3522 = (Class37_Sub9_Sub27
							.method881((new RSString[] {
									InterfaceClickMask.aClass16_1998,
									Class37_Sub9_Sub24.method870(
											100 * i_9_ / 14, (byte) -114),
									Class37_Sub4_Sub4.aClass16_2582 })));
					Class37_Sub9_Sub27.anInt3400 = 70;
				} else {*/
					/*int i_10_ = -10 + (int) (Math.random() * 21.0);
					Class37_Sub4_Sub9_Sub2.aClass37_Sub4_Sub9_Sub1Array3875 = Class10.aClass37_Sub4_Sub9_Sub1Array191;
					int i_11_ = -10 + (int) (21.0 * Math.random());
					int i_12_ = -10 + (int) (Math.random() * 21.0);
					int i_13_ = (int) (41.0 * Math.random()) + -20;
					Class59.aClass37_Sub4_Sub9_Sub3_1135.method642();
					for (int i_14_ = 0; ((Class37_Sub9_Sub22.aClass37_Sub4_Sub9_Sub3Array3329).length > i_14_); i_14_++)
						Class37_Sub9_Sub22.aClass37_Sub4_Sub9_Sub3Array3329[i_14_]
								.method630(i_13_ + i_10_, i_13_ + i_11_, i_13_
										+ i_12_);
					Class20.aClass37_Sub4_Sub9_Sub1Array529[0].method596(i_10_
							+ i_13_, i_11_ + i_13_, i_13_ + i_12_);
					NodeSub.method440(-7274);*/
					Class37_Sub9_Sub33.aClass16_3522 = Class37_Sub9_Sub15.aClass16_3164;
					client.anInt1719 = 90;
					Class37_Sub9_Sub27.anInt3400 = 70;
				//}
			} else if ((client.anInt1719 ^ 0xffffffff) == -91) {
				if (!Class37_Sub11_Sub1.aClass15_Sub1_3609.method114((byte) 8)) {
					Class37_Sub9_Sub33.aClass16_3522 = (Class37_Sub9_Sub27
							.method881(
									(new RSString[] {
											Class37_Sub23.aClass16_2238,
											(Class37_Sub9_Sub24
													.method870(
															Class37_Sub11_Sub1.aClass15_Sub1_3609
																	.method136((byte) -16),
															(byte) -114)),
											Class37_Sub4_Sub4.aClass16_2582 })));
					Class37_Sub9_Sub27.anInt3400 = 90;
				} else {
					Class82 class82 = new Class82(
							Class37_Sub11_Sub1.aClass15_Sub1_3609,
							Class60.aClass15_Sub1_1151, 20,
							(ClientScriptDef.aBoolean2613 ? 64 : 128));
					Rasterizer.method673(class82);
					Rasterizer.method666(0.8F);
					Class37_Sub9_Sub27.anInt3400 = 90;
					client.anInt1719 = 110;
					Class37_Sub9_Sub33.aClass16_3522 = Class37_Sub4_Sub7_Sub1_Sub2.aClass16_3965;
				}
			} else if ((client.anInt1719 ^ 0xffffffff) == -111) {
				Class37_Sub9_Sub27.aClass55_3417 = new Class55();
				Class80.aClass51_1508.method1119(
						(Class37_Sub9_Sub27.aClass55_3417), 10, (byte) 65);
				Class37_Sub9_Sub27.anInt3400 = 94;
				Class37_Sub9_Sub33.aClass16_3522 = Class37_Sub4_Sub7_Sub1_Sub1.aClass16_3959;
				client.anInt1719 = 120;
			} else if (client.anInt1719 == 120) {
				if (!Class52_Sub1.aClass15_Sub1_2309.method130(
						Applet_Sub1.aClass16_3,
						Class37_Sub9_Sub8.aClass16_3045, -99)) {
					Class37_Sub9_Sub33.aClass16_3522 = Class37_Sub9_Sub27
							.method881((new RSString[] { Class2.aClass16_83,
									(Class72.aClass16_1375) }));
					Class37_Sub9_Sub27.anInt3400 = 96;
				} else {
					Class14 class14 = new Class14(
							Class52_Sub1.aClass15_Sub1_2309.method126(
									(byte) 122, Applet_Sub1.aClass16_3,
									Class37_Sub9_Sub8.aClass16_3045));
					Class37_Sub4_Sub15.method716(-1, class14);
					Class37_Sub9_Sub27.anInt3400 = 96;
					Class37_Sub9_Sub33.aClass16_3522 = Class1.aClass16_57;
					client.anInt1719 = 130;
				}
			} else if ((client.anInt1719 ^ 0xffffffff) == -131) {
				if (!Canvas_Sub1.aClass15_Sub1_46.method114((byte) -83)) {
					Class37_Sub9_Sub33.aClass16_3522 = (Class37_Sub9_Sub27
							.method881((new RSString[] {
									Class41.aClass16_909,
									(Class37_Sub9_Sub24.method870(
											4 * Canvas_Sub1.aClass15_Sub1_46
													.method136((byte) -16) / 5,
											(byte) -114)),
									Class37_Sub4_Sub4.aClass16_2582 })));
					Class37_Sub9_Sub27.anInt3400 = 100;
				} else if (!Class37_Sub9_Sub34.aClass15_Sub1_3555
						.method114((byte) 69)) {
					Class37_Sub9_Sub33.aClass16_3522 = (Class37_Sub9_Sub27
							.method881((new RSString[] {
											Class41.aClass16_909,
											(Class37_Sub9_Sub24
													.method870(
															Class37_Sub9_Sub34.aClass15_Sub1_3555
																	.method136((byte) -16) / 6 + 80,
															(byte) -114)),
											Class37_Sub4_Sub4.aClass16_2582 })));
					Class37_Sub9_Sub27.anInt3400 = 100;
				} else if (!Class37_Sub9_Sub2.aClass15_Sub1_2932
						.method114((byte) -97)) {
					Class37_Sub9_Sub33.aClass16_3522 = (Class37_Sub9_Sub27
							.method881((new RSString[] {
											Class41.aClass16_909,
											(Class37_Sub9_Sub24
													.method870(
															96 + Class37_Sub9_Sub2.aClass15_Sub1_2932
																	.method136((byte) -16) / 20,
															(byte) -114)),
											Class37_Sub4_Sub4.aClass16_2582 })));
					Class37_Sub9_Sub27.anInt3400 = 100;
				} else {
					client.anInt1719 = 140;
					Class37_Sub9_Sub33.aClass16_3522 = Class69.aClass16_1346;
					Class37_Sub9_Sub27.anInt3400 = 100;
				}
			} else if ((client.anInt1719 ^ 0xffffffff) == -141) {
				Class37_Sub4_Sub3.setGameState(30);
				Class26.method259(Main.gamepanel, 1, -125);
			}
		}
	}

	public static RSString method1090(int i_15_, int i, RSString[] class16s) {
		int i_17_ = 0;
		for (int i_18_ = 0; (i ^ 0xffffffff) < (i_18_ ^ 0xffffffff); i_18_++) {
			if (class16s[i_15_ + i_18_] == null)
				class16s[i_15_ - -i_18_] = Class37_Sub13.aClass16_2115;
			i_17_ += class16s[i_18_ + i_15_].anInt1650;
		}
		int i_20_ = 0;
		byte[] is = new byte[i_17_];
		for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (i ^ 0xffffffff); i_21_++) {
			RSString rSString = class16s[i_15_ - -i_21_];
			Class53.method1135(rSString.aByteArray1669, 0, is, i_20_,
					rSString.anInt1650);
			i_20_ += rSString.anInt1650;
		}
		RSString rSString = new RSString();
		rSString.anInt1650 = i_17_;
		rSString.aByteArray1669 = is;
		return rSString;
	}

	public static int method1091(byte i, boolean bool, boolean bool_22_) {
		anInt951++;
		if (i != 113)
			aClass16_962 = null;
		int i_23_ = 0;
		if (bool)
			i_23_ += (Class37_Sub4_Sub7_Sub1_Sub1.anInt3953 - -Class37_Sub9_Sub12.anInt3121);
		if (bool_22_)
			i_23_ += Class37_Sub9_Sub26.anInt3396 + Class45.anInt974;
		return i_23_;
	}

	public static void executeScript(InterfaceListener class37_sub8) {
		//Class37_Sub9_Sub4.executeScript(class37_sub8, 200000);
	}

	public static void method1093(int i) {
		aClass51_958 = null;
		aClass19_950 = null;
		aClass16_962 = null;
		aClass16_949 = null;
		if (i != 20)
			aClass16_962 = null;
		anIntArrayArray953 = null;
		anIntArray961 = null;
	}

	static {
		aClass16_949 = Class37_Sub2.create_rsstring("headicons_prayer");
		anInt956 = 0;
		anIntArray961 = new int[100];
		anInt959 = 0;
		aClass16_962 = Class37_Sub2.create_rsstring("<col=ff3000>");
	}
}
