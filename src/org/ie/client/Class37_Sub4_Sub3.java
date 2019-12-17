package org.ie.client;

import org.ie.Main;

/* Class37_Sub4_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub3 extends NodeSub {
	public static int anInt2542;
	public static int anInt2543;
	public static int anInt2544;
	public int anInt2545;
	public static int anInt2546;
	public static int anInt2547;
	public static int anInt2548;
	public int anInt2549;
	public static int anInt2550;
	public static int anInt2551;
	public static Class6 aClass6_2552 = new Class6();
	public static int anInt2553;
	public int anInt2554;
	public int anInt2555;
	public int anInt2556 = 0;
	public int anInt2557;
	public static Cache aClass65_2558 = new Cache(64);
	public static int anInt2559;
	public static int currentTypedKeyCode;
	public static RSString aClass16_2561;
	public static int[] anIntArray2562 = { 16776960, 16711680, 65280, 65535,
			16711935, 16777215 };

	public static void setGameState(int i) {
		/*
		 * System.out.println("set game state " + i); StackTraceElement[] stack
		 * = Thread.currentThread().getStackTrace(); for(StackTraceElement el :
		 * stack) { System.out.println(el); }
		 */
		anInt2559++;
		if ((i ^ 0xffffffff) != (Class32.anInt740 ^ 0xffffffff)) {
			if (Class32.anInt740 == 0)
				Class37_Sub3_Sub1.method349((byte) -99);
			if (i == 20 || i == 40) {
				Class37_Sub9_Sub23.anInt3355 = 0;
				Class22.anInt580 = 0;
				Class35.anInt781 = 0;
			}
			if (i != 20 && i != 40 && Class37_Sub11_Sub1.aClass19_3613 != null) {
				Class37_Sub11_Sub1.aClass19_3613.method209((byte) -128);
				Class37_Sub11_Sub1.aClass19_3613 = null;
			}
			if (Class32.anInt740 == 25) {
				Class37_Sub9_Sub31.anInt3487 = 0;
				Class37_Sub4_Sub7_Sub1_Sub1.anInt3942 = 1;
				Class76.anInt1437 = 0;
				Class37_Sub9_Sub3.anInt2954 = 1;
				client.anInt1734 = 0;
			}
			if ((i ^ 0xffffffff) != -6 && i != 10 && (i ^ 0xffffffff) != -21)
				Class14.method106(-124);
			else
				Class37_Sub15.method1009(Class60.aClass15_Sub1_1151,
						Class37_Sub9.aCanvas1967, -3473,
						Class52_Sub1.aClass15_Sub1_2309);
			Class32.anInt740 = i;
		}
		if (i == 30) {
			System.out.println("entering game");
			int i_81_ = 100;
		    Main.gamepanel = i_81_;
		    InterfaceClickMask.resetComponentAnimation(i_81_);
		    Class87.executeOnStartScript(Main.gamepanel);
		    for (int i_82_ = 0; (i_82_ ^ 0xffffffff) > -101; i_82_++)
		    	Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_82_] = true;
		    /*Class37_Sub9_Sub17.anInt3225 = -1;
		    
		    int[] sidebars = new int[] { 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112 };
			for(int sidebar : sidebars) {
				int i_21_ = 0;
				int i_22_ = 548;
				int i_23_ = sidebar << 16 | 90;
				Class37_Sub6 class37_sub6 = ((Class37_Sub6) Class76.aClass13_1423.get((long) i_23_));
				if (class37_sub6 != null)
					Class37_Sub11_Sub1.method992(-1494101117, class37_sub6, (i_22_ != class37_sub6.anInt1884));
				Class37_Sub4_Sub16.method724(i_21_, i_22_, i_23_, -17421);
			}*/
		    
		    /*int i_21_ = 0;
			int i_22_ = 12;
			int i_23_ = 548 << 16 | 75; //75 + 548
			Class37_Sub6 class37_sub6 = ((Class37_Sub6) Class76.aClass13_1423.method100((byte) 96, (long) i_23_));
			if (class37_sub6 != null)
				Class37_Sub11_Sub1.method992(-1494101117, class37_sub6, (i_22_ != class37_sub6.anInt1884));
			Class37_Sub4_Sub16.method724(i_21_, i_22_, i_23_, -17421);*/
		}
	}

	public void method462(boolean bool, ByteVector class37_sub11, int i) {
		anInt2546++;
		for (;;) {
			int i_1_ = class37_sub11.getUnsignedByte();
			if ((i_1_ ^ 0xffffffff) == -1)
				break;
			method464(i_1_, class37_sub11, false, i);
		}
		if (bool != true)
			anIntArray2562 = null;
	}

	public void method463(int i, boolean bool) {
		anInt2547++;
		double d = (double) (i & 0xff) / 256.0;
		double d_2_ = (double) (0xff & i >> -514816280) / 256.0;
		double d_3_ = (double) (i >> -2063443600 & 0xff) / 256.0;
		double d_4_ = d_3_;
		if (d_2_ > d_4_)
			d_4_ = d_2_;
		double d_5_ = d_3_;
		if (d_4_ < d)
			d_4_ = d;
		if (d_2_ < d_5_)
			d_5_ = d_2_;
		if (d_5_ > d)
			d_5_ = d;
		double d_6_ = 0.0;
		if (bool != false)
			method463(-37, false);
		double d_7_ = 0.0;
		double d_8_ = (d_4_ + d_5_) / 2.0;
		anInt2545 = (int) (256.0 * d_8_);
		if ((anInt2545 ^ 0xffffffff) > -1)
			anInt2545 = 0;
		else if ((anInt2545 ^ 0xffffffff) < -256)
			anInt2545 = 255;
		if (d_5_ != d_4_) {
			if (d_4_ == d_3_)
				d_6_ = (-d + d_2_) / (d_4_ - d_5_);
			else if (d_2_ != d_4_) {
				if (d_4_ == d)
					d_6_ = (d_3_ - d_2_) / (-d_5_ + d_4_) + 4.0;
			} else
				d_6_ = 2.0 + (d - d_3_) / (-d_5_ + d_4_);
			if (d_8_ < 0.5)
				d_7_ = (d_4_ - d_5_) / (d_5_ + d_4_);
			if (d_8_ >= 0.5)
				d_7_ = (d_4_ - d_5_) / (-d_4_ + 2.0 - d_5_);
		}
		if (d_8_ > 0.5)
			anInt2549 = (int) (512.0 * ((1.0 - d_8_) * d_7_));
		else
			anInt2549 = (int) (d_7_ * d_8_ * 512.0);
		d_6_ /= 6.0;
		anInt2557 = (int) (256.0 * d_7_);
		if ((anInt2549 ^ 0xffffffff) > -2)
			anInt2549 = 1;
		anInt2555 = (int) (d_6_ * (double) anInt2549);
		if ((anInt2557 ^ 0xffffffff) > -1)
			anInt2557 = 0;
		else if (anInt2557 > 255)
			anInt2557 = 255;
	}

	public void method464(int i, ByteVector class37_sub11, boolean bool,
			int i_9_) {
		if ((i ^ 0xffffffff) == -2)
			anInt2556 = class37_sub11.getTriByte(-26256544);
		else if ((i ^ 0xffffffff) == -3) {
			anInt2554 = class37_sub11.getUnsignedShort();
			if (anInt2554 == 65535)
				anInt2554 = -1;
		}
		if (bool == false)
			anInt2553++;
	}

	public static void method465(int i) {
		anIntArray2562 = null;
		aClass65_2558 = null;
		aClass16_2561 = null;
		aClass6_2552 = null;
		int i_10_ = -105 % ((i - 78) / 33);
	}

	public static int method466(int i, int i_11_) {
		anInt2550++;
		i = --i | i >>> -1994674367;
		if (i_11_ != -696398748)
			method471(false, null, -16, null);
		i |= i >>> 9881506;
		i |= i >>> -696398748;
		i |= i >>> -1512850936;
		i |= i >>> 2014760272;
		return i + 1;
	}

	public static boolean method467(byte i, RSString rSString) {
		if (i != -35)
			anIntArray2562 = null;
		anInt2542++;
		if (rSString == null)
			return false;
		for (int i_12_ = 0; RSInterface.anInt340 > i_12_; i_12_++) {
			if (rSString.method159(RSInterface.aClass16Array332[i_12_],
					(byte) 84))
				return true;
		}
		return false;
	}

	public void method468(boolean bool) {
		anInt2544++;
		method463(anInt2556, bool);
	}

	public static void method469(Class15 class15, Class15 class15_13_, int i) {
		try {
			if (i > 113) {
				RSString.aClass15_1645 = class15_13_;
				anInt2543++;
				Class37_Sub9_Sub7.aClass15_3031 = class15;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3
					.method516(runtimeexception, ("af.D("
							+ (class15 != null ? "{...}" : "null") + ','
							+ (class15_13_ != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	public static boolean method470(RSInterface rSInterface, int i) {
		anInt2548++;
		if (rSInterface.valueCompareType == null)
			return false;
		for (int i_14_ = 0; ((i_14_ ^ 0xffffffff) > (rSInterface.valueCompareType.length ^ 0xffffffff)); i_14_++) {
			int i_15_ = Class38.method1050(-29842, i_14_, rSInterface);
			int i_16_ = rSInterface.requiredValues[i_14_];
			if (rSInterface.valueCompareType[i_14_] != 2) {
				if (rSInterface.valueCompareType[i_14_] != 3) {
					if (rSInterface.valueCompareType[i_14_] == 4) {
						if ((i_16_ ^ 0xffffffff) == (i_15_ ^ 0xffffffff))
							return false;
					} else if ((i_16_ ^ 0xffffffff) != (i_15_ ^ 0xffffffff))
						return false;
				} else if ((i_15_ ^ 0xffffffff) >= (i_16_ ^ 0xffffffff))
					return false;
			} else if (i_16_ <= i_15_)
				return false;
		}
		if (i != 4)
			aClass16_2561 = null;
		return true;
	}

	public static void method471(boolean bool, byte[] is, int i, Class69 class69) {
		try {
			Class37_Sub5 class37_sub5 = new Class37_Sub5();
			anInt2551++;
			class37_sub5.anInt1867 = 0;
			class37_sub5.aClass69_1866 = class69;
			class37_sub5.hash = (long) i;
			class37_sub5.aByteArray1863 = is;
			synchronized (Class37_Sub9_Sub34.aClass58_3557) {
				Class37_Sub9_Sub34.aClass58_3557.addLast(class37_sub5);
			}
			InterfaceClickMask.method926(bool);
		} catch (RuntimeException runtimeexception) {
			throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception, ("af.J("
					+ bool + ',' + (is != null ? "{...}" : "null") + ',' + i
					+ ',' + (class69 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class37_Sub4_Sub3() {
		anInt2554 = -1;
	}

	static {
		aClass16_2561 = (Class37_Sub2.create_rsstring("Begeben Sie sich in ein freies Gebiet)1 um"));
	}
}
