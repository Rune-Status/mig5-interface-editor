package org.ie.client;

/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class47 implements Runnable
{
    public static int anInt990;
    public Signlink aClass51_991;
    public static int anInt992;
    public volatile boolean aBoolean993;
    public static int[] anIntArray994
	= { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191,
	    16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151,
	    4194303, 8388607, 16777215, 33554431, 67108863, 134217727,
	    268435455, 536870911, 1073741823, 2147483647, -1 };
    public static RSInterface aClass18_995;
    public volatile Class24[] aClass24Array996 = new Class24[2];
    public volatile boolean aBoolean997 = false;
    public static RSString aClass16_998
	= Class37_Sub2.create_rsstring("sl_arrows");
    
    public void run() {
	aBoolean993 = true;
	try {
	    while (!aBoolean997) {
		for (int i = 0; i < 2; i++) {
		    Class24 class24 = aClass24Array996[i];
		    if (class24 != null)
			class24.method248(79);
		}
		Class37_Sub9_Sub20.method846(10L, (byte) 58);
		Class88.method1333((byte) -115, null, aClass51_991);
	    }
	} catch (Exception exception) {
	    Class37_Sub9_Sub3.method768(-53, null, exception);
	} finally {
	    aBoolean993 = false;
	}
	anInt992++;
    }
    
    public static void method1109
	(int i, Class37_Sub4_Sub9_Sub1 class37_sub4_sub9_sub1) {
	anInt990++;
	for (int i_0_ = 0; Class27.anIntArray677.length > i_0_; i_0_++)
	    Class27.anIntArray677[i_0_] = 0;
	int i_1_ = 256;
	for (int i_2_ = 0; i_2_ < 5000; i_2_++) {
	    int i_3_ = (int) ((double) i_1_ * (Math.random() * 128.0));
	    Class27.anIntArray677[i_3_] = (int) (Math.random() * 256.0);
	}
	for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -21; i_4_++) {
	    for (int i_5_ = 1; (i_5_ ^ 0xffffffff) > (-1 + i_1_ ^ 0xffffffff);
		 i_5_++) {
		for (int i_6_ = 1; i_6_ < 127; i_6_++) {
		    int i_7_ = (i_5_ << -486475673) + i_6_;
		    Class37_Sub9_Sub16.anIntArray3199[i_7_]
			= (Class27.anIntArray677[1 + i_7_]
			   + (Class27.anIntArray677[i_7_ + -1]
			      - -Class27.anIntArray677[i_7_ - 128])
			   - -Class27.anIntArray677[i_7_ + 128]) / 4;
		}
	    }
	    int[] is = Class27.anIntArray677;
	    Class27.anIntArray677 = Class37_Sub9_Sub16.anIntArray3199;
	    Class37_Sub9_Sub16.anIntArray3199 = is;
	}
	if (class37_sub4_sub9_sub1 != null) {
	    int i_8_ = 0;
	    for (int i_9_ = 0; i_9_ < class37_sub4_sub9_sub1.anInt3862;
		 i_9_++) {
		for (int i_10_ = 0; i_10_ < class37_sub4_sub9_sub1.anInt3865;
		     i_10_++) {
		    if (class37_sub4_sub9_sub1.aByteArray3860[i_8_++] != 0) {
			int i_11_
			    = class37_sub4_sub9_sub1.anInt3863 + (i_10_ + 16);
			int i_12_
			    = i_9_ + 16 - -class37_sub4_sub9_sub1.anInt3861;
			int i_13_ = (i_12_ << -2002478425) + i_11_;
			Class27.anIntArray677[i_13_] = 0;
		    }
		}
	    }
	}
	if (i != -4999)
	    aClass18_995 = null;
    }
    
    public static void method1110(int i) {
	anIntArray994 = null;
	aClass16_998 = null;
	aClass18_995 = null;
	if (i != 2)
	    method1109(-115, null);
    }
    
    public Class47() {
	aBoolean993 = false;
    }
}
