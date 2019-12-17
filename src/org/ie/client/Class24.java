package org.ie.client;

/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class24
{
    public static RSString aClass16_596;
    public static RSString aClass16_597;
    public static int anInt598;
    public static int anInt599;
    public static int anInt600;
    public static int anInt601;
    public static int anInt602;
    public int anInt603 = 32;
    public static Class45 aClass45_604;
    public static int anInt605;
    public int[] anIntArray606;
    public static int anInt607;
    public static int anInt608;
    public static boolean aBoolean609 = false;
    public static int anInt610;
    public static int anInt611;
    public static int anInt612;
    public long aLong613 = Class71.method1263();
    public static int anInt614;
    public static int scriptedVarpLength = 0;
    public static RSString aClass16_616;
    public Class37_Sub3 aClass37_Sub3_617;
    public static RSString aClass16_618;
    public static int anInt619;
    public static int anInt620;
    public static int anInt621;
    public static int anInt622;
    public int anInt623;
    public int anInt624;
    public int anInt625;
    public long aLong626;
    public int anInt627 = 0;
    public int anInt628;
    public long aLong629;
    public Class37_Sub3[] aClass37_Sub3Array630;
    public int anInt631;
    public int anInt632;
    public boolean aBoolean633;
    public Class37_Sub3[] aClass37_Sub3Array634;
    
    public synchronized void method235(int i) {
	if (Class2.aClass47_77 != null) {
	    boolean bool = true;
	    for (int i_0_ = 0; i_0_ < 2; i_0_++) {
		if (Class2.aClass47_77.aClass24Array996[i_0_] == this)
		    Class2.aClass47_77.aClass24Array996[i_0_] = null;
		if (Class2.aClass47_77.aClass24Array996[i_0_] != null)
		    bool = false;
	    }
	    if (bool) {
		Class2.aClass47_77.aBoolean997 = true;
		while (Class2.aClass47_77.aBoolean993)
		    Class37_Sub9_Sub20.method846(50L, (byte) 58);
		Class2.aClass47_77 = null;
	    }
	}
	method240();
	anIntArray606 = null;
	int i_1_ = -87 % ((-44 - i) / 53);
	anInt608++;
    }
    
    public void method236() throws Exception {
	anInt621++;
    }
    
    public void method237(Component component) throws Exception {
	anInt610++;
    }
    
    public void method238(int i, boolean bool) {
	if (bool != false)
	    method238(122, false);
	anInt612++;
	anInt625 -= i;
	if (anInt625 < 0)
	    anInt625 = 0;
	if (aClass37_Sub3_617 != null)
	    aClass37_Sub3_617.method341(i);
    }
    
    public void method239() throws Exception {
	anInt622++;
    }
    
    public void method240() {
	anInt620++;
    }
    
    public int method241() throws Exception {
	anInt614++;
	return anInt623;
    }
    
    public synchronized void method242(byte i) {
	anInt600++;
	aBoolean633 = true;
	try {
	    if (i != 101)
		method242((byte) 6);
	    method236();
	} catch (Exception exception) {
	    method240();
	    aLong629 = Class71.method1263() - -2000L;
	}
    }
    
    public void method243(boolean bool) {
	aBoolean633 = true;
	anInt611++;
	if (bool != false)
	    aClass37_Sub3Array630 = null;
    }
    
    public void method244(int i, Class37_Sub3 class37_sub3, boolean bool) {
	anInt599++;
	int i_2_ = i >> -1868078203;
	if (bool != false)
	    method244(-18, null, true);
	Class37_Sub3 class37_sub3_3_ = aClass37_Sub3Array634[i_2_];
	if (class37_sub3_3_ != null)
	    class37_sub3_3_.aClass37_Sub3_1841 = class37_sub3;
	else
	    aClass37_Sub3Array630[i_2_] = class37_sub3;
	aClass37_Sub3Array634[i_2_] = class37_sub3;
	class37_sub3.anInt1840 = i;
    }
    
    public synchronized void method245(int i, Class37_Sub3 class37_sub3) {
	if (i == 0) {
	    aClass37_Sub3_617 = class37_sub3;
	    anInt602++;
	}
    }
    
    public void method246(int i) throws Exception {
	anInt607++;
    }
    
    public void method247(int[] is, int i) {
	int i_4_ = i;
	if (Class37_Sub4_Sub10.aBoolean2690)
	    i_4_ <<= 1;
	Class53.method1136(is, 0, i_4_);
	anInt625 -= i;
	if (aClass37_Sub3_617 != null && anInt625 <= 0) {
	    anInt625 += Class33.anInt765 >> 4;
	    Class8.method79(aClass37_Sub3_617, false);
	    method244(aClass37_Sub3_617.method342(), aClass37_Sub3_617, false);
	    int i_5_ = 0;
	    int i_6_ = 255;
	    int i_7_ = 7;
	while_55_:
	    while (i_6_ != 0) {
		int i_8_;
		int i_9_;
		if (i_7_ < 0) {
		    i_8_ = i_7_ & 0x3;
		    i_9_ = -(i_7_ >> 2);
		} else {
		    i_8_ = i_7_;
		    i_9_ = 0;
		}
		for (int i_10_ = i_6_ >>> i_8_ & 0x11111111; i_10_ != 0;
		     i_10_ >>>= 4) {
		    if ((i_10_ & 0x1) != 0) {
			i_6_ &= 1 << i_8_ ^ 0xffffffff;
			Class37_Sub3 class37_sub3 = null;
			Class37_Sub3 class37_sub3_11_
			    = aClass37_Sub3Array630[i_8_];
			while (class37_sub3_11_ != null) {
			    Class37_Sub22 class37_sub22
				= class37_sub3_11_.aClass37_Sub22_1839;
			    if (class37_sub22 != null
				&& class37_sub22.anInt2222 > i_9_) {
				i_6_ |= 1 << i_8_;
				class37_sub3 = class37_sub3_11_;
				class37_sub3_11_
				    = class37_sub3_11_.aClass37_Sub3_1841;
			    } else {
				class37_sub3_11_.aBoolean1838 = true;
				int i_12_ = class37_sub3_11_.method337();
				i_5_ += i_12_;
				if (class37_sub22 != null)
				    class37_sub22.anInt2222 += i_12_;
				if (i_5_ >= anInt603)
				    break while_55_;
				Class37_Sub3 class37_sub3_13_
				    = class37_sub3_11_.method343();
				if (class37_sub3_13_ != null) {
				    int i_14_ = class37_sub3_11_.anInt1840;
				    for (/**/; class37_sub3_13_ != null;
					 class37_sub3_13_
					     = class37_sub3_11_.method339())
					method244((i_14_ * class37_sub3_13_
							       .method342()
						   >> 8),
						  class37_sub3_13_, false);
				}
				Class37_Sub3 class37_sub3_15_
				    = class37_sub3_11_.aClass37_Sub3_1841;
				class37_sub3_11_.aClass37_Sub3_1841 = null;
				if (class37_sub3 == null)
				    aClass37_Sub3Array630[i_8_]
					= class37_sub3_15_;
				else
				    class37_sub3.aClass37_Sub3_1841
					= class37_sub3_15_;
				if (class37_sub3_15_ == null)
				    aClass37_Sub3Array634[i_8_] = class37_sub3;
				class37_sub3_11_ = class37_sub3_15_;
			    }
			}
		    }
		    i_8_ += 4;
		    i_9_++;
		}
		i_7_--;
	    }
	    for (int i_16_ = 0; i_16_ < 8; i_16_++) {
		Class37_Sub3 class37_sub3 = aClass37_Sub3Array630[i_16_];
		aClass37_Sub3Array630[i_16_] = aClass37_Sub3Array634[i_16_]
		    = null;
		Class37_Sub3 class37_sub3_17_;
		for (/**/; class37_sub3 != null;
		     class37_sub3 = class37_sub3_17_) {
		    class37_sub3_17_ = class37_sub3.aClass37_Sub3_1841;
		    class37_sub3.aClass37_Sub3_1841 = null;
		}
	    }
	}
	if (anInt625 < 0)
	    anInt625 = 0;
	if (aClass37_Sub3_617 != null)
	    aClass37_Sub3_617.method338(is, 0, i);
	aLong613 = Class71.method1263();
    }
    
    public synchronized void method248(int i) {
	anInt601++;
	if (anIntArray606 != null) {
	    long l = Class71.method1263();
	    try {
		if (aLong629 != 0L) {
		    if ((l ^ 0xffffffffffffffffL)
			> (aLong629 ^ 0xffffffffffffffffL))
			return;
		    method246(anInt623);
		    aLong629 = 0L;
		    aBoolean633 = true;
		}
		int i_18_ = method241();
		if ((-i_18_ + anInt627 ^ 0xffffffff) < (anInt632 ^ 0xffffffff))
		    anInt632 = anInt627 + -i_18_;
		int i_19_ = anInt631 + anInt624;
		if (i < 11)
		    method238(-10, true);
		if ((i_19_ - -256 ^ 0xffffffff) < -16385)
		    i_19_ = 16128;
		if ((i_19_ - -256 ^ 0xffffffff) < (anInt623 ^ 0xffffffff)) {
		    i_18_ = 0;
		    anInt623 += 1024;
		    if (anInt623 > 16384)
			anInt623 = 16384;
		    method240();
		    method246(anInt623);
		    aBoolean633 = true;
		    if ((256 + i_19_ ^ 0xffffffff) < (anInt623 ^ 0xffffffff)) {
			i_19_ = -256 + anInt623;
			anInt631 = -anInt624 + i_19_;
		    }
		}
		for (/**/; (i_19_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff);
		     i_18_ += 256) {
		    method247(anIntArray606, 256);
		    method239();
		}
		if (aLong626 < l) {
		    if (!aBoolean633) {
			if ((anInt632 ^ 0xffffffff) == -1
			    && (anInt628 ^ 0xffffffff) == -1) {
			    method240();
			    aLong629 = 2000L + l;
			    return;
			}
			anInt631 = Math.min(anInt628, anInt632);
			anInt628 = anInt632;
		    } else
			aBoolean633 = false;
		    aLong626 = 2000L + l;
		    anInt632 = 0;
		}
		anInt627 = i_18_;
	    } catch (Exception exception) {
		method240();
		aLong629 = 2000L + l;
	    }
	    try {
		if (500000L + aLong613 < l)
		    l = aLong613;
		for (/**/; aLong613 + 5000L < l;
		     aLong613 += (long) (256000 / Class33.anInt765))
		    method238(256, false);
	    } catch (Exception exception) {
		aLong613 = l;
	    }
	}
    }
    
    public static void method249(int i, int i_20_) {
	Class37_Sub13 class37_sub13 = ((Class37_Sub13)
	       Class37_Sub4_Sub7_Sub1.aClass13_3670.get((long) i));
	if (class37_sub13 != null) {
	    for (int i_21_ = i_20_;
		 ((i_21_ ^ 0xffffffff)
		  > (class37_sub13.anIntArray2116.length ^ 0xffffffff));
		 i_21_++) {
		class37_sub13.anIntArray2116[i_21_] = -1;
		class37_sub13.anIntArray2108[i_21_] = 0;
	    }
	}
    }
    
    public static void method250(byte i) {
	aClass16_616 = null;
	aClass16_597 = null;
	aClass16_618 = null;
	aClass45_604 = null;
	aClass16_596 = null;
	int i_22_ = 57 / ((-3 - i) / 37);
    }
    
    public Class24() {
	aLong626 = 0L;
	anInt628 = 0;
	aLong629 = 0L;
	aClass37_Sub3Array630 = new Class37_Sub3[8];
	anInt625 = 0;
	anInt632 = 0;
	aBoolean633 = true;
	aClass37_Sub3Array634 = new Class37_Sub3[8];
    }
    
    static {
	anInt605 = 0;
	aClass16_616
	    = (Class37_Sub2.create_rsstring
	       ("Your ignore list is full)3 Max of 100 users)3"));
	aClass16_618 = Class37_Sub2.create_rsstring("Lade)3)3)3");
	aClass16_596 = aClass16_616;
	aClass16_597 = Class37_Sub2.create_rsstring("Passwort: ");
    }
}
