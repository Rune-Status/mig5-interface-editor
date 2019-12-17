package org.ie.client;

/* Class37_Sub9_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub30 extends Class37_Sub9
{
    public int anInt3459;
    public int anInt3460;
    public int anInt3461;
    public static RSString aClass16_3462;
    public static int anInt3463;
    public int anInt3464;
    public int anInt3465;
    public static RSString aClass16_3466
	= Class37_Sub2.create_rsstring("Neuer Benutzer");
    public static int anInt3467;
    public int anInt3468 = 0;
    public static int anInt3469;
    public int anInt3470;
    public static int anInt3471;
    public static RSString aClass16_3472;
    public static int anInt3473;
    public static int anInt3474;
    public static int[] scriptedSkills;
    public static RSString aClass16_3476
	= Class37_Sub2.create_rsstring("Stufe)2");
    public static boolean[] aBooleanArray3477;
    public static int anInt3478;
    public static int anInt3479;
    public static int anInt3480;
    
    public void method752(int i) {
	Class37_Sub9_Sub28.method884(108);
	anInt3469++;
	if (i != -2)
	    method761(103, -90);
    }
    
    public void method750(ByteVector class37_sub11, int i, boolean bool) {
	if (bool == true) {
	    anInt3471++;
	    int i_0_ = i;
	while_111_:
	    do {
	    while_110_:
		do {
		while_109_:
		    do {
		    while_108_:
			do {
			while_107_:
			    do {
				do {
				    if ((i_0_ ^ 0xffffffff) != -1) {
					if ((i_0_ ^ 0xffffffff) != -2) {
					    if (i_0_ != 2) {
						if ((i_0_ ^ 0xffffffff)
						    != -4) {
						    if ((i_0_ ^ 0xffffffff)
							!= -5) {
							if ((i_0_ ^ 0xffffffff)
							    != -6) {
							    if (i_0_ == 6)
								break while_110_;
							    break while_111_;
							}
						    } else
							break while_108_;
						    break while_109_;
						}
					    } else
						break;
					    break while_107_;
					}
				    } else {
					anInt3459
					    = class37_sub11.getUnsignedShort();
					return;
				    }
				    anInt3468 = class37_sub11.getUnsignedShort();
				    return;
				} while (false);
				anInt3470 = class37_sub11.getUnsignedShort();
				return;
			    } while (false);
			    anInt3461 = class37_sub11.getUnsignedShort();
			    return;
			} while (false);
			anInt3465 = class37_sub11.getUnsignedShort();
			return;
		    } while (false);
		    anInt3464 = class37_sub11.getUnsignedShort();
		    return;
		} while (false);
		anInt3460 = class37_sub11.getUnsignedShort();
	    } while (false);
	}
    }
    
    public boolean method892(int i, int i_1_, int i_2_) {
	if (i < 59)
	    anInt3461 = -68;
	anInt3478++;
	int i_3_ = (i_2_ - i_1_) * anInt3465 >> -444229364;
	int i_4_ = (Class37_Sub4_Sub7_Sub2.anIntArray3711
		    [(0xffc60 & 255 * i_3_) >> -2095906900]);
	i_4_ = (i_4_ << -112227540) / anInt3465;
	i_4_ = (i_4_ << 186427852) / anInt3460;
	i_4_ = anInt3464 * i_4_ >> 389424492;
	if (i_4_ <= i_2_ + i_1_ || -i_4_ >= i_2_ + i_1_)
	    return false;
	return true;
    }
    
    public Class37_Sub9_Sub30() {
	super(0, true);
	anInt3459 = 2048;
	anInt3461 = 2048;
	anInt3470 = 0;
	anInt3460 = 20480;
	anInt3465 = 12288;
	anInt3464 = 4096;
    }
    
    public boolean method893(byte i, int i_5_, int i_6_) {
	anInt3474++;
	int i_7_ = anInt3465 * (i_5_ - -i_6_) >> -949350260;
	int i_8_ = (Class37_Sub4_Sub7_Sub2.anIntArray3711
		    [(0xffa81 & 255 * i_7_) >> 147130988]);
	i_8_ = (i_8_ << -1674842004) / anInt3465;
	i_8_ = (i_8_ << -1363788116) / anInt3460;
	if (i != -12)
	    return false;
	i_8_ = i_8_ * anInt3464 >> -1465061940;
	if (i_5_ + -i_6_ >= i_8_ || -i_6_ + i_5_ <= -i_8_)
	    return false;
	return true;
    }
    
    public static void method894(int i) {
	aClass16_3476 = null;
	aBooleanArray3477 = null;
	if (i != 2048)
	    method895(-18, 35L);
	aClass16_3466 = null;
	aClass16_3472 = null;
	scriptedSkills = null;
	aClass16_3462 = null;
    }
    
    public int[] method761(int i, int i_9_) {
	if (i >= -125)
	    aClass16_3466 = null;
	anInt3473++;
	int[] is = aClass38_1966.method1049(i_9_, true);
	if (aClass38_1966.aBoolean850) {
	    int i_10_ = Class37_Sub4_Sub16.anIntArray2871[i_9_] + -2048;
	    for (int i_11_ = 0;
		 (Class32.anInt743 ^ 0xffffffff) < (i_11_ ^ 0xffffffff);
		 i_11_++) {
		int i_12_ = Class84.anIntArray1528[i_11_] - 2048;
		int i_13_ = i_12_ + anInt3459;
		int i_14_ = anInt3461 + i_10_;
		i_14_ = (i_14_ ^ 0xffffffff) > 2047 ? 4096 + i_14_ : i_14_;
		i_14_ = i_14_ <= 2048 ? i_14_ : -4096 + i_14_;
		i_13_ = i_13_ >= -2048 ? i_13_ : i_13_ + 4096;
		i_13_ = (i_13_ ^ 0xffffffff) < -2049 ? -4096 + i_13_ : i_13_;
		int i_15_ = anInt3468 + i_10_;
		int i_16_ = anInt3470 + i_12_;
		i_15_ = (i_15_ ^ 0xffffffff) > 2047 ? i_15_ - -4096 : i_15_;
		i_15_ = i_15_ > 2048 ? -4096 + i_15_ : i_15_;
		i_16_ = (i_16_ ^ 0xffffffff) > 2047 ? i_16_ + 4096 : i_16_;
		i_16_ = (i_16_ ^ 0xffffffff) < -2049 ? i_16_ + -4096 : i_16_;
		is[i_11_]
		    = (!method892(107, i_13_, i_15_)
		       && !method893((byte) -12, i_14_, i_16_)) ? 0 : 4096;
	    }
	}
	return is;
    }
    
    public static void method895(int i, long l) {
	try {
	    anInt3463++;
	    if ((l ^ 0xffffffffffffffffL) != -1L) {
		int i_17_ = -20 % ((i - -25) / 63);
		for (int i_18_ = 0;
		     (i_18_ ^ 0xffffffff) > (RSInterface.anInt340 ^ 0xffffffff);
		     i_18_++) {
		    if ((Class80.aLongArray1504[i_18_] ^ 0xffffffffffffffffL)
			== (l ^ 0xffffffffffffffffL)) {
			Class37_Sub9.anInt1953++;
			RSInterface.anInt340--;
			for (int i_19_ = i_18_;
			     ((RSInterface.anInt340 ^ 0xffffffff)
			      < (i_19_ ^ 0xffffffff));
			     i_19_++) {
			    Class80.aLongArray1504[i_19_]
				= Class80.aLongArray1504[i_19_ - -1];
			    RSInterface.aClass16Array332[i_19_]
				= RSInterface.aClass16Array332[1 + i_19_];
			}
			Class37_Sub9_Sub32.anInt3509 = Class83.anInt1515;
			Class42.aClass37_Sub11_Sub1_936.method989(1);
			Class42.aClass37_Sub11_Sub1_936.method949(l,
								  (byte) -82);
			break;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("ta.D(" + i + ',' + l
						    + ')'));
	}
    }
    
    static {
	aClass16_3472 = Class37_Sub2.create_rsstring("Bad session id)3");
	aClass16_3462 = aClass16_3472;
	anInt3480 = 0;
	anInt3479 = 0;
	scriptedSkills = new int[32];
	aBooleanArray3477 = new boolean[5];
    }
}
