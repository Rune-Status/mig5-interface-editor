package org.ie.client;

/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class66
{
    public static RSString aClass16_1243;
    public static int anInt1244;
    public int anInt1245;
    public static int anInt1246;
    public int anInt1247;
    public static int anInt1248;
    public int anInt1249;
    public int anInt1250;
    public byte[] aByteArray1251;
    public byte[] aByteArray1252;
    public static int anInt1253;
    public int anInt1254;
    public static RSString aClass16_1255;
    public int anInt1256;
    public static int anInt1257;
    public static RSString aClass16_1258
	= Class37_Sub2.create_rsstring(" loggt sich ein)3");
    public static RSString aClass16_1259;
    public int anInt1260;
    public static int[] anIntArray1261;
    public static RSString aClass16_1262
	= Class37_Sub2.create_rsstring("Walk here");
    public static RSString aClass16_1263 = aClass16_1262;
    public static int anInt1264;
    
    public static void method1187(int i) {
	aClass16_1262 = null;
	aClass16_1258 = null;
	aClass16_1263 = null;
	if (i == -1) {
	    anIntArray1261 = null;
	    aClass16_1243 = null;
	    aClass16_1259 = null;
	    aClass16_1255 = null;
	}
    }
    
    public static boolean isVisible(RSInterface rSInterface) {
    	if (Class37_Sub3_Sub1.qaoptest) {
    		if ((RuntimeException_Sub1.get_click_mask(rSInterface) ^ 0xffffffff) != -1)
    			return false;
    		if ((rSInterface.type ^ 0xffffffff) == -1)
    			return false;
    	}
    	return rSInterface.hidden;
    }
    
    public static int method1189(int i, boolean bool, int i_0_) {
	anInt1248++;
	Class37_Sub13 class37_sub13
	    = ((Class37_Sub13)
	       Class37_Sub4_Sub7_Sub1.aClass13_3670.get((long) i));
	if (class37_sub13 == null)
	    return 0;
	if (i_0_ < 0 || i_0_ >= class37_sub13.anIntArray2108.length)
	    return 0;
	if (bool != true)
	    aClass16_1243 = null;
	return class37_sub13.anIntArray2108[i_0_];
    }
    
    public static void method1190(byte i, int i_1_, int i_2_, int i_3_) {
	if ((Canvas_Sub1.anInt45 ^ 0xffffffff) != -1 && i_2_ != 0
	    && Class37_Sub3_Sub1.anInt2329 < 50) {
	    Class46.anIntArray988[Class37_Sub3_Sub1.anInt2329] = i_3_;
	    Class37_Sub4_Sub10.anIntArray2681[Class37_Sub3_Sub1.anInt2329]
		= i_2_;
	    Class83.anIntArray1520[Class37_Sub3_Sub1.anInt2329] = i_1_;
	    Class37_Sub9_Sub32.aClass11Array3505[Class37_Sub3_Sub1.anInt2329]
		= null;
	    Class37_Sub4_Sub13.anIntArray2800[Class37_Sub3_Sub1.anInt2329] = 0;
	    Class37_Sub3_Sub1.anInt2329++;
	}
	anInt1253++;
	if (i != -100)
	    aClass16_1259 = null;
    }
    
    public static void method1191(byte i, int i_4_) {
	Class37_Sub9_Sub27.anInt3410 += 128 * i_4_;
	int i_5_ = 256;
	if ((Class27.anIntArray677.length ^ 0xffffffff)
	    > (Class37_Sub9_Sub27.anInt3410 ^ 0xffffffff)) {
	    Class37_Sub9_Sub27.anInt3410 -= Class27.anIntArray677.length;
	    int i_6_ = (int) (12.0 * Math.random());
	    Class47.method1109(-4999,
			       (Class37_Sub9_Sub33
				.aClass37_Sub4_Sub9_Sub1Array3523[i_6_]));
	}
	if (i >= -16)
	    aClass16_1258 = null;
	anInt1246++;
	int i_7_ = 0;
	int i_8_ = i_4_ * 128;
	int i_9_ = (-i_4_ + i_5_) * 128;
	for (int i_10_ = 0; (i_9_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
	     i_10_++) {
	    int i_11_ = (-((Class27.anIntArray677
			    [(-1 + Class27.anIntArray677.length
			      & Class37_Sub9_Sub27.anInt3410 + i_7_)])
			   * i_4_ / 6)
			 + Class52_Sub1.anIntArray2298[i_7_ + i_8_]);
	    if ((i_11_ ^ 0xffffffff) > -1)
		i_11_ = 0;
	    Class52_Sub1.anIntArray2298[i_7_++] = i_11_;
	}
	for (int i_12_ = i_5_ + -i_4_; i_12_ < i_5_; i_12_++) {
	    int i_13_ = i_12_ * 128;
	    for (int i_14_ = 0; i_14_ < 128; i_14_++) {
		int i_15_ = (int) (Math.random() * 100.0);
		if (i_15_ < 50 && i_14_ > 10 && i_14_ < 118)
		    Class52_Sub1.anIntArray2298[i_13_ + i_14_] = 255;
		else
		    Class52_Sub1.anIntArray2298[i_13_ + i_14_] = 0;
	    }
	}
	if ((Class37_Sub9_Sub9.anInt3080 ^ 0xffffffff) < -1)
	    Class37_Sub9_Sub9.anInt3080 -= i_4_ * 4;
	if (Class43.anInt959 > 0)
	    Class43.anInt959 -= 4 * i_4_;
	if ((Class43.anInt959 ^ 0xffffffff) == -1
	    && (Class37_Sub9_Sub9.anInt3080 ^ 0xffffffff) == -1) {
	    int i_16_ = (int) ((double) (2000 / i_4_) * Math.random());
	    if (i_16_ == 0)
		Class43.anInt959 = 1024;
	    if ((i_16_ ^ 0xffffffff) == -2)
		Class37_Sub9_Sub9.anInt3080 = 1024;
	}
	for (int i_17_ = 0; (i_5_ - i_4_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff);
	     i_17_++)
	    Class82.anIntArray1692[i_17_]
		= Class82.anIntArray1692[i_17_ + i_4_];
	for (int i_18_ = -i_4_ + i_5_; i_5_ > i_18_; i_18_++) {
	    Class82.anIntArray1692[i_18_]
		= (int) ((16.0
			  * Math.sin((double) Class37_Sub1.anInt1808 / 14.0))
			 + (Math.sin((double) Class37_Sub1.anInt1808 / 15.0)
			    * 14.0)
			 + (Math.sin((double) Class37_Sub1.anInt1808 / 16.0)
			    * 12.0));
	    Class37_Sub1.anInt1808++;
	}
	Class64.anInt1213 += i_4_;
	int i_19_ = ((Class37_Sub7.loopCycle & 0x1) + i_4_) / 2;
	if ((i_19_ ^ 0xffffffff) < -1) {
	    for (int i_20_ = 0; Class64.anInt1213 * 100 > i_20_; i_20_++) {
		int i_21_ = (int) (Math.random() * 128.0) - -128;
		int i_22_ = (int) (124.0 * Math.random()) - -2;
		Class52_Sub1.anIntArray2298[(i_21_ << 1611242727) + i_22_]
		    = 192;
	    }
	    Class64.anInt1213 = 0;
	    for (int i_23_ = 0; (i_5_ ^ 0xffffffff) < (i_23_ ^ 0xffffffff);
		 i_23_++) {
		int i_24_ = 0;
		int i_25_ = 128 * i_23_;
		for (int i_26_ = -i_19_; (i_26_ ^ 0xffffffff) > -129;
		     i_26_++) {
		    if (i_19_ + i_26_ < 128)
			i_24_
			    += Class52_Sub1.anIntArray2298[i_26_ - (-i_25_
								    + -i_19_)];
		    if ((i_26_ + -1 + -i_19_ ^ 0xffffffff) <= -1)
			i_24_ -= (Class52_Sub1.anIntArray2298
				  [i_26_ - (-i_25_ - -i_19_) + -1]);
		    if (i_26_ >= 0)
			Class33.anIntArray754[i_26_ + i_25_]
			    = i_24_ / (1 + 2 * i_19_);
		}
	    }
	    for (int i_27_ = 0; i_27_ < 128; i_27_++) {
		int i_28_ = 0;
		for (int i_29_ = -i_19_; i_5_ > i_29_; i_29_++) {
		    int i_30_ = i_29_ * 128;
		    if ((i_29_ + i_19_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff))
			i_28_ += (Class33.anIntArray754
				  [i_30_ + (i_27_ - -(i_19_ * 128))]);
		    if ((i_29_ + (-i_19_ + -1) ^ 0xffffffff) <= -1)
			i_28_ -= (Class33.anIntArray754
				  [i_30_ + i_27_ - (128 + 128 * i_19_)]);
		    if (i_29_ >= 0)
			Class52_Sub1.anIntArray2298[i_27_ - -i_30_]
			    = i_28_ / (2 * i_19_ - -1);
		}
	    }
	}
    }
    
    public static boolean method1192(int i, int i_31_) {
	anInt1264++;
	if (i_31_ >= 97 && (i_31_ ^ 0xffffffff) >= -123)
	    return true;
	if ((i_31_ ^ 0xffffffff) <= -66 && i_31_ <= 90)
	    return true;
	if (i >= -102)
	    return true;
	if ((i_31_ ^ 0xffffffff) <= -49 && (i_31_ ^ 0xffffffff) >= -58)
	    return true;
	return false;
    }
    
    static {
	aClass16_1255
	    = (Class37_Sub2.create_rsstring
	       ("RuneScape wird geladen )2 bitte warten)3)3)3"));
	aClass16_1259 = Class37_Sub2.create_rsstring("Login");
	aClass16_1243 = aClass16_1259;
    }
}
