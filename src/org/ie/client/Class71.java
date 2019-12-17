package org.ie.client;

/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class71 {
	public static int anInt1355;
	public static volatile int currentMousePress;
	public static int anInt1357;
	public static RSString aClass16_1358;
	public static RSString aClass16_1359;
	public static long[] aLongArray1360;
	public static int anInt1361;
	public static int anInt1362 = 0;
	public static Class42 aClass42_1363;
	public static int[] anIntArray1364;
	public static RSString aClass16_1365;
	public static int anInt1366;
	public static int anInt1367;
	public static int anInt1368;
	public static RSString continueString;

	public static int method1260(int i, int i_0_, int i_1_, int i_2_) {
		anInt1355++;
		if (i_0_ != 100)
			method1263();
		i &= 0x3;
		if ((i ^ 0xffffffff) == -1)
			return i_2_;
		if (i == 1)
			return -i_1_ + 7;
		if (i == 2)
			return 7 - i_2_;
		return i_1_;
	}

	public static void method1261(int i) {
		if (i != -19)
			anInt1362 = 0;
		aLongArray1360 = null;
		aClass16_1359 = null;
		anIntArray1364 = null;
		continueString = null;
		aClass16_1358 = null;
		aClass42_1363 = null;
		aClass16_1365 = null;
	}

	public static void method1262(byte i) {
		if (i != 74)
			aClass16_1358 = null;
		ClientScriptDef.aBoolean2613 = false;
		Class67.aBoolean1282 = false;
		anInt1366++;
	}

	public static synchronized long method1263() {
		long l = System.currentTimeMillis();
		if (Class8.aLong157 > l)
			Class4.aLong108 += -l + Class8.aLong157;
		Class8.aLong157 = l;
		return l - -Class4.aLong108;
	}

	public static void method1264(byte i) {
		if (i != 74)
			method1260(-28, -38, 16, -24);
		for (Class37_Sub2 class37_sub2 = (Class37_Sub2) Class37_Sub9_Sub28.aClass58_3427
				.getFirst(); class37_sub2 != null; class37_sub2 = (Class37_Sub2) Class37_Sub9_Sub28.aClass58_3427
				.getNext()) {
			if ((class37_sub2.anInt1828 ^ 0xffffffff) < -1)
				class37_sub2.anInt1828--;
			if ((class37_sub2.anInt1828 ^ 0xffffffff) == -1) {
				if ((class37_sub2.anInt1830 ^ 0xffffffff) > -1
						|| Class37_Sub9_Sub2.method767(class37_sub2.anInt1827,
								(byte) 1, class37_sub2.anInt1830)) {
					Class37_Sub9_Sub16.method828(class37_sub2.anInt1827,
							class37_sub2.anInt1830, 126,
							class37_sub2.anInt1815, class37_sub2.anInt1829,
							class37_sub2.anInt1813, class37_sub2.anInt1834,
							class37_sub2.anInt1836);
					class37_sub2.unlink();
				}
			} else {
				if ((class37_sub2.anInt1816 ^ 0xffffffff) < -1)
					class37_sub2.anInt1816--;
				if (class37_sub2.anInt1816 == 0
						&& (class37_sub2.anInt1836 ^ 0xffffffff) <= -2
						&& class37_sub2.anInt1829 >= 1
						&& class37_sub2.anInt1836 <= 102
						&& class37_sub2.anInt1829 <= 102
						&& (class37_sub2.anInt1837 < 0 || Class37_Sub9_Sub2
								.method767(class37_sub2.anInt1823, (byte) 1,
										(class37_sub2.anInt1837)))) {
					Class37_Sub9_Sub16.method828(class37_sub2.anInt1823,
							class37_sub2.anInt1837, 106,
							class37_sub2.anInt1815, class37_sub2.anInt1829,
							class37_sub2.anInt1813, class37_sub2.anInt1833,
							class37_sub2.anInt1836);
					class37_sub2.anInt1816 = -1;
					if (class37_sub2.anInt1837 == class37_sub2.anInt1830
							&& (class37_sub2.anInt1830 ^ 0xffffffff) == 0)
						class37_sub2.unlink();
					else if (((class37_sub2.anInt1837 ^ 0xffffffff) == (class37_sub2.anInt1830 ^ 0xffffffff))
							&& ((class37_sub2.anInt1833 ^ 0xffffffff) == (class37_sub2.anInt1834 ^ 0xffffffff))
							&& (class37_sub2.anInt1827 == class37_sub2.anInt1823))
						class37_sub2.unlink();
				}
			}
		}
		anInt1357++;
	}

	public static void method1265(byte i) {
		Class37_Sub9_Sub3.aClass65_2940.clear();
		Class37_Sub9_Sub34.aClass65_3546.clear();
		if (i <= -113) {
			Class81.aClass65_1509.clear();
			anInt1367++;
		}
	}

	public static void method1266(int i) {
		anInt1361++;
		int i_3_ = Class37_Sub4_Sub13.anInt2794;
		int i_4_ = Class37_Sub9_Sub24.anInt3377;
		int i_5_ = Class15_Sub1.anInt1753;
		int i_6_ = 6116423;
		int i_7_ = Class37_Sub5.anInt1878;
		if (i != 8458)
			method1260(29, -33, -111, -82);
		Graphics2D.method578(i_3_, i_5_, i_4_, i_7_, i_6_);
		Graphics2D.method578(i_3_ + 1, 1 + i_5_, i_4_ - 2, 16, 0);
		Graphics2D.method595(i_3_ - -1, 18 + i_5_, -2 + i_4_,
				-19 + i_7_, 0);
		Class37_Sub4_Sub7_Sub2.aClass37_Sub4_Sub9_Sub2_Sub1_3724
				.method607(Class37_Sub9_Sub28.aClass16_3439, 3 + i_3_,
						i_5_ + 14, i_6_, -1);
		int i_8_ = Class37_Sub9_Sub1.lastMouseY;
		int i_9_ = Class37_Sub4_Sub7_Sub7.lastMouseX;
		for (int i_10_ = 0; i_10_ < Class37_Sub9_Sub13.anInt3134; i_10_++) {
			int i_11_ = i_5_
					+ (31 + 15 * (-1 + (Class37_Sub9_Sub13.anInt3134 - i_10_)));
			int i_12_ = 16777215;
			if ((i_9_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff)
					&& (i_9_ ^ 0xffffffff) > (i_3_ - -i_4_ ^ 0xffffffff)
					&& (i_8_ ^ 0xffffffff) < (-13 + i_11_ ^ 0xffffffff)
					&& i_11_ - -3 > i_8_)
				i_12_ = 16776960;
			Class37_Sub4_Sub7_Sub2.aClass37_Sub4_Sub9_Sub2_Sub1_3724.method607(
					Class37_Sub4_Sub7_Sub1_Sub2.method510(i_10_, 52), 3 + i_3_,
					i_11_, i_12_, 0);
		}
		Class33.method300((byte) -49, Class37_Sub5.anInt1878,
				Class37_Sub9_Sub24.anInt3377, Class37_Sub4_Sub13.anInt2794,
				Class15_Sub1.anInt1753);
	}

	static {
		aLongArray1360 = new long[200];
		aClass16_1359 = Class37_Sub2.create_rsstring("_");
		anIntArray1364 = new int[100];
		currentMousePress = 0;
		aClass16_1358 = Class37_Sub2.create_rsstring("Continue");
		aClass16_1365 = (Class37_Sub2.create_rsstring("Die Adresse dieses Computers wurde gesperrt)1"));
		continueString = aClass16_1358;
	}
}
