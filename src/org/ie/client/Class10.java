package org.ie.client;

/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class10
{
    public static int anInt190;
    public static Class37_Sub4_Sub9_Sub1[] aClass37_Sub4_Sub9_Sub1Array191;
    public static int anInt192;
    public static int anInt193 = 0;
    public static int anInt194;
    public static int anInt195;
    public static int[] anIntArray196;
    public static boolean aBoolean197 = true;
    public static byte[][] aByteArrayArray198;
    public static Class69 aClass69_199;
    public static int anInt200;
    public static RSString aClass16_201
	= Class37_Sub2.create_rsstring("p12_full");
    
    public static int method83(int i, int i_0_, int i_1_, int i_2_) {
	int i_3_ = i / i_1_;
	anInt200++;
	int i_4_ = i & i_1_ + -1;
	if (i_2_ < 120)
	    method84(-36);
	int i_5_ = i_0_ / i_1_;
	int i_6_ = i_1_ + -1 & i_0_;
	int i_7_ = NodeSub.method431(i_5_, (byte) 25, i_3_);
	int i_8_ = NodeSub.method431(i_5_, (byte) -115, i_3_ + 1);
	int i_9_ = NodeSub.method431(1 + i_5_, (byte) 125, i_3_);
	int i_10_ = NodeSub.method431(i_5_ - -1, (byte) 94, 1 + i_3_);
	int i_11_ = Class85.method1322(i_8_, 2058356880, i_1_, i_4_, i_7_);
	int i_12_ = Class85.method1322(i_10_, 2058356880, i_1_, i_4_, i_9_);
	return Class85.method1322(i_12_, 2058356880, i_1_, i_6_, i_11_);
    }
    
    public static void method84(int i) {
	aByteArrayArray198 = null;
	aClass37_Sub4_Sub9_Sub1Array191 = null;
	if (i >= 31) {
	    aClass16_201 = null;
	    aClass69_199 = null;
	    anIntArray196 = null;
	}
    }
    
    public static int method85(int i, boolean bool) {
	anInt190++;
	if (bool != false)
	    method85(-18, true);
	return (i & 0x1f9bc) >> -184232693;
    }
}
