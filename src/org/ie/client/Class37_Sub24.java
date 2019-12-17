package org.ie.client;

/* Class37_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub24 extends Node
{
    public static int anInt2240;
    public static int anInt2241;
    public static float[] aFloatArray2242;
    public static float[] aFloatArray2243;
    public static float[] aFloatArray2244;
    public static float[] aFloatArray2245;
    public int anInt2246;
    public int anInt2247;
    public static boolean aBoolean2248 = false;
    public static float[] aFloatArray2249;
    public int anInt2250;
    public static int anInt2251;
    public static float[] aFloatArray2252;
    public static int[] anIntArray2253;
    public int anInt2254;
    public static float[] aFloatArray2255;
    public static Class48[] aClass48Array2256;
    public boolean aBoolean2257;
    public int anInt2258;
    public static Class74[] aClass74Array2259;
    public static int[] anIntArray2260;
    public static Class40[] aClass40Array2261;
    public static byte[] aByteArray2262;
    public byte[][] aByteArrayArray2263;
    public float[] aFloatArray2264;
    public static boolean[] aBooleanArray2265;
    public int anInt2266;
    public static int[] anIntArray2267;
    public static Class28[] aClass28Array2268;
    public boolean aBoolean2269;
    public static int anInt2270;
    public int anInt2271;
    public int anInt2272;
    public byte[] aByteArray2273;
    
    public static boolean method1031(Class15 class15) {
	if (!aBoolean2248) {
	    byte[] is = class15.getFile(0, 0);
	    if (is == null)
		return false;
	    method1040(is);
	    aBoolean2248 = true;
	}
	return true;
    }
    
    public static float method1032(int i) {
	int i_0_ = i & 0x1fffff;
	int i_1_ = i & ~0x7fffffff;
	int i_2_ = (i & 0x7fe00000) >> 21;
	if (i_1_ != 0)
	    i_0_ = -i_0_;
	return (float) ((double) i_0_ * Math.pow(2.0, (double) (i_2_ - 788)));
    }
    
    public static Class37_Sub24 method1033(Class15 class15, int i, int i_3_) {
	if (!method1031(class15)) {
	    class15.method115(-9350, i, i_3_);
	    return null;
	}
	byte[] is = class15.getFile(i, i_3_);
	if (is == null)
	    return null;
	return new Class37_Sub24(is);
    }
    
    public static void method1034() {
	aByteArray2262 = null;
	aClass74Array2259 = null;
	aClass40Array2261 = null;
	aClass28Array2268 = null;
	aClass48Array2256 = null;
	aBooleanArray2265 = null;
	anIntArray2267 = null;
	aFloatArray2245 = null;
	aFloatArray2243 = null;
	aFloatArray2242 = null;
	aFloatArray2255 = null;
	aFloatArray2249 = null;
	aFloatArray2252 = null;
	aFloatArray2244 = null;
	anIntArray2260 = null;
	anIntArray2253 = null;
    }
    
    public float[] method1035(int i) {
	method1037(aByteArrayArray2263[i], 0);
	method1039();
	int i_4_ = method1041(Class68.method1245((byte) 24,
						 anIntArray2267.length - 1));
	boolean bool = aBooleanArray2265[i_4_];
	int i_5_ = bool ? anInt2240 : anInt2241;
	boolean bool_6_ = false;
	boolean bool_7_ = false;
	if (bool) {
	    bool_6_ = method1039() != 0;
	    bool_7_ = method1039() != 0;
	}
	int i_8_ = i_5_ >> 1;
	int i_9_;
	int i_10_;
	int i_11_;
	if (bool && !bool_6_) {
	    i_9_ = (i_5_ >> 2) - (anInt2241 >> 2);
	    i_10_ = (i_5_ >> 2) + (anInt2241 >> 2);
	    i_11_ = anInt2241 >> 1;
	} else {
	    i_9_ = 0;
	    i_10_ = i_8_;
	    i_11_ = i_5_ >> 1;
	}
	int i_12_;
	int i_13_;
	int i_14_;
	if (bool && !bool_7_) {
	    i_12_ = i_5_ - (i_5_ >> 2) - (anInt2241 >> 2);
	    i_13_ = i_5_ - (i_5_ >> 2) + (anInt2241 >> 2);
	    i_14_ = anInt2241 >> 1;
	} else {
	    i_12_ = i_8_;
	    i_13_ = i_5_;
	    i_14_ = i_5_ >> 1;
	}
	Class48 class48 = aClass48Array2256[anIntArray2267[i_4_]];
	int i_15_ = class48.anInt999;
	int i_16_ = class48.anIntArray1002[i_15_];
	boolean bool_17_ = !aClass40Array2261[i_16_].method1065();
	boolean bool_18_ = bool_17_;
	for (int i_19_ = 0; i_19_ < class48.anInt1001; i_19_++) {
	    Class28 class28 = aClass28Array2268[class48.anIntArray1000[i_19_]];
	    float[] fs = aFloatArray2245;
	    class28.method261(fs, i_5_ >> 1, bool_18_);
	}
	if (!bool_17_) {
	    int i_20_ = class48.anInt999;
	    int i_21_ = class48.anIntArray1002[i_20_];
	    aClass40Array2261[i_21_].method1072(aFloatArray2245, i_5_ >> 1);
	}
	if (bool_17_) {
	    for (int i_22_ = i_5_ >> 1; i_22_ < i_5_; i_22_++)
		aFloatArray2245[i_22_] = 0.0F;
	} else {
	    int i_23_ = i_5_ >> 1;
	    int i_24_ = i_5_ >> 2;
	    int i_25_ = i_5_ >> 3;
	    float[] fs = aFloatArray2245;
	    for (int i_26_ = 0; i_26_ < i_23_; i_26_++)
		fs[i_26_] *= 0.5F;
	    for (int i_27_ = i_23_; i_27_ < i_5_; i_27_++)
		fs[i_27_] = -fs[i_5_ - i_27_ - 1];
	    float[] fs_28_ = bool ? aFloatArray2249 : aFloatArray2243;
	    float[] fs_29_ = bool ? aFloatArray2252 : aFloatArray2242;
	    float[] fs_30_ = bool ? aFloatArray2244 : aFloatArray2255;
	    int[] is = bool ? anIntArray2253 : anIntArray2260;
	    for (int i_31_ = 0; i_31_ < i_24_; i_31_++) {
		float f = fs[4 * i_31_] - fs[i_5_ - 4 * i_31_ - 1];
		float f_32_ = fs[4 * i_31_ + 2] - fs[i_5_ - 4 * i_31_ - 3];
		float f_33_ = fs_28_[2 * i_31_];
		float f_34_ = fs_28_[2 * i_31_ + 1];
		fs[i_5_ - 4 * i_31_ - 1] = f * f_33_ - f_32_ * f_34_;
		fs[i_5_ - 4 * i_31_ - 3] = f * f_34_ + f_32_ * f_33_;
	    }
	    for (int i_35_ = 0; i_35_ < i_25_; i_35_++) {
		float f = fs[i_23_ + 3 + 4 * i_35_];
		float f_36_ = fs[i_23_ + 1 + 4 * i_35_];
		float f_37_ = fs[4 * i_35_ + 3];
		float f_38_ = fs[4 * i_35_ + 1];
		fs[i_23_ + 3 + 4 * i_35_] = f + f_37_;
		fs[i_23_ + 1 + 4 * i_35_] = f_36_ + f_38_;
		float f_39_ = fs_28_[i_23_ - 4 - 4 * i_35_];
		float f_40_ = fs_28_[i_23_ - 3 - 4 * i_35_];
		fs[4 * i_35_ + 3]
		    = (f - f_37_) * f_39_ - (f_36_ - f_38_) * f_40_;
		fs[4 * i_35_ + 1]
		    = (f_36_ - f_38_) * f_39_ + (f - f_37_) * f_40_;
	    }
	    int i_41_ = Class68.method1245((byte) 24, i_5_ - 1);
	    for (int i_42_ = 0; i_42_ < i_41_ - 3; i_42_++) {
		int i_43_ = i_5_ >> i_42_ + 2;
		int i_44_ = 8 << i_42_;
		for (int i_45_ = 0; i_45_ < 2 << i_42_; i_45_++) {
		    int i_46_ = i_5_ - i_43_ * 2 * i_45_;
		    int i_47_ = i_5_ - i_43_ * (2 * i_45_ + 1);
		    for (int i_48_ = 0; i_48_ < i_5_ >> i_42_ + 4; i_48_++) {
			int i_49_ = 4 * i_48_;
			float f = fs[i_46_ - 1 - i_49_];
			float f_50_ = fs[i_46_ - 3 - i_49_];
			float f_51_ = fs[i_47_ - 1 - i_49_];
			float f_52_ = fs[i_47_ - 3 - i_49_];
			fs[i_46_ - 1 - i_49_] = f + f_51_;
			fs[i_46_ - 3 - i_49_] = f_50_ + f_52_;
			float f_53_ = fs_28_[i_48_ * i_44_];
			float f_54_ = fs_28_[i_48_ * i_44_ + 1];
			fs[i_47_ - 1 - i_49_]
			    = (f - f_51_) * f_53_ - (f_50_ - f_52_) * f_54_;
			fs[i_47_ - 3 - i_49_]
			    = (f_50_ - f_52_) * f_53_ + (f - f_51_) * f_54_;
		    }
		}
	    }
	    for (int i_55_ = 1; i_55_ < i_25_ - 1; i_55_++) {
		int i_56_ = is[i_55_];
		if (i_55_ < i_56_) {
		    int i_57_ = 8 * i_55_;
		    int i_58_ = 8 * i_56_;
		    float f = fs[i_57_ + 1];
		    fs[i_57_ + 1] = fs[i_58_ + 1];
		    fs[i_58_ + 1] = f;
		    f = fs[i_57_ + 3];
		    fs[i_57_ + 3] = fs[i_58_ + 3];
		    fs[i_58_ + 3] = f;
		    f = fs[i_57_ + 5];
		    fs[i_57_ + 5] = fs[i_58_ + 5];
		    fs[i_58_ + 5] = f;
		    f = fs[i_57_ + 7];
		    fs[i_57_ + 7] = fs[i_58_ + 7];
		    fs[i_58_ + 7] = f;
		}
	    }
	    for (int i_59_ = 0; i_59_ < i_23_; i_59_++)
		fs[i_59_] = fs[2 * i_59_ + 1];
	    for (int i_60_ = 0; i_60_ < i_25_; i_60_++) {
		fs[i_5_ - 1 - 2 * i_60_] = fs[4 * i_60_];
		fs[i_5_ - 2 - 2 * i_60_] = fs[4 * i_60_ + 1];
		fs[i_5_ - i_24_ - 1 - 2 * i_60_] = fs[4 * i_60_ + 2];
		fs[i_5_ - i_24_ - 2 - 2 * i_60_] = fs[4 * i_60_ + 3];
	    }
	    for (int i_61_ = 0; i_61_ < i_25_; i_61_++) {
		float f = fs_30_[2 * i_61_];
		float f_62_ = fs_30_[2 * i_61_ + 1];
		float f_63_ = fs[i_23_ + 2 * i_61_];
		float f_64_ = fs[i_23_ + 2 * i_61_ + 1];
		float f_65_ = fs[i_5_ - 2 - 2 * i_61_];
		float f_66_ = fs[i_5_ - 1 - 2 * i_61_];
		float f_67_ = f_62_ * (f_63_ - f_65_) + f * (f_64_ + f_66_);
		fs[i_23_ + 2 * i_61_] = (f_63_ + f_65_ + f_67_) * 0.5F;
		fs[i_5_ - 2 - 2 * i_61_] = (f_63_ + f_65_ - f_67_) * 0.5F;
		f_67_ = f_62_ * (f_64_ + f_66_) - f * (f_63_ - f_65_);
		fs[i_23_ + 2 * i_61_ + 1] = (f_64_ - f_66_ + f_67_) * 0.5F;
		fs[i_5_ - 1 - 2 * i_61_] = (-f_64_ + f_66_ + f_67_) * 0.5F;
	    }
	    for (int i_68_ = 0; i_68_ < i_24_; i_68_++) {
		fs[i_68_]
		    = (fs[2 * i_68_ + i_23_] * fs_29_[2 * i_68_]
		       + fs[2 * i_68_ + 1 + i_23_] * fs_29_[2 * i_68_ + 1]);
		fs[i_23_ - 1 - i_68_]
		    = (fs[2 * i_68_ + i_23_] * fs_29_[2 * i_68_ + 1]
		       - fs[2 * i_68_ + 1 + i_23_] * fs_29_[2 * i_68_]);
	    }
	    for (int i_69_ = 0; i_69_ < i_24_; i_69_++)
		fs[i_5_ - i_24_ + i_69_] = -fs[i_69_];
	    for (int i_70_ = 0; i_70_ < i_24_; i_70_++)
		fs[i_70_] = fs[i_24_ + i_70_];
	    for (int i_71_ = 0; i_71_ < i_24_; i_71_++)
		fs[i_24_ + i_71_] = -fs[i_24_ - i_71_ - 1];
	    for (int i_72_ = 0; i_72_ < i_24_; i_72_++)
		fs[i_23_ + i_72_] = fs[i_5_ - i_72_ - 1];
	    for (int i_73_ = i_9_; i_73_ < i_10_; i_73_++) {
		float f = (float) Math.sin(((double) (i_73_ - i_9_) + 0.5)
					   / (double) i_11_ * 0.5
					   * 3.141592653589793);
		aFloatArray2245[i_73_]
		    *= (float) Math.sin(1.5707963267948966 * (double) f
					* (double) f);
	    }
	    for (int i_74_ = i_12_; i_74_ < i_13_; i_74_++) {
		float f = (float) Math.sin((((double) (i_74_ - i_12_) + 0.5)
					    / (double) i_14_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		aFloatArray2245[i_74_]
		    *= (float) Math.sin(1.5707963267948966 * (double) f
					* (double) f);
	    }
	}
	float[] fs = null;
	if (anInt2258 > 0) {
	    int i_75_ = anInt2258 + i_5_ >> 2;
	    fs = new float[i_75_];
	    if (!aBoolean2269) {
		for (int i_76_ = 0; i_76_ < anInt2266; i_76_++) {
		    int i_77_ = (anInt2258 >> 1) + i_76_;
		    fs[i_76_] += aFloatArray2264[i_77_];
		}
	    }
	    if (!bool_17_) {
		for (int i_78_ = i_9_; i_78_ < i_5_ >> 1; i_78_++) {
		    int i_79_ = fs.length - (i_5_ >> 1) + i_78_;
		    fs[i_79_] += aFloatArray2245[i_78_];
		}
	    }
	}
	float[] fs_80_ = aFloatArray2264;
	aFloatArray2264 = aFloatArray2245;
	aFloatArray2245 = fs_80_;
	anInt2258 = i_5_;
	anInt2266 = i_13_ - (i_5_ >> 1);
	aBoolean2269 = bool_17_;
	return fs;
    }
    
    public Class37_Sub22_Sub1 method1036(int[] is) {
	if (is != null && is[0] <= 0)
	    return null;
	if (aByteArray2273 == null) {
	    anInt2258 = 0;
	    aFloatArray2264 = new float[anInt2240];
	    aByteArray2273 = new byte[anInt2254];
	    anInt2271 = 0;
	    anInt2272 = 0;
	}
	for (/**/; anInt2272 < aByteArrayArray2263.length; anInt2272++) {
	    if (is != null && is[0] <= 0)
		return null;
	    float[] fs = method1035(anInt2272);
	    if (fs != null) {
		int i = anInt2271;
		int i_81_ = fs.length;
		if (i_81_ > anInt2254 - i)
		    i_81_ = anInt2254 - i;
		for (int i_82_ = 0; i_82_ < i_81_; i_82_++) {
		    int i_83_ = (int) (128.0F + fs[i_82_] * 128.0F);
		    if ((i_83_ & ~0xff) != 0)
			i_83_ = (i_83_ ^ 0xffffffff) >> 31;
		    aByteArray2273[i++] = (byte) (i_83_ - 128);
		}
		if (is != null)
		    is[0] -= i - anInt2271;
		anInt2271 = i;
	    }
	}
	aFloatArray2264 = null;
	byte[] is_84_ = aByteArray2273;
	aByteArray2273 = null;
	return new Class37_Sub22_Sub1(anInt2246, is_84_, anInt2250, anInt2247,
				      aBoolean2257);
    }
    
    public static void method1037(byte[] is, int i) {
	aByteArray2262 = is;
	anInt2251 = i;
	anInt2270 = 0;
    }
    
    public void method1038(byte[] is) {
	ByteVector class37_sub11 = new ByteVector(is);
	anInt2246 = class37_sub11.getInt();
	anInt2254 = class37_sub11.getInt();
	anInt2250 = class37_sub11.getInt();
	anInt2247 = class37_sub11.getInt();
	if (anInt2247 < 0) {
	    anInt2247 = anInt2247 ^ 0xffffffff;
	    aBoolean2257 = true;
	}
	int i = class37_sub11.getInt();
	aByteArrayArray2263 = new byte[i][];
	for (int i_85_ = 0; i_85_ < i; i_85_++) {
	    int i_86_ = 0;
	    int i_87_;
	    do {
		i_87_ = class37_sub11.getUnsignedByte();
		i_86_ += i_87_;
	    } while (i_87_ >= 255);
	    byte[] is_88_ = new byte[i_86_];
	    class37_sub11.method968(0, i_86_, is_88_, (byte) -53);
	    aByteArrayArray2263[i_85_] = is_88_;
	}
    }
    
    public static int method1039() {
	int i = aByteArray2262[anInt2251] >> anInt2270 & 0x1;
	anInt2270++;
	anInt2251 += anInt2270 >> 3;
	anInt2270 &= 0x7;
	return i;
    }
    
    public static void method1040(byte[] is) {
	method1037(is, 0);
	anInt2241 = 1 << method1041(4);
	anInt2240 = 1 << method1041(4);
	aFloatArray2245 = new float[anInt2240];
	for (int i = 0; i < 2; i++) {
	    int i_89_ = i != 0 ? anInt2240 : anInt2241;
	    int i_90_ = i_89_ >> 1;
	    int i_91_ = i_89_ >> 2;
	    int i_92_ = i_89_ >> 3;
	    float[] fs = new float[i_90_];
	    for (int i_93_ = 0; i_93_ < i_91_; i_93_++) {
		fs[2 * i_93_]
		    = (float) Math.cos((double) (4 * i_93_) * 3.141592653589793
				       / (double) i_89_);
		fs[2 * i_93_ + 1]
		    = -(float) Math.sin((double) (4 * i_93_)
					* 3.141592653589793 / (double) i_89_);
	    }
	    float[] fs_94_ = new float[i_90_];
	    for (int i_95_ = 0; i_95_ < i_91_; i_95_++) {
		fs_94_[2 * i_95_] = (float) Math.cos((double) (2 * i_95_ + 1)
						     * 3.141592653589793
						     / (double) (2 * i_89_));
		fs_94_[2 * i_95_ + 1]
		    = (float) Math.sin((double) (2 * i_95_ + 1)
				       * 3.141592653589793
				       / (double) (2 * i_89_));
	    }
	    float[] fs_96_ = new float[i_91_];
	    for (int i_97_ = 0; i_97_ < i_92_; i_97_++) {
		fs_96_[2 * i_97_]
		    = (float) Math.cos((double) (4 * i_97_ + 2)
				       * 3.141592653589793 / (double) i_89_);
		fs_96_[2 * i_97_ + 1]
		    = -(float) Math.sin((double) (4 * i_97_ + 2)
					* 3.141592653589793 / (double) i_89_);
	    }
	    int[] is_98_ = new int[i_92_];
	    int i_99_ = Class68.method1245((byte) 24, i_92_ - 1);
	    for (int i_100_ = 0; i_100_ < i_92_; i_100_++)
		is_98_[i_100_]
		    = Class37_Sub9_Sub26.method875(i_100_, (byte) 85, i_99_);
	    if (i != 0) {
		aFloatArray2249 = fs;
		aFloatArray2252 = fs_94_;
		aFloatArray2244 = fs_96_;
		anIntArray2253 = is_98_;
	    } else {
		aFloatArray2243 = fs;
		aFloatArray2242 = fs_94_;
		aFloatArray2255 = fs_96_;
		anIntArray2260 = is_98_;
	    }
	}
	int i = method1041(8) + 1;
	aClass74Array2259 = new Class74[i];
	for (int i_101_ = 0; i_101_ < i; i_101_++)
	    aClass74Array2259[i_101_] = new Class74();
	int i_102_ = method1041(6) + 1;
	for (int i_103_ = 0; i_103_ < i_102_; i_103_++)
	    method1041(16);
	int i_104_ = method1041(6) + 1;
	aClass40Array2261 = new Class40[i_104_];
	for (int i_105_ = 0; i_105_ < i_104_; i_105_++)
	    aClass40Array2261[i_105_] = new Class40();
	int i_106_ = method1041(6) + 1;
	aClass28Array2268 = new Class28[i_106_];
	for (int i_107_ = 0; i_107_ < i_106_; i_107_++)
	    aClass28Array2268[i_107_] = new Class28();
	int i_108_ = method1041(6) + 1;
	aClass48Array2256 = new Class48[i_108_];
	for (int i_109_ = 0; i_109_ < i_108_; i_109_++)
	    aClass48Array2256[i_109_] = new Class48();
	int i_110_ = method1041(6) + 1;
	aBooleanArray2265 = new boolean[i_110_];
	anIntArray2267 = new int[i_110_];
	for (int i_111_ = 0; i_111_ < i_110_; i_111_++) {
	    aBooleanArray2265[i_111_] = method1039() != 0;
	    method1041(16);
	    method1041(16);
	    anIntArray2267[i_111_] = method1041(8);
	}
    }
    
    public static int method1041(int i) {
	int i_112_ = 0;
	int i_113_ = 0;
	int i_114_;
	for (/**/; i >= 8 - anInt2270; i -= i_114_) {
	    i_114_ = 8 - anInt2270;
	    int i_115_ = (1 << i_114_) - 1;
	    i_112_
		+= (aByteArray2262[anInt2251] >> anInt2270 & i_115_) << i_113_;
	    anInt2270 = 0;
	    anInt2251++;
	    i_113_ += i_114_;
	}
	if (i > 0) {
	    i_114_ = (1 << i) - 1;
	    i_112_
		+= (aByteArray2262[anInt2251] >> anInt2270 & i_114_) << i_113_;
	    anInt2270 += i;
	}
	return i_112_;
    }
    
    public Class37_Sub24(byte[] is) {
	method1038(is);
    }
}
