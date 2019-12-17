package org.ie.client;

/* Class37_Sub9_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub26 extends Class37_Sub9
{
    public static int anInt3386;
    public static RSString aClass16_3387;
    public static int anInt3388;
    public static RSString aClass16_3389
	= Class37_Sub2.create_rsstring("jlv");
    public static int currentHeldKeyCachePosition = 0;
    public static byte[][][] aByteArrayArrayArray3391;
    public static int anInt3392;
    public static int anInt3393;
    public static int anInt3394;
    public static int anInt3395;
    public static int anInt3396;
    
    public static int method875(int i, byte i_0_, int i_1_) {
	anInt3395++;
	int i_2_ = 0;
	while ((i_1_ ^ 0xffffffff) < -1) {
	    i_1_--;
	    i_2_ = i & 0x1 | i_2_ << 792749825;
	    i >>>= 1;
	}
	if (i_0_ != 85)
	    return 30;
	return i_2_;
    }
    
    public int[][] method759(byte i, int i_3_) {
	anInt3394++;
	int[][] is = aClass33_1946.method298(false, i_3_);
	if (aClass33_1946.aBoolean767) {
	    int[][] is_4_ = this.method762(0, i_3_, (byte) -120);
	    int[] is_5_ = is_4_[1];
	    int[] is_6_ = is_4_[0];
	    int[] is_7_ = is[0];
	    int[] is_8_ = is_4_[2];
	    int[] is_9_ = is[2];
	    int[] is_10_ = is[1];
	    for (int i_11_ = 0;
		 (i_11_ ^ 0xffffffff) > (Class32.anInt743 ^ 0xffffffff);
		 i_11_++) {
		is_7_[i_11_] = 4096 - is_6_[i_11_];
		is_10_[i_11_] = 4096 + -is_5_[i_11_];
		is_9_[i_11_] = 4096 + -is_8_[i_11_];
	    }
	}
	if (i <= 111)
	    currentHeldKeyCachePosition = 16;
	return is;
    }
    
    public static void method876(byte i) {
	anInt3386++;
	int i_12_ = -93 % ((10 - i) / 63);
	synchronized (Class37_Sub4_Sub10.anObject2686) {
	    if (Class37_Sub9_Sub22.anInt3327 != 0) {
		Class37_Sub9_Sub22.anInt3327 = 1;
		try {
		    Class37_Sub4_Sub10.anObject2686.wait();
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	}
    }
    
    public int[] method761(int i, int i_13_) {
	anInt3388++;
	if (i > -125)
	    return null;
	int[] is = aClass38_1966.method1049(i_13_, true);
	if (aClass38_1966.aBoolean850) {
	    int[] is_14_ = this.method760(i_13_, 0, -81);
	    for (int i_15_ = 0; Class32.anInt743 > i_15_; i_15_++)
		is[i_15_] = 4096 + -is_14_[i_15_];
	}
	return is;
    }
    
    public static void method877(byte i) {
	if (i != -57)
	    method877((byte) 3);
	aClass16_3389 = null;
	aByteArrayArrayArray3391 = null;
	aClass16_3387 = null;
    }
    
    public void method750(ByteVector class37_sub11, int i, boolean bool) {
	anInt3392++;
	if (bool == true) {
	    if (i == 0)
		aBoolean1943
		    = (class37_sub11.getUnsignedByte() ^ 0xffffffff) == -2;
	}
    }
    
    public Class37_Sub9_Sub26() {
	super(1, false);
    }
    
    static {
	aClass16_3387 = Class37_Sub2.create_rsstring("Hidden)2");
	anInt3396 = 0;
    }
}
