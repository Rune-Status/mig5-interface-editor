package org.ie.client;

/* Class37_Sub4_Sub7_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class37_Sub4_Sub7_Sub6 extends Class37_Sub4_Sub7
{
    public int[][] anIntArrayArray3822;
    public int[] anIntArray3823;
    public int[] anIntArray3824;
    public int anInt3825 = 0;
    public int anInt3826;
    public int[][] anIntArrayArray3827;
    public static int[] anIntArray3828 = Rasterizer.anIntArray3929;
    public int anInt3829;
    public int anInt3830 = 0;
    public int anInt3831;
    public static int[] anIntArray3832 = Rasterizer.anIntArray3910;
    public int[] anIntArray3833;
    public int anInt3834;
    public int anInt3835;
    public boolean aBoolean3836 = false;
    
    public abstract Class37_Sub4_Sub7_Sub6 method542(boolean bool);
    
    public void method543(int i, int i_0_, int i_1_) {
	for (int i_2_ = 0; i_2_ < anInt3830; i_2_++) {
	    anIntArray3823[i_2_] += i;
	    anIntArray3833[i_2_] += i_0_;
	    anIntArray3824[i_2_] += i_1_;
	}
	anInt3829 = 0;
    }
    
    public abstract void method544(int i, int i_3_, int i_4_, int i_5_,
				   int i_6_, int i_7_, int i_8_);
    
    public int method545() {
	method555();
	return anInt3835;
    }
    
    public void method546(int i) {
	int i_9_ = anIntArray3832[i];
	int i_10_ = anIntArray3828[i];
	for (int i_11_ = 0; i_11_ < anInt3830; i_11_++) {
	    int i_12_
		= (anIntArray3833[i_11_] * i_10_ - anIntArray3824[i_11_] * i_9_
		   >> 16);
	    anIntArray3824[i_11_]
		= (anIntArray3833[i_11_] * i_9_ + anIntArray3824[i_11_] * i_10_
		   >> 16);
	    anIntArray3833[i_11_] = i_12_;
	}
	anInt3829 = 0;
    }
    
    public abstract void method547(Class37_Sub4_Sub16 class37_sub4_sub16,
				   int i);
    
    public abstract Class37_Sub4_Sub7_Sub6 method548
	(int[][] is, int i, int i_13_, int i_14_, boolean bool, int i_15_);
    
    public abstract Class37_Sub4_Sub7_Sub6 method549
	(Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6_16_);
    
    public void method550() {
	if (anInt3829 != 2) {
	    anInt3829 = 2;
	    anInt3835 = 0;
	    for (int i = 0; i < anInt3830; i++) {
		int i_17_ = anIntArray3823[i];
		int i_18_ = anIntArray3833[i];
		int i_19_ = anIntArray3824[i];
		int i_20_ = i_17_ * i_17_ + i_19_ * i_19_ + i_18_ * i_18_;
		if (i_20_ > anInt3835)
		    anInt3835 = i_20_;
	    }
	    anInt3835 = (int) (Math.sqrt((double) anInt3835) + 0.99);
	    anInt3831 = anInt3835;
	    anInt3826 = anInt3835 + anInt3835;
	}
    }
    
    public abstract void method551
	(Class37_Sub4_Sub16 class37_sub4_sub16, int i,
	 Class37_Sub4_Sub16 class37_sub4_sub16_21_, int i_22_, int[] is);
    
    public void method552(int i, int i_23_, int i_24_) {
	for (int i_25_ = 0; i_25_ < anInt3830; i_25_++) {
	    anIntArray3823[i_25_] = anIntArray3823[i_25_] * i / 128;
	    anIntArray3833[i_25_] = anIntArray3833[i_25_] * i_23_ / 128;
	    anIntArray3824[i_25_] = anIntArray3824[i_25_] * i_24_ / 128;
	}
	anInt3829 = 0;
    }
    
    public void method553() {
	for (int i = 0; i < anInt3830; i++) {
	    int i_26_ = anIntArray3823[i];
	    anIntArray3823[i] = anIntArray3824[i];
	    anIntArray3824[i] = -i_26_;
	}
	anInt3829 = 0;
    }
    
    public static void method554() {
	anIntArray3832 = null;
	anIntArray3828 = null;
    }
    
    public void method555() {
	if (anInt3829 != 1) {
	    anInt3829 = 1;
	    anInt2627 = 0;
	    anInt3834 = 0;
	    anInt3835 = 0;
	    for (int i = 0; i < anInt3830; i++) {
		int i_27_ = anIntArray3823[i];
		int i_28_ = anIntArray3833[i];
		int i_29_ = anIntArray3824[i];
		if (-i_28_ > anInt2627)
		    anInt2627 = -i_28_;
		if (i_28_ > anInt3834)
		    anInt3834 = i_28_;
		int i_30_ = i_27_ * i_27_ + i_29_ * i_29_;
		if (i_30_ > anInt3835)
		    anInt3835 = i_30_;
	    }
	    anInt3835 = (int) (Math.sqrt((double) anInt3835) + 0.99);
	    anInt3831 = (int) (Math.sqrt((double) (anInt3835 * anInt3835
						   + anInt2627 * anInt2627))
			       + 0.99);
	    anInt3826 = (anInt3831
			 + (int) (Math.sqrt((double) (anInt3835 * anInt3835
						      + anInt3834 * anInt3834))
				  + 0.99));
	}
    }
    
    public void method556() {
	for (int i = 0; i < anInt3830; i++) {
	    anIntArray3823[i] = -anIntArray3823[i];
	    anIntArray3824[i] = -anIntArray3824[i];
	}
	anInt3829 = 0;
    }
    
    public abstract void method557(int i, int i_31_, int i_32_, int i_33_,
				   int i_34_, int i_35_, int i_36_, int i_37_);
    
    public void method558() {
	for (int i = 0; i < anInt3830; i++) {
	    int i_38_ = anIntArray3824[i];
	    anIntArray3824[i] = anIntArray3823[i];
	    anIntArray3823[i] = -i_38_;
	}
	anInt3829 = 0;
    }
    
    public abstract Class37_Sub4_Sub7_Sub6 method559(boolean bool);
}
