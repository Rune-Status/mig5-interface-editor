package org.ie.client;

/* Class37_Sub9_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub6 extends Class37_Sub9
{
    public static RSString aClass16_3006;
    public static int anInt3007;
    public static int anInt3008;
    public static RSString aClass16_3009;
    public static RSString aClass16_3010
	= Class37_Sub2.create_rsstring("Username: ");
    public static int anInt3011;
    public int[] anIntArray3012;
    public int anInt3013 = 3216;
    public static int anInt3014;
    public static int anInt3015;
    public static int anInt3016;
    public static RSString aClass16_3017;
    public static int anInt3018 = 0;
    public static int anInt3019;
    public int anInt3020;
    public static int anInt3021;
    public static RSString aClass16_3022;
    public int anInt3023;
    public static RSString aClass16_3024;
    public static RSString aClass16_3025;
    public static int anInt3026;
    
    public static Sprite method781(int i, int i_0_,
						   Class15 class15) {
	if (i_0_ < 62)
	    aClass16_3025 = null;
	anInt3014++;
	if (!Class89.method1336(class15, 107, i))
	    return null;
	return Class33.method299(26);
    }
    
    public void method782(byte i) {
	double d = Math.cos((double) (anInt3013 / 4096));
	if (i != 64)
	    aClass16_3025 = null;
	anInt3015++;
	anIntArray3012[0]
	    = (int) (d * Math.sin((double) (anInt3023 / 4096)) * 4096.0);
	anIntArray3012[1]
	    = (int) (Math.cos((double) (anInt3023 / 4096)) * d * 4096.0);
	anIntArray3012[2]
	    = (int) (4096.0 * Math.sin((double) (anInt3013 / 4096)));
	int i_1_ = anIntArray3012[2] * anIntArray3012[2] >> -1965405140;
	int i_2_ = anIntArray3012[0] * anIntArray3012[0] >> -94354484;
	int i_3_ = anIntArray3012[1] * anIntArray3012[1] >> 1401918124;
	int i_4_
	    = (int) (Math.sqrt((double) (i_1_ + (i_2_ + i_3_) >> 1681170380))
		     * 4096.0);
	if (i_4_ != 0) {
	    anIntArray3012[1] = (anIntArray3012[1] << -1033386868) / i_4_;
	    anIntArray3012[2] = (anIntArray3012[2] << -1444922420) / i_4_;
	    anIntArray3012[0] = (anIntArray3012[0] << -1180552724) / i_4_;
	}
    }
    
    public static Class method783(int i, String string)
	throws ClassNotFoundException {
	int i_5_ = 74 % ((i - -45) / 49);
	anInt3008++;
	if (string.equals("B"))
	    return Byte.TYPE;
	if (string.equals("I"))
	    return Integer.TYPE;
	if (string.equals("S"))
	    return Short.TYPE;
	if (string.equals("J"))
	    return Long.TYPE;
	if (string.equals("Z"))
	    return Boolean.TYPE;
	if (string.equals("F"))
	    return Float.TYPE;
	if (string.equals("D"))
	    return Double.TYPE;
	if (string.equals("C"))
	    return Character.TYPE;
	return Class.forName(string);
    }
    
    public Class37_Sub9_Sub6() {
	super(1, true);
	anIntArray3012 = new int[3];
	anInt3020 = 4096;
	anInt3023 = 3216;
    }
    
    public void method750(ByteVector class37_sub11, int i, boolean bool) {
	if (bool != true)
	    aClass16_3025 = null;
	int i_6_ = i;
    while_54_:
	do {
	    do {
		if (i_6_ != 0) {
		    if ((i_6_ ^ 0xffffffff) != -2) {
			if ((i_6_ ^ 0xffffffff) == -3)
			    break;
			break while_54_;
		    }
		} else {
		    anInt3020 = class37_sub11.getUnsignedShort();
		    break while_54_;
		}
		anInt3023 = class37_sub11.getUnsignedShort();
		break while_54_;
	    } while (false);
	    anInt3013 = class37_sub11.getUnsignedShort();
	} while (false);
	anInt3021++;
    }
    
    public static void method784(int i) {
	aClass16_3009 = null;
	aClass16_3017 = null;
	aClass16_3024 = null;
	aClass16_3025 = null;
	int i_7_ = -46 / ((i - -3) / 36);
	aClass16_3006 = null;
	aClass16_3010 = null;
	aClass16_3022 = null;
    }
    
    public static void method785(Class37_Sub4_Sub7_Sub1 class37_sub4_sub7_sub1,
				 int i) {
	anInt3026++;
	class37_sub4_sub7_sub1.aBoolean3635 = false;
	if ((class37_sub4_sub7_sub1.anInt3647 ^ 0xffffffff) != 0) {
	    Class37_Sub4_Sub12 class37_sub4_sub12
		= Class37_Sub9_Sub22
		      .method861(class37_sub4_sub7_sub1.anInt3647);
	    if (class37_sub4_sub12 != null
		&& class37_sub4_sub12.anIntArray2761 != null) {
		class37_sub4_sub7_sub1.anInt3650++;
		if ((class37_sub4_sub12.anIntArray2761.length
		     > class37_sub4_sub7_sub1.anInt3638)
		    && ((class37_sub4_sub7_sub1.anInt3650 ^ 0xffffffff)
			< ((class37_sub4_sub12.anIntArray2780
			    [class37_sub4_sub7_sub1.anInt3638])
			   ^ 0xffffffff))) {
		    class37_sub4_sub7_sub1.anInt3650 = 1;
		    class37_sub4_sub7_sub1.anInt3638++;
		    Class60.method1166(class37_sub4_sub7_sub1.anInt3638,
				       ((Class37_Sub23
					 .aClass37_Sub4_Sub7_Sub1_Sub2_2234)
					== class37_sub4_sub7_sub1),
				       -27816, class37_sub4_sub12,
				       class37_sub4_sub7_sub1.anInt3666,
				       class37_sub4_sub7_sub1.anInt3642);
		}
		if ((class37_sub4_sub12.anIntArray2761.length ^ 0xffffffff)
		    >= (class37_sub4_sub7_sub1.anInt3638 ^ 0xffffffff)) {
		    class37_sub4_sub7_sub1.anInt3638 = 0;
		    class37_sub4_sub7_sub1.anInt3650 = 0;
		    Class60.method1166
			(class37_sub4_sub7_sub1.anInt3638,
			 (class37_sub4_sub7_sub1
			  == Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234),
			 i ^ ~0x4eab, class37_sub4_sub12,
			 class37_sub4_sub7_sub1.anInt3666,
			 class37_sub4_sub7_sub1.anInt3642);
		}
	    } else
		class37_sub4_sub7_sub1.anInt3647 = -1;
	}
	if (class37_sub4_sub7_sub1.anInt3636 != -1
	    && class37_sub4_sub7_sub1.anInt3652 <= Class37_Sub7.loopCycle) {
	    if ((class37_sub4_sub7_sub1.anInt3654 ^ 0xffffffff) > -1)
		class37_sub4_sub7_sub1.anInt3654 = 0;
	    int i_8_
		= (Class76.method1285
		   ((byte) 115, class37_sub4_sub7_sub1.anInt3636).anInt2897);
	    if ((i_8_ ^ 0xffffffff) != 0) {
		Class37_Sub4_Sub12 class37_sub4_sub12
		    = Class37_Sub9_Sub22.method861(i_8_);
		if (class37_sub4_sub12 == null
		    || class37_sub4_sub12.anIntArray2761 == null)
		    class37_sub4_sub7_sub1.anInt3636 = -1;
		else {
		    class37_sub4_sub7_sub1.anInt3664++;
		    if ((class37_sub4_sub12.anIntArray2761.length
			 > class37_sub4_sub7_sub1.anInt3654)
			&& (class37_sub4_sub7_sub1.anInt3664
			    > (class37_sub4_sub12.anIntArray2780
			       [class37_sub4_sub7_sub1.anInt3654]))) {
			class37_sub4_sub7_sub1.anInt3654++;
			class37_sub4_sub7_sub1.anInt3664 = 1;
			Class60.method1166
			    (class37_sub4_sub7_sub1.anInt3654,
			     (class37_sub4_sub7_sub1
			      == (Class37_Sub23
				  .aClass37_Sub4_Sub7_Sub1_Sub2_2234)),
			     -27816, class37_sub4_sub12,
			     class37_sub4_sub7_sub1.anInt3666,
			     class37_sub4_sub7_sub1.anInt3642);
		    }
		    if ((class37_sub4_sub7_sub1.anInt3654
			 >= class37_sub4_sub12.anIntArray2761.length)
			&& (((class37_sub4_sub7_sub1.anInt3654 ^ 0xffffffff)
			     > -1)
			    || (class37_sub4_sub7_sub1.anInt3654
				>= class37_sub4_sub12.anIntArray2761.length)))
			class37_sub4_sub7_sub1.anInt3636 = -1;
		}
	    } else
		class37_sub4_sub7_sub1.anInt3636 = -1;
	}
	if (class37_sub4_sub7_sub1.anInt3655 != -1
	    && (class37_sub4_sub7_sub1.anInt3689 ^ 0xffffffff) >= -2) {
	    Class37_Sub4_Sub12 class37_sub4_sub12
		= Class37_Sub9_Sub22
		      .method861(class37_sub4_sub7_sub1.anInt3655);
	    if (class37_sub4_sub12.anInt2766 == 1
		&& (class37_sub4_sub7_sub1.anInt3640 ^ 0xffffffff) < -1
		&& ((Class37_Sub7.loopCycle ^ 0xffffffff)
		    <= (class37_sub4_sub7_sub1.firstDistanceSpeed ^ 0xffffffff))
		&& ((Class37_Sub7.loopCycle ^ 0xffffffff)
		    < (class37_sub4_sub7_sub1.secondDistanceSpeed ^ 0xffffffff))) {
		class37_sub4_sub7_sub1.anInt3689 = 1;
		return;
	    }
	}
	if ((class37_sub4_sub7_sub1.anInt3655 ^ 0xffffffff) != 0
	    && (class37_sub4_sub7_sub1.anInt3689 ^ 0xffffffff) == -1) {
	    Class37_Sub4_Sub12 class37_sub4_sub12
		= Class37_Sub9_Sub22
		      .method861(class37_sub4_sub7_sub1.anInt3655);
	    if (class37_sub4_sub12 == null
		|| class37_sub4_sub12.anIntArray2761 == null)
		class37_sub4_sub7_sub1.anInt3655 = -1;
	    else {
		class37_sub4_sub7_sub1.anInt3680++;
		if ((class37_sub4_sub7_sub1.anInt3677
		     < class37_sub4_sub12.anIntArray2761.length)
		    && (class37_sub4_sub7_sub1.anInt3680
			> (class37_sub4_sub12.anIntArray2780
			   [class37_sub4_sub7_sub1.anInt3677]))) {
		    class37_sub4_sub7_sub1.anInt3680 = 1;
		    class37_sub4_sub7_sub1.anInt3677++;
		    Class60.method1166(class37_sub4_sub7_sub1.anInt3677,
				       ((Class37_Sub23
					 .aClass37_Sub4_Sub7_Sub1_Sub2_2234)
					== class37_sub4_sub7_sub1),
				       i ^ ~0x4eab, class37_sub4_sub12,
				       class37_sub4_sub7_sub1.anInt3666,
				       class37_sub4_sub7_sub1.anInt3642);
		}
		if (class37_sub4_sub7_sub1.anInt3677
		    >= class37_sub4_sub12.anIntArray2761.length) {
		    class37_sub4_sub7_sub1.anInt3659++;
		    class37_sub4_sub7_sub1.anInt3677
			-= class37_sub4_sub12.anInt2777;
		    if ((class37_sub4_sub12.anInt2776 ^ 0xffffffff)
			>= (class37_sub4_sub7_sub1.anInt3659 ^ 0xffffffff))
			class37_sub4_sub7_sub1.anInt3655 = -1;
		    else if (class37_sub4_sub7_sub1.anInt3677 >= 0
			     && (class37_sub4_sub7_sub1.anInt3677
				 < class37_sub4_sub12.anIntArray2761.length))
			Class60.method1166
			    (class37_sub4_sub7_sub1.anInt3677,
			     (class37_sub4_sub7_sub1
			      == (Class37_Sub23
				  .aClass37_Sub4_Sub7_Sub1_Sub2_2234)),
			     -27816, class37_sub4_sub12,
			     class37_sub4_sub7_sub1.anInt3666,
			     class37_sub4_sub7_sub1.anInt3642);
		    else
			class37_sub4_sub7_sub1.anInt3655 = -1;
		}
		class37_sub4_sub7_sub1.aBoolean3635
		    = class37_sub4_sub12.aBoolean2755;
	    }
	}
	if ((class37_sub4_sub7_sub1.anInt3689 ^ 0xffffffff) < -1)
	    class37_sub4_sub7_sub1.anInt3689--;
	if (i != 8716)
	    aClass16_3025 = null;
    }
    
    public static void method786
	(Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1,
	 Class37_Sub4_Sub9_Sub2_Sub1 class37_sub4_sub9_sub2_sub1_9_, byte i) {
	do {
	    try {
		anInt3016++;
		if (Class37_Sub4_Sub13.aBoolean2799)
		    Class37_Sub9_Sub20.method847
			((byte) -101, class37_sub4_sub9_sub2_sub1_9_,
			 class37_sub4_sub9_sub2_sub1);
		else if (i == 69) {
		    if (Class32.anInt740 == 0 || Class32.anInt740 == 5) {
			int i_10_ = 20;
			class37_sub4_sub9_sub2_sub1_9_.method606
			    (Class37_Sub13.aClass16_2114, 382, 245 - i_10_,
			     16777215, -1);
			int i_11_ = -i_10_ + 253;
			Graphics2D.method595(230, i_11_, 304, 34,
						    9179409);
			Graphics2D.method595(231, i_11_ + 1, 302, 32,
						    0);
			Graphics2D.method578(232, i_11_ - -2,
						    3 * (Class37_Sub9_Sub27
							 .anInt3400),
						    30, 9179409);
			Graphics2D.method578
			    (232 - -(Class37_Sub9_Sub27.anInt3400 * 3),
			     i_11_ + 2,
			     -(Class37_Sub9_Sub27.anInt3400 * 3) + 300, 30, 0);
			class37_sub4_sub9_sub2_sub1_9_.method606
			    (Class37_Sub9_Sub33.aClass16_3522, 382,
			     276 - i_10_, 16777215, -1);
		    }
		    if ((Class32.anInt740 ^ 0xffffffff) == -21) {
			int i_12_ = 211;
			Class42.aClass37_Sub4_Sub9_Sub1_925.method597
			    (382 - (Class42.aClass37_Sub4_Sub9_Sub1_925
				    .anInt3865) / 2,
			     271 - (Class42.aClass37_Sub4_Sub9_Sub1_925
				    .anInt3862) / 2);
			class37_sub4_sub9_sub2_sub1_9_.method606
			    (Class37_Sub9_Sub33.aClass16_3520, 382, i_12_,
			     16776960, 0);
			i_12_ += 15;
			class37_sub4_sub9_sub2_sub1_9_.method606
			    (Class37_Sub9_Sub33.aClass16_3521, 382, i_12_,
			     16776960, 0);
			i_12_ += 15;
			class37_sub4_sub9_sub2_sub1_9_.method606
			    (Class37_Sub9_Sub33.aClass16_3528, 382, i_12_,
			     16776960, 0);
			i_12_ += 15;
			i_12_ += 10;
			class37_sub4_sub9_sub2_sub1_9_.method607
			    ((Class37_Sub9_Sub27.method881
			      ((new RSString[]
				{ aClass16_3009,
				  (Class37_Sub4_Sub9_Sub2.method605
				   (Class37_Sub9_Sub33.aClass16_3526)) }))),
			     272, i_12_, 16777215, 0);
			i_12_ += 15;
			class37_sub4_sub9_sub2_sub1_9_.method607
			    ((Class37_Sub9_Sub27.method881
			      ((new RSString[]
				     { Class37_Sub4_Sub12.aClass16_2786,
				       Class37_Sub9_Sub33.password
					   .method163(-40) }))),
			     274, i_12_, 16777215, 0);
			i_12_ += 15;
		    }
		    if (Class32.anInt740 == 10) {
			Class42.aClass37_Sub4_Sub9_Sub1_925.method597(202,
								      171);
			if ((RSInterface.anInt339 ^ 0xffffffff) == -1) {
			    int i_13_ = 251;
			    class37_sub4_sub9_sub2_sub1_9_.method606
				(Class68.aClass16_1323, 382, i_13_, 16776960,
				 0);
			    i_13_ += 30;
			    int i_14_ = 302;
			    int i_15_ = 291;
			    Class46.aClass37_Sub4_Sub9_Sub1_987
				.method597(i_14_ - 73, i_15_ - 20);
			    class37_sub4_sub9_sub2_sub1_9_.method619
				(Class37_Sub9_Sub36.aClass16_3577, i_14_ - 73,
				 -20 + i_15_, 144, 40, 16777215, 0, 1, 1, 0);
			    i_14_ = 462;
			    Class46.aClass37_Sub4_Sub9_Sub1_987
				.method597(-73 + i_14_, i_15_ + -20);
			    class37_sub4_sub9_sub2_sub1_9_.method619
				(Class37_Sub4_Sub18.aClass16_2899, i_14_ - 73,
				 i_15_ + -20, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (RSInterface.anInt339 != 2) {
			    if (RSInterface.anInt339 == 3) {
				class37_sub4_sub9_sub2_sub1_9_.method606
				    (Class37_Sub9_Sub15.aClass16_3162, 382,
				     211, 16776960, 0);
				int i_16_ = 321;
				int i_17_ = 382;
				int i_18_ = 236;
				class37_sub4_sub9_sub2_sub1_9_.method606
				    (Class37_Sub9_Sub14.aClass16_3143, 382,
				     i_18_, 16777215, 0);
				i_18_ += 15;
				class37_sub4_sub9_sub2_sub1_9_.method606
				    (Class37_Sub20.aClass16_2218, 382, i_18_,
				     16777215, 0);
				i_18_ += 15;
				class37_sub4_sub9_sub2_sub1_9_.method606
				    (Class89.aClass16_1616, 382, i_18_,
				     16777215, 0);
				i_18_ += 15;
				class37_sub4_sub9_sub2_sub1_9_.method606
				    (Class8.aClass16_166, 382, i_18_, 16777215,
				     0);
				Class46.aClass37_Sub4_Sub9_Sub1_987
				    .method597(-73 + i_17_, i_16_ + -20);
				class37_sub4_sub9_sub2_sub1_9_.method606
				    (Class37_Sub9_Sub23.aClass16_3347, i_17_,
				     i_16_ + 5, 16777215, 0);
				i_18_ += 15;
			    }
			} else {
			    int i_19_ = 211;
			    class37_sub4_sub9_sub2_sub1_9_.method606
				(Class37_Sub9_Sub33.aClass16_3520, 382, i_19_,
				 16776960, 0);
			    i_19_ += 15;
			    class37_sub4_sub9_sub2_sub1_9_.method606
				(Class37_Sub9_Sub33.aClass16_3521, 382, i_19_,
				 16776960, 0);
			    i_19_ += 15;
			    class37_sub4_sub9_sub2_sub1_9_.method606
				(Class37_Sub9_Sub33.aClass16_3528, 382, i_19_,
				 16776960, 0);
			    boolean bool;
			    if (((Class37_Sub9_Sub31.anInt3495 ^ 0xffffffff)
				 == -1)
				&& Class37_Sub7.loopCycle % 40 < 20
				&& Class78.aBoolean1464)
				bool = true;
			    else
				bool = false;
			    int i_20_ = 302;
			    int i_21_ = 321;
			    i_19_ += 15;
			    i_19_ += 10;
			    class37_sub4_sub9_sub2_sub1_9_.method607
				((Class37_Sub9_Sub27.method881
				  ((new RSString[]
				    { aClass16_3009,
				      (Class37_Sub4_Sub9_Sub2.method605
				       (Class37_Sub9_Sub33.aClass16_3526)),
				      (!bool ? Class37_Sub9_Sub33.aClass16_3524
				       : Class25.aClass16_647) }))),
				 272, i_19_, 16777215, 0);
			    i_19_ += 15;
			    if (Class37_Sub9_Sub31.anInt3495 == 1
				&& Class37_Sub7.loopCycle % 40 < 20
				&& Class78.aBoolean1464)
				bool = true;
			    else
				bool = false;
			    class37_sub4_sub9_sub2_sub1_9_.method607
				((Class37_Sub9_Sub27.method881
				  ((new RSString[]
					 { Class37_Sub4_Sub12.aClass16_2786,
					   Class37_Sub9_Sub33.password
					       .method163(-123),
					   (bool ? Class25.aClass16_647
					    : (Class37_Sub9_Sub33
					       .aClass16_3524)) }))),
				 274, i_19_, 16777215, 0);
			    Class46.aClass37_Sub4_Sub9_Sub1_987
				.method597(i_20_ - 73, i_21_ + -20);
			    class37_sub4_sub9_sub2_sub1_9_.method606
				(Class66.aClass16_1243, i_20_, 5 + i_21_,
				 16777215, 0);
			    i_19_ += 15;
			    i_20_ = 462;
			    Class46.aClass37_Sub4_Sub9_Sub1_987
				.method597(i_20_ - 73, -20 + i_21_);
			    class37_sub4_sub9_sub2_sub1_9_.method606
				(Class37_Sub9_Sub23.aClass16_3347, i_20_,
				 5 + i_21_, 16777215, 0);
			}
		    }
		    if ((Class37_Sub9_Sub36.anInt3579 ^ 0xffffffff) != -2) {
			if (Class37_Sub9_Sub34.anInt3558 > 0) {
			    Class66.method1191((byte) -63,
					       Class37_Sub9_Sub34.anInt3558);
			    Class37_Sub9_Sub34.anInt3558 = 0;
			}
			Class37_Sub9_Sub19.method842(-39);
		    }
		    Class37_Sub4_Sub7_Sub7.aClass37_Sub4_Sub9_Sub1Array3853
			[Class52.aBoolean1050 ? 1 : 0].method597(725, 463);
		    if (Class32.anInt740 <= 5 || Class10.anInt193 == 2
			|| (Class37_Sub9_Sub25.anInt3382 ^ 0xffffffff) != -1)
			break;
		    if (Class37_Sub4_Sub7_Sub2.aClass37_Sub4_Sub9_Sub1_3715
			!= null) {
			int i_22_ = 463;
			int i_23_ = 5;
			Class37_Sub4_Sub7_Sub2.aClass37_Sub4_Sub9_Sub1_3715
			    .method597(i_23_, i_22_);
			int i_24_ = 35;
			int i_25_ = 100;
			class37_sub4_sub9_sub2_sub1_9_.method606
			    ((Class37_Sub9_Sub27.method881
			      (new RSString[] { NodeSub.aClass16_1849,
					       Class75.aClass16_1415,
					       (Class37_Sub9_Sub24.method870
						(Class37_Sub9_Sub19.anInt3272,
						 (byte) -114)) })),
			     i_23_ + i_25_ / 2, i_24_ / 2 + i_22_ - 2,
			     16777215, 0);
			if (Class37_Sub9.aClass22_1954 == null)
			    class37_sub4_sub9_sub2_sub1.method606
				(Class37_Sub4_Sub13.aClass16_2798,
				 i_23_ + i_25_ / 2, 12 + (i_24_ / 2 + i_22_),
				 16777215, 0);
			else
			    class37_sub4_sub9_sub2_sub1.method606
				(Class8.aClass16_169, i_23_ - -(i_25_ / 2),
				 12 + (i_24_ / 2 + i_22_), 16777215, 0);
		    } else
			Class37_Sub4_Sub7_Sub2.aClass37_Sub4_Sub9_Sub1_3715
			    = Class30.method277((Class37_Sub9_Sub33
						 .aClass16_3524),
						-1094018352,
						(Class37_Sub4_Sub10
						 .aClass16_2678),
						Class60.aClass15_Sub1_1151);
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class37_Sub4_Sub7_Sub3.method516
			  (runtimeexception,
			   ("ga.H("
			    + (class37_sub4_sub9_sub2_sub1 != null ? "{...}"
			       : "null")
			    + ','
			    + (class37_sub4_sub9_sub2_sub1_9_ != null ? "{...}"
			       : "null")
			    + ',' + i + ')'));
	    }
	    break;
	} while (false);
    }
    
    public int[] method761(int i, int i_26_) {
	if (i > -125)
	    return null;
	anInt3007++;
	int[] is = aClass38_1966.method1049(i_26_, true);
	if (aClass38_1966.aBoolean850) {
	    int[] is_27_
		= this.method760((Class37_Sub4_Sub7_Sub1_Sub2.anInt3989
				  & -1 + i_26_),
				 0, -37);
	    int[] is_28_ = this.method760(i_26_, 0, -81);
	    int[] is_29_
		= this.method760((i_26_ + 1
				  & Class37_Sub4_Sub7_Sub1_Sub2.anInt3989),
				 0, -32);
	    for (int i_30_ = 0;
		 (i_30_ ^ 0xffffffff) > (Class32.anInt743 ^ 0xffffffff);
		 i_30_++) {
		int i_31_ = anInt3020 * (is_29_[i_30_] - is_27_[i_30_]);
		int i_32_ = ((-is_28_[Applet_Sub1.anInt12 & i_30_ - 1]
			      + is_28_[Applet_Sub1.anInt12 & i_30_ + 1])
			     * anInt3020);
		int i_33_ = i_32_ >> 1993779500;
		int i_34_ = i_31_ >> -1027435764;
		int i_35_ = i_33_ * i_33_ >> 1514613708;
		int i_36_ = i_34_ * i_34_ >> 1687958156;
		int i_37_ = (int) (Math.sqrt((double) ((4096 + i_36_ + i_35_)
						       / 4096))
				   * 4096.0);
		int i_38_;
		int i_39_;
		int i_40_;
		if ((i_37_ ^ 0xffffffff) == -1) {
		    i_40_ = 0;
		    i_39_ = 0;
		    i_38_ = 0;
		} else {
		    i_38_ = 16777216 / i_37_;
		    i_39_ = i_32_ / i_37_;
		    i_40_ = i_31_ / i_37_;
		}
		i_38_ = i_38_ * anIntArray3012[2] >> -1350507252;
		i_39_ = i_39_ * anIntArray3012[0] >> 1113560684;
		i_40_ = i_40_ * anIntArray3012[1] >> -272185748;
		is[i_30_] = i_38_ + i_40_ + i_39_;
	    }
	}
	return is;
    }
    
    public void method752(int i) {
	anInt3011++;
	method782((byte) 64);
	if (i != -2)
	    aClass16_3010 = null;
    }
    
    public static Class37_Sub4_Sub9_Sub2_Sub1 method787
	(RSString rSString, Class15 class15, RSString class16_41_, byte i,
	 Class15 class15_42_) {
	try {
	    anInt3019++;
	    int i_43_ = class15_42_.method123((byte) 32, rSString);
	    int i_44_ = class15_42_.method128(class16_41_, -118, i_43_);
	    return Class37_Sub9_Sub3.method770(class15_42_, i_44_, (byte) 119,
					       class15, i_43_, rSString);
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516
		      (runtimeexception,
		       ("ga.G(" + (rSString != null ? "{...}" : "null") + ','
			+ (class15 != null ? "{...}" : "null") + ','
			+ (class16_41_ != null ? "{...}" : "null") + ',' + i
			+ ',' + (class15_42_ != null ? "{...}" : "null")
			+ ')'));
	}
    }
    
    static {
	aClass16_3006 = Class37_Sub2.create_rsstring("<col=40ff00>");
	aClass16_3025 = Class37_Sub2.create_rsstring("<col=c0ff00>");
	aClass16_3022 = Class37_Sub2.create_rsstring("shake:");
	aClass16_3024 = aClass16_3022;
	aClass16_3009 = aClass16_3010;
	aClass16_3017 = aClass16_3022;
    }
}
