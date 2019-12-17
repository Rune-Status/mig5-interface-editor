package org.ie.client;

/* Class37_Sub3_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub3_Sub4 extends Class37_Sub3
{
    public int anInt2406;
    public int anInt2407;
    public int anInt2408;
    public int anInt2409;
    public int anInt2410;
    public int anInt2411;
    public int anInt2412;
    public boolean aBoolean2413;
    public int anInt2414;
    public int anInt2415;
    public int anInt2416;
    public int anInt2417;
    public int anInt2418;
    public int anInt2419;
    public int anInt2420;
    
    public static Class37_Sub3_Sub4 method391
	(Class37_Sub22_Sub1 class37_sub22_sub1, int i, int i_0_, int i_1_) {
	if (class37_sub22_sub1.aByteArray3632 == null
	    || class37_sub22_sub1.aByteArray3632.length == 0)
	    return null;
	return new Class37_Sub3_Sub4(class37_sub22_sub1, i, i_0_, i_1_);
    }
    
    public static Class37_Sub3_Sub4 method392
	(Class37_Sub22_Sub1 class37_sub22_sub1, int i, int i_2_) {
	if (class37_sub22_sub1.aByteArray3632 == null
	    || class37_sub22_sub1.aByteArray3632.length == 0)
	    return null;
	return new Class37_Sub3_Sub4(class37_sub22_sub1,
				     (int) ((long) class37_sub22_sub1.anInt3630
					    * 256L * (long) i
					    / (long) (100 * Class33.anInt765)),
				     i_2_ << 6);
    }
    
    public static int method393(byte[] is, int[] is_3_, int i, int i_4_,
				int i_5_, int i_6_, int i_7_, int i_8_,
				Class37_Sub3_Sub4 class37_sub3_sub4) {
	i >>= 8;
	i_8_ >>= 8;
	i_5_ <<= 2;
	if ((i_6_ = i_4_ + i_8_ - i) > i_7_)
	    i_6_ = i_7_;
	i_6_ -= 3;
	while (i_4_ < i_6_) {
	    is_3_[i_4_++] += is[i++] * i_5_;
	    is_3_[i_4_++] += is[i++] * i_5_;
	    is_3_[i_4_++] += is[i++] * i_5_;
	    is_3_[i_4_++] += is[i++] * i_5_;
	}
	i_6_ += 3;
	while (i_4_ < i_6_)
	    is_3_[i_4_++] += is[i++] * i_5_;
	class37_sub3_sub4.anInt2406 = i << 8;
	return i_4_;
    }
    
    public int method337() {
	if (anInt2408 == 0 && anInt2418 == 0)
	    return 0;
	return 1;
    }
    
    public int method394(int[] is, int i, int i_9_, int i_10_, int i_11_) {
	while (anInt2418 > 0) {
	    int i_12_ = i + anInt2418;
	    if (i_12_ > i_10_)
		i_12_ = i_10_;
	    anInt2418 += i;
	    if (anInt2411 == 256 && (anInt2406 & 0xff) == 0) {
		if (Class37_Sub4_Sub10.aBoolean2690)
		    i = method404(0,
				  (((Class37_Sub22_Sub1) aClass37_Sub22_1839)
				   .aByteArray3632),
				  is, anInt2406, i, anInt2414, anInt2417,
				  anInt2407, anInt2415, 0, i_12_, i_9_, this);
		else
		    i = method418((((Class37_Sub22_Sub1) aClass37_Sub22_1839)
				   .aByteArray3632),
				  is, anInt2406, i, anInt2416, anInt2409, 0,
				  i_12_, i_9_, this);
	    } else if (Class37_Sub4_Sub10.aBoolean2690)
		i = method395(0, 0,
			      (((Class37_Sub22_Sub1) aClass37_Sub22_1839)
			       .aByteArray3632),
			      is, anInt2406, i, anInt2414, anInt2417,
			      anInt2407, anInt2415, 0, i_12_, i_9_, this,
			      anInt2411, i_11_);
	    else
		i = method423(0, 0,
			      (((Class37_Sub22_Sub1) aClass37_Sub22_1839)
			       .aByteArray3632),
			      is, anInt2406, i, anInt2416, anInt2409, 0, i_12_,
			      i_9_, this, anInt2411, i_11_);
	    anInt2418 -= i;
	    if (anInt2418 != 0)
		return i;
	    if (method399())
		return i_10_;
	}
	if (anInt2411 == 256 && (anInt2406 & 0xff) == 0) {
	    if (Class37_Sub4_Sub10.aBoolean2690)
		return method415(0,
				 (((Class37_Sub22_Sub1) aClass37_Sub22_1839)
				  .aByteArray3632),
				 is, anInt2406, i, anInt2414, anInt2417, 0,
				 i_10_, i_9_, this);
	    return method393((((Class37_Sub22_Sub1) aClass37_Sub22_1839)
			      .aByteArray3632),
			     is, anInt2406, i, anInt2416, 0, i_10_, i_9_,
			     this);
	}
	if (Class37_Sub4_Sub10.aBoolean2690)
	    return method397(0, 0,
			     (((Class37_Sub22_Sub1) aClass37_Sub22_1839)
			      .aByteArray3632),
			     is, anInt2406, i, anInt2414, anInt2417, 0, i_10_,
			     i_9_, this, anInt2411, i_11_);
	return method421(0, 0,
			 (((Class37_Sub22_Sub1) aClass37_Sub22_1839)
			  .aByteArray3632),
			 is, anInt2406, i, anInt2416, 0, i_10_, i_9_, this,
			 anInt2411, i_11_);
    }
    
    public static int method395(int i, int i_13_, byte[] is, int[] is_14_,
				int i_15_, int i_16_, int i_17_, int i_18_,
				int i_19_, int i_20_, int i_21_, int i_22_,
				int i_23_, Class37_Sub3_Sub4 class37_sub3_sub4,
				int i_24_, int i_25_) {
	class37_sub3_sub4.anInt2416 -= class37_sub3_sub4.anInt2409 * i_16_;
	if (i_24_ == 0
	    || (i_21_ = i_16_ + (i_23_ - i_15_ + i_24_ - 257) / i_24_) > i_22_)
	    i_21_ = i_22_;
	i_16_ <<= 1;
	i_21_ <<= 1;
	while (i_16_ < i_21_) {
	    i_13_ = i_15_ >> 8;
	    i = is[i_13_];
	    i = (i << 8) + (is[i_13_ + 1] - i) * (i_15_ & 0xff);
	    is_14_[i_16_++] += i * i_17_ >> 6;
	    i_17_ += i_19_;
	    is_14_[i_16_++] += i * i_18_ >> 6;
	    i_18_ += i_20_;
	    i_15_ += i_24_;
	}
	if (i_24_ == 0
	    || ((i_21_ = (i_16_ >> 1) + (i_23_ - i_15_ + i_24_ - 1) / i_24_)
		> i_22_))
	    i_21_ = i_22_;
	i_21_ <<= 1;
	i_13_ = i_25_;
	while (i_16_ < i_21_) {
	    i = is[i_15_ >> 8];
	    i = (i << 8) + (i_13_ - i) * (i_15_ & 0xff);
	    is_14_[i_16_++] += i * i_17_ >> 6;
	    i_17_ += i_19_;
	    is_14_[i_16_++] += i * i_18_ >> 6;
	    i_18_ += i_20_;
	    i_15_ += i_24_;
	}
	i_16_ >>= 1;
	class37_sub3_sub4.anInt2416 += class37_sub3_sub4.anInt2409 * i_16_;
	class37_sub3_sub4.anInt2414 = i_17_;
	class37_sub3_sub4.anInt2417 = i_18_;
	class37_sub3_sub4.anInt2406 = i_15_;
	return i_16_;
    }
    
    public synchronized void method396(int i) {
	if (anInt2411 < 0)
	    anInt2411 = -i;
	else
	    anInt2411 = i;
    }
    
    public static int method397
	(int i, int i_26_, byte[] is, int[] is_27_, int i_28_, int i_29_,
	 int i_30_, int i_31_, int i_32_, int i_33_, int i_34_,
	 Class37_Sub3_Sub4 class37_sub3_sub4, int i_35_, int i_36_) {
	if (i_35_ == 0
	    || (i_32_ = i_29_ + (i_34_ - i_28_ + i_35_ - 257) / i_35_) > i_33_)
	    i_32_ = i_33_;
	i_29_ <<= 1;
	i_32_ <<= 1;
	while (i_29_ < i_32_) {
	    i_26_ = i_28_ >> 8;
	    i = is[i_26_];
	    i = (i << 8) + (is[i_26_ + 1] - i) * (i_28_ & 0xff);
	    is_27_[i_29_++] += i * i_30_ >> 6;
	    is_27_[i_29_++] += i * i_31_ >> 6;
	    i_28_ += i_35_;
	}
	if (i_35_ == 0
	    || ((i_32_ = (i_29_ >> 1) + (i_34_ - i_28_ + i_35_ - 1) / i_35_)
		> i_33_))
	    i_32_ = i_33_;
	i_32_ <<= 1;
	i_26_ = i_36_;
	while (i_29_ < i_32_) {
	    i = is[i_28_ >> 8];
	    i = (i << 8) + (i_26_ - i) * (i_28_ & 0xff);
	    is_27_[i_29_++] += i * i_30_ >> 6;
	    is_27_[i_29_++] += i * i_31_ >> 6;
	    i_28_ += i_35_;
	}
	class37_sub3_sub4.anInt2406 = i_28_;
	return i_29_ >> 1;
    }
    
    public synchronized void method398(int i, int i_37_) {
	anInt2408 = i;
	anInt2410 = i_37_;
	anInt2418 = 0;
	method426();
    }
    
    public boolean method399() {
	int i = anInt2408;
	int i_38_;
	int i_39_;
	if (i == -2147483648)
	    i = i_38_ = i_39_ = 0;
	else {
	    i_38_ = method411(i, anInt2410);
	    i_39_ = method402(i, anInt2410);
	}
	if (anInt2416 != i || anInt2414 != i_38_ || anInt2417 != i_39_) {
	    if (anInt2416 < i) {
		anInt2409 = 1;
		anInt2418 = i - anInt2416;
	    } else if (anInt2416 > i) {
		anInt2409 = -1;
		anInt2418 = anInt2416 - i;
	    } else
		anInt2409 = 0;
	    if (anInt2414 < i_38_) {
		anInt2407 = 1;
		if (anInt2418 == 0 || anInt2418 > i_38_ - anInt2414)
		    anInt2418 = i_38_ - anInt2414;
	    } else if (anInt2414 > i_38_) {
		anInt2407 = -1;
		if (anInt2418 == 0 || anInt2418 > anInt2414 - i_38_)
		    anInt2418 = anInt2414 - i_38_;
	    } else
		anInt2407 = 0;
	    if (anInt2417 < i_39_) {
		anInt2415 = 1;
		if (anInt2418 == 0 || anInt2418 > i_39_ - anInt2417)
		    anInt2418 = i_39_ - anInt2417;
	    } else if (anInt2417 > i_39_) {
		anInt2415 = -1;
		if (anInt2418 == 0 || anInt2418 > anInt2417 - i_39_)
		    anInt2418 = anInt2417 - i_39_;
	    } else
		anInt2415 = 0;
	    return false;
	}
	if (anInt2408 == -2147483648) {
	    anInt2408 = 0;
	    anInt2416 = anInt2414 = anInt2417 = 0;
	    this.unlink();
	    return true;
	}
	method426();
	return false;
    }
    
    public synchronized void method400(int i) {
	if (i == 0) {
	    method414(0);
	    this.unlink();
	} else if (anInt2414 == 0 && anInt2417 == 0) {
	    anInt2418 = 0;
	    anInt2408 = 0;
	    anInt2416 = 0;
	    this.unlink();
	} else {
	    int i_40_ = -anInt2416;
	    if (anInt2416 > i_40_)
		i_40_ = anInt2416;
	    if (-anInt2414 > i_40_)
		i_40_ = -anInt2414;
	    if (anInt2414 > i_40_)
		i_40_ = anInt2414;
	    if (-anInt2417 > i_40_)
		i_40_ = -anInt2417;
	    if (anInt2417 > i_40_)
		i_40_ = anInt2417;
	    if (i > i_40_)
		i = i_40_;
	    anInt2418 = i;
	    anInt2408 = -2147483648;
	    anInt2409 = -anInt2416 / i;
	    anInt2407 = -anInt2414 / i;
	    anInt2415 = -anInt2417 / i;
	}
    }
    
    public synchronized void method401(int i, int i_41_) {
	method413(i, i_41_, method425());
    }
    
    public static int method402(int i, int i_42_) {
	if (i_42_ < 0)
	    return -i;
	return (int) ((double) i * Math.sqrt((double) i_42_ * 1.220703125E-4)
		      + 0.5);
    }
    
    public Class37_Sub3 method343() {
	return null;
    }
    
    public static int method403(int i, byte[] is, int[] is_43_, int i_44_,
				int i_45_, int i_46_, int i_47_, int i_48_,
				int i_49_, int i_50_, int i_51_, int i_52_,
				Class37_Sub3_Sub4 class37_sub3_sub4) {
	i_44_ >>= 8;
	i_52_ >>= 8;
	i_46_ <<= 2;
	i_47_ <<= 2;
	i_48_ <<= 2;
	i_49_ <<= 2;
	if ((i_50_ = i_45_ + i_44_ - (i_52_ - 1)) > i_51_)
	    i_50_ = i_51_;
	class37_sub3_sub4.anInt2416
	    += class37_sub3_sub4.anInt2409 * (i_50_ - i_45_);
	i_45_ <<= 1;
	i_50_ <<= 1;
	i_50_ -= 6;
	while (i_45_ < i_50_) {
	    i = is[i_44_--];
	    is_43_[i_45_++] += i * i_46_;
	    i_46_ += i_48_;
	    is_43_[i_45_++] += i * i_47_;
	    i_47_ += i_49_;
	    i = is[i_44_--];
	    is_43_[i_45_++] += i * i_46_;
	    i_46_ += i_48_;
	    is_43_[i_45_++] += i * i_47_;
	    i_47_ += i_49_;
	    i = is[i_44_--];
	    is_43_[i_45_++] += i * i_46_;
	    i_46_ += i_48_;
	    is_43_[i_45_++] += i * i_47_;
	    i_47_ += i_49_;
	    i = is[i_44_--];
	    is_43_[i_45_++] += i * i_46_;
	    i_46_ += i_48_;
	    is_43_[i_45_++] += i * i_47_;
	    i_47_ += i_49_;
	}
	i_50_ += 6;
	while (i_45_ < i_50_) {
	    i = is[i_44_--];
	    is_43_[i_45_++] += i * i_46_;
	    i_46_ += i_48_;
	    is_43_[i_45_++] += i * i_47_;
	    i_47_ += i_49_;
	}
	class37_sub3_sub4.anInt2414 = i_46_ >> 2;
	class37_sub3_sub4.anInt2417 = i_47_ >> 2;
	class37_sub3_sub4.anInt2406 = i_44_ << 8;
	return i_45_ >> 1;
    }
    
    public static int method404(int i, byte[] is, int[] is_53_, int i_54_,
				int i_55_, int i_56_, int i_57_, int i_58_,
				int i_59_, int i_60_, int i_61_, int i_62_,
				Class37_Sub3_Sub4 class37_sub3_sub4) {
	i_54_ >>= 8;
	i_62_ >>= 8;
	i_56_ <<= 2;
	i_57_ <<= 2;
	i_58_ <<= 2;
	i_59_ <<= 2;
	if ((i_60_ = i_55_ + i_62_ - i_54_) > i_61_)
	    i_60_ = i_61_;
	class37_sub3_sub4.anInt2416
	    += class37_sub3_sub4.anInt2409 * (i_60_ - i_55_);
	i_55_ <<= 1;
	i_60_ <<= 1;
	i_60_ -= 6;
	while (i_55_ < i_60_) {
	    i = is[i_54_++];
	    is_53_[i_55_++] += i * i_56_;
	    i_56_ += i_58_;
	    is_53_[i_55_++] += i * i_57_;
	    i_57_ += i_59_;
	    i = is[i_54_++];
	    is_53_[i_55_++] += i * i_56_;
	    i_56_ += i_58_;
	    is_53_[i_55_++] += i * i_57_;
	    i_57_ += i_59_;
	    i = is[i_54_++];
	    is_53_[i_55_++] += i * i_56_;
	    i_56_ += i_58_;
	    is_53_[i_55_++] += i * i_57_;
	    i_57_ += i_59_;
	    i = is[i_54_++];
	    is_53_[i_55_++] += i * i_56_;
	    i_56_ += i_58_;
	    is_53_[i_55_++] += i * i_57_;
	    i_57_ += i_59_;
	}
	i_60_ += 6;
	while (i_55_ < i_60_) {
	    i = is[i_54_++];
	    is_53_[i_55_++] += i * i_56_;
	    i_56_ += i_58_;
	    is_53_[i_55_++] += i * i_57_;
	    i_57_ += i_59_;
	}
	class37_sub3_sub4.anInt2414 = i_56_ >> 2;
	class37_sub3_sub4.anInt2417 = i_57_ >> 2;
	class37_sub3_sub4.anInt2406 = i_54_ << 8;
	return i_55_ >> 1;
    }
    
    public synchronized void method341(int i) {
	if (anInt2418 > 0) {
	    if (i >= anInt2418) {
		if (anInt2408 == -2147483648) {
		    anInt2408 = 0;
		    anInt2416 = anInt2414 = anInt2417 = 0;
		    this.unlink();
		    i = anInt2418;
		}
		anInt2418 = 0;
		method426();
	    } else {
		anInt2416 += anInt2409 * i;
		anInt2414 += anInt2407 * i;
		anInt2417 += anInt2415 * i;
		anInt2418 -= i;
	    }
	}
	Class37_Sub22_Sub1 class37_sub22_sub1
	    = (Class37_Sub22_Sub1) aClass37_Sub22_1839;
	int i_63_ = anInt2412 << 8;
	int i_64_ = anInt2420 << 8;
	int i_65_ = class37_sub22_sub1.aByteArray3632.length << 8;
	int i_66_ = i_64_ - i_63_;
	if (i_66_ <= 0)
	    anInt2419 = 0;
	if (anInt2406 < 0) {
	    if (anInt2411 > 0)
		anInt2406 = 0;
	    else {
		method412();
		this.unlink();
		return;
	    }
	}
	if (anInt2406 >= i_65_) {
	    if (anInt2411 < 0)
		anInt2406 = i_65_ - 1;
	    else {
		method412();
		this.unlink();
		return;
	    }
	}
	anInt2406 += anInt2411 * i;
	if (anInt2419 < 0) {
	    if (aBoolean2413) {
		if (anInt2411 < 0) {
		    if (anInt2406 >= i_63_)
			return;
		    anInt2406 = i_63_ + i_63_ - 1 - anInt2406;
		    anInt2411 = -anInt2411;
		}
		while (anInt2406 >= i_64_) {
		    anInt2406 = i_64_ + i_64_ - 1 - anInt2406;
		    anInt2411 = -anInt2411;
		    if (anInt2406 >= i_63_)
			break;
		    anInt2406 = i_63_ + i_63_ - 1 - anInt2406;
		    anInt2411 = -anInt2411;
		}
	    } else if (anInt2411 < 0) {
		if (anInt2406 < i_63_)
		    anInt2406 = i_64_ - 1 - (i_64_ - 1 - anInt2406) % i_66_;
	    } else if (anInt2406 >= i_64_)
		anInt2406 = i_63_ + (anInt2406 - i_63_) % i_66_;
	} else {
	    do {
		if (anInt2419 > 0) {
		    if (aBoolean2413) {
			if (anInt2411 < 0) {
			    if (anInt2406 >= i_63_)
				return;
			    anInt2406 = i_63_ + i_63_ - 1 - anInt2406;
			    anInt2411 = -anInt2411;
			    if (--anInt2419 == 0)
				break;
			}
			do {
			    if (anInt2406 < i_64_)
				return;
			    anInt2406 = i_64_ + i_64_ - 1 - anInt2406;
			    anInt2411 = -anInt2411;
			    if (--anInt2419 == 0)
				break;
			    if (anInt2406 >= i_63_)
				return;
			    anInt2406 = i_63_ + i_63_ - 1 - anInt2406;
			    anInt2411 = -anInt2411;
			} while (--anInt2419 != 0);
		    } else if (anInt2411 < 0) {
			if (anInt2406 >= i_63_)
			    return;
			int i_67_ = (i_64_ - 1 - anInt2406) / i_66_;
			if (i_67_ >= anInt2419) {
			    anInt2406 += i_66_ * anInt2419;
			    anInt2419 = 0;
			} else {
			    anInt2406 += i_66_ * i_67_;
			    anInt2419 -= i_67_;
			    return;
			}
		    } else {
			if (anInt2406 < i_64_)
			    return;
			int i_68_ = (anInt2406 - i_63_) / i_66_;
			if (i_68_ >= anInt2419) {
			    anInt2406 -= i_66_ * anInt2419;
			    anInt2419 = 0;
			} else {
			    anInt2406 -= i_66_ * i_68_;
			    anInt2419 -= i_68_;
			    return;
			}
		    }
		}
	    } while (false);
	    if (anInt2411 < 0) {
		if (anInt2406 < 0) {
		    anInt2406 = -1;
		    method412();
		    this.unlink();
		}
	    } else if (anInt2406 >= i_65_) {
		anInt2406 = i_65_;
		method412();
		this.unlink();
	    }
	}
    }
    
    public static int method405(byte[] is, int[] is_69_, int i, int i_70_,
				int i_71_, int i_72_, int i_73_, int i_74_,
				int i_75_,
				Class37_Sub3_Sub4 class37_sub3_sub4) {
	i >>= 8;
	i_75_ >>= 8;
	i_71_ <<= 2;
	i_72_ <<= 2;
	if ((i_73_ = i_70_ + i - (i_75_ - 1)) > i_74_)
	    i_73_ = i_74_;
	class37_sub3_sub4.anInt2414
	    += class37_sub3_sub4.anInt2407 * (i_73_ - i_70_);
	class37_sub3_sub4.anInt2417
	    += class37_sub3_sub4.anInt2415 * (i_73_ - i_70_);
	i_73_ -= 3;
	while (i_70_ < i_73_) {
	    is_69_[i_70_++] += is[i--] * i_71_;
	    i_71_ += i_72_;
	    is_69_[i_70_++] += is[i--] * i_71_;
	    i_71_ += i_72_;
	    is_69_[i_70_++] += is[i--] * i_71_;
	    i_71_ += i_72_;
	    is_69_[i_70_++] += is[i--] * i_71_;
	    i_71_ += i_72_;
	}
	i_73_ += 3;
	while (i_70_ < i_73_) {
	    is_69_[i_70_++] += is[i--] * i_71_;
	    i_71_ += i_72_;
	}
	class37_sub3_sub4.anInt2416 = i_71_ >> 2;
	class37_sub3_sub4.anInt2406 = i << 8;
	return i_70_;
    }
    
    public boolean method406() {
	if (anInt2418 == 0)
	    return false;
	return true;
    }
    
    public synchronized void method407(boolean bool) {
	anInt2411 = (anInt2411 ^ anInt2411 >> 31) + (anInt2411 >>> 31);
	if (bool)
	    anInt2411 = -anInt2411;
    }
    
    public static int method408
	(int i, int i_76_, byte[] is, int[] is_77_, int i_78_, int i_79_,
	 int i_80_, int i_81_, int i_82_, int i_83_, int i_84_,
	 Class37_Sub3_Sub4 class37_sub3_sub4, int i_85_, int i_86_) {
	if (i_85_ == 0
	    || (i_82_ = i_79_ + (i_84_ + 256 - i_78_ + i_85_) / i_85_) > i_83_)
	    i_82_ = i_83_;
	i_79_ <<= 1;
	i_82_ <<= 1;
	while (i_79_ < i_82_) {
	    i_76_ = i_78_ >> 8;
	    i = is[i_76_ - 1];
	    i = (i << 8) + (is[i_76_] - i) * (i_78_ & 0xff);
	    is_77_[i_79_++] += i * i_80_ >> 6;
	    is_77_[i_79_++] += i * i_81_ >> 6;
	    i_78_ += i_85_;
	}
	if (i_85_ == 0
	    || ((i_82_ = (i_79_ >> 1) + (i_84_ - i_78_ + i_85_) / i_85_)
		> i_83_))
	    i_82_ = i_83_;
	i_82_ <<= 1;
	i_76_ = i_86_;
	while (i_79_ < i_82_) {
	    i = (i_76_ << 8) + (is[i_78_ >> 8] - i_76_) * (i_78_ & 0xff);
	    is_77_[i_79_++] += i * i_80_ >> 6;
	    is_77_[i_79_++] += i * i_81_ >> 6;
	    i_78_ += i_85_;
	}
	class37_sub3_sub4.anInt2406 = i_78_;
	return i_79_ >> 1;
    }
    
    public synchronized void method409(int i) {
	method398(i << 6, method425());
    }
    
    public synchronized void method410(int i) {
	int i_87_
	    = (((Class37_Sub22_Sub1) aClass37_Sub22_1839).aByteArray3632.length
	       << 8);
	if (i < -1)
	    i = -1;
	if (i > i_87_)
	    i = i_87_;
	anInt2406 = i;
    }
    
    public static int method411(int i, int i_88_) {
	if (i_88_ < 0)
	    return i;
	return (int) (((double) i
		       * Math.sqrt((double) (16384 - i_88_) * 1.220703125E-4))
		      + 0.5);
    }
    
    public void method412() {
	if (anInt2418 != 0) {
	    if (anInt2408 == -2147483648)
		anInt2408 = 0;
	    anInt2418 = 0;
	    method426();
	}
    }
    
    public synchronized void method413(int i, int i_89_, int i_90_) {
	if (i == 0)
	    method398(i_89_, i_90_);
	else {
	    int i_91_ = method411(i_89_, i_90_);
	    int i_92_ = method402(i_89_, i_90_);
	    if (anInt2414 == i_91_ && anInt2417 == i_92_)
		anInt2418 = 0;
	    else {
		int i_93_ = i_89_ - anInt2416;
		if (anInt2416 - i_89_ > i_93_)
		    i_93_ = anInt2416 - i_89_;
		if (i_91_ - anInt2414 > i_93_)
		    i_93_ = i_91_ - anInt2414;
		if (anInt2414 - i_91_ > i_93_)
		    i_93_ = anInt2414 - i_91_;
		if (i_92_ - anInt2417 > i_93_)
		    i_93_ = i_92_ - anInt2417;
		if (anInt2417 - i_92_ > i_93_)
		    i_93_ = anInt2417 - i_92_;
		if (i > i_93_)
		    i = i_93_;
		anInt2418 = i;
		anInt2408 = i_89_;
		anInt2410 = i_90_;
		anInt2409 = (i_89_ - anInt2416) / i;
		anInt2407 = (i_91_ - anInt2414) / i;
		anInt2415 = (i_92_ - anInt2417) / i;
	    }
	}
    }
    
    public synchronized void method414(int i) {
	method398(i, method425());
    }
    
    public synchronized void method338(int[] is, int i, int i_94_) {
	if (anInt2408 == 0 && anInt2418 == 0)
	    method341(i_94_);
	else {
	    Class37_Sub22_Sub1 class37_sub22_sub1
		= (Class37_Sub22_Sub1) aClass37_Sub22_1839;
	    int i_95_ = anInt2412 << 8;
	    int i_96_ = anInt2420 << 8;
	    int i_97_ = class37_sub22_sub1.aByteArray3632.length << 8;
	    int i_98_ = i_96_ - i_95_;
	    if (i_98_ <= 0)
		anInt2419 = 0;
	    int i_99_ = i;
	    i_94_ += i;
	    if (anInt2406 < 0) {
		if (anInt2411 > 0)
		    anInt2406 = 0;
		else {
		    method412();
		    this.unlink();
		    return;
		}
	    }
	    if (anInt2406 >= i_97_) {
		if (anInt2411 < 0)
		    anInt2406 = i_97_ - 1;
		else {
		    method412();
		    this.unlink();
		    return;
		}
	    }
	    if (anInt2419 < 0) {
		if (aBoolean2413) {
		    if (anInt2411 < 0) {
			i_99_ = method427(is, i_99_, i_95_, i_94_,
					  (class37_sub22_sub1.aByteArray3632
					   [anInt2412]));
			if (anInt2406 >= i_95_)
			    return;
			anInt2406 = i_95_ + i_95_ - 1 - anInt2406;
			anInt2411 = -anInt2411;
		    }
		    for (;;) {
			i_99_ = method394(is, i_99_, i_96_, i_94_,
					  (class37_sub22_sub1.aByteArray3632
					   [anInt2420 - 1]));
			if (anInt2406 < i_96_)
			    break;
			anInt2406 = i_96_ + i_96_ - 1 - anInt2406;
			anInt2411 = -anInt2411;
			i_99_ = method427(is, i_99_, i_95_, i_94_,
					  (class37_sub22_sub1.aByteArray3632
					   [anInt2412]));
			if (anInt2406 >= i_95_)
			    break;
			anInt2406 = i_95_ + i_95_ - 1 - anInt2406;
			anInt2411 = -anInt2411;
		    }
		} else if (anInt2411 < 0) {
		    for (;;) {
			i_99_ = method427(is, i_99_, i_95_, i_94_,
					  (class37_sub22_sub1.aByteArray3632
					   [anInt2420 - 1]));
			if (anInt2406 >= i_95_)
			    break;
			anInt2406
			    = i_96_ - 1 - (i_96_ - 1 - anInt2406) % i_98_;
		    }
		} else {
		    for (;;) {
			i_99_ = method394(is, i_99_, i_96_, i_94_,
					  (class37_sub22_sub1.aByteArray3632
					   [anInt2412]));
			if (anInt2406 < i_96_)
			    break;
			anInt2406 = i_95_ + (anInt2406 - i_95_) % i_98_;
		    }
		}
	    } else {
		do {
		    if (anInt2419 > 0) {
			if (aBoolean2413) {
			    if (anInt2411 < 0) {
				i_99_
				    = method427(is, i_99_, i_95_, i_94_,
						(class37_sub22_sub1
						 .aByteArray3632[anInt2412]));
				if (anInt2406 >= i_95_)
				    return;
				anInt2406 = i_95_ + i_95_ - 1 - anInt2406;
				anInt2411 = -anInt2411;
				if (--anInt2419 == 0)
				    break;
			    }
			    do {
				i_99_ = method394(is, i_99_, i_96_, i_94_,
						  (class37_sub22_sub1
						   .aByteArray3632
						   [anInt2420 - 1]));
				if (anInt2406 < i_96_)
				    return;
				anInt2406 = i_96_ + i_96_ - 1 - anInt2406;
				anInt2411 = -anInt2411;
				if (--anInt2419 == 0)
				    break;
				i_99_
				    = method427(is, i_99_, i_95_, i_94_,
						(class37_sub22_sub1
						 .aByteArray3632[anInt2412]));
				if (anInt2406 >= i_95_)
				    return;
				anInt2406 = i_95_ + i_95_ - 1 - anInt2406;
				anInt2411 = -anInt2411;
			    } while (--anInt2419 != 0);
			} else if (anInt2411 < 0) {
			    for (;;) {
				i_99_ = method427(is, i_99_, i_95_, i_94_,
						  (class37_sub22_sub1
						   .aByteArray3632
						   [anInt2420 - 1]));
				if (anInt2406 >= i_95_)
				    return;
				int i_100_ = (i_96_ - 1 - anInt2406) / i_98_;
				if (i_100_ >= anInt2419) {
				    anInt2406 += i_98_ * anInt2419;
				    anInt2419 = 0;
				    break;
				}
				anInt2406 += i_98_ * i_100_;
				anInt2419 -= i_100_;
			    }
			} else {
			    for (;;) {
				i_99_
				    = method394(is, i_99_, i_96_, i_94_,
						(class37_sub22_sub1
						 .aByteArray3632[anInt2412]));
				if (anInt2406 < i_96_)
				    return;
				int i_101_ = (anInt2406 - i_95_) / i_98_;
				if (i_101_ >= anInt2419) {
				    anInt2406 -= i_98_ * anInt2419;
				    anInt2419 = 0;
				    break;
				}
				anInt2406 -= i_98_ * i_101_;
				anInt2419 -= i_101_;
			    }
			}
		    }
		} while (false);
		if (anInt2411 < 0) {
		    method427(is, i_99_, 0, i_94_, 0);
		    if (anInt2406 < 0) {
			anInt2406 = -1;
			method412();
			this.unlink();
		    }
		} else {
		    method394(is, i_99_, i_97_, i_94_, 0);
		    if (anInt2406 >= i_97_) {
			anInt2406 = i_97_;
			method412();
			this.unlink();
		    }
		}
	    }
	}
    }
    
    public static int method415(int i, byte[] is, int[] is_102_, int i_103_,
				int i_104_, int i_105_, int i_106_, int i_107_,
				int i_108_, int i_109_,
				Class37_Sub3_Sub4 class37_sub3_sub4) {
	i_103_ >>= 8;
	i_109_ >>= 8;
	i_105_ <<= 2;
	i_106_ <<= 2;
	if ((i_107_ = i_104_ + i_109_ - i_103_) > i_108_)
	    i_107_ = i_108_;
	i_104_ <<= 1;
	i_107_ <<= 1;
	i_107_ -= 6;
	while (i_104_ < i_107_) {
	    i = is[i_103_++];
	    is_102_[i_104_++] += i * i_105_;
	    is_102_[i_104_++] += i * i_106_;
	    i = is[i_103_++];
	    is_102_[i_104_++] += i * i_105_;
	    is_102_[i_104_++] += i * i_106_;
	    i = is[i_103_++];
	    is_102_[i_104_++] += i * i_105_;
	    is_102_[i_104_++] += i * i_106_;
	    i = is[i_103_++];
	    is_102_[i_104_++] += i * i_105_;
	    is_102_[i_104_++] += i * i_106_;
	}
	i_107_ += 6;
	while (i_104_ < i_107_) {
	    i = is[i_103_++];
	    is_102_[i_104_++] += i * i_105_;
	    is_102_[i_104_++] += i * i_106_;
	}
	class37_sub3_sub4.anInt2406 = i_103_ << 8;
	return i_104_ >> 1;
    }
    
    public static int method416
	(int i, int i_110_, byte[] is, int[] is_111_, int i_112_, int i_113_,
	 int i_114_, int i_115_, int i_116_, int i_117_,
	 Class37_Sub3_Sub4 class37_sub3_sub4, int i_118_, int i_119_) {
	if (i_118_ == 0
	    || ((i_115_ = i_113_ + (i_117_ + 256 - i_112_ + i_118_) / i_118_)
		> i_116_))
	    i_115_ = i_116_;
	while (i_113_ < i_115_) {
	    i_110_ = i_112_ >> 8;
	    i = is[i_110_ - 1];
	    is_111_[i_113_++]
		+= (((i << 8) + (is[i_110_] - i) * (i_112_ & 0xff)) * i_114_
		    >> 6);
	    i_112_ += i_118_;
	}
	if (i_118_ == 0
	    || ((i_115_ = i_113_ + (i_117_ - i_112_ + i_118_) / i_118_)
		> i_116_))
	    i_115_ = i_116_;
	i = i_119_;
	i_110_ = i_118_;
	while (i_113_ < i_115_) {
	    is_111_[i_113_++]
		+= (((i << 8) + (is[i_112_ >> 8] - i) * (i_112_ & 0xff))
		    * i_114_) >> 6;
	    i_112_ += i_110_;
	}
	class37_sub3_sub4.anInt2406 = i_112_;
	return i_113_;
    }
    
    public synchronized int method417() {
	if (anInt2408 == -2147483648)
	    return 0;
	return anInt2408;
    }
    
    public static int method418(byte[] is, int[] is_120_, int i, int i_121_,
				int i_122_, int i_123_, int i_124_, int i_125_,
				int i_126_,
				Class37_Sub3_Sub4 class37_sub3_sub4) {
	i >>= 8;
	i_126_ >>= 8;
	i_122_ <<= 2;
	i_123_ <<= 2;
	if ((i_124_ = i_121_ + i_126_ - i) > i_125_)
	    i_124_ = i_125_;
	class37_sub3_sub4.anInt2414
	    += class37_sub3_sub4.anInt2407 * (i_124_ - i_121_);
	class37_sub3_sub4.anInt2417
	    += class37_sub3_sub4.anInt2415 * (i_124_ - i_121_);
	i_124_ -= 3;
	while (i_121_ < i_124_) {
	    is_120_[i_121_++] += is[i++] * i_122_;
	    i_122_ += i_123_;
	    is_120_[i_121_++] += is[i++] * i_122_;
	    i_122_ += i_123_;
	    is_120_[i_121_++] += is[i++] * i_122_;
	    i_122_ += i_123_;
	    is_120_[i_121_++] += is[i++] * i_122_;
	    i_122_ += i_123_;
	}
	i_124_ += 3;
	while (i_121_ < i_124_) {
	    is_120_[i_121_++] += is[i++] * i_122_;
	    i_122_ += i_123_;
	}
	class37_sub3_sub4.anInt2416 = i_122_ >> 2;
	class37_sub3_sub4.anInt2406 = i << 8;
	return i_121_;
    }
    
    public int method342() {
	int i = anInt2416 * 3 >> 6;
	i = (i ^ i >> 31) + (i >>> 31);
	if (anInt2419 == 0)
	    i -= i * anInt2406 / ((((Class37_Sub22_Sub1) aClass37_Sub22_1839)
				   .aByteArray3632).length
				  << 8);
	else if (anInt2419 >= 0)
	    i -= i * anInt2412 / (((Class37_Sub22_Sub1) aClass37_Sub22_1839)
				  .aByteArray3632).length;
	if (i > 255)
	    return 255;
	return i;
    }
    
    public static int method419(int i, byte[] is, int[] is_127_, int i_128_,
				int i_129_, int i_130_, int i_131_, int i_132_,
				int i_133_, int i_134_,
				Class37_Sub3_Sub4 class37_sub3_sub4) {
	i_128_ >>= 8;
	i_134_ >>= 8;
	i_130_ <<= 2;
	i_131_ <<= 2;
	if ((i_132_ = i_129_ + i_128_ - (i_134_ - 1)) > i_133_)
	    i_132_ = i_133_;
	i_129_ <<= 1;
	i_132_ <<= 1;
	i_132_ -= 6;
	while (i_129_ < i_132_) {
	    i = is[i_128_--];
	    is_127_[i_129_++] += i * i_130_;
	    is_127_[i_129_++] += i * i_131_;
	    i = is[i_128_--];
	    is_127_[i_129_++] += i * i_130_;
	    is_127_[i_129_++] += i * i_131_;
	    i = is[i_128_--];
	    is_127_[i_129_++] += i * i_130_;
	    is_127_[i_129_++] += i * i_131_;
	    i = is[i_128_--];
	    is_127_[i_129_++] += i * i_130_;
	    is_127_[i_129_++] += i * i_131_;
	}
	i_132_ += 6;
	while (i_129_ < i_132_) {
	    i = is[i_128_--];
	    is_127_[i_129_++] += i * i_130_;
	    is_127_[i_129_++] += i * i_131_;
	}
	class37_sub3_sub4.anInt2406 = i_128_ << 8;
	return i_129_ >> 1;
    }
    
    public synchronized int method420() {
	if (anInt2411 < 0)
	    return -anInt2411;
	return anInt2411;
    }
    
    public static int method421
	(int i, int i_135_, byte[] is, int[] is_136_, int i_137_, int i_138_,
	 int i_139_, int i_140_, int i_141_, int i_142_,
	 Class37_Sub3_Sub4 class37_sub3_sub4, int i_143_, int i_144_) {
	if (i_143_ == 0
	    || ((i_140_ = i_138_ + (i_142_ - i_137_ + i_143_ - 257) / i_143_)
		> i_141_))
	    i_140_ = i_141_;
	while (i_138_ < i_140_) {
	    i_135_ = i_137_ >> 8;
	    i = is[i_135_];
	    is_136_[i_138_++]
		+= (((i << 8) + (is[i_135_ + 1] - i) * (i_137_ & 0xff))
		    * i_139_) >> 6;
	    i_137_ += i_143_;
	}
	if (i_143_ == 0
	    || ((i_140_ = i_138_ + (i_142_ - i_137_ + i_143_ - 1) / i_143_)
		> i_141_))
	    i_140_ = i_141_;
	i_135_ = i_144_;
	while (i_138_ < i_140_) {
	    i = is[i_137_ >> 8];
	    is_136_[i_138_++]
		+= ((i << 8) + (i_135_ - i) * (i_137_ & 0xff)) * i_139_ >> 6;
	    i_137_ += i_143_;
	}
	class37_sub3_sub4.anInt2406 = i_137_;
	return i_138_;
    }
    
    public static int method422
	(int i, int i_145_, byte[] is, int[] is_146_, int i_147_, int i_148_,
	 int i_149_, int i_150_, int i_151_, int i_152_, int i_153_,
	 int i_154_, int i_155_, Class37_Sub3_Sub4 class37_sub3_sub4,
	 int i_156_, int i_157_) {
	class37_sub3_sub4.anInt2416 -= class37_sub3_sub4.anInt2409 * i_148_;
	if (i_156_ == 0
	    || ((i_153_ = i_148_ + (i_155_ + 256 - i_147_ + i_156_) / i_156_)
		> i_154_))
	    i_153_ = i_154_;
	i_148_ <<= 1;
	i_153_ <<= 1;
	while (i_148_ < i_153_) {
	    i_145_ = i_147_ >> 8;
	    i = is[i_145_ - 1];
	    i = (i << 8) + (is[i_145_] - i) * (i_147_ & 0xff);
	    is_146_[i_148_++] += i * i_149_ >> 6;
	    i_149_ += i_151_;
	    is_146_[i_148_++] += i * i_150_ >> 6;
	    i_150_ += i_152_;
	    i_147_ += i_156_;
	}
	if (i_156_ == 0
	    || ((i_153_ = (i_148_ >> 1) + (i_155_ - i_147_ + i_156_) / i_156_)
		> i_154_))
	    i_153_ = i_154_;
	i_153_ <<= 1;
	i_145_ = i_157_;
	while (i_148_ < i_153_) {
	    i = (i_145_ << 8) + (is[i_147_ >> 8] - i_145_) * (i_147_ & 0xff);
	    is_146_[i_148_++] += i * i_149_ >> 6;
	    i_149_ += i_151_;
	    is_146_[i_148_++] += i * i_150_ >> 6;
	    i_150_ += i_152_;
	    i_147_ += i_156_;
	}
	i_148_ >>= 1;
	class37_sub3_sub4.anInt2416 += class37_sub3_sub4.anInt2409 * i_148_;
	class37_sub3_sub4.anInt2414 = i_149_;
	class37_sub3_sub4.anInt2417 = i_150_;
	class37_sub3_sub4.anInt2406 = i_147_;
	return i_148_;
    }
    
    public Class37_Sub3 method339() {
	return null;
    }
    
    public static int method423
	(int i, int i_158_, byte[] is, int[] is_159_, int i_160_, int i_161_,
	 int i_162_, int i_163_, int i_164_, int i_165_, int i_166_,
	 Class37_Sub3_Sub4 class37_sub3_sub4, int i_167_, int i_168_) {
	class37_sub3_sub4.anInt2414 -= class37_sub3_sub4.anInt2407 * i_161_;
	class37_sub3_sub4.anInt2417 -= class37_sub3_sub4.anInt2415 * i_161_;
	if (i_167_ == 0
	    || ((i_164_ = i_161_ + (i_166_ - i_160_ + i_167_ - 257) / i_167_)
		> i_165_))
	    i_164_ = i_165_;
	while (i_161_ < i_164_) {
	    i_158_ = i_160_ >> 8;
	    i = is[i_158_];
	    is_159_[i_161_++]
		+= (((i << 8) + (is[i_158_ + 1] - i) * (i_160_ & 0xff))
		    * i_162_) >> 6;
	    i_162_ += i_163_;
	    i_160_ += i_167_;
	}
	if (i_167_ == 0
	    || ((i_164_ = i_161_ + (i_166_ - i_160_ + i_167_ - 1) / i_167_)
		> i_165_))
	    i_164_ = i_165_;
	i_158_ = i_168_;
	while (i_161_ < i_164_) {
	    i = is[i_160_ >> 8];
	    is_159_[i_161_++]
		+= ((i << 8) + (i_158_ - i) * (i_160_ & 0xff)) * i_162_ >> 6;
	    i_162_ += i_163_;
	    i_160_ += i_167_;
	}
	class37_sub3_sub4.anInt2414 += class37_sub3_sub4.anInt2407 * i_161_;
	class37_sub3_sub4.anInt2417 += class37_sub3_sub4.anInt2415 * i_161_;
	class37_sub3_sub4.anInt2416 = i_162_;
	class37_sub3_sub4.anInt2406 = i_160_;
	return i_161_;
    }
    
    public static int method424(byte[] is, int[] is_169_, int i, int i_170_,
				int i_171_, int i_172_, int i_173_, int i_174_,
				Class37_Sub3_Sub4 class37_sub3_sub4) {
	i >>= 8;
	i_174_ >>= 8;
	i_171_ <<= 2;
	if ((i_172_ = i_170_ + i - (i_174_ - 1)) > i_173_)
	    i_172_ = i_173_;
	i_172_ -= 3;
	while (i_170_ < i_172_) {
	    is_169_[i_170_++] += is[i--] * i_171_;
	    is_169_[i_170_++] += is[i--] * i_171_;
	    is_169_[i_170_++] += is[i--] * i_171_;
	    is_169_[i_170_++] += is[i--] * i_171_;
	}
	i_172_ += 3;
	while (i_170_ < i_172_)
	    is_169_[i_170_++] += is[i--] * i_171_;
	class37_sub3_sub4.anInt2406 = i << 8;
	return i_170_;
    }
    
    public synchronized int method425() {
	if (anInt2410 < 0)
	    return -1;
	return anInt2410;
    }
    
    public void method426() {
	anInt2416 = anInt2408;
	anInt2414 = method411(anInt2408, anInt2410);
	anInt2417 = method402(anInt2408, anInt2410);
    }
    
    public int method427(int[] is, int i, int i_175_, int i_176_, int i_177_) {
	while (anInt2418 > 0) {
	    int i_178_ = i + anInt2418;
	    if (i_178_ > i_176_)
		i_178_ = i_176_;
	    anInt2418 += i;
	    if (anInt2411 == -256 && (anInt2406 & 0xff) == 0) {
		if (Class37_Sub4_Sub10.aBoolean2690)
		    i = method403(0,
				  (((Class37_Sub22_Sub1) aClass37_Sub22_1839)
				   .aByteArray3632),
				  is, anInt2406, i, anInt2414, anInt2417,
				  anInt2407, anInt2415, 0, i_178_, i_175_,
				  this);
		else
		    i = method405((((Class37_Sub22_Sub1) aClass37_Sub22_1839)
				   .aByteArray3632),
				  is, anInt2406, i, anInt2416, anInt2409, 0,
				  i_178_, i_175_, this);
	    } else if (Class37_Sub4_Sub10.aBoolean2690)
		i = method422(0, 0,
			      (((Class37_Sub22_Sub1) aClass37_Sub22_1839)
			       .aByteArray3632),
			      is, anInt2406, i, anInt2414, anInt2417,
			      anInt2407, anInt2415, 0, i_178_, i_175_, this,
			      anInt2411, i_177_);
	    else
		i = method430(0, 0,
			      (((Class37_Sub22_Sub1) aClass37_Sub22_1839)
			       .aByteArray3632),
			      is, anInt2406, i, anInt2416, anInt2409, 0,
			      i_178_, i_175_, this, anInt2411, i_177_);
	    anInt2418 -= i;
	    if (anInt2418 != 0)
		return i;
	    if (method399())
		return i_176_;
	}
	if (anInt2411 == -256 && (anInt2406 & 0xff) == 0) {
	    if (Class37_Sub4_Sub10.aBoolean2690)
		return method419(0,
				 (((Class37_Sub22_Sub1) aClass37_Sub22_1839)
				  .aByteArray3632),
				 is, anInt2406, i, anInt2414, anInt2417, 0,
				 i_176_, i_175_, this);
	    return method424((((Class37_Sub22_Sub1) aClass37_Sub22_1839)
			      .aByteArray3632),
			     is, anInt2406, i, anInt2416, 0, i_176_, i_175_,
			     this);
	}
	if (Class37_Sub4_Sub10.aBoolean2690)
	    return method408(0, 0,
			     (((Class37_Sub22_Sub1) aClass37_Sub22_1839)
			      .aByteArray3632),
			     is, anInt2406, i, anInt2414, anInt2417, 0, i_176_,
			     i_175_, this, anInt2411, i_177_);
	return method416(0, 0,
			 (((Class37_Sub22_Sub1) aClass37_Sub22_1839)
			  .aByteArray3632),
			 is, anInt2406, i, anInt2416, 0, i_176_, i_175_, this,
			 anInt2411, i_177_);
    }
    
    public boolean method428() {
	if (anInt2406 >= 0
	    && anInt2406 < (((Class37_Sub22_Sub1) aClass37_Sub22_1839)
			    .aByteArray3632).length << 8)
	    return false;
	return true;
    }
    
    public synchronized void method429(int i) {
	anInt2419 = i;
    }
    
    public static int method430
	(int i, int i_179_, byte[] is, int[] is_180_, int i_181_, int i_182_,
	 int i_183_, int i_184_, int i_185_, int i_186_, int i_187_,
	 Class37_Sub3_Sub4 class37_sub3_sub4, int i_188_, int i_189_) {
	class37_sub3_sub4.anInt2414 -= class37_sub3_sub4.anInt2407 * i_182_;
	class37_sub3_sub4.anInt2417 -= class37_sub3_sub4.anInt2415 * i_182_;
	if (i_188_ == 0
	    || ((i_185_ = i_182_ + (i_187_ + 256 - i_181_ + i_188_) / i_188_)
		> i_186_))
	    i_185_ = i_186_;
	while (i_182_ < i_185_) {
	    i_179_ = i_181_ >> 8;
	    i = is[i_179_ - 1];
	    is_180_[i_182_++]
		+= (((i << 8) + (is[i_179_] - i) * (i_181_ & 0xff)) * i_183_
		    >> 6);
	    i_183_ += i_184_;
	    i_181_ += i_188_;
	}
	if (i_188_ == 0
	    || ((i_185_ = i_182_ + (i_187_ - i_181_ + i_188_) / i_188_)
		> i_186_))
	    i_185_ = i_186_;
	i = i_189_;
	i_179_ = i_188_;
	while (i_182_ < i_185_) {
	    is_180_[i_182_++]
		+= (((i << 8) + (is[i_181_ >> 8] - i) * (i_181_ & 0xff))
		    * i_183_) >> 6;
	    i_183_ += i_184_;
	    i_181_ += i_179_;
	}
	class37_sub3_sub4.anInt2414 += class37_sub3_sub4.anInt2407 * i_182_;
	class37_sub3_sub4.anInt2417 += class37_sub3_sub4.anInt2415 * i_182_;
	class37_sub3_sub4.anInt2416 = i_183_;
	class37_sub3_sub4.anInt2406 = i_181_;
	return i_182_;
    }
    
    public Class37_Sub3_Sub4(Class37_Sub22_Sub1 class37_sub22_sub1, int i,
			     int i_190_) {
	aClass37_Sub22_1839 = class37_sub22_sub1;
	anInt2412 = class37_sub22_sub1.anInt3633;
	anInt2420 = class37_sub22_sub1.anInt3634;
	aBoolean2413 = class37_sub22_sub1.aBoolean3631;
	anInt2411 = i;
	anInt2408 = i_190_;
	anInt2410 = 8192;
	anInt2406 = 0;
	method426();
    }
    
    public Class37_Sub3_Sub4(Class37_Sub22_Sub1 class37_sub22_sub1, int i,
			     int i_191_, int i_192_) {
	aClass37_Sub22_1839 = class37_sub22_sub1;
	anInt2412 = class37_sub22_sub1.anInt3633;
	anInt2420 = class37_sub22_sub1.anInt3634;
	aBoolean2413 = class37_sub22_sub1.aBoolean3631;
	anInt2411 = i;
	anInt2408 = i_191_;
	anInt2410 = i_192_;
	anInt2406 = 0;
	method426();
    }
}
