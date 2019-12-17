package org.ie.client;

/* Class37_Sub4_Sub7_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub7_Sub2 extends Class37_Sub4_Sub7
{
    public static int anInt3703 = 0;
    public int anInt3704;
    public int anInt3705;
    public int anInt3706 = 0;
    public static int anInt3707;
    public double aDouble3708;
    public static int anInt3709;
    public int anInt3710;
    public static int[] anIntArray3711;
    public int anInt3712;
    public int anInt3713;
    public double aDouble3714;
    public static Class37_Sub4_Sub9_Sub1 aClass37_Sub4_Sub9_Sub1_3715;
    public static int anInt3716;
    public double aDouble3717;
    public double aDouble3718;
    public static int anInt3719;
    public Class37_Sub4_Sub12 aClass37_Sub4_Sub12_3720;
    public int anInt3721;
    public boolean aBoolean3722 = false;
    public int anInt3723;
    public static Class37_Sub4_Sub9_Sub2_Sub1 aClass37_Sub4_Sub9_Sub2_Sub1_3724;
    public int anInt3725;
    public int anInt3726;
    public double aDouble3727;
    public int anInt3728;
    public double aDouble3729;
    public int anInt3730;
    public int anInt3731;
    public int anInt3732;
    public double aDouble3733;
    public double aDouble3734;
    public int anInt3735 = 0;
    
    public void method511(int i, int i_0_) {
	anInt3707++;
	aDouble3734 += (double) i * aDouble3717;
	aDouble3733 += (double) i * aDouble3727;
	if (i_0_ == -3317) {
	    aDouble3708 += (aDouble3714 * (double) i
			    + (double) i * ((double) i * (aDouble3729 * 0.5)));
	    aBoolean3722 = true;
	    aDouble3714 += aDouble3729 * (double) i;
	    anInt3732
		= 0x7ff & (int) (325.949 * Math.atan2(aDouble3717,
						      aDouble3727)) + 1024;
	    anInt3728 = ((int) (325.949 * Math.atan2(aDouble3714, aDouble3718))
			 & 0x7ff);
	    if (aClass37_Sub4_Sub12_3720 != null) {
		anInt3735 += i;
		while ((aClass37_Sub4_Sub12_3720.anIntArray2780[anInt3706]
			^ 0xffffffff)
		       > (anInt3735 ^ 0xffffffff)) {
		    anInt3735
			-= aClass37_Sub4_Sub12_3720.anIntArray2780[anInt3706];
		    anInt3706++;
		    if (aClass37_Sub4_Sub12_3720.anIntArray2761.length
			<= anInt3706) {
			anInt3706 -= aClass37_Sub4_Sub12_3720.anInt2777;
			if (anInt3706 < 0 || ((anInt3706 ^ 0xffffffff)
					      <= ((aClass37_Sub4_Sub12_3720
						   .anIntArray2761).length
						  ^ 0xffffffff)))
			    anInt3706 = 0;
		    }
		}
	    }
	}
    }
    
    public static void method512(int i) {
	aClass37_Sub4_Sub9_Sub2_Sub1_3724 = null;
	aClass37_Sub4_Sub9_Sub1_3715 = null;
	if (i != 1)
	    method512(-12);
	anIntArray3711 = null;
    }
    
    public Class37_Sub4_Sub7_Sub6 method493(boolean bool) {
	anInt3716++;
	if (bool != true)
	    aDouble3717 = -0.16412240162933073;
	Class37_Sub4_Sub18 class37_sub4_sub18
	    = Class76.method1285((byte) 106, anInt3726);
	Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6
	    = class37_sub4_sub18.method731(anInt3706, bool);
	if (class37_sub4_sub7_sub6 == null)
	    return null;
	class37_sub4_sub7_sub6.method546(anInt3728);
	return class37_sub4_sub7_sub6;
    }
    
    public static void method513
	(byte i, Class37_Sub4_Sub7_Sub1 class37_sub4_sub7_sub1) {
	class37_sub4_sub7_sub1.anInt3647 = class37_sub4_sub7_sub1.anInt3701;
	anInt3719++;
	if (class37_sub4_sub7_sub1.anInt3645 == 0)
	    class37_sub4_sub7_sub1.anInt3665 = 0;
	else {
	    if (class37_sub4_sub7_sub1.anInt3655 != -1
		&& (class37_sub4_sub7_sub1.anInt3689 ^ 0xffffffff) == -1) {
		Class37_Sub4_Sub12 class37_sub4_sub12
		    = Class37_Sub9_Sub22
			  .method861(class37_sub4_sub7_sub1.anInt3655);
		if (class37_sub4_sub7_sub1.anInt3640 > 0
		    && (class37_sub4_sub12.anInt2766 ^ 0xffffffff) == -1) {
		    class37_sub4_sub7_sub1.anInt3665++;
		    return;
		}
		if (class37_sub4_sub7_sub1.anInt3640 <= 0
		    && class37_sub4_sub12.anInt2754 == 0) {
		    class37_sub4_sub7_sub1.anInt3665++;
		    return;
		}
	    }
	    int i_1_ = class37_sub4_sub7_sub1.anInt3666;
	    int i_2_ = ((class37_sub4_sub7_sub1.anIntArray3651
			 [class37_sub4_sub7_sub1.anInt3645 + -1]) * 128
			+ class37_sub4_sub7_sub1.anInt3683 * 64);
	    int i_3_ = class37_sub4_sub7_sub1.anInt3642;
	    int i_4_ = (64 * class37_sub4_sub7_sub1.anInt3683
			+ 128 * (class37_sub4_sub7_sub1.anIntArray3669
				 [-1 + class37_sub4_sub7_sub1.anInt3645]));
	    if (i_2_ + -i_1_ > 256 || i_2_ - i_1_ < -256
		|| (-i_3_ + i_4_ ^ 0xffffffff) < -257
		|| (i_4_ + -i_3_ ^ 0xffffffff) > 255) {
		class37_sub4_sub7_sub1.anInt3642 = i_4_;
		class37_sub4_sub7_sub1.anInt3666 = i_2_;
	    } else {
		if (i_1_ < i_2_) {
		    if ((i_4_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff))
			class37_sub4_sub7_sub1.anInt3681 = 1280;
		    else if (i_3_ > i_4_)
			class37_sub4_sub7_sub1.anInt3681 = 1792;
		    else
			class37_sub4_sub7_sub1.anInt3681 = 1536;
		} else if (i_2_ < i_1_) {
		    if (i_4_ <= i_3_) {
			if (i_4_ < i_3_)
			    class37_sub4_sub7_sub1.anInt3681 = 256;
			else
			    class37_sub4_sub7_sub1.anInt3681 = 512;
		    } else
			class37_sub4_sub7_sub1.anInt3681 = 768;
		} else if ((i_3_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff))
		    class37_sub4_sub7_sub1.anInt3681 = 1024;
		else if ((i_4_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff))
		    class37_sub4_sub7_sub1.anInt3681 = 0;
		if (i > 33) {
		    int i_5_ = class37_sub4_sub7_sub1.anInt3660;
		    int i_6_ = 4;
		    int i_7_ = 0x7ff & (class37_sub4_sub7_sub1.anInt3681
					- class37_sub4_sub7_sub1.anInt3663);
		    if (i_7_ > 1024)
			i_7_ -= 2048;
		    boolean bool = true;
		    if ((i_7_ ^ 0xffffffff) > 255
			|| (i_7_ ^ 0xffffffff) < -257) {
			if (i_7_ >= 256 && (i_7_ ^ 0xffffffff) > -769)
			    i_5_ = class37_sub4_sub7_sub1.anInt3678;
			else if ((i_7_ ^ 0xffffffff) <= 767
				 && (i_7_ ^ 0xffffffff) >= 255)
			    i_5_ = class37_sub4_sub7_sub1.anInt3676;
		    } else
			i_5_ = class37_sub4_sub7_sub1.anInt3657;
		    if ((i_5_ ^ 0xffffffff) == 0)
			i_5_ = class37_sub4_sub7_sub1.anInt3657;
		    class37_sub4_sub7_sub1.anInt3647 = i_5_;
		    if (class37_sub4_sub7_sub1
			instanceof Class37_Sub4_Sub7_Sub1_Sub1)
			bool = (((Class37_Sub4_Sub7_Sub1_Sub1)
				 class37_sub4_sub7_sub1)
				.aClass37_Sub4_Sub15_3955.aBoolean2847);
		    if (bool) {
			if ((class37_sub4_sub7_sub1.anInt3663
			     != class37_sub4_sub7_sub1.anInt3681)
			    && class37_sub4_sub7_sub1.anInt3653 == -1
			    && class37_sub4_sub7_sub1.anInt3668 != 0)
			    i_6_ = 2;
			if (class37_sub4_sub7_sub1.anInt3645 > 2)
			    i_6_ = 6;
			if (class37_sub4_sub7_sub1.anInt3645 > 3)
			    i_6_ = 8;
			if (class37_sub4_sub7_sub1.anInt3665 > 0
			    && ((class37_sub4_sub7_sub1.anInt3645 ^ 0xffffffff)
				< -2)) {
			    class37_sub4_sub7_sub1.anInt3665--;
			    i_6_ = 8;
			}
		    } else {
			if (class37_sub4_sub7_sub1.anInt3645 > 1)
			    i_6_ = 6;
			if ((class37_sub4_sub7_sub1.anInt3645 ^ 0xffffffff)
			    < -3)
			    i_6_ = 8;
			if (class37_sub4_sub7_sub1.anInt3665 > 0
			    && class37_sub4_sub7_sub1.anInt3645 > 1) {
			    i_6_ = 8;
			    class37_sub4_sub7_sub1.anInt3665--;
			}
		    }
		    if (class37_sub4_sub7_sub1.aBooleanArray3682
			[class37_sub4_sub7_sub1.anInt3645 - 1])
			i_6_ <<= 1;
		    if (i_1_ >= i_2_) {
			if (i_2_ < i_1_) {
			    class37_sub4_sub7_sub1.anInt3666 -= i_6_;
			    if (class37_sub4_sub7_sub1.anInt3666 < i_2_)
				class37_sub4_sub7_sub1.anInt3666 = i_2_;
			}
		    } else {
			class37_sub4_sub7_sub1.anInt3666 += i_6_;
			if (class37_sub4_sub7_sub1.anInt3666 > i_2_)
			    class37_sub4_sub7_sub1.anInt3666 = i_2_;
		    }
		    if ((i_4_ ^ 0xffffffff) >= (i_3_ ^ 0xffffffff)) {
			if (i_4_ < i_3_) {
			    class37_sub4_sub7_sub1.anInt3642 -= i_6_;
			    if ((i_4_ ^ 0xffffffff)
				< (class37_sub4_sub7_sub1.anInt3642
				   ^ 0xffffffff))
				class37_sub4_sub7_sub1.anInt3642 = i_4_;
			}
		    } else {
			class37_sub4_sub7_sub1.anInt3642 += i_6_;
			if (class37_sub4_sub7_sub1.anInt3642 > i_4_)
			    class37_sub4_sub7_sub1.anInt3642 = i_4_;
		    }
		    if (((class37_sub4_sub7_sub1.anInt3666 ^ 0xffffffff)
			 == (i_2_ ^ 0xffffffff))
			&& ((class37_sub4_sub7_sub1.anInt3642 ^ 0xffffffff)
			    == (i_4_ ^ 0xffffffff))) {
			if ((class37_sub4_sub7_sub1.anInt3640 ^ 0xffffffff)
			    < -1)
			    class37_sub4_sub7_sub1.anInt3640--;
			class37_sub4_sub7_sub1.anInt3645--;
		    }
		    if ((i_6_ ^ 0xffffffff) <= -9
			&& (class37_sub4_sub7_sub1.anInt3647
			    == class37_sub4_sub7_sub1.anInt3657)
			&& class37_sub4_sub7_sub1.anInt3698 != -1)
			class37_sub4_sub7_sub1.anInt3647
			    = class37_sub4_sub7_sub1.anInt3698;
		}
	    }
	}
    }
    
    public void method514(int i, int i_8_, boolean bool, int i_9_, int i_10_) {
	anInt3709++;
	if (!aBoolean3722) {
	    double d = (double) (-anInt3731 + i);
	    double d_11_ = (double) (-anInt3712 + i_9_);
	    double d_12_ = Math.sqrt(d * d + d_11_ * d_11_);
	    aDouble3733
		= (double) anInt3712 + (double) anInt3705 * d_11_ / d_12_;
	    aDouble3708 = (double) anInt3704;
	    aDouble3734 = (double) anInt3731 + d * (double) anInt3705 / d_12_;
	}
	double d = (double) (-i_8_ + (anInt3730 + 1));
	aDouble3717 = ((double) i - aDouble3734) / d;
	aDouble3727 = ((double) i_9_ - aDouble3733) / d;
	if (bool != true)
	    method513((byte) -55, null);
	aDouble3718
	    = Math.sqrt(aDouble3717 * aDouble3717 + aDouble3727 * aDouble3727);
	if (!aBoolean3722)
	    aDouble3714
		= -aDouble3718 * Math.tan((double) anInt3721 * 0.02454369);
	aDouble3729
	    = 2.0 * (-aDouble3708 + (double) i_10_ - aDouble3714 * d) / (d
									 * d);
    }
    
    public Class37_Sub4_Sub7_Sub2(int i, int i_13_, int i_14_, int i_15_,
				  int i_16_, int i_17_, int i_18_, int i_19_,
				  int i_20_, int i_21_, int i_22_) {
	anInt3730 = i_18_;
	aBoolean3722 = false;
	anInt3725 = i_22_;
	anInt3704 = i_16_;
	anInt3731 = i_14_;
	anInt3721 = i_19_;
	anInt3712 = i_15_;
	anInt3705 = i_20_;
	anInt3713 = i_17_;
	anInt3726 = i;
	anInt3723 = i_13_;
	anInt3710 = i_21_;
	int i_23_ = Class76.method1285((byte) 117, anInt3726).anInt2897;
	if (i_23_ == -1)
	    aClass37_Sub4_Sub12_3720 = null;
	else
	    aClass37_Sub4_Sub12_3720
		= Class37_Sub9_Sub22.method861(i_23_);
    }
}
