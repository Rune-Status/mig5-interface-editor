package org.ie.client;

/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class73 {
	public static RSString aClass16_1378 = Class37_Sub2.create_rsstring("Loading fonts )2 ");
	public Class15 aClass15_1379;
	public Hashtable aClass13_1380 = new Hashtable(256);
	public static int anInt1381;
	public static int anInt1382;
	public static int anInt1383;
	public static RSString aClass16_1384;
	public static RSString aClass16_1385;
	public static RSString aClass16_1386;
	public static int anInt1387;
	public static int anInt1388;
	public static Class15 aClass15_1389;
	public static int anInt1390;
	public static RSString aClass16_1391 = aClass16_1378;
	public static RSString aClass16_1392;
	public static int anInt1393;
	public static int anInt1394;
	public Class15 aClass15_1395;
	public Hashtable aClass13_1396 = new Hashtable(256);

	public static void method1271(boolean bool) {
		aClass16_1378 = null;
		aClass16_1391 = null;
		aClass16_1384 = null;
		aClass15_1389 = null;
		aClass16_1386 = null;
		aClass16_1385 = null;
		if (bool != true)
			refreshInterface(null);
		aClass16_1392 = null;
	}

	public Class37_Sub22_Sub1 method1272(int i, int i_0_, int[] is, byte i_1_) {
		anInt1383++;
		int i_2_ = i ^ (0xfff4 & i_0_ << -243375260 | i_0_ >>> 467051116);
		i_2_ |= i_0_ << 205484208;
		long l = 0x100000000L ^ (long) i_2_;
		Class37_Sub22_Sub1 class37_sub22_sub1 = (Class37_Sub22_Sub1) aClass13_1396
				.get(l);
		if (class37_sub22_sub1 != null)
			return class37_sub22_sub1;
		if (is != null && (is[0] ^ 0xffffffff) >= -1)
			return null;
		Class37_Sub24 class37_sub24 = (Class37_Sub24) aClass13_1380.get(
				l);
		if (class37_sub24 == null) {
			class37_sub24 = Class37_Sub24.method1033(aClass15_1395, i_0_, i);
			if (class37_sub24 == null)
				return null;
			aClass13_1380.put(class37_sub24, l);
		}
		int i_3_ = 76 % ((19 - i_1_) / 63);
		class37_sub22_sub1 = class37_sub24.method1036(is);
		if (class37_sub22_sub1 == null)
			return null;
		class37_sub24.unlink();
		aClass13_1396.put(class37_sub22_sub1, l);
		return class37_sub22_sub1;
	}

	public static void method1273(int i) {
		anInt1382++;
		int i_4_ = Class37_Sub9.anInt1948 * 128 - -64;
		int i_5_ = Class37_Sub4_Sub11.anInt2697 * 128 - -64;
		int i_6_ = (RSString.method153(Class37_Sub9_Sub1.anInt2916, i_5_,
				i_4_) - Class37_Sub9_Sub11.anInt3106);
		if (Class19.anInt483 < i_4_) {
			Class19.anInt483 += ((i_4_ + -Class19.anInt483) * Class76.anInt1438
					/ 1000 + InterfaceListener.anInt1932);
			if (i_4_ < Class19.anInt483)
				Class19.anInt483 = i_4_;
		}
		if ((i_6_ ^ 0xffffffff) < (Class37_Sub25.anInt2286 ^ 0xffffffff)) {
			Class37_Sub25.anInt2286 += ((-Class37_Sub25.anInt2286 + i_6_)
					* Class76.anInt1438 / 1000)
					+ InterfaceListener.anInt1932;
			if ((i_6_ ^ 0xffffffff) > (Class37_Sub25.anInt2286 ^ 0xffffffff))
				Class37_Sub25.anInt2286 = i_6_;
		}
		if ((i_5_ ^ 0xffffffff) < (OverridedInterface.anInt1888 ^ 0xffffffff)) {
			OverridedInterface.anInt1888 += ((-OverridedInterface.anInt1888 + i_5_)
					* Class76.anInt1438 / 1000 + InterfaceListener.anInt1932);
			if (i_5_ < OverridedInterface.anInt1888)
				OverridedInterface.anInt1888 = i_5_;
		}
		if (OverridedInterface.anInt1888 > i_5_) {
			OverridedInterface.anInt1888 -= (Class76.anInt1438
					* (-i_5_ + OverridedInterface.anInt1888) / 1000 + InterfaceListener.anInt1932);
			if ((i_5_ ^ 0xffffffff) < (OverridedInterface.anInt1888 ^ 0xffffffff))
				OverridedInterface.anInt1888 = i_5_;
		}
		if (Class19.anInt483 > i_4_) {
			Class19.anInt483 -= (InterfaceListener.anInt1932 + Class76.anInt1438
					* (-i_4_ + Class19.anInt483) / 1000);
			if ((Class19.anInt483 ^ 0xffffffff) > (i_4_ ^ 0xffffffff))
				Class19.anInt483 = i_4_;
		}
		i_5_ = 128 * Class35.anInt785 - -64;
		if (Class37_Sub25.anInt2286 > i_6_) {
			Class37_Sub25.anInt2286 -= InterfaceListener.anInt1932
					- -((-i_6_ + Class37_Sub25.anInt2286) * Class76.anInt1438 / 1000);
			if ((i_6_ ^ 0xffffffff) < (Class37_Sub25.anInt2286 ^ 0xffffffff))
				Class37_Sub25.anInt2286 = i_6_;
		}
		i_4_ = 64 + 128 * Class37_Sub9_Sub11.anInt3094;
		i_6_ = RSString.method153(Class37_Sub9_Sub1.anInt2916, i_5_, i_4_)
				- Class37_Sub9_Sub22.anInt3333;
		int i_7_ = i_4_ - Class19.anInt483;
		int i_8_ = i_5_ - OverridedInterface.anInt1888;
		int i_9_ = -Class37_Sub25.anInt2286 + i_6_;
		int i_10_ = (int) Math.sqrt((double) (i_7_ * i_7_ + i_8_ * i_8_));
		int i_11_ = ((int) (325.949 * Math.atan2((double) i_9_, (double) i_10_)) & 0x7ff);
		int i_12_ = ((int) (-325.949 * Math.atan2((double) i_7_, (double) i_8_)) & 0x7ff);
		int i_13_ = -Class37_Sub17.anInt2188 + i_12_;
		if (i_11_ < 128)
			i_11_ = 128;
		if ((i_11_ ^ 0xffffffff) < -384)
			i_11_ = 383;
		if (Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 < i_11_) {
			Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 += ((Class6.anInt146
					* (i_11_ + -Class37_Sub4_Sub7_Sub1_Sub2.anInt3969) / 1000) + Class15.anInt259);
			if ((Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 ^ 0xffffffff) < (i_11_ ^ 0xffffffff))
				Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 = i_11_;
		}
		if ((i_13_ ^ 0xffffffff) < -1025)
			i_13_ -= 2048;
		if (i_13_ < -1024)
			i_13_ += 2048;
		if ((Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 ^ 0xffffffff) < (i_11_ ^ 0xffffffff)) {
			Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 -= (Class15.anInt259 - -((-i_11_ + Class37_Sub4_Sub7_Sub1_Sub2.anInt3969)
					* Class6.anInt146 / 1000));
			if (Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 < i_11_)
				Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 = i_11_;
		}
		if (i_13_ > 0) {
			Class37_Sub17.anInt2188 += Class15.anInt259
					- -(i_13_ * Class6.anInt146 / 1000);
			Class37_Sub17.anInt2188 &= 0x7ff;
		}
		if (i_13_ < 0) {
			Class37_Sub17.anInt2188 -= -i_13_ * Class6.anInt146 / 1000
					+ Class15.anInt259;
			Class37_Sub17.anInt2188 &= 0x7ff;
		}
		int i_14_ = -Class37_Sub17.anInt2188 + i_12_;
		if (i_14_ > 1024)
			i_14_ -= 2048;
		if ((i_14_ ^ 0xffffffff) > 1023)
			i_14_ += 2048;
		if ((i_14_ ^ 0xffffffff) > i && (i_13_ ^ 0xffffffff) < -1
				|| (i_14_ ^ 0xffffffff) < -1 && (i_13_ ^ 0xffffffff) > -1)
			Class37_Sub17.anInt2188 = i_12_;
	}

	public static void refreshInterface(RSInterface rSInterface) {
		if (rSInterface.lastDrawCycle == Hashtable.anInt216)
			Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[rSInterface.redrawId] = true;
	}

	public Class37_Sub22_Sub1 method1275(int[] is, int i, int i_15_) {
		anInt1387++;
		if ((aClass15_1395.method108((byte) -122) ^ 0xffffffff) == -2)
			return method1272(i_15_, 0, is, (byte) 99);
		if (i != 1023)
			return null;
		if ((aClass15_1395.method129(i_15_) ^ 0xffffffff) == -2)
			return method1272(0, i_15_, is, (byte) -64);
		throw new RuntimeException();
	}

	public Class37_Sub22_Sub1 method1276(int[] is, int i, int i_16_, byte i_17_) {
		anInt1381++;
		int i_18_ = i
				^ (i_16_ >>> 540501996 | (i_16_ & ~0x7ffff000) << 1736149412);
		i_18_ |= i_16_ << 2042518352;
		long l = (long) i_18_;
		Class37_Sub22_Sub1 class37_sub22_sub1 = (Class37_Sub22_Sub1) aClass13_1396
				.get(l);
		if (class37_sub22_sub1 != null)
			return class37_sub22_sub1;
		if (is != null && is[0] <= 0)
			return null;
		if (i_17_ < 62)
			aClass16_1378 = null;
		Class11 class11 = Class11.method88(aClass15_1379, i_16_, i);
		if (class11 == null)
			return null;
		class37_sub22_sub1 = class11.method86();
		aClass13_1396.put(class37_sub22_sub1, l);
		if (is != null)
			is[0] -= class37_sub22_sub1.aByteArray3632.length;
		return class37_sub22_sub1;
	}

	public Class37_Sub22_Sub1 method1277(int i, int[] is, byte i_19_) {
		anInt1390++;
		if (i_19_ <= 53)
			method1276(null, -31, -3, (byte) -19);
		if ((aClass15_1379.method108((byte) -102) ^ 0xffffffff) == -2)
			return method1276(is, i, 0, (byte) 100);
		if (aClass15_1379.method129(i) == 1)
			return method1276(is, 0, i, (byte) 75);
		throw new RuntimeException();
	}

	public Class73(Class15 class15, Class15 class15_20_) {
		try {
			aClass15_1395 = class15_20_;
			aClass15_1379 = class15;
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
					("tb.<init>(" + (class15 != null ? "{...}" : "null") + ','
							+ (class15_20_ != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anInt1388 = 0;
		aClass16_1384 = Class37_Sub2.create_rsstring(")4l");
		aClass16_1385 = Class37_Sub2.create_rsstring("flash3:");
		aClass16_1386 = aClass16_1385;
		aClass16_1392 = aClass16_1385;
	}
}
