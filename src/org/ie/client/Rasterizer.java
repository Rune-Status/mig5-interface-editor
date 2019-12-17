package org.ie.client;

/* Class37_Sub4_Sub9_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Rasterizer extends Graphics2D
{
    public static int[] anIntArray3910;
    public static int anInt3911;
    public static int[] anIntArray3912;
    public static int[] anIntArray3913 = new int[512];
    public static float aFloat3914;
    public static boolean aBoolean3915;
    public static int anInt3916;
    public static int[] anIntArray3917 = new int[1024];
    public static int anInt3918;
    public static int anInt3919;
    public static int anInt3920;
    public static boolean aBoolean3921;
    public static boolean aBoolean3922;
    public static int anInt3923;
    public static int anInt3924;
    public static int anInt3925;
    public static Interface3 anInterface3_3926;
    public static int anInt3927;
    public static boolean aBoolean3928;
    public static int[] anIntArray3929;
    public static int[] anIntArray3930;
    
    public static void method656(int i, int i_0_, int i_1_, int i_2_, int i_3_,
				 int i_4_, int i_5_, int i_6_, int i_7_) {
	int i_8_ = i_3_ - i_2_;
	int i_9_ = i_0_ - i;
	int i_10_ = i_4_ - i_2_;
	int i_11_ = i_1_ - i;
	int i_12_ = i_6_ - i_5_;
	int i_13_ = i_7_ - i_5_;
	int i_14_;
	if (i_1_ != i_0_)
	    i_14_ = (i_4_ - i_3_ << 16) / (i_1_ - i_0_);
	else
	    i_14_ = 0;
	int i_15_;
	if (i_0_ != i)
	    i_15_ = (i_8_ << 16) / i_9_;
	else
	    i_15_ = 0;
	int i_16_;
	if (i_1_ != i)
	    i_16_ = (i_10_ << 16) / i_11_;
	else
	    i_16_ = 0;
	int i_17_ = i_8_ * i_11_ - i_10_ * i_9_;
	if (i_17_ != 0) {
	    int i_18_ = (i_12_ * i_11_ - i_13_ * i_9_ << 8) / i_17_;
	    int i_19_ = (i_13_ * i_8_ - i_12_ * i_10_ << 8) / i_17_;
	    if (i <= i_0_ && i <= i_1_) {
		if (i < anInt3920) {
		    if (i_0_ > anInt3920)
			i_0_ = anInt3920;
		    if (i_1_ > anInt3920)
			i_1_ = anInt3920;
		    i_5_ = (i_5_ << 8) - i_18_ * i_2_ + i_18_;
		    if (i_0_ < i_1_) {
			i_4_ = i_2_ <<= 16;
			if (i < 0) {
			    i_4_ -= i_16_ * i;
			    i_2_ -= i_15_ * i;
			    i_5_ -= i_19_ * i;
			    i = 0;
			}
			i_3_ <<= 16;
			if (i_0_ < 0) {
			    i_3_ -= i_14_ * i_0_;
			    i_0_ = 0;
			}
			if (i != i_0_ && i_16_ < i_15_
			    || i == i_0_ && i_16_ > i_14_) {
			    i_1_ -= i_0_;
			    i_0_ -= i;
			    i = anIntArray3917[i];
			    while (--i_0_ >= 0) {
				method661(Graphics2D.pixels, i,
					  0, 0, i_4_ >> 16, i_2_ >> 16, i_5_,
					  i_18_);
				i_4_ += i_16_;
				i_2_ += i_15_;
				i_5_ += i_19_;
				i += Graphics2D.width;
			    }
			    while (--i_1_ >= 0) {
				method661(Graphics2D.pixels, i,
					  0, 0, i_4_ >> 16, i_3_ >> 16, i_5_,
					  i_18_);
				i_4_ += i_16_;
				i_3_ += i_14_;
				i_5_ += i_19_;
				i += Graphics2D.width;
			    }
			} else {
			    i_1_ -= i_0_;
			    i_0_ -= i;
			    i = anIntArray3917[i];
			    while (--i_0_ >= 0) {
				method661(Graphics2D.pixels, i,
					  0, 0, i_2_ >> 16, i_4_ >> 16, i_5_,
					  i_18_);
				i_4_ += i_16_;
				i_2_ += i_15_;
				i_5_ += i_19_;
				i += Graphics2D.width;
			    }
			    while (--i_1_ >= 0) {
				method661(Graphics2D.pixels, i,
					  0, 0, i_3_ >> 16, i_4_ >> 16, i_5_,
					  i_18_);
				i_4_ += i_16_;
				i_3_ += i_14_;
				i_5_ += i_19_;
				i += Graphics2D.width;
			    }
			}
		    } else {
			i_3_ = i_2_ <<= 16;
			if (i < 0) {
			    i_3_ -= i_16_ * i;
			    i_2_ -= i_15_ * i;
			    i_5_ -= i_19_ * i;
			    i = 0;
			}
			i_4_ <<= 16;
			if (i_1_ < 0) {
			    i_4_ -= i_14_ * i_1_;
			    i_1_ = 0;
			}
			if (i != i_1_ && i_16_ < i_15_
			    || i == i_1_ && i_14_ > i_15_) {
			    i_0_ -= i_1_;
			    i_1_ -= i;
			    i = anIntArray3917[i];
			    while (--i_1_ >= 0) {
				method661(Graphics2D.pixels, i,
					  0, 0, i_3_ >> 16, i_2_ >> 16, i_5_,
					  i_18_);
				i_3_ += i_16_;
				i_2_ += i_15_;
				i_5_ += i_19_;
				i += Graphics2D.width;
			    }
			    while (--i_0_ >= 0) {
				method661(Graphics2D.pixels, i,
					  0, 0, i_4_ >> 16, i_2_ >> 16, i_5_,
					  i_18_);
				i_4_ += i_14_;
				i_2_ += i_15_;
				i_5_ += i_19_;
				i += Graphics2D.width;
			    }
			} else {
			    i_0_ -= i_1_;
			    i_1_ -= i;
			    i = anIntArray3917[i];
			    while (--i_1_ >= 0) {
				method661(Graphics2D.pixels, i,
					  0, 0, i_2_ >> 16, i_3_ >> 16, i_5_,
					  i_18_);
				i_3_ += i_16_;
				i_2_ += i_15_;
				i_5_ += i_19_;
				i += Graphics2D.width;
			    }
			    while (--i_0_ >= 0) {
				method661(Graphics2D.pixels, i,
					  0, 0, i_2_ >> 16, i_4_ >> 16, i_5_,
					  i_18_);
				i_4_ += i_14_;
				i_2_ += i_15_;
				i_5_ += i_19_;
				i += Graphics2D.width;
			    }
			}
		    }
		}
	    } else if (i_0_ <= i_1_) {
		if (i_0_ < anInt3920) {
		    if (i_1_ > anInt3920)
			i_1_ = anInt3920;
		    if (i > anInt3920)
			i = anInt3920;
		    i_6_ = (i_6_ << 8) - i_18_ * i_3_ + i_18_;
		    if (i_1_ < i) {
			i_2_ = i_3_ <<= 16;
			if (i_0_ < 0) {
			    i_2_ -= i_15_ * i_0_;
			    i_3_ -= i_14_ * i_0_;
			    i_6_ -= i_19_ * i_0_;
			    i_0_ = 0;
			}
			i_4_ <<= 16;
			if (i_1_ < 0) {
			    i_4_ -= i_16_ * i_1_;
			    i_1_ = 0;
			}
			if (i_0_ != i_1_ && i_15_ < i_14_
			    || i_0_ == i_1_ && i_15_ > i_16_) {
			    i -= i_1_;
			    i_1_ -= i_0_;
			    i_0_ = anIntArray3917[i_0_];
			    while (--i_1_ >= 0) {
				method661(Graphics2D.pixels,
					  i_0_, 0, 0, i_2_ >> 16, i_3_ >> 16,
					  i_6_, i_18_);
				i_2_ += i_15_;
				i_3_ += i_14_;
				i_6_ += i_19_;
				i_0_ += Graphics2D.width;
			    }
			    while (--i >= 0) {
				method661(Graphics2D.pixels,
					  i_0_, 0, 0, i_2_ >> 16, i_4_ >> 16,
					  i_6_, i_18_);
				i_2_ += i_15_;
				i_4_ += i_16_;
				i_6_ += i_19_;
				i_0_ += Graphics2D.width;
			    }
			} else {
			    i -= i_1_;
			    i_1_ -= i_0_;
			    i_0_ = anIntArray3917[i_0_];
			    while (--i_1_ >= 0) {
				method661(Graphics2D.pixels,
					  i_0_, 0, 0, i_3_ >> 16, i_2_ >> 16,
					  i_6_, i_18_);
				i_2_ += i_15_;
				i_3_ += i_14_;
				i_6_ += i_19_;
				i_0_ += Graphics2D.width;
			    }
			    while (--i >= 0) {
				method661(Graphics2D.pixels,
					  i_0_, 0, 0, i_4_ >> 16, i_2_ >> 16,
					  i_6_, i_18_);
				i_2_ += i_15_;
				i_4_ += i_16_;
				i_6_ += i_19_;
				i_0_ += Graphics2D.width;
			    }
			}
		    } else {
			i_4_ = i_3_ <<= 16;
			if (i_0_ < 0) {
			    i_4_ -= i_15_ * i_0_;
			    i_3_ -= i_14_ * i_0_;
			    i_6_ -= i_19_ * i_0_;
			    i_0_ = 0;
			}
			i_2_ <<= 16;
			if (i < 0) {
			    i_2_ -= i_16_ * i;
			    i = 0;
			}
			if (i_15_ < i_14_) {
			    i_1_ -= i;
			    i -= i_0_;
			    i_0_ = anIntArray3917[i_0_];
			    while (--i >= 0) {
				method661(Graphics2D.pixels,
					  i_0_, 0, 0, i_4_ >> 16, i_3_ >> 16,
					  i_6_, i_18_);
				i_4_ += i_15_;
				i_3_ += i_14_;
				i_6_ += i_19_;
				i_0_ += Graphics2D.width;
			    }
			    while (--i_1_ >= 0) {
				method661(Graphics2D.pixels,
					  i_0_, 0, 0, i_2_ >> 16, i_3_ >> 16,
					  i_6_, i_18_);
				i_2_ += i_16_;
				i_3_ += i_14_;
				i_6_ += i_19_;
				i_0_ += Graphics2D.width;
			    }
			} else {
			    i_1_ -= i;
			    i -= i_0_;
			    i_0_ = anIntArray3917[i_0_];
			    while (--i >= 0) {
				method661(Graphics2D.pixels,
					  i_0_, 0, 0, i_3_ >> 16, i_4_ >> 16,
					  i_6_, i_18_);
				i_4_ += i_15_;
				i_3_ += i_14_;
				i_6_ += i_19_;
				i_0_ += Graphics2D.width;
			    }
			    while (--i_1_ >= 0) {
				method661(Graphics2D.pixels,
					  i_0_, 0, 0, i_3_ >> 16, i_2_ >> 16,
					  i_6_, i_18_);
				i_2_ += i_16_;
				i_3_ += i_14_;
				i_6_ += i_19_;
				i_0_ += Graphics2D.width;
			    }
			}
		    }
		}
	    } else if (i_1_ < anInt3920) {
		if (i > anInt3920)
		    i = anInt3920;
		if (i_0_ > anInt3920)
		    i_0_ = anInt3920;
		i_7_ = (i_7_ << 8) - i_18_ * i_4_ + i_18_;
		if (i < i_0_) {
		    i_3_ = i_4_ <<= 16;
		    if (i_1_ < 0) {
			i_3_ -= i_14_ * i_1_;
			i_4_ -= i_16_ * i_1_;
			i_7_ -= i_19_ * i_1_;
			i_1_ = 0;
		    }
		    i_2_ <<= 16;
		    if (i < 0) {
			i_2_ -= i_15_ * i;
			i = 0;
		    }
		    if (i_14_ < i_16_) {
			i_0_ -= i;
			i -= i_1_;
			i_1_ = anIntArray3917[i_1_];
			while (--i >= 0) {
			    method661(Graphics2D.pixels, i_1_,
				      0, 0, i_3_ >> 16, i_4_ >> 16, i_7_,
				      i_18_);
			    i_3_ += i_14_;
			    i_4_ += i_16_;
			    i_7_ += i_19_;
			    i_1_ += Graphics2D.width;
			}
			while (--i_0_ >= 0) {
			    method661(Graphics2D.pixels, i_1_,
				      0, 0, i_3_ >> 16, i_2_ >> 16, i_7_,
				      i_18_);
			    i_3_ += i_14_;
			    i_2_ += i_15_;
			    i_7_ += i_19_;
			    i_1_ += Graphics2D.width;
			}
		    } else {
			i_0_ -= i;
			i -= i_1_;
			i_1_ = anIntArray3917[i_1_];
			while (--i >= 0) {
			    method661(Graphics2D.pixels, i_1_,
				      0, 0, i_4_ >> 16, i_3_ >> 16, i_7_,
				      i_18_);
			    i_3_ += i_14_;
			    i_4_ += i_16_;
			    i_7_ += i_19_;
			    i_1_ += Graphics2D.width;
			}
			while (--i_0_ >= 0) {
			    method661(Graphics2D.pixels, i_1_,
				      0, 0, i_2_ >> 16, i_3_ >> 16, i_7_,
				      i_18_);
			    i_3_ += i_14_;
			    i_2_ += i_15_;
			    i_7_ += i_19_;
			    i_1_ += Graphics2D.width;
			}
		    }
		} else {
		    i_2_ = i_4_ <<= 16;
		    if (i_1_ < 0) {
			i_2_ -= i_14_ * i_1_;
			i_4_ -= i_16_ * i_1_;
			i_7_ -= i_19_ * i_1_;
			i_1_ = 0;
		    }
		    i_3_ <<= 16;
		    if (i_0_ < 0) {
			i_3_ -= i_15_ * i_0_;
			i_0_ = 0;
		    }
		    if (i_14_ < i_16_) {
			i -= i_0_;
			i_0_ -= i_1_;
			i_1_ = anIntArray3917[i_1_];
			while (--i_0_ >= 0) {
			    method661(Graphics2D.pixels, i_1_,
				      0, 0, i_2_ >> 16, i_4_ >> 16, i_7_,
				      i_18_);
			    i_2_ += i_14_;
			    i_4_ += i_16_;
			    i_7_ += i_19_;
			    i_1_ += Graphics2D.width;
			}
			while (--i >= 0) {
			    method661(Graphics2D.pixels, i_1_,
				      0, 0, i_3_ >> 16, i_4_ >> 16, i_7_,
				      i_18_);
			    i_3_ += i_15_;
			    i_4_ += i_16_;
			    i_7_ += i_19_;
			    i_1_ += Graphics2D.width;
			}
		    } else {
			i -= i_0_;
			i_0_ -= i_1_;
			i_1_ = anIntArray3917[i_1_];
			while (--i_0_ >= 0) {
			    method661(Graphics2D.pixels, i_1_,
				      0, 0, i_4_ >> 16, i_2_ >> 16, i_7_,
				      i_18_);
			    i_2_ += i_14_;
			    i_4_ += i_16_;
			    i_7_ += i_19_;
			    i_1_ += Graphics2D.width;
			}
			while (--i >= 0) {
			    method661(Graphics2D.pixels, i_1_,
				      0, 0, i_4_ >> 16, i_3_ >> 16, i_7_,
				      i_18_);
			    i_3_ += i_15_;
			    i_4_ += i_16_;
			    i_7_ += i_19_;
			    i_1_ += Graphics2D.width;
			}
		    }
		}
	    }
	}
    }
    
    public static void method657() {
	anIntArray3917 = null;
	anIntArray3930 = null;
	anInterface3_3926 = null;
	anIntArray3913 = null;
	anIntArray3912 = null;
	anIntArray3910 = null;
	anIntArray3929 = null;
    }
    
    public static int method658(int i, int i_20_) {
	i_20_ = i_20_ * (i & 0x7f) >> 7;
	if (i_20_ < 2)
	    i_20_ = 2;
	else if (i_20_ > 126)
	    i_20_ = 126;
	return (i & 0xff80) + i_20_;
    }
    
    public static void method659() {
	anInt3911 = anInt3918 / 2;
	anInt3924 = anInt3920 / 2;
	anInt3923 = -anInt3911;
	anInt3916 = anInt3918 - anInt3911;
	anInt3927 = -anInt3924;
	anInt3919 = anInt3920 - anInt3924;
    }
    
    public static void method660(int[] is, int[] is_21_, int i, int i_22_,
				 int i_23_, int i_24_, int i_25_, int i_26_,
				 int i_27_, int i_28_, int i_29_, int i_30_,
				 int i_31_, int i_32_, int i_33_) {
	if (aBoolean3922) {
	    if (i_25_ > anInt3918)
		i_25_ = anInt3918;
	    if (i_24_ < 0)
		i_24_ = 0;
	}
	if (i_24_ < i_25_) {
	    i_23_ += i_24_;
	    i_26_ += i_27_ * i_24_;
	    int i_34_ = i_25_ - i_24_;
	    do {
		if (aBoolean3915) {
		    int i_35_ = i_24_ - anInt3911;
		    i_28_ += (i_31_ >> 3) * i_35_;
		    i_29_ += (i_32_ >> 3) * i_35_;
		    i_30_ += (i_33_ >> 3) * i_35_;
		    int i_36_ = i_30_ >> 12;
		    int i_37_;
		    int i_38_;
		    if (i_36_ != 0) {
			i_37_ = i_28_ / i_36_;
			i_38_ = i_29_ / i_36_;
			if (i_37_ < 0)
			    i_37_ = 0;
			else if (i_37_ > 4032)
			    i_37_ = 4032;
		    } else {
			i_37_ = 0;
			i_38_ = 0;
		    }
		    i_28_ += i_31_;
		    i_29_ += i_32_;
		    i_30_ += i_33_;
		    i_36_ = i_30_ >> 12;
		    int i_39_;
		    int i_40_;
		    if (i_36_ != 0) {
			i_39_ = i_28_ / i_36_;
			i_40_ = i_29_ / i_36_;
			if (i_39_ < 0)
			    i_39_ = 0;
			else if (i_39_ > 4032)
			    i_39_ = 4032;
		    } else {
			i_39_ = 0;
			i_40_ = 0;
		    }
		    i = (i_37_ << 20) + i_38_;
		    int i_41_
			= (i_39_ - i_37_ >> 3 << 20) + (i_40_ - i_38_ >> 3);
		    i_34_ >>= 3;
		    i_27_ <<= 3;
		    int i_42_ = i_26_ >> 8;
		    if (aBoolean3928) {
			if (i_34_ > 0) {
			    do {
				i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)];
				is[i_23_++]
				    = (((i_22_ & 0xff00ff) * i_42_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_42_
					  & 0xff0000)) >> 8;
				i += i_41_;
				i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)];
				is[i_23_++]
				    = (((i_22_ & 0xff00ff) * i_42_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_42_
					  & 0xff0000)) >> 8;
				i += i_41_;
				i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)];
				is[i_23_++]
				    = (((i_22_ & 0xff00ff) * i_42_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_42_
					  & 0xff0000)) >> 8;
				i += i_41_;
				i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)];
				is[i_23_++]
				    = (((i_22_ & 0xff00ff) * i_42_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_42_
					  & 0xff0000)) >> 8;
				i += i_41_;
				i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)];
				is[i_23_++]
				    = (((i_22_ & 0xff00ff) * i_42_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_42_
					  & 0xff0000)) >> 8;
				i += i_41_;
				i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)];
				is[i_23_++]
				    = (((i_22_ & 0xff00ff) * i_42_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_42_
					  & 0xff0000)) >> 8;
				i += i_41_;
				i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)];
				is[i_23_++]
				    = (((i_22_ & 0xff00ff) * i_42_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_42_
					  & 0xff0000)) >> 8;
				i += i_41_;
				i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)];
				is[i_23_++]
				    = (((i_22_ & 0xff00ff) * i_42_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_42_
					  & 0xff0000)) >> 8;
				i += i_41_;
				i_37_ = i_39_;
				i_38_ = i_40_;
				i_28_ += i_31_;
				i_29_ += i_32_;
				i_30_ += i_33_;
				i_36_ = i_30_ >> 12;
				if (i_36_ != 0) {
				    i_39_ = i_28_ / i_36_;
				    i_40_ = i_29_ / i_36_;
				    if (i_39_ < 0)
					i_39_ = 0;
				    else if (i_39_ > 4032)
					i_39_ = 4032;
				} else {
				    i_39_ = 0;
				    i_40_ = 0;
				}
				i = (i_37_ << 20) + i_38_;
				i_41_ = ((i_39_ - i_37_ >> 3 << 20)
					 + (i_40_ - i_38_ >> 3));
				i_26_ += i_27_;
				i_42_ = i_26_ >> 8;
			    } while (--i_34_ > 0);
			}
			i_34_ = i_25_ - i_24_ & 0x7;
			if (i_34_ > 0) {
			    do {
				i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)];
				is[i_23_++]
				    = (((i_22_ & 0xff00ff) * i_42_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_42_
					  & 0xff0000)) >> 8;
				i += i_41_;
			    } while (--i_34_ > 0);
			}
		    } else {
			if (i_34_ > 0) {
			    do {
				if ((i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_23_] = (((i_22_ & 0xff00ff) * i_42_
						  & ~0xff00ff)
						 + ((i_22_ & 0xff00) * i_42_
						    & 0xff0000)) >> 8;
				i_23_++;
				i += i_41_;
				if ((i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_23_] = (((i_22_ & 0xff00ff) * i_42_
						  & ~0xff00ff)
						 + ((i_22_ & 0xff00) * i_42_
						    & 0xff0000)) >> 8;
				i_23_++;
				i += i_41_;
				if ((i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_23_] = (((i_22_ & 0xff00ff) * i_42_
						  & ~0xff00ff)
						 + ((i_22_ & 0xff00) * i_42_
						    & 0xff0000)) >> 8;
				i_23_++;
				i += i_41_;
				if ((i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_23_] = (((i_22_ & 0xff00ff) * i_42_
						  & ~0xff00ff)
						 + ((i_22_ & 0xff00) * i_42_
						    & 0xff0000)) >> 8;
				i_23_++;
				i += i_41_;
				if ((i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_23_] = (((i_22_ & 0xff00ff) * i_42_
						  & ~0xff00ff)
						 + ((i_22_ & 0xff00) * i_42_
						    & 0xff0000)) >> 8;
				i_23_++;
				i += i_41_;
				if ((i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_23_] = (((i_22_ & 0xff00ff) * i_42_
						  & ~0xff00ff)
						 + ((i_22_ & 0xff00) * i_42_
						    & 0xff0000)) >> 8;
				i_23_++;
				i += i_41_;
				if ((i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_23_] = (((i_22_ & 0xff00ff) * i_42_
						  & ~0xff00ff)
						 + ((i_22_ & 0xff00) * i_42_
						    & 0xff0000)) >> 8;
				i_23_++;
				i += i_41_;
				if ((i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_23_] = (((i_22_ & 0xff00ff) * i_42_
						  & ~0xff00ff)
						 + ((i_22_ & 0xff00) * i_42_
						    & 0xff0000)) >> 8;
				i_23_++;
				i += i_41_;
				i_37_ = i_39_;
				i_38_ = i_40_;
				i_28_ += i_31_;
				i_29_ += i_32_;
				i_30_ += i_33_;
				i_36_ = i_30_ >> 12;
				if (i_36_ != 0) {
				    i_39_ = i_28_ / i_36_;
				    i_40_ = i_29_ / i_36_;
				    if (i_39_ < 0)
					i_39_ = 0;
				    else if (i_39_ > 4032)
					i_39_ = 4032;
				} else {
				    i_39_ = 0;
				    i_40_ = 0;
				}
				i = (i_37_ << 20) + i_38_;
				i_41_ = ((i_39_ - i_37_ >> 3 << 20)
					 + (i_40_ - i_38_ >> 3));
				i_26_ += i_27_;
				i_42_ = i_26_ >> 8;
			    } while (--i_34_ > 0);
			}
			i_34_ = i_25_ - i_24_ & 0x7;
			if (i_34_ <= 0)
			    break;
			do {
			    if ((i_22_ = is_21_[(i & 0xfc0) + (i >>> 26)])
				!= 0)
				is[i_23_]
				    = (((i_22_ & 0xff00ff) * i_42_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_42_
					  & 0xff0000)) >> 8;
			    i_23_++;
			    i += i_41_;
			} while (--i_34_ > 0);
		    }
		    break;
		}
		int i_43_ = i_24_ - anInt3911;
		i_28_ += (i_31_ >> 3) * i_43_;
		i_29_ += (i_32_ >> 3) * i_43_;
		i_30_ += (i_33_ >> 3) * i_43_;
		int i_44_ = i_30_ >> 14;
		int i_45_;
		int i_46_;
		if (i_44_ != 0) {
		    i_45_ = i_28_ / i_44_;
		    i_46_ = i_29_ / i_44_;
		    if (i_45_ < 0)
			i_45_ = 0;
		    else if (i_45_ > 16256)
			i_45_ = 16256;
		} else {
		    i_45_ = 0;
		    i_46_ = 0;
		}
		i_28_ += i_31_;
		i_29_ += i_32_;
		i_30_ += i_33_;
		i_44_ = i_30_ >> 14;
		int i_47_;
		int i_48_;
		if (i_44_ != 0) {
		    i_47_ = i_28_ / i_44_;
		    i_48_ = i_29_ / i_44_;
		    if (i_47_ < 0)
			i_47_ = 0;
		    else if (i_47_ > 16256)
			i_47_ = 16256;
		} else {
		    i_47_ = 0;
		    i_48_ = 0;
		}
		i = (i_45_ << 18) + i_46_;
		int i_49_ = (i_47_ - i_45_ >> 3 << 18) + (i_48_ - i_46_ >> 3);
		i_34_ >>= 3;
		i_27_ <<= 3;
		int i_50_ = i_26_ >> 8;
		if (aBoolean3928) {
		    if (i_34_ > 0) {
			do {
			    i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)];
			    is[i_23_++]
				= ((((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				    + ((i_22_ & 0xff00) * i_50_ & 0xff0000))
				   >> 8);
			    i += i_49_;
			    i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)];
			    is[i_23_++]
				= ((((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				    + ((i_22_ & 0xff00) * i_50_ & 0xff0000))
				   >> 8);
			    i += i_49_;
			    i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)];
			    is[i_23_++]
				= ((((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				    + ((i_22_ & 0xff00) * i_50_ & 0xff0000))
				   >> 8);
			    i += i_49_;
			    i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)];
			    is[i_23_++]
				= ((((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				    + ((i_22_ & 0xff00) * i_50_ & 0xff0000))
				   >> 8);
			    i += i_49_;
			    i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)];
			    is[i_23_++]
				= ((((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				    + ((i_22_ & 0xff00) * i_50_ & 0xff0000))
				   >> 8);
			    i += i_49_;
			    i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)];
			    is[i_23_++]
				= ((((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				    + ((i_22_ & 0xff00) * i_50_ & 0xff0000))
				   >> 8);
			    i += i_49_;
			    i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)];
			    is[i_23_++]
				= ((((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				    + ((i_22_ & 0xff00) * i_50_ & 0xff0000))
				   >> 8);
			    i += i_49_;
			    i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)];
			    is[i_23_++]
				= ((((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				    + ((i_22_ & 0xff00) * i_50_ & 0xff0000))
				   >> 8);
			    i += i_49_;
			    i_45_ = i_47_;
			    i_46_ = i_48_;
			    i_28_ += i_31_;
			    i_29_ += i_32_;
			    i_30_ += i_33_;
			    i_44_ = i_30_ >> 14;
			    if (i_44_ != 0) {
				i_47_ = i_28_ / i_44_;
				i_48_ = i_29_ / i_44_;
				if (i_47_ < 0)
				    i_47_ = 0;
				else if (i_47_ > 16256)
				    i_47_ = 16256;
			    } else {
				i_47_ = 0;
				i_48_ = 0;
			    }
			    i = (i_45_ << 18) + i_46_;
			    i_49_ = (i_47_ - i_45_ >> 3 << 18) + (i_48_ - i_46_
								  >> 3);
			    i_26_ += i_27_;
			    i_50_ = i_26_ >> 8;
			} while (--i_34_ > 0);
		    }
		    i_34_ = i_25_ - i_24_ & 0x7;
		    if (i_34_ > 0) {
			do {
			    i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)];
			    is[i_23_++]
				= ((((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				    + ((i_22_ & 0xff00) * i_50_ & 0xff0000))
				   >> 8);
			    i += i_49_;
			} while (--i_34_ > 0);
			break;
		    }
		} else {
		    if (i_34_ > 0) {
			do {
			    if ((i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_23_]
				    = (((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_50_
					  & 0xff0000)) >> 8;
			    i_23_++;
			    i += i_49_;
			    if ((i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_23_]
				    = (((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_50_
					  & 0xff0000)) >> 8;
			    i_23_++;
			    i += i_49_;
			    if ((i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_23_]
				    = (((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_50_
					  & 0xff0000)) >> 8;
			    i_23_++;
			    i += i_49_;
			    if ((i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_23_]
				    = (((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_50_
					  & 0xff0000)) >> 8;
			    i_23_++;
			    i += i_49_;
			    if ((i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_23_]
				    = (((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_50_
					  & 0xff0000)) >> 8;
			    i_23_++;
			    i += i_49_;
			    if ((i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_23_]
				    = (((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_50_
					  & 0xff0000)) >> 8;
			    i_23_++;
			    i += i_49_;
			    if ((i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_23_]
				    = (((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_50_
					  & 0xff0000)) >> 8;
			    i_23_++;
			    i += i_49_;
			    if ((i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_23_]
				    = (((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_50_
					  & 0xff0000)) >> 8;
			    i_23_++;
			    i += i_49_;
			    i_45_ = i_47_;
			    i_46_ = i_48_;
			    i_28_ += i_31_;
			    i_29_ += i_32_;
			    i_30_ += i_33_;
			    i_44_ = i_30_ >> 14;
			    if (i_44_ != 0) {
				i_47_ = i_28_ / i_44_;
				i_48_ = i_29_ / i_44_;
				if (i_47_ < 0)
				    i_47_ = 0;
				else if (i_47_ > 16256)
				    i_47_ = 16256;
			    } else {
				i_47_ = 0;
				i_48_ = 0;
			    }
			    i = (i_45_ << 18) + i_46_;
			    i_49_ = (i_47_ - i_45_ >> 3 << 18) + (i_48_ - i_46_
								  >> 3);
			    i_26_ += i_27_;
			    i_50_ = i_26_ >> 8;
			} while (--i_34_ > 0);
		    }
		    i_34_ = i_25_ - i_24_ & 0x7;
		    if (i_34_ > 0) {
			do {
			    if ((i_22_ = is_21_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_23_]
				    = (((i_22_ & 0xff00ff) * i_50_ & ~0xff00ff)
				       + ((i_22_ & 0xff00) * i_50_
					  & 0xff0000)) >> 8;
			    i_23_++;
			    i += i_49_;
			} while (--i_34_ > 0);
		    }
		}
	    } while (false);
	}
    }
    
    public static void method661(int[] is, int i, int i_51_, int i_52_,
				 int i_53_, int i_54_, int i_55_, int i_56_) {
	if (aBoolean3922) {
	    if (i_54_ > anInt3918)
		i_54_ = anInt3918;
	    if (i_53_ < 0)
		i_53_ = 0;
	}
	if (i_53_ < i_54_) {
	    i += i_53_;
	    i_55_ += i_56_ * i_53_;
	    if (aBoolean3921) {
		i_52_ = i_54_ - i_53_ >> 2;
		i_56_ <<= 2;
		if (anInt3925 == 0) {
		    if (i_52_ > 0) {
			do {
			    i_51_ = anIntArray3930[i_55_ >> 8];
			    i_55_ += i_56_;
			    is[i++] = i_51_;
			    is[i++] = i_51_;
			    is[i++] = i_51_;
			    is[i++] = i_51_;
			} while (--i_52_ > 0);
		    }
		    i_52_ = i_54_ - i_53_ & 0x3;
		    if (i_52_ > 0) {
			i_51_ = anIntArray3930[i_55_ >> 8];
			do
			    is[i++] = i_51_;
			while (--i_52_ > 0);
		    }
		} else {
		    int i_57_ = anInt3925;
		    int i_58_ = 256 - anInt3925;
		    if (i_52_ > 0) {
			do {
			    i_51_ = anIntArray3930[i_55_ >> 8];
			    i_55_ += i_56_;
			    i_51_
				= (((i_51_ & 0xff00ff) * i_58_ >> 8 & 0xff00ff)
				   + ((i_51_ & 0xff00) * i_58_ >> 8 & 0xff00));
			    int i_59_ = is[i];
			    is[i++]
				= (i_51_
				   + ((i_59_ & 0xff00ff) * i_57_ >> 8
				      & 0xff00ff)
				   + ((i_59_ & 0xff00) * i_57_ >> 8 & 0xff00));
			    i_59_ = is[i];
			    is[i++]
				= (i_51_
				   + ((i_59_ & 0xff00ff) * i_57_ >> 8
				      & 0xff00ff)
				   + ((i_59_ & 0xff00) * i_57_ >> 8 & 0xff00));
			    i_59_ = is[i];
			    is[i++]
				= (i_51_
				   + ((i_59_ & 0xff00ff) * i_57_ >> 8
				      & 0xff00ff)
				   + ((i_59_ & 0xff00) * i_57_ >> 8 & 0xff00));
			    i_59_ = is[i];
			    is[i++]
				= (i_51_
				   + ((i_59_ & 0xff00ff) * i_57_ >> 8
				      & 0xff00ff)
				   + ((i_59_ & 0xff00) * i_57_ >> 8 & 0xff00));
			} while (--i_52_ > 0);
		    }
		    i_52_ = i_54_ - i_53_ & 0x3;
		    if (i_52_ > 0) {
			i_51_ = anIntArray3930[i_55_ >> 8];
			i_51_ = (((i_51_ & 0xff00ff) * i_58_ >> 8 & 0xff00ff)
				 + ((i_51_ & 0xff00) * i_58_ >> 8 & 0xff00));
			do {
			    int i_60_ = is[i];
			    is[i++]
				= (i_51_
				   + ((i_60_ & 0xff00ff) * i_57_ >> 8
				      & 0xff00ff)
				   + ((i_60_ & 0xff00) * i_57_ >> 8 & 0xff00));
			} while (--i_52_ > 0);
		    }
		}
	    } else {
		i_52_ = i_54_ - i_53_;
		if (anInt3925 == 0) {
		    do {
			is[i++] = anIntArray3930[i_55_ >> 8];
			i_55_ += i_56_;
		    } while (--i_52_ > 0);
		} else {
		    int i_61_ = anInt3925;
		    int i_62_ = 256 - anInt3925;
		    do {
			i_51_ = anIntArray3930[i_55_ >> 8];
			i_55_ += i_56_;
			i_51_ = (((i_51_ & 0xff00ff) * i_62_ >> 8 & 0xff00ff)
				 + ((i_51_ & 0xff00) * i_62_ >> 8 & 0xff00));
			int i_63_ = is[i];
			is[i++]
			    = (i_51_
			       + ((i_63_ & 0xff00ff) * i_61_ >> 8 & 0xff00ff)
			       + ((i_63_ & 0xff00) * i_61_ >> 8 & 0xff00));
		    } while (--i_52_ > 0);
		}
	    }
	}
    }
    
    public static void method662(int[] is, int i, int i_64_, int i_65_,
				 int i_66_, int i_67_) {
	if (aBoolean3922) {
	    if (i_67_ > anInt3918)
		i_67_ = anInt3918;
	    if (i_66_ < 0)
		i_66_ = 0;
	}
	if (i_66_ < i_67_) {
	    i += i_66_;
	    i_65_ = i_67_ - i_66_ >> 2;
	    if (anInt3925 == 0) {
		while (--i_65_ >= 0) {
		    is[i++] = i_64_;
		    is[i++] = i_64_;
		    is[i++] = i_64_;
		    is[i++] = i_64_;
		}
		i_65_ = i_67_ - i_66_ & 0x3;
		while (--i_65_ >= 0)
		    is[i++] = i_64_;
	    } else if (anInt3925 == 254) {
		while (--i_65_ >= 0) {
		    is[i++] = is[i];
		    is[i++] = is[i];
		    is[i++] = is[i];
		    is[i++] = is[i];
		}
		i_65_ = i_67_ - i_66_ & 0x3;
		while (--i_65_ >= 0)
		    is[i++] = is[i];
	    } else {
		int i_68_ = anInt3925;
		int i_69_ = 256 - anInt3925;
		i_64_ = (((i_64_ & 0xff00ff) * i_69_ >> 8 & 0xff00ff)
			 + ((i_64_ & 0xff00) * i_69_ >> 8 & 0xff00));
		while (--i_65_ >= 0) {
		    int i_70_ = is[i];
		    is[i++]
			= (i_64_ + ((i_70_ & 0xff00ff) * i_68_ >> 8 & 0xff00ff)
			   + ((i_70_ & 0xff00) * i_68_ >> 8 & 0xff00));
		    i_70_ = is[i];
		    is[i++]
			= (i_64_ + ((i_70_ & 0xff00ff) * i_68_ >> 8 & 0xff00ff)
			   + ((i_70_ & 0xff00) * i_68_ >> 8 & 0xff00));
		    i_70_ = is[i];
		    is[i++]
			= (i_64_ + ((i_70_ & 0xff00ff) * i_68_ >> 8 & 0xff00ff)
			   + ((i_70_ & 0xff00) * i_68_ >> 8 & 0xff00));
		    i_70_ = is[i];
		    is[i++]
			= (i_64_ + ((i_70_ & 0xff00ff) * i_68_ >> 8 & 0xff00ff)
			   + ((i_70_ & 0xff00) * i_68_ >> 8 & 0xff00));
		}
		i_65_ = i_67_ - i_66_ & 0x3;
		while (--i_65_ >= 0) {
		    int i_71_ = is[i];
		    is[i++]
			= (i_64_ + ((i_71_ & 0xff00ff) * i_68_ >> 8 & 0xff00ff)
			   + ((i_71_ & 0xff00) * i_68_ >> 8 & 0xff00));
		}
	    }
	}
    }
    
    public static void method663(int[] is, int[] is_72_, int i, int i_73_,
				 int i_74_, int i_75_, int i_76_, int i_77_,
				 int i_78_, int i_79_, int i_80_, int i_81_,
				 int i_82_, int i_83_, int i_84_) {
	if (aBoolean3922) {
	    if (i_76_ > anInt3918)
		i_76_ = anInt3918;
	    if (i_75_ < 0)
		i_75_ = 0;
	}
	if (i_75_ < i_76_) {
	    i_74_ += i_75_;
	    i_77_ += i_78_ * i_75_;
	    int i_85_ = i_76_ - i_75_;
	    do {
		if (aBoolean3915) {
		    int i_86_ = i_75_ - anInt3911;
		    i_79_ += i_82_ * i_86_;
		    i_80_ += i_83_ * i_86_;
		    i_81_ += i_84_ * i_86_;
		    int i_87_ = i_81_ >> 12;
		    int i_88_;
		    int i_89_;
		    if (i_87_ != 0) {
			i_88_ = i_79_ / i_87_;
			i_89_ = i_80_ / i_87_;
		    } else {
			i_88_ = 0;
			i_89_ = 0;
		    }
		    i_79_ += i_82_ * i_85_;
		    i_80_ += i_83_ * i_85_;
		    i_81_ += i_84_ * i_85_;
		    i_87_ = i_81_ >> 12;
		    int i_90_;
		    int i_91_;
		    if (i_87_ != 0) {
			i_90_ = i_79_ / i_87_;
			i_91_ = i_80_ / i_87_;
		    } else {
			i_90_ = 0;
			i_91_ = 0;
		    }
		    i = (i_88_ << 20) + i_89_;
		    int i_92_ = (((i_90_ - i_88_) / i_85_ << 20)
				 + (i_91_ - i_89_) / i_85_);
		    i_85_ >>= 3;
		    i_78_ <<= 3;
		    int i_93_ = i_77_ >> 8;
		    if (aBoolean3928) {
			if (i_85_ > 0) {
			    do {
				i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)];
				is[i_74_++]
				    = (((i_73_ & 0xff00ff) * i_93_ & ~0xff00ff)
				       + ((i_73_ & 0xff00) * i_93_
					  & 0xff0000)) >> 8;
				i += i_92_;
				i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)];
				is[i_74_++]
				    = (((i_73_ & 0xff00ff) * i_93_ & ~0xff00ff)
				       + ((i_73_ & 0xff00) * i_93_
					  & 0xff0000)) >> 8;
				i += i_92_;
				i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)];
				is[i_74_++]
				    = (((i_73_ & 0xff00ff) * i_93_ & ~0xff00ff)
				       + ((i_73_ & 0xff00) * i_93_
					  & 0xff0000)) >> 8;
				i += i_92_;
				i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)];
				is[i_74_++]
				    = (((i_73_ & 0xff00ff) * i_93_ & ~0xff00ff)
				       + ((i_73_ & 0xff00) * i_93_
					  & 0xff0000)) >> 8;
				i += i_92_;
				i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)];
				is[i_74_++]
				    = (((i_73_ & 0xff00ff) * i_93_ & ~0xff00ff)
				       + ((i_73_ & 0xff00) * i_93_
					  & 0xff0000)) >> 8;
				i += i_92_;
				i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)];
				is[i_74_++]
				    = (((i_73_ & 0xff00ff) * i_93_ & ~0xff00ff)
				       + ((i_73_ & 0xff00) * i_93_
					  & 0xff0000)) >> 8;
				i += i_92_;
				i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)];
				is[i_74_++]
				    = (((i_73_ & 0xff00ff) * i_93_ & ~0xff00ff)
				       + ((i_73_ & 0xff00) * i_93_
					  & 0xff0000)) >> 8;
				i += i_92_;
				i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)];
				is[i_74_++]
				    = (((i_73_ & 0xff00ff) * i_93_ & ~0xff00ff)
				       + ((i_73_ & 0xff00) * i_93_
					  & 0xff0000)) >> 8;
				i += i_92_;
				i_77_ += i_78_;
				i_93_ = i_77_ >> 8;
			    } while (--i_85_ > 0);
			}
			i_85_ = i_76_ - i_75_ & 0x7;
			if (i_85_ > 0) {
			    do {
				i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)];
				is[i_74_++]
				    = (((i_73_ & 0xff00ff) * i_93_ & ~0xff00ff)
				       + ((i_73_ & 0xff00) * i_93_
					  & 0xff0000)) >> 8;
				i += i_92_;
			    } while (--i_85_ > 0);
			}
		    } else {
			if (i_85_ > 0) {
			    do {
				if ((i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_74_] = (((i_73_ & 0xff00ff) * i_93_
						  & ~0xff00ff)
						 + ((i_73_ & 0xff00) * i_93_
						    & 0xff0000)) >> 8;
				i_74_++;
				i += i_92_;
				if ((i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_74_] = (((i_73_ & 0xff00ff) * i_93_
						  & ~0xff00ff)
						 + ((i_73_ & 0xff00) * i_93_
						    & 0xff0000)) >> 8;
				i_74_++;
				i += i_92_;
				if ((i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_74_] = (((i_73_ & 0xff00ff) * i_93_
						  & ~0xff00ff)
						 + ((i_73_ & 0xff00) * i_93_
						    & 0xff0000)) >> 8;
				i_74_++;
				i += i_92_;
				if ((i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_74_] = (((i_73_ & 0xff00ff) * i_93_
						  & ~0xff00ff)
						 + ((i_73_ & 0xff00) * i_93_
						    & 0xff0000)) >> 8;
				i_74_++;
				i += i_92_;
				if ((i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_74_] = (((i_73_ & 0xff00ff) * i_93_
						  & ~0xff00ff)
						 + ((i_73_ & 0xff00) * i_93_
						    & 0xff0000)) >> 8;
				i_74_++;
				i += i_92_;
				if ((i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_74_] = (((i_73_ & 0xff00ff) * i_93_
						  & ~0xff00ff)
						 + ((i_73_ & 0xff00) * i_93_
						    & 0xff0000)) >> 8;
				i_74_++;
				i += i_92_;
				if ((i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_74_] = (((i_73_ & 0xff00ff) * i_93_
						  & ~0xff00ff)
						 + ((i_73_ & 0xff00) * i_93_
						    & 0xff0000)) >> 8;
				i_74_++;
				i += i_92_;
				if ((i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)])
				    != 0)
				    is[i_74_] = (((i_73_ & 0xff00ff) * i_93_
						  & ~0xff00ff)
						 + ((i_73_ & 0xff00) * i_93_
						    & 0xff0000)) >> 8;
				i_74_++;
				i += i_92_;
				i_77_ += i_78_;
				i_93_ = i_77_ >> 8;
			    } while (--i_85_ > 0);
			}
			i_85_ = i_76_ - i_75_ & 0x7;
			if (i_85_ <= 0)
			    break;
			do {
			    if ((i_73_ = is_72_[(i & 0xfc0) + (i >>> 26)])
				!= 0)
				is[i_74_]
				    = (((i_73_ & 0xff00ff) * i_93_ & ~0xff00ff)
				       + ((i_73_ & 0xff00) * i_93_
					  & 0xff0000)) >> 8;
			    i_74_++;
			    i += i_92_;
			} while (--i_85_ > 0);
		    }
		    break;
		}
		int i_94_ = i_75_ - anInt3911;
		i_79_ += i_82_ * i_94_;
		i_80_ += i_83_ * i_94_;
		i_81_ += i_84_ * i_94_;
		int i_95_ = i_81_ >> 14;
		int i_96_;
		int i_97_;
		if (i_95_ != 0) {
		    i_96_ = i_79_ / i_95_;
		    i_97_ = i_80_ / i_95_;
		} else {
		    i_96_ = 0;
		    i_97_ = 0;
		}
		i_79_ += i_82_ * i_85_;
		i_80_ += i_83_ * i_85_;
		i_81_ += i_84_ * i_85_;
		i_95_ = i_81_ >> 14;
		int i_98_;
		int i_99_;
		if (i_95_ != 0) {
		    i_98_ = i_79_ / i_95_;
		    i_99_ = i_80_ / i_95_;
		} else {
		    i_98_ = 0;
		    i_99_ = 0;
		}
		i = (i_96_ << 18) + i_97_;
		int i_100_ = (((i_98_ - i_96_) / i_85_ << 18)
			      + (i_99_ - i_97_) / i_85_);
		i_85_ >>= 3;
		i_78_ <<= 3;
		int i_101_ = i_77_ >> 8;
		if (aBoolean3928) {
		    if (i_85_ > 0) {
			do {
			    i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)];
			    is[i_74_++]
				= ((((i_73_ & 0xff00ff) * i_101_ & ~0xff00ff)
				    + ((i_73_ & 0xff00) * i_101_ & 0xff0000))
				   >> 8);
			    i += i_100_;
			    i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)];
			    is[i_74_++]
				= ((((i_73_ & 0xff00ff) * i_101_ & ~0xff00ff)
				    + ((i_73_ & 0xff00) * i_101_ & 0xff0000))
				   >> 8);
			    i += i_100_;
			    i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)];
			    is[i_74_++]
				= ((((i_73_ & 0xff00ff) * i_101_ & ~0xff00ff)
				    + ((i_73_ & 0xff00) * i_101_ & 0xff0000))
				   >> 8);
			    i += i_100_;
			    i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)];
			    is[i_74_++]
				= ((((i_73_ & 0xff00ff) * i_101_ & ~0xff00ff)
				    + ((i_73_ & 0xff00) * i_101_ & 0xff0000))
				   >> 8);
			    i += i_100_;
			    i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)];
			    is[i_74_++]
				= ((((i_73_ & 0xff00ff) * i_101_ & ~0xff00ff)
				    + ((i_73_ & 0xff00) * i_101_ & 0xff0000))
				   >> 8);
			    i += i_100_;
			    i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)];
			    is[i_74_++]
				= ((((i_73_ & 0xff00ff) * i_101_ & ~0xff00ff)
				    + ((i_73_ & 0xff00) * i_101_ & 0xff0000))
				   >> 8);
			    i += i_100_;
			    i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)];
			    is[i_74_++]
				= ((((i_73_ & 0xff00ff) * i_101_ & ~0xff00ff)
				    + ((i_73_ & 0xff00) * i_101_ & 0xff0000))
				   >> 8);
			    i += i_100_;
			    i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)];
			    is[i_74_++]
				= ((((i_73_ & 0xff00ff) * i_101_ & ~0xff00ff)
				    + ((i_73_ & 0xff00) * i_101_ & 0xff0000))
				   >> 8);
			    i += i_100_;
			    i_77_ += i_78_;
			    i_101_ = i_77_ >> 8;
			} while (--i_85_ > 0);
		    }
		    i_85_ = i_76_ - i_75_ & 0x7;
		    if (i_85_ > 0) {
			do {
			    i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)];
			    is[i_74_++]
				= ((((i_73_ & 0xff00ff) * i_101_ & ~0xff00ff)
				    + ((i_73_ & 0xff00) * i_101_ & 0xff0000))
				   >> 8);
			    i += i_100_;
			} while (--i_85_ > 0);
			break;
		    }
		} else {
		    if (i_85_ > 0) {
			do {
			    if ((i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_74_] = (((i_73_ & 0xff00ff) * i_101_
					      & ~0xff00ff)
					     + ((i_73_ & 0xff00) * i_101_
						& 0xff0000)) >> 8;
			    i_74_++;
			    i += i_100_;
			    if ((i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_74_] = (((i_73_ & 0xff00ff) * i_101_
					      & ~0xff00ff)
					     + ((i_73_ & 0xff00) * i_101_
						& 0xff0000)) >> 8;
			    i_74_++;
			    i += i_100_;
			    if ((i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_74_] = (((i_73_ & 0xff00ff) * i_101_
					      & ~0xff00ff)
					     + ((i_73_ & 0xff00) * i_101_
						& 0xff0000)) >> 8;
			    i_74_++;
			    i += i_100_;
			    if ((i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_74_] = (((i_73_ & 0xff00ff) * i_101_
					      & ~0xff00ff)
					     + ((i_73_ & 0xff00) * i_101_
						& 0xff0000)) >> 8;
			    i_74_++;
			    i += i_100_;
			    if ((i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_74_] = (((i_73_ & 0xff00ff) * i_101_
					      & ~0xff00ff)
					     + ((i_73_ & 0xff00) * i_101_
						& 0xff0000)) >> 8;
			    i_74_++;
			    i += i_100_;
			    if ((i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_74_] = (((i_73_ & 0xff00ff) * i_101_
					      & ~0xff00ff)
					     + ((i_73_ & 0xff00) * i_101_
						& 0xff0000)) >> 8;
			    i_74_++;
			    i += i_100_;
			    if ((i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_74_] = (((i_73_ & 0xff00ff) * i_101_
					      & ~0xff00ff)
					     + ((i_73_ & 0xff00) * i_101_
						& 0xff0000)) >> 8;
			    i_74_++;
			    i += i_100_;
			    if ((i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_74_] = (((i_73_ & 0xff00ff) * i_101_
					      & ~0xff00ff)
					     + ((i_73_ & 0xff00) * i_101_
						& 0xff0000)) >> 8;
			    i_74_++;
			    i += i_100_;
			    i_77_ += i_78_;
			    i_101_ = i_77_ >> 8;
			} while (--i_85_ > 0);
		    }
		    i_85_ = i_76_ - i_75_ & 0x7;
		    if (i_85_ > 0) {
			do {
			    if ((i_73_ = is_72_[(i & 0x3f80) + (i >>> 25)])
				!= 0)
				is[i_74_] = (((i_73_ & 0xff00ff) * i_101_
					      & ~0xff00ff)
					     + ((i_73_ & 0xff00) * i_101_
						& 0xff0000)) >> 8;
			    i_74_++;
			    i += i_100_;
			} while (--i_85_ > 0);
		    }
		}
	    } while (false);
	}
    }
    
    public static void method664
	(int i, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_,
	 int i_107_, int i_108_, int i_109_, int i_110_, int i_111_,
	 int i_112_, int i_113_, int i_114_, int i_115_, int i_116_,
	 int i_117_, int i_118_, int i_119_) {
	int[] is = anInterface3_3926.method13(aFloat3914, -72, i_119_);
	if (is == null) {
	    int i_120_ = anInterface3_3926.method11((byte) -29, i_119_);
	    method656(i, i_102_, i_103_, i_104_, i_105_, i_106_,
		      method658(i_120_, i_107_), method658(i_120_, i_108_),
		      method658(i_120_, i_109_));
	} else {
	    aBoolean3915 = anInterface3_3926.method8(-104, i_119_);
	    aBoolean3928 = anInterface3_3926.method9(true, i_119_);
	    int i_121_ = i_105_ - i_104_;
	    int i_122_ = i_102_ - i;
	    int i_123_ = i_106_ - i_104_;
	    int i_124_ = i_103_ - i;
	    int i_125_ = i_108_ - i_107_;
	    int i_126_ = i_109_ - i_107_;
	    int i_127_ = 0;
	    if (i_102_ != i)
		i_127_ = (i_105_ - i_104_ << 16) / (i_102_ - i);
	    int i_128_ = 0;
	    if (i_103_ != i_102_)
		i_128_ = (i_106_ - i_105_ << 16) / (i_103_ - i_102_);
	    int i_129_ = 0;
	    if (i_103_ != i)
		i_129_ = (i_104_ - i_106_ << 16) / (i - i_103_);
	    int i_130_ = i_121_ * i_124_ - i_123_ * i_122_;
	    if (i_130_ != 0) {
		int i_131_ = (i_125_ * i_124_ - i_126_ * i_122_ << 9) / i_130_;
		int i_132_ = (i_126_ * i_121_ - i_125_ * i_123_ << 9) / i_130_;
		i_111_ = i_110_ - i_111_;
		i_114_ = i_113_ - i_114_;
		i_117_ = i_116_ - i_117_;
		i_112_ -= i_110_;
		i_115_ -= i_113_;
		i_118_ -= i_116_;
		int i_133_ = i_112_ * i_113_ - i_115_ * i_110_ << 14;
		int i_134_ = i_115_ * i_116_ - i_118_ * i_113_ << 5;
		int i_135_ = i_118_ * i_110_ - i_112_ * i_116_ << 5;
		int i_136_ = i_111_ * i_113_ - i_114_ * i_110_ << 14;
		int i_137_ = i_114_ * i_116_ - i_117_ * i_113_ << 5;
		int i_138_ = i_117_ * i_110_ - i_111_ * i_116_ << 5;
		int i_139_ = i_114_ * i_112_ - i_111_ * i_115_ << 14;
		int i_140_ = i_117_ * i_115_ - i_114_ * i_118_ << 5;
		int i_141_ = i_111_ * i_118_ - i_117_ * i_112_ << 5;
		if (i <= i_102_ && i <= i_103_) {
		    if (i < anInt3920) {
			if (i_102_ > anInt3920)
			    i_102_ = anInt3920;
			if (i_103_ > anInt3920)
			    i_103_ = anInt3920;
			i_107_ = (i_107_ << 9) - i_131_ * i_104_ + i_131_;
			if (i_102_ < i_103_) {
			    i_106_ = i_104_ <<= 16;
			    if (i < 0) {
				i_106_ -= i_129_ * i;
				i_104_ -= i_127_ * i;
				i_107_ -= i_132_ * i;
				i = 0;
			    }
			    i_105_ <<= 16;
			    if (i_102_ < 0) {
				i_105_ -= i_128_ * i_102_;
				i_102_ = 0;
			    }
			    int i_142_ = i - anInt3924;
			    i_133_ += i_135_ * i_142_;
			    i_136_ += i_138_ * i_142_;
			    i_139_ += i_141_ * i_142_;
			    if (i != i_102_ && i_129_ < i_127_
				|| i == i_102_ && i_129_ > i_128_) {
				i_103_ -= i_102_;
				i_102_ -= i;
				i = anIntArray3917[i];
				while (--i_102_ >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i, i_106_ >> 16,
					      i_104_ >> 16, i_107_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_106_ += i_129_;
				    i_104_ += i_127_;
				    i_107_ += i_132_;
				    i += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
				while (--i_103_ >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i, i_106_ >> 16,
					      i_105_ >> 16, i_107_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_106_ += i_129_;
				    i_105_ += i_128_;
				    i_107_ += i_132_;
				    i += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
			    } else {
				i_103_ -= i_102_;
				i_102_ -= i;
				i = anIntArray3917[i];
				while (--i_102_ >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i, i_104_ >> 16,
					      i_106_ >> 16, i_107_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_106_ += i_129_;
				    i_104_ += i_127_;
				    i_107_ += i_132_;
				    i += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
				while (--i_103_ >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i, i_105_ >> 16,
					      i_106_ >> 16, i_107_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_106_ += i_129_;
				    i_105_ += i_128_;
				    i_107_ += i_132_;
				    i += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
			    }
			} else {
			    i_105_ = i_104_ <<= 16;
			    if (i < 0) {
				i_105_ -= i_129_ * i;
				i_104_ -= i_127_ * i;
				i_107_ -= i_132_ * i;
				i = 0;
			    }
			    i_106_ <<= 16;
			    if (i_103_ < 0) {
				i_106_ -= i_128_ * i_103_;
				i_103_ = 0;
			    }
			    int i_143_ = i - anInt3924;
			    i_133_ += i_135_ * i_143_;
			    i_136_ += i_138_ * i_143_;
			    i_139_ += i_141_ * i_143_;
			    if (i != i_103_ && i_129_ < i_127_
				|| i == i_103_ && i_128_ > i_127_) {
				i_102_ -= i_103_;
				i_103_ -= i;
				i = anIntArray3917[i];
				while (--i_103_ >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i, i_105_ >> 16,
					      i_104_ >> 16, i_107_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_105_ += i_129_;
				    i_104_ += i_127_;
				    i_107_ += i_132_;
				    i += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
				while (--i_102_ >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i, i_106_ >> 16,
					      i_104_ >> 16, i_107_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_106_ += i_128_;
				    i_104_ += i_127_;
				    i_107_ += i_132_;
				    i += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
			    } else {
				i_102_ -= i_103_;
				i_103_ -= i;
				i = anIntArray3917[i];
				while (--i_103_ >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i, i_104_ >> 16,
					      i_105_ >> 16, i_107_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_105_ += i_129_;
				    i_104_ += i_127_;
				    i_107_ += i_132_;
				    i += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
				while (--i_102_ >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i, i_104_ >> 16,
					      i_106_ >> 16, i_107_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_106_ += i_128_;
				    i_104_ += i_127_;
				    i_107_ += i_132_;
				    i += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
			    }
			}
		    }
		} else if (i_102_ <= i_103_) {
		    if (i_102_ < anInt3920) {
			if (i_103_ > anInt3920)
			    i_103_ = anInt3920;
			if (i > anInt3920)
			    i = anInt3920;
			i_108_ = (i_108_ << 9) - i_131_ * i_105_ + i_131_;
			if (i_103_ < i) {
			    i_104_ = i_105_ <<= 16;
			    if (i_102_ < 0) {
				i_104_ -= i_127_ * i_102_;
				i_105_ -= i_128_ * i_102_;
				i_108_ -= i_132_ * i_102_;
				i_102_ = 0;
			    }
			    i_106_ <<= 16;
			    if (i_103_ < 0) {
				i_106_ -= i_129_ * i_103_;
				i_103_ = 0;
			    }
			    int i_144_ = i_102_ - anInt3924;
			    i_133_ += i_135_ * i_144_;
			    i_136_ += i_138_ * i_144_;
			    i_139_ += i_141_ * i_144_;
			    if (i_102_ != i_103_ && i_127_ < i_128_
				|| i_102_ == i_103_ && i_127_ > i_129_) {
				i -= i_103_;
				i_103_ -= i_102_;
				i_102_ = anIntArray3917[i_102_];
				while (--i_103_ >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i_102_, i_104_ >> 16,
					      i_105_ >> 16, i_108_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_104_ += i_127_;
				    i_105_ += i_128_;
				    i_108_ += i_132_;
				    i_102_ += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
				while (--i >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i_102_, i_104_ >> 16,
					      i_106_ >> 16, i_108_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_104_ += i_127_;
				    i_106_ += i_129_;
				    i_108_ += i_132_;
				    i_102_ += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
			    } else {
				i -= i_103_;
				i_103_ -= i_102_;
				i_102_ = anIntArray3917[i_102_];
				while (--i_103_ >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i_102_, i_105_ >> 16,
					      i_104_ >> 16, i_108_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_104_ += i_127_;
				    i_105_ += i_128_;
				    i_108_ += i_132_;
				    i_102_ += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
				while (--i >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i_102_, i_106_ >> 16,
					      i_104_ >> 16, i_108_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_104_ += i_127_;
				    i_106_ += i_129_;
				    i_108_ += i_132_;
				    i_102_ += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
			    }
			} else {
			    i_106_ = i_105_ <<= 16;
			    if (i_102_ < 0) {
				i_106_ -= i_127_ * i_102_;
				i_105_ -= i_128_ * i_102_;
				i_108_ -= i_132_ * i_102_;
				i_102_ = 0;
			    }
			    i_104_ <<= 16;
			    if (i < 0) {
				i_104_ -= i_129_ * i;
				i = 0;
			    }
			    int i_145_ = i_102_ - anInt3924;
			    i_133_ += i_135_ * i_145_;
			    i_136_ += i_138_ * i_145_;
			    i_139_ += i_141_ * i_145_;
			    if (i_127_ < i_128_) {
				i_103_ -= i;
				i -= i_102_;
				i_102_ = anIntArray3917[i_102_];
				while (--i >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i_102_, i_106_ >> 16,
					      i_105_ >> 16, i_108_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_106_ += i_127_;
				    i_105_ += i_128_;
				    i_108_ += i_132_;
				    i_102_ += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
				while (--i_103_ >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i_102_, i_104_ >> 16,
					      i_105_ >> 16, i_108_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_104_ += i_129_;
				    i_105_ += i_128_;
				    i_108_ += i_132_;
				    i_102_ += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
			    } else {
				i_103_ -= i;
				i -= i_102_;
				i_102_ = anIntArray3917[i_102_];
				while (--i >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i_102_, i_105_ >> 16,
					      i_106_ >> 16, i_108_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_106_ += i_127_;
				    i_105_ += i_128_;
				    i_108_ += i_132_;
				    i_102_ += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
				while (--i_103_ >= 0) {
				    method663(Graphics2D.pixels,
					      is, 0, 0, i_102_, i_105_ >> 16,
					      i_104_ >> 16, i_108_, i_131_,
					      i_133_, i_136_, i_139_, i_134_,
					      i_137_, i_140_);
				    i_104_ += i_129_;
				    i_105_ += i_128_;
				    i_108_ += i_132_;
				    i_102_ += Graphics2D.width;
				    i_133_ += i_135_;
				    i_136_ += i_138_;
				    i_139_ += i_141_;
				}
			    }
			}
		    }
		} else if (i_103_ < anInt3920) {
		    if (i > anInt3920)
			i = anInt3920;
		    if (i_102_ > anInt3920)
			i_102_ = anInt3920;
		    i_109_ = (i_109_ << 9) - i_131_ * i_106_ + i_131_;
		    if (i < i_102_) {
			i_105_ = i_106_ <<= 16;
			if (i_103_ < 0) {
			    i_105_ -= i_128_ * i_103_;
			    i_106_ -= i_129_ * i_103_;
			    i_109_ -= i_132_ * i_103_;
			    i_103_ = 0;
			}
			i_104_ <<= 16;
			if (i < 0) {
			    i_104_ -= i_127_ * i;
			    i = 0;
			}
			int i_146_ = i_103_ - anInt3924;
			i_133_ += i_135_ * i_146_;
			i_136_ += i_138_ * i_146_;
			i_139_ += i_141_ * i_146_;
			if (i_128_ < i_129_) {
			    i_102_ -= i;
			    i -= i_103_;
			    i_103_ = anIntArray3917[i_103_];
			    while (--i >= 0) {
				method663(Graphics2D.pixels, is,
					  0, 0, i_103_, i_105_ >> 16,
					  i_106_ >> 16, i_109_, i_131_, i_133_,
					  i_136_, i_139_, i_134_, i_137_,
					  i_140_);
				i_105_ += i_128_;
				i_106_ += i_129_;
				i_109_ += i_132_;
				i_103_ += Graphics2D.width;
				i_133_ += i_135_;
				i_136_ += i_138_;
				i_139_ += i_141_;
			    }
			    while (--i_102_ >= 0) {
				method663(Graphics2D.pixels, is,
					  0, 0, i_103_, i_105_ >> 16,
					  i_104_ >> 16, i_109_, i_131_, i_133_,
					  i_136_, i_139_, i_134_, i_137_,
					  i_140_);
				i_105_ += i_128_;
				i_104_ += i_127_;
				i_109_ += i_132_;
				i_103_ += Graphics2D.width;
				i_133_ += i_135_;
				i_136_ += i_138_;
				i_139_ += i_141_;
			    }
			} else {
			    i_102_ -= i;
			    i -= i_103_;
			    i_103_ = anIntArray3917[i_103_];
			    while (--i >= 0) {
				method663(Graphics2D.pixels, is,
					  0, 0, i_103_, i_106_ >> 16,
					  i_105_ >> 16, i_109_, i_131_, i_133_,
					  i_136_, i_139_, i_134_, i_137_,
					  i_140_);
				i_105_ += i_128_;
				i_106_ += i_129_;
				i_109_ += i_132_;
				i_103_ += Graphics2D.width;
				i_133_ += i_135_;
				i_136_ += i_138_;
				i_139_ += i_141_;
			    }
			    while (--i_102_ >= 0) {
				method663(Graphics2D.pixels, is,
					  0, 0, i_103_, i_104_ >> 16,
					  i_105_ >> 16, i_109_, i_131_, i_133_,
					  i_136_, i_139_, i_134_, i_137_,
					  i_140_);
				i_105_ += i_128_;
				i_104_ += i_127_;
				i_109_ += i_132_;
				i_103_ += Graphics2D.width;
				i_133_ += i_135_;
				i_136_ += i_138_;
				i_139_ += i_141_;
			    }
			}
		    } else {
			i_104_ = i_106_ <<= 16;
			if (i_103_ < 0) {
			    i_104_ -= i_128_ * i_103_;
			    i_106_ -= i_129_ * i_103_;
			    i_109_ -= i_132_ * i_103_;
			    i_103_ = 0;
			}
			i_105_ <<= 16;
			if (i_102_ < 0) {
			    i_105_ -= i_127_ * i_102_;
			    i_102_ = 0;
			}
			int i_147_ = i_103_ - anInt3924;
			i_133_ += i_135_ * i_147_;
			i_136_ += i_138_ * i_147_;
			i_139_ += i_141_ * i_147_;
			if (i_128_ < i_129_) {
			    i -= i_102_;
			    i_102_ -= i_103_;
			    i_103_ = anIntArray3917[i_103_];
			    while (--i_102_ >= 0) {
				method663(Graphics2D.pixels, is,
					  0, 0, i_103_, i_104_ >> 16,
					  i_106_ >> 16, i_109_, i_131_, i_133_,
					  i_136_, i_139_, i_134_, i_137_,
					  i_140_);
				i_104_ += i_128_;
				i_106_ += i_129_;
				i_109_ += i_132_;
				i_103_ += Graphics2D.width;
				i_133_ += i_135_;
				i_136_ += i_138_;
				i_139_ += i_141_;
			    }
			    while (--i >= 0) {
				method663(Graphics2D.pixels, is,
					  0, 0, i_103_, i_105_ >> 16,
					  i_106_ >> 16, i_109_, i_131_, i_133_,
					  i_136_, i_139_, i_134_, i_137_,
					  i_140_);
				i_105_ += i_127_;
				i_106_ += i_129_;
				i_109_ += i_132_;
				i_103_ += Graphics2D.width;
				i_133_ += i_135_;
				i_136_ += i_138_;
				i_139_ += i_141_;
			    }
			} else {
			    i -= i_102_;
			    i_102_ -= i_103_;
			    i_103_ = anIntArray3917[i_103_];
			    while (--i_102_ >= 0) {
				method663(Graphics2D.pixels, is,
					  0, 0, i_103_, i_106_ >> 16,
					  i_104_ >> 16, i_109_, i_131_, i_133_,
					  i_136_, i_139_, i_134_, i_137_,
					  i_140_);
				i_104_ += i_128_;
				i_106_ += i_129_;
				i_109_ += i_132_;
				i_103_ += Graphics2D.width;
				i_133_ += i_135_;
				i_136_ += i_138_;
				i_139_ += i_141_;
			    }
			    while (--i >= 0) {
				method663(Graphics2D.pixels, is,
					  0, 0, i_103_, i_106_ >> 16,
					  i_105_ >> 16, i_109_, i_131_, i_133_,
					  i_136_, i_139_, i_134_, i_137_,
					  i_140_);
				i_105_ += i_127_;
				i_106_ += i_129_;
				i_109_ += i_132_;
				i_103_ += Graphics2D.width;
				i_133_ += i_135_;
				i_136_ += i_138_;
				i_139_ += i_141_;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static void method665(int i, int i_148_, int i_149_) {
	aBoolean3922
	    = (i < 0 || i > anInt3918 || i_148_ < 0 || i_148_ > anInt3918
	       || i_149_ < 0 || i_149_ > anInt3918);
    }
    
    public static void method666(float f) {
	aFloat3914 = f;
	method667(aFloat3914, 0, 512);
    }
    
    public static void method667(float f, int i, int i_150_) {
	f += Math.random() * 0.03 - 0.015;
	int i_151_ = i * 128;
	for (int i_152_ = i; i_152_ < i_150_; i_152_++) {
	    double d = (double) (i_152_ >> 3) / 64.0 + 0.0078125;
	    double d_153_ = (double) (i_152_ & 0x7) / 8.0 + 0.0625;
	    for (int i_154_ = 0; i_154_ < 128; i_154_++) {
		double d_155_ = (double) i_154_ / 128.0;
		double d_156_ = d_155_;
		double d_157_ = d_155_;
		double d_158_ = d_155_;
		if (d_153_ != 0.0) {
		    double d_159_;
		    if (d_155_ < 0.5)
			d_159_ = d_155_ * (1.0 + d_153_);
		    else
			d_159_ = d_155_ + d_153_ - d_155_ * d_153_;
		    double d_160_ = 2.0 * d_155_ - d_159_;
		    double d_161_ = d + 0.3333333333333333;
		    if (d_161_ > 1.0)
			d_161_--;
		    double d_162_ = d;
		    double d_163_ = d - 0.3333333333333333;
		    if (d_163_ < 0.0)
			d_163_++;
		    if (6.0 * d_161_ < 1.0)
			d_156_ = d_160_ + (d_159_ - d_160_) * 6.0 * d_161_;
		    else if (2.0 * d_161_ < 1.0)
			d_156_ = d_159_;
		    else if (3.0 * d_161_ < 2.0)
			d_156_
			    = d_160_ + ((d_159_ - d_160_)
					* (0.6666666666666666 - d_161_) * 6.0);
		    else
			d_156_ = d_160_;
		    if (6.0 * d_162_ < 1.0)
			d_157_ = d_160_ + (d_159_ - d_160_) * 6.0 * d_162_;
		    else if (2.0 * d_162_ < 1.0)
			d_157_ = d_159_;
		    else if (3.0 * d_162_ < 2.0)
			d_157_
			    = d_160_ + ((d_159_ - d_160_)
					* (0.6666666666666666 - d_162_) * 6.0);
		    else
			d_157_ = d_160_;
		    if (6.0 * d_163_ < 1.0)
			d_158_ = d_160_ + (d_159_ - d_160_) * 6.0 * d_163_;
		    else if (2.0 * d_163_ < 1.0)
			d_158_ = d_159_;
		    else if (3.0 * d_163_ < 2.0)
			d_158_
			    = d_160_ + ((d_159_ - d_160_)
					* (0.6666666666666666 - d_163_) * 6.0);
		    else
			d_158_ = d_160_;
		}
		int i_164_ = (int) (d_156_ * 256.0);
		int i_165_ = (int) (d_157_ * 256.0);
		int i_166_ = (int) (d_158_ * 256.0);
		int i_167_ = (i_164_ << 16) + (i_165_ << 8) + i_166_;
		i_167_ = method671(i_167_, f);
		if (i_167_ == 0)
		    i_167_ = 1;
		anIntArray3930[i_151_++] = i_167_;
	    }
	}
    }
    
    public static void method668(int i, int i_168_) {
	int i_169_ = anIntArray3917[0];
	int i_170_ = i_169_ / Graphics2D.width;
	int i_171_ = i_169_ - i_170_ * Graphics2D.width;
	anInt3911 = i - i_171_;
	anInt3924 = i_168_ - i_170_;
	anInt3923 = -anInt3911;
	anInt3916 = anInt3918 - anInt3911;
	anInt3927 = -anInt3924;
	anInt3919 = anInt3920 - anInt3924;
    }
    
    public static void method669(int i, int i_172_, int i_173_, int i_174_) {
	anInt3918 = i_173_ - i;
	anInt3920 = i_174_ - i_172_;
	method659();
	if (anIntArray3917.length < anInt3920)
	    anIntArray3917
		= new int[Class37_Sub4_Sub3.method466(anInt3920, -696398748)];
	int i_175_ = i_172_ * Graphics2D.width + i;
	for (int i_176_ = 0; i_176_ < anInt3920; i_176_++) {
	    anIntArray3917[i_176_] = i_175_;
	    i_175_ += Graphics2D.width;
	}
    }
    
    public static void method670(int i, int i_177_, int i_178_, int i_179_,
				 int i_180_, int i_181_, int i_182_) {
	int i_183_ = 0;
	if (i_177_ != i)
	    i_183_ = (i_180_ - i_179_ << 16) / (i_177_ - i);
	int i_184_ = 0;
	if (i_178_ != i_177_)
	    i_184_ = (i_181_ - i_180_ << 16) / (i_178_ - i_177_);
	int i_185_ = 0;
	if (i_178_ != i)
	    i_185_ = (i_179_ - i_181_ << 16) / (i - i_178_);
	if (i <= i_177_ && i <= i_178_) {
	    if (i < anInt3920) {
		if (i_177_ > anInt3920)
		    i_177_ = anInt3920;
		if (i_178_ > anInt3920)
		    i_178_ = anInt3920;
		if (i_177_ < i_178_) {
		    i_181_ = i_179_ <<= 16;
		    if (i < 0) {
			i_181_ -= i_185_ * i;
			i_179_ -= i_183_ * i;
			i = 0;
		    }
		    i_180_ <<= 16;
		    if (i_177_ < 0) {
			i_180_ -= i_184_ * i_177_;
			i_177_ = 0;
		    }
		    if (i != i_177_ && i_185_ < i_183_
			|| i == i_177_ && i_185_ > i_184_) {
			i_178_ -= i_177_;
			i_177_ -= i;
			i = anIntArray3917[i];
			while (--i_177_ >= 0) {
			    method662(Graphics2D.pixels, i,
				      i_182_, 0, i_181_ >> 16, i_179_ >> 16);
			    i_181_ += i_185_;
			    i_179_ += i_183_;
			    i += Graphics2D.width;
			}
			while (--i_178_ >= 0) {
			    method662(Graphics2D.pixels, i,
				      i_182_, 0, i_181_ >> 16, i_180_ >> 16);
			    i_181_ += i_185_;
			    i_180_ += i_184_;
			    i += Graphics2D.width;
			}
		    } else {
			i_178_ -= i_177_;
			i_177_ -= i;
			i = anIntArray3917[i];
			while (--i_177_ >= 0) {
			    method662(Graphics2D.pixels, i,
				      i_182_, 0, i_179_ >> 16, i_181_ >> 16);
			    i_181_ += i_185_;
			    i_179_ += i_183_;
			    i += Graphics2D.width;
			}
			while (--i_178_ >= 0) {
			    method662(Graphics2D.pixels, i,
				      i_182_, 0, i_180_ >> 16, i_181_ >> 16);
			    i_181_ += i_185_;
			    i_180_ += i_184_;
			    i += Graphics2D.width;
			}
		    }
		} else {
		    i_180_ = i_179_ <<= 16;
		    if (i < 0) {
			i_180_ -= i_185_ * i;
			i_179_ -= i_183_ * i;
			i = 0;
		    }
		    i_181_ <<= 16;
		    if (i_178_ < 0) {
			i_181_ -= i_184_ * i_178_;
			i_178_ = 0;
		    }
		    if (i != i_178_ && i_185_ < i_183_
			|| i == i_178_ && i_184_ > i_183_) {
			i_177_ -= i_178_;
			i_178_ -= i;
			i = anIntArray3917[i];
			while (--i_178_ >= 0) {
			    method662(Graphics2D.pixels, i,
				      i_182_, 0, i_180_ >> 16, i_179_ >> 16);
			    i_180_ += i_185_;
			    i_179_ += i_183_;
			    i += Graphics2D.width;
			}
			while (--i_177_ >= 0) {
			    method662(Graphics2D.pixels, i,
				      i_182_, 0, i_181_ >> 16, i_179_ >> 16);
			    i_181_ += i_184_;
			    i_179_ += i_183_;
			    i += Graphics2D.width;
			}
		    } else {
			i_177_ -= i_178_;
			i_178_ -= i;
			i = anIntArray3917[i];
			while (--i_178_ >= 0) {
			    method662(Graphics2D.pixels, i,
				      i_182_, 0, i_179_ >> 16, i_180_ >> 16);
			    i_180_ += i_185_;
			    i_179_ += i_183_;
			    i += Graphics2D.width;
			}
			while (--i_177_ >= 0) {
			    method662(Graphics2D.pixels, i,
				      i_182_, 0, i_179_ >> 16, i_181_ >> 16);
			    i_181_ += i_184_;
			    i_179_ += i_183_;
			    i += Graphics2D.width;
			}
		    }
		}
	    }
	} else if (i_177_ <= i_178_) {
	    if (i_177_ < anInt3920) {
		if (i_178_ > anInt3920)
		    i_178_ = anInt3920;
		if (i > anInt3920)
		    i = anInt3920;
		if (i_178_ < i) {
		    i_179_ = i_180_ <<= 16;
		    if (i_177_ < 0) {
			i_179_ -= i_183_ * i_177_;
			i_180_ -= i_184_ * i_177_;
			i_177_ = 0;
		    }
		    i_181_ <<= 16;
		    if (i_178_ < 0) {
			i_181_ -= i_185_ * i_178_;
			i_178_ = 0;
		    }
		    if (i_177_ != i_178_ && i_183_ < i_184_
			|| i_177_ == i_178_ && i_183_ > i_185_) {
			i -= i_178_;
			i_178_ -= i_177_;
			i_177_ = anIntArray3917[i_177_];
			while (--i_178_ >= 0) {
			    method662(Graphics2D.pixels, i_177_,
				      i_182_, 0, i_179_ >> 16, i_180_ >> 16);
			    i_179_ += i_183_;
			    i_180_ += i_184_;
			    i_177_ += Graphics2D.width;
			}
			while (--i >= 0) {
			    method662(Graphics2D.pixels, i_177_,
				      i_182_, 0, i_179_ >> 16, i_181_ >> 16);
			    i_179_ += i_183_;
			    i_181_ += i_185_;
			    i_177_ += Graphics2D.width;
			}
		    } else {
			i -= i_178_;
			i_178_ -= i_177_;
			i_177_ = anIntArray3917[i_177_];
			while (--i_178_ >= 0) {
			    method662(Graphics2D.pixels, i_177_,
				      i_182_, 0, i_180_ >> 16, i_179_ >> 16);
			    i_179_ += i_183_;
			    i_180_ += i_184_;
			    i_177_ += Graphics2D.width;
			}
			while (--i >= 0) {
			    method662(Graphics2D.pixels, i_177_,
				      i_182_, 0, i_181_ >> 16, i_179_ >> 16);
			    i_179_ += i_183_;
			    i_181_ += i_185_;
			    i_177_ += Graphics2D.width;
			}
		    }
		} else {
		    i_181_ = i_180_ <<= 16;
		    if (i_177_ < 0) {
			i_181_ -= i_183_ * i_177_;
			i_180_ -= i_184_ * i_177_;
			i_177_ = 0;
		    }
		    i_179_ <<= 16;
		    if (i < 0) {
			i_179_ -= i_185_ * i;
			i = 0;
		    }
		    if (i_183_ < i_184_) {
			i_178_ -= i;
			i -= i_177_;
			i_177_ = anIntArray3917[i_177_];
			while (--i >= 0) {
			    method662(Graphics2D.pixels, i_177_,
				      i_182_, 0, i_181_ >> 16, i_180_ >> 16);
			    i_181_ += i_183_;
			    i_180_ += i_184_;
			    i_177_ += Graphics2D.width;
			}
			while (--i_178_ >= 0) {
			    method662(Graphics2D.pixels, i_177_,
				      i_182_, 0, i_179_ >> 16, i_180_ >> 16);
			    i_179_ += i_185_;
			    i_180_ += i_184_;
			    i_177_ += Graphics2D.width;
			}
		    } else {
			i_178_ -= i;
			i -= i_177_;
			i_177_ = anIntArray3917[i_177_];
			while (--i >= 0) {
			    method662(Graphics2D.pixels, i_177_,
				      i_182_, 0, i_180_ >> 16, i_181_ >> 16);
			    i_181_ += i_183_;
			    i_180_ += i_184_;
			    i_177_ += Graphics2D.width;
			}
			while (--i_178_ >= 0) {
			    method662(Graphics2D.pixels, i_177_,
				      i_182_, 0, i_180_ >> 16, i_179_ >> 16);
			    i_179_ += i_185_;
			    i_180_ += i_184_;
			    i_177_ += Graphics2D.width;
			}
		    }
		}
	    }
	} else if (i_178_ < anInt3920) {
	    if (i > anInt3920)
		i = anInt3920;
	    if (i_177_ > anInt3920)
		i_177_ = anInt3920;
	    if (i < i_177_) {
		i_180_ = i_181_ <<= 16;
		if (i_178_ < 0) {
		    i_180_ -= i_184_ * i_178_;
		    i_181_ -= i_185_ * i_178_;
		    i_178_ = 0;
		}
		i_179_ <<= 16;
		if (i < 0) {
		    i_179_ -= i_183_ * i;
		    i = 0;
		}
		if (i_184_ < i_185_) {
		    i_177_ -= i;
		    i -= i_178_;
		    i_178_ = anIntArray3917[i_178_];
		    while (--i >= 0) {
			method662(Graphics2D.pixels, i_178_,
				  i_182_, 0, i_180_ >> 16, i_181_ >> 16);
			i_180_ += i_184_;
			i_181_ += i_185_;
			i_178_ += Graphics2D.width;
		    }
		    while (--i_177_ >= 0) {
			method662(Graphics2D.pixels, i_178_,
				  i_182_, 0, i_180_ >> 16, i_179_ >> 16);
			i_180_ += i_184_;
			i_179_ += i_183_;
			i_178_ += Graphics2D.width;
		    }
		} else {
		    i_177_ -= i;
		    i -= i_178_;
		    i_178_ = anIntArray3917[i_178_];
		    while (--i >= 0) {
			method662(Graphics2D.pixels, i_178_,
				  i_182_, 0, i_181_ >> 16, i_180_ >> 16);
			i_180_ += i_184_;
			i_181_ += i_185_;
			i_178_ += Graphics2D.width;
		    }
		    while (--i_177_ >= 0) {
			method662(Graphics2D.pixels, i_178_,
				  i_182_, 0, i_179_ >> 16, i_180_ >> 16);
			i_180_ += i_184_;
			i_179_ += i_183_;
			i_178_ += Graphics2D.width;
		    }
		}
	    } else {
		i_179_ = i_181_ <<= 16;
		if (i_178_ < 0) {
		    i_179_ -= i_184_ * i_178_;
		    i_181_ -= i_185_ * i_178_;
		    i_178_ = 0;
		}
		i_180_ <<= 16;
		if (i_177_ < 0) {
		    i_180_ -= i_183_ * i_177_;
		    i_177_ = 0;
		}
		if (i_184_ < i_185_) {
		    i -= i_177_;
		    i_177_ -= i_178_;
		    i_178_ = anIntArray3917[i_178_];
		    while (--i_177_ >= 0) {
			method662(Graphics2D.pixels, i_178_,
				  i_182_, 0, i_179_ >> 16, i_181_ >> 16);
			i_179_ += i_184_;
			i_181_ += i_185_;
			i_178_ += Graphics2D.width;
		    }
		    while (--i >= 0) {
			method662(Graphics2D.pixels, i_178_,
				  i_182_, 0, i_180_ >> 16, i_181_ >> 16);
			i_180_ += i_183_;
			i_181_ += i_185_;
			i_178_ += Graphics2D.width;
		    }
		} else {
		    i -= i_177_;
		    i_177_ -= i_178_;
		    i_178_ = anIntArray3917[i_178_];
		    while (--i_177_ >= 0) {
			method662(Graphics2D.pixels, i_178_,
				  i_182_, 0, i_181_ >> 16, i_179_ >> 16);
			i_179_ += i_184_;
			i_181_ += i_185_;
			i_178_ += Graphics2D.width;
		    }
		    while (--i >= 0) {
			method662(Graphics2D.pixels, i_178_,
				  i_182_, 0, i_181_ >> 16, i_180_ >> 16);
			i_180_ += i_183_;
			i_181_ += i_185_;
			i_178_ += Graphics2D.width;
		    }
		}
	    }
	}
    }
    
    public static int method671(int i, float f) {
	if (f == 1.0F)
	    return i;
	double d = (double) (i >> 16) / 256.0;
	double d_186_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_187_ = (double) (i & 0xff) / 256.0;
	d = Math.pow(d, (double) f);
	d_186_ = Math.pow(d_186_, (double) f);
	d_187_ = Math.pow(d_187_, (double) f);
	int i_188_ = (int) (d * 256.0);
	int i_189_ = (int) (d_186_ * 256.0);
	int i_190_ = (int) (d_187_ * 256.0);
	return (i_188_ << 16) + (i_189_ << 8) + i_190_;
    }
    
    public static void method672
	(int i, int i_191_, int i_192_, int i_193_, int i_194_, int i_195_,
	 int i_196_, int i_197_, int i_198_, int i_199_, int i_200_,
	 int i_201_, int i_202_, int i_203_, int i_204_, int i_205_,
	 int i_206_, int i_207_, int i_208_) {
	int[] is = anInterface3_3926.method13(aFloat3914, 71, i_208_);
	if (is == null) {
	    int i_209_ = anInterface3_3926.method11((byte) -29, i_208_);
	    method656(i, i_191_, i_192_, i_193_, i_194_, i_195_,
		      method658(i_209_, i_196_), method658(i_209_, i_197_),
		      method658(i_209_, i_198_));
	} else {
	    aBoolean3915 = anInterface3_3926.method8(-112, i_208_);
	    aBoolean3928 = anInterface3_3926.method9(true, i_208_);
	    int i_210_ = i_194_ - i_193_;
	    int i_211_ = i_191_ - i;
	    int i_212_ = i_195_ - i_193_;
	    int i_213_ = i_192_ - i;
	    int i_214_ = i_197_ - i_196_;
	    int i_215_ = i_198_ - i_196_;
	    int i_216_ = 0;
	    if (i_191_ != i)
		i_216_ = (i_194_ - i_193_ << 16) / (i_191_ - i);
	    int i_217_ = 0;
	    if (i_192_ != i_191_)
		i_217_ = (i_195_ - i_194_ << 16) / (i_192_ - i_191_);
	    int i_218_ = 0;
	    if (i_192_ != i)
		i_218_ = (i_193_ - i_195_ << 16) / (i - i_192_);
	    int i_219_ = i_210_ * i_213_ - i_212_ * i_211_;
	    if (i_219_ != 0) {
		int i_220_ = (i_214_ * i_213_ - i_215_ * i_211_ << 9) / i_219_;
		int i_221_ = (i_215_ * i_210_ - i_214_ * i_212_ << 9) / i_219_;
		i_200_ = i_199_ - i_200_;
		i_203_ = i_202_ - i_203_;
		i_206_ = i_205_ - i_206_;
		i_201_ -= i_199_;
		i_204_ -= i_202_;
		i_207_ -= i_205_;
		int i_222_ = i_201_ * i_202_ - i_204_ * i_199_ << 14;
		int i_223_ = i_204_ * i_205_ - i_207_ * i_202_ << 8;
		int i_224_ = i_207_ * i_199_ - i_201_ * i_205_ << 5;
		int i_225_ = i_200_ * i_202_ - i_203_ * i_199_ << 14;
		int i_226_ = i_203_ * i_205_ - i_206_ * i_202_ << 8;
		int i_227_ = i_206_ * i_199_ - i_200_ * i_205_ << 5;
		int i_228_ = i_203_ * i_201_ - i_200_ * i_204_ << 14;
		int i_229_ = i_206_ * i_204_ - i_203_ * i_207_ << 8;
		int i_230_ = i_200_ * i_207_ - i_206_ * i_201_ << 5;
		if (i <= i_191_ && i <= i_192_) {
		    if (i < anInt3920) {
			if (i_191_ > anInt3920)
			    i_191_ = anInt3920;
			if (i_192_ > anInt3920)
			    i_192_ = anInt3920;
			i_196_ = (i_196_ << 9) - i_220_ * i_193_ + i_220_;
			if (i_191_ < i_192_) {
			    i_195_ = i_193_ <<= 16;
			    if (i < 0) {
				i_195_ -= i_218_ * i;
				i_193_ -= i_216_ * i;
				i_196_ -= i_221_ * i;
				i = 0;
			    }
			    i_194_ <<= 16;
			    if (i_191_ < 0) {
				i_194_ -= i_217_ * i_191_;
				i_191_ = 0;
			    }
			    int i_231_ = i - anInt3924;
			    i_222_ += i_224_ * i_231_;
			    i_225_ += i_227_ * i_231_;
			    i_228_ += i_230_ * i_231_;
			    if (i != i_191_ && i_218_ < i_216_
				|| i == i_191_ && i_218_ > i_217_) {
				i_192_ -= i_191_;
				i_191_ -= i;
				i = anIntArray3917[i];
				while (--i_191_ >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i, i_195_ >> 16,
					      i_193_ >> 16, i_196_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_195_ += i_218_;
				    i_193_ += i_216_;
				    i_196_ += i_221_;
				    i += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
				while (--i_192_ >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i, i_195_ >> 16,
					      i_194_ >> 16, i_196_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_195_ += i_218_;
				    i_194_ += i_217_;
				    i_196_ += i_221_;
				    i += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
			    } else {
				i_192_ -= i_191_;
				i_191_ -= i;
				i = anIntArray3917[i];
				while (--i_191_ >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i, i_193_ >> 16,
					      i_195_ >> 16, i_196_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_195_ += i_218_;
				    i_193_ += i_216_;
				    i_196_ += i_221_;
				    i += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
				while (--i_192_ >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i, i_194_ >> 16,
					      i_195_ >> 16, i_196_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_195_ += i_218_;
				    i_194_ += i_217_;
				    i_196_ += i_221_;
				    i += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
			    }
			} else {
			    i_194_ = i_193_ <<= 16;
			    if (i < 0) {
				i_194_ -= i_218_ * i;
				i_193_ -= i_216_ * i;
				i_196_ -= i_221_ * i;
				i = 0;
			    }
			    i_195_ <<= 16;
			    if (i_192_ < 0) {
				i_195_ -= i_217_ * i_192_;
				i_192_ = 0;
			    }
			    int i_232_ = i - anInt3924;
			    i_222_ += i_224_ * i_232_;
			    i_225_ += i_227_ * i_232_;
			    i_228_ += i_230_ * i_232_;
			    if (i != i_192_ && i_218_ < i_216_
				|| i == i_192_ && i_217_ > i_216_) {
				i_191_ -= i_192_;
				i_192_ -= i;
				i = anIntArray3917[i];
				while (--i_192_ >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i, i_194_ >> 16,
					      i_193_ >> 16, i_196_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_194_ += i_218_;
				    i_193_ += i_216_;
				    i_196_ += i_221_;
				    i += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
				while (--i_191_ >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i, i_195_ >> 16,
					      i_193_ >> 16, i_196_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_195_ += i_217_;
				    i_193_ += i_216_;
				    i_196_ += i_221_;
				    i += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
			    } else {
				i_191_ -= i_192_;
				i_192_ -= i;
				i = anIntArray3917[i];
				while (--i_192_ >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i, i_193_ >> 16,
					      i_194_ >> 16, i_196_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_194_ += i_218_;
				    i_193_ += i_216_;
				    i_196_ += i_221_;
				    i += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
				while (--i_191_ >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i, i_193_ >> 16,
					      i_195_ >> 16, i_196_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_195_ += i_217_;
				    i_193_ += i_216_;
				    i_196_ += i_221_;
				    i += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
			    }
			}
		    }
		} else if (i_191_ <= i_192_) {
		    if (i_191_ < anInt3920) {
			if (i_192_ > anInt3920)
			    i_192_ = anInt3920;
			if (i > anInt3920)
			    i = anInt3920;
			i_197_ = (i_197_ << 9) - i_220_ * i_194_ + i_220_;
			if (i_192_ < i) {
			    i_193_ = i_194_ <<= 16;
			    if (i_191_ < 0) {
				i_193_ -= i_216_ * i_191_;
				i_194_ -= i_217_ * i_191_;
				i_197_ -= i_221_ * i_191_;
				i_191_ = 0;
			    }
			    i_195_ <<= 16;
			    if (i_192_ < 0) {
				i_195_ -= i_218_ * i_192_;
				i_192_ = 0;
			    }
			    int i_233_ = i_191_ - anInt3924;
			    i_222_ += i_224_ * i_233_;
			    i_225_ += i_227_ * i_233_;
			    i_228_ += i_230_ * i_233_;
			    if (i_191_ != i_192_ && i_216_ < i_217_
				|| i_191_ == i_192_ && i_216_ > i_218_) {
				i -= i_192_;
				i_192_ -= i_191_;
				i_191_ = anIntArray3917[i_191_];
				while (--i_192_ >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i_191_, i_193_ >> 16,
					      i_194_ >> 16, i_197_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_193_ += i_216_;
				    i_194_ += i_217_;
				    i_197_ += i_221_;
				    i_191_ += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
				while (--i >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i_191_, i_193_ >> 16,
					      i_195_ >> 16, i_197_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_193_ += i_216_;
				    i_195_ += i_218_;
				    i_197_ += i_221_;
				    i_191_ += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
			    } else {
				i -= i_192_;
				i_192_ -= i_191_;
				i_191_ = anIntArray3917[i_191_];
				while (--i_192_ >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i_191_, i_194_ >> 16,
					      i_193_ >> 16, i_197_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_193_ += i_216_;
				    i_194_ += i_217_;
				    i_197_ += i_221_;
				    i_191_ += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
				while (--i >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i_191_, i_195_ >> 16,
					      i_193_ >> 16, i_197_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_193_ += i_216_;
				    i_195_ += i_218_;
				    i_197_ += i_221_;
				    i_191_ += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
			    }
			} else {
			    i_195_ = i_194_ <<= 16;
			    if (i_191_ < 0) {
				i_195_ -= i_216_ * i_191_;
				i_194_ -= i_217_ * i_191_;
				i_197_ -= i_221_ * i_191_;
				i_191_ = 0;
			    }
			    i_193_ <<= 16;
			    if (i < 0) {
				i_193_ -= i_218_ * i;
				i = 0;
			    }
			    int i_234_ = i_191_ - anInt3924;
			    i_222_ += i_224_ * i_234_;
			    i_225_ += i_227_ * i_234_;
			    i_228_ += i_230_ * i_234_;
			    if (i_216_ < i_217_) {
				i_192_ -= i;
				i -= i_191_;
				i_191_ = anIntArray3917[i_191_];
				while (--i >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i_191_, i_195_ >> 16,
					      i_194_ >> 16, i_197_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_195_ += i_216_;
				    i_194_ += i_217_;
				    i_197_ += i_221_;
				    i_191_ += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
				while (--i_192_ >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i_191_, i_193_ >> 16,
					      i_194_ >> 16, i_197_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_193_ += i_218_;
				    i_194_ += i_217_;
				    i_197_ += i_221_;
				    i_191_ += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
			    } else {
				i_192_ -= i;
				i -= i_191_;
				i_191_ = anIntArray3917[i_191_];
				while (--i >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i_191_, i_194_ >> 16,
					      i_195_ >> 16, i_197_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_195_ += i_216_;
				    i_194_ += i_217_;
				    i_197_ += i_221_;
				    i_191_ += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
				while (--i_192_ >= 0) {
				    method660(Graphics2D.pixels,
					      is, 0, 0, i_191_, i_194_ >> 16,
					      i_193_ >> 16, i_197_, i_220_,
					      i_222_, i_225_, i_228_, i_223_,
					      i_226_, i_229_);
				    i_193_ += i_218_;
				    i_194_ += i_217_;
				    i_197_ += i_221_;
				    i_191_ += Graphics2D.width;
				    i_222_ += i_224_;
				    i_225_ += i_227_;
				    i_228_ += i_230_;
				}
			    }
			}
		    }
		} else if (i_192_ < anInt3920) {
		    if (i > anInt3920)
			i = anInt3920;
		    if (i_191_ > anInt3920)
			i_191_ = anInt3920;
		    i_198_ = (i_198_ << 9) - i_220_ * i_195_ + i_220_;
		    if (i < i_191_) {
			i_194_ = i_195_ <<= 16;
			if (i_192_ < 0) {
			    i_194_ -= i_217_ * i_192_;
			    i_195_ -= i_218_ * i_192_;
			    i_198_ -= i_221_ * i_192_;
			    i_192_ = 0;
			}
			i_193_ <<= 16;
			if (i < 0) {
			    i_193_ -= i_216_ * i;
			    i = 0;
			}
			int i_235_ = i_192_ - anInt3924;
			i_222_ += i_224_ * i_235_;
			i_225_ += i_227_ * i_235_;
			i_228_ += i_230_ * i_235_;
			if (i_217_ < i_218_) {
			    i_191_ -= i;
			    i -= i_192_;
			    i_192_ = anIntArray3917[i_192_];
			    while (--i >= 0) {
				method660(Graphics2D.pixels, is,
					  0, 0, i_192_, i_194_ >> 16,
					  i_195_ >> 16, i_198_, i_220_, i_222_,
					  i_225_, i_228_, i_223_, i_226_,
					  i_229_);
				i_194_ += i_217_;
				i_195_ += i_218_;
				i_198_ += i_221_;
				i_192_ += Graphics2D.width;
				i_222_ += i_224_;
				i_225_ += i_227_;
				i_228_ += i_230_;
			    }
			    while (--i_191_ >= 0) {
				method660(Graphics2D.pixels, is,
					  0, 0, i_192_, i_194_ >> 16,
					  i_193_ >> 16, i_198_, i_220_, i_222_,
					  i_225_, i_228_, i_223_, i_226_,
					  i_229_);
				i_194_ += i_217_;
				i_193_ += i_216_;
				i_198_ += i_221_;
				i_192_ += Graphics2D.width;
				i_222_ += i_224_;
				i_225_ += i_227_;
				i_228_ += i_230_;
			    }
			} else {
			    i_191_ -= i;
			    i -= i_192_;
			    i_192_ = anIntArray3917[i_192_];
			    while (--i >= 0) {
				method660(Graphics2D.pixels, is,
					  0, 0, i_192_, i_195_ >> 16,
					  i_194_ >> 16, i_198_, i_220_, i_222_,
					  i_225_, i_228_, i_223_, i_226_,
					  i_229_);
				i_194_ += i_217_;
				i_195_ += i_218_;
				i_198_ += i_221_;
				i_192_ += Graphics2D.width;
				i_222_ += i_224_;
				i_225_ += i_227_;
				i_228_ += i_230_;
			    }
			    while (--i_191_ >= 0) {
				method660(Graphics2D.pixels, is,
					  0, 0, i_192_, i_193_ >> 16,
					  i_194_ >> 16, i_198_, i_220_, i_222_,
					  i_225_, i_228_, i_223_, i_226_,
					  i_229_);
				i_194_ += i_217_;
				i_193_ += i_216_;
				i_198_ += i_221_;
				i_192_ += Graphics2D.width;
				i_222_ += i_224_;
				i_225_ += i_227_;
				i_228_ += i_230_;
			    }
			}
		    } else {
			i_193_ = i_195_ <<= 16;
			if (i_192_ < 0) {
			    i_193_ -= i_217_ * i_192_;
			    i_195_ -= i_218_ * i_192_;
			    i_198_ -= i_221_ * i_192_;
			    i_192_ = 0;
			}
			i_194_ <<= 16;
			if (i_191_ < 0) {
			    i_194_ -= i_216_ * i_191_;
			    i_191_ = 0;
			}
			int i_236_ = i_192_ - anInt3924;
			i_222_ += i_224_ * i_236_;
			i_225_ += i_227_ * i_236_;
			i_228_ += i_230_ * i_236_;
			if (i_217_ < i_218_) {
			    i -= i_191_;
			    i_191_ -= i_192_;
			    i_192_ = anIntArray3917[i_192_];
			    while (--i_191_ >= 0) {
				method660(Graphics2D.pixels, is,
					  0, 0, i_192_, i_193_ >> 16,
					  i_195_ >> 16, i_198_, i_220_, i_222_,
					  i_225_, i_228_, i_223_, i_226_,
					  i_229_);
				i_193_ += i_217_;
				i_195_ += i_218_;
				i_198_ += i_221_;
				i_192_ += Graphics2D.width;
				i_222_ += i_224_;
				i_225_ += i_227_;
				i_228_ += i_230_;
			    }
			    while (--i >= 0) {
				method660(Graphics2D.pixels, is,
					  0, 0, i_192_, i_194_ >> 16,
					  i_195_ >> 16, i_198_, i_220_, i_222_,
					  i_225_, i_228_, i_223_, i_226_,
					  i_229_);
				i_194_ += i_216_;
				i_195_ += i_218_;
				i_198_ += i_221_;
				i_192_ += Graphics2D.width;
				i_222_ += i_224_;
				i_225_ += i_227_;
				i_228_ += i_230_;
			    }
			} else {
			    i -= i_191_;
			    i_191_ -= i_192_;
			    i_192_ = anIntArray3917[i_192_];
			    while (--i_191_ >= 0) {
				method660(Graphics2D.pixels, is,
					  0, 0, i_192_, i_195_ >> 16,
					  i_193_ >> 16, i_198_, i_220_, i_222_,
					  i_225_, i_228_, i_223_, i_226_,
					  i_229_);
				i_193_ += i_217_;
				i_195_ += i_218_;
				i_198_ += i_221_;
				i_192_ += Graphics2D.width;
				i_222_ += i_224_;
				i_225_ += i_227_;
				i_228_ += i_230_;
			    }
			    while (--i >= 0) {
				method660(Graphics2D.pixels, is,
					  0, 0, i_192_, i_195_ >> 16,
					  i_194_ >> 16, i_198_, i_220_, i_222_,
					  i_225_, i_228_, i_223_, i_226_,
					  i_229_);
				i_194_ += i_216_;
				i_195_ += i_218_;
				i_198_ += i_221_;
				i_192_ += Graphics2D.width;
				i_222_ += i_224_;
				i_225_ += i_227_;
				i_228_ += i_230_;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static void method673(Interface3 interface3) {
	anInterface3_3926 = interface3;
    }
    
    public static void initDefaultOffsets() {
	method669(Graphics2D.anInt2661, Graphics2D.anInt2663,
		  Graphics2D.anInt2667, Graphics2D.anInt2664);
    }
    
    static {
	aFloat3914 = 1.0F;
	anIntArray3912 = new int[2048];
	aBoolean3921 = true;
	aBoolean3915 = false;
	anInt3925 = 0;
	aBoolean3928 = false;
	aBoolean3922 = false;
	anIntArray3910 = new int[2048];
	anIntArray3929 = new int[2048];
	anIntArray3930 = new int[65536];
	for (int i = 1; i < 512; i++)
	    anIntArray3913[i] = 32768 / i;
	for (int i = 1; i < 2048; i++)
	    anIntArray3912[i] = 65536 / i;
	for (int i = 0; i < 2048; i++) {
	    anIntArray3910[i]
		= (int) (65536.0 * Math.sin((double) i * 0.0030679615));
	    anIntArray3929[i]
		= (int) (65536.0 * Math.cos((double) i * 0.0030679615));
	}
    }
}
