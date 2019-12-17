package org.ie.client;

/* Class37_Sub9_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub22 extends Class37_Sub9
{
    public static int anInt3322;
    public static int anInt3323;
    public static RSString aClass16_3324
	= Class37_Sub2.create_rsstring("Ihr Spielkonto wird bereits benutzt)3");
    public static int[] anIntArray3325;
    public static int[] anIntArray3326;
    public static int anInt3327 = 0;
    public static int anInt3328;
    public static Sprite[] aClass37_Sub4_Sub9_Sub3Array3329;
    public static int anInt3330 = 50;
    public static int anInt3331;
    public static RSString aClass16_3332;
    public static int anInt3333;
    public static int[] anIntArray3334;
    public static int anInt3335;
    public static int[] anIntArray3336;
    public static int[] anIntArray3337 = new int[anInt3330];
    public static int anInt3338;
    public static int anInt3339;
    public static int[] anIntArray3340;
    public static int anInt3341;
    public static int[] anIntArray3342;
    public static int anInt3343;
    public static int[] anIntArray3344;
    public static RSString[] aClass16Array3345;
    
    public static void method858(int i, int i_0_, int i_1_, int i_2_, int i_3_,
				 int i_4_, int i_5_) {
	anInt3338++;
	int i_6_ = -i_4_ + 2048 & 0x7ff;
	int i_7_ = 0;
	int i_8_ = 0x7ff & -i_5_ + 2048;
	int i_9_ = i_0_;
	int i_10_ = 0;
	if ((i_6_ ^ 0xffffffff) != -1) {
	    int i_11_ = Rasterizer.anIntArray3910[i_6_];
	    int i_12_ = Rasterizer.anIntArray3929[i_6_];
	    int i_13_ = i_12_ * i_10_ + -(i_9_ * i_11_) >> 74236080;
	    i_9_ = i_9_ * i_12_ + i_10_ * i_11_ >> -1044345136;
	    i_10_ = i_13_;
	}
	if ((i_8_ ^ 0xffffffff) != -1) {
	    int i_14_ = Rasterizer.anIntArray3910[i_8_];
	    int i_15_ = Rasterizer.anIntArray3929[i_8_];
	    int i_16_ = i_15_ * i_7_ + i_14_ * i_9_ >> -1975889968;
	    i_9_ = -(i_7_ * i_14_) + i_9_ * i_15_ >> 1993983824;
	    i_7_ = i_16_;
	}
	Class19.anInt483 = -i_7_ + i_1_;
	Class37_Sub17.anInt2188 = i_5_;
	OverridedInterface.anInt1888 = -i_9_ + i_2_;
	if (i < 32)
	    method859((byte) -35, -33, 51, 18, 44, -1);
	Class37_Sub4_Sub7_Sub1_Sub2.anInt3969 = i_4_;
	Class37_Sub25.anInt2286 = -i_10_ + i_3_;
    }
    
    public int[] method761(int i, int i_17_) {
	anInt3331++;
	int[] is = aClass38_1966.method1049(i_17_, true);
	if (i >= -125)
	    method859((byte) 11, 39, 104, 105, 59, -110);
	if (aClass38_1966.aBoolean850) {
	    int[][] is_18_ = this.method762(0, i_17_, (byte) -91);
	    int[] is_19_ = is_18_[1];
	    int[] is_20_ = is_18_[2];
	    int[] is_21_ = is_18_[0];
	    for (int i_22_ = 0;
		 (Class32.anInt743 ^ 0xffffffff) < (i_22_ ^ 0xffffffff);
		 i_22_++)
		is[i_22_]
		    = (is_21_[i_22_] - (-is_19_[i_22_] - is_20_[i_22_])) / 3;
	}
	return is;
    }
    
    public static void method859(byte i, int i_23_, int i_24_, int i_25_,
				 int i_26_, int i_27_) {
	anInt3343++;
	if (InterfaceClickMask.anInt1985 != i_24_
	    || (i_23_ ^ 0xffffffff) != (Class37_Sub4_Sub7.anInt2641
					^ 0xffffffff)
	    || ((i_26_ ^ 0xffffffff) != (Class44.anInt963 ^ 0xffffffff)
		&& ClientScriptDef.aBoolean2613)) {
	    InterfaceClickMask.anInt1985 = i_24_;
	    Class44.anInt963 = i_26_;
	    Class37_Sub4_Sub7.anInt2641 = i_23_;
	    if (!ClientScriptDef.aBoolean2613)
		Class44.anInt963 = 0;
	    Class37_Sub4_Sub3.setGameState(25);
	    Class79.method1298(Class37_Sub4_Sub18.aClass16_2908, true, 1);
	    int i_28_ = Class15_Sub1.anInt1738;
	    int i_29_ = Class37_Sub18.anInt2200;
	    Class15_Sub1.anInt1738 = 8 * i_23_ - 48;
	    Class37_Sub18.anInt2200 = 8 * (i_24_ - 6);
	    int i_30_ = -i_28_ + Class15_Sub1.anInt1738;
	    i_28_ = Class15_Sub1.anInt1738;
	    int i_31_ = Class37_Sub18.anInt2200 - i_29_;
	    i_29_ = Class37_Sub18.anInt2200;
	    for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > -32769; i_32_++) {
		Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1
		    = (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111
		       [i_32_]);
		if (class37_sub4_sub7_sub1_sub1 != null) {
		    for (int i_33_ = 0; i_33_ < 10; i_33_++) {
			class37_sub4_sub7_sub1_sub1.anIntArray3651[i_33_]
			    -= i_31_;
			class37_sub4_sub7_sub1_sub1.anIntArray3669[i_33_]
			    -= i_30_;
		    }
		    class37_sub4_sub7_sub1_sub1.anInt3666 -= 128 * i_31_;
		    class37_sub4_sub7_sub1_sub1.anInt3642 -= 128 * i_30_;
		}
	    }
	    for (int i_34_ = 0; (i_34_ ^ 0xffffffff) > -2049; i_34_++) {
		Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2
		    = Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_34_];
		if (class37_sub4_sub7_sub1_sub2 != null) {
		    for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > -11; i_35_++) {
			class37_sub4_sub7_sub1_sub2.anIntArray3651[i_35_]
			    -= i_31_;
			class37_sub4_sub7_sub1_sub2.anIntArray3669[i_35_]
			    -= i_30_;
		    }
		    class37_sub4_sub7_sub1_sub2.anInt3642 -= i_30_ * 128;
		    class37_sub4_sub7_sub1_sub2.anInt3666 -= i_31_ * 128;
		}
	    }
	    Class37_Sub9_Sub1.anInt2916 = i_26_;
	    Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234
		.method499(i_25_, i_27_, false, -115);
	    int i_36_ = 0;
	    int i_37_ = 1;
	    int i_38_ = 104;
	    int i_39_ = 0;
	    if (i_31_ < 0) {
		i_36_ = 103;
		i_38_ = -1;
		i_37_ = -1;
	    }
	    int i_40_ = 104;
	    int i_41_ = 1;
	    if ((i_30_ ^ 0xffffffff) > -1) {
		i_41_ = -1;
		i_40_ = -1;
		i_39_ = 103;
	    }
	    for (int i_42_ = i_36_;
		 (i_42_ ^ 0xffffffff) != (i_38_ ^ 0xffffffff);
		 i_42_ += i_37_) {
		for (int i_43_ = i_39_;
		     (i_43_ ^ 0xffffffff) != (i_40_ ^ 0xffffffff);
		     i_43_ += i_41_) {
		    int i_44_ = i_42_ - -i_31_;
		    int i_45_ = i_43_ - -i_30_;
		    for (int i_46_ = 0; (i_46_ ^ 0xffffffff) > -5; i_46_++) {
			if (i_44_ >= 0 && i_45_ >= 0
			    && (i_44_ ^ 0xffffffff) > -105 && i_45_ < 104)
			    Class37_Sub9_Sub18.aClass58ArrayArrayArray3238
				[i_46_][i_42_][i_43_]
				= (Class37_Sub9_Sub18
				   .aClass58ArrayArrayArray3238[i_46_][i_44_]
				   [i_45_]);
			else
			    Class37_Sub9_Sub18.aClass58ArrayArrayArray3238
				[i_46_][i_42_][i_43_]
				= null;
		    }
		}
	    }
	    for (Class37_Sub2 class37_sub2 = (Class37_Sub2) Class37_Sub9_Sub28
								.aClass58_3427
								.getFirst();
		 class37_sub2 != null;
		 class37_sub2 = (Class37_Sub2) Class37_Sub9_Sub28
						   .aClass58_3427
						   .getNext()) {
		class37_sub2.anInt1836 -= i_31_;
		class37_sub2.anInt1829 -= i_30_;
		if (class37_sub2.anInt1836 < 0 || class37_sub2.anInt1829 < 0
		    || class37_sub2.anInt1836 >= 104
		    || class37_sub2.anInt1829 >= 104)
		    class37_sub2.unlink();
	    }
	    if ((Class79.anInt1474 ^ 0xffffffff) != -1) {
		Class82.anInt1687 -= i_30_;
		Class79.anInt1474 -= i_31_;
	    }
	    Class37_Sub3_Sub1.anInt2329 = 0;
	    Class37_Sub4_Sub12.aBoolean2775 = false;
	    Class37_Sub9_Sub35.anInt3564 = -1;
	    if (i > -127)
		anInt3333 = 65;
	    Class19.aClass58_481.clear();
	    Class37_Sub9_Sub5.aClass58_2994.clear();
	}
    }
    
    public static void method860(RSString rSString, boolean bool) {
	anInt3335++;
	if (Class37_Sub9_Sub20.anInt3301 >= 2) {
	    if (rSString.method159(Class37_Sub9_Sub21.aClass16_3305, (byte) 56))
		System.gc();
	    if (rSString.method159(Class37_Sub4_Sub18.aClass16_2909, (byte) 65))
		Class37_Sub9_Sub19.method843(false);
	    if (rSString.method159(Class50.aClass16_1020, (byte) 53))
		Class64.aBoolean1216 = true;
	    if (rSString.method159(Class37_Sub9_Sub1.aClass16_2923, (byte) 63))
		Class64.aBoolean1216 = false;
	    if (rSString.method159(Class37_Sub25.aClass16_2274, (byte) 127)) {
		for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
		    for (int i_47_ = 1; i_47_ < 103; i_47_++) {
			for (int i_48_ = 1; (i_48_ ^ 0xffffffff) > -104;
			     i_48_++)
			    Class68.aClass20Array1322[i].anIntArrayArray554
				[i_47_][i_48_]
				= 0;
		    }
		}
	    }
	    if (rSString.method159(Class37_Sub13.aClass16_2106, (byte) 68)
		&& (Class37_Sub9_Sub17.anInt3219 ^ 0xffffffff) == -3)
		throw new RuntimeException();
	    if (rSString.method165(InterfaceListener.aClass16_1920, 52)) {
		Class37_Sub4_Sub13.anInt2793
		    = rSString.method158(12, -1).method151()
			  .method175(8109);
		Class37_Sub4_Sub7_Sub1_Sub1.method505
		    (null, 0,
		     (Class37_Sub9_Sub27.method881
		      ((new RSString[]
			     { Class15_Sub1.aClass16_1757,
			       Class37_Sub9_Sub24.method870((Class37_Sub4_Sub13
							     .anInt2793),
							    (byte) -114) }))));
	    }
	    if (rSString.method159(Class17.aClass16_313, (byte) 98))
		Class37_Sub3_Sub1.qaoptest = true;
	}
	Class42.aClass37_Sub11_Sub1_936.method989(202);
	Class42.aClass37_Sub11_Sub1_936
	    .method964(99, rSString.length() + -1);
	Class42.aClass37_Sub11_Sub1_936.method977(rSString.method158(2, -1), 0);
	Class62.anInt1172++;
	if (bool != false)
	    method858(-2, -25, 67, -111, 36, -126, -65);
    }
    
    public Class37_Sub9_Sub22() {
	super(1, true);
    }
    
    public static Class37_Sub4_Sub12 method861(int i_49_) {
    	Class37_Sub4_Sub12 class37_sub4_sub12
		    = ((Class37_Sub4_Sub12)
		       Class37_Sub16.aClass65_2155.get((long) i_49_));
		if (class37_sub4_sub12 != null)
		    return class37_sub4_sub12;
		byte[] is = Class52.aClass15_1053.getFile(12, i_49_);
		class37_sub4_sub12 = new Class37_Sub4_Sub12();
		if (is != null)
		    class37_sub4_sub12.method696(new ByteVector(is), 5);
		class37_sub4_sub12.method699(26486);
		Class37_Sub16.aClass65_2155.put(class37_sub4_sub12, (long) i_49_);
		return class37_sub4_sub12;
    }
    
    public static boolean method862(int i, boolean bool) {
	anInt3341++;
	if (bool != false)
	    anIntArray3336 = null;
	if ((i ^ 0xffffffff) > -49 || i > 57)
	    return false;
	return true;
    }
    
    public static void method863(int i) {
	aClass16_3324 = null;
	anIntArray3326 = null;
	aClass37_Sub4_Sub9_Sub3Array3329 = null;
	anIntArray3342 = null;
	anIntArray3336 = null;
	anIntArray3344 = null;
	aClass16_3332 = null;
	anIntArray3340 = null;
	anIntArray3334 = null;
	anIntArray3325 = null;
	anIntArray3337 = null;
	if (i == 206)
	    aClass16Array3345 = null;
    }
    
    public static void method864(int i) {
	if (i != 98)
	    method860(null, true);
	while ((Class83.byteVector
		    .method991(NodeSub.anInt1844, i + -1435)
		^ 0xffffffff)
	       <= -28) {
	    int i_51_ = Class83.byteVector.method996(15, 17);
	    if ((i_51_ ^ 0xffffffff) == -32768)
		break;
	    boolean bool = false;
	    if (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_51_]
		== null) {
		Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_51_]
		    = new Class37_Sub4_Sub7_Sub1_Sub1();
		bool = true;
	    }
	    Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1
		= Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111[i_51_];
	    Class37_Sub4_Sub16.anIntArray2869[Class76.anInt1436++] = i_51_;
	    class37_sub4_sub7_sub1_sub1.anInt3641 = Class37_Sub7.loopCycle;
	    int i_52_
		= Class83.byteVector.method996(5, i ^ 0x14);
	    class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955
		= Class37_Sub9_Sub34.method912(i + -15,
					       Class83
						   .byteVector
						   .method996(14, i ^ 0x19));
	    int i_53_ = Class83.byteVector.method996(5, 87);
	    if (i_52_ > 15)
		i_52_ -= 32;
	    int i_54_ = Class83.byteVector.method996(1, 18);
	    if ((i_54_ ^ 0xffffffff) == -2)
		Class36.anIntArray809[Class37_Sub9_Sub11.anInt3098++] = i_51_;
	    if (i_53_ > 15)
		i_53_ -= 32;
	    int i_55_ = (Class37_Sub9_Sub18.anIntArray3233
			 [Class83.byteVector.method996(3, 64)]);
	    if (bool)
		class37_sub4_sub7_sub1_sub1.anInt3681
		    = class37_sub4_sub7_sub1_sub1.anInt3663 = i_55_;
	    int i_56_ = Class83.byteVector.method996(1, 86);
	    class37_sub4_sub7_sub1_sub1.anInt3678
		= (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955
		   .anInt2844);
	    class37_sub4_sub7_sub1_sub1.anInt3696
		= (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955
		   .anInt2828);
	    class37_sub4_sub7_sub1_sub1.anInt3668
		= (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955
		   .anInt2834);
	    class37_sub4_sub7_sub1_sub1.anInt3660
		= (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955
		   .anInt2822);
	    if ((class37_sub4_sub7_sub1_sub1.anInt3668 ^ 0xffffffff) == -1)
		class37_sub4_sub7_sub1_sub1.anInt3663 = 0;
	    class37_sub4_sub7_sub1_sub1.anInt3676
		= (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955
		   .anInt2860);
	    class37_sub4_sub7_sub1_sub1.anInt3701
		= (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955
		   .anInt2814);
	    class37_sub4_sub7_sub1_sub1.anInt3686
		= (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955
		   .anInt2837);
	    class37_sub4_sub7_sub1_sub1.anInt3657
		= (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955
		   .anInt2815);
	    class37_sub4_sub7_sub1_sub1.anInt3683
		= (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955
		   .anInt2858);
	    class37_sub4_sub7_sub1_sub1.method499
		((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234
		  .anIntArray3669[0]) - -i_53_,
		 (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234
		  .anIntArray3651[0]) + i_52_,
		 (i_56_ ^ 0xffffffff) == -2, i + -220);
	}
	anInt3328++;
	Class83.byteVector.method988(true);
    }
    
    static {
	anIntArray3334 = new int[anInt3330];
	anIntArray3336 = new int[anInt3330];
	aClass16_3332 = Class37_Sub2.create_rsstring("<)4col>");
	anIntArray3326
	    = (new int[]
	       { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
		 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32,
		 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
		 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62,
		 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94,
		 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118,
		 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143,
		 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165,
		 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184,
		 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196,
		 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208,
		 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220,
		 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232,
		 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244,
		 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79,
		 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102,
		 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128,
		 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149,
		 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171,
		 172, 173, 178, 255, 179 });
	anIntArray3325 = new int[anInt3330];
	anIntArray3342 = new int[anInt3330];
	anIntArray3344 = new int[anInt3330];
	aClass16Array3345 = new RSString[anInt3330];
	anIntArray3340 = new int[anInt3330];
    }
}
