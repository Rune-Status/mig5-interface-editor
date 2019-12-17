package org.ie.client;

/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class33
{
    public static int anInt747;
    public Class37_Sub14[] aClass37_Sub14Array748;
    public int anInt749;
    public static int anInt750;
    public static Random aRandom751 = new Random();
    public int anInt752;
    public int anInt753 = -1;
    public static int[] anIntArray754;
    public static int anInt755;
    public int[][][] anIntArrayArrayArray756;
    public static int anInt757;
    public static int anInt758;
    public int anInt759 = 0;
    public static int anInt760;
    public static int anInt761 = 0;
    public static RSString aClass16_762;
    public static int anInt763;
    public static int lastClickX = 0;
    public static int anInt765;
    public Deque aClass58_766 = new Deque();
    public boolean aBoolean767 = false;
    
    public int[][] method298(boolean bool, int i) {
	if (bool != false)
	    aBoolean767 = true;
	anInt755++;
	if (anInt752 != anInt749) {
	    if ((anInt752 ^ 0xffffffff) == -2) {
		aBoolean767 = i != anInt753;
		anInt753 = i;
		return anIntArrayArrayArray756[0];
	    }
	    Class37_Sub14 class37_sub14 = aClass37_Sub14Array748[i];
	    if (aBoolean767 = class37_sub14 == null) {
		if (anInt759 < anInt752) {
		    class37_sub14 = new Class37_Sub14(i, anInt759);
		    anInt759++;
		} else {
		    Class37_Sub14 class37_sub14_0_
			= (Class37_Sub14) aClass58_766.getLast();
		    class37_sub14
			= new Class37_Sub14(i, class37_sub14_0_.anInt2128);
		    aClass37_Sub14Array748[class37_sub14_0_.anInt2125] = null;
		    class37_sub14_0_.unlink();
		}
		aClass37_Sub14Array748[i] = class37_sub14;
	    }
	    aClass58_766.addFront(class37_sub14);
	    return anIntArrayArrayArray756[class37_sub14.anInt2128];
	}
	aBoolean767 = aClass37_Sub14Array748[i] == null;
	aClass37_Sub14Array748[i] = Class37_Sub5.aClass37_Sub14_1871;
	return anIntArrayArrayArray756[i];
    }
    
    public static Sprite method299(int i) {
	anInt763++;
	Sprite class37_sub4_sub9_sub3
	    = new Sprite();
	class37_sub4_sub9_sub3.height
	    = Class37_Sub9_Sub28.anIntArray3434[0];
	class37_sub4_sub9_sub3.anInt3906 = Class37_Sub4_Sub7.anInt2637;
	class37_sub4_sub9_sub3.anInt3909 = Class62.anIntArray1180[0];
	class37_sub4_sub9_sub3.width = Class14.anIntArray250[0];
	class37_sub4_sub9_sub3.anInt3908
	    = Class37_Sub9_Sub23.anIntArray3357[0];
	byte[] is = Class10.aByteArrayArray198[0];
	class37_sub4_sub9_sub3.anInt3905 = Class46.anInt989;
	int i_1_ = (class37_sub4_sub9_sub3.width
		    * class37_sub4_sub9_sub3.height);
	class37_sub4_sub9_sub3.pixels = new int[i_1_];
	int i_2_ = 0;
	int i_3_ = 4 / ((i - -79) / 34);
	for (/**/; i_1_ > i_2_; i_2_++)
	    class37_sub4_sub9_sub3.pixels[i_2_]
		= (Class37_Sub9_Sub1.anIntArray2919
		   [Class37_Sub4_Sub7.method490(255, is[i_2_])]);
	Class37_Sub9_Sub11.method806(true);
	return class37_sub4_sub9_sub3;
    }
    
    public static void method300(byte i, int i_4_, int i_5_, int i_6_,
				 int i_7_) {
	for (int i_8_ = 0; i_8_ < Class37_Sub9_Sub37.anInt3597; i_8_++) {
	    if ((Class37_Sub11_Sub1.anIntArray3611[i_8_]
		 + Class71.anIntArray1364[i_8_]) > i_6_
		&& (i_6_ - -i_5_ ^ 0xffffffff) < (Class71.anIntArray1364[i_8_]
						  ^ 0xffffffff)
		&& i_7_ < (Class43.anIntArray961[i_8_]
			   - -Class37_Sub4_Sub7_Sub7.anIntArray3842[i_8_])
		&& (Class43.anIntArray961[i_8_] ^ 0xffffffff) > (i_7_ - -i_4_
								 ^ 0xffffffff))
		Class37_Sub9_Sub1.rectClipDraw[i_8_] = true;
	}
	anInt760++;
	if (i > -35)
	    anIntArray754 = null;
    }
    
    public void method301(int i) {
	anInt757++;
	if (i != 2)
	    anInt749 = -5;
	for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (anInt752 ^ 0xffffffff);
	     i_9_++) {
	    anIntArrayArrayArray756[i_9_][0] = null;
	    anIntArrayArrayArray756[i_9_][1] = null;
	    anIntArrayArrayArray756[i_9_][2] = null;
	    anIntArrayArrayArray756[i_9_] = null;
	}
	anIntArrayArrayArray756 = null;
	aClass37_Sub14Array748 = null;
	aClass58_766.clear();
	aClass58_766 = null;
    }
    
    public static Sprite[] method302
	(int i, RSString rSString, RSString class16_10_, Class15 class15) {
	try {
	    if (i <= 108)
		method305(false);
	    int i_11_ = class15.method123((byte) 32, rSString);
	    anInt750++;
	    int i_12_ = class15.method128(class16_10_, -106, i_11_);
	    return Class37_Sub4_Sub2.method456(i_12_, i_11_, class15,
					       (byte) 104);
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516
		      (runtimeexception,
		       ("jg.G(" + i + ','
			+ (rSString != null ? "{...}" : "null") + ','
			+ (class16_10_ != null ? "{...}" : "null") + ','
			+ (class15 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static void method303(int i, Class20[] class20s, byte[] is,
				 int i_13_, int i_14_, Class67 class67,
				 int i_15_, int i_16_, int i_17_, int i_18_,
				 int i_19_) {
	try {
	    anInt747++;
	    ByteVector class37_sub11 = new ByteVector(is);
	    if (i_19_ == 967) {
		int i_20_ = -1;
		for (;;) {
		    int i_21_ = class37_sub11.method961(255);
		    if (i_21_ == 0)
			break;
		    i_20_ += i_21_;
		    int i_22_ = 0;
		    for (;;) {
			int i_23_ = class37_sub11.method961(255);
			if (i_23_ == 0)
			    break;
			i_22_ += i_23_ + -1;
			int i_24_ = class37_sub11.getUnsignedByte();
			int i_25_ = i_22_ >> 467110028;
			int i_26_ = 0x3f & i_22_;
			int i_27_ = 0x3f & i_22_ >> 1114178406;
			int i_28_ = i_24_ >> 2050158242;
			int i_29_ = 0x3 & i_24_;
			if ((i_13_ ^ 0xffffffff) == (i_25_ ^ 0xffffffff)
			    && (i_27_ ^ 0xffffffff) <= (i_14_ ^ 0xffffffff)
			    && (i_27_ ^ 0xffffffff) > (i_14_ - -8 ^ 0xffffffff)
			    && i_26_ >= i_17_
			    && (8 + i_17_ ^ 0xffffffff) < (i_26_
							   ^ 0xffffffff)) {
			    Class37_Sub4_Sub11 class37_sub4_sub11
				= Class37_Sub9_Sub8.method794(i_20_, 28067);
			    int i_30_ = i - -(Class37_Sub9_Sub33.method903
					      (i_26_ & 0x7,
					       class37_sub4_sub11.anInt2731,
					       class37_sub4_sub11.anInt2743,
					       (byte) -38, i_29_, 0x7 & i_27_,
					       i_18_));
			    int i_31_
				= i_16_ + (Class52_Sub1.method1132
					   (i_18_, i_26_ & 0x7,
					    class37_sub4_sub11.anInt2731,
					    i_29_, (byte) 83, 0x7 & i_27_,
					    class37_sub4_sub11.anInt2743));
			    if (i_30_ > 0 && i_31_ > 0 && i_30_ < 103
				&& i_31_ < 103) {
				Class20 class20 = null;
				int i_32_ = i_15_;
				if ((0x2 & (Class1.aByteArrayArrayArray63[1]
					    [i_30_][i_31_])
				     ^ 0xffffffff)
				    == -3)
				    i_32_--;
				if ((i_32_ ^ 0xffffffff) <= -1)
				    class20 = class20s[i_32_];
				Class56.method1144(i_20_, i_28_,
						   0x3 & i_29_ + i_18_, i_15_,
						   class67, false, i_31_,
						   i_30_, class20);
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516
		      (runtimeexception,
		       ("jg.E(" + i + ','
			+ (class20s != null ? "{...}" : "null") + ','
			+ (is != null ? "{...}" : "null") + ',' + i_13_ + ','
			+ i_14_ + ',' + (class67 != null ? "{...}" : "null")
			+ ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_
			+ ',' + i_19_ + ')'));
	}
    }
    
    public static void method304(int i) {
	if (i != 63)
	    anInt761 = -120;
	aClass16_762 = null;
	aRandom751 = null;
	anIntArray754 = null;
    }
    
    public static void method305(boolean bool) {
	if (bool == true) {
	    anInt758++;
	    if (Class37_Sub9_Sub13.keyboardHandler != null) {
		synchronized (Class37_Sub9_Sub13.keyboardHandler) {
		    Class37_Sub9_Sub13.keyboardHandler = null;
		}
	    }
	}
    }
    
    public Class33(int i, int i_33_, int i_34_) {
	anInt749 = i_33_;
	aClass37_Sub14Array748 = new Class37_Sub14[i_33_];
	anInt752 = i;
	anIntArrayArrayArray756 = new int[i][3][i_34_];
    }
    
    static {
	aClass16_762
	    = Class37_Sub2.create_rsstring("Ladevorgang )2 bitte warten Sie)3");
    }
}
