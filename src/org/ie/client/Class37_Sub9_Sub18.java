package org.ie.client;

/* Class37_Sub9_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub18 extends Class37_Sub9
{
    public int anInt3228 = 1;
    public static int anInt3229;
    public static RSString aClass16_3230;
    public static int anInt3231;
    public static int anInt3232;
    public static int[] anIntArray3233;
    public static RSString aClass16_3234;
    public static RSString aClass16_3235;
    public static RSString aClass16_3236;
    public static RSString aClass16_3237
	= Class37_Sub2.create_rsstring("purple:");
    public static Deque[][][] aClass58ArrayArrayArray3238
	= new Deque[4][104][104];
    public static RSString aClass16_3239;
    public static RSString aClass16_3240;
    public static int anInt3241;
    public static int anInt3242;
    public static RSString aClass16_3243;
    public int anInt3244 = 1;
    public static RSString aClass16_3245;
    public static int anInt3246;
    
    public static void method835(byte i) {
	aClass16_3234 = null;
	aClass16_3240 = null;
	aClass16_3236 = null;
	aClass16_3243 = null;
	aClass16_3235 = null;
	aClass58ArrayArrayArray3238 = null;
	if (i == -107) {
	    aClass16_3239 = null;
	    aClass16_3245 = null;
	    anIntArray3233 = null;
	    aClass16_3230 = null;
	    aClass16_3237 = null;
	}
    }
    
    public Class37_Sub9_Sub18() {
	super(1, false);
    }
    
    public int[] method761(int i, int i_0_) {
	int[] is = aClass38_1966.method1049(i_0_, true);
	if (aClass38_1966.aBoolean850) {
	    int i_1_ = anInt3228 + anInt3228 - -1;
	    int i_2_ = 1 + (anInt3244 + anInt3244);
	    int[][] is_3_ = new int[i_1_][];
	    for (int i_4_ = i_0_ + -anInt3228;
		 (i_0_ + anInt3228 ^ 0xffffffff) <= (i_4_ ^ 0xffffffff);
		 i_4_++) {
		int[] is_5_
		    = this.method760((Class37_Sub4_Sub7_Sub1_Sub2.anInt3989
				      & i_4_),
				     0, -90);
		int[] is_6_ = new int[Class32.anInt743];
		int i_7_ = 0;
		for (int i_8_ = -anInt3244;
		     (i_8_ ^ 0xffffffff) >= (anInt3244 ^ 0xffffffff); i_8_++)
		    i_7_ += is_5_[Applet_Sub1.anInt12 & i_8_];
		int i_9_ = 0;
		while ((Class32.anInt743 ^ 0xffffffff) < (i_9_ ^ 0xffffffff)) {
		    is_6_[i_9_] = i_7_ / i_2_;
		    i_7_ -= is_5_[-anInt3244 + i_9_ & Applet_Sub1.anInt12];
		    i_9_++;
		    i_7_ += is_5_[anInt3244 + i_9_ & Applet_Sub1.anInt12];
		}
		is_3_[-i_0_ + (i_4_ - -anInt3228)] = is_6_;
	    }
	    for (int i_10_ = 0; Class32.anInt743 > i_10_; i_10_++) {
		int i_11_ = 0;
		for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff);
		     i_12_++)
		    i_11_ += is_3_[i_12_][i_10_];
		is[i_10_] = i_11_ / i_1_;
	    }
	}
	if (i >= -125)
	    return null;
	anInt3246++;
	return is;
    }
    
    public static void method836(boolean bool, int i, int i_13_, byte i_14_) {
	anInt3241++;
	if (i_14_ < 27)
	    anIntArray3233 = null;
	if (i_13_ < 8000 || i_13_ > 48000)
	    throw new IllegalArgumentException();
	Class37_Sub4_Sub10.aBoolean2690 = bool;
	Class33.anInt765 = i_13_;
	ClientScriptDef.anInt2622 = i;
    }
    
    public static int method837(ByteVector class37_sub11, int i,
				RSString rSString) {
	try {
	    anInt3232++;
	    if (i != 1)
		return -41;
	    int i_15_ = class37_sub11.pos;
	    class37_sub11.method951((byte) 37, rSString.anInt1650);
	    class37_sub11.pos
		+= (Class15_Sub1.aClass14_1746.method105
		    (32, class37_sub11.buf, 0,
		     class37_sub11.pos, rSString.anInt1650,
		     rSString.aByteArray1669));
	    return class37_sub11.pos + -i_15_;
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("nf.D("
						    + (class37_sub11 != null
						       ? "{...}" : "null")
						    + ',' + i + ','
						    + (rSString != null
						       ? "{...}" : "null")
						    + ')'));
	}
    }
    
    public void method750(ByteVector class37_sub11, int i, boolean bool) {
	if (bool != true)
	    method761(35, -6);
	int i_16_ = i;
    while_80_:
	do {
	    do {
		if (i_16_ != 0) {
		    if ((i_16_ ^ 0xffffffff) != -2) {
			if (i_16_ == 2)
			    break;
			break while_80_;
		    }
		} else {
		    anInt3244 = class37_sub11.getUnsignedByte();
		    break while_80_;
		}
		anInt3228 = class37_sub11.getUnsignedByte();
		break while_80_;
	    } while (false);
	    aBoolean1943 = class37_sub11.getUnsignedByte() == 1;
	} while (false);
	anInt3229++;
    }
    
    public int[][] method759(byte i, int i_17_) {
	anInt3231++;
	if (i < 111)
	    aClass16_3235 = null;
	int[][] is = aClass33_1946.method298(false, i_17_);
	if (aClass33_1946.aBoolean767) {
	    int i_18_ = 1 + anInt3228 + anInt3228;
	    int i_19_ = anInt3244 + anInt3244 - -1;
	    int[][][] is_20_ = new int[i_18_][][];
	    for (int i_21_ = -anInt3228 + i_17_; i_17_ + anInt3228 >= i_21_;
		 i_21_++) {
		int[][] is_22_
		    = this.method762(0, i_21_ & (Class37_Sub4_Sub7_Sub1_Sub2
						 .anInt3989), (byte) -116);
		int[][] is_23_ = new int[3][Class32.anInt743];
		int i_24_ = 0;
		int i_25_ = 0;
		int i_26_ = 0;
		int[] is_27_ = is_22_[1];
		int[] is_28_ = is_22_[0];
		int[] is_29_ = is_22_[2];
		for (int i_30_ = -anInt3244; i_30_ <= anInt3244; i_30_++) {
		    int i_31_ = Applet_Sub1.anInt12 & i_30_;
		    i_25_ += is_29_[i_31_];
		    i_26_ += is_27_[i_31_];
		    i_24_ += is_28_[i_31_];
		}
		int[] is_32_ = is_23_[0];
		int[] is_33_ = is_23_[1];
		int[] is_34_ = is_23_[2];
		int i_35_ = 0;
		while (Class32.anInt743 > i_35_) {
		    is_32_[i_35_] = i_24_ / i_19_;
		    is_33_[i_35_] = i_26_ / i_19_;
		    is_34_[i_35_] = i_25_ / i_19_;
		    int i_36_ = Applet_Sub1.anInt12 & i_35_ - anInt3244;
		    i_24_ -= is_28_[i_36_];
		    i_35_++;
		    i_26_ -= is_27_[i_36_];
		    i_25_ -= is_29_[i_36_];
		    i_36_ = Applet_Sub1.anInt12 & anInt3244 + i_35_;
		    i_26_ += is_27_[i_36_];
		    i_24_ += is_28_[i_36_];
		    i_25_ += is_29_[i_36_];
		}
		is_20_[-i_17_ + anInt3228 + i_21_] = is_23_;
	    }
	    int[] is_37_ = is[0];
	    int[] is_38_ = is[1];
	    int[] is_39_ = is[2];
	    for (int i_40_ = 0; i_40_ < Class32.anInt743; i_40_++) {
		int i_41_ = 0;
		int i_42_ = 0;
		int i_43_ = 0;
		for (int i_44_ = 0;
		     (i_18_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff); i_44_++) {
		    int[][] is_45_ = is_20_[i_44_];
		    i_41_ += is_45_[0][i_40_];
		    i_42_ += is_45_[2][i_40_];
		    i_43_ += is_45_[1][i_40_];
		}
		is_37_[i_40_] = i_41_ / i_18_;
		is_38_[i_40_] = i_43_ / i_18_;
		is_39_[i_40_] = i_42_ / i_18_;
	    }
	}
	return is;
    }
    
    static {
	anIntArray3233
	    = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
	aClass16_3234 = aClass16_3237;
	aClass16_3243 = aClass16_3237;
	aClass16_3239
	    = Class37_Sub2.create_rsstring("Your account is already logged in)3");
	aClass16_3236 = Class37_Sub2.create_rsstring("welle:");
	aClass16_3245 = Class37_Sub2.create_rsstring("green:");
	aClass16_3235 = aClass16_3245;
	aClass16_3240 = aClass16_3239;
	aClass16_3230 = aClass16_3245;
    }
}
