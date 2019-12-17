package org.ie.client;

/* Class37_Sub9_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub27 extends Class37_Sub9
{
    public boolean aBoolean3397 = true;
    public static int anInt3398;
    public static ByteVector aClass37_Sub11_3399;
    public static int anInt3400 = 10;
    public static int[] anIntArray3401;
    public static RSString aClass16_3402;
    public static int anInt3403;
    public static RSString aClass16_3404;
    public static int anInt3405;
    public static int[][] anIntArrayArray3406;
    public static int[][][] anIntArrayArrayArray3407 = new int[4][13][13];
    public static int anInt3408;
    public static int anInt3409;
    public static int anInt3410;
    public static RSString aClass16_3411;
    public static int anInt3412;
    public static int anInt3413;
    public static RSString aClass16_3414;
    public static RSString aClass16_3415
	= Class37_Sub2.create_rsstring("sl_back");
    public boolean aBoolean3416 = true;
    public static Class55 aClass55_3417;
    public static int anInt3418;
    public static int anInt3419;
    
    public int[][] method759(byte i, int i_0_) {
	anInt3413++;
	if (i <= 111)
	    method750(null, -15, false);
	int[][] is = aClass33_1946.method298(false, i_0_);
	if (aClass33_1946.aBoolean767) {
	    int[][] is_1_
		= this.method762(0,
				 aBoolean3416 ? (Class37_Sub4_Sub7_Sub1_Sub2
						 .anInt3989) - i_0_ : i_0_,
				 (byte) -92);
	    int[] is_2_ = is_1_[2];
	    int[] is_3_ = is[0];
	    int[] is_4_ = is_1_[0];
	    int[] is_5_ = is_1_[1];
	    int[] is_6_ = is[1];
	    int[] is_7_ = is[2];
	    if (!aBoolean3397) {
		for (int i_8_ = 0; i_8_ < Class32.anInt743; i_8_++) {
		    is_3_[i_8_] = is_4_[i_8_];
		    is_6_[i_8_] = is_5_[i_8_];
		    is_7_[i_8_] = is_2_[i_8_];
		}
	    } else {
		for (int i_9_ = 0; Class32.anInt743 > i_9_; i_9_++) {
		    is_3_[i_9_] = is_4_[-i_9_ + Applet_Sub1.anInt12];
		    is_6_[i_9_] = is_5_[-i_9_ + Applet_Sub1.anInt12];
		    is_7_[i_9_] = is_2_[-i_9_ + Applet_Sub1.anInt12];
		}
	    }
	}
	return is;
    }
    
    public static void method878(byte i) {
	aClass16_3415 = null;
	if (i != 94)
	    method878((byte) 52);
	aClass16_3414 = null;
	aClass55_3417 = null;
	aClass16_3411 = null;
	aClass16_3404 = null;
	anIntArrayArrayArray3407 = null;
	aClass16_3402 = null;
	anIntArray3401 = null;
	anIntArrayArray3406 = null;
	aClass37_Sub11_3399 = null;
    }
    
    public static void method879(int i) {
	anInt3409++;
	Class37_Sub4_Sub7_Sub2 class37_sub4_sub7_sub2
	    = ((Class37_Sub4_Sub7_Sub2)
	       Class37_Sub9_Sub5.aClass58_2994.getFirst());
	if (i == -1) {
	    for (/**/; class37_sub4_sub7_sub2 != null;
		 class37_sub4_sub7_sub2
		     = (Class37_Sub4_Sub7_Sub2) Class37_Sub9_Sub5
						    .aClass58_2994
						    .getNext()) {
		if (((Class37_Sub9_Sub1.anInt2916 ^ 0xffffffff)
		     == (class37_sub4_sub7_sub2.anInt3723 ^ 0xffffffff))
		    && (Class37_Sub7.loopCycle
			<= class37_sub4_sub7_sub2.anInt3730)) {
		    if ((class37_sub4_sub7_sub2.anInt3713 ^ 0xffffffff)
			>= (Class37_Sub7.loopCycle ^ 0xffffffff)) {
			if (class37_sub4_sub7_sub2.anInt3710 > 0) {
			    Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1
				= (Class37_Sub13
				   .aClass37_Sub4_Sub7_Sub1_Sub1Array2111
				   [class37_sub4_sub7_sub2.anInt3710 + -1]);
			    if (class37_sub4_sub7_sub1_sub1 != null
				&& class37_sub4_sub7_sub1_sub1.anInt3666 >= 0
				&& (class37_sub4_sub7_sub1_sub1.anInt3666
				    ^ 0xffffffff) > -13313
				&& (class37_sub4_sub7_sub1_sub1.anInt3642
				    ^ 0xffffffff) <= -1
				&& (class37_sub4_sub7_sub1_sub1.anInt3642
				    < 13312))
				class37_sub4_sub7_sub2.method514
				    (class37_sub4_sub7_sub1_sub1.anInt3666,
				     Class37_Sub7.loopCycle, true,
				     class37_sub4_sub7_sub1_sub1.anInt3642,
				     ((RSString.method153
				       (class37_sub4_sub7_sub2.anInt3723,
					class37_sub4_sub7_sub1_sub1.anInt3642,
					class37_sub4_sub7_sub1_sub1.anInt3666))
				      + -class37_sub4_sub7_sub2.anInt3725));
			}
			if ((class37_sub4_sub7_sub2.anInt3710 ^ 0xffffffff)
			    > -1) {
			    int i_10_ = -1 + -class37_sub4_sub7_sub2.anInt3710;
			    Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2;
			    if ((Class37_Sub9_Sub5.anInt2998 ^ 0xffffffff)
				== (i_10_ ^ 0xffffffff))
				class37_sub4_sub7_sub1_sub2
				    = (Class37_Sub23
				       .aClass37_Sub4_Sub7_Sub1_Sub2_2234);
			    else
				class37_sub4_sub7_sub1_sub2
				    = (Class75
				       .aClass37_Sub4_Sub7_Sub1_Sub2Array1414
				       [i_10_]);
			    if (class37_sub4_sub7_sub1_sub2 != null
				&& (class37_sub4_sub7_sub1_sub2.anInt3666
				    ^ 0xffffffff) <= -1
				&& (class37_sub4_sub7_sub1_sub2.anInt3666
				    ^ 0xffffffff) > -13313
				&& class37_sub4_sub7_sub1_sub2.anInt3642 >= 0
				&& (class37_sub4_sub7_sub1_sub2.anInt3642
				    < 13312))
				class37_sub4_sub7_sub2.method514
				    (class37_sub4_sub7_sub1_sub2.anInt3666,
				     Class37_Sub7.loopCycle, true,
				     class37_sub4_sub7_sub1_sub2.anInt3642,
				     ((RSString.method153
				       (class37_sub4_sub7_sub2.anInt3723,
					class37_sub4_sub7_sub1_sub2.anInt3642,
					class37_sub4_sub7_sub1_sub2.anInt3666))
				      - class37_sub4_sub7_sub2.anInt3725));
			}
			class37_sub4_sub7_sub2
			    .method511(Class37_Sub9_Sub37.anInt3589, -3317);
			Class38.aClass67_847.method1238
			    (Class37_Sub9_Sub1.anInt2916,
			     (int) class37_sub4_sub7_sub2.aDouble3734,
			     (int) class37_sub4_sub7_sub2.aDouble3733,
			     (int) class37_sub4_sub7_sub2.aDouble3708, 60,
			     class37_sub4_sub7_sub2,
			     class37_sub4_sub7_sub2.anInt3732, -1, false);
		    }
		} else
		    class37_sub4_sub7_sub2.unlink();
	    }
	}
    }
    
    public static void method880(int i) {
	anInt3398++;
	if (ClientScriptDef.aBoolean2613
	    && Class44.anInt963 != Class37_Sub9_Sub1.anInt2916)
	    Class37_Sub9_Sub22.method859((byte) -128,
					 Class37_Sub4_Sub7.anInt2641,
					 InterfaceClickMask.anInt1985,
					 (Class37_Sub23
					  .aClass37_Sub4_Sub7_Sub1_Sub2_2234
					  .anIntArray3669[0]),
					 Class37_Sub9_Sub1.anInt2916,
					 (Class37_Sub23
					  .aClass37_Sub4_Sub7_Sub1_Sub2_2234
					  .anIntArray3651[0]));
	else {
	    if (i != 0)
		method878((byte) -58);
	    if (Class37_Sub9_Sub35.anInt3564 != Class37_Sub9_Sub1.anInt2916) {
		Class37_Sub9_Sub35.anInt3564 = Class37_Sub9_Sub1.anInt2916;
		Class37_Sub9_Sub9.method798(Class37_Sub9_Sub1.anInt2916,
					    (byte) 123);
	    }
	}
    }
    
    public static RSString method881(RSString[] class16s) {
    	if ((class16s.length ^ 0xffffffff) > -3)
    		throw new IllegalArgumentException();
    	return Class43.method1090(0, class16s.length, class16s);
    }
    
    public void method750(ByteVector class37_sub11, int i, boolean bool) {
	int i_12_ = i;
    while_95_:
	do {
	    do {
		if (i_12_ != 0) {
		    if (i_12_ != 1) {
			if ((i_12_ ^ 0xffffffff) == -3)
			    break;
			break while_95_;
		    }
		} else {
		    aBoolean3397
			= (class37_sub11.getUnsignedByte() ^ 0xffffffff) == -2;
		    break while_95_;
		}
		aBoolean3416
		    = (class37_sub11.getUnsignedByte() ^ 0xffffffff) == -2;
		break while_95_;
	    } while (false);
	    aBoolean1943 = class37_sub11.getUnsignedByte() == 1;
	} while (false);
	anInt3419++;
	if (bool != true)
	    method878((byte) 68);
    }
    
    public Class37_Sub9_Sub27() {
	super(1, false);
    }
    
    public int[] method761(int i, int i_13_) {
	anInt3408++;
	if (i >= -125)
	    aBoolean3397 = false;
	int[] is = aClass38_1966.method1049(i_13_, true);
	if (aClass38_1966.aBoolean850) {
	    int[] is_14_
		= this.method760((!aBoolean3416 ? i_13_
				  : (-i_13_
				     + Class37_Sub4_Sub7_Sub1_Sub2.anInt3989)),
				 0, -101);
	    if (!aBoolean3397)
		Class53.method1137(is_14_, 0, is, 0, Class32.anInt743);
	    else {
		for (int i_15_ = 0;
		     (Class32.anInt743 ^ 0xffffffff) < (i_15_ ^ 0xffffffff);
		     i_15_++)
		    is[i_15_] = is_14_[-i_15_ + Applet_Sub1.anInt12];
	    }
	}
	return is;
    }
    
    public static RSString method882(int i, boolean bool, int i_16_) {
	anInt3403++;
	if (i_16_ != 10)
	    aClass16_3411 = null;
	return Class32.method289(i_16_ ^ 0x72, 10, i, bool);
    }
    
    static {
	anIntArrayArray3406 = new int[104][104];
	anInt3410 = 0;
	aClass16_3402
	    = (Class37_Sub2.create_rsstring
	       ("This computers address has been blocked"));
	aClass16_3414 = Class37_Sub2.create_rsstring("Use");
	aClass16_3404 = aClass16_3414;
	aClass16_3411 = aClass16_3402;
	anInt3418 = 0;
    }
}
