package org.ie.client;

/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class5
{
    public Class12 aClass12_109;
    public int anInt110;
    public int anInt111;
    public int anInt112 = 0;
    public Class12 aClass12_113;
    public Class34 aClass34_114;
    public Class12 aClass12_115;
    public Class12 aClass12_116;
    public int[] anIntArray117;
    public Class12 aClass12_118;
    public int anInt119;
    public int[] anIntArray120;
    public Class12 aClass12_121;
    public Class12 aClass12_122;
    public static int[] anIntArray123;
    public Class12 aClass12_124;
    public int[] anIntArray125;
    public Class12 aClass12_126;
    public static int[] anIntArray127 = new int[32768];
    public static int[] anIntArray128;
    public static int[] anIntArray129;
    public static int[] anIntArray130;
    public static int[] anIntArray131;
    public static int[] anIntArray132;
    public static int[] anIntArray133;
    
    public static void method54() {
	anIntArray128 = null;
	anIntArray127 = null;
	anIntArray123 = null;
	anIntArray131 = null;
	anIntArray130 = null;
	anIntArray129 = null;
	anIntArray132 = null;
	anIntArray133 = null;
    }
    
    public int method55(int i, int i_0_, int i_1_) {
	if (i_1_ == 1) {
	    if ((i & 0x7fff) < 16384)
		return i_0_;
	    return -i_0_;
	}
	if (i_1_ == 2)
	    return anIntArray123[i & 0x7fff] * i_0_ >> 14;
	if (i_1_ == 3)
	    return ((i & 0x7fff) * i_0_ >> 14) - i_0_;
	if (i_1_ == 4)
	    return anIntArray127[i / 2607 & 0x7fff] * i_0_;
	return 0;
    }
    
    public int[] method56(int i, int i_2_) {
	Class53.method1136(anIntArray128, 0, i);
	if (i_2_ < 10)
	    return anIntArray128;
	double d = (double) i / ((double) i_2_ + 0.0);
	aClass12_118.method93();
	aClass12_126.method93();
	int i_3_ = 0;
	int i_4_ = 0;
	int i_5_ = 0;
	if (aClass12_121 != null) {
	    aClass12_121.method93();
	    aClass12_116.method93();
	    i_3_ = (int) ((double) (aClass12_121.anInt210
				    - aClass12_121.anInt206)
			  * 32.768 / d);
	    i_4_ = (int) ((double) aClass12_121.anInt206 * 32.768 / d);
	}
	int i_6_ = 0;
	int i_7_ = 0;
	int i_8_ = 0;
	if (aClass12_122 != null) {
	    aClass12_122.method93();
	    aClass12_113.method93();
	    i_6_ = (int) ((double) (aClass12_122.anInt210
				    - aClass12_122.anInt206)
			  * 32.768 / d);
	    i_7_ = (int) ((double) aClass12_122.anInt206 * 32.768 / d);
	}
	for (int i_9_ = 0; i_9_ < 5; i_9_++) {
	    if (anIntArray125[i_9_] != 0) {
		anIntArray131[i_9_] = 0;
		anIntArray130[i_9_] = (int) ((double) anIntArray120[i_9_] * d);
		anIntArray129[i_9_] = (anIntArray125[i_9_] << 14) / 100;
		anIntArray132[i_9_]
		    = (int) ((double) (aClass12_118.anInt210
				       - aClass12_118.anInt206)
			     * 32.768
			     * Math.pow(1.0057929410678534,
					(double) anIntArray117[i_9_])
			     / d);
		anIntArray133[i_9_]
		    = (int) ((double) aClass12_118.anInt206 * 32.768 / d);
	    }
	}
	for (int i_10_ = 0; i_10_ < i; i_10_++) {
	    int i_11_ = aClass12_118.method91(i);
	    int i_12_ = aClass12_126.method91(i);
	    if (aClass12_121 != null) {
		int i_13_ = aClass12_121.method91(i);
		int i_14_ = aClass12_116.method91(i);
		i_11_ += method55(i_5_, i_14_, aClass12_121.anInt209) >> 1;
		i_5_ += (i_13_ * i_3_ >> 16) + i_4_;
	    }
	    if (aClass12_122 != null) {
		int i_15_ = aClass12_122.method91(i);
		int i_16_ = aClass12_113.method91(i);
		i_12_ = i_12_ * ((method55(i_8_, i_16_, aClass12_122.anInt209)
				  >> 1)
				 + 32768) >> 15;
		i_8_ += (i_15_ * i_6_ >> 16) + i_7_;
	    }
	    for (int i_17_ = 0; i_17_ < 5; i_17_++) {
		if (anIntArray125[i_17_] != 0) {
		    int i_18_ = i_10_ + anIntArray130[i_17_];
		    if (i_18_ < i) {
			anIntArray128[i_18_]
			    += method55(anIntArray131[i_17_],
					i_12_ * anIntArray129[i_17_] >> 15,
					aClass12_118.anInt209);
			anIntArray131[i_17_] += (i_11_ * anIntArray132[i_17_]
						 >> 16) + anIntArray133[i_17_];
		    }
		}
	    }
	}
	if (aClass12_115 != null) {
	    aClass12_115.method93();
	    aClass12_124.method93();
	    int i_19_ = 0;
	    boolean bool = false;
	    boolean bool_20_ = true;
	    for (int i_21_ = 0; i_21_ < i; i_21_++) {
		int i_22_ = aClass12_115.method91(i);
		int i_23_ = aClass12_124.method91(i);
		int i_24_;
		if (bool_20_)
		    i_24_ = aClass12_115.anInt206 + (((aClass12_115.anInt210
						       - aClass12_115.anInt206)
						      * i_22_)
						     >> 8);
		else
		    i_24_ = aClass12_115.anInt206 + (((aClass12_115.anInt210
						       - aClass12_115.anInt206)
						      * i_23_)
						     >> 8);
		i_19_ += 256;
		if (i_19_ >= i_24_) {
		    i_19_ = 0;
		    bool_20_ = !bool_20_;
		}
		if (bool_20_)
		    anIntArray128[i_21_] = 0;
	    }
	}
	if (anInt119 > 0 && anInt110 > 0) {
	    int i_25_ = (int) ((double) anInt119 * d);
	    for (int i_26_ = i_25_; i_26_ < i; i_26_++)
		anIntArray128[i_26_]
		    += anIntArray128[i_26_ - i_25_] * anInt110 / 100;
	}
	if (aClass34_114.anIntArray774[0] > 0
	    || aClass34_114.anIntArray774[1] > 0) {
	    aClass12_109.method93();
	    int i_27_ = aClass12_109.method91(i + 1);
	    int i_28_ = aClass34_114.method309(0, (float) i_27_ / 65536.0F);
	    int i_29_ = aClass34_114.method309(1, (float) i_27_ / 65536.0F);
	    if (i >= i_28_ + i_29_) {
		int i_30_ = 0;
		int i_31_ = i_29_;
		if (i_31_ > i - i_28_)
		    i_31_ = i - i_28_;
		for (/**/; i_30_ < i_31_; i_30_++) {
		    int i_32_ = (int) (((long) anIntArray128[i_30_ + i_28_]
					* (long) Class34.anInt773)
				       >> 16);
		    for (int i_33_ = 0; i_33_ < i_28_; i_33_++)
			i_32_ += (int) (((long) (anIntArray128
						 [i_30_ + i_28_ - 1 - i_33_])
					 * (long) (Class34.anIntArrayArray769
						   [0][i_33_]))
					>> 16);
		    for (int i_34_ = 0; i_34_ < i_30_; i_34_++)
			i_32_
			    -= (int) (((long) anIntArray128[i_30_ - 1 - i_34_]
				       * (long) (Class34.anIntArrayArray769[1]
						 [i_34_]))
				      >> 16);
		    anIntArray128[i_30_] = i_32_;
		    i_27_ = aClass12_109.method91(i + 1);
		}
		i_31_ = 128;
		for (;;) {
		    if (i_31_ > i - i_28_)
			i_31_ = i - i_28_;
		    for (/**/; i_30_ < i_31_; i_30_++) {
			int i_35_ = (int) (((long) anIntArray128[i_30_ + i_28_]
					    * (long) Class34.anInt773)
					   >> 16);
			for (int i_36_ = 0; i_36_ < i_28_; i_36_++)
			    i_35_
				+= (int) (((long) (anIntArray128
						   [i_30_ + i_28_ - 1 - i_36_])
					   * (long) (Class34.anIntArrayArray769
						     [0][i_36_]))
					  >> 16);
			for (int i_37_ = 0; i_37_ < i_29_; i_37_++)
			    i_35_
				-= (int) (((long) (anIntArray128
						   [i_30_ - 1 - i_37_])
					   * (long) (Class34.anIntArrayArray769
						     [1][i_37_]))
					  >> 16);
			anIntArray128[i_30_] = i_35_;
			i_27_ = aClass12_109.method91(i + 1);
		    }
		    if (i_30_ >= i - i_28_)
			break;
		    i_28_
			= aClass34_114.method309(0, (float) i_27_ / 65536.0F);
		    i_29_
			= aClass34_114.method309(1, (float) i_27_ / 65536.0F);
		    i_31_ += 128;
		}
		for (/**/; i_30_ < i; i_30_++) {
		    int i_38_ = 0;
		    for (int i_39_ = i_30_ + i_28_ - i; i_39_ < i_28_; i_39_++)
			i_38_ += (int) (((long) (anIntArray128
						 [i_30_ + i_28_ - 1 - i_39_])
					 * (long) (Class34.anIntArrayArray769
						   [0][i_39_]))
					>> 16);
		    for (int i_40_ = 0; i_40_ < i_29_; i_40_++)
			i_38_
			    -= (int) (((long) anIntArray128[i_30_ - 1 - i_40_]
				       * (long) (Class34.anIntArrayArray769[1]
						 [i_40_]))
				      >> 16);
		    anIntArray128[i_30_] = i_38_;
		    i_27_ = aClass12_109.method91(i + 1);
		}
	    }
	}
	for (int i_41_ = 0; i_41_ < i; i_41_++) {
	    if (anIntArray128[i_41_] < -32768)
		anIntArray128[i_41_] = -32768;
	    if (anIntArray128[i_41_] > 32767)
		anIntArray128[i_41_] = 32767;
	}
	return anIntArray128;
    }
    
    public void method57(ByteVector class37_sub11) {
	aClass12_118 = new Class12();
	aClass12_118.method92(class37_sub11);
	aClass12_126 = new Class12();
	aClass12_126.method92(class37_sub11);
	int i = class37_sub11.getUnsignedByte();
	if (i != 0) {
	    class37_sub11.pos--;
	    aClass12_121 = new Class12();
	    aClass12_121.method92(class37_sub11);
	    aClass12_116 = new Class12();
	    aClass12_116.method92(class37_sub11);
	}
	i = class37_sub11.getUnsignedByte();
	if (i != 0) {
	    class37_sub11.pos--;
	    aClass12_122 = new Class12();
	    aClass12_122.method92(class37_sub11);
	    aClass12_113 = new Class12();
	    aClass12_113.method92(class37_sub11);
	}
	i = class37_sub11.getUnsignedByte();
	if (i != 0) {
	    class37_sub11.pos--;
	    aClass12_115 = new Class12();
	    aClass12_115.method92(class37_sub11);
	    aClass12_124 = new Class12();
	    aClass12_124.method92(class37_sub11);
	}
	for (int i_42_ = 0; i_42_ < 10; i_42_++) {
	    int i_43_ = class37_sub11.method961(255);
	    if (i_43_ == 0)
		break;
	    anIntArray125[i_42_] = i_43_;
	    anIntArray117[i_42_] = class37_sub11.method959(39);
	    anIntArray120[i_42_] = class37_sub11.method961(255);
	}
	anInt119 = class37_sub11.method961(255);
	anInt110 = class37_sub11.method961(255);
	anInt111 = class37_sub11.getUnsignedShort();
	anInt112 = class37_sub11.getUnsignedShort();
	aClass34_114 = new Class34();
	aClass12_109 = new Class12();
	aClass34_114.method311(class37_sub11, aClass12_109);
    }
    
    public Class5() {
	anInt111 = 500;
	anInt110 = 100;
	anInt119 = 0;
	anIntArray117 = new int[5];
	anIntArray125 = new int[5];
	anIntArray120 = new int[5];
    }
    
    static {
	Random random = new Random(0L);
	for (int i = 0; i < 32768; i++)
	    anIntArray127[i] = (random.nextInt() & 0x2) - 1;
	anIntArray123 = new int[32768];
	for (int i = 0; i < 32768; i++)
	    anIntArray123[i]
		= (int) (Math.sin((double) i / 5215.1903) * 16384.0);
	anIntArray128 = new int[220500];
	anIntArray129 = new int[5];
	anIntArray130 = new int[5];
	anIntArray131 = new int[5];
	anIntArray133 = new int[5];
	anIntArray132 = new int[5];
    }
}
