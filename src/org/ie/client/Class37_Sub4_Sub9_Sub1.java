package org.ie.client;

/* Class37_Sub4_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub9_Sub1 extends Graphics2D
{
    public int anInt3858;
    public int[] anIntArray3859;
    public byte[] aByteArray3860;
    public int anInt3861;
    public int anInt3862;
    public int anInt3863;
    public int anInt3864;
    public int anInt3865;
    
    public void method596(int i, int i_0_, int i_1_) {
	for (int i_2_ = 0; i_2_ < anIntArray3859.length; i_2_++) {
	    int i_3_ = anIntArray3859[i_2_] >> 16 & 0xff;
	    i_3_ += i;
	    if (i_3_ < 0)
		i_3_ = 0;
	    else if (i_3_ > 255)
		i_3_ = 255;
	    int i_4_ = anIntArray3859[i_2_] >> 8 & 0xff;
	    i_4_ += i_0_;
	    if (i_4_ < 0)
		i_4_ = 0;
	    else if (i_4_ > 255)
		i_4_ = 255;
	    int i_5_ = anIntArray3859[i_2_] & 0xff;
	    i_5_ += i_1_;
	    if (i_5_ < 0)
		i_5_ = 0;
	    else if (i_5_ > 255)
		i_5_ = 255;
	    anIntArray3859[i_2_] = (i_3_ << 16) + (i_4_ << 8) + i_5_;
	}
    }
    
    public void method597(int i, int i_6_) {
	i += anInt3863;
	i_6_ += anInt3861;
	int i_7_ = i + i_6_ * Graphics2D.width;
	int i_8_ = 0;
	int i_9_ = anInt3862;
	int i_10_ = anInt3865;
	int i_11_ = Graphics2D.width - i_10_;
	int i_12_ = 0;
	if (i_6_ < Graphics2D.anInt2663) {
	    int i_13_ = Graphics2D.anInt2663 - i_6_;
	    i_9_ -= i_13_;
	    i_6_ = Graphics2D.anInt2663;
	    i_8_ += i_13_ * i_10_;
	    i_7_ += i_13_ * Graphics2D.width;
	}
	if (i_6_ + i_9_ > Graphics2D.anInt2664)
	    i_9_ -= i_6_ + i_9_ - Graphics2D.anInt2664;
	if (i < Graphics2D.anInt2661) {
	    int i_14_ = Graphics2D.anInt2661 - i;
	    i_10_ -= i_14_;
	    i = Graphics2D.anInt2661;
	    i_8_ += i_14_;
	    i_7_ += i_14_;
	    i_12_ += i_14_;
	    i_11_ += i_14_;
	}
	if (i + i_10_ > Graphics2D.anInt2667) {
	    int i_15_ = i + i_10_ - Graphics2D.anInt2667;
	    i_10_ -= i_15_;
	    i_12_ += i_15_;
	    i_11_ += i_15_;
	}
	if (i_10_ > 0 && i_9_ > 0)
	    method598(Graphics2D.pixels, aByteArray3860,
		      anIntArray3859, i_8_, i_7_, i_10_, i_9_, i_11_, i_12_);
    }
    
    public static void method598(int[] is, byte[] is_16_, int[] is_17_, int i,
				 int i_18_, int i_19_, int i_20_, int i_21_,
				 int i_22_) {
	int i_23_ = -(i_19_ >> 2);
	i_19_ = -(i_19_ & 0x3);
	for (int i_24_ = -i_20_; i_24_ < 0; i_24_++) {
	    for (int i_25_ = i_23_; i_25_ < 0; i_25_++) {
		int i_26_ = is_16_[i++];
		if (i_26_ != 0)
		    is[i_18_++] = is_17_[i_26_ & 0xff];
		else
		    i_18_++;
		i_26_ = is_16_[i++];
		if (i_26_ != 0)
		    is[i_18_++] = is_17_[i_26_ & 0xff];
		else
		    i_18_++;
		i_26_ = is_16_[i++];
		if (i_26_ != 0)
		    is[i_18_++] = is_17_[i_26_ & 0xff];
		else
		    i_18_++;
		i_26_ = is_16_[i++];
		if (i_26_ != 0)
		    is[i_18_++] = is_17_[i_26_ & 0xff];
		else
		    i_18_++;
	    }
	    for (int i_27_ = i_19_; i_27_ < 0; i_27_++) {
		int i_28_ = is_16_[i++];
		if (i_28_ != 0)
		    is[i_18_++] = is_17_[i_28_ & 0xff];
		else
		    i_18_++;
	    }
	    i_18_ += i_21_;
	    i += i_22_;
	}
    }
}
