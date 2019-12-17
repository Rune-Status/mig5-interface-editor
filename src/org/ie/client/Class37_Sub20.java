package org.ie.client;

/* Class37_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class37_Sub20 extends Node
{
    public int[] anIntArray2204;
    public int anInt2205;
    public Class23[] aClass23Array2206;
    public int anInt2207;
    public static int anInt2208;
    public Class23[] aClass23Array2209;
    public static BigInteger aBigInteger2210;
    public static int anInt2211;
    public int[] anIntArray2212;
    public byte[][][] aByteArrayArrayArray2213;
    public int[] anIntArray2214;
    public static RSString aClass16_2215
	= Class37_Sub2.create_rsstring("Benutzen Sie bitte eine andere Welt)3");
    public static Class15_Sub1 aClass15_Sub1_2216;
    public static boolean aBoolean2217;
    public static RSString aClass16_2218;
    public static RSString aClass16_2219;
    public static boolean menu_open;
    
    public static void method1021(int[] is, int i, int[] is_0_, int i_1_,
				  int i_2_, Class56[] class56s) {
	do {
	    try {
		anInt2208++;
		if ((i_1_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
		    int i_3_ = i_1_ - 1;
		    int i_4_ = i_2_ - -1;
		    int i_5_ = (i_1_ + i_2_) / 2;
		    Class56 class56 = class56s[i_5_];
		    class56s[i_5_] = class56s[i_1_];
		    class56s[i_1_] = class56;
		    while (i_4_ > i_3_) {
			boolean bool = true;
			do {
			    i_4_--;
			    for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -5;
				 i_6_++) {
				int i_7_;
				int i_8_;
				if ((is_0_[i_6_] ^ 0xffffffff) == -3) {
				    i_8_ = class56.anInt1086;
				    i_7_ = class56s[i_4_].anInt1086;
				} else if ((is_0_[i_6_] ^ 0xffffffff) != -2) {
				    if (is_0_[i_6_] != 3) {
					i_7_ = class56s[i_4_].anInt1089;
					i_8_ = class56.anInt1089;
				    } else {
					i_7_ = (!class56s[i_4_].aBoolean1082
						? 0 : 1);
					i_8_ = !class56.aBoolean1082 ? 0 : 1;
				    }
				} else {
				    i_7_ = class56s[i_4_].anInt1093;
				    i_8_ = class56.anInt1093;
				    if ((i_7_ ^ 0xffffffff) == 0
					&& is[i_6_] == 1)
					i_7_ = 2001;
				    if ((i_8_ ^ 0xffffffff) == 0
					&& (is[i_6_] ^ 0xffffffff) == -2)
					i_8_ = 2001;
				}
				if (i_8_ == i_7_) {
				    if (i_6_ == 3)
					bool = false;
				} else {
				    if (((is[i_6_] ^ 0xffffffff) != -2
					 || i_8_ >= i_7_)
					&& ((is[i_6_] ^ 0xffffffff) != -1
					    || ((i_8_ ^ 0xffffffff)
						>= (i_7_ ^ 0xffffffff))))
					bool = false;
				    break;
				}
			    }
			} while (bool);
			bool = true;
			do {
			    i_3_++;
			    for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -5;
				 i_9_++) {
				int i_10_;
				int i_11_;
				if (is_0_[i_9_] != 2) {
				    if ((is_0_[i_9_] ^ 0xffffffff) == -2) {
					i_10_ = class56s[i_3_].anInt1093;
					if (i_10_ == -1 && is[i_9_] == 1)
					    i_10_ = 2001;
					i_11_ = class56.anInt1093;
					if ((i_11_ ^ 0xffffffff) == 0
					    && is[i_9_] == 1)
					    i_11_ = 2001;
				    } else if (is_0_[i_9_] != 3) {
					i_10_ = class56s[i_3_].anInt1089;
					i_11_ = class56.anInt1089;
				    } else {
					i_10_ = (class56s[i_3_].aBoolean1082
						 ? 1 : 0);
					i_11_ = !class56.aBoolean1082 ? 0 : 1;
				    }
				} else {
				    i_10_ = class56s[i_3_].anInt1086;
				    i_11_ = class56.anInt1086;
				}
				if ((i_10_ ^ 0xffffffff)
				    != (i_11_ ^ 0xffffffff)) {
				    if (((is[i_9_] ^ 0xffffffff) != -2
					 || ((i_10_ ^ 0xffffffff)
					     <= (i_11_ ^ 0xffffffff)))
					&& (is[i_9_] != 0
					    || ((i_10_ ^ 0xffffffff)
						>= (i_11_ ^ 0xffffffff))))
					bool = false;
				    break;
				}
				if ((i_9_ ^ 0xffffffff) == -4)
				    bool = false;
			    }
			} while (bool);
			if ((i_3_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
			    Class56 class56_12_ = class56s[i_3_];
			    class56s[i_3_] = class56s[i_4_];
			    class56s[i_4_] = class56_12_;
			}
		    }
		    method1021(is, 0, is_0_, i_1_, i_4_, class56s);
		    method1021(is, 0, is_0_, i_4_ - -1, i_2_, class56s);
		}
		if (i == 0)
		    break;
		method1021(null, 114, null, 72, 37, null);
	    } catch (RuntimeException runtimeexception) {
		throw Class37_Sub4_Sub7_Sub3.method516
			  (runtimeexception,
			   ("sh.B(" + (is != null ? "{...}" : "null") + ',' + i
			    + ',' + (is_0_ != null ? "{...}" : "null") + ','
			    + i_1_ + ',' + i_2_ + ','
			    + (class56s != null ? "{...}" : "null") + ')'));
	    }
	    break;
	} while (false);
    }
    
    public static void method1022(int i, int i_13_, int i_14_, int i_15_) {
	if (i_13_ != 3319)
	    aClass15_Sub1_2216 = null;
	for (int i_16_ = 0; i_16_ < 8; i_16_++) {
	    for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -9; i_17_++)
		Class64.anIntArrayArrayArray1217[i_15_][i - -i_16_][(i_17_
								     + i_14_)]
		    = 0;
	}
	anInt2211++;
	if (i > 0) {
	    for (int i_18_ = 1; i_18_ < 8; i_18_++)
		Class64.anIntArrayArrayArray1217[i_15_][i][i_14_ + i_18_]
		    = (Class64.anIntArrayArrayArray1217[i_15_][i + -1]
		       [i_18_ + i_14_]);
	}
	if (i_14_ > 0) {
	    for (int i_19_ = 1; (i_19_ ^ 0xffffffff) > -9; i_19_++)
		Class64.anIntArrayArrayArray1217[i_15_][i + i_19_][i_14_]
		    = (Class64.anIntArrayArrayArray1217[i_15_][i + i_19_]
		       [i_14_ + -1]);
	}
	if (i > 0 && (Class64.anIntArrayArrayArray1217[i_15_][-1 + i][i_14_]
		      ^ 0xffffffff) != -1)
	    Class64.anIntArrayArrayArray1217[i_15_][i][i_14_]
		= Class64.anIntArrayArrayArray1217[i_15_][-1 + i][i_14_];
	else if (i_14_ <= 0
		 || (Class64.anIntArrayArrayArray1217[i_15_][i][i_14_ + -1]
		     ^ 0xffffffff) == -1) {
	    if ((i ^ 0xffffffff) < -1 && (i_14_ ^ 0xffffffff) < -1
		&& (Class64.anIntArrayArrayArray1217[i_15_][-1 + i][i_14_ - 1]
		    != 0))
		Class64.anIntArrayArrayArray1217[i_15_][i][i_14_]
		    = (Class64.anIntArrayArrayArray1217[i_15_][-1 + i]
		       [i_14_ + -1]);
	} else
	    Class64.anIntArrayArrayArray1217[i_15_][i][i_14_]
		= Class64.anIntArrayArrayArray1217[i_15_][i][-1 + i_14_];
    }
    
    public static void method1023(int i) {
	aClass16_2218 = null;
	aClass15_Sub1_2216 = null;
	if (i != -14813)
	    aClass16_2215 = null;
	aClass16_2219 = null;
	aClass16_2215 = null;
	aBigInteger2210 = null;
    }
    
    static {
	aBigInteger2210
	    = (new BigInteger
	       ("58778699976184461502525193738213253649000149147835990136706041084440742975821"));
	aClass16_2219
	    = Class37_Sub2.create_rsstring("go back to the main RuneScape webpage");
	aClass16_2218 = aClass16_2219;
	menu_open = false;
	aBoolean2217 = true;
    }
}
