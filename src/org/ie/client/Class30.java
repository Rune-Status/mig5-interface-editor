package org.ie.client;

/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class30
{
    public static int[][] anIntArrayArray717 = new int[104][104];
    public static int anInt718;
    public static int[] anIntArray719 = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2,
					  2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
    public int anInt720;
    public static RSString aClass16_721
	= Class37_Sub2.create_rsstring("(U4");
    public static int anInt722;
    public static int anInt723;
    public int anInt724;
    public static int anInt725;
    public static RSString aClass16_726
	= Class37_Sub2.create_rsstring(" )2>");
    public int[][] anIntArrayArray727;
    
    public int method273(int i, byte i_0_) {
	if (anIntArrayArray727 != null)
	    i = 6 - -(int) ((long) anInt720 * (long) i / (long) anInt724);
	if (i_0_ != -17)
	    return 83;
	anInt725++;
	return i;
    }
    
    public int method274(int i, int i_1_) {
	anInt722++;
	if (anIntArrayArray727 != null)
	    i = (int) ((long) anInt720 * (long) i / (long) anInt724);
	int i_2_ = 88 % ((i_1_ - 18) / 42);
	return i;
    }
    
    public byte[] method275(int i, byte[] is) {
	anInt718++;
	if (anIntArrayArray727 != null) {
	    int i_3_
		= ((int) ((long) is.length * (long) anInt720 / (long) anInt724)
		   + 14);
	    int[] is_4_ = new int[i_3_];
	    int i_5_ = 0;
	    int i_6_ = 0;
	    for (int i_7_ = 0; is.length > i_7_; i_7_++) {
		int[] is_8_ = anIntArrayArray727[i_5_];
		int i_9_ = is[i_7_];
		for (int i_10_ = 0; i_10_ < 14; i_10_++)
		    is_4_[i_10_ + i_6_] += i_9_ * is_8_[i_10_];
		i_5_ += anInt720;
		int i_11_ = i_5_ / anInt724;
		i_6_ += i_11_;
		i_5_ -= i_11_ * anInt724;
	    }
	    is = new byte[i_3_];
	    for (int i_12_ = 0; i_12_ < i_3_; i_12_++) {
		int i_13_ = 32768 + is_4_[i_12_] >> -1094018352;
		if ((i_13_ ^ 0xffffffff) <= 127) {
		    if (i_13_ > 127)
			is[i_12_] = (byte) 127;
		    else
			is[i_12_] = (byte) i_13_;
		} else
		    is[i_12_] = (byte) -128;
	    }
	}
	if (i >= -117)
	    anInt720 = 43;
	return is;
    }
    
    public static void method276(byte i) {
	aClass16_721 = null;
	int i_14_ = -48 % ((i - -58) / 43);
	anIntArrayArray717 = null;
	aClass16_726 = null;
	anIntArray719 = null;
    }
    
    public static Class37_Sub4_Sub9_Sub1 method277
	(RSString rSString, int i, RSString class16_15_, Class15 class15) {
	try {
	    anInt723++;
	    int i_16_ = class15.method123((byte) 32, class16_15_);
	    int i_17_ = class15.method128(rSString, -97, i_16_);
	    if (i != -1094018352)
		aClass16_726 = null;
	    return Class37_Sub16.method1011(i_17_, i_16_, 120, class15);
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516
		      (runtimeexception,
		       ("ic.D(" + (rSString != null ? "{...}" : "null") + ','
			+ i + ',' + (class16_15_ != null ? "{...}" : "null")
			+ ',' + (class15 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public Class30(int i, int i_18_) {
	if ((i_18_ ^ 0xffffffff) != (i ^ 0xffffffff)) {
	    int i_19_ = Class37_Sub9_Sub28.method883((byte) 114, i_18_, i);
	    i /= i_19_;
	    i_18_ /= i_19_;
	    anIntArrayArray727 = new int[i][14];
	    anInt720 = i_18_;
	    anInt724 = i;
	    for (int i_20_ = 0; i_20_ < i; i_20_++) {
		double d = 6.0 + (double) i_20_ / (double) i;
		int[] is = anIntArrayArray727[i_20_];
		int i_21_ = (int) Math.floor(1.0 + (-7.0 + d));
		int i_22_ = (int) Math.ceil(7.0 + d);
		if (i_22_ > 14)
		    i_22_ = 14;
		if (i_21_ < 0)
		    i_21_ = 0;
		double d_23_ = (double) i_18_ / (double) i;
		for (/**/; (i_22_ ^ 0xffffffff) < (i_21_ ^ 0xffffffff);
		     i_21_++) {
		    double d_24_ = d_23_;
		    double d_25_ = ((double) i_21_ - d) * 3.141592653589793;
		    if (d_25_ < -1.0E-4 || d_25_ > 1.0E-4)
			d_24_ *= Math.sin(d_25_) / d_25_;
		    d_24_ *= 0.54 + 0.46 * Math.cos(((double) i_21_ - d)
						    * 0.2243994752564138);
		    is[i_21_] = (int) Math.floor(0.5 + d_24_ * 65536.0);
		}
	    }
	}
    }
}
