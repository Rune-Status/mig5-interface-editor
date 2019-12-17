package org.ie.client;

/* Class37_Sub4_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Graphics2D extends NodeSub
{
    public static int anInt2661 = 0;
    public static int width;
    public static int anInt2663;
    public static int anInt2664 = 0;
    public static int height;
    public static int[] pixels;
    public static int anInt2667;
    
    public static void method577(int i, int i_0_, int i_1_, int i_2_,
				 int i_3_) {
	i_1_ -= i;
	i_2_ -= i_0_;
	if (i_2_ == 0) {
	    if (i_1_ >= 0)
		method580(i, i_0_, i_1_ + 1, i_3_);
	    else
		method580(i + i_1_, i_0_, -i_1_ + 1, i_3_);
	} else if (i_1_ == 0) {
	    if (i_2_ >= 0)
		method581(i, i_0_, i_2_ + 1, i_3_);
	    else
		method581(i, i_0_ + i_2_, -i_2_ + 1, i_3_);
	} else {
	    if (i_1_ + i_2_ < 0) {
		i += i_1_;
		i_1_ = -i_1_;
		i_0_ += i_2_;
		i_2_ = -i_2_;
	    }
	    if (i_1_ > i_2_) {
		i_0_ <<= 16;
		i_0_ += 32768;
		i_2_ <<= 16;
		int i_4_
		    = (int) Math.floor((double) i_2_ / (double) i_1_ + 0.5);
		i_1_ += i;
		if (i < anInt2661) {
		    i_0_ += i_4_ * (anInt2661 - i);
		    i = anInt2661;
		}
		if (i_1_ >= anInt2667)
		    i_1_ = anInt2667 - 1;
		for (/**/; i <= i_1_; i++) {
		    int i_5_ = i_0_ >> 16;
		    if (i_5_ >= anInt2663 && i_5_ < anInt2664)
			pixels[i + i_5_ * width] = i_3_;
		    i_0_ += i_4_;
		}
	    } else {
		i <<= 16;
		i += 32768;
		i_1_ <<= 16;
		int i_6_
		    = (int) Math.floor((double) i_1_ / (double) i_2_ + 0.5);
		i_2_ += i_0_;
		if (i_0_ < anInt2663) {
		    i += i_6_ * (anInt2663 - i_0_);
		    i_0_ = anInt2663;
		}
		if (i_2_ >= anInt2664)
		    i_2_ = anInt2664 - 1;
		for (/**/; i_0_ <= i_2_; i_0_++) {
		    int i_7_ = i >> 16;
		    if (i_7_ >= anInt2661 && i_7_ < anInt2667)
			pixels[i_7_ + i_0_ * width] = i_3_;
		    i += i_6_;
		}
	    }
	}
    }
    
    public static void method578(int i, int i_8_, int i_9_, int i_10_,
				 int i_11_) {
	if (i < anInt2661) {
	    i_9_ -= anInt2661 - i;
	    i = anInt2661;
	}
	if (i_8_ < anInt2663) {
	    i_10_ -= anInt2663 - i_8_;
	    i_8_ = anInt2663;
	}
	if (i + i_9_ > anInt2667)
	    i_9_ = anInt2667 - i;
	if (i_8_ + i_10_ > anInt2664)
	    i_10_ = anInt2664 - i_8_;
	int i_12_ = width - i_9_;
	int i_13_ = i + i_8_ * width;
	for (int i_14_ = -i_10_; i_14_ < 0; i_14_++) {
	    for (int i_15_ = -i_9_; i_15_ < 0; i_15_++)
		pixels[i_13_++] = i_11_;
	    i_13_ += i_12_;
	}
    }
    
    public static void method579() {
	int i = 0;
	int i_16_ = width * height - 7;
	while (i < i_16_) {
	    pixels[i++] = 0;
	    pixels[i++] = 0;
	    pixels[i++] = 0;
	    pixels[i++] = 0;
	    pixels[i++] = 0;
	    pixels[i++] = 0;
	    pixels[i++] = 0;
	    pixels[i++] = 0;
	}
	i_16_ += 7;
	while (i < i_16_)
	    pixels[i++] = 0;
    }
    
    public static void method580(int i, int i_17_, int i_18_, int i_19_) {
	if (i_17_ >= anInt2663 && i_17_ < anInt2664) {
	    if (i < anInt2661) {
		i_18_ -= anInt2661 - i;
		i = anInt2661;
	    }
	    if (i + i_18_ > anInt2667)
		i_18_ = anInt2667 - i;
	    int i_20_ = i + i_17_ * width;
	    for (int i_21_ = 0; i_21_ < i_18_; i_21_++)
		pixels[i_20_ + i_21_] = i_19_;
	}
    }
    
    public static void method581(int i, int i_22_, int i_23_, int i_24_) {
	if (i >= anInt2661 && i < anInt2667) {
	    if (i_22_ < anInt2663) {
		i_23_ -= anInt2663 - i_22_;
		i_22_ = anInt2663;
	    }
	    if (i_22_ + i_23_ > anInt2664)
		i_23_ = anInt2664 - i_22_;
	    int i_25_ = i + i_22_ * width;
	    for (int i_26_ = 0; i_26_ < i_23_; i_26_++)
		pixels[i_25_ + i_26_ * width] = i_24_;
	}
    }
    
    public static void method582() {
	pixels = null;
    }
    
    public static void method583(int i, int i_27_, int i_28_, int i_29_,
				 int i_30_, int i_31_) {
	int i_32_ = 0;
	int i_33_ = 65536 / i_29_;
	if (i < anInt2661) {
	    i_28_ -= anInt2661 - i;
	    i = anInt2661;
	}
	if (i_27_ < anInt2663) {
	    i_32_ += (anInt2663 - i_27_) * i_33_;
	    i_29_ -= anInt2663 - i_27_;
	    i_27_ = anInt2663;
	}
	if (i + i_28_ > anInt2667)
	    i_28_ = anInt2667 - i;
	if (i_27_ + i_29_ > anInt2664)
	    i_29_ = anInt2664 - i_27_;
	int i_34_ = width - i_28_;
	int i_35_ = i + i_27_ * width;
	for (int i_36_ = -i_29_; i_36_ < 0; i_36_++) {
	    int i_37_ = 65536 - i_32_ >> 8;
	    int i_38_ = i_32_ >> 8;
	    int i_39_
		= ((((i_30_ & 0xff00ff) * i_37_ + (i_31_ & 0xff00ff) * i_38_
		     & ~0xff00ff)
		    + ((i_30_ & 0xff00) * i_37_ + (i_31_ & 0xff00) * i_38_
		       & 0xff0000))
		   >>> 8);
	    for (int i_40_ = -i_28_; i_40_ < 0; i_40_++)
		pixels[i_35_++] = i_39_;
	    i_35_ += i_34_;
	    i_32_ += i_33_;
	}
    }
    
    public static void method584(int i, int i_41_, int i_42_, int i_43_,
				 int i_44_) {
	if (i_41_ >= anInt2663 && i_41_ < anInt2664) {
	    if (i < anInt2661) {
		i_42_ -= anInt2661 - i;
		i = anInt2661;
	    }
	    if (i + i_42_ > anInt2667)
		i_42_ = anInt2667 - i;
	    int i_45_ = 256 - i_44_;
	    int i_46_ = (i_43_ >> 16 & 0xff) * i_44_;
	    int i_47_ = (i_43_ >> 8 & 0xff) * i_44_;
	    int i_48_ = (i_43_ & 0xff) * i_44_;
	    int i_49_ = i + i_41_ * width;
	    for (int i_50_ = 0; i_50_ < i_42_; i_50_++) {
		int i_51_ = (pixels[i_49_] >> 16 & 0xff) * i_45_;
		int i_52_ = (pixels[i_49_] >> 8 & 0xff) * i_45_;
		int i_53_ = (pixels[i_49_] & 0xff) * i_45_;
		int i_54_
		    = ((i_46_ + i_51_ >> 8 << 16) + (i_47_ + i_52_ >> 8 << 8)
		       + (i_48_ + i_53_ >> 8));
		pixels[i_49_++] = i_54_;
	    }
	}
    }
    
    public static void method585(int i, int i_55_, int i_56_, int i_57_,
				 int i_58_) {
	if (i >= anInt2661 && i < anInt2667) {
	    if (i_55_ < anInt2663) {
		i_56_ -= anInt2663 - i_55_;
		i_55_ = anInt2663;
	    }
	    if (i_55_ + i_56_ > anInt2664)
		i_56_ = anInt2664 - i_55_;
	    int i_59_ = 256 - i_58_;
	    int i_60_ = (i_57_ >> 16 & 0xff) * i_58_;
	    int i_61_ = (i_57_ >> 8 & 0xff) * i_58_;
	    int i_62_ = (i_57_ & 0xff) * i_58_;
	    int i_63_ = i + i_55_ * width;
	    for (int i_64_ = 0; i_64_ < i_56_; i_64_++) {
		int i_65_ = (pixels[i_63_] >> 16 & 0xff) * i_59_;
		int i_66_ = (pixels[i_63_] >> 8 & 0xff) * i_59_;
		int i_67_ = (pixels[i_63_] & 0xff) * i_59_;
		int i_68_
		    = ((i_60_ + i_65_ >> 8 << 16) + (i_61_ + i_66_ >> 8 << 8)
		       + (i_62_ + i_67_ >> 8));
		pixels[i_63_] = i_68_;
		i_63_ += width;
	    }
	}
    }
    
    public static void method586(int i, int i_69_, int i_70_, int i_71_,
				 int i_72_, int i_73_) {
	if (i < anInt2661) {
	    i_70_ -= anInt2661 - i;
	    i = anInt2661;
	}
	if (i_69_ < anInt2663) {
	    i_71_ -= anInt2663 - i_69_;
	    i_69_ = anInt2663;
	}
	if (i + i_70_ > anInt2667)
	    i_70_ = anInt2667 - i;
	if (i_69_ + i_71_ > anInt2664)
	    i_71_ = anInt2664 - i_69_;
	i_72_ = (((i_72_ & 0xff00ff) * i_73_ >> 8 & 0xff00ff)
		 + ((i_72_ & 0xff00) * i_73_ >> 8 & 0xff00));
	int i_74_ = 256 - i_73_;
	int i_75_ = width - i_70_;
	int i_76_ = i + i_69_ * width;
	for (int i_77_ = 0; i_77_ < i_71_; i_77_++) {
	    for (int i_78_ = -i_70_; i_78_ < 0; i_78_++) {
		int i_79_ = pixels[i_76_];
		i_79_ = (((i_79_ & 0xff00ff) * i_74_ >> 8 & 0xff00ff)
			 + ((i_79_ & 0xff00) * i_74_ >> 8 & 0xff00));
		pixels[i_76_++] = i_72_ + i_79_;
	    }
	    i_76_ += i_75_;
	}
    }
    
    public static void method587(int[] is, int i, int i_80_) {
	pixels = is;
	width = i;
	height = i_80_;
	setBounds(0, 0, i, i_80_);
    }
    
    public static void method588(int i, int i_81_, int i_82_, int i_83_,
				 int i_84_, int i_85_) {
	method584(i, i_81_, i_82_, i_84_, i_85_);
	method584(i, i_81_ + i_83_ - 1, i_82_, i_84_, i_85_);
	if (i_83_ >= 3) {
	    method585(i, i_81_ + 1, i_83_ - 2, i_84_, i_85_);
	    method585(i + i_82_ - 1, i_81_ + 1, i_83_ - 2, i_84_, i_85_);
	}
    }
    
    public static void setBounds(int i, int i_86_, int i_87_, int i_88_) {
	if (i < 0)
	    i = 0;
	if (i_86_ < 0)
	    i_86_ = 0;
	if (i_87_ > width)
	    i_87_ = width;
	if (i_88_ > height)
	    i_88_ = height;
	anInt2661 = i;
	anInt2663 = i_86_;
	anInt2667 = i_87_;
	anInt2664 = i_88_;
    }
    
    public static void method590() {
	anInt2661 = 0;
	anInt2663 = 0;
	anInt2667 = width;
	anInt2664 = height;
    }
    
    public static void method591(int[] is) {
	anInt2661 = is[0];
	anInt2663 = is[1];
	anInt2667 = is[2];
	anInt2664 = is[3];
    }
    
    public static void method592(int i, int i_89_, int i_90_, int i_91_) {
	if (anInt2661 < i)
	    anInt2661 = i;
	if (anInt2663 < i_89_)
	    anInt2663 = i_89_;
	if (anInt2667 > i_90_)
	    anInt2667 = i_90_;
	if (anInt2664 > i_91_)
	    anInt2664 = i_91_;
    }
    
    public static void method593(int i, int i_92_, int i_93_, int[] is,
				 int[] is_94_) {
	int i_95_ = i + i_92_ * width;
	for (i_92_ = 0; i_92_ < is.length; i_92_++) {
	    int i_96_ = i_95_ + is[i_92_];
	    for (i = -is_94_[i_92_]; i < 0; i++)
		pixels[i_96_++] = i_93_;
	    i_95_ += width;
	}
    }
    
    public static void method594(int[] is) {
	is[0] = anInt2661;
	is[1] = anInt2663;
	is[2] = anInt2667;
	is[3] = anInt2664;
    }
    
    public static void method595(int i, int i_97_, int i_98_, int i_99_,
				 int i_100_) {
	method580(i, i_97_, i_98_, i_100_);
	method580(i, i_97_ + i_99_ - 1, i_98_, i_100_);
	method581(i, i_97_, i_99_, i_100_);
	method581(i + i_98_ - 1, i_97_, i_99_, i_100_);
    }
    
    static {
	anInt2663 = 0;
	anInt2667 = 0;
    }
}
