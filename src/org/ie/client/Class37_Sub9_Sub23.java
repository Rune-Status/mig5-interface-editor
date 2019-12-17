package org.ie.client;

/* Class37_Sub9_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub23 extends Class37_Sub9
{
    public static Cache aClass65_3346;
    public static RSString aClass16_3347;
    public static RSString aClass16_3348
	= Class37_Sub2.create_rsstring("Cancel");
    public static int anInt3349;
    public static RSString aClass16_3350
	= Class37_Sub2.create_rsstring("<)4col> x");
    public int anInt3351 = 4096;
    public static int anInt3352;
    public static int anInt3353;
    public static int[] anIntArray3354;
    public static int anInt3355;
    public static int anInt3356;
    public static int[] anIntArray3357;
    public static int anInt3358;
    public static volatile int currentMouseY;
    
    public static void method865(int i, byte i_0_, int i_1_, byte[] is,
				 Class67 class67, Class20[] class20s) {
	try {
	    int i_2_ = 117 % ((-22 - i_0_) / 34);
	    anInt3353++;
	    int i_3_ = -1;
	    ByteVector class37_sub11 = new ByteVector(is);
	    for (;;) {
		int i_4_ = class37_sub11.method961(255);
		if ((i_4_ ^ 0xffffffff) == -1)
		    break;
		int i_5_ = 0;
		i_3_ += i_4_;
		for (;;) {
		    int i_6_ = class37_sub11.method961(255);
		    if ((i_6_ ^ 0xffffffff) == -1)
			break;
		    i_5_ += i_6_ + -1;
		    int i_7_ = i_5_ & 0x3f;
		    int i_8_ = (0xfed & i_5_) >> 1518628070;
		    int i_9_ = class37_sub11.getUnsignedByte();
		    int i_10_ = i_5_ >> -2047489876;
		    int i_11_ = i_9_ >> 1047838978;
		    int i_12_ = i + i_7_;
		    int i_13_ = i_1_ + i_8_;
		    int i_14_ = i_9_ & 0x3;
		    if ((i_13_ ^ 0xffffffff) < -1 && (i_12_ ^ 0xffffffff) < -1
			&& (i_13_ ^ 0xffffffff) > -104
			&& (i_12_ ^ 0xffffffff) > -104) {
			Class20 class20 = null;
			int i_15_ = i_10_;
			if ((Class1.aByteArrayArrayArray63[1][i_13_][i_12_]
			     & 0x2)
			    == 2)
			    i_15_--;
			if (i_15_ >= 0)
			    class20 = class20s[i_15_];
			Class56.method1144(i_3_, i_11_, i_14_, i_10_, class67,
					   false, i_12_, i_13_, class20);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516
		      (runtimeexception,
		       ("qe.B(" + i + ',' + i_0_ + ',' + i_1_ + ','
			+ (is != null ? "{...}" : "null") + ','
			+ (class67 != null ? "{...}" : "null") + ','
			+ (class20s != null ? "{...}" : "null") + ')'));
	}
    }
    
    public int[] method761(int i, int i_16_) {
	if (i >= -125)
	    anInt3355 = -70;
	int[] is = aClass38_1966.method1049(i_16_, true);
	if (aClass38_1966.aBoolean850) {
	    int[] is_17_
		= this.method760((Class37_Sub4_Sub7_Sub1_Sub2.anInt3989
				  & -1 + i_16_),
				 0, -61);
	    int[] is_18_ = this.method760(i_16_, 0, -44);
	    int[] is_19_
		= this.method760((1 + i_16_
				  & Class37_Sub4_Sub7_Sub1_Sub2.anInt3989),
				 0, -95);
	    for (int i_20_ = 0; i_20_ < Class32.anInt743; i_20_++) {
		int i_21_ = anInt3351 * (is_19_[i_20_] + -is_17_[i_20_]);
		int i_22_ = ((-is_18_[Applet_Sub1.anInt12 & -1 + i_20_]
			      + is_18_[1 + i_20_ & Applet_Sub1.anInt12])
			     * anInt3351);
		int i_23_ = i_22_ >> 1682405548;
		int i_24_ = i_23_ * i_23_ >> 788465580;
		int i_25_ = i_21_ >> -1752164468;
		int i_26_ = i_25_ * i_25_ >> 1471192140;
		int i_27_
		    = (int) (4096.0
			     * Math.sqrt((double) ((4096 + (i_26_ + i_24_))
						   / 4096)));
		int i_28_ = i_27_ == 0 ? 0 : 16777216 / i_27_;
		is[i_20_] = 4096 + -i_28_;
	    }
	}
	anInt3349++;
	return is;
    }
    
    public Class37_Sub9_Sub23() {
	super(1, true);
    }
    
    public static void method866(byte i) {
	anIntArray3354 = null;
	aClass16_3347 = null;
	aClass16_3348 = null;
	aClass65_3346 = null;
	anIntArray3357 = null;
	aClass16_3350 = null;
	if (i != -122)
	    method865(-47, (byte) -83, -14, null, null, null);
    }
    
    public void method750(ByteVector class37_sub11, int i, boolean bool) {
	if (bool != true)
	    anIntArray3357 = null;
	if (i == 0)
	    anInt3351 = class37_sub11.getUnsignedShort();
	anInt3352++;
    }
    
    static {
	aClass16_3347 = aClass16_3348;
	aClass65_3346 = new Cache(500);
	anInt3355 = 0;
	anInt3358 = 0;
	currentMouseY = -1;
    }
}
