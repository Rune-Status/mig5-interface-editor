package org.ie.client;

import org.ie.Main;


/* Class37_Sub9_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub19 extends Class37_Sub9 {
	public int anInt3247 = 585;
	public static int anInt3248;
	public static int anInt3249;
	public static long aLong3250 = 0L;
	public static int anInt3251;
	public static RSString aClass16_3252;
	public static RSString aClass16_3253 = Class37_Sub2.create_rsstring(":clan:");
	public static RSString aClass16_3254 = Class37_Sub2.create_rsstring("Connection timed out)3");
	public static RSString aClass16_3255;
	public static int anInt3256;
	public static RSString aClass16_3257;
	public static volatile int currentClickX;
	public static int anInt3259;
	public static RSString aClass16_3260;
	public static RSString aClass16_3261;
	public static Sprite[] aClass37_Sub4_Sub9_Sub3Array3262;
	public static Class15 aClass15_3263;
	public static int anInt3264;
	public static Interface3 anInterface3_3265;
	public static int anInt3266;
	public static int anInt3267;
	public static int anInt3268;
	public static RSString aClass16_3269;
	public static int anInt3270;
	public static int[] heldKeyCache;
	public static int anInt3272;
	public static RSString aClass16_3273;
	public static volatile int mouseIdleTime;

	public static void method838(Applet_Sub1 applet_sub1, int i) {
		if (i != 13634)
			anInt3248 = 12;
		anInt3251++;
		do {
			if (Class37_Sub9_Sub28.lastMouseClick == 1) {
				int i_0_ = 280;
				if (i_0_ > Class33.lastClickX
						|| (i_0_ - -14 ^ 0xffffffff) > (Class33.lastClickX ^ 0xffffffff)
						|| (Class37_Sub13.lastClickY ^ 0xffffffff) > -5
						|| (Class37_Sub13.lastClickY ^ 0xffffffff) < -19) {
					if ((i_0_ + 15 ^ 0xffffffff) >= (Class33.lastClickX ^ 0xffffffff)
							&& (i_0_ + 80 ^ 0xffffffff) <= (Class33.lastClickX ^ 0xffffffff)
							&& Class37_Sub13.lastClickY >= 4
							&& (Class37_Sub13.lastClickY ^ 0xffffffff) >= -19) {
						Class82.method1308(0, (byte) 77, 1);
						break;
					}
				} else {
					Class82.method1308(0, (byte) 101, 0);
					break;
				}
				int i_1_ = 390;
				if ((Class33.lastClickX ^ 0xffffffff) <= (i_1_ ^ 0xffffffff)
						&& (i_1_ + 14 ^ 0xffffffff) <= (Class33.lastClickX ^ 0xffffffff)
						&& (Class37_Sub13.lastClickY ^ 0xffffffff) <= -5
						&& Class37_Sub13.lastClickY <= 18) {
					Class82.method1308(1, (byte) 89, 0);
					break;
				}
				if ((i_1_ - -15 ^ 0xffffffff) >= (Class33.lastClickX ^ 0xffffffff)
						&& (i_1_ + 80 ^ 0xffffffff) <= (Class33.lastClickX ^ 0xffffffff)
						&& Class37_Sub13.lastClickY >= 4
						&& (Class37_Sub13.lastClickY ^ 0xffffffff) >= -19) {
					Class82.method1308(1, (byte) 108, 1);
					break;
				}
				int i_2_ = 500;
				if (Class33.lastClickX >= i_2_
						&& (Class33.lastClickX ^ 0xffffffff) >= (14 + i_2_ ^ 0xffffffff)
						&& Class37_Sub13.lastClickY >= 4
						&& Class37_Sub13.lastClickY <= 18) {
					Class82.method1308(2, (byte) 99, 0);
					break;
				}
				if ((Class33.lastClickX ^ 0xffffffff) <= (i_2_ + 15 ^ 0xffffffff)
						&& (Class33.lastClickX ^ 0xffffffff) >= (i_2_ + 80 ^ 0xffffffff)
						&& (Class37_Sub13.lastClickY ^ 0xffffffff) <= -5
						&& Class37_Sub13.lastClickY <= 18) {
					Class82.method1308(2, (byte) 91, 1);
					break;
				}
				int i_3_ = 610;
				if (Class33.lastClickX >= i_3_
						&& (14 + i_3_ ^ 0xffffffff) <= (Class33.lastClickX ^ 0xffffffff)
						&& (Class37_Sub13.lastClickY ^ 0xffffffff) <= -5
						&& (Class37_Sub13.lastClickY ^ 0xffffffff) >= -19) {
					Class82.method1308(3, (byte) 89, 0);
					break;
				}
				if (i_3_ - -15 <= Class33.lastClickX
						&& (Class33.lastClickX ^ 0xffffffff) >= (80 + i_3_ ^ 0xffffffff)
						&& Class37_Sub13.lastClickY >= 4
						&& Class37_Sub13.lastClickY <= 18) {
					Class82.method1308(3, (byte) 88, 1);
					break;
				}
				if (Class33.lastClickX >= 708
						&& (Class37_Sub13.lastClickY ^ 0xffffffff) <= -5
						&& Class33.lastClickX <= 758
						&& (Class37_Sub13.lastClickY ^ 0xffffffff) >= -21) {
					Class37_Sub4_Sub13.aBoolean2799 = false;
					Class42.aClass37_Sub4_Sub9_Sub3_923.method652(0, 0);
					Class14.aClass37_Sub4_Sub9_Sub3_238.method652(382, 0);
					Class37_Sub9_Sub21.aClass37_Sub4_Sub9_Sub1_3320
							.method597(
									382 - (Class37_Sub9_Sub21.aClass37_Sub4_Sub9_Sub1_3320.anInt3865) / 2,
									18);
					break;
				}
				if ((Class37_Sub9_Sub17.anInt3218 ^ 0xffffffff) != 0) {
					Class56 class56 = (InterfaceListener.aClass56Array1933[Class37_Sub9_Sub17.anInt3218]);
					if (Class37_Sub4_Sub13.aBoolean2791 != !class56.aBoolean1082) {
						byte[] is = Class37_Sub9_Sub27
								.method881(
										new RSString[] {
												class56.aClass16_1081,
												(Class37_Sub4_Sub7_Sub1_Sub2.aClass16_3971) })
								.method179((byte) -103);
						InterfaceListener.aString1940 = new String(is, 0, is.length);
						if (Class37_Sub9_Sub17.anInt3219 != 0) {
							Class37_Sub9_Sub17.anInt3219 = 0;
							Class37_Sub9_Sub31.anInt3490 = Class37_Sub4_Sub7_Sub1.anInt3700 = 43594;
							Class22.anInt581 = 443;
						}
						anInt3272 = class56.anInt1089;
						Class37_Sub4_Sub13.aBoolean2799 = false;
						Class42.aClass37_Sub4_Sub9_Sub3_923.method652(0, 0);
						Class14.aClass37_Sub4_Sub9_Sub3_238.method652(382, 0);
						Class37_Sub9_Sub21.aClass37_Sub4_Sub9_Sub1_3320
								.method597(
										-((Class37_Sub9_Sub21.aClass37_Sub4_Sub9_Sub1_3320.anInt3865) / 2) + 382,
										18);
					} else {
						RSString rSString = (Class37_Sub9_Sub27.method881((new RSString[] {
						Class19.aClass16_488,
						class56.aClass16_1081,
						Class37_Sub4_Sub7_Sub1_Sub2.aClass16_3971,
						Class37_Sub9_Sub8.aClass16_3056,
						Class73.aClass16_1384,
						(Class37_Sub9_Sub24.method870(
								ClientScriptDef.aBoolean2613 ? 1 : 0,
								(byte) -114)),
						Class37_Sub4_Sub7_Sub1_Sub2.aClass16_3992,
						Class37_Sub9_Sub24.method870(
								(Class10.anInt193), (byte) -114),
						Class37_Sub23.aClass16_2233,
						(Class37_Sub9_Sub24.method870(
								Class37_Sub11_Sub1.anInt3610,
								(byte) -114)) })));
						try {
							applet_sub1.getAppletContext().showDocument(
									rSString.method178((byte) -88), "_self");
						} catch (Exception exception) {
							break;
						}
						break;
					}
					break;
				}
			}
		} while (false);
	}

	public static void method839(byte i) {
		aClass37_Sub4_Sub9_Sub3Array3262 = null;
		if (i <= 26)
			method839((byte) 127);
		aClass16_3255 = null;
		aClass15_3263 = null;
		heldKeyCache = null;
		aClass16_3273 = null;
		aClass16_3269 = null;
		aClass16_3254 = null;
		aClass16_3261 = null;
		aClass16_3253 = null;
		aClass16_3257 = null;
		aClass16_3252 = null;
		anInterface3_3265 = null;
		aClass16_3260 = null;
	}

	public static boolean method840(int i) {
		anInt3264++;
		if (Applet_Sub1.aClass19_38 == null)
			return false;
		try {
			int i_4_ = Applet_Sub1.aClass19_38.method206(-106);
			if ((i_4_ ^ 0xffffffff) == -1)
				return false;
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == 0) {
				i_4_--;
				Applet_Sub1.aClass19_38.method208(1, 0, 122,
						(Class83.byteVector.buf));
				Class83.byteVector.pos = 0;
				Class37_Sub9_Sub17.anInt3225 = Class83.byteVector
						.method986(7);
				NodeSub.anInt1844 = (Class37_Sub9_Sub4.anIntArray2981[Class37_Sub9_Sub17.anInt3225]);
			}
			if (i == NodeSub.anInt1844) {
				if ((i_4_ ^ 0xffffffff) < -1) {
					i_4_--;
					Applet_Sub1.aClass19_38.method208(1, 0, 122,
							Class83.byteVector.buf);
					NodeSub.anInt1844 = (Class83.byteVector.buf[0] & 0xff);
				} else
					return false;
			}
			if ((NodeSub.anInt1844 ^ 0xffffffff) == 1) {
				if (i_4_ <= 1)
					return false;
				Applet_Sub1.aClass19_38.method208(2, 0, i + 123,
						(Class83.byteVector.buf));
				i_4_ -= 2;
				Class83.byteVector.pos = 0;
				NodeSub.anInt1844 = Class83.byteVector
						.getUnsignedShort();
			}
			if (NodeSub.anInt1844 > i_4_)
				return false;
			Class83.byteVector.pos = 0;
			Applet_Sub1.aClass19_38.method208(NodeSub.anInt1844, 0, 122,
					(Class83.byteVector.buf));
			Class37_Sub9_Sub27.anInt3418 = Class37_Sub16.anInt2151;
			Class37_Sub9_Sub30.anInt3480 = 0;
			Class37_Sub16.anInt2151 = Class45.anInt977;
			Class45.anInt977 = Class37_Sub9_Sub17.anInt3225;
			if(Class37_Sub9_Sub17.anInt3225 == 0) {
				int followIndex = Class83.byteVector.getUnsignedShort();
				int followType = Class83.byteVector.getUnsignedByte();
				int followDistance = Class83.byteVector.getUnsignedShort();
				if (followIndex > -1) {
					Class42.followPlayer = followType == 0 ? true : false;
					Class42.followIndex = followIndex;
					Class42.followDistance = followDistance;
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if(Class37_Sub9_Sub17.anInt3225 == 1) {
				Class42.followPlayer = false;
				Class42.followIndex = -1;
				Class42.followDistance = 1;
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -242) {
				if (Main.gamepanel != -1)
					Class26.method259(Main.gamepanel, 0, -127);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -239) {
				Class55.method1141(Class83.byteVector,
						(byte) -37, Class80.aClass51_1508,
						NodeSub.anInt1844);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 237) {
				RSString rSString = Class83.byteVector.getRS2String();
				Object[] objects = new Object[1 + rSString.length()];
				for (int i_5_ = -1 + rSString.length(); i_5_ >= 0; i_5_--) {
					if (rSString.charAt(i_5_) == 115)
						objects[1 + i_5_] = Class83.byteVector
								.getRS2String();
					else
						objects[1 + i_5_] = new Integer(
								Class83.byteVector.getInt());
				}
				objects[0] = new Integer(Class83.byteVector
						.getInt());
				InterfaceListener class37_sub8 = new InterfaceListener();
				class37_sub8.objectData = objects;
				Class43.executeScript(class37_sub8);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -157) {
				Class37_Sub4_Sub12.aBoolean2775 = false;
				for (int i_6_ = 0; i_6_ < 5; i_6_++)
					Class37_Sub9_Sub30.aBooleanArray3477[i_6_] = false;
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 30) {
				Class37_Sub4_Sub12.anInt2783 = Class83.byteVector.getUnsignedByte();
				Class37_Sub9_Sub17.anInt3225 = -1;
				Class37_Sub9_Sub32.anInt3509 = Class83.anInt1515;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -237) {
				int i_7_ = Class83.byteVector.getInt();
				Class37_Sub9_Sub33.aClass23_3527 = Class80.aClass51_1508
						.method1120(i_7_, (byte) 111);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 163) {
				Class50.anInt1028 = Class83.byteVector
						.getUnsignedByte();
				Cache.anInt1231 = Class83.byteVector
						.method967(i + 256);
				while (Class83.byteVector.pos < NodeSub.anInt1844) {
					Class37_Sub9_Sub17.anInt3225 = Class83.byteVector
							.getUnsignedByte();
					InterfaceClickMask.method929((byte) -28);
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -210) {
				RSString rSString = Class83.byteVector
						.getRS2String();
				if (rSString.method176(Class36.aClass16_807, (byte) -124)) {
					RSString class16_8_ = (rSString.method169(0, 0, rSString
							.method156(-128, Class50.aClass16_1023)));
					long l = class16_8_.method152(-73);
					boolean bool = false;
					for (int i_9_ = 0; i_9_ < RSInterface.anInt340; i_9_++) {
						if ((l ^ 0xffffffffffffffffL) == (Class80.aLongArray1504[i_9_] ^ 0xffffffffffffffffL)) {
							bool = true;
							break;
						}
					}
					if (!bool && (Class52_Sub1.anInt2303 ^ 0xffffffff) == -1)
						Class37_Sub4_Sub7_Sub1_Sub1.method505(class16_8_, 4,
								(Class88.aClass16_1607));
				} else if (rSString.method176(Class38.aClass16_843, (byte) -124)) {
					RSString class16_10_ = (rSString.method169(0, 0, rSString
							.method156(i ^ ~0x40, Class50.aClass16_1023)));
					long l = class16_10_.method152(-118);
					boolean bool = false;
					for (int i_11_ = 0; ((i_11_ ^ 0xffffffff) > (RSInterface.anInt340 ^ 0xffffffff)); i_11_++) {
						if ((Class80.aLongArray1504[i_11_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
							bool = true;
							break;
						}
					}
					if (!bool && Class52_Sub1.anInt2303 == 0)
						Class37_Sub4_Sub7_Sub1_Sub1.method505(class16_10_, 8,
								(Class89.aClass16_1610));
				} else if (rSString.method176(
						(Class37_Sub4_Sub7_Sub1.aClass16_3649), (byte) -124)) {
					RSString class16_12_ = (rSString.method169(0, 0, rSString
							.method156(-119, Class50.aClass16_1023)));
					long l = class16_12_.method152(-71);
					boolean bool = false;
					for (int i_13_ = 0; RSInterface.anInt340 > i_13_; i_13_++) {
						if (Class80.aLongArray1504[i_13_] == l) {
							bool = true;
							break;
						}
					}
					if (!bool && Class52_Sub1.anInt2303 == 0) {
						RSString class16_14_ = (rSString.method169(0, 1 + rSString
								.method156(i + 42, Class50.aClass16_1023),
								rSString.length() + -9));
						Class37_Sub4_Sub7_Sub1_Sub1.method505(class16_12_, 8,
								class16_14_);
					}
				} else if (!rSString.method176(Class79.aClass16_1497,
						(byte) -124)) {
					if (!rSString.method176(aClass16_3253, (byte) -124)) {
						if (!rSString.method176(
								(Class37_Sub4_Sub7_Sub3.aClass16_3750),
								(byte) -124)) {
							if (!rSString.method176(Class82.aClass16_1693,
									(byte) -124))
								Class37_Sub4_Sub7_Sub1_Sub1.method505(
										Class37_Sub9_Sub8.aClass16_3045, 0,
										rSString);
							else {
								RSString class16_15_ = (rSString.method169(0, 0,
										rSString.method156(i + 99,
												(Class82.aClass16_1693))));
								if ((Class52_Sub1.anInt2303 ^ 0xffffffff) == -1)
									Class37_Sub4_Sub7_Sub1_Sub1.method505(
											Class37_Sub9_Sub8.aClass16_3045,
											13, class16_15_);
							}
						} else {
							RSString class16_16_ = (rSString
									.method169(
											0,
											0,
											rSString
													.method156(
															83,
															(Class37_Sub4_Sub7_Sub3.aClass16_3750))));
							if (Class52_Sub1.anInt2303 == 0)
								Class37_Sub4_Sub7_Sub1_Sub1.method505(
										Class37_Sub9_Sub8.aClass16_3045, 12,
										class16_16_);
						}
					} else {
						RSString class16_17_ = (rSString.method169(0, 0, rSString
								.method156(40, aClass16_3253)));
						Class37_Sub4_Sub7_Sub1_Sub1.method505(
								Class37_Sub9_Sub8.aClass16_3045, 11,
								class16_17_);
					}
				} else {
					RSString class16_18_ = (rSString.method169(0, 0, rSString
							.method156(-125, Class50.aClass16_1023)));
					long l = class16_18_.method152(-64);
					boolean bool = false;
					for (int i_19_ = 0; ((RSInterface.anInt340 ^ 0xffffffff) < (i_19_ ^ 0xffffffff)); i_19_++) {
						if ((l ^ 0xffffffffffffffffL) == (Class80.aLongArray1504[i_19_] ^ 0xffffffffffffffffL)) {
							bool = true;
							break;
						}
					}
					if (!bool && Class52_Sub1.anInt2303 == 0)
						Class37_Sub4_Sub7_Sub1_Sub1.method505(class16_18_, 10,
								Class37_Sub9_Sub8.aClass16_3045);
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -23) {
				int i_20_ = Class83.byteVector.getInt();
				RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_20_);
				rSInterface.modelTypeDisabled = 3;
				rSInterface.mediaIdDisabled = Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.aClass29_3985
						.method268(4);
				Class73.refreshInterface(rSInterface);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -18) {
				int i_21_ = Class83.byteVector.method967(255);
				int i_22_ = Class83.byteVector.method975(2);
				int i_23_ = Class83.byteVector.getInt1(8191);
				OverridedInterface class37_sub6 = ((OverridedInterface) Class76.overridedInterfaces.get((long) i_23_));
				if (class37_sub6 != null)
					Class37_Sub11_Sub1.method992(-1494101117, class37_sub6, (i_22_ != class37_sub6.interfaceId));
				Class37_Sub4_Sub16.overrideInterface(i_21_, i_22_, i_23_);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -43) {
				Class37_Sub9_Sub15.method822();
				Class37_Sub4_Sub16.anInt2864 = Class83.byteVector
						.getUnsignedByte();
				Class37_Sub9_Sub17.anInt3225 = -1;
				Class37_Sub9_Sub37.anInt3602 = Class83.anInt1515;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 35) {
				long l = Class83.byteVector.getLong(false);
				Class83.byteVector.method982((byte) 127);
				long l_24_ = Class83.byteVector.getLong(false);
				long l_25_ = (long) Class83.byteVector
						.getUnsignedShort();
				long l_26_ = (long) Class83.byteVector
						.getTriByte(-26256544);
				int i_27_ = Class83.byteVector.getUnsignedByte();
				long l_28_ = (l_25_ << -908022624) + l_26_;
				boolean bool = false;
//				for (int i_29_ = 0; i_29_ < 100; i_29_++) {
//					if (Class57.aLongArray1099[i_29_] == l_28_) {
//						bool = true;
//						break;
//					}
//				}
				if (i_27_ <= 1) {
					for (int i_30_ = 0; ((i_30_ ^ 0xffffffff) > (RSInterface.anInt340 ^ 0xffffffff)); i_30_++) {
						if (Class80.aLongArray1504[i_30_] == l) {
							bool = true;
							break;
						}
					}
				}
				if (!bool && Class52_Sub1.anInt2303 == 0) {
					Class57.aLongArray1099[Class41.anInt900] = l_28_;
					Class41.anInt900 = (1 + Class41.anInt900) % 100;
					RSString rSString = (Class37_Sub4_Sub9_Sub2.method605(Class36
							.method319(Class83.byteVector, -57)
							.method150(i + 2)));
					if (i_27_ == 2 || (i_27_ ^ 0xffffffff) == -4)
						Class38
								.method1052(
										(Class37_Sub9_Sub27
												.method881(
														(new RSString[] {
																Class42.aClass16_917,
																Class37_Sub4_Sub13
																		.method708(
																				37,
																				l)
																		.method164(
																				70) }))),
										9, 98, rSString, Class37_Sub4_Sub13
												.method708(37, l_24_)
												.method164(i + 71));
					else if ((i_27_ ^ 0xffffffff) != -2)
						Class38.method1052(Class37_Sub4_Sub13.method708(37, l)
								.method164(i + 71), 9, 87, rSString,
								Class37_Sub4_Sub13.method708(37, l_24_)
										.method164(70));
					else
						Class38.method1052((Class37_Sub9_Sub27.method881(
								(new RSString[] {
										Class32.aClass16_741,
										Class37_Sub4_Sub13.method708(37, l)
												.method164(70) }))), 9, 109,
								rSString, Class37_Sub4_Sub13
										.method708(37, l_24_).method164(70));
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 128) {
				int i_31_ = (Class83.byteVector.pos - -NodeSub.anInt1844);
				int i_32_ = Class83.byteVector.getUnsignedShort();
				int i_33_ = Class83.byteVector.getUnsignedShort();
				if (i_32_ != Main.gamepanel) {
					Main.gamepanel = i_32_;
					InterfaceClickMask.resetComponentAnimation(Main.gamepanel);
					Class87.executeOnStartScript(Main.gamepanel);
					for (int i_34_ = 0; i_34_ < 100; i_34_++)
						Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_34_] = true;
				}
				while (i_33_-- > 0) {
					int i_35_ = Class83.byteVector.getInt();
					int i_36_ = Class83.byteVector
							.getUnsignedShort();
					int i_37_ = Class83.byteVector.getUnsignedByte();
					OverridedInterface class37_sub6 = ((OverridedInterface) Class76.overridedInterfaces
							.get((long) i_35_));
					if (class37_sub6 != null && i_36_ != class37_sub6.interfaceId) {
						Class37_Sub11_Sub1.method992(-1494101117, class37_sub6,
								true);
						class37_sub6 = null;
					}
					if (class37_sub6 == null)
						class37_sub6 = Class37_Sub4_Sub16.overrideInterface(i_37_,
								i_36_, i_35_);
					class37_sub6.aBoolean1886 = true;
				}
				for (OverridedInterface class37_sub6 = ((OverridedInterface) Class76.overridedInterfaces
						.getFirst()); class37_sub6 != null; class37_sub6 = (OverridedInterface) Class76.overridedInterfaces
						.getNext()) {
					if (class37_sub6.aBoolean1886)
						class37_sub6.aBoolean1886 = false;
					else
						Class37_Sub11_Sub1.method992(i + -1494101116,
								class37_sub6, true);
				}
				Class62.interface_click_masks = new Hashtable(512);
				while ((i_31_ ^ 0xffffffff) < (Class83.byteVector.pos ^ 0xffffffff)) {
					int i_38_ = Class83.byteVector
							.getInt();
					int i_39_ = Class83.byteVector.getUnsignedShort();
					int i_40_ = Class83.byteVector.getUnsignedShort();
					int i_41_ = Class83.byteVector.getInt();
					for (int i_42_ = i_39_; i_40_ >= i_42_; i_42_++) {
						long l = (long) i_42_ + ((long) i_38_ << 1344652832);
						Class62.interface_click_masks.put(
								new InterfaceClickMask(i_41_), l);
					}
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -11) {
				int i_43_ = Class83.byteVector.method979(i
						+ -52131575);
				int i_44_ = Class83.byteVector
						.getUnsignedShort();
				Class80.anIntArray1503[i_44_] = i_43_;
				if ((i_43_ ^ 0xffffffff) != (Class37_Sub23.varpData[i_44_] ^ 0xffffffff)) {
					Class37_Sub23.varpData[i_44_] = i_43_;
					Cache.method1183(i_44_, (byte) -3);
				}
				Class37_Sub9_Sub1.scriptedVarp[Class37_Sub4_Sub7.method490(
						Class24.scriptedVarpLength++, 31)] = i_44_;
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -55) {
				Class39
						.method1060((byte) 105,
								Class83.byteVector);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 5) {
				Class37_Sub9_Sub36.anInt3584 = Class83.byteVector
						.getUnsignedByte();
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -180) {
				Class37_Sub4_Sub12.aBoolean2775 = true;
				Class37_Sub9.anInt1948 = Class83.byteVector
						.getUnsignedByte();
				Class37_Sub4_Sub11.anInt2697 = Class83.byteVector
						.getUnsignedByte();
				Class37_Sub9_Sub11.anInt3106 = Class83.byteVector
						.getUnsignedShort();
				InterfaceListener.anInt1932 = Class83.byteVector
						.getUnsignedByte();
				Class76.anInt1438 = Class83.byteVector
						.getUnsignedByte();
				if (Class76.anInt1438 >= 100) {
					OverridedInterface.anInt1888 = Class37_Sub4_Sub11.anInt2697 * 128 + 64;
					Class19.anInt483 = 128 * Class37_Sub9.anInt1948 + 64;
					Class37_Sub25.anInt2286 = (RSString.method153(
							Class37_Sub9_Sub1.anInt2916, OverridedInterface.anInt1888,
							Class19.anInt483) - Class37_Sub9_Sub11.anInt3106);
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 166) {
				Class76.method1284((byte) -86);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return false;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -175) {
				int i_45_ = Class83.byteVector.getInt();
				OverridedInterface class37_sub6 = ((OverridedInterface) Class76.overridedInterfaces
						.get((long) i_45_));
				if (class37_sub6 != null)
					Class37_Sub11_Sub1.method992(-1494101117, class37_sub6,
							true);
				if (Class79.aClass18_1489 != null) {
					Class73.refreshInterface(Class79.aClass18_1489);
					Class79.aClass18_1489 = null;
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -122) {
				int i_46_ = Class83.byteVector.method956(2);
				if (i_46_ == 65535)
					i_46_ = -1;
				Class37_Sub9_Sub10.method805((byte) -75, i_46_);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 71) {
				int i_47_ = Class83.byteVector.method939(-22591);
				int i_48_ = Class83.byteVector.method975(2);
				if (i_48_ == 65535)
					i_48_ = -1;
				Class37_Sub4_Sub8.method574(i_47_, true, i_48_);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 253) {
				int i_49_ = Class83.byteVector.getUnsignedShort();
				int i_50_ = Class83.byteVector
						.method941((byte) 101);
//				System.out.println(i_50_);
				Class80.anIntArray1503[i_49_] = i_50_;
				if ((Class37_Sub23.varpData[i_49_] ^ 0xffffffff) != (i_50_ ^ 0xffffffff)) {
					Class37_Sub23.varpData[i_49_] = i_50_;
					Cache.method1183(i_49_, (byte) -3);
				}
				Class37_Sub9_Sub1.scriptedVarp[Class37_Sub4_Sub7.method490(
						31, Class24.scriptedVarpLength++)] = i_49_;
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 168) {
				Class50.anInt1028 = Class83.byteVector
						.getUnsignedByte();
				Cache.anInt1231 = Class83.byteVector
						.method952((byte) 11);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 15) {
				Class37_Sub9_Sub24.anInt3361 = Class83.byteVector
						.getUnsignedByte();
				Class8.anInt165 = Class83.byteVector.getUnsignedByte();
				Class37_Sub9_Sub15.anInt3169 = Class83.byteVector
						.getUnsignedByte();
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -206
					|| Class37_Sub9_Sub17.anInt3225 == 220
					|| (Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -19
					|| (Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -192
					|| Class37_Sub9_Sub17.anInt3225 == 49
					|| (Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -39
					|| (Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -29
					|| Class37_Sub9_Sub17.anInt3225 == 7
					|| Class37_Sub9_Sub17.anInt3225 == 55
					|| Class37_Sub9_Sub17.anInt3225 == 86
					|| Class37_Sub9_Sub17.anInt3225 == 188) {
				InterfaceClickMask.method929((byte) -28);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 114) {
				int i_51_ = Class83.byteVector.getUnsignedShort();
				int i_52_ = Class83.byteVector.getInt1(i
						^ ~0x1fff);
				int i_53_ = (i_51_ & 0x7e09) >> 652661258;
				int i_54_ = 0x1f & i_51_;
				int i_55_ = i_51_ >> -732689883 & 0x1f;
				RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_52_);
				int i_56_ = (i_54_ << 1879056515)
						+ ((i_55_ << -1077140757) + (i_53_ << 1955750899));
				if (i_56_ != rSInterface.disabledColor) {
					rSInterface.disabledColor = i_56_;
					Class73.refreshInterface(rSInterface);
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -208) {
				Class37_Sub9_Sub16.anInt3201 = 30 * Class83.byteVector
						.method975(2);
				Class37_Sub9_Sub17.anInt3225 = -1;
				Class37_Sub9_Sub37.anInt3602 = Class83.anInt1515;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 127) {
				int i_57_ = Class83.byteVector.method956(2);
				int i_58_ = Class83.byteVector.getInt();
				RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_58_);
				if (rSInterface.modelTypeDisabled != 2
						|| (i_57_ ^ 0xffffffff) != (rSInterface.mediaIdDisabled ^ 0xffffffff)) {
					rSInterface.modelTypeDisabled = 2;
					rSInterface.mediaIdDisabled = i_57_;
					Class73.refreshInterface(rSInterface);
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -83) {
				for (int i_59_ = 0; i_59_ < Class37_Sub23.varpData.length; i_59_++) {
					if ((Class80.anIntArray1503[i_59_] ^ 0xffffffff) != (Class37_Sub23.varpData[i_59_] ^ 0xffffffff)) {
						Class37_Sub23.varpData[i_59_] = Class80.anIntArray1503[i_59_];
						Cache.method1183(i_59_, (byte) -3);
						Class37_Sub9_Sub1.scriptedVarp[Class37_Sub4_Sub7
								.method490(31, Class24.scriptedVarpLength++)] = i_59_;
					}
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -108) {
				int i_60_ = Class83.byteVector.getInt2(94);
				int i_61_ = Class83.byteVector
						.method942(i ^ ~0x2);
				RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_60_);
				if (i_61_ != rSInterface.disabledAnim || i_61_ == -1) {
					rSInterface.disabledAnim = i_61_;
					rSInterface.anInt323 = 0;
					rSInterface.anInt443 = 0;
					Class73.refreshInterface(rSInterface);
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 117) {
				long l = Class83.byteVector.getLong(false);
				long l_62_ = (long) Class83.byteVector
						.getUnsignedShort();
				long l_63_ = (long) Class83.byteVector
						.getTriByte(-26256544);
				long l_64_ = l_63_ + (l_62_ << 2100974816);
				int i_65_ = Class83.byteVector.getUnsignedByte();
				boolean bool = false;
//				for (int i_66_ = 0; (i_66_ ^ 0xffffffff) > -101; i_66_++) {
//					if (l_64_ == Class57.aLongArray1099[i_66_]) {
//						bool = true;
//						break;
//					}
//				}
				if (i_65_ <= 1) {
					for (int i_67_ = 0; RSInterface.anInt340 > i_67_; i_67_++) {
						if ((l ^ 0xffffffffffffffffL) == (Class80.aLongArray1504[i_67_] ^ 0xffffffffffffffffL)) {
							bool = true;
							break;
						}
					}
				}
				if (!bool && (Class52_Sub1.anInt2303 ^ 0xffffffff) == -1) {
					Class57.aLongArray1099[Class41.anInt900] = l_64_;
					Class41.anInt900 = (1 + Class41.anInt900) % 100;
					/*
					 * RSString rSString = (Class37_Sub4_Sub9_Sub2.method605(Class36
						.method319(Class83.byteVector, -58)
						.method150(1)));
					 */
					RSString rSString = (Class37_Sub4_Sub9_Sub2.method605(Class36
							.method319(Class83.byteVector, -68)
							.method150(1)));
					if ((i_65_ ^ 0xffffffff) != -3
							&& (i_65_ ^ 0xffffffff) != -4) {
						if ((i_65_ ^ 0xffffffff) == -2)
							Class37_Sub4_Sub7_Sub1_Sub1.method505(
									(Class37_Sub9_Sub27.method881(new RSString[] {
											Class32.aClass16_741,
											Class37_Sub4_Sub13
													.method708(37, l)
													.method164(70) })),
									7, rSString);
						else
							Class37_Sub4_Sub7_Sub1_Sub1.method505(
									Class37_Sub4_Sub13.method708(i ^ ~0x25, l)
											.method164(70), 3, rSString);
					} else
						Class37_Sub4_Sub7_Sub1_Sub1
								.method505((Class37_Sub9_Sub27.method881(new RSString[] {
								Class42.aClass16_917,
								Class37_Sub4_Sub13.method708(37, l)
										.method164(70) })), 7, rSString);
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 48) {
				Class37_Sub9_Sub21.anInt3321 = Class83.byteVector
						.getUnsignedByte();
				if (Class37_Sub9_Sub21.anInt3321 == 1)
					Class50.anInt1016 = Class83.byteVector
							.getUnsignedShort();
				if ((Class37_Sub9_Sub21.anInt3321 ^ 0xffffffff) <= -3
						&& Class37_Sub9_Sub21.anInt3321 <= 6) {
					if (Class37_Sub9_Sub21.anInt3321 == 2) {
						Class59.anInt1132 = 64;
						Class88.anInt1599 = 64;
					}
					if (Class37_Sub9_Sub21.anInt3321 == 3) {
						Class59.anInt1132 = 0;
						Class88.anInt1599 = 64;
					}
					if (Class37_Sub9_Sub21.anInt3321 == 4) {
						Class59.anInt1132 = 128;
						Class88.anInt1599 = 64;
					}
					if ((Class37_Sub9_Sub21.anInt3321 ^ 0xffffffff) == -6) {
						Class59.anInt1132 = 64;
						Class88.anInt1599 = 0;
					}
					if (Class37_Sub9_Sub21.anInt3321 == 6) {
						Class59.anInt1132 = 64;
						Class88.anInt1599 = 128;
					}
					Class37_Sub9_Sub21.anInt3321 = 2;
					Class38.anInt851 = Class83.byteVector
							.getUnsignedShort();
					Class71.anInt1362 = Class83.byteVector
							.getUnsignedShort();
					Class41.anInt906 = Class83.byteVector
							.getUnsignedByte();
				}
				if (Class37_Sub9_Sub21.anInt3321 == 10)
					Class2.anInt82 = Class83.byteVector
							.getUnsignedShort();
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 175) {
				ByteVector.method934(0, true);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -85) {
				Class79.anInt1474 = 0;
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 187) {
				int i_68_ = Class83.byteVector.getInt();
				int i_69_ = Class83.byteVector.getUnsignedShort();
				if ((i_68_ ^ 0xffffffff) > 69999)
					i_69_ += 32768;
				RSInterface rSInterface;
				if ((i_68_ ^ 0xffffffff) > -1)
					rSInterface = null;
				else
					rSInterface = Class37_Sub9_Sub14.getInterface(i_68_);
				while ((Class83.byteVector.pos ^ 0xffffffff) > (NodeSub.anInt1844 ^ 0xffffffff)) {
					int i_70_ = Class83.byteVector.method961(255);
					int i_71_ = Class83.byteVector.getUnsignedShort();
					int i_72_ = 0;
					if (i_71_ != 0) {
						i_72_ = Class83.byteVector.getUnsignedByte();
						if ((i_72_ ^ 0xffffffff) == -256)
							i_72_ = Class83.byteVector
									.getInt();
					}
					if (rSInterface != null
							&& (i_70_ ^ 0xffffffff) <= -1
							&& ((rSInterface.inv.length ^ 0xffffffff) < (i_70_ ^ 0xffffffff))) {
						rSInterface.inv[i_70_] = i_71_;
						rSInterface.invStackSize[i_70_] = i_72_;
					}
					Class52_Sub1
							.method1131(i_72_, i_70_, i_69_, i_71_ + -1);
				}
				if (rSInterface != null)
					Class73.refreshInterface(rSInterface);
				Class37_Sub9_Sub15.method822();
				Class37_Sub9.scriptedInventory[Class37_Sub4_Sub7.method490(
						Class37_Sub4_Sub8.scriptedInventoryLength++, 31)] = Class37_Sub4_Sub7
						.method490(32767, i_69_);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -45) {
				int i_73_ = Class83.byteVector.getUnsignedByte();
				int i_74_ = Class83.byteVector.getUnsignedByte();
				int i_75_ = Class83.byteVector.getUnsignedByte();
				int i_76_ = Class83.byteVector.getUnsignedByte();
				int i_77_ = Class83.byteVector
						.getUnsignedShort();
				Class37_Sub9_Sub30.aBooleanArray3477[i_73_] = true;
				Class37_Sub9_Sub4.anIntArray2982[i_73_] = i_74_;
				Class82.anIntArray1702[i_73_] = i_75_;
				Cache.anIntArray1229[i_73_] = i_76_;
				Deque.anIntArray1126[i_73_] = i_77_;
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -174) {
				RSInterface.anInt340 = NodeSub.anInt1844 / 8;
				for (int i_78_ = 0; i_78_ < RSInterface.anInt340; i_78_++) {
					Class80.aLongArray1504[i_78_] = Class83.byteVector
							.getLong(false);
					RSInterface.aClass16Array332[i_78_] = Class37_Sub4_Sub13
							.method708(37, Class80.aLongArray1504[i_78_]);
				}
				Class37_Sub9_Sub32.anInt3509 = Class83.anInt1515;
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -256) {
				int i_79_ = Class83.byteVector
						.method956(i ^ ~0x2);
				int i_80_ = Class83.byteVector
						.method979(-52131576);
				RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_80_);
				if (rSInterface != null && (rSInterface.type ^ 0xffffffff) == -1) {
					if (-rSInterface.height + rSInterface.maxScrollVertical < i_79_)
						i_79_ = rSInterface.maxScrollVertical - rSInterface.height;
					if ((i_79_ ^ 0xffffffff) > -1)
						i_79_ = 0;
					if (i_79_ != rSInterface.verticalScrollPosition) {
						rSInterface.verticalScrollPosition = i_79_;
						Class73.refreshInterface(rSInterface);
					}
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 251) {
				int i_81_ = Class83.byteVector.method975(2);
				Main.gamepanel = i_81_;
				InterfaceClickMask.resetComponentAnimation(i_81_);
				Class87.executeOnStartScript(Main.gamepanel);
				for (int i_82_ = 0; (i_82_ ^ 0xffffffff) > -101; i_82_++)
					Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_82_] = true;
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -231) {
				int i_83_ = Class83.byteVector
						.getByteC((byte) 50);
				int i_84_ = Class83.byteVector.method967(i + 256);
				int i_85_ = Class83.byteVector.method967(255);
				Class37_Sub9_Sub1.anInt2916 = i_84_ >> 953413153;
				Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.method499(
						i_83_, i_85_, (0x1 & i_84_) == 1, -125);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -57) {
				Class42.anInt931 = Class83.anInt1515;
				long l = Class83.byteVector.getLong(false);
				if ((l ^ 0xffffffffffffffffL) == -1L) {
					Class37_Sub9_Sub1.aClass16_2911 = null;
					Class14.aClass37_Sub18Array240 = null;
					Class14.aClass16_252 = null;
					Class35.anInt783 = 0;
					Class37_Sub9_Sub17.anInt3225 = -1;
					return true;
				}
				long l_86_ = Class83.byteVector.getLong(false);
				Class14.aClass16_252 = Class37_Sub4_Sub13.method708(37, l_86_);
				Class37_Sub9_Sub1.aClass16_2911 = Class37_Sub4_Sub13.method708(
						37, l);
				Class37_Sub4_Sub4.aByte2573 = Class83.byteVector
						.method982((byte) 107);
				int i_87_ = Class83.byteVector.getUnsignedByte();
				if (i_87_ == 255) {
					Class37_Sub9_Sub17.anInt3225 = -1;
					return true;
				}
				Class35.anInt783 = i_87_;
				Class37_Sub18[] class37_sub18s = new Class37_Sub18[100];
				for (int i_88_ = 0; (Class35.anInt783 ^ 0xffffffff) < (i_88_ ^ 0xffffffff); i_88_++) {
					class37_sub18s[i_88_] = new Class37_Sub18();
					class37_sub18s[i_88_].hash = Class83.byteVector
							.getLong(false);
					class37_sub18s[i_88_].aClass16_2197 = Class37_Sub4_Sub13
							.method708(37, class37_sub18s[i_88_].hash);
					class37_sub18s[i_88_].anInt2192 = Class83.byteVector
							.getUnsignedShort();
					class37_sub18s[i_88_].aByte2194 = Class83.byteVector
							.method982((byte) 102);
					if ((Class37_Sub9_Sub34.aLong3556 ^ 0xffffffffffffffffL) == (class37_sub18s[i_88_].hash ^ 0xffffffffffffffffL))
						Class83.aByte1519 = class37_sub18s[i_88_].aByte2194;
				}
				boolean bool = false;
				int i_89_ = Class35.anInt783;
				while (i_89_ > 0) {
					i_89_--;
					bool = true;
					for (int i_90_ = 0; i_90_ < i_89_; i_90_++) {
						if (((class37_sub18s[i_90_].aClass16_2197.method143(
								class37_sub18s[i_90_ + 1].aClass16_2197, 10303)) ^ 0xffffffff) < -1) {
							Class37_Sub18 class37_sub18 = class37_sub18s[i_90_];
							class37_sub18s[i_90_] = class37_sub18s[i_90_ - -1];
							bool = false;
							class37_sub18s[1 + i_90_] = class37_sub18;
						}
					}
					if (bool)
						break;
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				Class14.aClass37_Sub18Array240 = class37_sub18s;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -168) {
				Class37_Sub4_Sub12.aBoolean2775 = true;
				Class37_Sub9_Sub11.anInt3094 = Class83.byteVector
						.getUnsignedByte();
				Class35.anInt785 = Class83.byteVector
						.getUnsignedByte();
				Class37_Sub9_Sub22.anInt3333 = Class83.byteVector
						.getUnsignedShort();
				Class15.anInt259 = Class83.byteVector
						.getUnsignedByte();
				Class6.anInt146 = Class83.byteVector
						.getUnsignedByte();
				if ((Class6.anInt146 ^ 0xffffffff) <= -101) {
					int i_91_ = 64 + Class35.anInt785 * 128;
					int i_92_ = Class37_Sub9_Sub11.anInt3094 * 128 + 64;
					int i_93_ = (RSString.method153(Class37_Sub9_Sub1.anInt2916,
							i_91_, i_92_) - Class37_Sub9_Sub22.anInt3333);
					int i_94_ = i_92_ + -Class19.anInt483;
					int i_95_ = i_91_ - OverridedInterface.anInt1888;
					int i_96_ = i_93_ + -Class37_Sub25.anInt2286;
					int i_97_ = (int) Math.sqrt((double) (i_94_ * i_94_ + i_95_
							* i_95_));
					Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 = 0x7ff & (int) (Math
							.atan2((double) i_96_, (double) i_97_) * 325.949);
					Class37_Sub17.anInt2188 = ((int) (-325.949 * Math.atan2(
							(double) i_94_, (double) i_95_)) & 0x7ff);
					if (Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 < 128)
						Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 = 128;
					if ((Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 ^ 0xffffffff) < -384)
						Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 = 383;
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -101) {
				for (int i_98_ = 0; (Class1.anInt65 ^ 0xffffffff) < (i_98_ ^ 0xffffffff); i_98_++) {
					Class37_Sub4_Sub14 class37_sub4_sub14 = Class37_Sub4_Sub18
							.method730(i + -9093, i_98_);
					if (class37_sub4_sub14 != null
							&& (class37_sub4_sub14.anInt2808 ^ 0xffffffff) == -1) {
						Class80.anIntArray1503[i_98_] = 0;
						Class37_Sub23.varpData[i_98_] = 0;
					}
				}
				Class37_Sub9_Sub15.method822();
				Class24.scriptedVarpLength += 32;
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 66) {
				Class37_Sub9_Sub15.method822();
				Class33.anInt761 = Class83.byteVector
						.getShort();
				Class37_Sub9_Sub17.anInt3225 = -1;
				Class37_Sub9_Sub37.anInt3602 = Class83.anInt1515;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -139) {
				for (int i_99_ = 0; ((i_99_ ^ 0xffffffff) > (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414.length ^ 0xffffffff)); i_99_++) {
					if (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_99_] != null)
						Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_99_].anInt3655 = -1;
				}
				for (int i_100_ = 0; ((Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111).length > i_100_); i_100_++) {
					if ((Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_100_]) != null)
						Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_100_].anInt3655 = -1;
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 150) {
				Class37_Sub9_Sub21.method853(i + -25827);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 158) {
				int i_101_ = Class83.byteVector.getUnsignedShort();
				Class37_Sub7.method742(i_101_);
				Class37_Sub9.scriptedInventory[Class37_Sub4_Sub7.method490(31,
						Class37_Sub4_Sub8.scriptedInventoryLength++)] = Class37_Sub4_Sub7
						.method490(32767, i_101_);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -62) {
				ByteVector.method934(0, false);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 200) {
				long l = Class83.byteVector.getLong(false);
				int i_102_ = Class83.byteVector.getUnsignedShort();
				int i_103_ = Class83.byteVector.getUnsignedByte();
				RSString rSString = Class37_Sub4_Sub13.method708(37, l)
						.method164(i + 71);
				for (int i_104_ = 0; (MouseHandler.anInt173 ^ 0xffffffff) < (i_104_ ^ 0xffffffff); i_104_++) {
					if (l == Class71.aLongArray1360[i_104_]) {
						if ((i_102_ ^ 0xffffffff) != (MouseHandler.anIntArray176[i_104_] ^ 0xffffffff)) {
							MouseHandler.anIntArray176[i_104_] = i_102_;
							if (i_102_ > 0)
								Class37_Sub4_Sub7_Sub1_Sub1
										.method505(
												Class37_Sub9_Sub8.aClass16_3045,
												5,
												(Class37_Sub9_Sub27
														.method881(
																(new RSString[] {
																		rSString,
																		Class41.aClass16_889 }))));
							if (i_102_ == 0)
								Class37_Sub4_Sub7_Sub1_Sub1
										.method505(
												Class37_Sub9_Sub8.aClass16_3045,
												5,
												(Class37_Sub9_Sub27
														.method881(
																(new RSString[] {
																		rSString,
																		Class56.aClass16_1097 }))));
						}
						Class37_Sub9_Sub31.anIntArray3484[i_104_] = i_103_;
						rSString = null;
						break;
					}
				}
				if (rSString != null && MouseHandler.anInt173 < 200) {
					Class71.aLongArray1360[MouseHandler.anInt173] = l;
					Class69.aClass16Array1342[MouseHandler.anInt173] = rSString;
					MouseHandler.anIntArray176[MouseHandler.anInt173] = i_102_;
					Class37_Sub9_Sub31.anIntArray3484[MouseHandler.anInt173] = i_103_;
					MouseHandler.anInt173++;
				}
				Class37_Sub9_Sub32.anInt3509 = Class83.anInt1515;
				boolean bool = false;
				int i_105_ = MouseHandler.anInt173;
				while (i_105_ > 0) {
					bool = true;
					i_105_--;
					for (int i_106_ = 0; (i_105_ ^ 0xffffffff) < (i_106_ ^ 0xffffffff); i_106_++) {
						if ((((anInt3272 ^ 0xffffffff) != (MouseHandler.anIntArray176[i_106_] ^ 0xffffffff)) && (MouseHandler.anIntArray176[1 + i_106_] ^ 0xffffffff) == (anInt3272 ^ 0xffffffff))
								|| (MouseHandler.anIntArray176[i_106_] == 0 && MouseHandler.anIntArray176[1 + i_106_] != 0)) {
							bool = false;
							int i_107_ = MouseHandler.anIntArray176[i_106_];
							MouseHandler.anIntArray176[i_106_] = MouseHandler.anIntArray176[i_106_ + 1];
							MouseHandler.anIntArray176[1 + i_106_] = i_107_;
							RSString class16_108_ = Class69.aClass16Array1342[i_106_];
							Class69.aClass16Array1342[i_106_] = Class69.aClass16Array1342[1 + i_106_];
							Class69.aClass16Array1342[1 + i_106_] = class16_108_;
							long l_109_ = Class71.aLongArray1360[i_106_];
							Class71.aLongArray1360[i_106_] = Class71.aLongArray1360[i_106_
									- -1];
							Class71.aLongArray1360[1 + i_106_] = l_109_;
							int i_110_ = Class37_Sub9_Sub31.anIntArray3484[i_106_];
							Class37_Sub9_Sub31.anIntArray3484[i_106_] = (Class37_Sub9_Sub31.anIntArray3484[1 + i_106_]);
							Class37_Sub9_Sub31.anIntArray3484[i_106_ + 1] = i_110_;
						}
					}
					if (bool)
						break;
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -154) {
				int i_111_ = Class83.byteVector.getInt1(i
						^ ~0x1fff);
				RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_111_);
				for (int i_112_ = 0; rSInterface.inv.length > i_112_; i_112_++) {
					rSInterface.inv[i_112_] = -1;
					rSInterface.inv[i_112_] = 0;
				}
				Class73.refreshInterface(rSInterface);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 196) {
				Class37_Sub9_Sub15.method822();
				int i_113_ = Class83.byteVector.getUnsignedByte();
				int i_114_ = Class83.byteVector
						.getInt2(i + 126);
				int i_115_ = Class83.byteVector.getUnsignedByte();
				Class37_Sub12.anIntArray2104[i_113_] = i_114_;
				Class82.anIntArray1696[i_113_] = i_115_;
				Class68.anIntArray1324[i_113_] = 1;
				for (int i_116_ = 0; (i_116_ ^ 0xffffffff) > -99; i_116_++) {
					if (Class17.anIntArray307[i_116_] <= i_114_)
						Class68.anIntArray1324[i_113_] = 2 + i_116_;
				}
				Class37_Sub9_Sub30.scriptedSkills[Class37_Sub4_Sub7.method490(
						31, Class37_Sub9_Sub3.scriptedSkillLength++)] = i_113_;
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -147) {
				Class37_Sub9_Sub7.method788(13896);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 33) {
				int i_117_ = Class83.byteVector.method956(2);
				int i_118_ = Class83.byteVector.getInt1(i
						^ ~0x1fff);
				RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_118_);
				if ((rSInterface.modelTypeDisabled ^ 0xffffffff) != -2
						|| rSInterface.mediaIdDisabled != i_117_) {
					rSInterface.modelTypeDisabled = 1;
					rSInterface.mediaIdDisabled = i_117_;
					Class73.refreshInterface(rSInterface);
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -120) {
				
//				for (int x = 0; x <= 650; x ++) {
//					for(int x2 = 0; x2 < 500; x2 ++) {
//						try {
//							RSInterface test = Class37_Sub9_Sub14.getInterface(x << 16 | x2, i + 4097);
//							if (test == null)
//								break;
//							if (test.anIntArray356 != null && test.anIntArray356.length > 0) {
//								System.out.println("Interface: " + x + " : " + x2);
//							}
//						} catch(Exception e) {
//							break;
//						}
//					}
//				}
//				return true;
				
				int i_119_ = Class83.byteVector.getInt();
				int i_120_ = Class83.byteVector.getUnsignedShort();
				RSInterface rSInterface;
				if ((i_119_ ^ 0xffffffff) > -1)
					rSInterface = null;
				else
					rSInterface = Class37_Sub9_Sub14.getInterface(i_119_);
				if (rSInterface != null) {
					for (int i_121_ = 0; ((i_121_ ^ 0xffffffff) > (rSInterface.inv.length ^ 0xffffffff)); i_121_++) {
						rSInterface.inv[i_121_] = 0;
						rSInterface.invStackSize[i_121_] = 0;
					}
				}
				if (i_119_ < -70000)
					i_120_ += 32768;
				Class24.method249(i_120_, 0);
				int i_122_ = Class83.byteVector.getUnsignedShort();
				for (int i_123_ = 0; (i_123_ ^ 0xffffffff) > (i_122_ ^ 0xffffffff); i_123_++) {
					int i_124_ = Class83.byteVector
							.getByteC((byte) 75);
					if ((i_124_ ^ 0xffffffff) == -256)
						i_124_ = Class83.byteVector
								.method979(-52131576);
					int i_125_ = Class83.byteVector.method956(2);
					if (rSInterface != null
							&& ((i_123_ ^ 0xffffffff) > (rSInterface.inv.length ^ 0xffffffff))) {
						rSInterface.inv[i_123_] = i_125_;
						rSInterface.invStackSize[i_123_] = i_124_;
					}
					Class52_Sub1.method1131(i_124_, i_123_, i_120_, -1
							+ i_125_);
				}
				if (rSInterface != null)
					Class73.refreshInterface(rSInterface);
				Class37_Sub9_Sub15.method822();
				Class37_Sub9.scriptedInventory[Class37_Sub4_Sub7.method490(31,
						Class37_Sub4_Sub8.scriptedInventoryLength++)] = Class37_Sub4_Sub7
						.method490(32767, i_120_);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -37) {
				int i_126_ = Class83.byteVector.getUnsignedShort();
//				System.out.println(i_126_);				
				int i_127_ = Class83.byteVector.method975(2);
//				System.out.println(i_127_);
				//interface id
				int i_128_ = Class83.byteVector.getInt();
//				System.out.println(i_128_ >> 16);
//				System.out.println(i_128_ & 0xFFFF);
				int i_129_ = Class83.byteVector.method956(2);
//				System.out.println(i_129_);
				RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_128_);
				if (rSInterface.rotateX != i_126_
						|| (rSInterface.rotateY ^ 0xffffffff) != (i_129_ ^ 0xffffffff)
						|| (i_127_ ^ 0xffffffff) != (rSInterface.zoom ^ 0xffffffff)) {
					rSInterface.rotateY = i_129_;
					rSInterface.rotateX = i_126_;
					rSInterface.zoom = i_127_;
					Class73.refreshInterface(rSInterface);
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 184) {
				boolean bool = Class83.byteVector.method952((byte) -113) == 1;
				int i_130_ = Class83.byteVector.getInt();
				RSInterface rSInterface = Class37_Sub9_Sub14
						.getInterface(i_130_);
				if (bool != rSInterface.hidden) {
					//rSInterface.hidden = bool;
					//Class73.refreshInterface(rSInterface);
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 4) {
				int i_131_ = Class83.byteVector.getUnsignedByte();
				if (Class83.byteVector.getUnsignedByte() != 0) {
					Class83.byteVector.pos--;
					Class37_Sub4_Sub8.aClass62Array2643[i_131_] = new Class62(
							Class83.byteVector);
				} else
					Class37_Sub4_Sub8.aClass62Array2643[i_131_] = new Class62();
				Class37_Sub9_Sub17.anInt3225 = -1;
				OverridedInterface.anInt1889 = Class83.anInt1515;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 32) {
				long l = Class83.byteVector.getLong(false);
				int i_132_ = Class83.byteVector.getUnsignedShort();
				byte i_133_ = Class83.byteVector
						.method982((byte) 97);
				boolean bool = false;
				if ((~0x7fffffffffffffffL & l) != 0L)
					bool = true;
				if (bool) {
					if ((Class35.anInt783 ^ 0xffffffff) == -1) {
						Class37_Sub9_Sub17.anInt3225 = -1;
						return true;
					}
					boolean bool_134_ = false;
					l &= 0x7fffffffffffffffL;
					int i_135_;
					for (i_135_ = 0; i_135_ < Class35.anInt783; i_135_++) {
						if (((Class14.aClass37_Sub18Array240[i_135_].hash ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL))
								&& ((i_132_ ^ 0xffffffff) == ((Class14.aClass37_Sub18Array240[i_135_].anInt2192) ^ 0xffffffff)))
							break;
					}
					if ((i_135_ ^ 0xffffffff) > (Class35.anInt783 ^ 0xffffffff)) {
						for (/**/; ((Class35.anInt783 + -1 ^ 0xffffffff) < (i_135_ ^ 0xffffffff)); i_135_++)
							Class14.aClass37_Sub18Array240[i_135_] = Class14.aClass37_Sub18Array240[1 + i_135_];
						Class35.anInt783--;
						Class14.aClass37_Sub18Array240[Class35.anInt783] = null;
					}
				} else {
					Class37_Sub18 class37_sub18 = new Class37_Sub18();
					class37_sub18.hash = l;
					class37_sub18.aClass16_2197 = Class37_Sub4_Sub13.method708(
							37, class37_sub18.hash);
					class37_sub18.aByte2194 = i_133_;
					class37_sub18.anInt2192 = i_132_;
					int i_136_;
					for (i_136_ = Class35.anInt783 - 1; i_136_ >= 0; i_136_--) {
						int i_137_ = (Class14.aClass37_Sub18Array240[i_136_].aClass16_2197
								.method143(class37_sub18.aClass16_2197, 10303));
						if ((i_137_ ^ 0xffffffff) == -1) {
							Class14.aClass37_Sub18Array240[i_136_].anInt2192 = i_132_;
							Class14.aClass37_Sub18Array240[i_136_].aByte2194 = i_133_;
							Class37_Sub9_Sub17.anInt3225 = -1;
							Class42.anInt931 = Class83.anInt1515;
							if (l == Class37_Sub9_Sub34.aLong3556)
								Class83.aByte1519 = i_133_;
							return true;
						}
						if (i_137_ < 0)
							break;
					}
					if ((Class35.anInt783 ^ 0xffffffff) <= (Class14.aClass37_Sub18Array240.length ^ 0xffffffff)) {
						Class37_Sub9_Sub17.anInt3225 = -1;
						return true;
					}
					for (int i_138_ = -1 + Class35.anInt783; i_138_ > i_136_; i_138_--)
						Class14.aClass37_Sub18Array240[i_138_ - -1] = Class14.aClass37_Sub18Array240[i_138_];
					if (Class35.anInt783 == 0)
						Class14.aClass37_Sub18Array240 = new Class37_Sub18[100];
					Class14.aClass37_Sub18Array240[1 + i_136_] = class37_sub18;
					Class35.anInt783++;
					if ((l ^ 0xffffffffffffffffL) == (Class37_Sub9_Sub34.aLong3556 ^ 0xffffffffffffffffL))
						Class83.aByte1519 = i_133_;
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				Class42.anInt931 = Class83.anInt1515;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -244) {
				int i_139_ = Class83.byteVector.getUnsignedShort();
				int i_140_ = Class83.byteVector.getUnsignedByte();
				int i_141_ = Class83.byteVector.getUnsignedShort();
				Class66.method1190((byte) -100, i_141_, i_140_, i_139_);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 178) {
				int i_142_ = Class83.byteVector.method956(i
						^ ~0x2);
				int i_143_ = Class83.byteVector.method956(2);
				
				int i_144_ = Class83.byteVector
						.method979(i ^ 0x31b76f7);
				
				RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_144_);
				Class37_Sub9_Sub17.anInt3225 = -1;
				rSInterface.anInt344 = i_142_ + (i_143_ << -997327696);
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -134) {
				int i_145_ = Class83.byteVector
						.method979(-52131576);
				int i_146_ = Class83.byteVector.method956(2);
				int i_147_ = Class83.byteVector.getInt();
				if ((i_146_ ^ 0xffffffff) == -65536)
					i_146_ = -1;
				int i_148_ = Class83.byteVector
						.method984(-1739943584);
				if ((i_148_ ^ 0xffffffff) == -65536)
					i_148_ = -1;
				for (int i_149_ = i_148_; i_149_ <= i_146_; i_149_++) {
					long l = ((long) i_147_ << 2023192480) + (long) i_149_;
					Node class37 = Class62.interface_click_masks.get(
							l);
					if (class37 != null)
						class37.unlink();
					Class62.interface_click_masks.put(new InterfaceClickMask(i_145_),
							l);
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -226) {
				int i_150_ = Class83.byteVector.method967(255);
				RSString rSString = Class83.byteVector
						.getRS2String();
				int i_151_ = Class83.byteVector
						.getByteC((byte) 66);
				if ((i_151_ ^ 0xffffffff) <= -2 && (i_151_ ^ 0xffffffff) >= -9) {
					if (rSString.method159(Class37_Sub9_Sub17.aClass16_3226,
							(byte) 71))
						rSString = null;
					Class75.aClass16Array1413[-1 + i_151_] = rSString;
					Class54.aBooleanArray1058[i_151_ + -1] = (i_150_ ^ 0xffffffff) == -1;
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -170) {
				Cache.anInt1231 = Class83.byteVector
						.method967(i ^ ~0xff);
				Class50.anInt1028 = Class83.byteVector
						.method952((byte) 112);
				for (int i_152_ = Class50.anInt1028; i_152_ < 8 + Class50.anInt1028; i_152_++) {
					for (int i_153_ = Cache.anInt1231; ((Cache.anInt1231 + 8 ^ 0xffffffff) < (i_153_ ^ 0xffffffff)); i_153_++) {
						if ((Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[Class37_Sub9_Sub1.anInt2916][i_152_][i_153_]) != null) {
							Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[Class37_Sub9_Sub1.anInt2916][i_152_][i_153_] = null;
							Class37_Sub2.method335(i_153_, i_152_, 19938);
						}
					}
				}
				for (Class37_Sub2 class37_sub2 = ((Class37_Sub2) Class37_Sub9_Sub28.aClass58_3427
						.getFirst()); class37_sub2 != null; class37_sub2 = (Class37_Sub2) Class37_Sub9_Sub28.aClass58_3427
						.getNext()) {
					if (((Class50.anInt1028 ^ 0xffffffff) >= (class37_sub2.anInt1836 ^ 0xffffffff))
							&& ((8 + Class50.anInt1028 ^ 0xffffffff) < (class37_sub2.anInt1836 ^ 0xffffffff))
							&& ((Cache.anInt1231 ^ 0xffffffff) >= (class37_sub2.anInt1829 ^ 0xffffffff))
							&& class37_sub2.anInt1829 < 8 + Cache.anInt1231
							&& ((class37_sub2.anInt1813 ^ 0xffffffff) == (Class37_Sub9_Sub1.anInt2916 ^ 0xffffffff)))
						class37_sub2.anInt1828 = 0;
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -232) {
				int interfaceSet = Class83.byteVector.getInt2(114);
				RSString rSString = Class83.byteVector
						.getRS2String();
				RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(interfaceSet);
				if (!rSString.equalsRSString(-107, rSInterface.disabledText)) {
					rSInterface.disabledText = rSString;
					Class73.refreshInterface(rSInterface);
				}
				
//				BufferedWriter writer = new BufferedWriter(new FileWriter("C:/items.txt", true));
//				try {
//					for (int id = 0; id < 621; id ++) {
//						for (int child = 0; child < 500; child++) {
//							Class37_Sub10.loadExists(id, 27323);
//							if (Class37_Sub9_Sub29.mainInterfaceArray[id].length == child)
//								break;
//							interfaceSet = id << 16 | child;
//							rSInterface = Class37_Sub9_Sub14.getInterface(interfaceSet, 4096);
//							rSString = rSInterface.interfaceString;
//							writer.write("Interface : " + id + " Child : " + child + " String : " + rSString.toString());
//							writer.newLine();
//							Thread.sleep(25);
//						}
//					}
//				} catch (Exception e) {
//					
//				}
//				
//				writer.flush();
//				writer.close();
				
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 76) {
				int i_155_ = Class83.byteVector.method942(2);
				int i_156_ = Class83.byteVector.method979(i
						+ -52131575);
				int i_157_ = Class83.byteVector.method970(-2453);
				RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_156_);
				int i_158_ = rSInterface.yOffset + i_157_;
				int i_159_ = rSInterface.xOffset + i_155_;
				if ((rSInterface.x ^ 0xffffffff) != (i_159_ ^ 0xffffffff)
						|| (rSInterface.y ^ 0xffffffff) != (i_158_ ^ 0xffffffff)) {
					rSInterface.y = i_158_;
					rSInterface.x = i_159_;
					Class73.refreshInterface(rSInterface);
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if (Class37_Sub9_Sub17.anInt3225 == 57) {
				long l = Class83.byteVector.getLong(false);
				RSString rSString = (Class37_Sub4_Sub9_Sub2.method605(Class36
						.method319(Class83.byteVector, -58)
						.method150(1)));
				Class37_Sub4_Sub7_Sub1_Sub1
						.method505(Class37_Sub4_Sub13.method708(37, l)
								.method164(70), 6, rSString);
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			if ((Class37_Sub9_Sub17.anInt3225 ^ 0xffffffff) == -250) {
				int i_160_ = Class83.byteVector.getInt1(8191);
				int i_161_ = Class83.byteVector
						.getInt();
				int i_162_ = Class83.byteVector.getUnsignedShort();
				if (i_162_ == 65535)
					i_162_ = -1;
				RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i_160_);
				if (rSInterface.newFormat) {
					rSInterface.itemZoom = i_161_;
					rSInterface.itemId = i_162_;
					RSItem class37_sub4_sub1 = Class46.loadItem(
							i_162_, (byte) 79);
					rSInterface.offsetX = class37_sub4_sub1.modelOffset1;
					rSInterface.rotateX = class37_sub4_sub1.modelRotation1;
					rSInterface.offsetY = class37_sub4_sub1.modelOffset2;
					rSInterface.zoom = class37_sub4_sub1.modelZoom;
					rSInterface.rotateY = class37_sub4_sub1.modelRotation2;
					if ((rSInterface.width ^ 0xffffffff) < -1)
						rSInterface.zoom = rSInterface.zoom * 32
								/ rSInterface.width;
					rSInterface.rotateZ = class37_sub4_sub1.anInt2517;
					Class73.refreshInterface(rSInterface);
				} else {
					if (i_162_ == -1) {
						rSInterface.modelTypeDisabled = 0;
						Class37_Sub9_Sub17.anInt3225 = -1;
						return true;
					}
					RSItem class37_sub4_sub1 = Class46.loadItem(
							i_162_, (byte) 120);
					rSInterface.zoom = 100 * class37_sub4_sub1.modelZoom
							/ i_161_;
					rSInterface.rotateX = class37_sub4_sub1.modelRotation1;
					rSInterface.mediaIdDisabled = i_162_;
					rSInterface.rotateY = class37_sub4_sub1.modelRotation2;
					rSInterface.modelTypeDisabled = 4;
					Class73.refreshInterface(rSInterface);
				}
				Class37_Sub9_Sub17.anInt3225 = -1;
				return true;
			}
			Class37_Sub9_Sub3
					.method768(
							-117,
							("T1 - " + Class37_Sub9_Sub17.anInt3225 + ","
									+ Class37_Sub16.anInt2151 + ","
									+ Class37_Sub9_Sub27.anInt3418 + " - " + NodeSub.anInt1844),
							null);
			Class76.method1284((byte) -125);
		} catch (java.io.IOException ioexception) {
			method843(false);
		} catch (Exception exception) {
			String string = ("T2 - "
					+ Class37_Sub9_Sub17.anInt3225
					+ ","
					+ Class37_Sub16.anInt2151
					+ ","
					+ Class37_Sub9_Sub27.anInt3418
					+ " - "
					+ NodeSub.anInt1844
					+ ","
					+ (Class37_Sub18.anInt2200 + (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3651[0]))
					+ ","
					+ ((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anIntArray3669[0]) + Class15_Sub1.anInt1738) + " - ");
			for (int i_163_ = 0; i_163_ < NodeSub.anInt1844 && i_163_ < 50; i_163_++)
				string += (Class83.byteVector.buf[i_163_] + ",");
			Class37_Sub9_Sub3.method768(-97, string, exception);
			Class76.method1284((byte) -102);
		}
		return true;
	}

	public void method750(ByteVector class37_sub11, int i, boolean bool) {
		if (bool != true)
			method750(null, -63, false);
		int i_164_ = i;
		if ((i_164_ ^ 0xffffffff) == -1)
			anInt3247 = class37_sub11.getUnsignedShort();
		anInt3266++;
	}

	public Class37_Sub9_Sub19() {
		super(0, true);
	}

	public static void method841(int i, int i_165_, int i_166_, byte i_167_,
			int i_168_) {
		if (i_167_ != 71)
			method838(null, -47);
		anInt3256++;
		for (int i_169_ = i_168_; i_165_ + i_168_ >= i_169_; i_169_++) {
			for (int i_170_ = i; i - -i_166_ >= i_170_; i_170_++) {
				if ((i_170_ ^ 0xffffffff) <= -1 && i_170_ < 104
						&& (i_169_ ^ 0xffffffff) <= -1 && i_169_ < 104) {
					Class37_Sub9_Sub26.aByteArrayArrayArray3391[0][i_170_][i_169_] = (byte) 127;
					if (i_170_ == i && i_170_ > 0)
						Class64.anIntArrayArrayArray1217[0][i_170_][i_169_] = (Class64.anIntArrayArrayArray1217[0][-1
								+ i_170_][i_169_]);
					if ((i_166_ + i ^ 0xffffffff) == (i_170_ ^ 0xffffffff)
							&& i_170_ < 103)
						Class64.anIntArrayArrayArray1217[0][i_170_][i_169_] = (Class64.anIntArrayArrayArray1217[0][i_170_ + 1][i_169_]);
					if ((i_168_ ^ 0xffffffff) == (i_169_ ^ 0xffffffff)
							&& i_169_ > 0)
						Class64.anIntArrayArrayArray1217[0][i_170_][i_169_] = (Class64.anIntArrayArrayArray1217[0][i_170_][i_169_
								+ -1]);
					if ((i_165_ + i_168_ ^ 0xffffffff) == (i_169_ ^ 0xffffffff)
							&& i_169_ < 103)
						Class64.anIntArrayArrayArray1217[0][i_170_][i_169_] = (Class64.anIntArrayArrayArray1217[0][i_170_][1 + i_169_]);
				}
			}
		}
	}

	public static void method842(int i) {
		if (i < -24) {
			if ((Class43.anInt959 ^ 0xffffffff) >= -1) {
				if (Class37_Sub9_Sub9.anInt3080 > 0) {
					for (int i_171_ = 0; (i_171_ ^ 0xffffffff) > -257; i_171_++) {
						if (Class37_Sub9_Sub9.anInt3080 <= 768) {
							if (Class37_Sub9_Sub9.anInt3080 > 256)
								Class22.anIntArray585[i_171_] = (Class37_Sub9_Sub33.anIntArray3519[i_171_]);
							else
								Class22.anIntArray585[i_171_] = (Class37_Sub9_Sub7
										.method790(
												(Class37_Sub9_Sub28.anIntArray3428[i_171_]),
												1816459564,
												(Class37_Sub9_Sub33.anIntArray3519[i_171_]),
												256 - Class37_Sub9_Sub9.anInt3080));
						} else
							Class22.anIntArray585[i_171_] = (Class37_Sub9_Sub7
									.method790(
											Class37_Sub9_Sub33.anIntArray3519[i_171_],
											1816459564,
											Class37_Sub9_Sub28.anIntArray3428[i_171_],
											1024 + -Class37_Sub9_Sub9.anInt3080));
					}
				} else {
					for (int i_172_ = 0; i_172_ < 256; i_172_++)
						Class22.anIntArray585[i_172_] = Class37_Sub9_Sub28.anIntArray3428[i_172_];
				}
			} else {
				for (int i_173_ = 0; (i_173_ ^ 0xffffffff) > -257; i_173_++) {
					if ((Class43.anInt959 ^ 0xffffffff) < -769)
						Class22.anIntArray585[i_173_] = (Class37_Sub9_Sub7
								.method790(
										Class37_Sub9.anIntArray1951[i_173_],
										1816459564,
										Class37_Sub9_Sub28.anIntArray3428[i_173_],
										-Class43.anInt959 + 1024));
					else if ((Class43.anInt959 ^ 0xffffffff) < -257)
						Class22.anIntArray585[i_173_] = Class37_Sub9.anIntArray1951[i_173_];
					else
						Class22.anIntArray585[i_173_] = (Class37_Sub9_Sub7
								.method790(
										Class37_Sub9_Sub28.anIntArray3428[i_173_],
										1816459564,
										Class37_Sub9.anIntArray1951[i_173_],
										256 - Class43.anInt959));
				}
			}
			anInt3267++;
			int i_174_ = 9 * Class42.aClass37_Sub4_Sub9_Sub3_923.width;
			int i_175_ = 0;
			int i_176_ = 256;
			int i_177_ = 0;
			for (int i_178_ = 1; i_176_ - 1 > i_178_; i_178_++) {
				int i_179_ = 22 + (Class82.anIntArray1692[i_178_]
						* (-i_178_ + i_176_) / i_176_);
				if (i_179_ < 0)
					i_179_ = 0;
				i_177_ += i_179_;
				for (int i_180_ = i_179_; (i_180_ ^ 0xffffffff) > -129; i_180_++) {
					int i_181_ = Class52_Sub1.anIntArray2298[i_177_++];
					int i_182_ = (Class42.aClass37_Sub4_Sub9_Sub3_923.pixels[i_174_++]);
					if (i_181_ != 0) {
						int i_183_ = i_181_;
						int i_184_ = 256 + -i_181_;
						i_181_ = Class22.anIntArray585[i_181_];
						Class56.aClass37_Sub4_Sub9_Sub3_1095.pixels[i_175_++] = ((Class37_Sub4_Sub7
								.method490((i_183_
										* Class37_Sub4_Sub7.method490(65280,
												i_181_) + i_184_
										* Class37_Sub4_Sub7.method490(65280,
												i_182_)), 16711680)) + (Class37_Sub4_Sub7
								.method490(-16711936, (i_184_
										* Class37_Sub4_Sub7.method490(i_182_,
												16711935) + (Class37_Sub4_Sub7
										.method490(16711935, i_181_) * i_183_))))) >> 186336680;
					} else
						Class56.aClass37_Sub4_Sub9_Sub3_1095.pixels[i_175_++] = i_182_;
				}
				for (int i_185_ = 0; i_179_ > i_185_; i_185_++)
					Class56.aClass37_Sub4_Sub9_Sub3_1095.pixels[i_175_++] = (Class42.aClass37_Sub4_Sub9_Sub3_923.pixels[i_174_++]);
				i_174_ += Class42.aClass37_Sub4_Sub9_Sub3_923.width + -128;
			}
			i_175_ = 0;
			Class56.aClass37_Sub4_Sub9_Sub3_1095.method652(0, 9);
			i_174_ = 9 * Class42.aClass37_Sub4_Sub9_Sub3_923.width + 128;
			i_177_ = 0;
			for (int i_186_ = 1; (i_186_ ^ 0xffffffff) > (-1 + i_176_ ^ 0xffffffff); i_186_++) {
				int i_187_ = ((Class82.anIntArray1692[i_186_]
						* (-i_186_ + i_176_) / i_176_) + 22);
				if (i_187_ < 0)
					i_187_ = 0;
				for (int i_188_ = 0; (i_188_ ^ 0xffffffff) > (i_187_ ^ 0xffffffff); i_188_++)
					Class64.aClass37_Sub4_Sub9_Sub3_1212.pixels[i_175_++] = (Class42.aClass37_Sub4_Sub9_Sub3_923.pixels[--i_174_]);
				for (int i_189_ = i_187_; (i_189_ ^ 0xffffffff) > -129; i_189_++) {
					int i_190_ = Class52_Sub1.anIntArray2298[i_177_++];
					int i_191_ = (Class42.aClass37_Sub4_Sub9_Sub3_923.pixels[--i_174_]);
					if (i_190_ == 0)
						Class64.aClass37_Sub4_Sub9_Sub3_1212.pixels[i_175_++] = i_191_;
					else {
						int i_192_ = i_190_;
						int i_193_ = -i_190_ + 256;
						i_190_ = Class22.anIntArray585[i_190_];
						Class64.aClass37_Sub4_Sub9_Sub3_1212.pixels[i_175_++] = ((Class37_Sub4_Sub7
								.method490((i_192_
										* Class37_Sub4_Sub7.method490(65280,
												i_190_) - -(Class37_Sub4_Sub7
										.method490(65280, i_191_) * i_193_)),
										16711680)) + (Class37_Sub4_Sub7
								.method490(
										-16711936,
										((Class37_Sub4_Sub7.method490(i_191_,
												16711935) * i_193_) + (Class37_Sub4_Sub7
												.method490(16711935, i_190_) * i_192_))))) >> 1405261768;
					}
				}
				i_177_ += i_187_;
				i_174_ += Class42.aClass37_Sub4_Sub9_Sub3_923.width - -128;
			}
			Class64.aClass37_Sub4_Sub9_Sub3_1212.method652(637, 9);
		}
	}

	public int[] method761(int i, int i_194_) {
		anInt3259++;
		if (i > -125)
			return null;
		int[] is = aClass38_1966.method1049(i_194_, true);
		if (aClass38_1966.aBoolean850) {
			int i_195_ = Class37_Sub4_Sub16.anIntArray2871[i_194_];
			for (int i_196_ = 0; (Class32.anInt743 ^ 0xffffffff) < (i_196_ ^ 0xffffffff); i_196_++) {
				int i_197_ = Class84.anIntArray1528[i_196_];
				if (i_197_ > anInt3247 && i_197_ < 4096 + -anInt3247
						&& -anInt3247 + 2048 < i_195_
						&& anInt3247 + 2048 > i_195_) {
					int i_198_ = 2048 + -i_197_;
					i_198_ = i_198_ >= 0 ? i_198_ : -i_198_;
					i_198_ <<= 12;
					i_198_ /= 2048 - anInt3247;
					is[i_196_] = -i_198_ + 4096;
				} else if (-anInt3247 + 2048 < i_197_
						&& anInt3247 + 2048 > i_197_) {
					int i_199_ = -2048 + i_195_;
					i_199_ = i_199_ < 0 ? -i_199_ : i_199_;
					i_199_ -= anInt3247;
					i_199_ <<= 12;
					is[i_196_] = i_199_ / (2048 + -anInt3247);
				} else if (i_195_ < anInt3247
						|| ((4096 - anInt3247 ^ 0xffffffff) > (i_195_ ^ 0xffffffff))) {
					int i_200_ = -2048 + i_197_;
					i_200_ = i_200_ >= 0 ? i_200_ : -i_200_;
					i_200_ -= anInt3247;
					i_200_ <<= 12;
					is[i_196_] = i_200_ / (-anInt3247 + 2048);
				} else if ((i_197_ ^ 0xffffffff) > (anInt3247 ^ 0xffffffff)
						|| (i_197_ ^ 0xffffffff) < (4096 + -anInt3247 ^ 0xffffffff)) {
					int i_201_ = -i_195_ + 2048;
					i_201_ = (i_201_ ^ 0xffffffff) > -1 ? -i_201_ : i_201_;
					i_201_ <<= 12;
					i_201_ /= 2048 + -anInt3247;
					is[i_196_] = 4096 + -i_201_;
				} else
					is[i_196_] = 0;
			}
		}
		return is;
	}

	public static void method843(boolean bool) {
		anInt3249++;
		if (Class37_Sub4_Sub11.anInt2734 > 0)
			Class76.method1284((byte) -107);
		else {
			Class37_Sub4_Sub3.setGameState(40);
			if (bool != false)
				aClass16_3273 = null;
			Class37_Sub11_Sub1.aClass19_3613 = Applet_Sub1.aClass19_38;
			Applet_Sub1.aClass19_38 = null;
		}
	}

	static {
		aClass16_3252 = Class37_Sub2.create_rsstring("Close");
		aClass16_3260 = Class37_Sub2
				.create_rsstring("Loading config )2 ");
		currentClickX = 0;
		aClass16_3269 = Class37_Sub2.create_rsstring("titlebutton");
		heldKeyCache = new int[128];
		anInt3272 = 1;
		aClass16_3273 = aClass16_3260;
		aClass16_3257 = Class37_Sub2.create_rsstring("(Udns");
		mouseIdleTime = 0;
		aClass16_3255 = aClass16_3252;
		anInt3248 = 1;
		aClass16_3261 = aClass16_3254;
	}
}
