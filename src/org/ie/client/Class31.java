package org.ie.client;

/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class31
{
    public static Class85 aClass85_728 = new Class85();
    
    public static void method278() {
	aClass85_728 = null;
    }
    
    public static int method279(int i, Class85 class85) {
	int i_0_;
	for (;;) {
	    if (class85.anInt1547 >= i) {
		int i_1_ = (class85.anInt1561 >> class85.anInt1547 - i
			    & (1 << i) - 1);
		class85.anInt1547 -= i;
		i_0_ = i_1_;
		break;
	    }
	    class85.anInt1561
		= (class85.anInt1561 << 8
		   | class85.aByteArray1538[class85.anInt1560] & 0xff);
	    class85.anInt1547 += 8;
	    class85.anInt1560++;
	    class85.anInt1564++;
	}
	return i_0_;
    }
    
    public static byte method280(Class85 class85) {
	return (byte) method279(8, class85);
    }
    
    public static void method281(Class85 class85) {
	class85.anInt1549 = 0;
	for (int i = 0; i < 256; i++) {
	    if (class85.aBooleanArray1551[i]) {
		class85.aByteArray1562[class85.anInt1549] = (byte) i;
		class85.anInt1549++;
	    }
	}
    }
    
    public static void method282(Class85 class85) {
	boolean bool = false;
	boolean bool_2_ = false;
	boolean bool_3_ = false;
	boolean bool_4_ = false;
	boolean bool_5_ = false;
	boolean bool_6_ = false;
	boolean bool_7_ = false;
	boolean bool_8_ = false;
	boolean bool_9_ = false;
	boolean bool_10_ = false;
	boolean bool_11_ = false;
	boolean bool_12_ = false;
	boolean bool_13_ = false;
	boolean bool_14_ = false;
	boolean bool_15_ = false;
	boolean bool_16_ = false;
	boolean bool_17_ = false;
	boolean bool_18_ = false;
	int i = 0;
	int[] is = null;
	int[] is_19_ = null;
	int[] is_20_ = null;
	class85.anInt1569 = 1;
	if (Class37_Sub9_Sub23.anIntArray3354 == null)
	    Class37_Sub9_Sub23.anIntArray3354
		= new int[class85.anInt1569 * 100000];
	boolean bool_21_ = true;
	while (bool_21_) {
	    byte i_22_ = method280(class85);
	    if (i_22_ == 23)
		break;
	    i_22_ = method280(class85);
	    i_22_ = method280(class85);
	    i_22_ = method280(class85);
	    i_22_ = method280(class85);
	    i_22_ = method280(class85);
	    i_22_ = method280(class85);
	    i_22_ = method280(class85);
	    i_22_ = method280(class85);
	    i_22_ = method280(class85);
	    i_22_ = method284(class85);
	    class85.anInt1542 = 0;
	    int i_23_ = method280(class85);
	    class85.anInt1542 = class85.anInt1542 << 8 | i_23_ & 0xff;
	    i_23_ = method280(class85);
	    class85.anInt1542 = class85.anInt1542 << 8 | i_23_ & 0xff;
	    i_23_ = method280(class85);
	    class85.anInt1542 = class85.anInt1542 << 8 | i_23_ & 0xff;
	    for (int i_24_ = 0; i_24_ < 16; i_24_++) {
		i_22_ = method284(class85);
		if (i_22_ == 1)
		    class85.aBooleanArray1548[i_24_] = true;
		else
		    class85.aBooleanArray1548[i_24_] = false;
	    }
	    for (int i_25_ = 0; i_25_ < 256; i_25_++)
		class85.aBooleanArray1551[i_25_] = false;
	    for (int i_26_ = 0; i_26_ < 16; i_26_++) {
		if (class85.aBooleanArray1548[i_26_]) {
		    for (int i_27_ = 0; i_27_ < 16; i_27_++) {
			i_22_ = method284(class85);
			if (i_22_ == 1)
			    class85.aBooleanArray1551[i_26_ * 16 + i_27_]
				= true;
		    }
		}
	    }
	    method281(class85);
	    int i_28_ = class85.anInt1549 + 2;
	    int i_29_ = method279(3, class85);
	    int i_30_ = method279(15, class85);
	    for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
		int i_32_ = 0;
		for (;;) {
		    i_22_ = method284(class85);
		    if (i_22_ == 0)
			break;
		    i_32_++;
		}
		class85.aByteArray1558[i_31_] = (byte) i_32_;
	    }
	    byte[] is_33_ = new byte[6];
	    for (byte i_34_ = 0; i_34_ < i_29_; i_34_++)
		is_33_[i_34_] = i_34_;
	    for (int i_35_ = 0; i_35_ < i_30_; i_35_++) {
		byte i_36_ = class85.aByteArray1558[i_35_];
		byte i_37_ = is_33_[i_36_];
		for (/**/; i_36_ > 0; i_36_--)
		    is_33_[i_36_] = is_33_[i_36_ - 1];
		is_33_[0] = i_37_;
		class85.aByteArray1567[i_35_] = i_37_;
	    }
	    for (int i_38_ = 0; i_38_ < i_29_; i_38_++) {
		int i_39_ = method279(5, class85);
		for (int i_40_ = 0; i_40_ < i_28_; i_40_++) {
		    for (;;) {
			i_22_ = method284(class85);
			if (i_22_ == 0)
			    break;
			i_22_ = method284(class85);
			if (i_22_ == 0)
			    i_39_++;
			else
			    i_39_--;
		    }
		    class85.aByteArrayArray1554[i_38_][i_40_] = (byte) i_39_;
		}
	    }
	    for (int i_41_ = 0; i_41_ < i_29_; i_41_++) {
		int i_42_ = 32;
		byte i_43_ = 0;
		for (int i_44_ = 0; i_44_ < i_28_; i_44_++) {
		    if (class85.aByteArrayArray1554[i_41_][i_44_] > i_43_)
			i_43_ = class85.aByteArrayArray1554[i_41_][i_44_];
		    if (class85.aByteArrayArray1554[i_41_][i_44_] < i_42_)
			i_42_ = class85.aByteArrayArray1554[i_41_][i_44_];
		}
		method285(class85.anIntArrayArray1565[i_41_],
			  class85.anIntArrayArray1550[i_41_],
			  class85.anIntArrayArray1573[i_41_],
			  class85.aByteArrayArray1554[i_41_], i_42_, i_43_,
			  i_28_);
		class85.anIntArray1544[i_41_] = i_42_;
	    }
	    int i_45_ = class85.anInt1549 + 1;
	    int i_46_ = -1;
	    int i_47_ = 0;
	    for (int i_48_ = 0; i_48_ <= 255; i_48_++)
		class85.anIntArray1539[i_48_] = 0;
	    int i_49_ = 4095;
	    for (int i_50_ = 15; i_50_ >= 0; i_50_--) {
		for (int i_51_ = 15; i_51_ >= 0; i_51_--) {
		    class85.aByteArray1570[i_49_]
			= (byte) (i_50_ * 16 + i_51_);
		    i_49_--;
		}
		class85.anIntArray1572[i_50_] = i_49_ + 1;
	    }
	    int i_52_ = 0;
	    if (i_47_ == 0) {
		i_46_++;
		i_47_ = 50;
		byte i_53_ = class85.aByteArray1567[i_46_];
		i = class85.anIntArray1544[i_53_];
		is = class85.anIntArrayArray1565[i_53_];
		is_20_ = class85.anIntArrayArray1573[i_53_];
		is_19_ = class85.anIntArrayArray1550[i_53_];
	    }
	    i_47_--;
	    int i_54_ = i;
	    int i_55_;
	    int i_56_;
	    for (i_56_ = method279(i_54_, class85); i_56_ > is[i_54_];
		 i_56_ = i_56_ << 1 | i_55_) {
		i_54_++;
		i_55_ = method284(class85);
	    }
	    int i_57_ = is_20_[i_56_ - is_19_[i_54_]];
	    while (i_57_ != i_45_) {
		if (i_57_ == 0 || i_57_ == 1) {
		    int i_58_ = -1;
		    int i_59_ = 1;
		    do {
			if (i_57_ == 0)
			    i_58_ += i_59_;
			else if (i_57_ == 1)
			    i_58_ += 2 * i_59_;
			i_59_ *= 2;
			if (i_47_ == 0) {
			    i_46_++;
			    i_47_ = 50;
			    byte i_60_ = class85.aByteArray1567[i_46_];
			    i = class85.anIntArray1544[i_60_];
			    is = class85.anIntArrayArray1565[i_60_];
			    is_20_ = class85.anIntArrayArray1573[i_60_];
			    is_19_ = class85.anIntArrayArray1550[i_60_];
			}
			i_47_--;
			i_54_ = i;
			for (i_56_ = method279(i_54_, class85);
			     i_56_ > is[i_54_]; i_56_ = i_56_ << 1 | i_55_) {
			    i_54_++;
			    i_55_ = method284(class85);
			}
			i_57_ = is_20_[i_56_ - is_19_[i_54_]];
		    } while (i_57_ == 0 || i_57_ == 1);
		    i_58_++;
		    i_23_
			= (class85.aByteArray1562
			   [(class85.aByteArray1570[class85.anIntArray1572[0]]
			     & 0xff)]);
		    class85.anIntArray1539[i_23_ & 0xff] += i_58_;
		    for (/**/; i_58_ > 0; i_58_--) {
			Class37_Sub9_Sub23.anIntArray3354[i_52_]
			    = i_23_ & 0xff;
			i_52_++;
		    }
		} else {
		    int i_61_ = i_57_ - 1;
		    if (i_61_ < 16) {
			int i_62_ = class85.anIntArray1572[0];
			i_22_ = class85.aByteArray1570[i_62_ + i_61_];
			for (/**/; i_61_ > 3; i_61_ -= 4) {
			    int i_63_ = i_62_ + i_61_;
			    class85.aByteArray1570[i_63_]
				= class85.aByteArray1570[i_63_ - 1];
			    class85.aByteArray1570[i_63_ - 1]
				= class85.aByteArray1570[i_63_ - 2];
			    class85.aByteArray1570[i_63_ - 2]
				= class85.aByteArray1570[i_63_ - 3];
			    class85.aByteArray1570[i_63_ - 3]
				= class85.aByteArray1570[i_63_ - 4];
			}
			for (/**/; i_61_ > 0; i_61_--)
			    class85.aByteArray1570[i_62_ + i_61_]
				= class85.aByteArray1570[i_62_ + i_61_ - 1];
			class85.aByteArray1570[i_62_] = i_22_;
		    } else {
			int i_64_ = i_61_ / 16;
			int i_65_ = i_61_ % 16;
			int i_66_ = class85.anIntArray1572[i_64_] + i_65_;
			i_22_ = class85.aByteArray1570[i_66_];
			for (/**/; i_66_ > class85.anIntArray1572[i_64_];
			     i_66_--)
			    class85.aByteArray1570[i_66_]
				= class85.aByteArray1570[i_66_ - 1];
			class85.anIntArray1572[i_64_]++;
			for (/**/; i_64_ > 0; i_64_--) {
			    class85.anIntArray1572[i_64_]--;
			    class85.aByteArray1570[(class85.anIntArray1572
						    [i_64_])]
				= (class85.aByteArray1570
				   [(class85.anIntArray1572[i_64_ - 1] + 16
				     - 1)]);
			}
			class85.anIntArray1572[0]--;
			class85.aByteArray1570[class85.anIntArray1572[0]]
			    = i_22_;
			if (class85.anIntArray1572[0] == 0) {
			    int i_67_ = 4095;
			    for (int i_68_ = 15; i_68_ >= 0; i_68_--) {
				for (int i_69_ = 15; i_69_ >= 0; i_69_--) {
				    class85.aByteArray1570[i_67_]
					= (class85.aByteArray1570
					   [(class85.anIntArray1572[i_68_]
					     + i_69_)]);
				    i_67_--;
				}
				class85.anIntArray1572[i_68_] = i_67_ + 1;
			    }
			}
		    }
		    class85.anIntArray1539
			[class85.aByteArray1562[i_22_ & 0xff] & 0xff]++;
		    Class37_Sub9_Sub23.anIntArray3354[i_52_]
			= class85.aByteArray1562[i_22_ & 0xff] & 0xff;
		    i_52_++;
		    if (i_47_ == 0) {
			i_46_++;
			i_47_ = 50;
			byte i_70_ = class85.aByteArray1567[i_46_];
			i = class85.anIntArray1544[i_70_];
			is = class85.anIntArrayArray1565[i_70_];
			is_20_ = class85.anIntArrayArray1573[i_70_];
			is_19_ = class85.anIntArrayArray1550[i_70_];
		    }
		    i_47_--;
		    i_54_ = i;
		    for (i_56_ = method279(i_54_, class85); i_56_ > is[i_54_];
			 i_56_ = i_56_ << 1 | i_55_) {
			i_54_++;
			i_55_ = method284(class85);
		    }
		    i_57_ = is_20_[i_56_ - is_19_[i_54_]];
		}
	    }
	    class85.anInt1537 = 0;
	    class85.aByte1541 = (byte) 0;
	    class85.anIntArray1559[0] = 0;
	    for (int i_71_ = 1; i_71_ <= 256; i_71_++)
		class85.anIntArray1559[i_71_]
		    = class85.anIntArray1539[i_71_ - 1];
	    for (int i_72_ = 1; i_72_ <= 256; i_72_++)
		class85.anIntArray1559[i_72_]
		    += class85.anIntArray1559[i_72_ - 1];
	    for (int i_73_ = 0; i_73_ < i_52_; i_73_++) {
		i_23_
		    = (byte) (Class37_Sub9_Sub23.anIntArray3354[i_73_] & 0xff);
		Class37_Sub9_Sub23.anIntArray3354[(class85.anIntArray1559
						   [i_23_ & 0xff])]
		    |= i_73_ << 8;
		class85.anIntArray1559[i_23_ & 0xff]++;
	    }
	    class85.anInt1568
		= Class37_Sub9_Sub23.anIntArray3354[class85.anInt1542] >> 8;
	    class85.anInt1566 = 0;
	    class85.anInt1568
		= Class37_Sub9_Sub23.anIntArray3354[class85.anInt1568];
	    class85.anInt1556 = (byte) (class85.anInt1568 & 0xff);
	    class85.anInt1568 >>= 8;
	    class85.anInt1566++;
	    class85.anInt1575 = i_52_;
	    method283(class85);
	    if (class85.anInt1566 == class85.anInt1575 + 1
		&& class85.anInt1537 == 0)
		bool_21_ = true;
	    else
		bool_21_ = false;
	}
    }
    
    public static void method283(Class85 class85) {
	byte i = class85.aByte1541;
	int i_74_ = class85.anInt1537;
	int i_75_ = class85.anInt1566;
	int i_76_ = class85.anInt1556;
	int[] is = Class37_Sub9_Sub23.anIntArray3354;
	int i_77_ = class85.anInt1568;
	byte[] is_78_ = class85.aByteArray1545;
	int i_79_ = class85.anInt1536;
	int i_80_ = class85.anInt1563;
	int i_81_ = i_80_;
	int i_82_ = class85.anInt1575 + 1;
    while_61_:
	for (;;) {
	    if (i_74_ > 0) {
		for (;;) {
		    if (i_80_ == 0)
			break while_61_;
		    if (i_74_ == 1)
			break;
		    is_78_[i_79_] = i;
		    i_74_--;
		    i_79_++;
		    i_80_--;
		}
		if (i_80_ == 0) {
		    i_74_ = 1;
		    break;
		}
		is_78_[i_79_] = i;
		i_79_++;
		i_80_--;
	    }
	    boolean bool = true;
	    while (bool) {
		bool = false;
		if (i_75_ == i_82_) {
		    i_74_ = 0;
		    break while_61_;
		}
		i = (byte) i_76_;
		i_77_ = is[i_77_];
		int i_83_ = (byte) (i_77_ & 0xff);
		i_77_ >>= 8;
		i_75_++;
		if (i_83_ != i_76_) {
		    i_76_ = i_83_;
		    if (i_80_ == 0) {
			i_74_ = 1;
			break while_61_;
		    }
		    is_78_[i_79_] = i;
		    i_79_++;
		    i_80_--;
		    bool = true;
		} else if (i_75_ == i_82_) {
		    if (i_80_ == 0) {
			i_74_ = 1;
			break while_61_;
		    }
		    is_78_[i_79_] = i;
		    i_79_++;
		    i_80_--;
		    bool = true;
		}
	    }
	    i_74_ = 2;
	    i_77_ = is[i_77_];
	    int i_84_ = (byte) (i_77_ & 0xff);
	    i_77_ >>= 8;
	    if (++i_75_ != i_82_) {
		if (i_84_ != i_76_)
		    i_76_ = i_84_;
		else {
		    i_74_ = 3;
		    i_77_ = is[i_77_];
		    i_84_ = (byte) (i_77_ & 0xff);
		    i_77_ >>= 8;
		    if (++i_75_ != i_82_) {
			if (i_84_ != i_76_)
			    i_76_ = i_84_;
			else {
			    i_77_ = is[i_77_];
			    i_84_ = (byte) (i_77_ & 0xff);
			    i_77_ >>= 8;
			    i_75_++;
			    i_74_ = (i_84_ & 0xff) + 4;
			    i_77_ = is[i_77_];
			    i_76_ = (byte) (i_77_ & 0xff);
			    i_77_ >>= 8;
			    i_75_++;
			}
		    }
		}
	    }
	}
	int i_85_ = class85.anInt1553;
	class85.anInt1553 += i_81_ - i_80_;
	class85.aByte1541 = i;
	class85.anInt1537 = i_74_;
	class85.anInt1566 = i_75_;
	class85.anInt1556 = i_76_;
	Class37_Sub9_Sub23.anIntArray3354 = is;
	class85.anInt1568 = i_77_;
	class85.aByteArray1545 = is_78_;
	class85.anInt1536 = i_79_;
	class85.anInt1563 = i_80_;
    }
    
    public static byte method284(Class85 class85) {
	return (byte) method279(1, class85);
    }
    
    public static void method285(int[] is, int[] is_86_, int[] is_87_,
				 byte[] is_88_, int i, int i_89_, int i_90_) {
	int i_91_ = 0;
	for (int i_92_ = i; i_92_ <= i_89_; i_92_++) {
	    for (int i_93_ = 0; i_93_ < i_90_; i_93_++) {
		if (is_88_[i_93_] == i_92_) {
		    is_87_[i_91_] = i_93_;
		    i_91_++;
		}
	    }
	}
	for (int i_94_ = 0; i_94_ < 23; i_94_++)
	    is_86_[i_94_] = 0;
	for (int i_95_ = 0; i_95_ < i_90_; i_95_++)
	    is_86_[is_88_[i_95_] + 1]++;
	for (int i_96_ = 1; i_96_ < 23; i_96_++)
	    is_86_[i_96_] += is_86_[i_96_ - 1];
	for (int i_97_ = 0; i_97_ < 23; i_97_++)
	    is[i_97_] = 0;
	int i_98_ = 0;
	for (int i_99_ = i; i_99_ <= i_89_; i_99_++) {
	    i_98_ += is_86_[i_99_ + 1] - is_86_[i_99_];
	    is[i_99_] = i_98_ - 1;
	    i_98_ <<= 1;
	}
	for (int i_100_ = i + 1; i_100_ <= i_89_; i_100_++)
	    is_86_[i_100_] = (is[i_100_ - 1] + 1 << 1) - is_86_[i_100_];
    }
    
    public static int method286(byte[] is, int i, byte[] is_101_, int i_102_,
				int i_103_) {
	synchronized (aClass85_728) {
	    aClass85_728.aByteArray1538 = is_101_;
	    aClass85_728.anInt1560 = i_103_;
	    aClass85_728.aByteArray1545 = is;
	    aClass85_728.anInt1536 = 0;
	    aClass85_728.anInt1563 = i;
	    aClass85_728.anInt1547 = 0;
	    aClass85_728.anInt1561 = 0;
	    aClass85_728.anInt1564 = 0;
	    aClass85_728.anInt1553 = 0;
	    method282(aClass85_728);
	    i -= aClass85_728.anInt1563;
	    aClass85_728.aByteArray1538 = null;
	    aClass85_728.aByteArray1545 = null;
	    return i;
	}
    }
}
