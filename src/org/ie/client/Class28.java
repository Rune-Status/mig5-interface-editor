package org.ie.client;

/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class28
{
    public int[] anIntArray687;
    public int anInt688;
    public int anInt689;
    public int anInt690;
    public int anInt691;
    public int anInt692 = Class37_Sub24.method1041(16);
    public int anInt693;
    
    public void method261(float[] fs, int i, boolean bool) {
	for (int i_0_ = 0; i_0_ < i; i_0_++)
	    fs[i_0_] = 0.0F;
	if (!bool) {
	    int i_1_ = Class37_Sub24.aClass74Array2259[anInt693].anInt1399;
	    int i_2_ = anInt690 - anInt689;
	    int i_3_ = i_2_ / anInt691;
	    int[] is = new int[i_3_];
	    for (int i_4_ = 0; i_4_ < 8; i_4_++) {
		int i_5_ = 0;
		while (i_5_ < i_3_) {
		    if (i_4_ == 0) {
			int i_6_ = Class37_Sub24.aClass74Array2259
				       [anInt693].method1280();
			for (int i_7_ = i_1_ - 1; i_7_ >= 0; i_7_--) {
			    if (i_5_ + i_7_ < i_3_)
				is[i_5_ + i_7_] = i_6_ % anInt688;
			    i_6_ /= anInt688;
			}
		    }
		    for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
			int i_9_ = is[i_5_];
			int i_10_ = anIntArray687[i_9_ * 8 + i_4_];
			if (i_10_ >= 0) {
			    int i_11_ = anInt689 + i_5_ * anInt691;
			    Class74 class74
				= Class37_Sub24.aClass74Array2259[i_10_];
			    if (anInt692 == 0) {
				int i_12_ = anInt691 / class74.anInt1399;
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
				    float[] fs_14_ = class74.method1281();
				    for (int i_15_ = 0;
					 i_15_ < class74.anInt1399; i_15_++)
					fs[i_11_ + i_13_ + i_15_ * i_12_]
					    += fs_14_[i_15_];
				}
			    } else {
				int i_16_ = 0;
				while (i_16_ < anInt691) {
				    float[] fs_17_ = class74.method1281();
				    for (int i_18_ = 0;
					 i_18_ < class74.anInt1399; i_18_++) {
					fs[i_11_ + i_16_] += fs_17_[i_18_];
					i_16_++;
				    }
				}
			    }
			}
			if (++i_5_ >= i_3_)
			    break;
		    }
		}
	    }
	}
    }
    
    public Class28() {
	anInt689 = Class37_Sub24.method1041(24);
	anInt690 = Class37_Sub24.method1041(24);
	anInt691 = Class37_Sub24.method1041(24) + 1;
	anInt688 = Class37_Sub24.method1041(6) + 1;
	anInt693 = Class37_Sub24.method1041(8);
	int[] is = new int[anInt688];
	for (int i = 0; i < anInt688; i++) {
	    int i_19_ = 0;
	    int i_20_ = Class37_Sub24.method1041(3);
	    boolean bool = Class37_Sub24.method1039() != 0;
	    if (bool)
		i_19_ = Class37_Sub24.method1041(5);
	    is[i] = i_19_ << 3 | i_20_;
	}
	anIntArray687 = new int[anInt688 * 8];
	for (int i = 0; i < anInt688 * 8; i++)
	    anIntArray687[i] = ((is[i >> 3] & 1 << (i & 0x7)) != 0
				? Class37_Sub24.method1041(8) : -1);
    }
}
