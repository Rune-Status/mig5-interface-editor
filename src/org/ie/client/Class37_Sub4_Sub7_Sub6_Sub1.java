package org.ie.client;

/* Class37_Sub4_Sub7_Sub6_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub7_Sub6_Sub1 extends Class37_Sub4_Sub7_Sub6
{
    public byte[] aByteArray3998;
    public int[] anIntArray3999;
    public int[] anIntArray4000;
    public int[] anIntArray4001;
    public int[] anIntArray4002;
    public byte[] aByteArray4003;
    public short[] aShortArray4004;
    public byte aByte4005 = 0;
    public byte[] aByteArray4006;
    public int[] anIntArray4007;
    public int[] anIntArray4008;
    public int[] anIntArray4009;
    public int[] anIntArray4010;
    public int anInt4011 = 0;
    public static Class37_Sub4_Sub7_Sub6_Sub1 aClass37_Sub4_Sub7_Sub6_Sub1_4012
	= new Class37_Sub4_Sub7_Sub6_Sub1();
    public int[] anIntArray4013;
    public static byte[] aByteArray4014 = new byte[1];
    public static Class37_Sub4_Sub7_Sub6_Sub1 aClass37_Sub4_Sub7_Sub6_Sub1_4015
	= new Class37_Sub4_Sub7_Sub6_Sub1();
    public static int[] anIntArray4016 = new int[4096];
    public static int anInt4017;
    public static int[][] anIntArrayArray4018;
    public static int anInt4019;
    public static int[] anIntArray4020 = new int[12];
    public static int[] anIntArray4021;
    public static int[] anIntArray4022;
    public static boolean[] aBooleanArray4023 = new boolean[4096];
    public static int anInt4024;
    public static int[] anIntArray4025;
    public static int[] anIntArray4026;
    public static int[] anIntArray4027;
    public static int[] anIntArray4028;
    public static int[] anIntArray4029;
    public static int[] anIntArray4030;
    public static int[] anIntArray4031;
    public static int[][] anIntArrayArray4032;
    public static boolean[] aBooleanArray4033;
    public static int anInt4034;
    public static byte[] aByteArray4035;
    public static int[] anIntArray4036;
    public static int anInt4037;
    public static int[] anIntArray4038;
    public static boolean aBoolean4039;
    public static int[] anIntArray4040;
    public static int[] anIntArray4041;
    public static int anInt4042;
    public static int[] anIntArray4043;
    public static int[] anIntArray4044;
    public static int[] anIntArray4045;
    public static int[] anIntArray4046;
    
    public void method494(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			  int i_4_, int i_5_, int i_6_, int i_7_) {
	anIntArray4027[0] = -1;
	if (anInt3829 != 1)
	    this.method555();
	int i_8_ = i_6_ * i_3_ - i_4_ * i_2_ >> 16;
	int i_9_ = i_5_ * i_0_ + i_8_ * i_1_ >> 16;
	int i_10_ = anInt3835 * i_1_ >> 16;
	int i_11_ = i_9_ + i_10_;
	if (i_11_ > 50 && i_9_ < 3500) {
	    int i_12_ = i_6_ * i_2_ + i_4_ * i_3_ >> 16;
	    int i_13_ = i_12_ - anInt3835 << 9;
	    if (i_13_ / i_11_ < Rasterizer.anInt3916) {
		int i_14_ = i_12_ + anInt3835 << 9;
		if (i_14_ / i_11_ > Rasterizer.anInt3923) {
		    int i_15_ = i_5_ * i_1_ - i_8_ * i_0_ >> 16;
		    int i_16_ = anInt3835 * i_0_ >> 16;
		    int i_17_ = i_15_ + i_16_ << 9;
		    if (i_17_ / i_11_ > Rasterizer.anInt3927) {
			int i_18_ = i_16_ + (anInt2627 * i_1_ >> 16);
			int i_19_ = i_15_ - i_18_ << 9;
			if (i_19_ / i_11_ < Rasterizer.anInt3919) {
			    int i_20_ = i_10_ + (anInt2627 * i_0_ >> 16);
			    boolean bool = false;
			    boolean bool_21_ = false;
			    if (i_9_ - i_20_ <= 50)
				bool_21_ = true;
			    boolean bool_22_ = bool_21_ || anInt4011 > 0;
			    boolean bool_23_ = false;
			    if (i_7_ > 0 && aBoolean4039) {
				int i_24_ = i_9_ - i_10_;
				if (i_24_ <= 50)
				    i_24_ = 50;
				if (i_12_ > 0) {
				    i_13_ /= i_11_;
				    i_14_ /= i_24_;
				} else {
				    i_14_ /= i_11_;
				    i_13_ /= i_24_;
				}
				if (i_15_ > 0) {
				    i_19_ /= i_11_;
				    i_17_ /= i_24_;
				} else {
				    i_17_ /= i_11_;
				    i_19_ /= i_24_;
				}
				int i_25_
				    = (anInt4037
				       - Rasterizer.anInt3911);
				int i_26_
				    = (anInt4024
				       - Rasterizer.anInt3924);
				if (i_25_ > i_13_ && i_25_ < i_14_
				    && i_26_ > i_19_ && i_26_ < i_17_) {
				    if (aBoolean3836)
					anIntArray4038[anInt4019++] = i_7_;
				    else
					bool_23_ = true;
				}
			    }
			    int i_27_ = Rasterizer.anInt3911;
			    int i_28_ = Rasterizer.anInt3924;
			    int i_29_ = 0;
			    int i_30_ = 0;
			    if (i != 0) {
				i_29_ = anIntArray4036[i];
				i_30_ = anIntArray4045[i];
			    }
			    for (int i_31_ = 0; i_31_ < anInt3830; i_31_++) {
				int i_32_ = anIntArray3823[i_31_];
				int i_33_ = anIntArray3833[i_31_];
				int i_34_ = anIntArray3824[i_31_];
				if (i != 0) {
				    int i_35_
					= i_34_ * i_29_ + i_32_ * i_30_ >> 16;
				    i_34_
					= i_34_ * i_30_ - i_32_ * i_29_ >> 16;
				    i_32_ = i_35_;
				}
				i_32_ += i_4_;
				i_33_ += i_5_;
				i_34_ += i_6_;
				int i_36_ = i_34_ * i_2_ + i_32_ * i_3_ >> 16;
				i_34_ = i_34_ * i_3_ - i_32_ * i_2_ >> 16;
				i_32_ = i_36_;
				i_36_ = i_33_ * i_1_ - i_34_ * i_0_ >> 16;
				i_34_ = i_33_ * i_0_ + i_34_ * i_1_ >> 16;
				i_33_ = i_36_;
				anIntArray4030[i_31_] = i_34_ - i_9_;
				if (i_34_ >= 50) {
				    anIntArray4044[i_31_]
					= i_27_ + (i_32_ << 9) / i_34_;
				    anIntArray4021[i_31_]
					= i_28_ + (i_33_ << 9) / i_34_;
				} else {
				    anIntArray4044[i_31_] = -5000;
				    bool = true;
				}
				if (bool_22_) {
				    anIntArray4016[i_31_] = i_32_;
				    anIntArray4040[i_31_] = i_33_;
				    anIntArray4028[i_31_] = i_34_;
				}
			    }
			    try {
				method567(bool, bool_23_, i_7_);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method551(Class37_Sub4_Sub16 class37_sub4_sub16, int i,
			  Class37_Sub4_Sub16 class37_sub4_sub16_37_, int i_38_,
			  int[] is) {
	if (i != -1) {
	    if (is == null || i_38_ == -1)
		method547(class37_sub4_sub16, i);
	    else {
		Class61 class61 = class37_sub4_sub16.aClass61Array2870[i];
		Class61 class61_39_
		    = class37_sub4_sub16_37_.aClass61Array2870[i_38_];
		Class37_Sub25 class37_sub25 = class61.aClass37_Sub25_1168;
		anInt4017 = 0;
		anInt4034 = 0;
		anInt4042 = 0;
		int i_40_ = 0;
		int i_41_ = is[i_40_++];
		for (int i_42_ = 0; i_42_ < class61.anInt1167; i_42_++) {
		    int i_43_;
		    for (i_43_ = class61.anIntArray1170[i_42_]; i_43_ > i_41_;
			 i_41_ = is[i_40_++]) {
			/* empty */
		    }
		    if (i_43_ != i_41_
			|| class37_sub25.anIntArray2277[i_43_] == 0)
			method563(class37_sub25.anIntArray2277[i_43_],
				  class37_sub25.anIntArrayArray2283[i_43_],
				  class61.anIntArray1166[i_42_],
				  class61.anIntArray1161[i_42_],
				  class61.anIntArray1169[i_42_]);
		}
		anInt4017 = 0;
		anInt4034 = 0;
		anInt4042 = 0;
		i_40_ = 0;
		i_41_ = is[i_40_++];
		for (int i_44_ = 0; i_44_ < class61_39_.anInt1167; i_44_++) {
		    int i_45_;
		    for (i_45_ = class61_39_.anIntArray1170[i_44_];
			 i_45_ > i_41_; i_41_ = is[i_40_++]) {
			/* empty */
		    }
		    if (i_45_ == i_41_
			|| class37_sub25.anIntArray2277[i_45_] == 0)
			method563(class37_sub25.anIntArray2277[i_45_],
				  class37_sub25.anIntArrayArray2283[i_45_],
				  class61_39_.anIntArray1166[i_44_],
				  class61_39_.anIntArray1161[i_44_],
				  class61_39_.anIntArray1169[i_44_]);
		}
		anInt3829 = 0;
	    }
	}
    }
    
    public void method557(int i, int i_46_, int i_47_, int i_48_, int i_49_,
			  int i_50_, int i_51_, int i_52_) {
	anIntArray4027[0] = -1;
	if (anInt3829 != 2 && anInt3829 != 1)
	    this.method550();
	int i_53_ = Rasterizer.anInt3911;
	int i_54_ = Rasterizer.anInt3924;
	int i_55_ = anIntArray4036[i];
	int i_56_ = anIntArray4045[i];
	int i_57_ = anIntArray4036[i_46_];
	int i_58_ = anIntArray4045[i_46_];
	int i_59_ = anIntArray4036[i_47_];
	int i_60_ = anIntArray4045[i_47_];
	int i_61_ = anIntArray4036[i_48_];
	int i_62_ = anIntArray4045[i_48_];
	int i_63_ = i_50_ * i_61_ + i_51_ * i_62_ >> 16;
	for (int i_64_ = 0; i_64_ < anInt3830; i_64_++) {
	    int i_65_ = anIntArray3823[i_64_];
	    int i_66_ = anIntArray3833[i_64_];
	    int i_67_ = anIntArray3824[i_64_];
	    if (i_47_ != 0) {
		int i_68_ = i_66_ * i_59_ + i_65_ * i_60_ >> 16;
		i_66_ = i_66_ * i_60_ - i_65_ * i_59_ >> 16;
		i_65_ = i_68_;
	    }
	    if (i != 0) {
		int i_69_ = i_66_ * i_56_ - i_67_ * i_55_ >> 16;
		i_67_ = i_66_ * i_55_ + i_67_ * i_56_ >> 16;
		i_66_ = i_69_;
	    }
	    if (i_46_ != 0) {
		int i_70_ = i_67_ * i_57_ + i_65_ * i_58_ >> 16;
		i_67_ = i_67_ * i_58_ - i_65_ * i_57_ >> 16;
		i_65_ = i_70_;
	    }
	    i_65_ += i_49_;
	    i_66_ += i_50_;
	    i_67_ += i_51_;
	    int i_71_ = i_66_ * i_62_ - i_67_ * i_61_ >> 16;
	    i_67_ = i_66_ * i_61_ + i_67_ * i_62_ >> 16;
	    i_66_ = i_71_;
	    anIntArray4030[i_64_] = i_67_ - i_63_;
	    anIntArray4044[i_64_] = i_53_ + (i_65_ << 9) / i_52_;
	    anIntArray4021[i_64_] = i_54_ + (i_66_ << 9) / i_52_;
	    if (anInt4011 > 0) {
		anIntArray4016[i_64_] = i_65_;
		anIntArray4040[i_64_] = i_66_;
		anIntArray4028[i_64_] = i_67_;
	    }
	}
	try {
	    method567(false, false, 0);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public Class37_Sub4_Sub7_Sub6 method542(boolean bool) {
	if (!bool && aByteArray4035.length < anInt3825)
	    aByteArray4035 = new byte[anInt3825 + 100];
	return method561(bool, aClass37_Sub4_Sub7_Sub6_Sub1_4015,
			 aByteArray4035);
    }
    
    public static void method560() {
	aClass37_Sub4_Sub7_Sub6_Sub1_4012 = null;
	aByteArray4014 = null;
	aClass37_Sub4_Sub7_Sub6_Sub1_4015 = null;
	aByteArray4035 = null;
	aBooleanArray4033 = null;
	aBooleanArray4023 = null;
	anIntArray4044 = null;
	anIntArray4021 = null;
	anIntArray4030 = null;
	anIntArray4016 = null;
	anIntArray4040 = null;
	anIntArray4028 = null;
	anIntArray4027 = null;
	anIntArrayArray4018 = null;
	anIntArray4020 = null;
	anIntArrayArray4032 = null;
	anIntArray4029 = null;
	anIntArray4031 = null;
	anIntArray4022 = null;
	anIntArray4043 = null;
	anIntArray4041 = null;
	anIntArray4026 = null;
	anIntArray4038 = null;
	anIntArray4036 = null;
	anIntArray4045 = null;
	anIntArray4025 = null;
	anIntArray4046 = null;
    }
    
    public Class37_Sub4_Sub7_Sub6 method559(boolean bool) {
	if (!bool && aByteArray4014.length < anInt3825)
	    aByteArray4014 = new byte[anInt3825 + 100];
	return method561(bool, aClass37_Sub4_Sub7_Sub6_Sub1_4012,
			 aByteArray4014);
    }
    
    public Class37_Sub4_Sub7_Sub6_Sub1 method561
	(boolean bool,
	 Class37_Sub4_Sub7_Sub6_Sub1 class37_sub4_sub7_sub6_sub1_72_,
	 byte[] is) {
	class37_sub4_sub7_sub6_sub1_72_.anInt3830 = anInt3830;
	class37_sub4_sub7_sub6_sub1_72_.anInt3825 = anInt3825;
	class37_sub4_sub7_sub6_sub1_72_.anInt4011 = anInt4011;
	if (class37_sub4_sub7_sub6_sub1_72_.anIntArray3823 == null
	    || (class37_sub4_sub7_sub6_sub1_72_.anIntArray3823.length
		< anInt3830)) {
	    class37_sub4_sub7_sub6_sub1_72_.anIntArray3823
		= new int[anInt3830 + 100];
	    class37_sub4_sub7_sub6_sub1_72_.anIntArray3833
		= new int[anInt3830 + 100];
	    class37_sub4_sub7_sub6_sub1_72_.anIntArray3824
		= new int[anInt3830 + 100];
	}
	for (int i = 0; i < anInt3830; i++) {
	    class37_sub4_sub7_sub6_sub1_72_.anIntArray3823[i]
		= anIntArray3823[i];
	    class37_sub4_sub7_sub6_sub1_72_.anIntArray3833[i]
		= anIntArray3833[i];
	    class37_sub4_sub7_sub6_sub1_72_.anIntArray3824[i]
		= anIntArray3824[i];
	}
	if (bool)
	    class37_sub4_sub7_sub6_sub1_72_.aByteArray4006 = aByteArray4006;
	else {
	    class37_sub4_sub7_sub6_sub1_72_.aByteArray4006 = is;
	    if (aByteArray4006 == null) {
		for (int i = 0; i < anInt3825; i++)
		    class37_sub4_sub7_sub6_sub1_72_.aByteArray4006[i]
			= (byte) 0;
	    } else {
		for (int i = 0; i < anInt3825; i++)
		    class37_sub4_sub7_sub6_sub1_72_.aByteArray4006[i]
			= aByteArray4006[i];
	    }
	}
	class37_sub4_sub7_sub6_sub1_72_.anIntArray3999 = anIntArray3999;
	class37_sub4_sub7_sub6_sub1_72_.anIntArray4013 = anIntArray4013;
	class37_sub4_sub7_sub6_sub1_72_.anIntArray4001 = anIntArray4001;
	class37_sub4_sub7_sub6_sub1_72_.anIntArray4010 = anIntArray4010;
	class37_sub4_sub7_sub6_sub1_72_.anIntArray4000 = anIntArray4000;
	class37_sub4_sub7_sub6_sub1_72_.anIntArray4007 = anIntArray4007;
	class37_sub4_sub7_sub6_sub1_72_.aByteArray3998 = aByteArray3998;
	class37_sub4_sub7_sub6_sub1_72_.aByteArray4003 = aByteArray4003;
	class37_sub4_sub7_sub6_sub1_72_.aShortArray4004 = aShortArray4004;
	class37_sub4_sub7_sub6_sub1_72_.aByte4005 = aByte4005;
	class37_sub4_sub7_sub6_sub1_72_.anIntArray4008 = anIntArray4008;
	class37_sub4_sub7_sub6_sub1_72_.anIntArray4009 = anIntArray4009;
	class37_sub4_sub7_sub6_sub1_72_.anIntArray4002 = anIntArray4002;
	class37_sub4_sub7_sub6_sub1_72_.anIntArrayArray3827
	    = anIntArrayArray3827;
	class37_sub4_sub7_sub6_sub1_72_.anIntArrayArray3822
	    = anIntArrayArray3822;
	class37_sub4_sub7_sub6_sub1_72_.aBoolean3836 = aBoolean3836;
	class37_sub4_sub7_sub6_sub1_72_.anInt3829 = 0;
	return class37_sub4_sub7_sub6_sub1_72_;
    }
    
    public static int method562(int i, int i_73_) {
	i_73_ = i_73_ * (i & 0x7f) >> 7;
	if (i_73_ < 2)
	    i_73_ = 2;
	else if (i_73_ > 126)
	    i_73_ = 126;
	return (i & 0xff80) + i_73_;
    }
    
    public Class37_Sub4_Sub7_Sub6 method549
	(Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6) {
	return (new Class37_Sub4_Sub7_Sub6_Sub1
		((new Class37_Sub4_Sub7_Sub6_Sub1[]
		  { this,
		    (Class37_Sub4_Sub7_Sub6_Sub1) class37_sub4_sub7_sub6 }),
		 2));
    }
    
    public void method563(int i, int[] is, int i_74_, int i_75_, int i_76_) {
	int i_77_ = is.length;
	if (i == 0) {
	    int i_78_ = 0;
	    anInt4017 = 0;
	    anInt4034 = 0;
	    anInt4042 = 0;
	    for (int i_79_ = 0; i_79_ < i_77_; i_79_++) {
		int i_80_ = is[i_79_];
		if (i_80_ < anIntArrayArray3827.length) {
		    int[] is_81_ = anIntArrayArray3827[i_80_];
		    for (int i_82_ = 0; i_82_ < is_81_.length; i_82_++) {
			int i_83_ = is_81_[i_82_];
			anInt4017 += anIntArray3823[i_83_];
			anInt4034 += anIntArray3833[i_83_];
			anInt4042 += anIntArray3824[i_83_];
			i_78_++;
		    }
		}
	    }
	    if (i_78_ > 0) {
		anInt4017 = anInt4017 / i_78_ + i_74_;
		anInt4034 = anInt4034 / i_78_ + i_75_;
		anInt4042 = anInt4042 / i_78_ + i_76_;
	    } else {
		anInt4017 = i_74_;
		anInt4034 = i_75_;
		anInt4042 = i_76_;
	    }
	} else if (i == 1) {
	    for (int i_84_ = 0; i_84_ < i_77_; i_84_++) {
		int i_85_ = is[i_84_];
		if (i_85_ < anIntArrayArray3827.length) {
		    int[] is_86_ = anIntArrayArray3827[i_85_];
		    for (int i_87_ = 0; i_87_ < is_86_.length; i_87_++) {
			int i_88_ = is_86_[i_87_];
			anIntArray3823[i_88_] += i_74_;
			anIntArray3833[i_88_] += i_75_;
			anIntArray3824[i_88_] += i_76_;
		    }
		}
	    }
	} else if (i == 2) {
	    for (int i_89_ = 0; i_89_ < i_77_; i_89_++) {
		int i_90_ = is[i_89_];
		if (i_90_ < anIntArrayArray3827.length) {
		    int[] is_91_ = anIntArrayArray3827[i_90_];
		    for (int i_92_ = 0; i_92_ < is_91_.length; i_92_++) {
			int i_93_ = is_91_[i_92_];
			anIntArray3823[i_93_] -= anInt4017;
			anIntArray3833[i_93_] -= anInt4034;
			anIntArray3824[i_93_] -= anInt4042;
			int i_94_ = (i_74_ & 0xff) * 8;
			int i_95_ = (i_75_ & 0xff) * 8;
			int i_96_ = (i_76_ & 0xff) * 8;
			if (i_96_ != 0) {
			    int i_97_ = anIntArray4036[i_96_];
			    int i_98_ = anIntArray4045[i_96_];
			    int i_99_ = ((anIntArray3833[i_93_] * i_97_
					  + anIntArray3823[i_93_] * i_98_)
					 >> 16);
			    anIntArray3833[i_93_]
				= (anIntArray3833[i_93_] * i_98_
				   - anIntArray3823[i_93_] * i_97_) >> 16;
			    anIntArray3823[i_93_] = i_99_;
			}
			if (i_94_ != 0) {
			    int i_100_ = anIntArray4036[i_94_];
			    int i_101_ = anIntArray4045[i_94_];
			    int i_102_ = ((anIntArray3833[i_93_] * i_101_
					   - anIntArray3824[i_93_] * i_100_)
					  >> 16);
			    anIntArray3824[i_93_]
				= (anIntArray3833[i_93_] * i_100_
				   + anIntArray3824[i_93_] * i_101_) >> 16;
			    anIntArray3833[i_93_] = i_102_;
			}
			if (i_95_ != 0) {
			    int i_103_ = anIntArray4036[i_95_];
			    int i_104_ = anIntArray4045[i_95_];
			    int i_105_ = ((anIntArray3824[i_93_] * i_103_
					   + anIntArray3823[i_93_] * i_104_)
					  >> 16);
			    anIntArray3824[i_93_]
				= (anIntArray3824[i_93_] * i_104_
				   - anIntArray3823[i_93_] * i_103_) >> 16;
			    anIntArray3823[i_93_] = i_105_;
			}
			anIntArray3823[i_93_] += anInt4017;
			anIntArray3833[i_93_] += anInt4034;
			anIntArray3824[i_93_] += anInt4042;
		    }
		}
	    }
	} else if (i == 3) {
	    for (int i_106_ = 0; i_106_ < i_77_; i_106_++) {
		int i_107_ = is[i_106_];
		if (i_107_ < anIntArrayArray3827.length) {
		    int[] is_108_ = anIntArrayArray3827[i_107_];
		    for (int i_109_ = 0; i_109_ < is_108_.length; i_109_++) {
			int i_110_ = is_108_[i_109_];
			anIntArray3823[i_110_] -= anInt4017;
			anIntArray3833[i_110_] -= anInt4034;
			anIntArray3824[i_110_] -= anInt4042;
			anIntArray3823[i_110_]
			    = anIntArray3823[i_110_] * i_74_ / 128;
			anIntArray3833[i_110_]
			    = anIntArray3833[i_110_] * i_75_ / 128;
			anIntArray3824[i_110_]
			    = anIntArray3824[i_110_] * i_76_ / 128;
			anIntArray3823[i_110_] += anInt4017;
			anIntArray3833[i_110_] += anInt4034;
			anIntArray3824[i_110_] += anInt4042;
		    }
		}
	    }
	} else if (i == 5 && anIntArrayArray3822 != null
		   && aByteArray4006 != null) {
	    for (int i_111_ = 0; i_111_ < i_77_; i_111_++) {
		int i_112_ = is[i_111_];
		if (i_112_ < anIntArrayArray3822.length) {
		    int[] is_113_ = anIntArrayArray3822[i_112_];
		    for (int i_114_ = 0; i_114_ < is_113_.length; i_114_++) {
			int i_115_ = is_113_[i_114_];
			int i_116_
			    = (aByteArray4006[i_115_] & 0xff) + i_74_ * 8;
			if (i_116_ < 0)
			    i_116_ = 0;
			else if (i_116_ > 255)
			    i_116_ = 255;
			aByteArray4006[i_115_] = (byte) i_116_;
		    }
		}
	    }
	}
    }
    
    public void method564(int i) {
	if (aBooleanArray4023[i])
	    method568(i);
	else {
	    int i_117_ = anIntArray3999[i];
	    int i_118_ = anIntArray4013[i];
	    int i_119_ = anIntArray4001[i];
	    Rasterizer.aBoolean3922 = aBooleanArray4033[i];
	    if (aByteArray4006 == null)
		Rasterizer.anInt3925 = 0;
	    else
		Rasterizer.anInt3925 = aByteArray4006[i] & 0xff;
	    if (aShortArray4004 == null || aShortArray4004[i] == -1) {
		if (anIntArray4007[i] == -1)
		    Rasterizer.method670(anIntArray4021[i_117_],
						     anIntArray4021[i_118_],
						     anIntArray4021[i_119_],
						     anIntArray4044[i_117_],
						     anIntArray4044[i_118_],
						     anIntArray4044[i_119_],
						     (anIntArray4025
						      [anIntArray4010[i]]));
		else
		    Rasterizer.method656(anIntArray4021[i_117_],
						     anIntArray4021[i_118_],
						     anIntArray4021[i_119_],
						     anIntArray4044[i_117_],
						     anIntArray4044[i_118_],
						     anIntArray4044[i_119_],
						     anIntArray4010[i],
						     anIntArray4000[i],
						     anIntArray4007[i]);
	    } else {
		int i_120_;
		int i_121_;
		int i_122_;
		if (aByteArray4003 != null && aByteArray4003[i] != -1) {
		    int i_123_ = aByteArray4003[i] & 0xff;
		    i_120_ = anIntArray4008[i_123_];
		    i_121_ = anIntArray4009[i_123_];
		    i_122_ = anIntArray4002[i_123_];
		} else {
		    i_120_ = i_117_;
		    i_121_ = i_118_;
		    i_122_ = i_119_;
		}
		if (anIntArray4007[i] == -1)
		    Rasterizer.method672
			(anIntArray4021[i_117_], anIntArray4021[i_118_],
			 anIntArray4021[i_119_], anIntArray4044[i_117_],
			 anIntArray4044[i_118_], anIntArray4044[i_119_],
			 anIntArray4010[i], anIntArray4010[i],
			 anIntArray4010[i], anIntArray4016[i_120_],
			 anIntArray4016[i_121_], anIntArray4016[i_122_],
			 anIntArray4040[i_120_], anIntArray4040[i_121_],
			 anIntArray4040[i_122_], anIntArray4028[i_120_],
			 anIntArray4028[i_121_], anIntArray4028[i_122_],
			 aShortArray4004[i]);
		else
		    Rasterizer.method672
			(anIntArray4021[i_117_], anIntArray4021[i_118_],
			 anIntArray4021[i_119_], anIntArray4044[i_117_],
			 anIntArray4044[i_118_], anIntArray4044[i_119_],
			 anIntArray4010[i], anIntArray4000[i],
			 anIntArray4007[i], anIntArray4016[i_120_],
			 anIntArray4016[i_121_], anIntArray4016[i_122_],
			 anIntArray4040[i_120_], anIntArray4040[i_121_],
			 anIntArray4040[i_122_], anIntArray4028[i_120_],
			 anIntArray4028[i_121_], anIntArray4028[i_122_],
			 aShortArray4004[i]);
	    }
	}
    }
    
    public static int method565(int i) {
	if (i < 2)
	    i = 2;
	else if (i > 126)
	    i = 126;
	return i;
    }
    
    public void method544(int i, int i_124_, int i_125_, int i_126_,
			  int i_127_, int i_128_, int i_129_) {
	anIntArray4027[0] = -1;
	if (anInt3829 != 2 && anInt3829 != 1)
	    this.method550();
	int i_130_ = Rasterizer.anInt3911;
	int i_131_ = Rasterizer.anInt3924;
	int i_132_ = anIntArray4036[i];
	int i_133_ = anIntArray4045[i];
	int i_134_ = anIntArray4036[i_124_];
	int i_135_ = anIntArray4045[i_124_];
	int i_136_ = anIntArray4036[i_125_];
	int i_137_ = anIntArray4045[i_125_];
	int i_138_ = anIntArray4036[i_126_];
	int i_139_ = anIntArray4045[i_126_];
	int i_140_ = i_128_ * i_138_ + i_129_ * i_139_ >> 16;
	for (int i_141_ = 0; i_141_ < anInt3830; i_141_++) {
	    int i_142_ = anIntArray3823[i_141_];
	    int i_143_ = anIntArray3833[i_141_];
	    int i_144_ = anIntArray3824[i_141_];
	    if (i_125_ != 0) {
		int i_145_ = i_143_ * i_136_ + i_142_ * i_137_ >> 16;
		i_143_ = i_143_ * i_137_ - i_142_ * i_136_ >> 16;
		i_142_ = i_145_;
	    }
	    if (i != 0) {
		int i_146_ = i_143_ * i_133_ - i_144_ * i_132_ >> 16;
		i_144_ = i_143_ * i_132_ + i_144_ * i_133_ >> 16;
		i_143_ = i_146_;
	    }
	    if (i_124_ != 0) {
		int i_147_ = i_144_ * i_134_ + i_142_ * i_135_ >> 16;
		i_144_ = i_144_ * i_135_ - i_142_ * i_134_ >> 16;
		i_142_ = i_147_;
	    }
	    i_142_ += i_127_;
	    i_143_ += i_128_;
	    i_144_ += i_129_;
	    int i_148_ = i_143_ * i_139_ - i_144_ * i_138_ >> 16;
	    i_144_ = i_143_ * i_138_ + i_144_ * i_139_ >> 16;
	    i_143_ = i_148_;
	    anIntArray4030[i_141_] = i_144_ - i_140_;
	    try {
			anIntArray4044[i_141_] = i_130_ + (i_142_ << 9) / i_144_;
			anIntArray4021[i_141_] = i_131_ + (i_143_ << 9) / i_144_;
		}catch (Exception e) {

		}
	    if (anInt4011 > 0) {
		anIntArray4016[i_141_] = i_142_;
		anIntArray4040[i_141_] = i_143_;
		anIntArray4028[i_141_] = i_144_;
	    }
	}
	try {
	    method567(false, false, 0);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public boolean method566(int i, int i_149_, int i_150_, int i_151_,
			     int i_152_, int i_153_, int i_154_, int i_155_) {
	if (i_149_ < i_150_ && i_149_ < i_151_ && i_149_ < i_152_)
	    return false;
	if (i_149_ > i_150_ && i_149_ > i_151_ && i_149_ > i_152_)
	    return false;
	if (i < i_153_ && i < i_154_ && i < i_155_)
	    return false;
	if (i > i_153_ && i > i_154_ && i > i_155_)
	    return false;
	return true;
    }
    
    public void method567(boolean bool, boolean bool_156_, int i) {
	if (anInt3826 < 1600) {
	    for (int i_157_ = 0; i_157_ < anInt3826; i_157_++)
		anIntArray4027[i_157_] = 0;
	    for (int i_158_ = 0; i_158_ < anInt3825; i_158_++) {
		if (anIntArray4007[i_158_] != -2) {
		    int i_159_ = anIntArray3999[i_158_];
		    int i_160_ = anIntArray4013[i_158_];
		    int i_161_ = anIntArray4001[i_158_];
		    int i_162_ = anIntArray4044[i_159_];
		    int i_163_ = anIntArray4044[i_160_];
		    int i_164_ = anIntArray4044[i_161_];
		    if (bool && (i_162_ == -5000 || i_163_ == -5000
				 || i_164_ == -5000)) {
			int i_165_ = anIntArray4016[i_159_];
			int i_166_ = anIntArray4016[i_160_];
			int i_167_ = anIntArray4016[i_161_];
			int i_168_ = anIntArray4040[i_159_];
			int i_169_ = anIntArray4040[i_160_];
			int i_170_ = anIntArray4040[i_161_];
			int i_171_ = anIntArray4028[i_159_];
			int i_172_ = anIntArray4028[i_160_];
			int i_173_ = anIntArray4028[i_161_];
			i_165_ -= i_166_;
			i_167_ -= i_166_;
			i_168_ -= i_169_;
			i_170_ -= i_169_;
			i_171_ -= i_172_;
			i_173_ -= i_172_;
			int i_174_ = i_168_ * i_173_ - i_171_ * i_170_;
			int i_175_ = i_171_ * i_167_ - i_165_ * i_173_;
			int i_176_ = i_165_ * i_170_ - i_168_ * i_167_;
			if (i_166_ * i_174_ + i_169_ * i_175_ + i_172_ * i_176_
			    > 0) {
			    aBooleanArray4023[i_158_] = true;
			    int i_177_ = ((anIntArray4030[i_159_]
					   + anIntArray4030[i_160_]
					   + anIntArray4030[i_161_]) / 3
					  + anInt3831);
			    anIntArrayArray4018[i_177_]
				[anIntArray4027[i_177_]++]
				= i_158_;
			}
		    } else {
			if (bool_156_ && method566(anInt4037, anInt4024,
						   anIntArray4021[i_159_],
						   anIntArray4021[i_160_],
						   anIntArray4021[i_161_],
						   i_162_, i_163_, i_164_)) {
			    anIntArray4038[anInt4019++] = i;
			    bool_156_ = false;
			}
			if (((i_162_ - i_163_) * (anIntArray4021[i_161_]
						  - anIntArray4021[i_160_])
			     - (anIntArray4021[i_159_]
				- anIntArray4021[i_160_]) * (i_164_ - i_163_))
			    > 0) {
			    aBooleanArray4023[i_158_] = false;
			    if (i_162_ < 0 || i_163_ < 0 || i_164_ < 0
				|| i_162_ > Rasterizer.anInt3918
				|| i_163_ > Rasterizer.anInt3918
				|| i_164_ > Rasterizer.anInt3918)
				aBooleanArray4033[i_158_] = true;
			    else
				aBooleanArray4033[i_158_] = false;
			    int i_178_ = ((anIntArray4030[i_159_]
					   + anIntArray4030[i_160_]
					   + anIntArray4030[i_161_]) / 3
					  + anInt3831);
			    anIntArrayArray4018[i_178_]
				[anIntArray4027[i_178_]++]
				= i_158_;
			}
		    }
		}
	    }
	    if (aByteArray3998 == null) {
		for (int i_179_ = anInt3826 - 1; i_179_ >= 0; i_179_--) {
		    int i_180_ = anIntArray4027[i_179_];
		    if (i_180_ > 0) {
			int[] is = anIntArrayArray4018[i_179_];
			for (int i_181_ = 0; i_181_ < i_180_; i_181_++)
			    method564(is[i_181_]);
		    }
		}
	    } else {
		for (int i_182_ = 0; i_182_ < 12; i_182_++) {
		    anIntArray4020[i_182_] = 0;
		    anIntArray4022[i_182_] = 0;
		}
		for (int i_183_ = anInt3826 - 1; i_183_ >= 0; i_183_--) {
		    int i_184_ = anIntArray4027[i_183_];
		    if (i_184_ > 0) {
			int[] is = anIntArrayArray4018[i_183_];
			for (int i_185_ = 0; i_185_ < i_184_; i_185_++) {
			    int i_186_ = is[i_185_];
			    byte i_187_ = aByteArray3998[i_186_];
			    int i_188_ = anIntArray4020[i_187_]++;
			    anIntArrayArray4032[i_187_][i_188_] = i_186_;
			    if (i_187_ < 10)
				anIntArray4022[i_187_] += i_183_;
			    else if (i_187_ == 10)
				anIntArray4029[i_188_] = i_183_;
			    else
				anIntArray4031[i_188_] = i_183_;
			}
		    }
		}
		int i_189_ = 0;
		if (anIntArray4020[1] > 0 || anIntArray4020[2] > 0)
		    i_189_ = ((anIntArray4022[1] + anIntArray4022[2])
			      / (anIntArray4020[1] + anIntArray4020[2]));
		int i_190_ = 0;
		if (anIntArray4020[3] > 0 || anIntArray4020[4] > 0)
		    i_190_ = ((anIntArray4022[3] + anIntArray4022[4])
			      / (anIntArray4020[3] + anIntArray4020[4]));
		int i_191_ = 0;
		if (anIntArray4020[6] > 0 || anIntArray4020[8] > 0)
		    i_191_ = ((anIntArray4022[6] + anIntArray4022[8])
			      / (anIntArray4020[6] + anIntArray4020[8]));
		int i_192_ = 0;
		int i_193_ = anIntArray4020[10];
		int[] is = anIntArrayArray4032[10];
		int[] is_194_ = anIntArray4029;
		if (i_192_ == i_193_) {
		    i_192_ = 0;
		    i_193_ = anIntArray4020[11];
		    is = anIntArrayArray4032[11];
		    is_194_ = anIntArray4031;
		}
		int i_195_;
		if (i_192_ < i_193_)
		    i_195_ = is_194_[i_192_];
		else
		    i_195_ = -1000;
		for (int i_196_ = 0; i_196_ < 10; i_196_++) {
		    while (i_196_ == 0) {
			if (i_195_ <= i_189_)
			    break;
			method564(is[i_192_++]);
			if (i_192_ == i_193_
			    && is != anIntArrayArray4032[11]) {
			    i_192_ = 0;
			    i_193_ = anIntArray4020[11];
			    is = anIntArrayArray4032[11];
			    is_194_ = anIntArray4031;
			}
			if (i_192_ < i_193_)
			    i_195_ = is_194_[i_192_];
			else
			    i_195_ = -1000;
		    }
		    while (i_196_ == 3) {
			if (i_195_ <= i_190_)
			    break;
			method564(is[i_192_++]);
			if (i_192_ == i_193_
			    && is != anIntArrayArray4032[11]) {
			    i_192_ = 0;
			    i_193_ = anIntArray4020[11];
			    is = anIntArrayArray4032[11];
			    is_194_ = anIntArray4031;
			}
			if (i_192_ < i_193_)
			    i_195_ = is_194_[i_192_];
			else
			    i_195_ = -1000;
		    }
		    while (i_196_ == 5 && i_195_ > i_191_) {
			method564(is[i_192_++]);
			if (i_192_ == i_193_
			    && is != anIntArrayArray4032[11]) {
			    i_192_ = 0;
			    i_193_ = anIntArray4020[11];
			    is = anIntArrayArray4032[11];
			    is_194_ = anIntArray4031;
			}
			if (i_192_ < i_193_)
			    i_195_ = is_194_[i_192_];
			else
			    i_195_ = -1000;
		    }
		    int i_197_ = anIntArray4020[i_196_];
		    int[] is_198_ = anIntArrayArray4032[i_196_];
		    for (int i_199_ = 0; i_199_ < i_197_; i_199_++)
			method564(is_198_[i_199_]);
		}
		while (i_195_ != -1000) {
		    method564(is[i_192_++]);
		    if (i_192_ == i_193_ && is != anIntArrayArray4032[11]) {
			i_192_ = 0;
			is = anIntArrayArray4032[11];
			i_193_ = anIntArray4020[11];
			is_194_ = anIntArray4031;
		    }
		    if (i_192_ < i_193_)
			i_195_ = is_194_[i_192_];
		    else
			i_195_ = -1000;
		}
	    }
	}
    }
    
    public Class37_Sub4_Sub7_Sub6 method548
	(int[][] is, int i, int i_200_, int i_201_, boolean bool, int i_202_) {
	this.method555();
	int i_203_ = i - anInt3835;
	int i_204_ = i + anInt3835;
	int i_205_ = i_201_ - anInt3835;
	int i_206_ = i_201_ + anInt3835;
	if (i_203_ < 0 || i_204_ + 128 >> 7 >= is.length || i_205_ < 0
	    || i_206_ + 128 >> 7 >= is[0].length)
	    return this;
	i_203_ >>= 7;
	i_204_ = i_204_ + 127 >> 7;
	i_205_ >>= 7;
	i_206_ = i_206_ + 127 >> 7;
	if (is[i_203_][i_205_] == i_200_ && is[i_204_][i_205_] == i_200_
	    && is[i_203_][i_206_] == i_200_ && is[i_204_][i_206_] == i_200_)
	    return this;
	Class37_Sub4_Sub7_Sub6_Sub1 class37_sub4_sub7_sub6_sub1_207_;
	if (bool) {
	    class37_sub4_sub7_sub6_sub1_207_
		= new Class37_Sub4_Sub7_Sub6_Sub1();
	    class37_sub4_sub7_sub6_sub1_207_.anInt3830 = anInt3830;
	    class37_sub4_sub7_sub6_sub1_207_.anInt3825 = anInt3825;
	    class37_sub4_sub7_sub6_sub1_207_.anInt4011 = anInt4011;
	    class37_sub4_sub7_sub6_sub1_207_.anIntArray3823 = anIntArray3823;
	    class37_sub4_sub7_sub6_sub1_207_.anIntArray3824 = anIntArray3824;
	    class37_sub4_sub7_sub6_sub1_207_.anIntArray3999 = anIntArray3999;
	    class37_sub4_sub7_sub6_sub1_207_.anIntArray4013 = anIntArray4013;
	    class37_sub4_sub7_sub6_sub1_207_.anIntArray4001 = anIntArray4001;
	    class37_sub4_sub7_sub6_sub1_207_.anIntArray4010 = anIntArray4010;
	    class37_sub4_sub7_sub6_sub1_207_.anIntArray4000 = anIntArray4000;
	    class37_sub4_sub7_sub6_sub1_207_.anIntArray4007 = anIntArray4007;
	    class37_sub4_sub7_sub6_sub1_207_.aByteArray3998 = aByteArray3998;
	    class37_sub4_sub7_sub6_sub1_207_.aByteArray4006 = aByteArray4006;
	    class37_sub4_sub7_sub6_sub1_207_.aByteArray4003 = aByteArray4003;
	    class37_sub4_sub7_sub6_sub1_207_.aShortArray4004 = aShortArray4004;
	    class37_sub4_sub7_sub6_sub1_207_.aByte4005 = aByte4005;
	    class37_sub4_sub7_sub6_sub1_207_.anIntArray4008 = anIntArray4008;
	    class37_sub4_sub7_sub6_sub1_207_.anIntArray4009 = anIntArray4009;
	    class37_sub4_sub7_sub6_sub1_207_.anIntArray4002 = anIntArray4002;
	    class37_sub4_sub7_sub6_sub1_207_.anIntArrayArray3827
		= anIntArrayArray3827;
	    class37_sub4_sub7_sub6_sub1_207_.anIntArrayArray3822
		= anIntArrayArray3822;
	    class37_sub4_sub7_sub6_sub1_207_.aBoolean3836 = aBoolean3836;
	    class37_sub4_sub7_sub6_sub1_207_.anIntArray3833
		= new int[class37_sub4_sub7_sub6_sub1_207_.anInt3830];
	} else
	    class37_sub4_sub7_sub6_sub1_207_ = this;
	if (i_202_ == 0) {
	    for (int i_208_ = 0;
		 i_208_ < class37_sub4_sub7_sub6_sub1_207_.anInt3830;
		 i_208_++) {
		int i_209_ = anIntArray3823[i_208_] + i;
		int i_210_ = anIntArray3824[i_208_] + i_201_;
		int i_211_ = i_209_ & 0x7f;
		int i_212_ = i_210_ & 0x7f;
		int i_213_ = i_209_ >> 7;
		int i_214_ = i_210_ >> 7;
		int i_215_ = ((is[i_213_][i_214_] * (128 - i_211_)
			       + is[i_213_ + 1][i_214_] * i_211_)
			      >> 7);
		int i_216_ = ((is[i_213_][i_214_ + 1] * (128 - i_211_)
			       + is[i_213_ + 1][i_214_ + 1] * i_211_)
			      >> 7);
		int i_217_ = i_215_ * (128 - i_212_) + i_216_ * i_212_ >> 7;
		class37_sub4_sub7_sub6_sub1_207_.anIntArray3833[i_208_]
		    = anIntArray3833[i_208_] + i_217_ - i_200_;
	    }
	} else {
	    for (int i_218_ = 0;
		 i_218_ < class37_sub4_sub7_sub6_sub1_207_.anInt3830;
		 i_218_++) {
		int i_219_ = (-anIntArray3833[i_218_] << 16) / anInt2627;
		if (i_219_ < i_202_) {
		    int i_220_ = anIntArray3823[i_218_] + i;
		    int i_221_ = anIntArray3824[i_218_] + i_201_;
		    int i_222_ = i_220_ & 0x7f;
		    int i_223_ = i_221_ & 0x7f;
		    int i_224_ = i_220_ >> 7;
		    int i_225_ = i_221_ >> 7;
		    int i_226_ = ((is[i_224_][i_225_] * (128 - i_222_)
				   + is[i_224_ + 1][i_225_] * i_222_)
				  >> 7);
		    int i_227_ = ((is[i_224_][i_225_ + 1] * (128 - i_222_)
				   + is[i_224_ + 1][i_225_ + 1] * i_222_)
				  >> 7);
		    int i_228_
			= i_226_ * (128 - i_223_) + i_227_ * i_223_ >> 7;
		    class37_sub4_sub7_sub6_sub1_207_.anIntArray3833[i_218_]
			= (anIntArray3833[i_218_]
			   + (i_228_ - i_200_) * (i_202_ - i_219_) / i_202_);
		}
	    }
	}
	class37_sub4_sub7_sub6_sub1_207_.anInt3829 = 0;
	return class37_sub4_sub7_sub6_sub1_207_;
    }
    
    public void method568(int i) {
	int i_229_ = Rasterizer.anInt3911;
	int i_230_ = Rasterizer.anInt3924;
	int i_231_ = 0;
	int i_232_ = anIntArray3999[i];
	int i_233_ = anIntArray4013[i];
	int i_234_ = anIntArray4001[i];
	int i_235_ = anIntArray4028[i_232_];
	int i_236_ = anIntArray4028[i_233_];
	int i_237_ = anIntArray4028[i_234_];
	if (aByteArray4006 == null)
	    Rasterizer.anInt3925 = 0;
	else
	    Rasterizer.anInt3925 = aByteArray4006[i] & 0xff;
	if (i_235_ >= 50) {
	    anIntArray4043[i_231_] = anIntArray4044[i_232_];
	    anIntArray4041[i_231_] = anIntArray4021[i_232_];
	    anIntArray4026[i_231_++] = anIntArray4010[i];
	} else {
	    int i_238_ = anIntArray4016[i_232_];
	    int i_239_ = anIntArray4040[i_232_];
	    int i_240_ = anIntArray4010[i];
	    if (i_237_ >= 50) {
		int i_241_ = (50 - i_235_) * anIntArray4046[i_237_ - i_235_];
		anIntArray4043[i_231_]
		    = (i_229_
		       + (i_238_ + ((anIntArray4016[i_234_] - i_238_) * i_241_
				    >> 16)
			  << 9) / 50);
		anIntArray4041[i_231_]
		    = (i_230_
		       + (i_239_ + ((anIntArray4040[i_234_] - i_239_) * i_241_
				    >> 16)
			  << 9) / 50);
		anIntArray4026[i_231_++]
		    = i_240_ + ((anIntArray4007[i] - i_240_) * i_241_ >> 16);
	    }
	    if (i_236_ >= 50) {
		int i_242_ = (50 - i_235_) * anIntArray4046[i_236_ - i_235_];
		anIntArray4043[i_231_]
		    = (i_229_
		       + (i_238_ + ((anIntArray4016[i_233_] - i_238_) * i_242_
				    >> 16)
			  << 9) / 50);
		anIntArray4041[i_231_]
		    = (i_230_
		       + (i_239_ + ((anIntArray4040[i_233_] - i_239_) * i_242_
				    >> 16)
			  << 9) / 50);
		anIntArray4026[i_231_++]
		    = i_240_ + ((anIntArray4000[i] - i_240_) * i_242_ >> 16);
	    }
	}
	if (i_236_ >= 50) {
	    anIntArray4043[i_231_] = anIntArray4044[i_233_];
	    anIntArray4041[i_231_] = anIntArray4021[i_233_];
	    anIntArray4026[i_231_++] = anIntArray4000[i];
	} else {
	    int i_243_ = anIntArray4016[i_233_];
	    int i_244_ = anIntArray4040[i_233_];
	    int i_245_ = anIntArray4000[i];
	    if (i_235_ >= 50) {
		int i_246_ = (50 - i_236_) * anIntArray4046[i_235_ - i_236_];
		anIntArray4043[i_231_]
		    = (i_229_
		       + (i_243_ + ((anIntArray4016[i_232_] - i_243_) * i_246_
				    >> 16)
			  << 9) / 50);
		anIntArray4041[i_231_]
		    = (i_230_
		       + (i_244_ + ((anIntArray4040[i_232_] - i_244_) * i_246_
				    >> 16)
			  << 9) / 50);
		anIntArray4026[i_231_++]
		    = i_245_ + ((anIntArray4010[i] - i_245_) * i_246_ >> 16);
	    }
	    if (i_237_ >= 50) {
		int i_247_ = (50 - i_236_) * anIntArray4046[i_237_ - i_236_];
		anIntArray4043[i_231_]
		    = (i_229_
		       + (i_243_ + ((anIntArray4016[i_234_] - i_243_) * i_247_
				    >> 16)
			  << 9) / 50);
		anIntArray4041[i_231_]
		    = (i_230_
		       + (i_244_ + ((anIntArray4040[i_234_] - i_244_) * i_247_
				    >> 16)
			  << 9) / 50);
		anIntArray4026[i_231_++]
		    = i_245_ + ((anIntArray4007[i] - i_245_) * i_247_ >> 16);
	    }
	}
	if (i_237_ >= 50) {
	    anIntArray4043[i_231_] = anIntArray4044[i_234_];
	    anIntArray4041[i_231_] = anIntArray4021[i_234_];
	    anIntArray4026[i_231_++] = anIntArray4007[i];
	} else {
	    int i_248_ = anIntArray4016[i_234_];
	    int i_249_ = anIntArray4040[i_234_];
	    int i_250_ = anIntArray4007[i];
	    if (i_236_ >= 50) {
		int i_251_ = (50 - i_237_) * anIntArray4046[i_236_ - i_237_];
		anIntArray4043[i_231_]
		    = (i_229_
		       + (i_248_ + ((anIntArray4016[i_233_] - i_248_) * i_251_
				    >> 16)
			  << 9) / 50);
		anIntArray4041[i_231_]
		    = (i_230_
		       + (i_249_ + ((anIntArray4040[i_233_] - i_249_) * i_251_
				    >> 16)
			  << 9) / 50);
		anIntArray4026[i_231_++]
		    = i_250_ + ((anIntArray4000[i] - i_250_) * i_251_ >> 16);
	    }
	    if (i_235_ >= 50) {
		int i_252_ = (50 - i_237_) * anIntArray4046[i_235_ - i_237_];
		anIntArray4043[i_231_]
		    = (i_229_
		       + (i_248_ + ((anIntArray4016[i_232_] - i_248_) * i_252_
				    >> 16)
			  << 9) / 50);
		anIntArray4041[i_231_]
		    = (i_230_
		       + (i_249_ + ((anIntArray4040[i_232_] - i_249_) * i_252_
				    >> 16)
			  << 9) / 50);
		anIntArray4026[i_231_++]
		    = i_250_ + ((anIntArray4010[i] - i_250_) * i_252_ >> 16);
	    }
	}
	int i_253_ = anIntArray4043[0];
	int i_254_ = anIntArray4043[1];
	int i_255_ = anIntArray4043[2];
	int i_256_ = anIntArray4041[0];
	int i_257_ = anIntArray4041[1];
	int i_258_ = anIntArray4041[2];
	Rasterizer.aBoolean3922 = false;
	if (i_231_ == 3) {
	    if (i_253_ < 0 || i_254_ < 0 || i_255_ < 0
		|| i_253_ > Rasterizer.anInt3918
		|| i_254_ > Rasterizer.anInt3918
		|| i_255_ > Rasterizer.anInt3918)
		Rasterizer.aBoolean3922 = true;
	    if (aShortArray4004 == null || aShortArray4004[i] == -1) {
		if (anIntArray4007[i] == -1)
		    Rasterizer.method670(i_256_, i_257_, i_258_,
						     i_253_, i_254_, i_255_,
						     (anIntArray4025
						      [anIntArray4010[i]]));
		else
		    Rasterizer.method656(i_256_, i_257_, i_258_,
						     i_253_, i_254_, i_255_,
						     anIntArray4026[0],
						     anIntArray4026[1],
						     anIntArray4026[2]);
	    } else {
		int i_259_;
		int i_260_;
		int i_261_;
		if (aByteArray4003 != null && aByteArray4003[i] != -1) {
		    int i_262_ = aByteArray4003[i] & 0xff;
		    i_259_ = anIntArray4008[i_262_];
		    i_260_ = anIntArray4009[i_262_];
		    i_261_ = anIntArray4002[i_262_];
		} else {
		    i_259_ = i_232_;
		    i_260_ = i_233_;
		    i_261_ = i_234_;
		}
		if (anIntArray4007[i] == -1)
		    Rasterizer.method672
			(i_256_, i_257_, i_258_, i_253_, i_254_, i_255_,
			 anIntArray4010[i], anIntArray4010[i],
			 anIntArray4010[i], anIntArray4016[i_259_],
			 anIntArray4016[i_260_], anIntArray4016[i_261_],
			 anIntArray4040[i_259_], anIntArray4040[i_260_],
			 anIntArray4040[i_261_], anIntArray4028[i_259_],
			 anIntArray4028[i_260_], anIntArray4028[i_261_],
			 aShortArray4004[i]);
		else
		    Rasterizer.method672
			(i_256_, i_257_, i_258_, i_253_, i_254_, i_255_,
			 anIntArray4026[0], anIntArray4026[1],
			 anIntArray4026[2], anIntArray4016[i_259_],
			 anIntArray4016[i_260_], anIntArray4016[i_261_],
			 anIntArray4040[i_259_], anIntArray4040[i_260_],
			 anIntArray4040[i_261_], anIntArray4028[i_259_],
			 anIntArray4028[i_260_], anIntArray4028[i_261_],
			 aShortArray4004[i]);
	    }
	}
	if (i_231_ == 4) {
	    if (i_253_ < 0 || i_254_ < 0 || i_255_ < 0
		|| i_253_ > Rasterizer.anInt3918
		|| i_254_ > Rasterizer.anInt3918
		|| i_255_ > Rasterizer.anInt3918
		|| anIntArray4043[3] < 0
		|| anIntArray4043[3] > Rasterizer.anInt3918)
		Rasterizer.aBoolean3922 = true;
	    if (aShortArray4004 == null || aShortArray4004[i] == -1) {
		if (anIntArray4007[i] == -1) {
		    int i_263_ = anIntArray4025[anIntArray4010[i]];
		    Rasterizer.method670(i_256_, i_257_, i_258_,
						     i_253_, i_254_, i_255_,
						     i_263_);
		    Rasterizer.method670(i_256_, i_258_,
						     anIntArray4041[3], i_253_,
						     i_255_, anIntArray4043[3],
						     i_263_);
		} else {
		    Rasterizer.method656(i_256_, i_257_, i_258_,
						     i_253_, i_254_, i_255_,
						     anIntArray4026[0],
						     anIntArray4026[1],
						     anIntArray4026[2]);
		    Rasterizer.method656(i_256_, i_258_,
						     anIntArray4041[3], i_253_,
						     i_255_, anIntArray4043[3],
						     anIntArray4026[0],
						     anIntArray4026[2],
						     anIntArray4026[3]);
		}
	    } else {
		int i_264_;
		int i_265_;
		int i_266_;
		if (aByteArray4003 != null && aByteArray4003[i] != -1) {
		    int i_267_ = aByteArray4003[i] & 0xff;
		    i_264_ = anIntArray4008[i_267_];
		    i_265_ = anIntArray4009[i_267_];
		    i_266_ = anIntArray4002[i_267_];
		} else {
		    i_264_ = i_232_;
		    i_265_ = i_233_;
		    i_266_ = i_234_;
		}
		short i_268_ = aShortArray4004[i];
		if (anIntArray4007[i] == -1) {
		    Rasterizer.method672
			(i_256_, i_257_, i_258_, i_253_, i_254_, i_255_,
			 anIntArray4010[i], anIntArray4010[i],
			 anIntArray4010[i], anIntArray4016[i_264_],
			 anIntArray4016[i_265_], anIntArray4016[i_266_],
			 anIntArray4040[i_264_], anIntArray4040[i_265_],
			 anIntArray4040[i_266_], anIntArray4028[i_264_],
			 anIntArray4028[i_265_], anIntArray4028[i_266_],
			 i_268_);
		    Rasterizer.method672
			(i_256_, i_258_, anIntArray4041[3], i_253_, i_255_,
			 anIntArray4043[3], anIntArray4010[i],
			 anIntArray4010[i], anIntArray4010[i],
			 anIntArray4016[i_264_], anIntArray4016[i_265_],
			 anIntArray4016[i_266_], anIntArray4040[i_264_],
			 anIntArray4040[i_265_], anIntArray4040[i_266_],
			 anIntArray4028[i_264_], anIntArray4028[i_265_],
			 anIntArray4028[i_266_], i_268_);
		} else {
		    Rasterizer.method672
			(i_256_, i_257_, i_258_, i_253_, i_254_, i_255_,
			 anIntArray4026[0], anIntArray4026[1],
			 anIntArray4026[2], anIntArray4016[i_264_],
			 anIntArray4016[i_265_], anIntArray4016[i_266_],
			 anIntArray4040[i_264_], anIntArray4040[i_265_],
			 anIntArray4040[i_266_], anIntArray4028[i_264_],
			 anIntArray4028[i_265_], anIntArray4028[i_266_],
			 i_268_);
		    Rasterizer.method672
			(i_256_, i_258_, anIntArray4041[3], i_253_, i_255_,
			 anIntArray4043[3], anIntArray4026[0],
			 anIntArray4026[2], anIntArray4026[3],
			 anIntArray4016[i_264_], anIntArray4016[i_265_],
			 anIntArray4016[i_266_], anIntArray4040[i_264_],
			 anIntArray4040[i_265_], anIntArray4040[i_266_],
			 anIntArray4028[i_264_], anIntArray4028[i_265_],
			 anIntArray4028[i_266_], i_268_);
		}
	    }
	}
    }
    
    public Class37_Sub4_Sub7_Sub6_Sub1() {
	/* empty */
    }
    
    public void method547(Class37_Sub4_Sub16 class37_sub4_sub16, int i) {
	if (anIntArrayArray3827 != null && i != -1) {
	    Class61 class61 = class37_sub4_sub16.aClass61Array2870[i];
	    Class37_Sub25 class37_sub25 = class61.aClass37_Sub25_1168;
	    anInt4017 = 0;
	    anInt4034 = 0;
	    anInt4042 = 0;
	    for (int i_269_ = 0; i_269_ < class61.anInt1167; i_269_++) {
		int i_270_ = class61.anIntArray1170[i_269_];
		method563(class37_sub25.anIntArray2277[i_270_],
			  class37_sub25.anIntArrayArray2283[i_270_],
			  class61.anIntArray1166[i_269_],
			  class61.anIntArray1161[i_269_],
			  class61.anIntArray1169[i_269_]);
	    }
	    anInt3829 = 0;
	}
    }
    
    public Class37_Sub4_Sub7_Sub6_Sub1
	(Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4, int i, int i_271_,
	 int i_272_, int i_273_, int i_274_) {
	class37_sub4_sub7_sub4.method538();
	class37_sub4_sub7_sub4.method537();
	anInt3830 = class37_sub4_sub7_sub4.anInt3802;
	anIntArray3823 = class37_sub4_sub7_sub4.anIntArray3772;
	anIntArray3833 = class37_sub4_sub7_sub4.anIntArray3784;
	anIntArray3824 = class37_sub4_sub7_sub4.anIntArray3765;
	anInt3825 = class37_sub4_sub7_sub4.anInt3775;
	anIntArray3999 = class37_sub4_sub7_sub4.anIntArray3763;
	anIntArray4013 = class37_sub4_sub7_sub4.anIntArray3794;
	anIntArray4001 = class37_sub4_sub7_sub4.anIntArray3803;
	aByteArray3998 = class37_sub4_sub7_sub4.aByteArray3774;
	aByteArray4006 = class37_sub4_sub7_sub4.aByteArray3777;
	aByte4005 = class37_sub4_sub7_sub4.aByte3788;
	anIntArrayArray3827 = class37_sub4_sub7_sub4.anIntArrayArray3801;
	anIntArrayArray3822 = class37_sub4_sub7_sub4.anIntArrayArray3781;
	int i_275_
	    = (int) Math.sqrt((double) (i_272_ * i_272_ + i_273_ * i_273_
					+ i_274_ * i_274_));
	int i_276_ = i_271_ * i_275_ >> 8;
	anIntArray4010 = new int[anInt3825];
	anIntArray4000 = new int[anInt3825];
	anIntArray4007 = new int[anInt3825];
	if (class37_sub4_sub7_sub4.aShortArray3767 != null) {
	    aShortArray4004 = new short[anInt3825];
	    for (int i_277_ = 0; i_277_ < anInt3825; i_277_++) {
		short i_278_ = class37_sub4_sub7_sub4.aShortArray3767[i_277_];
		if (i_278_ != -1 && Rasterizer
					.anInterface3_3926
					.method12(i_278_, -108))
		    aShortArray4004[i_277_] = i_278_;
		else
		    aShortArray4004[i_277_] = (short) -1;
	    }
	} else
	    aShortArray4004 = null;
	if (class37_sub4_sub7_sub4.anInt3790 > 0
	    && class37_sub4_sub7_sub4.aByteArray3771 != null) {
	    int[] is = new int[class37_sub4_sub7_sub4.anInt3790];
	    for (int i_279_ = 0; i_279_ < anInt3825; i_279_++) {
		if (class37_sub4_sub7_sub4.aByteArray3771[i_279_] != -1)
		    is[class37_sub4_sub7_sub4.aByteArray3771[i_279_] & 0xff]++;
	    }
	    anInt4011 = 0;
	    for (int i_280_ = 0; i_280_ < class37_sub4_sub7_sub4.anInt3790;
		 i_280_++) {
		if (is[i_280_] > 0
		    && class37_sub4_sub7_sub4.aByteArray3783[i_280_] == 0)
		    anInt4011++;
	    }
	    anIntArray4008 = new int[anInt4011];
	    anIntArray4009 = new int[anInt4011];
	    anIntArray4002 = new int[anInt4011];
	    int i_281_ = 0;
	    for (int i_282_ = 0; i_282_ < class37_sub4_sub7_sub4.anInt3790;
		 i_282_++) {
		if (is[i_282_] > 0
		    && class37_sub4_sub7_sub4.aByteArray3783[i_282_] == 0) {
		    anIntArray4008[i_281_]
			= (class37_sub4_sub7_sub4.aShortArray3791[i_282_]
			   & 0xffff);
		    anIntArray4009[i_281_]
			= (class37_sub4_sub7_sub4.aShortArray3768[i_282_]
			   & 0xffff);
		    anIntArray4002[i_281_]
			= (class37_sub4_sub7_sub4.aShortArray3757[i_282_]
			   & 0xffff);
		    is[i_282_] = i_281_++;
		} else
		    is[i_282_] = -1;
	    }
	    aByteArray4003 = new byte[anInt3825];
	    for (int i_283_ = 0; i_283_ < anInt3825; i_283_++) {
		if (class37_sub4_sub7_sub4.aByteArray3771[i_283_] != -1) {
		    aByteArray4003[i_283_]
			= (byte) is[(class37_sub4_sub7_sub4.aByteArray3771
				     [i_283_]) & 0xff];
		    if (aByteArray4003[i_283_] == -1
			&& aShortArray4004 != null)
			aShortArray4004[i_283_] = (short) -1;
		} else
		    aByteArray4003[i_283_] = (byte) -1;
	    }
	}
	for (int i_284_ = 0; i_284_ < anInt3825; i_284_++) {
	    byte i_285_;
	    if (class37_sub4_sub7_sub4.aByteArray3782 == null)
		i_285_ = (byte) 0;
	    else
		i_285_ = class37_sub4_sub7_sub4.aByteArray3782[i_284_];
	    byte i_286_;
	    if (class37_sub4_sub7_sub4.aByteArray3777 == null)
		i_286_ = (byte) 0;
	    else
		i_286_ = class37_sub4_sub7_sub4.aByteArray3777[i_284_];
	    short i_287_;
	    if (aShortArray4004 == null)
		i_287_ = (short) -1;
	    else
		i_287_ = aShortArray4004[i_284_];
	    if (i_286_ == -2)
		i_285_ = (byte) 3;
	    if (i_286_ == -1)
		i_285_ = (byte) 2;
	    if (i_287_ == -1) {
		if (i_285_ == 0) {
		    int i_288_
			= (class37_sub4_sub7_sub4.aShortArray3773[i_284_]
			   & 0xffff);
		    Class89 class89;
		    if (class37_sub4_sub7_sub4.aClass89Array3756 != null
			&& (class37_sub4_sub7_sub4.aClass89Array3756
			    [anIntArray3999[i_284_]]) != null)
			class89 = (class37_sub4_sub7_sub4.aClass89Array3756
				   [anIntArray3999[i_284_]]);
		    else
			class89 = (class37_sub4_sub7_sub4.aClass89Array3759
				   [anIntArray3999[i_284_]]);
		    int i_289_ = i + ((i_272_ * class89.anInt1617
				       + i_273_ * class89.anInt1614
				       + i_274_ * class89.anInt1611)
				      / (i_276_ * class89.anInt1621));
		    anIntArray4010[i_284_] = method562(i_288_, i_289_);
		    if (class37_sub4_sub7_sub4.aClass89Array3756 != null
			&& (class37_sub4_sub7_sub4.aClass89Array3756
			    [anIntArray4013[i_284_]]) != null)
			class89 = (class37_sub4_sub7_sub4.aClass89Array3756
				   [anIntArray4013[i_284_]]);
		    else
			class89 = (class37_sub4_sub7_sub4.aClass89Array3759
				   [anIntArray4013[i_284_]]);
		    i_289_ = i + ((i_272_ * class89.anInt1617
				   + i_273_ * class89.anInt1614
				   + i_274_ * class89.anInt1611)
				  / (i_276_ * class89.anInt1621));
		    anIntArray4000[i_284_] = method562(i_288_, i_289_);
		    if (class37_sub4_sub7_sub4.aClass89Array3756 != null
			&& (class37_sub4_sub7_sub4.aClass89Array3756
			    [anIntArray4001[i_284_]]) != null)
			class89 = (class37_sub4_sub7_sub4.aClass89Array3756
				   [anIntArray4001[i_284_]]);
		    else
			class89 = (class37_sub4_sub7_sub4.aClass89Array3759
				   [anIntArray4001[i_284_]]);
		    i_289_ = i + ((i_272_ * class89.anInt1617
				   + i_273_ * class89.anInt1614
				   + i_274_ * class89.anInt1611)
				  / (i_276_ * class89.anInt1621));
		    anIntArray4007[i_284_] = method562(i_288_, i_289_);
		} else if (i_285_ == 1) {
		    Class26 class26
			= class37_sub4_sub7_sub4.aClass26Array3769[i_284_];
		    int i_290_ = i + ((i_272_ * class26.anInt655
				       + i_273_ * class26.anInt656
				       + i_274_ * class26.anInt648)
				      / (i_276_ + i_276_ / 2));
		    anIntArray4010[i_284_]
			= method562((class37_sub4_sub7_sub4.aShortArray3773
				     [i_284_]) & 0xffff,
				    i_290_);
		    anIntArray4007[i_284_] = -1;
		} else if (i_285_ == 3) {
		    anIntArray4010[i_284_] = 128;
		    anIntArray4007[i_284_] = -1;
		} else
		    anIntArray4007[i_284_] = -2;
	    } else if (i_285_ == 0) {
		Class89 class89;
		if (class37_sub4_sub7_sub4.aClass89Array3756 != null
		    && (class37_sub4_sub7_sub4.aClass89Array3756
			[anIntArray3999[i_284_]]) != null)
		    class89 = (class37_sub4_sub7_sub4.aClass89Array3756
			       [anIntArray3999[i_284_]]);
		else
		    class89 = (class37_sub4_sub7_sub4.aClass89Array3759
			       [anIntArray3999[i_284_]]);
		int i_291_ = i + ((i_272_ * class89.anInt1617
				   + i_273_ * class89.anInt1614
				   + i_274_ * class89.anInt1611)
				  / (i_276_ * class89.anInt1621));
		anIntArray4010[i_284_] = method565(i_291_);
		if (class37_sub4_sub7_sub4.aClass89Array3756 != null
		    && (class37_sub4_sub7_sub4.aClass89Array3756
			[anIntArray4013[i_284_]]) != null)
		    class89 = (class37_sub4_sub7_sub4.aClass89Array3756
			       [anIntArray4013[i_284_]]);
		else
		    class89 = (class37_sub4_sub7_sub4.aClass89Array3759
			       [anIntArray4013[i_284_]]);
		i_291_ = i + ((i_272_ * class89.anInt1617
			       + i_273_ * class89.anInt1614
			       + i_274_ * class89.anInt1611)
			      / (i_276_ * class89.anInt1621));
		anIntArray4000[i_284_] = method565(i_291_);
		if (class37_sub4_sub7_sub4.aClass89Array3756 != null
		    && (class37_sub4_sub7_sub4.aClass89Array3756
			[anIntArray4001[i_284_]]) != null)
		    class89 = (class37_sub4_sub7_sub4.aClass89Array3756
			       [anIntArray4001[i_284_]]);
		else
		    class89 = (class37_sub4_sub7_sub4.aClass89Array3759
			       [anIntArray4001[i_284_]]);
		i_291_ = i + ((i_272_ * class89.anInt1617
			       + i_273_ * class89.anInt1614
			       + i_274_ * class89.anInt1611)
			      / (i_276_ * class89.anInt1621));
		anIntArray4007[i_284_] = method565(i_291_);
	    } else if (i_285_ == 1) {
		Class26 class26
		    = class37_sub4_sub7_sub4.aClass26Array3769[i_284_];
		int i_292_ = i + ((i_272_ * class26.anInt655
				   + i_273_ * class26.anInt656
				   + i_274_ * class26.anInt648)
				  / (i_276_ + i_276_ / 2));
		anIntArray4010[i_284_] = method565(i_292_);
		anIntArray4007[i_284_] = -1;
	    } else
		anIntArray4007[i_284_] = -2;
	}
    }
    
    public Class37_Sub4_Sub7_Sub6_Sub1
	(Class37_Sub4_Sub7_Sub6_Sub1[] class37_sub4_sub7_sub6_sub1s, int i) {
	boolean bool = false;
	boolean bool_293_ = false;
	boolean bool_294_ = false;
	boolean bool_295_ = false;
	anInt3830 = 0;
	anInt3825 = 0;
	anInt4011 = 0;
	aByte4005 = (byte) -1;
	for (int i_296_ = 0; i_296_ < i; i_296_++) {
	    Class37_Sub4_Sub7_Sub6_Sub1 class37_sub4_sub7_sub6_sub1_297_
		= class37_sub4_sub7_sub6_sub1s[i_296_];
	    if (class37_sub4_sub7_sub6_sub1_297_ != null) {
		anInt3830 += class37_sub4_sub7_sub6_sub1_297_.anInt3830;
		anInt3825 += class37_sub4_sub7_sub6_sub1_297_.anInt3825;
		anInt4011 += class37_sub4_sub7_sub6_sub1_297_.anInt4011;
		if (class37_sub4_sub7_sub6_sub1_297_.aByteArray3998 != null)
		    bool = true;
		else {
		    if (aByte4005 == -1)
			aByte4005 = class37_sub4_sub7_sub6_sub1_297_.aByte4005;
		    if (aByte4005
			!= class37_sub4_sub7_sub6_sub1_297_.aByte4005)
			bool = true;
		}
		bool_293_ = bool_293_ | (class37_sub4_sub7_sub6_sub1_297_
					 .aByteArray4006) != null;
		bool_294_ = bool_294_ | (class37_sub4_sub7_sub6_sub1_297_
					 .aShortArray4004) != null;
		bool_295_ = bool_295_ | (class37_sub4_sub7_sub6_sub1_297_
					 .aByteArray4003) != null;
	    }
	}
	anIntArray3823 = new int[anInt3830];
	anIntArray3833 = new int[anInt3830];
	anIntArray3824 = new int[anInt3830];
	anIntArray3999 = new int[anInt3825];
	anIntArray4013 = new int[anInt3825];
	anIntArray4001 = new int[anInt3825];
	anIntArray4010 = new int[anInt3825];
	anIntArray4000 = new int[anInt3825];
	anIntArray4007 = new int[anInt3825];
	if (bool)
	    aByteArray3998 = new byte[anInt3825];
	if (bool_293_)
	    aByteArray4006 = new byte[anInt3825];
	if (bool_294_)
	    aShortArray4004 = new short[anInt3825];
	if (bool_295_)
	    aByteArray4003 = new byte[anInt3825];
	if (anInt4011 > 0) {
	    anIntArray4008 = new int[anInt4011];
	    anIntArray4009 = new int[anInt4011];
	    anIntArray4002 = new int[anInt4011];
	}
	anInt3830 = 0;
	anInt3825 = 0;
	anInt4011 = 0;
	for (int i_298_ = 0; i_298_ < i; i_298_++) {
	    Class37_Sub4_Sub7_Sub6_Sub1 class37_sub4_sub7_sub6_sub1_299_
		= class37_sub4_sub7_sub6_sub1s[i_298_];
	    if (class37_sub4_sub7_sub6_sub1_299_ != null) {
		for (int i_300_ = 0;
		     i_300_ < class37_sub4_sub7_sub6_sub1_299_.anInt3825;
		     i_300_++) {
		    anIntArray3999[anInt3825]
			= (class37_sub4_sub7_sub6_sub1_299_.anIntArray3999
			   [i_300_]) + anInt3830;
		    anIntArray4013[anInt3825]
			= (class37_sub4_sub7_sub6_sub1_299_.anIntArray4013
			   [i_300_]) + anInt3830;
		    anIntArray4001[anInt3825]
			= (class37_sub4_sub7_sub6_sub1_299_.anIntArray4001
			   [i_300_]) + anInt3830;
		    anIntArray4010[anInt3825]
			= (class37_sub4_sub7_sub6_sub1_299_.anIntArray4010
			   [i_300_]);
		    anIntArray4000[anInt3825]
			= (class37_sub4_sub7_sub6_sub1_299_.anIntArray4000
			   [i_300_]);
		    anIntArray4007[anInt3825]
			= (class37_sub4_sub7_sub6_sub1_299_.anIntArray4007
			   [i_300_]);
		    if (bool) {
			if (class37_sub4_sub7_sub6_sub1_299_.aByteArray3998
			    != null)
			    aByteArray3998[anInt3825]
				= (class37_sub4_sub7_sub6_sub1_299_
				   .aByteArray3998[i_300_]);
			else
			    aByteArray3998[anInt3825]
				= class37_sub4_sub7_sub6_sub1_299_.aByte4005;
		    }
		    if (bool_293_
			&& (class37_sub4_sub7_sub6_sub1_299_.aByteArray4006
			    != null))
			aByteArray4006[anInt3825]
			    = (class37_sub4_sub7_sub6_sub1_299_.aByteArray4006
			       [i_300_]);
		    if (bool_294_) {
			if (class37_sub4_sub7_sub6_sub1_299_.aShortArray4004
			    != null)
			    aShortArray4004[anInt3825]
				= (class37_sub4_sub7_sub6_sub1_299_
				   .aShortArray4004[i_300_]);
			else
			    aShortArray4004[anInt3825] = (short) -1;
		    }
		    if (bool_295_) {
			if ((class37_sub4_sub7_sub6_sub1_299_.aByteArray4003
			     != null)
			    && (class37_sub4_sub7_sub6_sub1_299_.aByteArray4003
				[i_300_]) != -1)
			    aByteArray4003[anInt3825]
				= (byte) ((class37_sub4_sub7_sub6_sub1_299_
					   .aByteArray4003[i_300_])
					  + anInt4011);
			else
			    aByteArray4003[anInt3825] = (byte) -1;
		    }
		    anInt3825++;
		}
		for (int i_301_ = 0;
		     i_301_ < class37_sub4_sub7_sub6_sub1_299_.anInt4011;
		     i_301_++) {
		    anIntArray4008[anInt4011]
			= (class37_sub4_sub7_sub6_sub1_299_.anIntArray4008
			   [i_301_]) + anInt3830;
		    anIntArray4009[anInt4011]
			= (class37_sub4_sub7_sub6_sub1_299_.anIntArray4009
			   [i_301_]) + anInt3830;
		    anIntArray4002[anInt4011]
			= (class37_sub4_sub7_sub6_sub1_299_.anIntArray4002
			   [i_301_]) + anInt3830;
		    anInt4011++;
		}
		for (int i_302_ = 0;
		     i_302_ < class37_sub4_sub7_sub6_sub1_299_.anInt3830;
		     i_302_++) {
		    anIntArray3823[anInt3830]
			= (class37_sub4_sub7_sub6_sub1_299_.anIntArray3823
			   [i_302_]);
		    anIntArray3833[anInt3830]
			= (class37_sub4_sub7_sub6_sub1_299_.anIntArray3833
			   [i_302_]);
		    anIntArray3824[anInt3830]
			= (class37_sub4_sub7_sub6_sub1_299_.anIntArray3824
			   [i_302_]);
		    anInt3830++;
		}
	    }
	}
    }
    
    static {
	anIntArrayArray4018 = new int[1600][512];
	anIntArray4022 = new int[12];
	anIntArray4026 = new int[10];
	anIntArray4030 = new int[4096];
	aByteArray4035 = new byte[1];
	anInt4024 = 0;
	anIntArray4038 = new int[1000];
	aBooleanArray4033 = new boolean[4096];
	anIntArray4028 = new int[4096];
	anIntArray4041 = new int[10];
	anIntArray4025 = Rasterizer.anIntArray3930;
	anIntArray4027 = new int[1600];
	anInt4019 = 0;
	anInt4037 = 0;
	anIntArrayArray4032 = new int[12][2000];
	anIntArray4040 = new int[4096];
	anIntArray4043 = new int[10];
	anIntArray4031 = new int[2000];
	anIntArray4021 = new int[4096];
	anIntArray4046 = Rasterizer.anIntArray3912;
	anIntArray4045 = Rasterizer.anIntArray3929;
	aBoolean4039 = false;
	anIntArray4036 = Rasterizer.anIntArray3910;
	anIntArray4029 = new int[2000];
	anIntArray4044 = new int[4096];
    }
}
