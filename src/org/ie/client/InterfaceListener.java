package org.ie.client;

/* Class37_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class InterfaceListener extends Node
{
    public static RSString aClass16_1920
	= Class37_Sub2.create_rsstring("::rect_debug");
    public static RSString aClass16_1921
	= Class37_Sub2.create_rsstring("Schrifts-=tze geladen)3");
    public RSInterface aClass18_1922;
    public int intData1;
    public static int anInt1924;
    public RSInterface aClass18_1925;
    public static RSString aClass16_1926
	= Class37_Sub2.create_rsstring("Malformed login packet)3");
    public int intData2;
    public int keyCode;
    public int keyChar;
    public static int anInt1930;
    public static RSString aClass16_1931;
    public static int anInt1932;
    public static Class56[] aClass56Array1933;
    public static int anInt1934;
    public static int anInt1935;
    public int anInt1936;
    public RSString aClass16_1937;
    public Object[] objectData;
    public static int[] anIntArray1939 = new int[2000];
    public static String aString1940;
    public static RSString aClass16_1941
	= (Class37_Sub2.create_rsstring
	   ("Wir vermuten)1 dass jemand Ihr Passwort kennt)3"));
    public static int anInt1942;
    
    public static void method745(int i, int i_0_, int i_1_, int i_2_,
				 int i_3_) {
	Class22.anInt579 = 0;
	for (int i_4_ = -1;
	     ((Class19.anInt487 - -Class76.anInt1436 ^ 0xffffffff)
	      < (i_4_ ^ 0xffffffff));
	     i_4_++) {
	    Class37_Sub4_Sub7_Sub1 class37_sub4_sub7_sub1;
	    if ((i_4_ ^ 0xffffffff) != 0) {
		if ((i_4_ ^ 0xffffffff) <= (Class19.anInt487 ^ 0xffffffff))
		    class37_sub4_sub7_sub1
			= (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111
			   [(Class37_Sub4_Sub16.anIntArray2869
			     [i_4_ - Class19.anInt487])]);
		else
		    class37_sub4_sub7_sub1
			= (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414
			   [Class26.anIntArray657[i_4_]]);
	    } else
		class37_sub4_sub7_sub1
		    = Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234;
	    if (class37_sub4_sub7_sub1 != null
		&& class37_sub4_sub7_sub1.method497(20542)) {
		if (class37_sub4_sub7_sub1
		    instanceof Class37_Sub4_Sub7_Sub1_Sub1) {
		    Class37_Sub4_Sub15 class37_sub4_sub15
			= (((Class37_Sub4_Sub7_Sub1_Sub1)
			    class37_sub4_sub7_sub1)
			   .aClass37_Sub4_Sub15_3955);
		    if (class37_sub4_sub15.anIntArray2824 != null)
			class37_sub4_sub15
			    = class37_sub4_sub15.method719((byte) -54);
		    if (class37_sub4_sub15 == null)
			continue;
		}
		if (i_4_ < Class19.anInt487) {
		    int i_5_ = 30;
		    Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2
			= (Class37_Sub4_Sub7_Sub1_Sub2) class37_sub4_sub7_sub1;
		    if (((class37_sub4_sub7_sub1_sub2.anInt3973 ^ 0xffffffff)
			 != 0)
			|| class37_sub4_sub7_sub1_sub2.anInt3980 != -1) {
			Class37_Sub9_Sub28.method885(class37_sub4_sub7_sub1,
						     (15
						      + (class37_sub4_sub7_sub1
							 .anInt3691)));
			if ((Class37_Sub23.anInt2232 ^ 0xffffffff) < 0) {
			    if ((class37_sub4_sub7_sub1_sub2.anInt3973
				 ^ 0xffffffff)
				!= 0) {
				Class32_Sub1
				    .aClass37_Sub4_Sub9_Sub3Array1785
				    [class37_sub4_sub7_sub1_sub2.anInt3973]
				    .method653
				    (-12 + i_0_ - -Class37_Sub23.anInt2232,
				     i + (ByteVector.anInt2014 + -i_5_));
				i_5_ += 25;
			    }
			    if (class37_sub4_sub7_sub1_sub2.anInt3980 != -1) {
				Class37_Sub9_Sub20
				    .aClass37_Sub4_Sub9_Sub3Array3302
				    [class37_sub4_sub7_sub1_sub2.anInt3980]
				    .method653
				    (-12 + (Class37_Sub23.anInt2232 + i_0_),
				     i - (-ByteVector.anInt2014 - -i_5_));
				i_5_ += 25;
			    }
			}
		    }
		    if (i_4_ >= 0
			&& (Class37_Sub9_Sub21.anInt3321 ^ 0xffffffff) == -11
			&& Class26.anIntArray657[i_4_] == Class2.anInt82) {
			Class37_Sub9_Sub28.method885(class37_sub4_sub7_sub1,
						     (15
						      + (class37_sub4_sub7_sub1
							 .anInt3691)));
			if ((Class37_Sub23.anInt2232 ^ 0xffffffff) < 0)
			    Class37_Sub25.aClass37_Sub4_Sub9_Sub3Array2291
				[1].method653
				(-12 + i_0_ + Class37_Sub23.anInt2232,
				 -i_5_ + (ByteVector.anInt2014 + i));
		    }
		} else {
		    Class37_Sub4_Sub15 class37_sub4_sub15
			= (((Class37_Sub4_Sub7_Sub1_Sub1)
			    class37_sub4_sub7_sub1)
			   .aClass37_Sub4_Sub15_3955);
		    if (class37_sub4_sub15.anIntArray2824 != null)
			class37_sub4_sub15
			    = class37_sub4_sub15.method719((byte) -58);
		    if (class37_sub4_sub15.anInt2829 >= 0
			&& ((Class37_Sub9_Sub20
			     .aClass37_Sub4_Sub9_Sub3Array3302).length
			    > class37_sub4_sub15.anInt2829)) {
			Class37_Sub9_Sub28.method885(class37_sub4_sub7_sub1,
						     (class37_sub4_sub7_sub1
						      .anInt3691) + 15);
			if ((Class37_Sub23.anInt2232 ^ 0xffffffff) < 0)
			    Class37_Sub9_Sub20
				.aClass37_Sub4_Sub9_Sub3Array3302
				[class37_sub4_sub15.anInt2829].method653
				(-12 + i_0_ + Class37_Sub23.anInt2232,
				 ByteVector.anInt2014 + (i + -30));
		    }
		    if (Class37_Sub9_Sub21.anInt3321 == 1
			&& (Class37_Sub4_Sub16.anIntArray2869
			    [-Class19.anInt487 + i_4_]) == Class50.anInt1016
			&& Class37_Sub7.loopCycle % 20 < 10) {
			Class37_Sub9_Sub28.method885(class37_sub4_sub7_sub1,
						     (class37_sub4_sub7_sub1
						      .anInt3691) + 15);
			if ((Class37_Sub23.anInt2232 ^ 0xffffffff) < 0)
			    Class37_Sub25.aClass37_Sub4_Sub9_Sub3Array2291
				[0].method653
				(-12 + (Class37_Sub23.anInt2232 + i_0_),
				 -28 + (ByteVector.anInt2014 + i));
		    }
		}
		if (class37_sub4_sub7_sub1.aClass16_3694 != null
		    && ((i_4_ ^ 0xffffffff) <= (Class19.anInt487 ^ 0xffffffff)
			|| Class37_Sub9_Sub24.anInt3361 == 0
			|| (Class37_Sub9_Sub24.anInt3361 ^ 0xffffffff) == -4
			|| ((Class37_Sub9_Sub24.anInt3361 ^ 0xffffffff) == -2
			    && (Class87.method1327
				(((Class37_Sub4_Sub7_Sub1_Sub2)
				  class37_sub4_sub7_sub1).aClass16_3993,
				 i_2_ + -40))))) {
		    Class37_Sub9_Sub28.method885(class37_sub4_sub7_sub1,
						 (class37_sub4_sub7_sub1
						  .anInt3691));
		    if (Class37_Sub23.anInt2232 > -1
			&& Class37_Sub9_Sub22.anInt3330 > Class22.anInt579) {
			Class37_Sub9_Sub22.anIntArray3342[Class22.anInt579]
			    = (Class37_Sub4_Sub7_Sub2
				   .aClass37_Sub4_Sub9_Sub2_Sub1_3724.method617
			       (class37_sub4_sub7_sub1.aClass16_3694)) / 2;
			Class37_Sub9_Sub22.anIntArray3340[Class22.anInt579]
			    = (Class37_Sub4_Sub7_Sub2
			       .aClass37_Sub4_Sub9_Sub2_Sub1_3724.anInt727);
			Class37_Sub9_Sub22.anIntArray3336[Class22.anInt579]
			    = Class37_Sub23.anInt2232;
			Class37_Sub9_Sub22.anIntArray3337[Class22.anInt579]
			    = ByteVector.anInt2014;
			Class37_Sub9_Sub22.anIntArray3344[Class22.anInt579]
			    = class37_sub4_sub7_sub1.anInt3658;
			Class37_Sub9_Sub22.anIntArray3325[Class22.anInt579]
			    = class37_sub4_sub7_sub1.anInt3673;
			Class37_Sub9_Sub22.anIntArray3334[Class22.anInt579]
			    = class37_sub4_sub7_sub1.anInt3662;
			Class37_Sub9_Sub22.aClass16Array3345[Class22.anInt579]
			    = class37_sub4_sub7_sub1.aClass16_3694;
			Class22.anInt579++;
		    }
		}
		if (class37_sub4_sub7_sub1.anInt3697
		    > Class37_Sub7.loopCycle) {
		    Class37_Sub9_Sub28.method885(class37_sub4_sub7_sub1,
						 15 + (class37_sub4_sub7_sub1
						       .anInt3691));
		    if (Class37_Sub23.anInt2232 > -1) {
			int i_6_ = (class37_sub4_sub7_sub1.anInt3692 * 30
				    / class37_sub4_sub7_sub1.anInt3690);
			if (i_6_ > 30)
			    i_6_ = 30;
			Graphics2D.method578
			    (-15 + (i_0_ - -Class37_Sub23.anInt2232),
			     i + ByteVector.anInt2014 + -3, i_6_, 5, 65280);
			Graphics2D.method578
			    (i_0_ + (Class37_Sub23.anInt2232 + (-15 + i_6_)),
			     -3 + ByteVector.anInt2014 + i, -i_6_ + 30, 5,
			     16711680);
		    }
		}
		for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -5; i_7_++) {
		    if (Class37_Sub7.loopCycle
			< class37_sub4_sub7_sub1.anIntArray3646[i_7_]) {
			Class37_Sub9_Sub28.method885(class37_sub4_sub7_sub1,
						     (class37_sub4_sub7_sub1
						      .anInt3691) / 2);
			if (Class37_Sub23.anInt2232 > -1) {
			    if ((i_7_ ^ 0xffffffff) == -2)
				ByteVector.anInt2014 -= 20;
			    if ((i_7_ ^ 0xffffffff) == -3) {
				ByteVector.anInt2014 -= 10;
				Class37_Sub23.anInt2232 -= 15;
			    }
			    if ((i_7_ ^ 0xffffffff) == -4) {
				ByteVector.anInt2014 -= 10;
				Class37_Sub23.anInt2232 += 15;
			    }
			    Class59.aClass37_Sub4_Sub9_Sub3Array1133
				[class37_sub4_sub7_sub1.anIntArray3674[i_7_]]
				.method653
				(-12 + i_0_ - -Class37_Sub23.anInt2232,
				 -12 + ByteVector.anInt2014 + i);
			    NodeSub.aClass37_Sub4_Sub9_Sub2_Sub1_1848
				.method606
				((Class37_Sub9_Sub24.method870
				  (class37_sub4_sub7_sub1.anIntArray3675[i_7_],
				   (byte) -114)),
				 -1 + (Class37_Sub23.anInt2232 + i_0_),
				 3 + (ByteVector.anInt2014 + i), 16777215,
				 0);
			}
		    }
		}
	    }
	}
	anInt1924++;
	if (i_2_ == -4) {
	    for (int i_8_ = 0; Class22.anInt579 > i_8_; i_8_++) {
		int i_9_ = Class37_Sub9_Sub22.anIntArray3336[i_8_];
		int i_10_ = Class37_Sub9_Sub22.anIntArray3342[i_8_];
		int i_11_ = Class37_Sub9_Sub22.anIntArray3337[i_8_];
		int i_12_ = Class37_Sub9_Sub22.anIntArray3340[i_8_];
		boolean bool = true;
		while (bool) {
		    bool = false;
		    for (int i_13_ = 0;
			 (i_13_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff); i_13_++) {
			if (((2 + i_11_ ^ 0xffffffff)
			     < ((-Class37_Sub9_Sub22.anIntArray3340[i_13_]
				 + Class37_Sub9_Sub22.anIntArray3337[i_13_])
				^ 0xffffffff))
			    && (2 + Class37_Sub9_Sub22.anIntArray3337[i_13_]
				^ 0xffffffff) < (i_11_ + -i_12_ ^ 0xffffffff)
			    && (i_9_ - i_10_
				< (Class37_Sub9_Sub22.anIntArray3342[i_13_]
				   + Class37_Sub9_Sub22.anIntArray3336[i_13_]))
			    && ((i_9_ + i_10_ ^ 0xffffffff)
				< ((-Class37_Sub9_Sub22.anIntArray3342[i_13_]
				    + Class37_Sub9_Sub22.anIntArray3336[i_13_])
				   ^ 0xffffffff))
			    && ((-Class37_Sub9_Sub22.anIntArray3340[i_13_]
				 + Class37_Sub9_Sub22.anIntArray3337[i_13_])
				< i_11_)) {
			    bool = true;
			    i_11_
				= (-Class37_Sub9_Sub22.anIntArray3340[i_13_]
				   + Class37_Sub9_Sub22.anIntArray3337[i_13_]);
			}
		    }
		}
		Class37_Sub23.anInt2232
		    = Class37_Sub9_Sub22.anIntArray3336[i_8_];
		ByteVector.anInt2014
		    = Class37_Sub9_Sub22.anIntArray3337[i_8_] = i_11_;
		RSString rSString = Class37_Sub9_Sub22.aClass16Array3345[i_8_];
		if ((Class59.anInt1130 ^ 0xffffffff) == -1) {
		    int i_14_ = 16776960;
		    if (Class37_Sub9_Sub22.anIntArray3344[i_8_] < 6)
			i_14_ = (Class37_Sub4_Sub3.anIntArray2562
				 [Class37_Sub9_Sub22.anIntArray3344[i_8_]]);
		    if ((Class37_Sub9_Sub22.anIntArray3344[i_8_] ^ 0xffffffff)
			== -7)
			i_14_ = (Class73.anInt1388 % 20 < 10 ? 16711680
				 : 16776960);
		    if ((Class37_Sub9_Sub22.anIntArray3344[i_8_] ^ 0xffffffff)
			== -8)
			i_14_ = Class73.anInt1388 % 20 >= 10 ? 65535 : 255;
		    if (Class37_Sub9_Sub22.anIntArray3344[i_8_] == 8)
			i_14_ = ((Class73.anInt1388 % 20 ^ 0xffffffff) > -11
				 ? 45056 : 8454016);
		    if (Class37_Sub9_Sub22.anIntArray3344[i_8_] == 9) {
			int i_15_
			    = 150 + -Class37_Sub9_Sub22.anIntArray3334[i_8_];
			if (i_15_ < 50)
			    i_14_ = 16711680 - -(1280 * i_15_);
			else if (i_15_ >= 100) {
			    if (i_15_ < 150)
				i_14_ = 65280 - -((-100 + i_15_) * 5);
			} else
			    i_14_ = 16776960 - (327680 * i_15_ + -16384000);
		    }
		    if (Class37_Sub9_Sub22.anIntArray3344[i_8_] == 10) {
			int i_16_
			    = 150 - Class37_Sub9_Sub22.anIntArray3334[i_8_];
			if ((i_16_ ^ 0xffffffff) <= -51) {
			    if (i_16_ < 100)
				i_14_ = -((i_16_ - 50) * 327680) + 16711935;
			    else if ((i_16_ ^ 0xffffffff) > -151)
				i_14_ = 255 - (32768000
					       + (-(i_16_ * 327680)
						  + 5 * (-100 + i_16_)));
			} else
			    i_14_ = 16711680 + 5 * i_16_;
		    }
		    if ((Class37_Sub9_Sub22.anIntArray3344[i_8_] ^ 0xffffffff)
			== -12) {
			int i_17_
			    = 150 - Class37_Sub9_Sub22.anIntArray3334[i_8_];
			if (i_17_ < 50)
			    i_14_ = 16777215 + -(327685 * i_17_);
			else if (i_17_ < 100)
			    i_14_ = -16384250 + (i_17_ * 327685 + 65280);
			else if (i_17_ < 150)
			    i_14_ = 16777215 - 327680 * (-100 + i_17_);
		    }
		    if ((Class37_Sub9_Sub22.anIntArray3325[i_8_] ^ 0xffffffff)
			== -1)
			Class37_Sub4_Sub7_Sub2
			    .aClass37_Sub4_Sub9_Sub2_Sub1_3724.method606
			    (rSString, i_0_ - -Class37_Sub23.anInt2232,
			     i + ByteVector.anInt2014, i_14_, 0);
		    if (Class37_Sub9_Sub22.anIntArray3325[i_8_] == 1)
			Class37_Sub4_Sub7_Sub2
			    .aClass37_Sub4_Sub9_Sub2_Sub1_3724.method604
			    (rSString, Class37_Sub23.anInt2232 + i_0_,
			     ByteVector.anInt2014 + i, i_14_, 0,
			     Class73.anInt1388);
		    if ((Class37_Sub9_Sub22.anIntArray3325[i_8_] ^ 0xffffffff)
			== -3)
			Class37_Sub4_Sub7_Sub2
			    .aClass37_Sub4_Sub9_Sub2_Sub1_3724.method609
			    (rSString, Class37_Sub23.anInt2232 + i_0_,
			     i + ByteVector.anInt2014, i_14_, 0,
			     Class73.anInt1388);
		    if ((Class37_Sub9_Sub22.anIntArray3325[i_8_] ^ 0xffffffff)
			== -4)
			Class37_Sub4_Sub7_Sub2
			    .aClass37_Sub4_Sub9_Sub2_Sub1_3724.method601
			    (rSString, Class37_Sub23.anInt2232 + i_0_,
			     i - -ByteVector.anInt2014, i_14_, 0,
			     Class73.anInt1388,
			     -Class37_Sub9_Sub22.anIntArray3334[i_8_] + 150);
		    if ((Class37_Sub9_Sub22.anIntArray3325[i_8_] ^ 0xffffffff)
			== -5) {
			int i_18_
			    = ((150 - Class37_Sub9_Sub22.anIntArray3334[i_8_])
			       * (Class37_Sub4_Sub7_Sub2
				      .aClass37_Sub4_Sub9_Sub2_Sub1_3724
				      .method617(rSString)
				  - -100)
			       / 150);
			Graphics2D.method592
			    (Class37_Sub23.anInt2232 + i_0_ + -50, i,
			     50 + i_0_ + Class37_Sub23.anInt2232, i_1_ + i);
			Class37_Sub4_Sub7_Sub2
			    .aClass37_Sub4_Sub9_Sub2_Sub1_3724.method607
			    (rSString,
			     -i_18_ + 50 + (i_0_ - -Class37_Sub23.anInt2232),
			     i + ByteVector.anInt2014, i_14_, 0);
			Graphics2D.setBounds(i_0_, i, i_3_ + i_0_,
						    i + i_1_);
		    }
		    if ((Class37_Sub9_Sub22.anIntArray3325[i_8_] ^ 0xffffffff)
			== -6) {
			int i_19_
			    = -Class37_Sub9_Sub22.anIntArray3334[i_8_] + 150;
			Graphics2D.method592
			    (i_0_,
			     (-(Class37_Sub4_Sub7_Sub2
				.aClass37_Sub4_Sub9_Sub2_Sub1_3724.anInt727)
			      + (i + ByteVector.anInt2014 + -1)),
			     i_3_ + i_0_, 5 + (i - -ByteVector.anInt2014));
			int i_20_ = 0;
			if (i_19_ < 25)
			    i_20_ = i_19_ + -25;
			else if (i_19_ > 125)
			    i_20_ = i_19_ - 125;
			Class37_Sub4_Sub7_Sub2
			    .aClass37_Sub4_Sub9_Sub2_Sub1_3724.method606
			    (rSString, i_0_ - -Class37_Sub23.anInt2232,
			     i - -ByteVector.anInt2014 + i_20_, i_14_, 0);
			Graphics2D.setBounds(i_0_, i, i_3_ + i_0_,
						    i + i_1_);
		    }
		} else
		    Class37_Sub4_Sub7_Sub2
			.aClass37_Sub4_Sub9_Sub2_Sub1_3724.method606
			(rSString, Class37_Sub23.anInt2232 + i_0_,
			 ByteVector.anInt2014 + i, 16776960, 0);
	    }
	}
    }
    
    public static void method746(byte i) {
	ClientScriptDef.aBoolean2613 = true;
	Class67.aBoolean1282 = true;
	anInt1935++;
	int i_21_ = -59 % ((i - 59) / 56);
    }
    
    public static void method747(int i) {
	if (i >= 3) {
	    Class64.aClass65_1210.clear();
	    anInt1930++;
	}
    }
    
    public static void method748(int i) {
	aClass16_1920 = null;
	aClass56Array1933 = null;
	aClass16_1921 = null;
	if (i != -1)
	    method747(-92);
	aClass16_1931 = null;
	aClass16_1941 = null;
	aString1940 = null;
	anIntArray1939 = null;
	aClass16_1926 = null;
    }
    
    static {
	aClass16_1931 = aClass16_1926;
    }
}
