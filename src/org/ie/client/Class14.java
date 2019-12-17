package org.ie.client;

/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class14
{
    public int[] anIntArray233;
    public static RSString aClass16_234;
    public byte[] aByteArray235;
    public static int anInt236;
    public static Class15 aClass15_237;
    public static Sprite aClass37_Sub4_Sub9_Sub3_238;
    public static int anInt239;
    public static Class37_Sub18[] aClass37_Sub18Array240;
    public int[] anIntArray241;
    public static Class15_Sub1 aClass15_Sub1_242;
    public static int anInt243;
    public static int anInt244;
    public static RSString aClass16_245
	= Class37_Sub2.create_rsstring("Please wait)3)3)3");
    public static int anInt246;
    public static RSString aClass16_247;
    public static int[] intStack = new int[1000];
    public static int anInt249;
    public static int[] anIntArray250;
    public static int anInt251;
    public static RSString aClass16_252;
    
    public int method103(byte[] is, int i, int i_0_, byte[] is_1_, int i_2_,
			 int i_3_) {
	try {
	    anInt239++;
	    if ((i_2_ ^ 0xffffffff) == -1)
		return 0;
	    i_2_ += i_3_;
	    int i_4_ = 0;
	    int i_5_ = -61 / ((i_0_ - -79) / 41);
	    int i_6_ = i;
	    for (;;) {
		byte i_7_ = is_1_[i_6_];
		if ((i_7_ ^ 0xffffffff) <= -1)
		    i_4_++;
		else
		    i_4_ = anIntArray241[i_4_];
		int i_8_;
		if ((i_8_ = anIntArray241[i_4_]) < 0) {
		    is[i_3_++] = (byte) (i_8_ ^ 0xffffffff);
		    if (i_2_ <= i_3_)
			break;
		    i_4_ = 0;
		}
		if ((i_7_ & 0x40 ^ 0xffffffff) != -1)
		    i_4_ = anIntArray241[i_4_];
		else
		    i_4_++;
		if ((i_8_ = anIntArray241[i_4_]) < 0) {
		    is[i_3_++] = (byte) (i_8_ ^ 0xffffffff);
		    if (i_3_ >= i_2_)
			break;
		    i_4_ = 0;
		}
		if ((0x20 & i_7_) == 0)
		    i_4_++;
		else
		    i_4_ = anIntArray241[i_4_];
		if (((i_8_ = anIntArray241[i_4_]) ^ 0xffffffff) > -1) {
		    is[i_3_++] = (byte) (i_8_ ^ 0xffffffff);
		    if (i_2_ <= i_3_)
			break;
		    i_4_ = 0;
		}
		if ((0x10 & i_7_ ^ 0xffffffff) == -1)
		    i_4_++;
		else
		    i_4_ = anIntArray241[i_4_];
		if (((i_8_ = anIntArray241[i_4_]) ^ 0xffffffff) > -1) {
		    is[i_3_++] = (byte) (i_8_ ^ 0xffffffff);
		    if (i_2_ <= i_3_)
			break;
		    i_4_ = 0;
		}
		if ((0x8 & i_7_ ^ 0xffffffff) != -1)
		    i_4_ = anIntArray241[i_4_];
		else
		    i_4_++;
		if (((i_8_ = anIntArray241[i_4_]) ^ 0xffffffff) > -1) {
		    is[i_3_++] = (byte) (i_8_ ^ 0xffffffff);
		    if (i_3_ >= i_2_)
			break;
		    i_4_ = 0;
		}
		if ((0x4 & i_7_) == 0)
		    i_4_++;
		else
		    i_4_ = anIntArray241[i_4_];
		if (((i_8_ = anIntArray241[i_4_]) ^ 0xffffffff) > -1) {
		    is[i_3_++] = (byte) (i_8_ ^ 0xffffffff);
		    if (i_2_ <= i_3_)
			break;
		    i_4_ = 0;
		}
		if ((i_7_ & 0x2 ^ 0xffffffff) != -1)
		    i_4_ = anIntArray241[i_4_];
		else
		    i_4_++;
		if ((i_8_ = anIntArray241[i_4_]) < 0) {
		    is[i_3_++] = (byte) (i_8_ ^ 0xffffffff);
		    if ((i_2_ ^ 0xffffffff) >= (i_3_ ^ 0xffffffff))
			break;
		    i_4_ = 0;
		}
		if ((i_7_ & 0x1 ^ 0xffffffff) != -1)
		    i_4_ = anIntArray241[i_4_];
		else
		    i_4_++;
		if ((i_8_ = anIntArray241[i_4_]) < 0) {
		    is[i_3_++] = (byte) (i_8_ ^ 0xffffffff);
		    if (i_3_ >= i_2_)
			break;
		    i_4_ = 0;
		}
		i_6_++;
	    }
	    return -i + 1 + i_6_;
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516
		      (runtimeexception,
		       ("db.C(" + (is != null ? "{...}" : "null") + ',' + i
			+ ',' + i_0_ + ',' + (is_1_ != null ? "{...}" : "null")
			+ ',' + i_2_ + ',' + i_3_ + ')'));
	}
    }
    
    public static void method104(byte i) {
	aClass16_245 = null;
	aClass15_Sub1_242 = null;
	aClass15_237 = null;
	aClass37_Sub4_Sub9_Sub3_238 = null;
	if (i == 60) {
	    aClass37_Sub18Array240 = null;
	    aClass16_252 = null;
	    aClass16_247 = null;
	    aClass16_234 = null;
	    intStack = null;
	    anIntArray250 = null;
	}
    }
    
    public Class14(byte[] is) {
	int i = is.length;
	anIntArray241 = new int[8];
	anIntArray233 = new int[i];
	aByteArray235 = is;
	int[] is_9_ = new int[33];
	int i_10_ = 0;
	for (int i_11_ = 0; i > i_11_; i_11_++) {
	    int i_12_ = is[i_11_];
	    if ((i_12_ ^ 0xffffffff) != -1) {
		int i_13_ = 1 << -i_12_ + 32;
		int i_14_ = is_9_[i_12_];
		anIntArray233[i_11_] = i_14_;
		int i_15_;
		if ((i_14_ & i_13_) == 0) {
		    for (int i_16_ = -1 + i_12_; (i_16_ ^ 0xffffffff) <= -2;
			 i_16_--) {
			int i_17_ = is_9_[i_16_];
			if ((i_14_ ^ 0xffffffff) != (i_17_ ^ 0xffffffff))
			    break;
			int i_18_ = 1 << -i_16_ + 32;
			if ((i_18_ & i_17_ ^ 0xffffffff) != -1) {
			    is_9_[i_16_] = is_9_[-1 + i_16_];
			    break;
			}
			is_9_[i_16_]
			    = Class37_Sub9_Sub13.method817(i_17_, i_18_);
		    }
		    i_15_ = i_14_ | i_13_;
		} else
		    i_15_ = is_9_[-1 + i_12_];
		is_9_[i_12_] = i_15_;
		for (int i_19_ = i_12_ + 1; i_19_ <= 32; i_19_++) {
		    if (is_9_[i_19_] == i_14_)
			is_9_[i_19_] = i_15_;
		}
		int i_20_ = 0;
		for (int i_21_ = 0;
		     (i_12_ ^ 0xffffffff) < (i_21_ ^ 0xffffffff); i_21_++) {
		    int i_22_ = -2147483648 >>> i_21_;
		    if ((i_22_ & i_14_ ^ 0xffffffff) != -1) {
			if ((anIntArray241[i_20_] ^ 0xffffffff) == -1)
			    anIntArray241[i_20_] = i_10_;
			i_20_ = anIntArray241[i_20_];
		    } else
			i_20_++;
		    if ((anIntArray241.length ^ 0xffffffff)
			>= (i_20_ ^ 0xffffffff)) {
			int[] is_23_ = new int[anIntArray241.length * 2];
			for (int i_24_ = 0; anIntArray241.length > i_24_;
			     i_24_++)
			    is_23_[i_24_] = anIntArray241[i_24_];
			anIntArray241 = is_23_;
		    }
		    i_22_ >>>= 1;
		}
		anIntArray241[i_20_] = i_11_ ^ 0xffffffff;
		if (i_10_ <= i_20_)
		    i_10_ = i_20_ + 1;
	    }
	}
    }
    
    public int method105(int i, byte[] is, int i_25_, int i_26_, int i_27_,
			 byte[] is_28_) {
	try {
	    i_27_ += i_25_;
	    anInt249++;
	    int i_29_ = 0;
	    int i_30_ = i_26_ << -2116795453;
	    for (/**/; i_27_ > i_25_; i_25_++) {
		int i_31_ = 0xff & is_28_[i_25_];
		int i_32_ = anIntArray233[i_31_];
		int i_33_ = aByteArray235[i_31_];
		if (i_33_ == 0)
		    throw new RuntimeException("No codeword for data value "
					       + i_31_);
		int i_34_ = i_30_ >> -1445887805;
		int i_35_ = i_30_ & 0x7;
		i_29_ &= -i_35_ >> 473515839;
		i_30_ += i_33_;
		int i_36_ = (-1 + (i_35_ - -i_33_) >> -1430991229) + i_34_;
		i_35_ += 24;
		is[i_34_]
		    = (byte) (i_29_
			      = Class37_Sub9_Sub13.method817(i_29_,
							     i_32_ >>> i_35_));
		if ((i_36_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff)) {
		    i_34_++;
		    i_35_ -= 8;
		    is[i_34_] = (byte) (i_29_ = i_32_ >>> i_35_);
		    if (i_36_ > i_34_) {
			i_34_++;
			i_35_ -= 8;
			is[i_34_] = (byte) (i_29_ = i_32_ >>> i_35_);
			if (i_36_ > i_34_) {
			    i_35_ -= 8;
			    i_34_++;
			    is[i_34_] = (byte) (i_29_ = i_32_ >>> i_35_);
			    if (i_34_ < i_36_) {
				i_35_ -= 8;
				i_34_++;
				is[i_34_] = (byte) (i_29_ = i_32_ << -i_35_);
			    }
			}
		    }
		}
	    }
	    if (i != 32)
		aClass15_Sub1_242 = null;
	    return -i_26_ + (7 + i_30_ >> -662855293);
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("db.B(" + i + ','
						    + (is != null ? "{...}"
						       : "null")
						    + ',' + i_25_ + ',' + i_26_
						    + ',' + i_27_ + ','
						    + (is_28_ != null ? "{...}"
						       : "null")
						    + ')'));
	}
    }
    
    public static void method106(int i) {
	anInt246++;
	if (Class79.aBoolean1488) {
	    Class37_Sub1.aClass37_Sub4_Sub9_Sub3Array1809 = null;
	    Class37_Sub9.anIntArray1951 = null;
	    Class59.aClass37_Sub4_Sub9_Sub1Array1131 = null;
	    Class42.aClass37_Sub4_Sub9_Sub1_925 = null;
	    Class56.aClass37_Sub4_Sub9_Sub3_1095 = null;
	    Class37_Sub9_Sub33.anIntArray3519 = null;
	    Class37_Sub4_Sub7_Sub7.aClass37_Sub4_Sub9_Sub1Array3853 = null;
	    Class46.aClass37_Sub4_Sub9_Sub1_987 = null;
	    Class37_Sub9_Sub21.aClass37_Sub4_Sub9_Sub1_3320 = null;
	    Class52_Sub1.anIntArray2298 = null;
	    Class37_Sub9_Sub28.anIntArray3428 = null;
	    Class64.aClass37_Sub4_Sub9_Sub3_1212 = null;
	    if (i >= -122)
		method107(69, null);
	    aClass37_Sub4_Sub9_Sub3_238 = null;
	    Class27.anIntArray677 = null;
	    Class22.anIntArray585 = null;
	    Class37_Sub4_Sub7_Sub2.aClass37_Sub4_Sub9_Sub1_3715 = null;
	    Class37_Sub17.aClass37_Sub4_Sub9_Sub1Array2158 = null;
	    Class37_Sub9_Sub16.anIntArray3199 = null;
	    Class37_Sub9_Sub33.aClass37_Sub4_Sub9_Sub1Array3523 = null;
	    Class33.anIntArray754 = null;
	    Class37_Sub9_Sub13.aClass37_Sub4_Sub9_Sub1Array3139 = null;
	    Class42.aClass37_Sub4_Sub9_Sub3_923 = null;
	    Canvas_Sub1.method37(-110, 2);
	    NodeSub.method437(151, true);
	    Class79.aBoolean1488 = false;
	}
    }
    
    public static void method107(int i, Component component) {
	component.addMouseListener(Cache.mouseHandler);
	component.addMouseMotionListener(Cache.mouseHandler);
	component.addFocusListener(Cache.mouseHandler);
	anInt244++;
	if (i <= 82)
	    method106(-31);
    }
    
    static {
	aClass16_247
	    = Class37_Sub2.create_rsstring("Registrierter Benutzer");
	aClass16_234 = aClass16_245;
	aClass16_252 = null;
    }
}
