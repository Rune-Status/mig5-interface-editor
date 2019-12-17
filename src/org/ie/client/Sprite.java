package org.ie.client;

/* Class37_Sub4_Sub9_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.awt.image.PixelGrabber;
import java.awt.image.RGBImageFilter;
import java.util.Hashtable;

public class Sprite extends Graphics2D
{
    public int width;
    public int[] pixels;
    public int anInt3905;
    public int anInt3906;
    public int height;
    public int anInt3908;
    public int anInt3909;
    
    public void method629(int i) {
	int[] is = new int[width * height];
	int i_0_ = 0;
	for (int i_1_ = 0; i_1_ < height; i_1_++) {
	    for (int i_2_ = 0; i_2_ < width; i_2_++) {
		int i_3_ = pixels[i_0_];
		if (i_3_ == 0) {
		    if (i_2_ > 0 && pixels[i_0_ - 1] != 0)
			i_3_ = i;
		    else if (i_1_ > 0 && pixels[i_0_ - width] != 0)
			i_3_ = i;
		    else if (i_2_ < width - 1
			     && pixels[i_0_ + 1] != 0)
			i_3_ = i;
		    else if (i_1_ < height - 1
			     && pixels[i_0_ + width] != 0)
			i_3_ = i;
		}
		is[i_0_++] = i_3_;
	    }
	}
	pixels = is;
    }
    
    public void method630(int i, int i_4_, int i_5_) {
	for (int i_6_ = 0; i_6_ < pixels.length; i_6_++) {
	    int i_7_ = pixels[i_6_];
	    if (i_7_ != 0) {
		int i_8_ = i_7_ >> 16 & 0xff;
		i_8_ += i;
		if (i_8_ < 1)
		    i_8_ = 1;
		else if (i_8_ > 255)
		    i_8_ = 255;
		int i_9_ = i_7_ >> 8 & 0xff;
		i_9_ += i_4_;
		if (i_9_ < 1)
		    i_9_ = 1;
		else if (i_9_ > 255)
		    i_9_ = 255;
		int i_10_ = i_7_ & 0xff;
		i_10_ += i_5_;
		if (i_10_ < 1)
		    i_10_ = 1;
		else if (i_10_ > 255)
		    i_10_ = 255;
		pixels[i_6_] = (i_8_ << 16) + (i_9_ << 8) + i_10_;
	    }
	}
    }
    
    public static void method631(int[] is, int[] is_11_, int i, int i_12_,
				 int i_13_, int i_14_, int i_15_, int i_16_,
				 int i_17_) {
	int i_18_ = -(i_14_ >> 2);
	i_14_ = -(i_14_ & 0x3);
	for (int i_19_ = -i_15_; i_19_ < 0; i_19_++) {
	    for (int i_20_ = i_18_; i_20_ < 0; i_20_++) {
		i = is_11_[i_12_++];
		if (i != 0)
		    is[i_13_++] = i;
		else
		    i_13_++;
		i = is_11_[i_12_++];
		if (i != 0)
		    is[i_13_++] = i;
		else
		    i_13_++;
		i = is_11_[i_12_++];
		if (i != 0)
		    is[i_13_++] = i;
		else
		    i_13_++;
		i = is_11_[i_12_++];
		if (i != 0)
		    is[i_13_++] = i;
		else
		    i_13_++;
	    }
	    for (int i_21_ = i_14_; i_21_ < 0; i_21_++) {
		i = is_11_[i_12_++];
		if (i != 0)
		    is[i_13_++] = i;
		else
		    i_13_++;
	    }
	    i_13_ += i_16_;
	    i_12_ += i_17_;
	}
    }
    
    public static void method632(int[] is, int[] is_22_, int i, int i_23_,
				 int i_24_, int i_25_, int i_26_, int i_27_,
				 int i_28_, int i_29_, int i_30_) {
	int i_31_ = 256 - i_29_;
	int i_32_ = (i_30_ & 0xff00ff) * i_31_ & ~0xff00ff;
	int i_33_ = (i_30_ & 0xff00) * i_31_ & 0xff0000;
	i_30_ = (i_32_ | i_33_) >>> 8;
	for (int i_34_ = -i_26_; i_34_ < 0; i_34_++) {
	    for (int i_35_ = -i_25_; i_35_ < 0; i_35_++) {
		i = is_22_[i_23_++];
		if (i != 0) {
		    i_32_ = (i & 0xff00ff) * i_29_ & ~0xff00ff;
		    i_33_ = (i & 0xff00) * i_29_ & 0xff0000;
		    is[i_24_++] = ((i_32_ | i_33_) >>> 8) + i_30_;
		} else
		    i_24_++;
	    }
	    i_24_ += i_27_;
	    i_23_ += i_28_;
	}
    }
    
    public void method633(Class37_Sub4_Sub9_Sub1 class37_sub4_sub9_sub1, int i,
			  int i_36_) {
	if ((Graphics2D.anInt2667 - Graphics2D.anInt2661
	     != class37_sub4_sub9_sub1.anInt3865)
	    || (Graphics2D.anInt2664 - Graphics2D.anInt2663
		!= class37_sub4_sub9_sub1.anInt3862))
	    throw new IllegalStateException();
	i += anInt3909;
	i_36_ += anInt3908;
	int i_37_ = i + i_36_ * Graphics2D.width;
	int i_38_ = 0;
	int i_39_ = height;
	int i_40_ = width;
	int i_41_ = Graphics2D.width - i_40_;
	int i_42_ = 0;
	if (i_36_ < Graphics2D.anInt2663) {
	    int i_43_ = Graphics2D.anInt2663 - i_36_;
	    i_39_ -= i_43_;
	    i_36_ = Graphics2D.anInt2663;
	    i_38_ += i_43_ * i_40_;
	    i_37_ += i_43_ * Graphics2D.width;
	}
	if (i_36_ + i_39_ > Graphics2D.anInt2664)
	    i_39_ -= i_36_ + i_39_ - Graphics2D.anInt2664;
	if (i < Graphics2D.anInt2661) {
	    int i_44_ = Graphics2D.anInt2661 - i;
	    i_40_ -= i_44_;
	    i = Graphics2D.anInt2661;
	    i_38_ += i_44_;
	    i_37_ += i_44_;
	    i_42_ += i_44_;
	    i_41_ += i_44_;
	}
	if (i + i_40_ > Graphics2D.anInt2667) {
	    int i_45_ = i + i_40_ - Graphics2D.anInt2667;
	    i_40_ -= i_45_;
	    i_42_ += i_45_;
	    i_41_ += i_45_;
	}
	if (i_40_ > 0 && i_39_ > 0) {
	    int i_46_ = (i - Graphics2D.anInt2661
			 + ((i_36_ - Graphics2D.anInt2663)
			    * class37_sub4_sub9_sub1.anInt3865));
	    int i_47_ = class37_sub4_sub9_sub1.anInt3865 - i_40_;
	    method644(Graphics2D.pixels, pixels, 0,
		      i_38_, i_37_, i_46_, i_40_, i_39_, i_41_, i_42_, i_47_,
		      class37_sub4_sub9_sub1.aByteArray3860);
	}
    }
    
    public void method634(int i, int i_48_, int i_49_) {
	i += anInt3909;
	i_48_ += anInt3908;
	int i_50_ = i + i_48_ * Graphics2D.width;
	int i_51_ = 0;
	int i_52_ = height;
	int i_53_ = width;
	int i_54_ = Graphics2D.width - i_53_;
	int i_55_ = 0;
	if (i_48_ < Graphics2D.anInt2663) {
	    int i_56_ = Graphics2D.anInt2663 - i_48_;
	    i_52_ -= i_56_;
	    i_48_ = Graphics2D.anInt2663;
	    i_51_ += i_56_ * i_53_;
	    i_50_ += i_56_ * Graphics2D.width;
	}
	if (i_48_ + i_52_ > Graphics2D.anInt2664)
	    i_52_ -= i_48_ + i_52_ - Graphics2D.anInt2664;
	if (i < Graphics2D.anInt2661) {
	    int i_57_ = Graphics2D.anInt2661 - i;
	    i_53_ -= i_57_;
	    i = Graphics2D.anInt2661;
	    i_51_ += i_57_;
	    i_50_ += i_57_;
	    i_55_ += i_57_;
	    i_54_ += i_57_;
	}
	if (i + i_53_ > Graphics2D.anInt2667) {
	    int i_58_ = i + i_53_ - Graphics2D.anInt2667;
	    i_53_ -= i_58_;
	    i_55_ += i_58_;
	    i_54_ += i_58_;
	}
	if (i_53_ > 0 && i_52_ > 0)
	    method651(Graphics2D.pixels, pixels, 0,
		      i_51_, i_50_, i_53_, i_52_, i_54_, i_55_, i_49_);
    }
    
    public static void method635(int[] is, int[] is_59_, int i, int i_60_,
				 int i_61_, int i_62_, int i_63_, int i_64_,
				 int i_65_, int i_66_, int i_67_, int i_68_) {
	int i_69_ = i_60_;
	for (int i_70_ = -i_65_; i_70_ < 0; i_70_++) {
	    int i_71_ = (i_61_ >> 16) * i_68_;
	    for (int i_72_ = -i_64_; i_72_ < 0; i_72_++) {
		i = is_59_[(i_60_ >> 16) + i_71_];
		if (i != 0)
		    is[i_62_++] = i;
		else
		    i_62_++;
		i_60_ += i_66_;
	    }
	    i_61_ += i_67_;
	    i_60_ = i_69_;
	    i_62_ += i_63_;
	}
    }
    
    public void method636(int i, int i_73_, int i_74_, int i_75_, int i_76_) {
	if (i_74_ > 0 && i_75_ > 0) {
	    int i_77_ = width;
	    int i_78_ = height;
	    int i_79_ = 0;
	    int i_80_ = 0;
	    int i_81_ = anInt3906;
	    int i_82_ = anInt3905;
	    int i_83_ = (i_81_ << 16) / i_74_;
	    int i_84_ = (i_82_ << 16) / i_75_;
	    if (anInt3909 > 0) {
		int i_85_ = ((anInt3909 << 16) + i_83_ - 1) / i_83_;
		i += i_85_;
		i_79_ += i_85_ * i_83_ - (anInt3909 << 16);
	    }
	    if (anInt3908 > 0) {
		int i_86_ = ((anInt3908 << 16) + i_84_ - 1) / i_84_;
		i_73_ += i_86_;
		i_80_ += i_86_ * i_84_ - (anInt3908 << 16);
	    }
	    if (i_77_ < i_81_)
		i_74_ = ((i_77_ << 16) - i_79_ + i_83_ - 1) / i_83_;
	    if (i_78_ < i_82_)
		i_75_ = ((i_78_ << 16) - i_80_ + i_84_ - 1) / i_84_;
	    int i_87_ = i + i_73_ * Graphics2D.width;
	    int i_88_ = Graphics2D.width - i_74_;
	    if (i_73_ + i_75_ > Graphics2D.anInt2664)
		i_75_ -= i_73_ + i_75_ - Graphics2D.anInt2664;
	    if (i_73_ < Graphics2D.anInt2663) {
		int i_89_ = Graphics2D.anInt2663 - i_73_;
		i_75_ -= i_89_;
		i_87_ += i_89_ * Graphics2D.width;
		i_80_ += i_84_ * i_89_;
	    }
	    if (i + i_74_ > Graphics2D.anInt2667) {
		int i_90_ = i + i_74_ - Graphics2D.anInt2667;
		i_74_ -= i_90_;
		i_88_ += i_90_;
	    }
	    if (i < Graphics2D.anInt2661) {
		int i_91_ = Graphics2D.anInt2661 - i;
		i_74_ -= i_91_;
		i_87_ += i_91_;
		i_79_ += i_83_ * i_91_;
		i_88_ += i_91_;
	    }
	    method639(Graphics2D.pixels, pixels, 0,
		      i_79_, i_80_, i_87_, i_88_, i_74_, i_75_, i_83_, i_84_,
		      i_77_, i_76_);
	}
    }
    
    public void method637(int i, int i_92_, int i_93_, int i_94_) {
	if (i_93_ == 256)
	    method653(i, i_92_);
	else {
	    i += anInt3909;
	    i_92_ += anInt3908;
	    int i_95_ = i + i_92_ * Graphics2D.width;
	    int i_96_ = 0;
	    int i_97_ = height;
	    int i_98_ = width;
	    int i_99_ = Graphics2D.width - i_98_;
	    int i_100_ = 0;
	    if (i_92_ < Graphics2D.anInt2663) {
		int i_101_ = Graphics2D.anInt2663 - i_92_;
		i_97_ -= i_101_;
		i_92_ = Graphics2D.anInt2663;
		i_96_ += i_101_ * i_98_;
		i_95_ += i_101_ * Graphics2D.width;
	    }
	    if (i_92_ + i_97_ > Graphics2D.anInt2664)
		i_97_ -= i_92_ + i_97_ - Graphics2D.anInt2664;
	    if (i < Graphics2D.anInt2661) {
		int i_102_ = Graphics2D.anInt2661 - i;
		i_98_ -= i_102_;
		i = Graphics2D.anInt2661;
		i_96_ += i_102_;
		i_95_ += i_102_;
		i_100_ += i_102_;
		i_99_ += i_102_;
	    }
	    if (i + i_98_ > Graphics2D.anInt2667) {
		int i_103_ = i + i_98_ - Graphics2D.anInt2667;
		i_98_ -= i_103_;
		i_100_ += i_103_;
		i_99_ += i_103_;
	    }
	    if (i_98_ > 0 && i_97_ > 0)
		method632(Graphics2D.pixels, pixels, 0,
			  i_96_, i_95_, i_98_, i_97_, i_99_, i_100_, i_93_,
			  i_94_);
	}
    }
    
    public void method638(int i, int i_104_, int i_105_, int i_106_) {
	if (i_105_ > 0 && i_106_ > 0) {
	    int i_107_ = width;
	    int i_108_ = height;
	    int i_109_ = 0;
	    int i_110_ = 0;
	    int i_111_ = anInt3906;
	    int i_112_ = anInt3905;
	    int i_113_ = (i_111_ << 16) / i_105_;
	    int i_114_ = (i_112_ << 16) / i_106_;
	    if (anInt3909 > 0) {
		int i_115_ = ((anInt3909 << 16) + i_113_ - 1) / i_113_;
		i += i_115_;
		i_109_ += i_115_ * i_113_ - (anInt3909 << 16);
	    }
	    if (anInt3908 > 0) {
		int i_116_ = ((anInt3908 << 16) + i_114_ - 1) / i_114_;
		i_104_ += i_116_;
		i_110_ += i_116_ * i_114_ - (anInt3908 << 16);
	    }
	    if (i_107_ < i_111_)
		i_105_ = ((i_107_ << 16) - i_109_ + i_113_ - 1) / i_113_;
	    if (i_108_ < i_112_)
		i_106_ = ((i_108_ << 16) - i_110_ + i_114_ - 1) / i_114_;
	    int i_117_ = i + i_104_ * Graphics2D.width;
	    int i_118_ = Graphics2D.width - i_105_;
	    if (i_104_ + i_106_ > Graphics2D.anInt2664)
		i_106_ -= i_104_ + i_106_ - Graphics2D.anInt2664;
	    if (i_104_ < Graphics2D.anInt2663) {
		int i_119_ = Graphics2D.anInt2663 - i_104_;
		i_106_ -= i_119_;
		i_117_ += i_119_ * Graphics2D.width;
		i_110_ += i_114_ * i_119_;
	    }
	    if (i + i_105_ > Graphics2D.anInt2667) {
		int i_120_ = i + i_105_ - Graphics2D.anInt2667;
		i_105_ -= i_120_;
		i_118_ += i_120_;
	    }
	    if (i < Graphics2D.anInt2661) {
		int i_121_ = Graphics2D.anInt2661 - i;
		i_105_ -= i_121_;
		i_117_ += i_121_;
		i_109_ += i_113_ * i_121_;
		i_118_ += i_121_;
	    }
	    method635(Graphics2D.pixels, pixels, 0,
		      i_109_, i_110_, i_117_, i_118_, i_105_, i_106_, i_113_,
		      i_114_, i_107_);
	}
    }
    
    public static void method639(int[] is, int[] is_122_, int i, int i_123_,
				 int i_124_, int i_125_, int i_126_,
				 int i_127_, int i_128_, int i_129_,
				 int i_130_, int i_131_, int i_132_) {
	int i_133_ = 256 - i_132_;
	int i_134_ = i_123_;
	for (int i_135_ = -i_128_; i_135_ < 0; i_135_++) {
	    int i_136_ = (i_124_ >> 16) * i_131_;
	    for (int i_137_ = -i_127_; i_137_ < 0; i_137_++) {
		i = is_122_[(i_123_ >> 16) + i_136_];
		if (i != 0) {
		    int i_138_ = is[i_125_];
		    is[i_125_++] = ((((i & 0xff00ff) * i_132_
				      + (i_138_ & 0xff00ff) * i_133_)
				     & ~0xff00ff)
				    + (((i & 0xff00) * i_132_
					+ (i_138_ & 0xff00) * i_133_)
				       & 0xff0000)) >> 8;
		} else
		    i_125_++;
		i_123_ += i_129_;
	    }
	    i_124_ += i_130_;
	    i_123_ = i_134_;
	    i_125_ += i_126_;
	}
    }
    
    public static void method640(int[] is, int[] is_139_, int i, int i_140_,
				 int i_141_, int i_142_, int i_143_,
				 int i_144_) {
	for (int i_145_ = -i_142_; i_145_ < 0; i_145_++) {
	    int i_146_ = i_140_ + i_141_ - 3;
	    while (i_140_ < i_146_) {
		is[i_140_++] = is_139_[i++];
		is[i_140_++] = is_139_[i++];
		is[i_140_++] = is_139_[i++];
		is[i_140_++] = is_139_[i++];
	    }
	    i_146_ += 3;
	    while (i_140_ < i_146_)
		is[i_140_++] = is_139_[i++];
	    i_140_ += i_143_;
	    i += i_144_;
	}
    }
    
    public void method641() {
	Graphics2D.method587(pixels, width, height);
    }
    
    public void method642() {
	if (width != anInt3906 || height != anInt3905) {
	    int[] is = new int[anInt3906 * anInt3905];
	    for (int i = 0; i < height; i++) {
		for (int i_147_ = 0; i_147_ < width; i_147_++)
		    is[(i + anInt3908) * anInt3906 + (i_147_ + anInt3909)]
			= pixels[i * width + i_147_];
	    }
	    pixels = is;
	    width = anInt3906;
	    height = anInt3905;
	    anInt3909 = 0;
	    anInt3908 = 0;
	}
    }
    
    public void method643(int i, int i_148_, int i_149_, int i_150_,
			  int i_151_, int i_152_, int i_153_, int i_154_,
			  int[] is, int[] is_155_) {
	try {
	    int i_156_ = -i_149_ / 2;
	    int i_157_ = -i_150_ / 2;
	    int i_158_ = (int) (Math.sin((double) i_153_ / 326.11) * 65536.0);
	    int i_159_ = (int) (Math.cos((double) i_153_ / 326.11) * 65536.0);
	    i_158_ = i_158_ * i_154_ >> 8;
	    i_159_ = i_159_ * i_154_ >> 8;
	    int i_160_ = (i_151_ << 16) + (i_157_ * i_158_ + i_156_ * i_159_);
	    int i_161_ = (i_152_ << 16) + (i_157_ * i_159_ - i_156_ * i_158_);
	    int i_162_ = i + i_148_ * Graphics2D.width;
	    for (i_148_ = 0; i_148_ < i_150_; i_148_++) {
		int i_163_ = is[i_148_];
		int i_164_ = i_162_ + i_163_;
		int i_165_ = i_160_ + i_159_ * i_163_;
		int i_166_ = i_161_ - i_158_ * i_163_;
		for (i = -is_155_[i_148_]; i < 0; i++) {
		    Graphics2D.pixels[i_164_++]
			= (pixels
			   [(i_165_ >> 16) + (i_166_ >> 16) * width]);
		    i_165_ += i_159_;
		    i_166_ -= i_158_;
		}
		i_160_ += i_158_;
		i_161_ += i_159_;
		i_162_ += Graphics2D.width;
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public static void method644(int[] is, int[] is_167_, int i, int i_168_,
				 int i_169_, int i_170_, int i_171_,
				 int i_172_, int i_173_, int i_174_,
				 int i_175_, byte[] is_176_) {
	int i_177_ = -(i_171_ >> 2);
	i_171_ = -(i_171_ & 0x3);
	for (int i_178_ = -i_172_; i_178_ < 0; i_178_++) {
	    for (int i_179_ = i_177_; i_179_ < 0; i_179_++) {
		i = is_167_[i_168_++];
		if (i != 0 && is_176_[i_170_] == 0)
		    is[i_169_++] = i;
		else
		    i_169_++;
		i_170_++;
		i = is_167_[i_168_++];
		if (i != 0 && is_176_[i_170_] == 0)
		    is[i_169_++] = i;
		else
		    i_169_++;
		i_170_++;
		i = is_167_[i_168_++];
		if (i != 0 && is_176_[i_170_] == 0)
		    is[i_169_++] = i;
		else
		    i_169_++;
		i_170_++;
		i = is_167_[i_168_++];
		if (i != 0 && is_176_[i_170_] == 0)
		    is[i_169_++] = i;
		else
		    i_169_++;
		i_170_++;
	    }
	    for (int i_180_ = i_171_; i_180_ < 0; i_180_++) {
		i = is_167_[i_168_++];
		if (i != 0 && is_176_[i_170_] == 0)
		    is[i_169_++] = i;
		else
		    i_169_++;
		i_170_++;
	    }
	    i_169_ += i_173_;
	    i_168_ += i_174_;
	    i_170_ += i_175_;
	}
    }
    
    public void method645(int i, int i_181_, int i_182_, int i_183_,
			  int i_184_, int i_185_) {
	if (i_185_ != 0) {
	    i -= anInt3909 << 4;
	    i_181_ -= anInt3908 << 4;
	    double d = (double) (i_184_ & 0xffff) * 9.587379924285257E-5;
	    int i_186_ = (int) Math.floor(Math.sin(d) * (double) i_185_ + 0.5);
	    int i_187_ = (int) Math.floor(Math.cos(d) * (double) i_185_ + 0.5);
	    int i_188_ = -i * i_187_ + -i_181_ * i_186_;
	    int i_189_ = i * i_186_ + -i_181_ * i_187_;
	    int i_190_ = ((width << 4) - i) * i_187_ + -i_181_ * i_186_;
	    int i_191_ = -((width << 4) - i) * i_186_ + -i_181_ * i_187_;
	    int i_192_ = -i * i_187_ + ((height << 4) - i_181_) * i_186_;
	    int i_193_ = i * i_186_ + ((height << 4) - i_181_) * i_187_;
	    int i_194_ = (((width << 4) - i) * i_187_
			  + ((height << 4) - i_181_) * i_186_);
	    int i_195_ = (-((width << 4) - i) * i_186_
			  + ((height << 4) - i_181_) * i_187_);
	    int i_196_;
	    int i_197_;
	    if (i_188_ < i_190_) {
		i_196_ = i_188_;
		i_197_ = i_190_;
	    } else {
		i_196_ = i_190_;
		i_197_ = i_188_;
	    }
	    if (i_192_ < i_196_)
		i_196_ = i_192_;
	    if (i_194_ < i_196_)
		i_196_ = i_194_;
	    if (i_192_ > i_197_)
		i_197_ = i_192_;
	    if (i_194_ > i_197_)
		i_197_ = i_194_;
	    int i_198_;
	    int i_199_;
	    if (i_189_ < i_191_) {
		i_198_ = i_189_;
		i_199_ = i_191_;
	    } else {
		i_198_ = i_191_;
		i_199_ = i_189_;
	    }
	    if (i_193_ < i_198_)
		i_198_ = i_193_;
	    if (i_195_ < i_198_)
		i_198_ = i_195_;
	    if (i_193_ > i_199_)
		i_199_ = i_193_;
	    if (i_195_ > i_199_)
		i_199_ = i_195_;
	    i_196_ >>= 12;
	    i_197_ = i_197_ + 4095 >> 12;
	    i_198_ >>= 12;
	    i_199_ = i_199_ + 4095 >> 12;
	    i_196_ += i_182_;
	    i_197_ += i_182_;
	    i_198_ += i_183_;
	    i_199_ += i_183_;
	    i_196_ >>= 4;
	    i_197_ = i_197_ + 15 >> 4;
	    i_198_ >>= 4;
	    i_199_ = i_199_ + 15 >> 4;
	    if (i_196_ < Graphics2D.anInt2661)
		i_196_ = Graphics2D.anInt2661;
	    if (i_197_ > Graphics2D.anInt2667)
		i_197_ = Graphics2D.anInt2667;
	    if (i_198_ < Graphics2D.anInt2663)
		i_198_ = Graphics2D.anInt2663;
	    if (i_199_ > Graphics2D.anInt2664)
		i_199_ = Graphics2D.anInt2664;
	    i_197_ = i_196_ - i_197_;
	    if (i_197_ < 0) {
		i_199_ = i_198_ - i_199_;
		if (i_199_ < 0) {
		    int i_200_ = i_198_ * Graphics2D.width + i_196_;
		    double d_201_ = 1.6777216E7 / (double) i_185_;
		    int i_202_ = (int) Math.floor(Math.sin(d) * d_201_ + 0.5);
		    int i_203_ = (int) Math.floor(Math.cos(d) * d_201_ + 0.5);
		    int i_204_ = (i_196_ << 4) + 8 - i_182_;
		    int i_205_ = (i_198_ << 4) + 8 - i_183_;
		    int i_206_ = (i << 8) - (i_205_ * i_202_ >> 4);
		    int i_207_ = (i_181_ << 8) + (i_205_ * i_203_ >> 4);
		    if (i_203_ == 0) {
			if (i_202_ == 0) {
			    int i_208_ = i_199_;
			    while (i_208_ < 0) {
				int i_209_ = i_200_;
				int i_210_ = i_206_;
				int i_211_ = i_207_;
				int i_212_ = i_197_;
				if (i_210_ >= 0 && i_211_ >= 0
				    && i_210_ - (width << 12) < 0
				    && i_211_ - (height << 12) < 0) {
				    for (/**/; i_212_ < 0; i_212_++) {
					int i_213_
					    = (pixels
					       [((i_211_ >> 12) * width
						 + (i_210_ >> 12))]);
					if (i_213_ != 0)
					    Graphics2D
						.pixels[i_209_++]
						= i_213_;
					else
					    i_209_++;
				    }
				}
				i_208_++;
				i_200_ += Graphics2D.width;
			    }
			} else if (i_202_ < 0) {
			    int i_214_ = i_199_;
			    while (i_214_ < 0) {
				int i_215_ = i_200_;
				int i_216_ = i_206_;
				int i_217_ = i_207_ + (i_204_ * i_202_ >> 4);
				int i_218_ = i_197_;
				if (i_216_ >= 0
				    && i_216_ - (width << 12) < 0) {
				    int i_219_;
				    if ((i_219_ = i_217_ - (height << 12))
					>= 0) {
					i_219_ = (i_202_ - i_219_) / i_202_;
					i_218_ += i_219_;
					i_217_ += i_202_ * i_219_;
					i_215_ += i_219_;
				    }
				    if ((i_219_ = (i_217_ - i_202_) / i_202_)
					> i_218_)
					i_218_ = i_219_;
				    for (/**/; i_218_ < 0; i_218_++) {
					int i_220_
					    = (pixels
					       [((i_217_ >> 12) * width
						 + (i_216_ >> 12))]);
					if (i_220_ != 0)
					    Graphics2D
						.pixels[i_215_++]
						= i_220_;
					else
					    i_215_++;
					i_217_ += i_202_;
				    }
				}
				i_214_++;
				i_206_ -= i_202_;
				i_200_ += Graphics2D.width;
			    }
			} else {
			    int i_221_ = i_199_;
			    while (i_221_ < 0) {
				int i_222_ = i_200_;
				int i_223_ = i_206_;
				int i_224_ = i_207_ + (i_204_ * i_202_ >> 4);
				int i_225_ = i_197_;
				if (i_223_ >= 0
				    && i_223_ - (width << 12) < 0) {
				    if (i_224_ < 0) {
					int i_226_
					    = (i_202_ - 1 - i_224_) / i_202_;
					i_225_ += i_226_;
					i_224_ += i_202_ * i_226_;
					i_222_ += i_226_;
				    }
				    int i_227_;
				    if ((i_227_
					 = (1 + i_224_ - (height << 12)
					    - i_202_) / i_202_)
					> i_225_)
					i_225_ = i_227_;
				    for (/**/; i_225_ < 0; i_225_++) {
					int i_228_
					    = (pixels
					       [((i_224_ >> 12) * width
						 + (i_223_ >> 12))]);
					if (i_228_ != 0)
					    Graphics2D
						.pixels[i_222_++]
						= i_228_;
					else
					    i_222_++;
					i_224_ += i_202_;
				    }
				}
				i_221_++;
				i_206_ -= i_202_;
				i_200_ += Graphics2D.width;
			    }
			}
		    } else if (i_203_ < 0) {
			if (i_202_ == 0) {
			    int i_229_ = i_199_;
			    while (i_229_ < 0) {
				int i_230_ = i_200_;
				int i_231_ = i_206_ + (i_204_ * i_203_ >> 4);
				int i_232_ = i_207_;
				int i_233_ = i_197_;
				if (i_232_ >= 0
				    && i_232_ - (height << 12) < 0) {
				    int i_234_;
				    if ((i_234_ = i_231_ - (width << 12))
					>= 0) {
					i_234_ = (i_203_ - i_234_) / i_203_;
					i_233_ += i_234_;
					i_231_ += i_203_ * i_234_;
					i_230_ += i_234_;
				    }
				    if ((i_234_ = (i_231_ - i_203_) / i_203_)
					> i_233_)
					i_233_ = i_234_;
				    for (/**/; i_233_ < 0; i_233_++) {
					int i_235_
					    = (pixels
					       [((i_232_ >> 12) * width
						 + (i_231_ >> 12))]);
					if (i_235_ != 0)
					    Graphics2D
						.pixels[i_230_++]
						= i_235_;
					else
					    i_230_++;
					i_231_ += i_203_;
				    }
				}
				i_229_++;
				i_207_ += i_203_;
				i_200_ += Graphics2D.width;
			    }
			} else if (i_202_ < 0) {
			    int i_236_ = i_199_;
			    while (i_236_ < 0) {
				int i_237_ = i_200_;
				int i_238_ = i_206_ + (i_204_ * i_203_ >> 4);
				int i_239_ = i_207_ + (i_204_ * i_202_ >> 4);
				int i_240_ = i_197_;
				int i_241_;
				if ((i_241_ = i_238_ - (width << 12))
				    >= 0) {
				    i_241_ = (i_203_ - i_241_) / i_203_;
				    i_240_ += i_241_;
				    i_238_ += i_203_ * i_241_;
				    i_239_ += i_202_ * i_241_;
				    i_237_ += i_241_;
				}
				if ((i_241_ = (i_238_ - i_203_) / i_203_)
				    > i_240_)
				    i_240_ = i_241_;
				if ((i_241_ = i_239_ - (height << 12))
				    >= 0) {
				    i_241_ = (i_202_ - i_241_) / i_202_;
				    i_240_ += i_241_;
				    i_238_ += i_203_ * i_241_;
				    i_239_ += i_202_ * i_241_;
				    i_237_ += i_241_;
				}
				if ((i_241_ = (i_239_ - i_202_) / i_202_)
				    > i_240_)
				    i_240_ = i_241_;
				for (/**/; i_240_ < 0; i_240_++) {
				    int i_242_ = (pixels
						  [((i_239_ >> 12) * width
						    + (i_238_ >> 12))]);
				    if (i_242_ != 0)
					Graphics2D.pixels
					    [i_237_++]
					    = i_242_;
				    else
					i_237_++;
				    i_238_ += i_203_;
				    i_239_ += i_202_;
				}
				i_236_++;
				i_206_ -= i_202_;
				i_207_ += i_203_;
				i_200_ += Graphics2D.width;
			    }
			} else {
			    int i_243_ = i_199_;
			    while (i_243_ < 0) {
				int i_244_ = i_200_;
				int i_245_ = i_206_ + (i_204_ * i_203_ >> 4);
				int i_246_ = i_207_ + (i_204_ * i_202_ >> 4);
				int i_247_ = i_197_;
				int i_248_;
				if ((i_248_ = i_245_ - (width << 12))
				    >= 0) {
				    i_248_ = (i_203_ - i_248_) / i_203_;
				    i_247_ += i_248_;
				    i_245_ += i_203_ * i_248_;
				    i_246_ += i_202_ * i_248_;
				    i_244_ += i_248_;
				}
				if ((i_248_ = (i_245_ - i_203_) / i_203_)
				    > i_247_)
				    i_247_ = i_248_;
				if (i_246_ < 0) {
				    i_248_ = (i_202_ - 1 - i_246_) / i_202_;
				    i_247_ += i_248_;
				    i_245_ += i_203_ * i_248_;
				    i_246_ += i_202_ * i_248_;
				    i_244_ += i_248_;
				}
				if ((i_248_ = (1 + i_246_ - (height << 12)
					       - i_202_) / i_202_)
				    > i_247_)
				    i_247_ = i_248_;
				for (/**/; i_247_ < 0; i_247_++) {
				    int i_249_ = (pixels
						  [((i_246_ >> 12) * width
						    + (i_245_ >> 12))]);
				    if (i_249_ != 0)
					Graphics2D.pixels
					    [i_244_++]
					    = i_249_;
				    else
					i_244_++;
				    i_245_ += i_203_;
				    i_246_ += i_202_;
				}
				i_243_++;
				i_206_ -= i_202_;
				i_207_ += i_203_;
				i_200_ += Graphics2D.width;
			    }
			}
		    } else if (i_202_ == 0) {
			int i_250_ = i_199_;
			while (i_250_ < 0) {
			    int i_251_ = i_200_;
			    int i_252_ = i_206_ + (i_204_ * i_203_ >> 4);
			    int i_253_ = i_207_;
			    int i_254_ = i_197_;
			    if (i_253_ >= 0
				&& i_253_ - (height << 12) < 0) {
				if (i_252_ < 0) {
				    int i_255_
					= (i_203_ - 1 - i_252_) / i_203_;
				    i_254_ += i_255_;
				    i_252_ += i_203_ * i_255_;
				    i_251_ += i_255_;
				}
				int i_256_;
				if ((i_256_ = (1 + i_252_ - (width << 12)
					       - i_203_) / i_203_)
				    > i_254_)
				    i_254_ = i_256_;
				for (/**/; i_254_ < 0; i_254_++) {
				    int i_257_ = (pixels
						  [((i_253_ >> 12) * width
						    + (i_252_ >> 12))]);
				    if (i_257_ != 0)
					Graphics2D.pixels
					    [i_251_++]
					    = i_257_;
				    else
					i_251_++;
				    i_252_ += i_203_;
				}
			    }
			    i_250_++;
			    i_207_ += i_203_;
			    i_200_ += Graphics2D.width;
			}
		    } else if (i_202_ < 0) {
			int i_258_ = i_199_;
			while (i_258_ < 0) {
			    int i_259_ = i_200_;
			    int i_260_ = i_206_ + (i_204_ * i_203_ >> 4);
			    int i_261_ = i_207_ + (i_204_ * i_202_ >> 4);
			    int i_262_ = i_197_;
			    if (i_260_ < 0) {
				int i_263_ = (i_203_ - 1 - i_260_) / i_203_;
				i_262_ += i_263_;
				i_260_ += i_203_ * i_263_;
				i_261_ += i_202_ * i_263_;
				i_259_ += i_263_;
			    }
			    int i_264_;
			    if ((i_264_ = (1 + i_260_ - (width << 12)
					   - i_203_) / i_203_)
				> i_262_)
				i_262_ = i_264_;
			    if ((i_264_ = i_261_ - (height << 12)) >= 0) {
				i_264_ = (i_202_ - i_264_) / i_202_;
				i_262_ += i_264_;
				i_260_ += i_203_ * i_264_;
				i_261_ += i_202_ * i_264_;
				i_259_ += i_264_;
			    }
			    if ((i_264_ = (i_261_ - i_202_) / i_202_) > i_262_)
				i_262_ = i_264_;
			    for (/**/; i_262_ < 0; i_262_++) {
				int i_265_
				    = (pixels
				       [(i_261_ >> 12) * width + (i_260_
								      >> 12)]);
				if (i_265_ != 0)
				    Graphics2D.pixels[i_259_++]
					= i_265_;
				else
				    i_259_++;
				i_260_ += i_203_;
				i_261_ += i_202_;
			    }
			    i_258_++;
			    i_206_ -= i_202_;
			    i_207_ += i_203_;
			    i_200_ += Graphics2D.width;
			}
		    } else {
			int i_266_ = i_199_;
			while (i_266_ < 0) {
			    int i_267_ = i_200_;
			    int i_268_ = i_206_ + (i_204_ * i_203_ >> 4);
			    int i_269_ = i_207_ + (i_204_ * i_202_ >> 4);
			    int i_270_ = i_197_;
			    if (i_268_ < 0) {
				int i_271_ = (i_203_ - 1 - i_268_) / i_203_;
				i_270_ += i_271_;
				i_268_ += i_203_ * i_271_;
				i_269_ += i_202_ * i_271_;
				i_267_ += i_271_;
			    }
			    int i_272_;
			    if ((i_272_ = (1 + i_268_ - (width << 12)
					   - i_203_) / i_203_)
				> i_270_)
				i_270_ = i_272_;
			    if (i_269_ < 0) {
				i_272_ = (i_202_ - 1 - i_269_) / i_202_;
				i_270_ += i_272_;
				i_268_ += i_203_ * i_272_;
				i_269_ += i_202_ * i_272_;
				i_267_ += i_272_;
			    }
			    if ((i_272_ = (1 + i_269_ - (height << 12)
					   - i_202_) / i_202_)
				> i_270_)
				i_270_ = i_272_;
			    for (/**/; i_270_ < 0; i_270_++) {
				int i_273_
				    = (pixels
				       [(i_269_ >> 12) * width + (i_268_
								      >> 12)]);
				if (i_273_ != 0)
				    Graphics2D.pixels[i_267_++]
					= i_273_;
				else
				    i_267_++;
				i_268_ += i_203_;
				i_269_ += i_202_;
			    }
			    i_266_++;
			    i_206_ -= i_202_;
			    i_207_ += i_203_;
			    i_200_ += Graphics2D.width;
			}
		    }
		}
	    }
	}
    }
    
    public void method646(int i, int i_274_, int i_275_, int i_276_) {
	int i_277_ = anInt3906 << 3;
	int i_278_ = anInt3905 << 3;
	i = (i << 4) + (i_277_ & 0xf);
	i_274_ = (i_274_ << 4) + (i_278_ & 0xf);
	method645(i_277_, i_278_, i, i_274_, i_275_, i_276_);
    }
    
    public void method647(int i, int i_279_, int i_280_, int i_281_,
			  int i_282_, int i_283_, double d, int i_284_) {
	try {
	    int i_285_ = -i_280_ / 2;
	    int i_286_ = -i_281_ / 2;
	    int i_287_ = (int) (Math.sin(d) * 65536.0);
	    int i_288_ = (int) (Math.cos(d) * 65536.0);
	    i_287_ = i_287_ * i_284_ >> 8;
	    i_288_ = i_288_ * i_284_ >> 8;
	    int i_289_ = (i_282_ << 16) + (i_286_ * i_287_ + i_285_ * i_288_);
	    int i_290_ = (i_283_ << 16) + (i_286_ * i_288_ - i_285_ * i_287_);
	    int i_291_ = i + i_279_ * Graphics2D.width;
	    for (i_279_ = 0; i_279_ < i_281_; i_279_++) {
		int i_292_ = i_291_;
		int i_293_ = i_289_;
		int i_294_ = i_290_;
		for (i = -i_280_; i < 0; i++) {
		    int i_295_
			= (pixels
			   [(i_293_ >> 16) + (i_294_ >> 16) * width]);
		    if (i_295_ != 0)
			Graphics2D.pixels[i_292_++] = i_295_;
		    else
			i_292_++;
		    i_293_ += i_288_;
		    i_294_ -= i_287_;
		}
		i_289_ += i_287_;
		i_290_ += i_288_;
		i_291_ += Graphics2D.width;
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public Sprite method648() {
	Sprite class37_sub4_sub9_sub3_296_
	    = new Sprite(width, height);
	class37_sub4_sub9_sub3_296_.anInt3906 = anInt3906;
	class37_sub4_sub9_sub3_296_.anInt3905 = anInt3905;
	class37_sub4_sub9_sub3_296_.anInt3909
	    = anInt3906 - width - anInt3909;
	class37_sub4_sub9_sub3_296_.anInt3908 = anInt3908;
	for (int i = 0; i < height; i++) {
	    for (int i_297_ = 0; i_297_ < width; i_297_++)
		class37_sub4_sub9_sub3_296_.pixels[(i * width
							    + i_297_)]
		    = pixels[i * width + width - 1 - i_297_];
	}
	return class37_sub4_sub9_sub3_296_;
    }
    
    public void method649(int i) {
	if (width != anInt3906 || height != anInt3905) {
	    int i_298_ = i;
	    if (i_298_ > anInt3909)
		i_298_ = anInt3909;
	    int i_299_ = i;
	    if (i_299_ + anInt3909 + width > anInt3906)
		i_299_ = anInt3906 - anInt3909 - width;
	    int i_300_ = i;
	    if (i_300_ > anInt3908)
		i_300_ = anInt3908;
	    int i_301_ = i;
	    if (i_301_ + anInt3908 + height > anInt3905)
		i_301_ = anInt3905 - anInt3908 - height;
	    int i_302_ = width + i_298_ + i_299_;
	    int i_303_ = height + i_300_ + i_301_;
	    int[] is = new int[i_302_ * i_303_];
	    for (int i_304_ = 0; i_304_ < height; i_304_++) {
		for (int i_305_ = 0; i_305_ < width; i_305_++)
		    is[(i_304_ + i_300_) * i_302_ + (i_305_ + i_298_)]
			= pixels[i_304_ * width + i_305_];
	    }
	    pixels = is;
	    width = i_302_;
	    height = i_303_;
	    anInt3909 -= i_298_;
	    anInt3908 -= i_300_;
	}
    }
    
	public void dumpImage(String directory, String name, boolean transparency) {
		try {
			java.awt.image.DirectColorModel model = new java.awt.image.DirectColorModel(24,
					0xFF0000, 0x00FF00, 0x0000FF);
			int[] bandmasks = new int[] { model.getRedMask(), model.getGreenMask(), model.getBlueMask() };
			int w = width;
			int h = height;
			int[] pix = pixels;
			if (transparency)
				for (int i = 0; i < pix.length; i++)
					if (pix[i] == 0)
						pix[i] = 0xFFFFFF;
			java.awt.image.DataBufferInt buffer = new java.awt.image.DataBufferInt(pix, pix.length);
			java.awt.image.WritableRaster raster = java.awt.image.Raster.createPackedRaster(buffer,
					w, h, w, bandmasks, null);
			java.awt.image.BufferedImage img = new java.awt.image.BufferedImage(model, raster, true, new Hashtable<Object, Object>());
			
			Image image = makeColorTransparent(img, new Color(0xFFFFFF));
			
			BufferedImage transparent = imageToBufferedImage(image);
			
			javax.imageio.ImageIO.write(transparent, "png", new java.io.File("c:/" + directory + "/"+ name + ".png"));
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
	
    private static BufferedImage imageToBufferedImage(Image image) {

    	BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
    	java.awt.Graphics2D g2 = (java.awt.Graphics2D) bufferedImage.createGraphics();
    	g2.drawImage(image, 0, 0, null);
    	g2.dispose();

    	return bufferedImage;

    }

    public static Image makeColorTransparent(BufferedImage im, final Color color) {
    	ImageFilter filter = new RGBImageFilter() {

    		// the color we are looking for... Alpha bits are set to opaque
    		public int markerRGB = color.getRGB() | 0xFF000000;

    		public final int filterRGB(int x, int y, int rgb) {
    			if ((rgb | 0xFF000000) == markerRGB) {
    				// Mark the alpha bits as zero - transparent
    				return 0x00FFFFFF & rgb;
    			} else {
    				// nothing to do
    				return rgb;
    			}
    		}
    	};

    	ImageProducer ip = new FilteredImageSource(im.getSource(), filter);
    	return Toolkit.getDefaultToolkit().createImage(ip);
    }
    
    public void flip_horizontal() {
	int[] is = new int[width * height];
	int i = 0;
	for (int i_306_ = 0; i_306_ < height; i_306_++) {
	    for (int i_307_ = width - 1; i_307_ >= 0; i_307_--)
		is[i++] = pixels[i_307_ + i_306_ * width];
	}
	pixels = is;
	anInt3909 = anInt3906 - width - anInt3909;
    }
    
    public static void method651(int[] is, int[] is_308_, int i, int i_309_,
				 int i_310_, int i_311_, int i_312_,
				 int i_313_, int i_314_, int i_315_) {
	int i_316_ = 256 - i_315_;
	for (int i_317_ = -i_312_; i_317_ < 0; i_317_++) {
	    for (int i_318_ = -i_311_; i_318_ < 0; i_318_++) {
		i = is_308_[i_309_++];
		if (i != 0) {
		    int i_319_ = is[i_310_];
		    is[i_310_++] = ((((i & 0xff00ff) * i_315_
				      + (i_319_ & 0xff00ff) * i_316_)
				     & ~0xff00ff)
				    + (((i & 0xff00) * i_315_
					+ (i_319_ & 0xff00) * i_316_)
				       & 0xff0000)) >> 8;
		} else
		    i_310_++;
	    }
	    i_310_ += i_313_;
	    i_309_ += i_314_;
	}
    }
    
    public void method652(int i, int i_320_) {
	i += anInt3909;
	i_320_ += anInt3908;
	int i_321_ = i + i_320_ * Graphics2D.width;
	int i_322_ = 0;
	int i_323_ = height;
	int i_324_ = width;
	int i_325_ = Graphics2D.width - i_324_;
	int i_326_ = 0;
	if (i_320_ < Graphics2D.anInt2663) {
	    int i_327_ = Graphics2D.anInt2663 - i_320_;
	    i_323_ -= i_327_;
	    i_320_ = Graphics2D.anInt2663;
	    i_322_ += i_327_ * i_324_;
	    i_321_ += i_327_ * Graphics2D.width;
	}
	if (i_320_ + i_323_ > Graphics2D.anInt2664)
	    i_323_ -= i_320_ + i_323_ - Graphics2D.anInt2664;
	if (i < Graphics2D.anInt2661) {
	    int i_328_ = Graphics2D.anInt2661 - i;
	    i_324_ -= i_328_;
	    i = Graphics2D.anInt2661;
	    i_322_ += i_328_;
	    i_321_ += i_328_;
	    i_326_ += i_328_;
	    i_325_ += i_328_;
	}
	if (i + i_324_ > Graphics2D.anInt2667) {
	    int i_329_ = i + i_324_ - Graphics2D.anInt2667;
	    i_324_ -= i_329_;
	    i_326_ += i_329_;
	    i_325_ += i_329_;
	}
	if (i_324_ > 0 && i_323_ > 0)
	    method640(Graphics2D.pixels, pixels, i_322_,
		      i_321_, i_324_, i_323_, i_325_, i_326_);
    }
    
    public void method653(int i, int i_330_) {
	i += anInt3909;
	i_330_ += anInt3908;
	int i_331_ = i + i_330_ * Graphics2D.width;
	int i_332_ = 0;
	int i_333_ = height;
	int i_334_ = width;
	int i_335_ = Graphics2D.width - i_334_;
	int i_336_ = 0;
	if (i_330_ < Graphics2D.anInt2663) {
	    int i_337_ = Graphics2D.anInt2663 - i_330_;
	    i_333_ -= i_337_;
	    i_330_ = Graphics2D.anInt2663;
	    i_332_ += i_337_ * i_334_;
	    i_331_ += i_337_ * Graphics2D.width;
	}
	if (i_330_ + i_333_ > Graphics2D.anInt2664)
	    i_333_ -= i_330_ + i_333_ - Graphics2D.anInt2664;
	if (i < Graphics2D.anInt2661) {
	    int i_338_ = Graphics2D.anInt2661 - i;
	    i_334_ -= i_338_;
	    i = Graphics2D.anInt2661;
	    i_332_ += i_338_;
	    i_331_ += i_338_;
	    i_336_ += i_338_;
	    i_335_ += i_338_;
	}
	if (i + i_334_ > Graphics2D.anInt2667) {
	    int i_339_ = i + i_334_ - Graphics2D.anInt2667;
	    i_334_ -= i_339_;
	    i_336_ += i_339_;
	    i_335_ += i_339_;
	}
	if (i_334_ > 0 && i_333_ > 0)
	    method631(Graphics2D.pixels, pixels, 0,
		      i_332_, i_331_, i_334_, i_333_, i_335_, i_336_);
    }
    
    public void flip_vertical() {
	int[] is = new int[width * height];
	int i = 0;
	for (int i_340_ = height - 1; i_340_ >= 0; i_340_--) {
	    for (int i_341_ = 0; i_341_ < width; i_341_++)
		is[i++] = pixels[i_341_ + i_340_ * width];
	}
	pixels = is;
	anInt3908 = anInt3905 - height - anInt3908;
    }
    
    public Sprite() {
	/* empty */
    }
    
    public Sprite(int i, int i_342_) {
	pixels = new int[i * i_342_];
	width = anInt3906 = i;
	height = anInt3905 = i_342_;
	anInt3909 = anInt3908 = 0;
    }
    
    public void method655(int i) {
	for (int i_343_ = height - 1; i_343_ > 0; i_343_--) {
	    int i_344_ = i_343_ * width;
	    for (int i_345_ = width - 1; i_345_ > 0; i_345_--) {
		if (pixels[i_345_ + i_344_] == 0
		    && pixels[i_345_ + i_344_ - 1 - width] != 0)
		    pixels[i_345_ + i_344_] = i;
	    }
	}
    }
    
    public Sprite(byte[] is, Component component) {
	try {
	    Image image = Toolkit.getDefaultToolkit().createImage(is);
	    MediaTracker mediatracker = new MediaTracker(component);
	    mediatracker.addImage(image, 0);
	    mediatracker.waitForAll();
	    width = image.getWidth(component);
	    height = image.getHeight(component);
	    anInt3906 = width;
	    anInt3905 = height;
	    anInt3909 = 0;
	    anInt3908 = 0;
	    pixels = new int[width * height];
	    PixelGrabber pixelgrabber
		= new PixelGrabber(image, 0, 0, width, height,
				   pixels, 0, width);
	    pixelgrabber.grabPixels();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
}
