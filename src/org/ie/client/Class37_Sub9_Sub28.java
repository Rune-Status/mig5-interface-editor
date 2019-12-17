package org.ie.client;

/* Class37_Sub9_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub28 extends Class37_Sub9
{
    public static RSString aClass16_3420
	= Class37_Sub2.create_rsstring("Fehler beim Laden Ihres Spielcharakters)3");
    public static int anInt3421;
    public static boolean aBoolean3422 = false;
    public static int anInt3423;
    public static int anInt3424;
    public int anInt3425 = 4096;
    public static int anInt3426;
    public static Deque aClass58_3427 = new Deque();
    public static int[] anIntArray3428;
    public static int anInt3429;
    public static Sprite aClass37_Sub4_Sub9_Sub3_3430;
    public int anInt3431 = 4096;
    public static int anInt3432;
    public int anInt3433 = 4096;
    public static int[] anIntArray3434;
    public static RSString aClass16_3435
	= Class37_Sub2.create_rsstring("Regeln versto-8en hat)3");
    public static RSString aClass16_3436;
    public static RSString aClass16_3437;
    public static RSString aClass16_3438
	= Class37_Sub2.create_rsstring("Choose Option");
    public static RSString aClass16_3439;
    public static int lastMouseClick;
    
    public static int method883(byte i, int i_0_, int i_1_) {
	if (i <= 109)
	    aClass16_3439 = null;
	anInt3429++;
	if ((i_1_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff)) {
	    int i_2_ = i_1_;
	    i_1_ = i_0_;
	    i_0_ = i_2_;
	}
	int i_3_;
	for (/**/; (i_0_ ^ 0xffffffff) != -1; i_0_ = i_3_) {
	    i_3_ = i_1_ % i_0_;
	    i_1_ = i_0_;
	}
	return i_1_;
    }
    
    public int[][] method759(byte i, int i_4_) {
	anInt3432++;
	if (i < 111)
	    return null;
	int[][] is = aClass33_1946.method298(false, i_4_);
	if (aClass33_1946.aBoolean767) {
	    int[][] is_5_ = this.method762(0, i_4_, (byte) -81);
	    int[] is_6_ = is_5_[0];
	    int[] is_7_ = is[0];
	    int[] is_8_ = is[2];
	    int[] is_9_ = is[1];
	    int[] is_10_ = is_5_[1];
	    int[] is_11_ = is_5_[2];
	    for (int i_12_ = 0;
		 (i_12_ ^ 0xffffffff) > (Class32.anInt743 ^ 0xffffffff);
		 i_12_++) {
		int i_13_ = is_6_[i_12_];
		int i_14_ = is_11_[i_12_];
		int i_15_ = is_10_[i_12_];
		if (i_13_ == i_14_ && i_15_ == i_14_) {
		    is_7_[i_12_] = anInt3425 * i_13_ >> -1236037748;
		    is_9_[i_12_] = i_14_ * anInt3431 >> -814808116;
		    is_8_[i_12_] = i_15_ * anInt3433 >> -1221768724;
		} else {
		    is_7_[i_12_] = anInt3425;
		    is_9_[i_12_] = anInt3431;
		    is_8_[i_12_] = anInt3433;
		}
	    }
	}
	return is;
    }
    
    public Class37_Sub9_Sub28() {
	super(1, false);
    }
    
    public static void method884(int i) {
	anInt3426++;
	if (Hashtable.anIntArray226 == null
	    || Class37_Sub4_Sub7_Sub2.anIntArray3711 == null) {
	    Class37_Sub4_Sub7_Sub2.anIntArray3711 = new int[256];
	    Hashtable.anIntArray226 = new int[256];
	    for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -257; i_16_++) {
		double d = 6.283185307179586 * ((double) i_16_ / 255.0);
		Hashtable.anIntArray226[i_16_] = (int) (Math.sin(d) * 4096.0);
		Class37_Sub4_Sub7_Sub2.anIntArray3711[i_16_]
		    = (int) (4096.0 * Math.cos(d));
	    }
	}
	int i_17_ = -13 % ((i - 23) / 59);
    }
    
    public static void method885(Class37_Sub4_Sub7_Sub1 class37_sub4_sub7_sub1,
				 int i) {
    	Class37_Sub4_Sub10.method677(i, class37_sub4_sub7_sub1.anInt3666,
				     class37_sub4_sub7_sub1.anInt3642);
    }
    
    public static int method886(int i, int i_19_, byte i_20_) {
	if (i_20_ <= 112)
	    return 121;
	anInt3421++;
	int i_21_ = i_19_ + 57 * i;
	i_21_ ^= i_21_ << -765426931;
	int i_22_ = (i_21_ * (789221 + 15731 * (i_21_ * i_21_)) + 1376312589
		     & 0x7fffffff);
	return (0x7fb5758 & i_22_) >> -1723037165;
    }
    
    public static void method887(int i) {
	aClass16_3439 = null;
	anIntArray3434 = null;
	if (i < 86)
	    aClass58_3427 = null;
	aClass16_3420 = null;
	aClass37_Sub4_Sub9_Sub3_3430 = null;
	aClass16_3435 = null;
	aClass16_3437 = null;
	aClass16_3436 = null;
	aClass16_3438 = null;
	anIntArray3428 = null;
	aClass58_3427 = null;
    }
    
    public void method750(ByteVector class37_sub11, int i, boolean bool) {
	anInt3424++;
	if (bool == true) {
	    int i_23_ = i;
	while_96_:
	    do {
		do {
		    if ((i_23_ ^ 0xffffffff) != -1) {
			if (i_23_ != 1) {
			    if (i_23_ == 2)
				break;
			    break while_96_;
			}
		    } else {
			anInt3425 = class37_sub11.getUnsignedShort();
			return;
		    }
		    anInt3431 = class37_sub11.getUnsignedShort();
		    return;
		} while (false);
		anInt3433 = class37_sub11.getUnsignedShort();
	    } while (false);
	}
    }
    
    static {
	aClass16_3437
	    = Class37_Sub2.create_rsstring("Prepared visibility map");
	lastMouseClick = 0;
	aClass16_3439 = aClass16_3438;
	aClass16_3436 = aClass16_3437;
    }
}
