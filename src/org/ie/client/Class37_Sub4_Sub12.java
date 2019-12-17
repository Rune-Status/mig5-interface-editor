package org.ie.client;

/* Class37_Sub4_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

public class Class37_Sub4_Sub12 extends NodeSub
{
    public static int anInt2753;
    public int anInt2754;
    public boolean aBoolean2755 = false;
    public int[] anIntArray2756;
    public int[] anIntArray2757;
    public int anInt2758;
    public static int anInt2759;
    public int anInt2760;
    public int[] anIntArray2761;
    public int anInt2762;
    public static int anInt2763;
    public static int anInt2764;
    public static int anInt2765;
    public int anInt2766;
    public static int anInt2767;
    public static int anInt2768;
    public int anInt2769;
    public static Cache aClass65_2770;
    public static int anInt2771;
    public static int anInt2772;
    public static RSInterface aClass18_2773 = null;
    public int[] anIntArray2774;
    public static boolean aBoolean2775 = false;
    public int anInt2776;
    public int anInt2777;
    public static int anInt2778;
    public static int anInt2779;
    public int[] anIntArray2780;
    public static int anInt2781;
    public static Calendar aCalendar2782;
    public static int anInt2783;
    public static int anInt2784;
    public static int anInt2785;
    public static RSString aClass16_2786;
    public static RSString aClass16_2787;
    
    public static void method693(int i) {
	Class81.aClass65_1509.clear();
	if (i < 59)
	    method693(-58);
	anInt2779++;
    }
    
    public Class37_Sub4_Sub7_Sub6 method694
	(int i, int i_0_, int i_1_,
	 Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6) {
	i = anIntArray2761[i];
	Class37_Sub4_Sub16 class37_sub4_sub16
	    = Class45.method1097((byte) 127, i >> 494083856);
	i &= 0xffff;
	anInt2771++;
	if (class37_sub4_sub16 == null)
	    return class37_sub4_sub7_sub6.method559(true);
	if (i_1_ != 1524262960)
	    method702(2, null, 61);
	i_0_ &= 0x3;
	Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6_2_
	    = class37_sub4_sub7_sub6
		  .method559(!class37_sub4_sub16.method722(false, i));
	if (i_0_ != 1) {
	    if (i_0_ != 2) {
		if (i_0_ == 3)
		    class37_sub4_sub7_sub6_2_.method553();
	    } else
		class37_sub4_sub7_sub6_2_.method556();
	} else
	    class37_sub4_sub7_sub6_2_.method558();
	class37_sub4_sub7_sub6_2_.method547(class37_sub4_sub16, i);
	if ((i_0_ ^ 0xffffffff) == -2)
	    class37_sub4_sub7_sub6_2_.method553();
	else if ((i_0_ ^ 0xffffffff) != -3) {
	    if ((i_0_ ^ 0xffffffff) == -4)
		class37_sub4_sub7_sub6_2_.method558();
	} else
	    class37_sub4_sub7_sub6_2_.method556();
	return class37_sub4_sub7_sub6_2_;
    }
    
    public Class37_Sub4_Sub7_Sub6 method695
	(Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6, int i, boolean bool) {
	anInt2764++;
	i = anIntArray2761[i];
	if (bool != true)
	    method704(null, -26, 52);
	Class37_Sub4_Sub16 class37_sub4_sub16
	    = Class45.method1097((byte) 127, i >> -1093910128);
	i &= 0xffff;
	if (class37_sub4_sub16 == null)
	    return class37_sub4_sub7_sub6.method542(true);
	Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6_3_
	    = class37_sub4_sub7_sub6
		  .method542(!class37_sub4_sub16.method722(false, i));
	class37_sub4_sub7_sub6_3_.method547(class37_sub4_sub16, i);
	return class37_sub4_sub7_sub6_3_;
    }
    
    public void method696(ByteVector class37_sub11, int i) {
	for (;;) {
	    int i_4_ = class37_sub11.getUnsignedByte();
	    if ((i_4_ ^ 0xffffffff) == -1)
		break;
	    method700(i_4_, class37_sub11, 11);
	}
	if (i != 5)
	    aBoolean2755 = true;
	anInt2767++;
    }
    
    public static Class37_Sub4_Sub3 method697(int i, byte i_5_) {
	anInt2763++;
	Class37_Sub4_Sub3 class37_sub4_sub3
	    = ((Class37_Sub4_Sub3)
	       Class82.aClass65_1713.get((long) i));
	if (class37_sub4_sub3 != null)
	    return class37_sub4_sub3;
	byte[] is = Class37_Sub3_Sub3.aClass15_2394.getFile(1, i);
	if (i_5_ != -92)
	    method697(23, (byte) -99);
	class37_sub4_sub3 = new Class37_Sub4_Sub3();
	if (is != null)
	    class37_sub4_sub3.method462(true, new ByteVector(is), i);
	class37_sub4_sub3.method468(false);
	Class82.aClass65_1713.put(class37_sub4_sub3, (long) i);
	return class37_sub4_sub3;
    }
    
    public static Class37_Sub4_Sub9_Sub1[] method698(int i) {
	if (i != -5048)
	    aClass65_2770 = null;
	anInt2753++;
	Class37_Sub4_Sub9_Sub1[] class37_sub4_sub9_sub1s
	    = new Class37_Sub4_Sub9_Sub1[Class10.anInt194];
	for (int i_6_ = 0;
	     (Class10.anInt194 ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
	    Class37_Sub4_Sub9_Sub1 class37_sub4_sub9_sub1
		= new Class37_Sub4_Sub9_Sub1();
	    class37_sub4_sub9_sub1.anInt3864 = Class37_Sub4_Sub7.anInt2637;
	    class37_sub4_sub9_sub1.anInt3858 = Class46.anInt989;
	    class37_sub4_sub9_sub1.anInt3863 = Class62.anIntArray1180[i_6_];
	    class37_sub4_sub9_sub1.anInt3861
		= Class37_Sub9_Sub23.anIntArray3357[i_6_];
	    class37_sub4_sub9_sub1.anInt3865 = Class14.anIntArray250[i_6_];
	    class37_sub4_sub9_sub1.anInt3862
		= Class37_Sub9_Sub28.anIntArray3434[i_6_];
	    class37_sub4_sub9_sub1.anIntArray3859
		= Class37_Sub9_Sub1.anIntArray2919;
	    class37_sub4_sub9_sub1.aByteArray3860
		= Class10.aByteArrayArray198[i_6_];
	    class37_sub4_sub9_sub1s[i_6_] = class37_sub4_sub9_sub1;
	}
	Class37_Sub9_Sub11.method806(true);
	return class37_sub4_sub9_sub1s;
    }
    
    public void method699(int i) {
	anInt2778++;
	if ((anInt2766 ^ 0xffffffff) == 0) {
	    if (anIntArray2774 != null)
		anInt2766 = 2;
	    else
		anInt2766 = 0;
	}
	if ((anInt2754 ^ 0xffffffff) == 0) {
	    if (anIntArray2774 != null)
		anInt2754 = 2;
	    else
		anInt2754 = 0;
	}
	if (i != 26486)
	    method704(null, -72, -127);
    }
    
    public void method700(int i, ByteVector class37_sub11, int i_7_) {
	if (i != 1) {
	    if (i == 2)
		anInt2777 = class37_sub11.getUnsignedShort();
	    else if ((i ^ 0xffffffff) != -4) {
		if ((i ^ 0xffffffff) != -5) {
		    if ((i ^ 0xffffffff) == -6)
			anInt2762 = class37_sub11.getUnsignedByte();
		    else if (i == 6)
			anInt2769 = class37_sub11.getUnsignedShort();
		    else if (i == 7)
			anInt2758 = class37_sub11.getUnsignedShort();
		    else if (i == 8)
			anInt2776 = class37_sub11.getUnsignedByte();
		    else if (i == 9)
			anInt2766 = class37_sub11.getUnsignedByte();
		    else if (i != 10) {
			if (i == 11)
			    anInt2760 = class37_sub11.getUnsignedByte();
			else if (i != 12) {
			    if ((i ^ 0xffffffff) == -14) {
				int i_8_ = class37_sub11.getUnsignedByte();
				anIntArray2757 = new int[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
				    anIntArray2757[i_9_]
					= (class37_sub11.getTriByte
					   (Class37_Sub4_Sub7_Sub1_Sub1
						.method502(i_7_, -26256533)));
			    }
			} else {
			    int i_10_ = class37_sub11.getUnsignedByte();
			    anIntArray2756 = new int[i_10_];
			    for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
				anIntArray2756[i_11_]
				    = class37_sub11.getUnsignedShort();
			    for (int i_12_ = 0;
				 (i_12_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff);
				 i_12_++)
				anIntArray2756[i_12_]
				    = (class37_sub11.getUnsignedShort()
				       << -611978128) - -anIntArray2756[i_12_];
			}
		    } else
			anInt2754 = class37_sub11.getUnsignedByte();
		} else
		    aBoolean2755 = true;
	    } else {
		int i_13_ = class37_sub11.getUnsignedByte();
		anIntArray2774 = new int[1 + i_13_];
		for (int i_14_ = 0;
		     (i_13_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++)
		    anIntArray2774[i_14_] = class37_sub11.getUnsignedByte();
		anIntArray2774[i_13_] = 9999999;
	    }
	} else {
	    int i_15_ = class37_sub11.getUnsignedShort();
	    anIntArray2780 = new int[i_15_];
	    for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff);
		 i_16_++)
		anIntArray2780[i_16_] = class37_sub11.getUnsignedShort();
	    anIntArray2761 = new int[i_15_];
	    for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff);
		 i_17_++)
		anIntArray2761[i_17_] = class37_sub11.getUnsignedShort();
	    for (int i_18_ = 0; i_15_ > i_18_; i_18_++)
		anIntArray2761[i_18_]
		    = ((class37_sub11.getUnsignedShort() << 1524262960)
		       + anIntArray2761[i_18_]);
	}
	anInt2765++;
	if (i_7_ != 11)
	    anInt2762 = 69;
    }
    
    public Class37_Sub4_Sub7_Sub6 method701
	(int i, Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6, byte i_19_,
	 Class37_Sub4_Sub12 class37_sub4_sub12_20_, int i_21_) {
	try {
	    int i_22_ = 26 % ((i_19_ - -24) / 50);
	    anInt2768++;
	    i = anIntArray2761[i];
	    Class37_Sub4_Sub16 class37_sub4_sub16
		= Class45.method1097((byte) 127, i >> -1286134928);
	    i &= 0xffff;
	    if (class37_sub4_sub16 == null)
		return class37_sub4_sub12_20_.method704(class37_sub4_sub7_sub6,
							i_21_, 65535);
	    i_21_ = class37_sub4_sub12_20_.anIntArray2761[i_21_];
	    Class37_Sub4_Sub16 class37_sub4_sub16_23_
		= Class45.method1097((byte) 127, i_21_ >> 1605854416);
	    i_21_ &= 0xffff;
	    if (class37_sub4_sub16_23_ == null) {
		Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6_24_
		    = class37_sub4_sub7_sub6
			  .method559(!class37_sub4_sub16.method722(false, i));
		class37_sub4_sub7_sub6_24_.method547(class37_sub4_sub16, i);
		return class37_sub4_sub7_sub6_24_;
	    }
	    Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6_25_
		= (class37_sub4_sub7_sub6.method559
		   (!class37_sub4_sub16.method722(false, i)
		    & !class37_sub4_sub16_23_.method722(false, i_21_)));
	    class37_sub4_sub7_sub6_25_.method551(class37_sub4_sub16, i,
						 class37_sub4_sub16_23_, i_21_,
						 anIntArray2774);
	    return class37_sub4_sub7_sub6_25_;
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516
		      (runtimeexception,
		       ("pf.B(" + i + ','
			+ (class37_sub4_sub7_sub6 != null ? "{...}" : "null")
			+ ',' + i_19_ + ','
			+ (class37_sub4_sub12_20_ != null ? "{...}" : "null")
			+ ',' + i_21_ + ')'));
	}
    }
    
    public Class37_Sub4_Sub7_Sub6 method702(int i, Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6, int i_26_) {
    	if(i > -1)
    		return class37_sub4_sub7_sub6;
	int i_27_ = anIntArray2761[i];
	anInt2772++;
	Class37_Sub4_Sub16 class37_sub4_sub16
	    = Class45.method1097((byte) 127, i_27_ >> 1235664400);
	i_27_ &= 0xffff;
	if (class37_sub4_sub16 == null)
	    return class37_sub4_sub7_sub6.method559(true);
	if (i_26_ <= 33)
	    method693(-128);
	int i_28_ = 0;
	Class37_Sub4_Sub16 class37_sub4_sub16_29_ = null;
	if (anIntArray2756 != null
	    && (i ^ 0xffffffff) > (anIntArray2756.length ^ 0xffffffff)) {
	    i_28_ = anIntArray2756[i];
	    class37_sub4_sub16_29_
		= Class45.method1097((byte) 127, i_28_ >> -1066659472);
	    i_28_ &= 0xffff;
	}
	if (class37_sub4_sub16_29_ == null || (i_28_ ^ 0xffffffff) == -65536) {
	    Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6_30_
		= class37_sub4_sub7_sub6
		      .method559(!class37_sub4_sub16.method722(false, i_27_));
	    class37_sub4_sub7_sub6_30_.method547(class37_sub4_sub16, i_27_);
	    return class37_sub4_sub7_sub6_30_;
	}
	Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6_31_
	    = (class37_sub4_sub7_sub6.method559
	       (!class37_sub4_sub16.method722(false, i_27_)
		& !class37_sub4_sub16_29_.method722(false, i_28_)));
	class37_sub4_sub7_sub6_31_.method547(class37_sub4_sub16, i_27_);
	class37_sub4_sub7_sub6_31_.method547(class37_sub4_sub16_29_, i_28_);
	return class37_sub4_sub7_sub6_31_;
    }
    
    public static void method703(byte i) {
	aClass16_2786 = null;
	aClass18_2773 = null;
	aCalendar2782 = null;
	aClass16_2787 = null;
	if (i != -36)
	    method698(5);
	aClass65_2770 = null;
    }
    
    public Class37_Sub4_Sub12() {
	anInt2754 = -1;
	anInt2760 = 2;
	anInt2758 = -1;
	anInt2769 = -1;
	anInt2762 = 5;
	anInt2776 = 99;
	anInt2777 = -1;
	anInt2766 = -1;
    }
    
    public Class37_Sub4_Sub7_Sub6 method704
	(Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6, int i, int i_32_) {
	anInt2781++;
	i = anIntArray2761[i];
	Class37_Sub4_Sub16 class37_sub4_sub16
	    = Class45.method1097((byte) 127, i >> 326311408);
	i &= i_32_;
	if (class37_sub4_sub16 == null)
	    return class37_sub4_sub7_sub6.method559(true);
	Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6_33_
	    = class37_sub4_sub7_sub6
		  .method559(!class37_sub4_sub16.method722(false, i));
	class37_sub4_sub7_sub6_33_.method547(class37_sub4_sub16, i);
	return class37_sub4_sub7_sub6_33_;
    }
    
    static {
	aClass65_2770 = new Cache(30);
	aCalendar2782 = Calendar.getInstance();
	anInt2785 = 0;
	anInt2784 = 0;
	anInt2783 = 0;
	aClass16_2787 = Class37_Sub2.create_rsstring("Password: ");
	aClass16_2786 = aClass16_2787;
    }
}
