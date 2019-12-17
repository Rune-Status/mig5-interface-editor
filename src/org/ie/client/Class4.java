package org.ie.client;

/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class4 {
	public static RSString aClass16_91 = Class37_Sub2.create_rsstring("Bitte versuchen Sie)1");
	public static Queue aClass77_92;
	public static volatile boolean aBoolean93;
	public int[] anIntArray94 = new int[256];
	public static int anInt95;
	public int anInt96;
	public int[] anIntArray97 = new int[256];
	public static RSString aClass16_98 = Class37_Sub2.create_rsstring("Verbindung mit Update)2Server)3)3)3");
	public static int anInt99;
	public static int anInt100;
	public static int anInt101;
	public int anInt102;
	public int anInt103;
	public int anInt104;
	public static RSString aClass16_105;
	public static int anInt106;
	public static RSString aClass16_107;
	public static long aLong108;

	public static void method49(int i) {
		aClass16_98 = null;
		aClass16_105 = null;
		aClass16_107 = null;
		aClass77_92 = null;
		if (i != 7)
			aClass16_98 = null;
		aClass16_91 = null;
	}

	public int method50(boolean bool) {
		anInt101++;
		if (bool != true)
			aClass16_107 = null;
		if ((anInt102-- ^ 0xffffffff) == -1) {
			method53(true);
			anInt102 = 255;
		}
		return 0; //anIntArray97[anInt102];
	}

	public void method51(int i) {
		anInt95++;
		int i_1_;
		int i_2_;
		int i_3_;
		int i_4_;
		int i_5_;
		int i_6_;
		int i_7_;
		int i_0_ = i_1_ = i_2_ = i_3_ = i_4_ = i_5_ = i_6_ = i_7_ = -1640531527;
		for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -5; i_8_++) {
			i_0_ ^= i_1_ << 850007787;
			i_3_ += i_0_;
			i_1_ += i_2_;
			i_1_ ^= i_2_ >>> 1376642722;
			i_2_ += i_3_;
			i_2_ ^= i_3_ << -2049024984;
			i_4_ += i_1_;
			i_3_ += i_4_;
			i_5_ += i_2_;
			i_3_ ^= i_4_ >>> -1036886224;
			i_4_ += i_5_;
			i_6_ += i_3_;
			i_4_ ^= i_5_ << -576222838;
			i_7_ += i_4_;
			i_5_ += i_6_;
			i_5_ ^= i_6_ >>> 1073484228;
			i_0_ += i_5_;
			i_6_ += i_7_;
			i_6_ ^= i_7_ << -2111823832;
			i_7_ += i_0_;
			i_7_ ^= i_0_ >>> -909603383;
			i_2_ += i_7_;
			i_1_ += i_6_;
			i_0_ += i_1_;
		}
		for (int i_9_ = 0; i_9_ < 256; i_9_ += 8) {
			i_7_ += anIntArray97[7 + i_9_];
			i_3_ += anIntArray97[i_9_ + 3];
			i_6_ += anIntArray97[6 + i_9_];
			i_0_ += anIntArray97[i_9_];
			i_4_ += anIntArray97[4 + i_9_];
			i_5_ += anIntArray97[i_9_ - -5];
			i_1_ += anIntArray97[1 + i_9_];
			i_0_ ^= i_1_ << 1234188043;
			i_3_ += i_0_;
			i_2_ += anIntArray97[2 + i_9_];
			i_1_ += i_2_;
			i_1_ ^= i_2_ >>> 926087106;
			i_2_ += i_3_;
			i_4_ += i_1_;
			i_2_ ^= i_3_ << -34466040;
			i_5_ += i_2_;
			i_3_ += i_4_;
			i_3_ ^= i_4_ >>> 28983472;
			i_4_ += i_5_;
			i_4_ ^= i_5_ << -1422846486;
			i_7_ += i_4_;
			i_6_ += i_3_;
			i_5_ += i_6_;
			i_5_ ^= i_6_ >>> 132231908;
			i_0_ += i_5_;
			i_6_ += i_7_;
			i_6_ ^= i_7_ << -121230008;
			i_7_ += i_0_;
			i_1_ += i_6_;
			i_7_ ^= i_0_ >>> 741269897;
			i_2_ += i_7_;
			i_0_ += i_1_;
			anIntArray94[i_9_] = i_0_;
			anIntArray94[i_9_ + 1] = i_1_;
			anIntArray94[i_9_ + 2] = i_2_;
			anIntArray94[3 + i_9_] = i_3_;
			anIntArray94[i_9_ + 4] = i_4_;
			anIntArray94[i_9_ - -5] = i_5_;
			anIntArray94[6 + i_9_] = i_6_;
			anIntArray94[i_9_ + 7] = i_7_;
		}
		for (int i_10_ = 0; i_10_ < 256; i_10_ += 8) {
			i_5_ += anIntArray94[i_10_ - -5];
			i_2_ += anIntArray94[i_10_ + 2];
			i_1_ += anIntArray94[i_10_ + 1];
			i_3_ += anIntArray94[i_10_ - -3];
			i_7_ += anIntArray94[7 + i_10_];
			i_4_ += anIntArray94[i_10_ + 4];
			i_6_ += anIntArray94[6 + i_10_];
			i_0_ += anIntArray94[i_10_];
			i_0_ ^= i_1_ << 918899179;
			i_1_ += i_2_;
			i_3_ += i_0_;
			i_1_ ^= i_2_ >>> 770520962;
			i_4_ += i_1_;
			i_2_ += i_3_;
			i_2_ ^= i_3_ << -1459658904;
			i_3_ += i_4_;
			i_5_ += i_2_;
			i_3_ ^= i_4_ >>> -729805968;
			i_4_ += i_5_;
			i_6_ += i_3_;
			i_4_ ^= i_5_ << -232997142;
			i_5_ += i_6_;
			i_7_ += i_4_;
			i_5_ ^= i_6_ >>> -889812700;
			i_6_ += i_7_;
			i_0_ += i_5_;
			i_6_ ^= i_7_ << 767169576;
			i_7_ += i_0_;
			i_7_ ^= i_0_ >>> 1375204009;
			i_2_ += i_7_;
			i_1_ += i_6_;
			i_0_ += i_1_;
			anIntArray94[i_10_] = i_0_;
			anIntArray94[1 + i_10_] = i_1_;
			anIntArray94[i_10_ + 2] = i_2_;
			anIntArray94[3 + i_10_] = i_3_;
			anIntArray94[i_10_ + 4] = i_4_;
			anIntArray94[i_10_ + 5] = i_5_;
			anIntArray94[6 + i_10_] = i_6_;
			anIntArray94[i_10_ + 7] = i_7_;
		}
		if (i == 8) {
			method53(true);
			anInt102 = 256;
		}
	}

	public static void method52(int i, int i_11_, boolean bool, int i_12_,
			int i_13_, Sprite class37_sub4_sub9_sub3) {
		anInt106++;
		if (bool == false) {
			int i_14_ = i_13_ * i_13_ + i_11_ * i_11_;
			if (i_14_ <= 4225 || i_14_ >= 90000)
				Class37_Sub25.method1043(i_12_, i_11_, class37_sub4_sub9_sub3,
						94, i, i_13_);
			else {
				int i_15_ = (Class37_Sub9_Sub37.anInt3590
						+ Class37_Sub14.anInt2127 & 0x7ff);
				int i_16_ = Rasterizer.anIntArray3910[i_15_];
				i_16_ = 256 * i_16_ / (Class78.anInt1458 + 256);
				int i_17_ = Rasterizer.anIntArray3929[i_15_];
				i_17_ = 256 * i_17_ / (256 + Class78.anInt1458);
				int i_18_ = i_16_ * i_13_ - -(i_17_ * i_11_) >> 857751824;
				int i_19_ = i_13_ * i_17_ - i_16_ * i_11_ >> -65436688;
				double d = Math.atan2((double) i_18_, (double) i_19_);
				int i_20_ = (int) (Math.sin(d) * 63.0);
				int i_21_ = (int) (57.0 * Math.cos(d));
				Class59.aClass37_Sub4_Sub9_Sub3_1135.method647(-10 + i_20_ + 94
						+ i + 4, -i_21_ + i_12_ - -83 - 20, 20, 20, 15, 15, d,
						256);
			}
		}
	}

	public Class4(int[] is) {
		for (int i = 0; (is.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
			anIntArray97[i] = is[i];
		method51(8);
	}

	public void method53(boolean bool) {
		anInt96 += ++anInt103;
		anInt99++;
		int i = 0;
		if (bool == true) {
			for (/**/; i < 256; i++) {
				int i_22_ = anIntArray94[i];
				if ((i & 0x2) != 0) {
					if ((0x1 & i ^ 0xffffffff) == -1)
						anInt104 ^= anInt104 << 1056626818;
					else
						anInt104 ^= anInt104 >>> -2008057808;
				} else if ((i & 0x1 ^ 0xffffffff) != -1)
					anInt104 ^= anInt104 >>> 362766630;
				else
					anInt104 ^= anInt104 << 1602569421;
				anInt104 += anIntArray94[128 + i & 0xff];
				int i_23_;
				anIntArray94[i] = i_23_ = anInt104
						+ ((anIntArray94[Class37_Sub4_Sub7.method490(255,
								i_22_ >> 2136761698)]) + anInt96);
				anIntArray97[i] = anInt96 = (i_22_ + (anIntArray94[Class37_Sub4_Sub7
						.method490(i_23_ >> 159208936, 1020) >> 789191330]));
			}
		}
	}

	static {
		aBoolean93 = true;
		aClass16_105 = Class37_Sub2.create_rsstring("titlebox");
		aClass77_92 = new Queue();
		aClass16_107 = Class37_Sub2.create_rsstring("60 Sekunden noch einmal)3)3)3");
	}
}
