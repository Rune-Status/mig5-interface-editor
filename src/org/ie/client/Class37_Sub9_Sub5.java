package org.ie.client;

/* Class37_Sub9_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub5 extends Class37_Sub9
{
    public static int anInt2985;
    public int anInt2986 = 1024;
    public static int anInt2987;
    public int anInt2988;
    public static int anInt2989;
    public static int anInt2990;
    public int anInt2991 = 2048;
    public static int anInt2992;
    public static int anInt2993;
    public static Deque aClass58_2994;
    public static RSString aClass16_2995
	= Class37_Sub2.create_rsstring("skill)2");
    public static RSString aClass16_2996 = aClass16_2995;
    public static RSString aClass16_2997;
    public static int anInt2998;
    public static RSString aClass16_2999;
    public static RSString aClass16_3000;
    public static RSString aClass16_3001;
    public static RSString aClass16_3002;
    public static RSString aClass16_3003;
    public static RSString aClass16_3004;
    public static RSString ok;
    
    public void method752(int i) {
	if (i == -2) {
	    anInt2989++;
	    anInt2991 = -anInt2986 + anInt2988;
	}
    }
    
    public int[][] method759(byte i, int i_0_) {
	if (i <= 111)
	    aClass16_3004 = null;
	anInt2985++;
	int[][] is = aClass33_1946.method298(false, i_0_);
	if (aClass33_1946.aBoolean767) {
	    int[][] is_1_ = this.method762(0, i_0_, (byte) -79);
	    int[] is_2_ = is_1_[0];
	    int[] is_3_ = is_1_[1];
	    int[] is_4_ = is_1_[2];
	    int[] is_5_ = is[1];
	    int[] is_6_ = is[2];
	    int[] is_7_ = is[0];
	    for (int i_8_ = 0; i_8_ < Class32.anInt743; i_8_++) {
		is_7_[i_8_]
		    = (is_2_[i_8_] * anInt2991 >> -1197808500) + anInt2986;
		is_5_[i_8_]
		    = (anInt2991 * is_3_[i_8_] >> 583699180) + anInt2986;
		is_6_[i_8_]
		    = anInt2986 + (is_4_[i_8_] * anInt2991 >> 106425772);
	    }
	}
	return is;
    }
    
    public Class37_Sub9_Sub5() {
	super(1, false);
	anInt2988 = 3072;
    }
    
    public void method750(ByteVector class37_sub11, int i, boolean bool) {
	anInt2987++;
	int i_9_ = i;
    while_18_:
	do {
	    do {
		if (i_9_ != 0) {
		    if ((i_9_ ^ 0xffffffff) != -2) {
			if (i_9_ == 2)
			    break;
			break while_18_;
		    }
		} else {
		    anInt2986 = class37_sub11.getUnsignedShort();
		    break while_18_;
		}
		anInt2988 = class37_sub11.getUnsignedShort();
		break while_18_;
	    } while (false);
	    aBoolean1943 = class37_sub11.getUnsignedByte() == 1;
	} while (false);
	if (bool != true)
	    anInt2998 = 70;
    }
    
    public int[] method761(int i, int i_10_) {
	anInt2992++;
	if (i > -125)
	    aClass16_3001 = null;
	int[] is = aClass38_1966.method1049(i_10_, true);
	if (aClass38_1966.aBoolean850) {
	    int[] is_11_ = this.method760(i_10_, 0, -81);
	    for (int i_12_ = 0;
		 (i_12_ ^ 0xffffffff) > (Class32.anInt743 ^ 0xffffffff);
		 i_12_++)
		is[i_12_]
		    = anInt2986 - -(anInt2991 * is_11_[i_12_] >> 1292537740);
	}
	return is;
    }
    
    public static void method779(byte i) {
	int i_13_ = -45 % ((-28 - i) / 61);
	Class37_Sub3_Sub3.aClass65_2339.clear();
	anInt2993++;
	Class37_Sub9_Sub32.aClass65_3503.clear();
    }
    
    public static void method780(int i) {
	aClass16_2997 = null;
	aClass16_2999 = null;
	aClass16_3000 = null;
	aClass58_2994 = null;
	aClass16_3001 = null;
	if (i >= -57)
	    method779((byte) 31);
	aClass16_3002 = null;
	aClass16_2995 = null;
	ok = null;
	aClass16_3004 = null;
	aClass16_3003 = null;
	aClass16_2996 = null;
    }
    
    static {
	aClass58_2994 = new Deque();
	aClass16_3000
	    = (Class37_Sub2.create_rsstring
	       ("You need a members account to login to this world)3"));
	anInt2998 = -1;
	aClass16_3001
	    = (Class37_Sub2.create_rsstring
	       ("Verbindung konnte nicht hergestellt werden)3"));
	aClass16_3003
	    = Class37_Sub2.create_rsstring("Unable to connect)3");
	aClass16_3002 = aClass16_3003;
	aClass16_2997 = aClass16_3000;
	aClass16_2999 = aClass16_3003;
	aClass16_3004 = Class37_Sub2.create_rsstring("Ok");
	ok = aClass16_3004;
    }
}
