package org.ie.client;

/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Queue {
	
	public static int[] anIntArray1440 = new int[1000];
	public static int anInt1441;
	public static int anInt1442;
	public static int anInt1443;
	public static int anInt1444 = 0;
	public NodeSub head = new NodeSub();
	public static int anInt1446;
	public static int anInt1447 = 0;
	public static int anInt1448;
	public static int[][] anIntArrayArray1449 = new int[104][104];
	public static RSString aClass16_1450;
	public static int anInt1451;
	public static RSInterface aClass18_1452;
	public static int anInt1453;
	public static boolean aBoolean1454;

	public static int method1287(int i, int i_0_, int i_1_) {
		anInt1451++;
		int i_2_ = i_1_ >>> -379835201;
		if (i != 256)
			anIntArray1440 = null;
		return (i_1_ - -i_2_) / i_0_ - i_2_;
	}

	public void insertFront(NodeSub node) {
		if (node.previousSub != null)
			node.unlinkSub();
		node.previousSub = head;
		node.nextSub = head.nextSub;
		node.previousSub.nextSub = node;
		node.nextSub.previousSub = node;
	}

	public NodeSub popFront() {
		NodeSub node = head.nextSub;
		if (head == node)
			return null;
		node.unlinkSub();
		return node;
	}

	public static void method1290(int i, int i_3_, int i_4_, int i_5_) {
		anInt1446++;
		Class72.method1267(2);
		Graphics2D.setBounds(i_4_, i_3_, i_4_
				+ Canvas_Sub1.aClass37_Sub4_Sub9_Sub1_47.anInt3865, i_3_
				- -Canvas_Sub1.aClass37_Sub4_Sub9_Sub1_47.anInt3862);
		if ((Class37_Sub9_Sub36.anInt3584 ^ 0xffffffff) != -3
				&& Class37_Sub9_Sub36.anInt3584 != 5) {
			int i_6_ = (0x7ff & Class37_Sub9_Sub37.anInt3590
					+ Class37_Sub14.anInt2127);
			int i_7_ = 48 + (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666) / 32;
			int i_8_ = 464 + -((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642) / 32);
			Class37_Sub9_Sub16.aClass37_Sub4_Sub9_Sub3_3202.method643(
					i_4_ + 25, i_3_ + 5, 146, 151, i_7_, i_8_, i_6_,
					256 - -Class78.anInt1458, Class39.anIntArray871,
					Class75.anIntArray1406);
			for (int i_9_ = 0; (ByteVector.anInt2032 ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
				int i_10_ = (anIntArray1440[i_9_] * 4 - -2 + -((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666) / 32));
				int i_11_ = (-((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642) / 32) + 2 + 4 * Class37_Sub9_Sub33.anIntArray3518[i_9_]);
				Class37_Sub25.method1043(i_3_, i_10_,
						(Class22.aClass37_Sub4_Sub9_Sub3Array588[i_9_]), 94,
						i_4_, i_11_);
			}
			for (int i_12_ = 0; i_12_ < 104; i_12_++) {
				for (int i_13_ = 0; i_13_ < 104; i_13_++) {
					Deque landscape = (Class37_Sub9_Sub18.aClass58ArrayArrayArray3238[Class37_Sub9_Sub1.anInt2916][i_12_][i_13_]);
					if (landscape != null) {
						int i_14_ = (2 + 4 * i_13_ + -((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642) / 32));
						int i_15_ = (-((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666) / 32)
								+ i_12_ * 4 - -2);
						Class37_Sub25.method1043(i_3_, i_15_,
								Class72.aClass37_Sub4_Sub9_Sub3Array1377[0],
								94, i_4_, i_14_);
					}
				}
			}
			for (int i_16_ = 0; i_16_ < Class76.anInt1436; i_16_++) {
				Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[Class37_Sub4_Sub16.anIntArray2869[i_16_]]);
				if (class37_sub4_sub7_sub1_sub1 != null
						&& class37_sub4_sub7_sub1_sub1.method497(20542)) {
					Class37_Sub4_Sub15 class37_sub4_sub15 = class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955;
					if (class37_sub4_sub15 != null
							&& class37_sub4_sub15.anIntArray2824 != null)
						class37_sub4_sub15 = class37_sub4_sub15
								.method719((byte) 43);
					if (class37_sub4_sub15 != null
							&& class37_sub4_sub15.aBoolean2823
							&& class37_sub4_sub15.aBoolean2811) {
						int i_17_ = (class37_sub4_sub7_sub1_sub1.anInt3666 / 32 - (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666) / 32);
						int i_18_ = (class37_sub4_sub7_sub1_sub1.anInt3642 / 32 - (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642) / 32);
						Class37_Sub25.method1043(i_3_, i_17_,
								Class72.aClass37_Sub4_Sub9_Sub3Array1377[1],
								94, i_4_, i_18_);
					}
				}
			}
			for (int i_19_ = 0; Class19.anInt487 > i_19_; i_19_++) {
				Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[Class26.anIntArray657[i_19_]]);
				if (class37_sub4_sub7_sub1_sub2 != null
						&& class37_sub4_sub7_sub1_sub2.method497(20542)) {
					int i_20_ = (class37_sub4_sub7_sub1_sub2.anInt3642 / 32 - (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642) / 32);
					int i_21_ = (-((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666) / 32) + class37_sub4_sub7_sub1_sub2.anInt3666 / 32);
					boolean bool = false;
					long l = class37_sub4_sub7_sub1_sub2.aClass16_3993
							.method152(-86);
					for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (MouseHandler.anInt173 ^ 0xffffffff); i_22_++) {
						if (((Class71.aLongArray1360[i_22_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL))
								&& ((MouseHandler.anIntArray176[i_22_] ^ 0xffffffff) != -1)) {
							bool = true;
							break;
						}
					}
					boolean bool_23_ = false;
					if ((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3988) != 0
							&& (class37_sub4_sub7_sub1_sub2.anInt3988 ^ 0xffffffff) != -1
							&& (class37_sub4_sub7_sub1_sub2.anInt3988 == (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3988)))
						bool_23_ = true;
					if (!bool) {
						if (!bool_23_)
							Class37_Sub25
									.method1043(
											i_3_,
											i_21_,
											Class72.aClass37_Sub4_Sub9_Sub3Array1377[2],
											94, i_4_, i_20_);
						else
							Class37_Sub25
									.method1043(
											i_3_,
											i_21_,
											Class72.aClass37_Sub4_Sub9_Sub3Array1377[4],
											94, i_4_, i_20_);
					} else
						Class37_Sub25.method1043(i_3_, i_21_,
								Class72.aClass37_Sub4_Sub9_Sub3Array1377[3],
								94, i_4_, i_20_);
				}
			}
			if (Class37_Sub9_Sub21.anInt3321 != 0
					&& Class37_Sub7.loopCycle % 20 < 10) {
				if (Class37_Sub9_Sub21.anInt3321 == 1
						&& (Class50.anInt1016 ^ 0xffffffff) <= -1
						&& (Class50.anInt1016 < (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111).length)) {
					Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1 = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[Class50.anInt1016]);
					if (class37_sub4_sub7_sub1_sub1 != null) {
						int i_24_ = (-((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642) / 32) + class37_sub4_sub7_sub1_sub1.anInt3642 / 32);
						int i_25_ = (class37_sub4_sub7_sub1_sub1.anInt3666 / 32 + -((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666) / 32));
						Class4
								.method52(
										i_4_,
										i_25_,
										false,
										i_3_,
										i_24_,
										(Class37_Sub9_Sub19.aClass37_Sub4_Sub9_Sub3Array3262[1]));
					}
				}
				if (Class37_Sub9_Sub21.anInt3321 == 2) {
					int i_26_ = (-((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666) / 32)
							+ (Class38.anInt851 - Class37_Sub18.anInt2200) * 4 - -2);
					int i_27_ = (-((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642) / 32) + (4 * (-Class15_Sub1.anInt1738 + Class71.anInt1362) + 2));
					Class4
							.method52(
									i_4_,
									i_26_,
									false,
									i_3_,
									i_27_,
									(Class37_Sub9_Sub19.aClass37_Sub4_Sub9_Sub3Array3262[1]));
				}
				if (Class37_Sub9_Sub21.anInt3321 == 10
						&& Class2.anInt82 >= 0
						&& ((Class2.anInt82 ^ 0xffffffff) > (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414.length ^ 0xffffffff))) {
					Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2 = (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[Class2.anInt82]);
					if (class37_sub4_sub7_sub1_sub2 != null) {
						int i_28_ = (class37_sub4_sub7_sub1_sub2.anInt3666 / 32 - (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666) / 32);
						int i_29_ = (class37_sub4_sub7_sub1_sub2.anInt3642 / 32 + -((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642) / 32));
						Class4
								.method52(
										i_4_,
										i_28_,
										false,
										i_3_,
										i_29_,
										(Class37_Sub9_Sub19.aClass37_Sub4_Sub9_Sub3Array3262[1]));
					}
				}
			}
			if (Class79.anInt1474 != 0) {
				int i_30_ = (-((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3642) / 32)
						+ Class82.anInt1687 * 4 + 2);
				int i_31_ = (-((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234.anInt3666) / 32) + (2 + Class79.anInt1474 * 4));
				Class37_Sub25
						.method1043(
								i_3_,
								i_31_,
								(Class37_Sub9_Sub19.aClass37_Sub4_Sub9_Sub3Array3262[0]),
								94, i_4_, i_30_);
			}
			Graphics2D.method578(i_4_ + 93 - -4, 82 + (i_3_ - 4), 3, 3,
					16777215);
		} else
			Graphics2D.method593(25 + i_4_, i_3_ + 5, 0,
					Class39.anIntArray871, Class75.anIntArray1406);
		if (i_5_ != 6853)
			method1292(16);
		if (Class37_Sub9_Sub36.anInt3584 < 3)
			Class37_Sub9_Sub28.aClass37_Sub4_Sub9_Sub3_3430.method643(i_4_,
					i_3_, 33, 33, 25, 25, Class37_Sub14.anInt2127, 256,
					Class1.anIntArray69, Class37_Sub9_Sub27.anIntArray3401);
		else
			Graphics2D.method593(i_4_, i_3_, 0, Class1.anIntArray69,
					Class37_Sub9_Sub27.anIntArray3401);
		if (Class37_Sub9_Sub36.aBooleanArray3587[i])
			Canvas_Sub1.aClass37_Sub4_Sub9_Sub1_47.method597(i_4_, i_3_);
		Class37_Sub9_Sub1.rectClipDraw[i] = true;
	}

	public NodeSub peekFront() {
		NodeSub node = head.nextSub;
		if (head == node)
			return null;
		return node;
	}

	public static void method1292(int i) {
		int i_32_ = -115 / ((-55 - i) / 42);
		anIntArray1440 = null;
		aClass16_1450 = null;
		aClass18_1452 = null;
		anIntArrayArray1449 = null;
	}

	public void insertBack(NodeSub node) {
		if (node.previousSub != null)
			node.unlinkSub();
		node.nextSub = head;
		node.previousSub = head.previousSub;
		node.previousSub.nextSub = node;
		node.nextSub.previousSub = node;
	}

	public Queue() {
		head.nextSub = head;
		head.previousSub = head;
	}

	static {
		anInt1442 = -1;
		aClass18_1452 = null;
		aBoolean1454 = false;
		aClass16_1450 = (Class37_Sub2.create_rsstring("und die Schaltfl-=che (WSpielkonto erstellen(W am"));
	}
}
