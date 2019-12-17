package org.ie.client;

/* Class37_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub2 extends Class37_Sub9
{
    public static int anInt2925;
    public static int anInt2926;
    public boolean aBoolean2927 = true;
    public static RSString aClass16_2928
	= Class37_Sub2.create_rsstring("Lade Konfiguration )2 ");
    public static int anInt2929;
    public static RSString aClass16_2930;
    public int anInt2931 = 4096;
    public static Class15_Sub1 aClass15_Sub1_2932;
    public static RSString aClass16_2933;
    public static int anInt2934;
    public static int anInt2935 = 0;
    public static int anInt2936;
    public static int anInt2937;
    
    public static void method765(byte i) {
	if (i != 43)
	    method765((byte) -46);
	client.aClass65_1728.clear();
	anInt2926++;
    }
    
    public Class37_Sub9_Sub2() {
	super(1, false);
    }
    
    public int[][] method759(byte i, int i_0_) {
	if (i <= 111)
	    aClass16_2928 = null;
	anInt2934++;
	int[][] is = aClass33_1946.method298(false, i_0_);
	if (aClass33_1946.aBoolean767) {
	    int[] is_1_
		= this.method760((i_0_ - 1
				  & Class37_Sub4_Sub7_Sub1_Sub2.anInt3989),
				 0, -127);
	    int[] is_2_ = this.method760(i_0_, 0, -80);
	    int[] is_3_ = this.method760((Class37_Sub4_Sub7_Sub1_Sub2.anInt3989
					  & 1 + i_0_),
					 0, -110);
	    int[] is_4_ = is[0];
	    int[] is_5_ = is[2];
	    int[] is_6_ = is[1];
	    for (int i_7_ = 0;
		 (Class32.anInt743 ^ 0xffffffff) < (i_7_ ^ 0xffffffff);
		 i_7_++) {
		int i_8_
		    = anInt2931 * (is_2_[Applet_Sub1.anInt12 & 1 + i_7_]
				   + -is_2_[Applet_Sub1.anInt12 & -1 + i_7_]);
		int i_9_ = (-is_1_[i_7_] + is_3_[i_7_]) * anInt2931;
		int i_10_ = i_8_ >> 312345356;
		int i_11_ = i_9_ >> 489190252;
		int i_12_ = i_11_ * i_11_ >> -1118633204;
		int i_13_ = i_10_ * i_10_ >> 1092168044;
		int i_14_ = (int) (Math.sqrt((double) ((4096 + i_12_ + i_13_)
						       / 4096))
				   * 4096.0);
		int i_15_;
		int i_16_;
		int i_17_;
		if ((i_14_ ^ 0xffffffff) == -1) {
		    i_15_ = 0;
		    i_17_ = 0;
		    i_16_ = 0;
		} else {
		    i_15_ = i_8_ / i_14_;
		    i_16_ = 16777216 / i_14_;
		    i_17_ = i_9_ / i_14_;
		}
		if (aBoolean2927) {
		    i_16_ = (i_16_ >> 1952967873) + 2048;
		    i_17_ = (i_17_ >> 619480641) + 2048;
		    i_15_ = (i_15_ >> 1273580161) + 2048;
		}
		is_4_[i_7_] = i_15_;
		is_6_[i_7_] = i_17_;
		is_5_[i_7_] = i_16_;
	    }
	}
	return is;
    }
    
    public void method750(ByteVector class37_sub11, int i, boolean bool) {
	if (bool != true)
	    method750(null, -61, true);
	anInt2925++;
	int i_18_ = i;
	do {
	    if (i_18_ != 0) {
		if ((i_18_ ^ 0xffffffff) != -2)
		    break;
	    } else {
		anInt2931 = class37_sub11.getUnsignedShort();
		break;
	    }
	    aBoolean2927 = class37_sub11.getUnsignedByte() == 1;
	} while (false);
    }
    
    public static void method766(int i) {
	aClass16_2933 = null;
	int i_19_ = -61 % ((i - -62) / 56);
	aClass15_Sub1_2932 = null;
	aClass16_2930 = null;
	aClass16_2928 = null;
    }
    
    public static boolean method767(int i, byte i_20_, int i_21_) {
	anInt2936++;
	if (i == 11)
	    i = 10;
	if ((i ^ 0xffffffff) <= -6 && i <= 8)
	    i = 4;
	Class37_Sub4_Sub11 class37_sub4_sub11
	    = Class37_Sub9_Sub8.method794(i_21_, 28067);
	if (i_20_ != 1)
	    method766(-16);
	return class37_sub4_sub11.method686(i, -13979);
    }
    
    static {
	aClass16_2933 = Class37_Sub2.create_rsstring("Welt");
	aClass16_2930
	    = (Class37_Sub2.create_rsstring
	       ("und haben es deaktiviert)3 Klicken Sie auf der"));
    }
}
