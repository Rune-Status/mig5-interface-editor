package org.ie.client;

/* Class37_Sub9_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub31 extends Class37_Sub9
{
    public static int anInt3481;
    public int anInt3482 = 4096;
    public static int anInt3483;
    public static int[] anIntArray3484 = new int[200];
    public static int[] typedKeyCharCache = new int[128];
    public static int anInt3486;
    public static int anInt3487 = 0;
    public int anInt3488 = 0;
    public static Cache aClass65_3489 = new Cache(30);
    public static int anInt3490;
    public static RSString aClass16_3491;
    public static RSString aClass16_3492
	= Class37_Sub2.create_rsstring("We suspect someone knows your password)3");
    public static RSString aClass16_3493
	= Class37_Sub2.create_rsstring("Please remove ");
    public static RSString aClass16_3494 = aClass16_3493;
    public static int anInt3495;
    public static RSString aClass16_3496;
    
    public static void method896(byte i) {
	aClass16_3492 = null;
	aClass65_3489 = null;
	aClass16_3494 = null;
	aClass16_3496 = null;
	anIntArray3484 = null;
	aClass16_3491 = null;
	typedKeyCharCache = null;
	if (i == 28)
	    aClass16_3493 = null;
    }
    
    public int[][] method759(byte i, int i_0_) {
	anInt3483++;
	int[][] is = aClass33_1946.method298(false, i_0_);
	if (aClass33_1946.aBoolean767) {
	    int[][] is_1_ = this.method762(0, i_0_, (byte) -93);
	    int[] is_2_ = is_1_[0];
	    int[] is_3_ = is_1_[1];
	    int[] is_4_ = is_1_[2];
	    int[] is_5_ = is[0];
	    int[] is_6_ = is[2];
	    int[] is_7_ = is[1];
	    for (int i_8_ = 0; i_8_ < Class32.anInt743; i_8_++) {
		int i_9_ = is_2_[i_8_];
		int i_10_ = is_3_[i_8_];
		int i_11_ = is_4_[i_8_];
		if (i_9_ < anInt3488)
		    is_5_[i_8_] = anInt3488;
		else if (i_9_ <= anInt3482)
		    is_5_[i_8_] = i_9_;
		else
		    is_5_[i_8_] = anInt3482;
		if (anInt3488 > i_10_)
		    is_7_[i_8_] = anInt3488;
		else if ((i_10_ ^ 0xffffffff) >= (anInt3482 ^ 0xffffffff))
		    is_7_[i_8_] = i_10_;
		else
		    is_7_[i_8_] = anInt3482;
		if ((anInt3488 ^ 0xffffffff) < (i_11_ ^ 0xffffffff))
		    is_6_[i_8_] = anInt3488;
		else if (i_11_ > anInt3482)
		    is_6_[i_8_] = anInt3482;
		else
		    is_6_[i_8_] = i_11_;
	    }
	}
	if (i < 111)
	    method759((byte) -14, 74);
	return is;
    }
    
    public void method750(ByteVector class37_sub11, int i, boolean bool) {
	anInt3486++;
	int i_12_ = i;
    while_112_:
	do {
	    do {
		if (i_12_ != 0) {
		    if ((i_12_ ^ 0xffffffff) != -2) {
			if (i_12_ == 2)
			    break;
			break while_112_;
		    }
		} else {
		    anInt3488 = class37_sub11.getUnsignedShort();
		    break while_112_;
		}
		anInt3482 = class37_sub11.getUnsignedShort();
		break while_112_;
	    } while (false);
	    aBoolean1943 = class37_sub11.getUnsignedByte() == 1;
	} while (false);
	if (bool != true)
	    aClass65_3489 = null;
    }
    
    public int[] method761(int i, int i_13_) {
	anInt3481++;
	if (i >= -125)
	    return null;
	int[] is = aClass38_1966.method1049(i_13_, true);
	if (aClass38_1966.aBoolean850) {
	    int[] is_14_ = this.method760(i_13_, 0, -89);
	    for (int i_15_ = 0;
		 (i_15_ ^ 0xffffffff) > (Class32.anInt743 ^ 0xffffffff);
		 i_15_++) {
		int i_16_ = is_14_[i_15_];
		if ((anInt3488 ^ 0xffffffff) < (i_16_ ^ 0xffffffff))
		    is[i_15_] = anInt3488;
		else if ((anInt3482 ^ 0xffffffff) <= (i_16_ ^ 0xffffffff))
		    is[i_15_] = i_16_;
		else
		    is[i_15_] = anInt3482;
	    }
	}
	return is;
    }
    
    public Class37_Sub9_Sub31() {
	super(1, false);
    }
    
    static {
	aClass16_3491 = aClass16_3493;
	aClass16_3496 = aClass16_3492;
	anInt3495 = 0;
    }
}
