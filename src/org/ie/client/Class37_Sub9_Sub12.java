package org.ie.client;

/* Class37_Sub9_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class37_Sub9_Sub12 extends Class37_Sub9
{
    public int anInt3110;
    public int anInt3111 = 4096;
    public int anInt3112 = 2000;
    public static int[] anIntArray3113;
    public static int anInt3114;
    public int anInt3115 = 16;
    public int anInt3116 = 0;
    public static boolean aBoolean3117;
    public static int anInt3118;
    public static RSString aClass16_3119;
    public static int anInt3120;
    public static int anInt3121 = 0;
    public static int anInt3122;
    public static RSString aClass16_3123;
    public static int anInt3124;
    
    public void method750(ByteVector class37_sub11, int i, boolean bool) {
	int i_0_ = i;
    while_65_:
	do {
	while_64_:
	    do {
	    while_63_:
		do {
		    do {
			if (i_0_ != 0) {
			    if (i_0_ != 1) {
				if ((i_0_ ^ 0xffffffff) != -3) {
				    if ((i_0_ ^ 0xffffffff) != -4) {
					if (i_0_ == 4)
					    break while_64_;
					break while_65_;
				    }
				} else
				    break;
				break while_63_;
			    }
			} else {
			    anInt3116 = class37_sub11.getUnsignedByte();
			    break while_65_;
			}
			anInt3112 = class37_sub11.getUnsignedShort();
			break while_65_;
		    } while (false);
		    anInt3115 = class37_sub11.getUnsignedByte();
		    break while_65_;
		} while (false);
		anInt3110 = class37_sub11.getUnsignedShort();
		break while_65_;
	    } while (false);
	    anInt3111 = class37_sub11.getUnsignedShort();
	} while (false);
	if (bool != true)
	    method750(null, -18, false);
	anInt3124++;
    }
    
    public static void method810(int i) {
	for (int i_1_ = -1;
	     (i_1_ ^ 0xffffffff) > (Class19.anInt487 ^ 0xffffffff); i_1_++) {
	    int i_2_;
	    if (i_1_ == -1)
		i_2_ = 2047;
	    else
		i_2_ = Class26.anIntArray657[i_1_];
	    Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2
		= Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_2_];
	    if (class37_sub4_sub7_sub1_sub2 != null
		&& (class37_sub4_sub7_sub1_sub2.anInt3662 ^ 0xffffffff) < -1) {
		class37_sub4_sub7_sub1_sub2.anInt3662--;
		if (class37_sub4_sub7_sub1_sub2.anInt3662 == 0)
		    class37_sub4_sub7_sub1_sub2.aClass16_3694 = null;
	    }
	}
	for (int i_3_ = 0; i_3_ < Class76.anInt1436; i_3_++) {
	    int i_4_ = Class37_Sub4_Sub16.anIntArray2869[i_3_];
	    Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1
		= Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_4_];
	    if (class37_sub4_sub7_sub1_sub1 != null
		&& (class37_sub4_sub7_sub1_sub1.anInt3662 ^ 0xffffffff) < -1) {
		class37_sub4_sub7_sub1_sub1.anInt3662--;
		if ((class37_sub4_sub7_sub1_sub1.anInt3662 ^ 0xffffffff) == -1)
		    class37_sub4_sub7_sub1_sub1.aClass16_3694 = null;
	    }
	}
	anInt3120++;
	if (i != 4096)
	    aBoolean3117 = false;
    }
    
    public Class37_Sub9_Sub12() {
	super(0, true);
	anInt3110 = 0;
    }
    
    public static void method811(byte i) {
	aClass16_3123 = null;
	anIntArray3113 = null;
	aClass16_3119 = null;
	int i_5_ = 34 % ((-30 - i) / 33);
    }
    
    public void method752(int i) {
	if (i == -2) {
	    Class37_Sub9_Sub28.method884(-109);
	    anInt3122++;
	}
    }
    
    public int[] method761(int i, int i_6_) {
	int[] is = aClass38_1966.method1049(i_6_, true);
	if (i > -125)
	    return null;
	if (aClass38_1966.aBoolean850) {
	    int i_7_ = anInt3111 >> -930971487;
	    int[][] is_8_ = aClass38_1966.method1053(89);
	    Random random = new Random((long) anInt3116);
	    for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (anInt3112 ^ 0xffffffff);
		 i_9_++) {
		int i_10_
		    = ((anInt3111 ^ 0xffffffff) >= -1 ? anInt3110
		       : anInt3110 - -Class20.method216(anInt3111, random,
							(byte) -76) - i_7_);
		i_10_ = (i_10_ & 0xff4) >> -1274525148;
		int i_11_
		    = Class20.method216(Class32.anInt743, random, (byte) -101);
		int i_12_ = Class20.method216(Class37_Sub14.anInt2121, random,
					      (byte) -90);
		int i_13_ = i_12_ + (Hashtable.anIntArray226[i_10_] * anInt3115
				     >> -406625268);
		int i_14_
		    = (Class37_Sub4_Sub7_Sub2.anIntArray3711[i_10_] * anInt3115
		       >> 1899067532) + i_11_;
		int i_15_ = i_13_ - i_12_;
		int i_16_ = i_14_ + -i_11_;
		if (i_16_ != 0 || (i_15_ ^ 0xffffffff) != -1) {
		    if (i_16_ < 0)
			i_16_ = -i_16_;
		    if ((i_15_ ^ 0xffffffff) > -1)
			i_15_ = -i_15_;
		    boolean bool = (i_16_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff);
		    if (bool) {
			int i_17_ = i_14_;
			int i_18_ = i_11_;
			i_11_ = i_12_;
			i_12_ = i_18_;
			i_14_ = i_13_;
			i_13_ = i_17_;
		    }
		    if ((i_11_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff)) {
			int i_19_ = i_11_;
			i_11_ = i_14_;
			i_14_ = i_19_;
			int i_20_ = i_12_;
			i_12_ = i_13_;
			i_13_ = i_20_;
		    }
		    int i_21_ = i_14_ - i_11_;
		    int i_22_ = i_12_;
		    int i_23_ = -i_12_ + i_13_;
		    if (i_23_ < 0)
			i_23_ = -i_23_;
		    int i_24_ = 2048 / i_21_;
		    int i_25_ = -i_21_ / 2;
		    int i_26_
			= 1024 + -(Class20.method216(4096, random, (byte) -91)
				   >> 376903266);
		    int i_27_ = i_12_ < i_13_ ? 1 : -1;
		    for (int i_28_ = i_11_;
			 (i_28_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff);
			 i_28_++) {
			int i_29_ = Applet_Sub1.anInt12 & i_28_;
			int i_30_
			    = Class37_Sub4_Sub7_Sub1_Sub2.anInt3989 & i_22_;
			int i_31_ = 1024 + i_26_ + (-i_11_ + i_28_) * i_24_;
			if (!bool)
			    is_8_[i_29_][i_30_] = i_31_;
			else
			    is_8_[i_30_][i_29_] = i_31_;
			i_25_ += i_23_;
			if (i_25_ > 0) {
			    i_22_ = i_27_ + i_22_;
			    i_25_ -= i_21_;
			}
		    }
		}
	    }
	}
	anInt3118++;
	return is;
    }
    
    static {
	aClass16_3119
	    = (Class37_Sub2.create_rsstring
	       ("Unerwartete Antwort vom Anmelde)2Server"));
	aClass16_3123
	    = Class37_Sub2.create_rsstring("Benutzeroberfl-=che geladen)3");
    }
}
