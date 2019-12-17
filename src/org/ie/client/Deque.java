package org.ie.client;

import java.io.IOException;

/* Landscape - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Deque {
	
	public Node head = new Node();
	public static int anInt1103;
	public static RSString aClass16_1104;
	public static int anInt1105;
	public static Class37_Sub11_Sub1 aClass37_Sub11_Sub1_1106;
	public static int anInt1107;
	public static int anInt1108;
	public static Class42 aClass42_1109;
	public static RSString aClass16_1110;
	public static byte[] aByteArray1111;
	public static int anInt1112;
	public static int anInt1113;
	public static RSString aClass16_1114 = Class37_Sub2.create_rsstring("glow3:");
	public static RSString aClass16_1115;
	public static int anInt1116;
	public Node current;
	public static int anInt1118;
	public static int anInt1119;
	public static int anInt1120;
	public static int anInt1121;
	public static int anInt1122;
	public static int anInt1123;
	public static int anInt1124;
	public static Cache aClass65_1125;
	public static int[] anIntArray1126;
	public static int anInt1127;
	public static int[] anIntArray1128;

	public static void method1148(byte i) {
		anInt1103++;
		Class15.method122(false, (byte) -103);
		client.anInt1734 = 0;
		boolean bool = true;
		for (int i_0_ = 0; ((i_0_ ^ 0xffffffff) > (Class22.aByteArrayArray569.length ^ 0xffffffff)); i_0_++) {
			if (Class37_Sub4_Sub11.anIntArray2712[i_0_] != -1
					&& Class22.aByteArrayArray569[i_0_] == null) {
				Class22.aByteArrayArray569[i_0_] = (Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740
						.getFile(Class37_Sub4_Sub11.anIntArray2712[i_0_], 0));
				if (Class22.aByteArrayArray569[i_0_] == null) {
					client.anInt1734++;
					bool = false;
				}
			}
			if (Class37_Sub9_Sub8.anIntArray3061[i_0_] != -1
					&& Class49.aByteArrayArray1005[i_0_] == null) {
				Class49.aByteArrayArray1005[i_0_] = (Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740
						.method113(-58, 0,
								Class37_Sub9_Sub8.anIntArray3061[i_0_],
								Class37_Sub9_Sub36.anIntArrayArray3573[i_0_]));
				if (Class49.aByteArrayArray1005[i_0_] == null) {
					client.anInt1734++;
					bool = false;
				}
			}
		}
		if (!bool)
			Class37_Sub9_Sub31.anInt3487 = 1;
		else {
			bool = true;
			Class76.anInt1437 = 0;
			for (int i_1_ = 0; ((i_1_ ^ 0xffffffff) > (Class22.aByteArrayArray569.length ^ 0xffffffff)); i_1_++) {
				byte[] is = Class49.aByteArrayArray1005[i_1_];
				if (is != null) {
					int i_2_ = (64 * (Class66.anIntArray1261[i_1_] >> 259023176) - Class37_Sub18.anInt2200);
					int i_3_ = (-Class15_Sub1.anInt1738 + 64 * (0xff & Class66.anIntArray1261[i_1_]));
					if (Class37_Sub17.aBoolean2165) {
						i_3_ = 10;
						i_2_ = 10;
					}
					bool &= Class29.method265(i_3_, is, i_2_, (byte) 113);
				}
			}
			if (!bool)
				Class37_Sub9_Sub31.anInt3487 = 2;
			else {
				if ((Class37_Sub9_Sub31.anInt3487 ^ 0xffffffff) != -1)
					Class79.method1298((Class37_Sub9_Sub27.method881((new RSString[] { Class37_Sub4_Sub18.aClass16_2908,
							(Class37_Sub9_Sub3.aClass16_2956) }))),
							true, 1);
				Class72.method1267(2);
				method1151((byte) 75);
				Class72.method1267(2);
				Class38.aClass67_847.method1241();
				Class72.method1267(2);
				System.gc();
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -5; i_4_++)
					Class68.aClass20Array1322[i_4_].method215(false);
				for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -5; i_5_++) {
					for (int i_6_ = 0; i_6_ < 104; i_6_++) {
						for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -105; i_7_++)
							Class1.aByteArrayArrayArray63[i_5_][i_6_][i_7_] = (byte) 0;
					}
				}
				Class72.method1267(2);
				Node.method326(true);
				int i_8_ = Class22.aByteArrayArray569.length;
				Class38.method1048(-15581);
				Class15.method122(true, (byte) -103);
				if (!Class37_Sub17.aBoolean2165) {
					for (int i_9_ = 0; i_8_ > i_9_; i_9_++) {
						int i_10_ = (-Class37_Sub18.anInt2200 + (Class66.anIntArray1261[i_9_] >> -964192152) * 64);
						byte[] is = Class22.aByteArrayArray569[i_9_];
						int i_11_ = (-Class15_Sub1.anInt1738 + 64 * (0xff & Class66.anIntArray1261[i_9_]));
						if (is != null) {
							Class72.method1267(2);
							Class37_Sub5.method736(is, -1,
									8 * InterfaceClickMask.anInt1985 - 48, i_11_,
									Class68.aClass20Array1322, -48 + 8
											* Class37_Sub4_Sub7.anInt2641,
									i_10_);
						}
					}
					for (int i_12_ = 0; i_8_ > i_12_; i_12_++) {
						int i_13_ = (-Class37_Sub18.anInt2200 + 64 * (Class66.anIntArray1261[i_12_] >> 1715899400));
						int i_14_ = ((Class66.anIntArray1261[i_12_] & 0xff) * 64 - Class15_Sub1.anInt1738);
						byte[] is = Class22.aByteArrayArray569[i_12_];
						if (is == null
								&& (Class37_Sub4_Sub7.anInt2641 ^ 0xffffffff) > -801) {
							Class72.method1267(2);
							Class37_Sub9_Sub19.method841(i_13_, 64, 64,
									(byte) 71, i_14_);
						}
					}
					Class15.method122(true, (byte) -103);
					for (int i_15_ = 0; i_8_ > i_15_; i_15_++) {
						byte[] is = Class49.aByteArrayArray1005[i_15_];
						if (is != null) {
							int i_16_ = (-Class15_Sub1.anInt1738 + ((0xff & Class66.anIntArray1261[i_15_]) * 64));
							int i_17_ = (-Class37_Sub18.anInt2200 + 64 * (Class66.anIntArray1261[i_15_] >> 757205192));
							Class72.method1267(2);
							Class37_Sub9_Sub23.method865(i_16_, (byte) -67, i_17_, is, Class38.aClass67_847, (Class68.aClass20Array1322));
						}

					}
				}
				if (Class37_Sub17.aBoolean2165) {
					for (int i_18_ = 0; i_18_ < 4; i_18_++) {
						Class72.method1267(2);
						for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > -14; i_19_++) {
							for (int i_20_ = 0; i_20_ < 13; i_20_++) {
								int i_21_ = (Class37_Sub9_Sub27.anIntArrayArrayArray3407[i_18_][i_19_][i_20_]);
								boolean bool_22_ = false;
								if ((i_21_ ^ 0xffffffff) != 0) {
									int i_23_ = (0x351f5e3 & i_21_) >> 487283512;
									int i_24_ = i_21_ >> -1333311423 & 0x3;
									int i_25_ = (i_21_ & 0x3ff9) >> -1147007837;
									int i_26_ = i_21_ >> -1447631058 & 0x3ff;
									int i_27_ = (i_25_ / 8 + (i_26_ / 8 << 1734141032));
									for (int i_28_ = 0; Class66.anIntArray1261.length > i_28_; i_28_++) {
										if (((Class66.anIntArray1261[i_28_] ^ 0xffffffff) == (i_27_ ^ 0xffffffff))
												&& (Class22.aByteArrayArray569[i_28_]) != null) {
											Class37_Sub9_Sub36
													.method916(
															(i_26_ & 0x7) * 8,
															(0x7 & i_25_) * 8,
															Class68.aClass20Array1322,
															(Class22.aByteArrayArray569[i_28_]),
															8 * i_19_,
															i_20_ * 8, i_23_,
															i_24_, i_18_,
															(byte) 113);
											bool_22_ = true;
											break;
										}
									}
								}
								if (!bool_22_)
									Class37_Sub20.method1022(8 * i_19_, 3319,
											8 * i_20_, i_18_);
							}
						}
					}
					for (int i_29_ = 0; i_29_ < 13; i_29_++) {
						for (int i_30_ = 0; i_30_ < 13; i_30_++) {
							int i_31_ = (Class37_Sub9_Sub27.anIntArrayArrayArray3407[0][i_29_][i_30_]);
							if ((i_31_ ^ 0xffffffff) == 0)
								Class37_Sub9_Sub19.method841(i_29_ * 8, 8, 8,
										(byte) 71, i_30_ * 8);
						}
					}
					Class15.method122(true, (byte) -103);
					for (int i_32_ = 0; i_32_ < 4; i_32_++) {
						Class72.method1267(2);
						for (int i_33_ = 0; i_33_ < 13; i_33_++) {
							for (int i_34_ = 0; i_34_ < 13; i_34_++) {
								int i_35_ = (Class37_Sub9_Sub27.anIntArrayArrayArray3407[i_32_][i_33_][i_34_]);
								if (i_35_ != -1) {
									int i_36_ = i_35_ >> 1782752696 & 0x3;
									int i_37_ = (0x6 & i_35_) >> 2018396577;
									int i_38_ = i_35_ >> -1217401085 & 0x7ff;
									int i_39_ = i_35_ >> 667478286 & 0x3ff;
									int i_40_ = (i_39_ / 8 << 303598792)
											+ i_38_ / 8;
									for (int i_41_ = 0; ((Class66.anIntArray1261.length ^ 0xffffffff) < (i_41_ ^ 0xffffffff)); i_41_++) {
										if ((Class66.anIntArray1261[i_41_] == i_40_)
												&& (Class49.aByteArrayArray1005[i_41_]) != null) {
											Class33
													.method303(
															i_33_ * 8,
															Class68.aClass20Array1322,
															(Class49.aByteArrayArray1005[i_41_]),
															i_36_,
															(0x7 & i_39_) * 8,
															Class38.aClass67_847,
															i_32_, i_34_ * 8,
															8 * (0x7 & i_38_),
															i_37_, 967);
											break;
										}
									}
								}
							}
						}
					}
				}
				Class15.method122(true, (byte) -103);
				method1151((byte) 75);
				Class72.method1267(2);
				Class3.method46(Class68.aClass20Array1322,
						Class38.aClass67_847, -101);
				Class15.method122(true, (byte) -103);
				int i_42_ = Class42.anInt944;
				if ((Class37_Sub9_Sub1.anInt2916 ^ 0xffffffff) > (i_42_ ^ 0xffffffff))
					i_42_ = Class37_Sub9_Sub1.anInt2916;
				if (i_42_ < Class37_Sub9_Sub1.anInt2916 + -1)
					i_42_ = Class37_Sub9_Sub1.anInt2916 - 1;
				if (!ClientScriptDef.aBoolean2613)
					Class38.aClass67_847.method1234(0);
				else
					Class38.aClass67_847.method1234(Class42.anInt944);
				for (int i_43_ = 0; i_43_ < 104; i_43_++) {
					for (int i_44_ = 0; i_44_ < 104; i_44_++)
						Class37_Sub2.method335(i_44_, i_43_, 19938);
				}
				if (i <= 111)
					method1151((byte) 1);
				Class72.method1267(2);
				RSItem.method454(128);
				method1151((byte) 75);
				if (Class36.aFrame797 != null) {
					Class42.aClass37_Sub11_Sub1_936.method989(150);
					Class35.anInt778++;
					Class42.aClass37_Sub11_Sub1_936.method947(1057001181);
				}
				if (!Class37_Sub17.aBoolean2165) {
					int i_45_ = (-6 + Class37_Sub4_Sub7.anInt2641) / 8;
					int i_46_ = (InterfaceClickMask.anInt1985 + -6) / 8;
					int i_47_ = (6 + InterfaceClickMask.anInt1985) / 8;
					int i_48_ = (6 + Class37_Sub4_Sub7.anInt2641) / 8;
					for (int i_49_ = -1 + i_46_; 1 + i_47_ >= i_49_; i_49_++) {
						for (int i_50_ = -1 + i_45_; (i_50_ ^ 0xffffffff) >= (1 + i_48_ ^ 0xffffffff); i_50_++) {
							if (i_46_ > i_49_
									|| i_47_ < i_49_
									|| i_50_ < i_45_
									|| (i_48_ ^ 0xffffffff) > (i_50_ ^ 0xffffffff)) {
								Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740
										.method121(
												(Class37_Sub9_Sub27
														.method881(
																(new RSString[] {
																		Class86.aClass16_1576,
																		Class37_Sub9_Sub24
																				.method870(
																						i_49_,
																						(byte) -114),
																		Class71.aClass16_1359,
																		(Class37_Sub9_Sub24
																				.method870(
																						i_50_,
																						(byte) -114)) }))),
												(byte) 43);
								Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740
										.method121(
												(Class37_Sub9_Sub27
														.method881(
																(new RSString[] {
																		Class37_Sub9_Sub14.aClass16_3156,
																		Class37_Sub9_Sub24
																				.method870(
																						i_49_,
																						(byte) -114),
																		Class71.aClass16_1359,
																		(Class37_Sub9_Sub24
																				.method870(
																						i_50_,
																						(byte) -114)) }))),
												(byte) 81);
							}
						}
					}
				}
				Class37_Sub4_Sub3.setGameState(30);
				Class72.method1267(2);
				Class37_Sub9_Sub32.method899((byte) 94);
				Class42.aClass37_Sub11_Sub1_936.method989(176);
				Class37_Sub1.method329(-7242);
			}
		}
	}

	public void addLast(Node node) {
		if (node.previous != null)
			node.unlink();
		node.next = head;
		node.previous = head.previous;
		node.previous.next = node;
		node.next.previous = node;
	}

	public void addFront(Node node) {
		if (node.previous != null)
			node.unlink();
		node.next = head.next;
		node.previous = head;
		node.previous.next = node;
		node.next.previous = node;
	}

	public static void method1151(byte i) {
		anInt1120++;
		InterfaceListener.method747(97);
		Class37_Sub4_Sub4.method472((byte) 105);
		Class37_Sub9_Sub2.method765((byte) 43);
		Class36.method317(8);
		Class37_Sub9_Sub5.method779((byte) 49);
		Class71.method1265((byte) -125);
		NodeSub.method432(-1);
		Class52.method1130((byte) -128);
		Class37_Sub2.method334(-43);
		Class37_Sub9_Sub29.method889(false);
		Class39.method1063(true);
		RuntimeException_Sub1.method1337((byte) -16);
		((Class82) Rasterizer.anInterface3_3926)
				.method1304(i + 19843);
		RuntimeException_Sub1.aClass65_1632.clear();
		Class69.aClass15_Sub1_1335.method127(false);
		Class69.aClass15_Sub1_1330.method127(false);
		Canvas_Sub1.aClass15_Sub1_46.method127(false);
		NodeSub.aClass15_Sub1_1862.method127(false);
		Class37_Sub4_Sub7_Sub3.aClass15_Sub1_3740.method127(false);
		Class54.aClass15_Sub1_1060.method127(false);
		if (i != 75)
			anIntArray1126 = null;
		Class29.aClass15_Sub1_711.method127(false);
		Class60.aClass15_Sub1_1151.method127(false);
		Class52_Sub1.aClass15_Sub1_2309.method127(false);
		Class36.aClass15_Sub1_796.method127(false);
		Class37_Sub9_Sub34.aClass15_Sub1_3555.method127(false);
	}

	public void addLast(Node node, Node head) {
		if (node.previous != null)
			node.unlink();
		node.next = head;
		node.previous = head.previous;
		node.previous.next = node;
		node.next.previous = node;
	}

	public static void method1153(Class15 class15, int i) {
		anInt1113++;
		Class37_Sub9_Sub24.aClass15_3364 = class15;
		Class1.anInt65 = Class37_Sub9_Sub24.aClass15_3364.method129(16);
		if (i != 19014)
			method1151((byte) 25);
	}

	public void clear() {
		for (;;) {
			Node node = head.next;
			if (node == head)
				break;
			node.unlink();
		}
	}

	public Node getFirst() {
		Node node = head.next;
		if (head == node) {
			current = null;
			return null;
		}
		current = node.next;
		return node;
	}

	public static void method1156(int i, int i_52_) {
		Class37_Sub9_Sub19.mouseIdleTime = i_52_;
		anInt1107++;
		if (i != 8)
			method1156(21, -10);
	}

	public Node getLast() {
		Node node = head.previous;
		if (head == node) {
			current = null;
			return null;
		}
		current = node.previous;
		return node;
	}

	public Deque() {
		head.next = head;
		head.previous = head;
	}

	public static Class37_Sub4_Sub9_Sub1 method1158(int i) {
		anInt1108++;
		Class37_Sub4_Sub9_Sub1 class37_sub4_sub9_sub1 = new Class37_Sub4_Sub9_Sub1();
		class37_sub4_sub9_sub1.anInt3861 = Class37_Sub9_Sub23.anIntArray3357[0];
		class37_sub4_sub9_sub1.anInt3858 = Class46.anInt989;
		class37_sub4_sub9_sub1.aByteArray3860 = Class10.aByteArrayArray198[0];
		class37_sub4_sub9_sub1.anInt3864 = Class37_Sub4_Sub7.anInt2637;
		class37_sub4_sub9_sub1.anInt3865 = Class14.anIntArray250[0];
		class37_sub4_sub9_sub1.anInt3863 = Class62.anIntArray1180[0];
		if (i < 123)
			method1158(-74);
		class37_sub4_sub9_sub1.anInt3862 = Class37_Sub9_Sub28.anIntArray3434[0];
		class37_sub4_sub9_sub1.anIntArray3859 = Class37_Sub9_Sub1.anIntArray2919;
		Class37_Sub9_Sub11.method806(true);
		return class37_sub4_sub9_sub1;
	}

	public Node getPrevious() {
		Node node = current;
		if (head == node) {
			current = null;
			return null;
		}
		current = node.previous;
		return node;
	}

	public static void method1160(int i) {
		aClass16_1110 = null;
		aClass42_1109 = null;
		aClass16_1104 = null;
		anIntArray1128 = null;
		aClass16_1114 = null;
		aByteArray1111 = null;
		if (i != 8)
			aClass16_1114 = null;
		aClass16_1115 = null;
		aClass65_1125 = null;
		anIntArray1126 = null;
		aClass37_Sub11_Sub1_1106 = null;
	}

	public Node removeFirst() {
		Node node = head.next;
		if (head == node)
			return null;
		node.unlink();
		return node;
	}

	public Node getNext() {
		Node node = current;
		if (head == node) {
			current = null;
			return null;
		}
		current = node.next;
		return node;
	}

	static {
		aByteArray1111 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104,
				105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116,
				117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55,
				56, 57 };
		aClass16_1115 = aClass16_1114;
		aClass16_1104 = aClass16_1114;
		aClass16_1110 = Class37_Sub2.create_rsstring("Lade Wordpack )2 ");
		aClass37_Sub11_Sub1_1106 = new Class37_Sub11_Sub1(5000);
		anIntArray1126 = new int[5];
		aClass65_1125 = new Cache(64);
		anIntArray1128 = new int[500];
	}
}
