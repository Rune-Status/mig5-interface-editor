package org.ie.client;

/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class34
{
    public int[][][] anIntArrayArrayArray768 = new int[2][2][4];
    public static int[][] anIntArrayArray769 = new int[2][8];
    public int[][][] anIntArrayArrayArray770 = new int[2][2][4];
    public static float aFloat771;
    public static float[][] aFloatArrayArray772 = new float[2][8];
    public static int anInt773;
    public int[] anIntArray774 = new int[2];
    public int[] anIntArray775 = new int[2];
    
    public float method306(int i, int i_0_, float f) {
	float f_1_ = ((float) anIntArrayArrayArray768[i][0][i_0_]
		      + f * (float) (anIntArrayArrayArray768[i][1][i_0_]
				     - anIntArrayArrayArray768[i][0][i_0_]));
	f_1_ *= 0.0015258789F;
	return 1.0F - (float) Math.pow(10.0, (double) (-f_1_ / 20.0F));
    }
    
    public static void method307() {
	aFloatArrayArray772 = null;
	anIntArrayArray769 = null;
    }
    
    public float method308(int i, int i_2_, float f) {
	float f_3_ = ((float) anIntArrayArrayArray770[i][0][i_2_]
		      + f * (float) (anIntArrayArrayArray770[i][1][i_2_]
				     - anIntArrayArrayArray770[i][0][i_2_]));
	f_3_ *= 1.2207031E-4F;
	return method310(f_3_);
    }
    
    public int method309(int i, float f) {
	if (i == 0) {
	    float f_4_ = ((float) anIntArray775[0]
			  + (float) (anIntArray775[1] - anIntArray775[0]) * f);
	    f_4_ *= 0.0030517578F;
	    aFloat771 = (float) Math.pow(0.1, (double) (f_4_ / 20.0F));
	    anInt773 = (int) (aFloat771 * 65536.0F);
	}
	if (anIntArray774[i] == 0)
	    return 0;
	float f_5_ = method306(i, 0, f);
	aFloatArrayArray772[i][0]
	    = -2.0F * f_5_ * (float) Math.cos((double) method308(i, 0, f));
	aFloatArrayArray772[i][1] = f_5_ * f_5_;
	for (int i_6_ = 1; i_6_ < anIntArray774[i]; i_6_++) {
	    f_5_ = method306(i, i_6_, f);
	    float f_7_ = (-2.0F * f_5_
			  * (float) Math.cos((double) method308(i, i_6_, f)));
	    float f_8_ = f_5_ * f_5_;
	    aFloatArrayArray772[i][i_6_ * 2 + 1]
		= aFloatArrayArray772[i][i_6_ * 2 - 1] * f_8_;
	    aFloatArrayArray772[i][i_6_ * 2]
		= (aFloatArrayArray772[i][i_6_ * 2 - 1] * f_7_
		   + aFloatArrayArray772[i][i_6_ * 2 - 2] * f_8_);
	    for (int i_9_ = i_6_ * 2 - 1; i_9_ >= 2; i_9_--)
		aFloatArrayArray772[i][i_9_]
		    += (aFloatArrayArray772[i][i_9_ - 1] * f_7_
			+ aFloatArrayArray772[i][i_9_ - 2] * f_8_);
	    aFloatArrayArray772[i][1]
		+= aFloatArrayArray772[i][0] * f_7_ + f_8_;
	    aFloatArrayArray772[i][0] += f_7_;
	}
	if (i == 0) {
	    for (int i_10_ = 0; i_10_ < anIntArray774[0] * 2; i_10_++)
		aFloatArrayArray772[0][i_10_] *= aFloat771;
	}
	for (int i_11_ = 0; i_11_ < anIntArray774[i] * 2; i_11_++)
	    anIntArrayArray769[i][i_11_]
		= (int) (aFloatArrayArray772[i][i_11_] * 65536.0F);
	return anIntArray774[i] * 2;
    }
    
    public static float method310(float f) {
	float f_12_ = 32.703197F * (float) Math.pow(2.0, (double) f);
	return f_12_ * 3.1415927F / 11025.0F;
    }
    
    public void method311(ByteVector class37_sub11, Class12 class12) {
	int i = class37_sub11.getUnsignedByte();
	anIntArray774[0] = i >> 4;
	anIntArray774[1] = i & 0xf;
	if (i != 0) {
	    anIntArray775[0] = class37_sub11.getUnsignedShort();
	    anIntArray775[1] = class37_sub11.getUnsignedShort();
	    int i_13_ = class37_sub11.getUnsignedByte();
	    for (int i_14_ = 0; i_14_ < 2; i_14_++) {
		for (int i_15_ = 0; i_15_ < anIntArray774[i_14_]; i_15_++) {
		    anIntArrayArrayArray770[i_14_][0][i_15_]
			= class37_sub11.getUnsignedShort();
		    anIntArrayArrayArray768[i_14_][0][i_15_]
			= class37_sub11.getUnsignedShort();
		}
	    }
	    for (int i_16_ = 0; i_16_ < 2; i_16_++) {
		for (int i_17_ = 0; i_17_ < anIntArray774[i_16_]; i_17_++) {
		    if ((i_13_ & 1 << i_16_ * 4 << i_17_) != 0) {
			anIntArrayArrayArray770[i_16_][1][i_17_]
			    = class37_sub11.getUnsignedShort();
			anIntArrayArrayArray768[i_16_][1][i_17_]
			    = class37_sub11.getUnsignedShort();
		    } else {
			anIntArrayArrayArray770[i_16_][1][i_17_]
			    = anIntArrayArrayArray770[i_16_][0][i_17_];
			anIntArrayArrayArray768[i_16_][1][i_17_]
			    = anIntArrayArrayArray768[i_16_][0][i_17_];
		    }
		}
	    }
	    if (i_13_ != 0 || anIntArray775[1] != anIntArray775[0])
		class12.method90(class37_sub11);
	} else
	    anIntArray775[0] = anIntArray775[1] = 0;
    }
}
