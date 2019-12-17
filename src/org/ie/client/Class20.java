package org.ie.client;

/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class20
{
    public static Class37_Sub4_Sub9_Sub1[] aClass37_Sub4_Sub9_Sub1Array529;
    public static int anInt530;
    public static int anInt531;
    public static int anInt532;
    public static int anInt533;
    public static int anInt534;
    public static RSString aClass16_535
	= Class37_Sub2.create_rsstring("white:");
    public static int anInt536;
    public static int anInt537;
    public static int anInt538;
    public static RSString aClass16_539 = aClass16_535;
    public static int anInt540;
    public static int anInt541;
    public static int anInt542;
    public static RSString aClass16_543;
    public static int anInt544;
    public int anInt545;
    public static int anInt546;
    public static int anInt547;
    public static RSString aClass16_548;
    public static int anInt549;
    public static int anInt550;
    public static RSString aClass16_551
	= Class37_Sub2.create_rsstring("<col=ff0000>");
    public static int anInt552;
    public int anInt553;
    public int[][] anIntArrayArray554;
    public int anInt555;
    public int anInt556;
    public static RSString aClass16_557;
    
    public void method211(int i, boolean bool, int i_0_, int i_1_) {
	anIntArrayArray554[i_1_][i]
	    = Class37_Sub9_Sub13.method817(anIntArrayArray554[i_1_][i], i_0_);
	if (bool == false)
	    anInt537++;
    }
    
    public static int method212(int i) {
	if (i >= -60)
	    aClass16_543 = null;
	anInt534++;
	return Class37_Sub13.anInt2120++;
    }
    
    public static RSString getAction(RSInterface inter, int id) {
    	if (!Class37_Sub9_Sub13.method813(id, RuntimeException_Sub1.get_click_mask(inter))
    			&& inter.anObjectArray363 == null)
    		return null;
    	if (inter.niActions == null
    			|| (inter.niActions.length ^ 0xffffffff) >= (id ^ 0xffffffff)
    			|| inter.niActions[id] == null
    			|| (inter.niActions[id].method151().length() ^ 0xffffffff) == -1) {
    		if (Class37_Sub3_Sub1.qaoptest)
    			return (Class37_Sub9_Sub27.method881
    					((new RSString[]
								{ Class37_Sub9_Sub26.aClass16_3387,
								Class37_Sub9_Sub24.method870(id, (byte) -114) })));
    		return null;
    	}
    	return inter.niActions[id];
    }
    
    public void method214(int i, int i_3_, int i_4_) {
	i_3_ -= anInt556;
	i -= anInt545;
	anInt532++;
	int i_5_ = 47 % ((i_4_ - 32) / 50);
	anIntArrayArray554[i][i_3_]
	    = Class37_Sub4_Sub7.method490(anIntArrayArray554[i][i_3_],
					  -262145);
    }
    
    public void method215(boolean bool) {
	anInt550++;
	for (int i = 0; anInt555 > i; i++) {
	    for (int i_6_ = 0; (anInt553 ^ 0xffffffff) < (i_6_ ^ 0xffffffff);
		 i_6_++) {
		if (i != 0 && i_6_ != 0 && anInt555 - 5 > i
		    && i_6_ < -5 + anInt553)
		    anIntArrayArray554[i][i_6_] = 16777216;
		else
		    anIntArrayArray554[i][i_6_] = 16777215;
	    }
	}
	if (bool != false)
	    method214(77, -91, 65);
    }
    
    public static int method216(int i, Random random, byte i_7_) {
	anInt536++;
	if ((i ^ 0xffffffff) >= -1)
	    throw new IllegalArgumentException();
	if (i_7_ >= -39)
	    method212(61);
	if (Class37_Sub1.method328(i, (byte) -10))
	    return (int) ((long) i * ((long) random.nextInt() & 0xffffffffL)
			  >> -1680251808);
	int i_8_ = -(int) (4294967296L % (long) i) + -2147483648;
	int i_9_;
	do
	    i_9_ = random.nextInt();
	while (i_8_ <= i_9_);
	return Class45.method1099(i_9_, i, (byte) -74);
    }
    
    public void method217(int i, byte i_10_, boolean bool, int i_11_,
			  int i_12_, int i_13_) {
	anInt538++;
	int i_14_ = -10 % ((i_10_ - -53) / 48);
	i -= anInt556;
	i_12_ -= anInt545;
	if (i_11_ == 0) {
	    if (i_13_ == 0) {
		method211(i, false, 128, i_12_);
		method211(i, false, 8, -1 + i_12_);
	    }
	    if ((i_13_ ^ 0xffffffff) == -2) {
		method211(i, false, 2, i_12_);
		method211(1 + i, false, 32, i_12_);
	    }
	    if ((i_13_ ^ 0xffffffff) == -3) {
		method211(i, false, 8, i_12_);
		method211(i, false, 128, i_12_ + 1);
	    }
	    if (i_13_ == 3) {
		method211(i, false, 32, i_12_);
		method211(i - 1, false, 2, i_12_);
	    }
	}
	if (i_11_ == 1 || i_11_ == 3) {
	    if ((i_13_ ^ 0xffffffff) == -1) {
		method211(i, false, 1, i_12_);
		method211(1 + i, false, 16, -1 + i_12_);
	    }
	    if ((i_13_ ^ 0xffffffff) == -2) {
		method211(i, false, 4, i_12_);
		method211(1 + i, false, 64, i_12_ - -1);
	    }
	    if ((i_13_ ^ 0xffffffff) == -3) {
		method211(i, false, 16, i_12_);
		method211(-1 + i, false, 1, i_12_ + 1);
	    }
	    if ((i_13_ ^ 0xffffffff) == -4) {
		method211(i, false, 64, i_12_);
		method211(i - 1, false, 4, -1 + i_12_);
	    }
	}
	if ((i_11_ ^ 0xffffffff) == -3) {
	    if ((i_13_ ^ 0xffffffff) == -1) {
		method211(i, false, 130, i_12_);
		method211(i, false, 8, i_12_ + -1);
		method211(i + 1, false, 32, i_12_);
	    }
	    if (i_13_ == 1) {
		method211(i, false, 10, i_12_);
		method211(1 + i, false, 32, i_12_);
		method211(i, false, 128, 1 + i_12_);
	    }
	    if (i_13_ == 2) {
		method211(i, false, 40, i_12_);
		method211(i, false, 128, i_12_ - -1);
		method211(-1 + i, false, 2, i_12_);
	    }
	    if ((i_13_ ^ 0xffffffff) == -4) {
		method211(i, false, 160, i_12_);
		method211(-1 + i, false, 2, i_12_);
		method211(i, false, 8, i_12_ + -1);
	    }
	}
	if (bool) {
	    if ((i_11_ ^ 0xffffffff) == -1) {
		if (i_13_ == 0) {
		    method211(i, false, 65536, i_12_);
		    method211(i, false, 4096, -1 + i_12_);
		}
		if (i_13_ == 1) {
		    method211(i, false, 1024, i_12_);
		    method211(1 + i, false, 16384, i_12_);
		}
		if (i_13_ == 2) {
		    method211(i, false, 4096, i_12_);
		    method211(i, false, 65536, 1 + i_12_);
		}
		if ((i_13_ ^ 0xffffffff) == -4) {
		    method211(i, false, 16384, i_12_);
		    method211(-1 + i, false, 1024, i_12_);
		}
	    }
	    if (i_11_ == 1 || (i_11_ ^ 0xffffffff) == -4) {
		if ((i_13_ ^ 0xffffffff) == -1) {
		    method211(i, false, 512, i_12_);
		    method211(1 + i, false, 8192, i_12_ + -1);
		}
		if (i_13_ == 1) {
		    method211(i, false, 2048, i_12_);
		    method211(1 + i, false, 32768, 1 + i_12_);
		}
		if (i_13_ == 2) {
		    method211(i, false, 8192, i_12_);
		    method211(i + -1, false, 512, i_12_ - -1);
		}
		if ((i_13_ ^ 0xffffffff) == -4) {
		    method211(i, false, 32768, i_12_);
		    method211(-1 + i, false, 2048, i_12_ - 1);
		}
	    }
	    if (i_11_ == 2) {
		if ((i_13_ ^ 0xffffffff) == -1) {
		    method211(i, false, 66560, i_12_);
		    method211(i, false, 4096, i_12_ - 1);
		    method211(1 + i, false, 16384, i_12_);
		}
		if (i_13_ == 1) {
		    method211(i, false, 5120, i_12_);
		    method211(i + 1, false, 16384, i_12_);
		    method211(i, false, 65536, i_12_ + 1);
		}
		if (i_13_ == 2) {
		    method211(i, false, 20480, i_12_);
		    method211(i, false, 65536, i_12_ - -1);
		    method211(-1 + i, false, 1024, i_12_);
		}
		if (i_13_ == 3) {
		    method211(i, false, 81920, i_12_);
		    method211(-1 + i, false, 1024, i_12_);
		    method211(i, false, 4096, -1 + i_12_);
		}
	    }
	}
    }
    
    public void method218(int i, int i_15_, int i_16_) {
	i -= anInt556;
	i_16_ -= anInt545;
	anInt531++;
	anIntArrayArray554[i_16_][i]
	    = Class37_Sub9_Sub13.method817(anIntArrayArray554[i_16_][i],
					   2097152);
	if (i_15_ != -4)
	    aClass16_557 = null;
    }
    
    public boolean method219(int i, int i_17_, int i_18_, boolean bool,
			     int i_19_, int i_20_, int i_21_, int i_22_) {
	if (bool != false)
	    aClass16_551 = null;
	int i_23_ = i + i_21_ + -1;
	int i_24_ = -1 + (i_18_ + i_22_);
	anInt533++;
	if (i_19_ >= i_22_ && (i_24_ ^ 0xffffffff) <= (i_19_ ^ 0xffffffff)
	    && (i_20_ ^ 0xffffffff) <= (i_21_ ^ 0xffffffff) && i_20_ <= i_23_)
	    return true;
	if (-1 + i_22_ == i_19_ && (i_21_ ^ 0xffffffff) >= (i_20_ ^ 0xffffffff)
	    && (i_20_ ^ 0xffffffff) >= (i_23_ ^ 0xffffffff)
	    && (0x8 & anIntArrayArray554[-anInt545 + i_19_][i_20_ + -anInt556]
		^ 0xffffffff) == -1
	    && (i_17_ & 0x8 ^ 0xffffffff) == -1)
	    return true;
	if (i_19_ == 1 + i_24_ && i_20_ >= i_21_ && i_20_ <= i_23_
	    && (anIntArrayArray554[i_19_ + -anInt545][i_20_ - anInt556] & 0x80
		^ 0xffffffff) == -1
	    && (0x2 & i_17_ ^ 0xffffffff) == -1)
	    return true;
	if ((-1 + i_21_ ^ 0xffffffff) == (i_20_ ^ 0xffffffff) && i_19_ >= i_22_
	    && (i_19_ ^ 0xffffffff) >= (i_24_ ^ 0xffffffff)
	    && (0x2 & anIntArrayArray554[i_19_ - anInt545][i_20_ + -anInt556]
		^ 0xffffffff) == -1
	    && (i_17_ & 0x4) == 0)
	    return true;
	if (i_20_ == 1 + i_23_ && i_19_ >= i_22_ && i_19_ <= i_24_
	    && (0x20 & anIntArrayArray554[-anInt545 + i_19_][i_20_ + -anInt556]
		^ 0xffffffff) == -1
	    && (0x1 & i_17_) == 0)
	    return true;
	return false;
    }
    
    public static void method220(int i) {
	aClass16_551 = null;
	aClass16_557 = null;
	if (i != 1)
	    aClass16_535 = null;
	aClass16_535 = null;
	aClass37_Sub4_Sub9_Sub1Array529 = null;
	aClass16_539 = null;
	aClass16_543 = null;
	aClass16_548 = null;
    }
    
    public void method221(int i, int i_25_, int i_26_, int i_27_, boolean bool,
			  int i_28_) {
	i_27_ -= anInt545;
	i_25_ -= anInt556;
	if (i == 0) {
	    if (i_26_ == 0) {
		method224(i_27_, i_25_, 1, 128);
		method224(i_27_ + -1, i_25_, 1, 8);
	    }
	    if ((i_26_ ^ 0xffffffff) == -2) {
		method224(i_27_, i_25_, 1, 2);
		method224(i_27_, i_25_ + 1, 1, 32);
	    }
	    if ((i_26_ ^ 0xffffffff) == -3) {
		method224(i_27_, i_25_, 1, 8);
		method224(1 + i_27_, i_25_, 1, 128);
	    }
	    if ((i_26_ ^ 0xffffffff) == -4) {
		method224(i_27_, i_25_, 1, 32);
		method224(i_27_, -1 + i_25_, 1, 2);
	    }
	}
	anInt549++;
	if ((i ^ 0xffffffff) == -2 || i == 3) {
	    if ((i_26_ ^ 0xffffffff) == -1) {
		method224(i_27_, i_25_, 1, 1);
		method224(i_27_ + -1, i_25_ - -1, 1, 16);
	    }
	    if (i_26_ == 1) {
		method224(i_27_, i_25_, 1, 4);
		method224(i_27_ + 1, i_25_ - -1, 1, 64);
	    }
	    if ((i_26_ ^ 0xffffffff) == -3) {
		method224(i_27_, i_25_, 1, 16);
		method224(1 + i_27_, i_25_ + -1, 1, 1);
	    }
	    if ((i_26_ ^ 0xffffffff) == -4) {
		method224(i_27_, i_25_, 1, 64);
		method224(-1 + i_27_, -1 + i_25_, 1, 4);
	    }
	}
	if (i == 2) {
	    if (i_26_ == 0) {
		method224(i_27_, i_25_, 1, 130);
		method224(-1 + i_27_, i_25_, 1, 8);
		method224(i_27_, i_25_ + 1, 1, 32);
	    }
	    if ((i_26_ ^ 0xffffffff) == -2) {
		method224(i_27_, i_25_, 1, 10);
		method224(i_27_, 1 + i_25_, 1, 32);
		method224(i_27_ + 1, i_25_, 1, 128);
	    }
	    if ((i_26_ ^ 0xffffffff) == -3) {
		method224(i_27_, i_25_, 1, 40);
		method224(1 + i_27_, i_25_, 1, 128);
		method224(i_27_, i_25_ - 1, 1, 2);
	    }
	    if ((i_26_ ^ 0xffffffff) == -4) {
		method224(i_27_, i_25_, 1, 160);
		method224(i_27_, -1 + i_25_, 1, 2);
		method224(-1 + i_27_, i_25_, 1, 8);
	    }
	}
	if (bool) {
	    if (i == 0) {
		if (i_26_ == 0) {
		    method224(i_27_, i_25_, 1, 65536);
		    method224(-1 + i_27_, i_25_, 1, 4096);
		}
		if (i_26_ == 1) {
		    method224(i_27_, i_25_, 1, 1024);
		    method224(i_27_, 1 + i_25_, 1, 16384);
		}
		if (i_26_ == 2) {
		    method224(i_27_, i_25_, 1, 4096);
		    method224(1 + i_27_, i_25_, 1, 65536);
		}
		if ((i_26_ ^ 0xffffffff) == -4) {
		    method224(i_27_, i_25_, 1, 16384);
		    method224(i_27_, i_25_ - 1, 1, 1024);
		}
	    }
	    if ((i ^ 0xffffffff) == -2 || (i ^ 0xffffffff) == -4) {
		if ((i_26_ ^ 0xffffffff) == -1) {
		    method224(i_27_, i_25_, 1, 512);
		    method224(-1 + i_27_, i_25_ + 1, 1, 8192);
		}
		if (i_26_ == 1) {
		    method224(i_27_, i_25_, 1, 2048);
		    method224(1 + i_27_, i_25_ - -1, 1, 32768);
		}
		if ((i_26_ ^ 0xffffffff) == -3) {
		    method224(i_27_, i_25_, 1, 8192);
		    method224(1 + i_27_, i_25_ - 1, 1, 512);
		}
		if (i_26_ == 3) {
		    method224(i_27_, i_25_, 1, 32768);
		    method224(-1 + i_27_, -1 + i_25_, 1, 2048);
		}
	    }
	    if ((i ^ 0xffffffff) == -3) {
		if ((i_26_ ^ 0xffffffff) == -1) {
		    method224(i_27_, i_25_, 1, 66560);
		    method224(-1 + i_27_, i_25_, 1, 4096);
		    method224(i_27_, i_25_ + 1, 1, 16384);
		}
		if (i_26_ == 1) {
		    method224(i_27_, i_25_, 1, 5120);
		    method224(i_27_, i_25_ - -1, 1, 16384);
		    method224(1 + i_27_, i_25_, 1, 65536);
		}
		if (i_26_ == 2) {
		    method224(i_27_, i_25_, 1, 20480);
		    method224(1 + i_27_, i_25_, 1, 65536);
		    method224(i_27_, -1 + i_25_, 1, 1024);
		}
		if (i_26_ == 3) {
		    method224(i_27_, i_25_, 1, 81920);
		    method224(i_27_, i_25_ - 1, 1, 1024);
		    method224(-1 + i_27_, i_25_, 1, 4096);
		}
	    }
	}
	if (i_28_ < 50)
	    anInt555 = 18;
    }
    
    public void method222(int i, int i_29_, int i_30_) {
	i_30_ -= anInt545;
	if (i == 26108) {
	    anInt530++;
	    i_29_ -= anInt556;
	    anIntArrayArray554[i_30_][i_29_]
		= Class37_Sub9_Sub13
		      .method817(anIntArrayArray554[i_30_][i_29_], 262144);
	}
    }
    
    public void method223(int i, int i_31_, int i_32_, int i_33_, int i_34_,
			  boolean bool) {
	anInt544++;
	if (i_32_ != -1)
	    aClass37_Sub4_Sub9_Sub1Array529 = null;
	i_34_ -= anInt545;
	i -= anInt556;
	int i_35_ = 256;
	if (bool)
	    i_35_ += 131072;
	for (int i_36_ = i_34_; i_33_ + i_34_ > i_36_; i_36_++) {
	    if ((i_36_ ^ 0xffffffff) <= -1 && anInt555 > i_36_) {
		for (int i_37_ = i; i - -i_31_ > i_37_; i_37_++) {
		    if ((i_37_ ^ 0xffffffff) <= -1 && anInt553 > i_37_)
			method211(i_37_, false, i_35_, i_36_);
		}
	    }
	}
    }
    
    public void method224(int i, int i_38_, int i_39_, int i_40_) {
	anIntArrayArray554[i][i_38_]
	    = Class37_Sub4_Sub7.method490(anIntArrayArray554[i][i_38_],
					  i_40_ ^ 0xffffffff);
	anInt541++;
	if (i_39_ != 1)
	    method212(120);
    }
    
    public boolean method225(int i, int i_41_, byte i_42_, int i_43_,
			     int i_44_, int i_45_, int i_46_) {
	anInt540++;
	if (i_46_ == i_43_ && i_41_ == i_44_)
	    return true;
	i_46_ -= anInt545;
	i_43_ -= anInt545;
	i_44_ -= anInt556;
	i_41_ -= anInt556;
	if ((i_45_ ^ 0xffffffff) == -7 || i_45_ == 7) {
	    if ((i_45_ ^ 0xffffffff) == -8)
		i = i - -2 & 0x3;
	    if ((i ^ 0xffffffff) != -1) {
		if ((i ^ 0xffffffff) == -2) {
		    if (-1 + i_43_ == i_46_ && i_41_ == i_44_
			&& (0x8 & anIntArrayArray554[i_46_][i_41_]
			    ^ 0xffffffff) == -1)
			return true;
		    if (i_43_ == i_46_ && i_44_ + -1 == i_41_
			&& (0x2 & anIntArrayArray554[i_46_][i_41_]) == 0)
			return true;
		} else if (i == 2) {
		    if (-1 + i_43_ == i_46_
			&& (i_44_ ^ 0xffffffff) == (i_41_ ^ 0xffffffff)
			&& (0x8 & anIntArrayArray554[i_46_][i_41_]
			    ^ 0xffffffff) == -1)
			return true;
		    if ((i_43_ ^ 0xffffffff) == (i_46_ ^ 0xffffffff)
			&& (i_44_ - -1 ^ 0xffffffff) == (i_41_ ^ 0xffffffff)
			&& (anIntArrayArray554[i_46_][i_41_] & 0x20
			    ^ 0xffffffff) == -1)
			return true;
		} else if ((i ^ 0xffffffff) == -4) {
		    if (i_43_ + 1 == i_46_ && i_44_ == i_41_
			&& (0x80 & anIntArrayArray554[i_46_][i_41_]) == 0)
			return true;
		    if ((i_43_ ^ 0xffffffff) == (i_46_ ^ 0xffffffff)
			&& i_41_ == i_44_ + 1
			&& (anIntArrayArray554[i_46_][i_41_] & 0x20) == 0)
			return true;
		}
	    } else {
		if ((i_46_ ^ 0xffffffff) == (1 + i_43_ ^ 0xffffffff)
		    && i_44_ == i_41_
		    && ((0x80 & anIntArrayArray554[i_46_][i_41_] ^ 0xffffffff)
			== -1))
		    return true;
		if (i_43_ == i_46_
		    && (i_41_ ^ 0xffffffff) == (i_44_ - 1 ^ 0xffffffff)
		    && (0x2 & anIntArrayArray554[i_46_][i_41_]) == 0)
		    return true;
	    }
	}
	int i_47_ = -103 % ((i_42_ - 19) / 60);
	if (i_45_ == 8) {
	    if ((i_43_ ^ 0xffffffff) == (i_46_ ^ 0xffffffff)
		&& 1 + i_44_ == i_41_
		&& (0x20 & anIntArrayArray554[i_46_][i_41_]) == 0)
		return true;
	    if (i_43_ == i_46_
		&& (i_44_ + -1 ^ 0xffffffff) == (i_41_ ^ 0xffffffff)
		&& (0x2 & anIntArrayArray554[i_46_][i_41_]) == 0)
		return true;
	    if ((i_46_ ^ 0xffffffff) == (i_43_ - 1 ^ 0xffffffff)
		&& i_44_ == i_41_
		&& (anIntArrayArray554[i_46_][i_41_] & 0x8 ^ 0xffffffff) == -1)
		return true;
	    if ((1 + i_43_ ^ 0xffffffff) == (i_46_ ^ 0xffffffff)
		&& i_44_ == i_41_
		&& ((anIntArrayArray554[i_46_][i_41_] & 0x80 ^ 0xffffffff)
		    == -1))
		return true;
	}
	return false;
    }
    
    public void method226(int i, boolean bool, int i_48_, int i_49_, int i_50_,
			  byte i_51_, int i_52_) {
	i -= anInt545;
	if (i_51_ != -73)
	    aClass16_543 = null;
	anInt547++;
	i_52_ -= anInt556;
	int i_53_ = 256;
	if (bool)
	    i_53_ += 131072;
	if (i_48_ == 1 || i_48_ == 3) {
	    int i_54_ = i_49_;
	    i_49_ = i_50_;
	    i_50_ = i_54_;
	}
	for (int i_55_ = i; (i_49_ + i ^ 0xffffffff) < (i_55_ ^ 0xffffffff);
	     i_55_++) {
	    if ((i_55_ ^ 0xffffffff) <= -1 && anInt555 > i_55_) {
		for (int i_56_ = i_52_;
		     (i_52_ - -i_50_ ^ 0xffffffff) < (i_56_ ^ 0xffffffff);
		     i_56_++) {
		    if ((i_56_ ^ 0xffffffff) <= -1 && anInt553 > i_56_)
			method224(i_55_, i_56_, 1, i_53_);
		}
	    }
	}
    }
    
    public Class20(int i, int i_57_) {
	anInt553 = i_57_;
	anInt555 = i;
	anInt545 = 0;
	anInt556 = 0;
	anIntArrayArray554 = new int[anInt555][anInt553];
	method215(false);
    }
    
    public boolean method227(int i, int i_58_, int i_59_, int i_60_, int i_61_,
			     int i_62_, int i_63_) {
	anInt552++;
	if (i_59_ == i_58_ && (i_60_ ^ 0xffffffff) == (i ^ 0xffffffff))
	    return true;
	i_59_ -= anInt545;
	i_60_ -= anInt556;
	i_58_ -= anInt545;
	i -= anInt556;
	if (i_62_ == 0) {
	    if ((i_63_ ^ 0xffffffff) != -1) {
		if (i_63_ != 1) {
		    if (i_63_ != 2) {
			if ((i_63_ ^ 0xffffffff) == -4) {
			    if ((i_59_ ^ 0xffffffff) == (i_58_ ^ 0xffffffff)
				&& (i - 1 ^ 0xffffffff) == (i_60_
							    ^ 0xffffffff))
				return true;
			    if ((-1 + i_59_ ^ 0xffffffff) == (i_58_
							      ^ 0xffffffff)
				&& i_60_ == i
				&& ((anIntArrayArray554[i_58_][i_60_]
				     & 0x12c0108)
				    ^ 0xffffffff) == -1)
				return true;
			    if (1 + i_59_ == i_58_
				&& (i ^ 0xffffffff) == (i_60_ ^ 0xffffffff)
				&& (anIntArrayArray554[i_58_][i_60_]
				    & 0x12c0180) == 0)
				return true;
			}
		    } else {
			if (i_59_ + 1 == i_58_
			    && (i_60_ ^ 0xffffffff) == (i ^ 0xffffffff))
			    return true;
			if (i_59_ == i_58_ && i_60_ == i + 1
			    && (0x12c0120 & anIntArrayArray554[i_58_][i_60_]
				^ 0xffffffff) == -1)
			    return true;
			if (i_59_ == i_58_
			    && (-1 + i ^ 0xffffffff) == (i_60_ ^ 0xffffffff)
			    && ((anIntArrayArray554[i_58_][i_60_] & 0x12c0102)
				== 0))
			    return true;
		    }
		} else {
		    if ((i_59_ ^ 0xffffffff) == (i_58_ ^ 0xffffffff)
			&& (i + 1 ^ 0xffffffff) == (i_60_ ^ 0xffffffff))
			return true;
		    if (i_58_ == i_59_ - 1 && i_60_ == i
			&& (anIntArrayArray554[i_58_][i_60_] & 0x12c0108
			    ^ 0xffffffff) == -1)
			return true;
		    if ((i_59_ + 1 ^ 0xffffffff) == (i_58_ ^ 0xffffffff)
			&& i == i_60_
			&& (0x12c0180 & anIntArrayArray554[i_58_][i_60_]
			    ^ 0xffffffff) == -1)
			return true;
		}
	    } else {
		if (i_58_ == i_59_ - 1 && i == i_60_)
		    return true;
		if (i_59_ == i_58_ && 1 + i == i_60_
		    && (0x12c0120 & anIntArrayArray554[i_58_][i_60_]
			^ 0xffffffff) == -1)
		    return true;
		if ((i_58_ ^ 0xffffffff) == (i_59_ ^ 0xffffffff)
		    && (i_60_ ^ 0xffffffff) == (-1 + i ^ 0xffffffff)
		    && (0x12c0102 & anIntArrayArray554[i_58_][i_60_]
			^ 0xffffffff) == -1)
		    return true;
	    }
	}
	if (i_61_ == (i_62_ ^ 0xffffffff)) {
	    if (i_63_ == 0) {
		if (i_59_ - 1 == i_58_ && i == i_60_)
		    return true;
		if ((i_58_ ^ 0xffffffff) == (i_59_ ^ 0xffffffff)
		    && (i_60_ ^ 0xffffffff) == (i + 1 ^ 0xffffffff))
		    return true;
		if ((i_59_ - -1 ^ 0xffffffff) == (i_58_ ^ 0xffffffff)
		    && i_60_ == i
		    && (0x12c0180 & anIntArrayArray554[i_58_][i_60_]) == 0)
		    return true;
		if (i_59_ == i_58_ && -1 + i == i_60_
		    && (anIntArrayArray554[i_58_][i_60_] & 0x12c0102) == 0)
		    return true;
	    } else if ((i_63_ ^ 0xffffffff) != -2) {
		if ((i_63_ ^ 0xffffffff) == -3) {
		    if ((-1 + i_59_ ^ 0xffffffff) == (i_58_ ^ 0xffffffff)
			&& (i_60_ ^ 0xffffffff) == (i ^ 0xffffffff)
			&& (0x12c0108 & anIntArrayArray554[i_58_][i_60_]
			    ^ 0xffffffff) == -1)
			return true;
		    if (i_59_ == i_58_
			&& (i - -1 ^ 0xffffffff) == (i_60_ ^ 0xffffffff)
			&& (0x12c0120 & anIntArrayArray554[i_58_][i_60_]
			    ^ 0xffffffff) == -1)
			return true;
		    if ((i_58_ ^ 0xffffffff) == (i_59_ + 1 ^ 0xffffffff)
			&& i_60_ == i)
			return true;
		    if (i_58_ == i_59_
			&& (-1 + i ^ 0xffffffff) == (i_60_ ^ 0xffffffff))
			return true;
		} else if ((i_63_ ^ 0xffffffff) == -4) {
		    if ((i_58_ ^ 0xffffffff) == (-1 + i_59_ ^ 0xffffffff)
			&& i == i_60_)
			return true;
		    if ((i_59_ ^ 0xffffffff) == (i_58_ ^ 0xffffffff)
			&& (i_60_ ^ 0xffffffff) == (1 + i ^ 0xffffffff)
			&& (0x12c0120 & anIntArrayArray554[i_58_][i_60_]
			    ^ 0xffffffff) == -1)
			return true;
		    if (i_58_ == 1 + i_59_ && i_60_ == i
			&& (0x12c0180 & anIntArrayArray554[i_58_][i_60_]) == 0)
			return true;
		    if (i_59_ == i_58_
			&& (i + -1 ^ 0xffffffff) == (i_60_ ^ 0xffffffff))
			return true;
		}
	    } else {
		if ((i_58_ ^ 0xffffffff) == (-1 + i_59_ ^ 0xffffffff)
		    && (i ^ 0xffffffff) == (i_60_ ^ 0xffffffff)
		    && (anIntArrayArray554[i_58_][i_60_] & 0x12c0108) == 0)
		    return true;
		if ((i_59_ ^ 0xffffffff) == (i_58_ ^ 0xffffffff)
		    && i_60_ == 1 + i)
		    return true;
		if (1 + i_59_ == i_58_
		    && (i ^ 0xffffffff) == (i_60_ ^ 0xffffffff))
		    return true;
		if ((i_59_ ^ 0xffffffff) == (i_58_ ^ 0xffffffff)
		    && -1 + i == i_60_
		    && (anIntArrayArray554[i_58_][i_60_] & 0x12c0102
			^ 0xffffffff) == -1)
		    return true;
	    }
	}
	if (i_62_ == 9) {
	    if ((i_59_ ^ 0xffffffff) == (i_58_ ^ 0xffffffff) && 1 + i == i_60_
		&& ((0x20 & anIntArrayArray554[i_58_][i_60_] ^ 0xffffffff)
		    == -1))
		return true;
	    if (i_58_ == i_59_ && (-1 + i ^ 0xffffffff) == (i_60_ ^ 0xffffffff)
		&& (0x2 & anIntArrayArray554[i_58_][i_60_] ^ 0xffffffff) == -1)
		return true;
	    if ((i_58_ ^ 0xffffffff) == (i_59_ - 1 ^ 0xffffffff)
		&& (i_60_ ^ 0xffffffff) == (i ^ 0xffffffff)
		&& (0x8 & anIntArrayArray554[i_58_][i_60_]) == 0)
		return true;
	    if ((1 + i_59_ ^ 0xffffffff) == (i_58_ ^ 0xffffffff)
		&& (i ^ 0xffffffff) == (i_60_ ^ 0xffffffff)
		&& (0x80 & anIntArrayArray554[i_58_][i_60_]) == 0)
		return true;
	}
	return false;
    }
    
    static {
	anInt542 = 0;
	aClass16_548
	    = Class37_Sub2.create_rsstring("Starting game engine)3)3)3");
	aClass16_557 = aClass16_535;
	aClass16_543 = aClass16_548;
    }
}
