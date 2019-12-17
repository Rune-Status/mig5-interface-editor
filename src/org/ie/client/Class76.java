package org.ie.client;

/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class76 {
	public int anInt1418;
	public Class37_Sub4_Sub7 aClass37_Sub4_Sub7_1419;
	public int anInt1420;
	public static RSString aClass16_1421 = Class37_Sub2.create_rsstring("(U0a )2 non)2existant gosub script)2num: ");
	public static int anInt1422;
	public static Hashtable overridedInterfaces;
	public static int anInt1424;
	public static int anInt1425;
	public static int anInt1426;
	public int anInt1427;
	public Class37_Sub4_Sub7 aClass37_Sub4_Sub7_1428;
	public Class37_Sub4_Sub7 aClass37_Sub4_Sub7_1429;
	public int anInt1430;
	public static RSString aClass16_1431 = Class37_Sub2.create_rsstring("Connecting to server)3)3)3");
	public static RSString aClass16_1432 = aClass16_1431;
	public int anInt1433;
	public static int anInt1434;
	public static Sprite[] aClass37_Sub4_Sub9_Sub3Array1435;
	public static int anInt1436;
	public static int anInt1437;
	public static int anInt1438;
	public static int anInt1439;

	public static void method1283(int i) {
		if (i != 2)
			anInt1438 = -65;
		aClass16_1432 = null;
		aClass16_1421 = null;
		overridedInterfaces = null;
		aClass37_Sub4_Sub9_Sub3Array1435 = null;
		aClass16_1431 = null;
	}

	public static void method1284(byte i) {
		if (Applet_Sub1.aClass19_38 != null) {
			Applet_Sub1.aClass19_38.method209((byte) -128);
			Applet_Sub1.aClass19_38 = null;
		}
		anInt1426++;
		Deque.method1151((byte) 75);
		Class38.aClass67_847.method1241();
		for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -5; i_0_++)
			Class68.aClass20Array1322[i_0_].method215(false);
		System.gc();
		Canvas_Sub1.method37(-119, 2);
		Queue.anInt1442 = -1;
		if (i < -69) {
			Class55.aBoolean1071 = false;
			Class38.method1048(-15581);
			Class37_Sub4_Sub3.setGameState(10);
		}
	}

	public static Class37_Sub4_Sub18 method1285(byte i, int i_1_) {
		anInt1425++;
		Class37_Sub4_Sub18 class37_sub4_sub18 = ((Class37_Sub4_Sub18) Class37_Sub4_Sub3.aClass65_2558
				.get((long) i_1_));
		if (class37_sub4_sub18 != null)
			return class37_sub4_sub18;
		if (i <= 54)
			return null;
		byte[] is = Class14.aClass15_237.getFile(13, i_1_);
		class37_sub4_sub18 = new Class37_Sub4_Sub18();
		class37_sub4_sub18.anInt2902 = i_1_;
		if (is != null)
			class37_sub4_sub18.method732(new ByteVector(is), -181);
		Class37_Sub4_Sub3.aClass65_2558.put(class37_sub4_sub18, (long) i_1_);
		return class37_sub4_sub18;
	}

	public static void method1286(byte i) {
		anInt1422++;
		if (i != -39)
			method1284((byte) -31);
		boolean bool = false;
		while (!bool) {
			bool = true;
			for (int i_2_ = 0; ((i_2_ ^ 0xffffffff) > (Class37_Sub9_Sub13.anInt3134 - 1 ^ 0xffffffff)); i_2_++) {
				if (((Class37_Sub9_Sub20.anIntArray3300[i_2_] ^ 0xffffffff) > -1001)
						&& Class37_Sub9_Sub20.anIntArray3300[i_2_ + 1] > 1000) {
					bool = false;
					RSString rSString = Class37_Sub9_Sub37.aClass16Array3593[i_2_];
					Class37_Sub9_Sub37.aClass16Array3593[i_2_] = Class37_Sub9_Sub37.aClass16Array3593[i_2_
							- -1];
					Class37_Sub9_Sub37.aClass16Array3593[1 + i_2_] = rSString;
					RSString class16_3_ = Class37_Sub9_Sub14.aClass16Array3151[i_2_];
					Class37_Sub9_Sub14.aClass16Array3151[i_2_] = Class37_Sub9_Sub14.aClass16Array3151[i_2_
							- -1];
					Class37_Sub9_Sub14.aClass16Array3151[1 + i_2_] = class16_3_;
					int i_4_ = Class37_Sub9_Sub20.anIntArray3300[i_2_];
					Class37_Sub9_Sub20.anIntArray3300[i_2_] = Class37_Sub9_Sub20.anIntArray3300[i_2_
							- -1];
					Class37_Sub9_Sub20.anIntArray3300[i_2_ + 1] = i_4_;
					i_4_ = Deque.anIntArray1128[i_2_];
					Deque.anIntArray1128[i_2_] = Deque.anIntArray1128[1 + i_2_];
					Deque.anIntArray1128[i_2_ + 1] = i_4_;
					i_4_ = Class37_Sub4_Sub14.anIntArray2809[i_2_];
					Class37_Sub4_Sub14.anIntArray2809[i_2_] = Class37_Sub4_Sub14.anIntArray2809[1 + i_2_];
					Class37_Sub4_Sub14.anIntArray2809[i_2_ - -1] = i_4_;
					i_4_ = Class62.anIntArray1183[i_2_];
					Class62.anIntArray1183[i_2_] = Class62.anIntArray1183[1 + i_2_];
					Class62.anIntArray1183[i_2_ - -1] = i_4_;
				}
			}
		}
	}

	static {
		overridedInterfaces = new Hashtable(8);
		anInt1436 = 0;
		anInt1437 = 0;
		anInt1439 = 128;
	}
}
