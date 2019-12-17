package org.ie.client;

/* Class37_Sub4_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class37_Sub4_Sub7 extends NodeSub
{
    public static RSString aClass16_2625;
    public static byte[][] aByteArrayArray2626 = new byte[50][];
    public int anInt2627 = 1000;
    public static RSString aClass16_2628;
    public static int anInt2629;
    public static int anInt2630;
    public static int anInt2631;
    public static int anInt2632;
    public static Deque aClass58_2633;
    public static int anInt2634;
    public static Class37_Sub3_Sub3 aClass37_Sub3_Sub3_2635;
    public static RSString aClass16_2636;
    public static int anInt2637;
    public static Class24 aClass24_2638;
    public static int anInt2639;
    public static int anInt2640;
    public static int anInt2641;
    
    public static void method488(int i) {
	if (i < -87) {
	    aClass16_2625 = null;
	    aClass37_Sub3_Sub3_2635 = null;
	    aClass58_2633 = null;
	    aClass24_2638 = null;
	    aClass16_2636 = null;
	    aByteArrayArray2626 = null;
	    aClass16_2628 = null;
	}
    }
    
    public static void method489(Class37_Sub2 class37_sub2, byte i) {
	int i_0_ = 0;
	int i_1_ = 0;
	int i_2_ = -1;
	int i_3_ = -59 / ((36 - i) / 61);
	anInt2631++;
	if ((class37_sub2.anInt1815 ^ 0xffffffff) == -1)
	    i_0_ = Class38.aClass67_847.method1230(class37_sub2.anInt1813,
						   class37_sub2.anInt1836,
						   class37_sub2.anInt1829);
	int i_4_ = 0;
	if (class37_sub2.anInt1815 == 1)
	    i_0_ = Class38.aClass67_847.method1202(class37_sub2.anInt1813,
						   class37_sub2.anInt1836,
						   class37_sub2.anInt1829);
	if (class37_sub2.anInt1815 == 2)
	    i_0_ = Class38.aClass67_847.method1228(class37_sub2.anInt1813,
						   class37_sub2.anInt1836,
						   class37_sub2.anInt1829);
	if (class37_sub2.anInt1815 == 3)
	    i_0_ = Class38.aClass67_847.method1199(class37_sub2.anInt1813,
						   class37_sub2.anInt1836,
						   class37_sub2.anInt1829);
	if ((i_0_ ^ 0xffffffff) != -1) {
	    int i_5_ = Class38.aClass67_847.method1239(class37_sub2.anInt1813,
						       class37_sub2.anInt1836,
						       class37_sub2.anInt1829,
						       i_0_);
	    i_2_ = (0x1fffefea & i_0_) >> -216627378;
	    i_4_ = i_5_ >> 1016062310 & 0x3;
	    i_1_ = i_5_ & 0x1f;
	}
	class37_sub2.anInt1830 = i_2_;
	class37_sub2.anInt1827 = i_1_;
	class37_sub2.anInt1834 = i_4_;
    }
    
    public static int method490(int i, int i_6_) {
	return i & i_6_;
    }
    
    public static RSString method491(int i, int i_7_) {
	anInt2629++;
	RSString rSString = new RSString();
	rSString.anInt1650 = i_7_;
	rSString.aByteArray1669 = new byte[i];
	return rSString;
    }
    
    public static Sprite[] method492(int i) {
	anInt2632++;
	int i_8_ = 89 / ((i - 56) / 59);
	Sprite[] class37_sub4_sub9_sub3s
	    = new Sprite[Class10.anInt194];
	for (int i_9_ = 0; i_9_ < Class10.anInt194; i_9_++) {
	    Sprite class37_sub4_sub9_sub3
		= new Sprite();
	    class37_sub4_sub9_sub3.anInt3906 = anInt2637;
	    class37_sub4_sub9_sub3.anInt3905 = Class46.anInt989;
	    class37_sub4_sub9_sub3.anInt3909 = Class62.anIntArray1180[i_9_];
	    class37_sub4_sub9_sub3.anInt3908
		= Class37_Sub9_Sub23.anIntArray3357[i_9_];
	    class37_sub4_sub9_sub3.width = Class14.anIntArray250[i_9_];
	    class37_sub4_sub9_sub3.height
		= Class37_Sub9_Sub28.anIntArray3434[i_9_];
	    int i_10_ = (class37_sub4_sub9_sub3.width
			 * class37_sub4_sub9_sub3.height);
	    byte[] is = Class10.aByteArrayArray198[i_9_];
	    class37_sub4_sub9_sub3.pixels = new int[i_10_];
	    for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
		class37_sub4_sub9_sub3.pixels[i_11_]
		    = Class37_Sub9_Sub1.anIntArray2919[method490(is[i_11_],
								 255)];
	    class37_sub4_sub9_sub3s[i_9_] = class37_sub4_sub9_sub3;
	}
	Class37_Sub9_Sub11.method806(true);
	return class37_sub4_sub9_sub3s;
    }
    
    public Class37_Sub4_Sub7_Sub6 method493(boolean bool) {
	anInt2634++;
	if (bool != true)
	    aClass58_2633 = null;
	return null;
    }
    
    public void method494(int i, int i_12_, int i_13_, int i_14_, int i_15_,
			  int i_16_, int i_17_, int i_18_, int i_19_) {
	anInt2630++;
	Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6 = method493(true);
	if (class37_sub4_sub7_sub6 != null) {
	    anInt2627 = class37_sub4_sub7_sub6.anInt2627;
	    class37_sub4_sub7_sub6.method494(i, i_12_, i_13_, i_14_, i_15_,
					     i_16_, i_17_, i_18_, i_19_);
	}
    }
    
    static {
	aClass16_2625
	    = (Class37_Sub2.create_rsstring
	       ("To play on this world move to a free area first)3"));
	aClass16_2628 = aClass16_2625;
	aClass58_2633 = new Deque();
	aClass16_2636 = Class37_Sub2.create_rsstring("welle2:");
    }
}
