package org.ie.client;

/* Class37_Sub4_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub4 extends NodeSub
{
    public static int anInt2563;
    public short[] aShortArray2564;
    public static RSString aClass16_2565;
    public static int anInt2566;
    public static int anInt2567;
    public static RSString aClass16_2568;
    public static int anInt2569;
    public boolean aBoolean2570;
    public int[] anIntArray2571;
    public int[] anIntArray2572 = { -1, -1, -1, -1, -1 };
    public static byte aByte2573;
    public static int anInt2574;
    public static RSString aClass16_2575
	= Class37_Sub2.create_rsstring("Too many connections from your address)3");
    public short[] aShortArray2576;
    public static int anInt2577;
    public static RSString aClass16_2578;
    public static RSInterface aClass18_2579;
    public static int anInt2580;
    public short[] aShortArray2581;
    public static RSString aClass16_2582;
    public static RSString aClass16_2583;
    public int anInt2584 = -1;
    public short[] aShortArray2585;
    public static RSString aClass16_2586;
    public static int anInt2587;
    public static int anInt2588;
    public static int anInt2589;
    public static RSString aClass16_2590;
    
    public static void method472(byte i) {
	anInt2577++;
	if (i < 99)
	    aClass16_2578 = null;
	Class82.aClass65_1713.clear();
    }
    
    public void method473(ByteVector class37_sub11, byte i) {
	anInt2569++;
	if (i <= -41) {
	    for (;;) {
		int i_0_ = class37_sub11.getUnsignedByte();
		if ((i_0_ ^ 0xffffffff) == -1)
		    break;
		method475(4224, class37_sub11, i_0_);
	    }
	}
    }
    
    public static void method474(boolean bool) {
	aClass18_2579 = null;
	aClass16_2586 = null;
	aClass16_2582 = null;
	aClass16_2568 = null;
	aClass16_2565 = null;
	aClass16_2583 = null;
	aClass16_2575 = null;
	if (bool != true)
	    aClass16_2568 = null;
	aClass16_2578 = null;
	aClass16_2590 = null;
    }
    
    public void method475(int i, ByteVector class37_sub11, int i_1_) {
	if ((i_1_ ^ 0xffffffff) != -2) {
	    if ((i_1_ ^ 0xffffffff) != -3) {
		if ((i_1_ ^ 0xffffffff) == -4)
		    aBoolean2570 = true;
		else if ((i_1_ ^ 0xffffffff) != -41) {
		    if ((i_1_ ^ 0xffffffff) == -42) {
			int i_2_ = class37_sub11.getUnsignedByte();
			aShortArray2564 = new short[i_2_];
			aShortArray2585 = new short[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
			    aShortArray2564[i_3_]
				= (short) class37_sub11.getUnsignedShort();
			    aShortArray2585[i_3_]
				= (short) class37_sub11.getUnsignedShort();
			}
		    } else if ((i_1_ ^ 0xffffffff) <= -61 && i_1_ < 70)
			anIntArray2572[-60 + i_1_]
			    = class37_sub11.getUnsignedShort();
		} else {
		    int i_4_ = class37_sub11.getUnsignedByte();
		    aShortArray2576 = new short[i_4_];
		    aShortArray2581 = new short[i_4_];
		    for (int i_5_ = 0;
			 (i_5_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_5_++) {
			aShortArray2576[i_5_]
			    = (short) class37_sub11.getUnsignedShort();
			aShortArray2581[i_5_]
			    = (short) class37_sub11.getUnsignedShort();
		    }
		}
	    } else {
		int i_6_ = class37_sub11.getUnsignedByte();
		anIntArray2571 = new int[i_6_];
		for (int i_7_ = 0; (i_6_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff);
		     i_7_++)
		    anIntArray2571[i_7_] = class37_sub11.getUnsignedShort();
	    }
	} else
	    anInt2584 = class37_sub11.getUnsignedByte();
	if (i == 4224)
	    anInt2563++;
    }
    
    public static void method476(int i, Class15 class15, int i_8_, int i_9_,
				 boolean bool, boolean bool_10_, int i_11_) {
	Class37_Sub13.anInt2118 = i_9_;
	Class37_Sub5.anInt1877 = i;
	Class37_Sub4_Sub7.anInt2639 = i_11_;
	anInt2567++;
	Class37_Sub9_Sub12.aBoolean3117 = bool;
	Class3.anInt89 = i_8_;
	Class37_Sub7.anInt1904 = 1;
	if (bool_10_ != true)
	    aClass16_2582 = null;
	Class84.aClass15_1534 = class15;
    }
    
    public boolean method477(byte i) {
	anInt2587++;
	if (i != 4)
	    anIntArray2571 = null;
	if (anIntArray2571 == null)
	    return true;
	boolean bool = true;
	for (int i_12_ = 0;
	     (anIntArray2571.length ^ 0xffffffff) < (i_12_ ^ 0xffffffff);
	     i_12_++) {
	    if (!Class37_Sub9_Sub15.aClass15_3159
		     .method115(-9350, anIntArray2571[i_12_], 0))
		bool = false;
	}
	return bool;
    }
    
    public Class37_Sub4_Sub7_Sub4 method478(int i) {
	anInt2566++;
	if (anIntArray2571 == null)
	    return null;
	Class37_Sub4_Sub7_Sub4[] class37_sub4_sub7_sub4s
	    = new Class37_Sub4_Sub7_Sub4[anIntArray2571.length];
	for (int i_13_ = i; i_13_ < anIntArray2571.length; i_13_++)
	    class37_sub4_sub7_sub4s[i_13_]
		= Class37_Sub4_Sub7_Sub4.method529((Class37_Sub9_Sub15
						    .aClass15_3159),
						   anIntArray2571[i_13_], 0);
	Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4;
	if ((class37_sub4_sub7_sub4s.length ^ 0xffffffff) == -2)
	    class37_sub4_sub7_sub4 = class37_sub4_sub7_sub4s[0];
	else
	    class37_sub4_sub7_sub4
		= new Class37_Sub4_Sub7_Sub4(class37_sub4_sub7_sub4s,
					     class37_sub4_sub7_sub4s.length);
	if (aShortArray2576 != null) {
	    for (int i_14_ = 0; i_14_ < aShortArray2576.length; i_14_++)
		class37_sub4_sub7_sub4.method535(aShortArray2576[i_14_],
						 aShortArray2581[i_14_]);
	}
	if (aShortArray2564 != null) {
	    for (int i_15_ = 0; i_15_ < aShortArray2564.length; i_15_++)
		class37_sub4_sub7_sub4.method525(aShortArray2564[i_15_],
						 aShortArray2585[i_15_]);
	}
	return class37_sub4_sub7_sub4;
    }
    
    public Class37_Sub4_Sub7_Sub4 method479(byte i) {
	Class37_Sub4_Sub7_Sub4[] class37_sub4_sub7_sub4s
	    = new Class37_Sub4_Sub7_Sub4[5];
	anInt2580++;
	int i_16_ = 0;
	for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -6; i_17_++) {
	    if (anIntArray2572[i_17_] != -1)
		class37_sub4_sub7_sub4s[i_16_++]
		    = Class37_Sub4_Sub7_Sub4.method529((Class37_Sub9_Sub15
							.aClass15_3159),
						       anIntArray2572[i_17_],
						       0);
	}
	Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4
	    = new Class37_Sub4_Sub7_Sub4(class37_sub4_sub7_sub4s, i_16_);
	if (aShortArray2576 != null) {
	    for (int i_18_ = 0; i_18_ < aShortArray2576.length; i_18_++)
		class37_sub4_sub7_sub4.method535(aShortArray2576[i_18_],
						 aShortArray2581[i_18_]);
	}
	if (aShortArray2564 != null) {
	    for (int i_19_ = 0;
		 (aShortArray2564.length ^ 0xffffffff) < (i_19_ ^ 0xffffffff);
		 i_19_++)
		class37_sub4_sub7_sub4.method525(aShortArray2564[i_19_],
						 aShortArray2585[i_19_]);
	}
	int i_20_ = 95 % ((i - -37) / 59);
	return class37_sub4_sub7_sub4;
    }
    
    public boolean method480(int i) {
	boolean bool = true;
	anInt2589++;
	if (i != -6)
	    anInt2588 = -104;
	for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > -6; i_21_++) {
	    if ((anIntArray2572[i_21_] ^ 0xffffffff) != 0
		&& !Class37_Sub9_Sub15.aClass15_3159
			.method115(-9350, anIntArray2572[i_21_], 0))
		bool = false;
	}
	return bool;
    }
    
    public Class37_Sub4_Sub4() {
	aBoolean2570 = false;
    }
    
    public static boolean method481(Class15 class15, Class15 class15_22_,
				    Class37_Sub3_Sub3 class37_sub3_sub3, int i,
				    Class15 class15_23_) {
	try {
	    Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635 = class37_sub3_sub3;
	    Class37_Sub9_Sub19.aClass15_3263 = class15_23_;
	    if (i != 7201)
		method472((byte) -44);
	    Class37_Sub17.aClass15_2160 = class15_22_;
	    anInt2574++;
	    Class37_Sub4_Sub15.aClass15_2835 = class15;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516
		      (runtimeexception,
		       ("bb.B(" + (class15 != null ? "{...}" : "null") + ','
			+ (class15_22_ != null ? "{...}" : "null") + ','
			+ (class37_sub3_sub3 != null ? "{...}" : "null") + ','
			+ i + ',' + (class15_23_ != null ? "{...}" : "null")
			+ ')'));
	}
    }
    
    static {
	aClass16_2565 = aClass16_2575;
	aClass16_2582 = Class37_Sub2.create_rsstring("(U");
	aClass16_2578 = Class37_Sub2.create_rsstring("au");
	aClass16_2583 = Class37_Sub2.create_rsstring("Type");
	aClass16_2568 = aClass16_2583;
	aClass16_2590 = Class37_Sub2.create_rsstring("null");
	aClass16_2586 = Class37_Sub2.create_rsstring("hitmarks");
    }
}
