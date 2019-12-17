package org.ie.client;

/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82 implements Interface3
{
    public static int anInt1687 = 0;
    public static RSString aClass16_1688;
    public static RSString aClass16_1689;
    public static RSString aClass16_1690;
    public Class15 aClass15_1691;
    public static int[] anIntArray1692 = new int[256];
    public static RSString aClass16_1693;
    public static int anInt1694;
    public static int anInt1695;
    public static int[] anIntArray1696;
    public static int anInt1697;
    public static RSString aClass16_1698;
    public static int anInt1699;
    public static int anInt1700;
    public Cache aClass65_1701;
    public static int[] anIntArray1702;
    public static int anInt1703;
    public static int anInt1704;
    public static int anInt1705;
    public static int anInt1706;
    public static int anInt1707;
    public static int anInt1708;
    public static int anInt1709;
    public int anInt1710 = 50;
    public static int anInt1711;
    public static int anInt1712;
    public static Cache aClass65_1713;
    public Class15 aClass15_1714;
    public int anInt1715 = 128;
    public static int anInt1716;
    
    public int[] method7(byte i, int i_0_) {
	if (i > -64)
	    aClass15_1691 = null;
	anInt1695++;
	ByteVector class37_sub11
	    = new ByteVector(aClass15_1691.getFile(0, i_0_));
	Class37_Sub4_Sub2 class37_sub4_sub2
	    = new Class37_Sub4_Sub2(class37_sub11);
	return class37_sub4_sub2.method457(94, this, aClass15_1714, anInt1715);
    }
    
    public boolean method10(int i, int i_1_) {
	if (i_1_ <= 23)
	    method13(-0.39047933F, -86, 121);
	anInt1699++;
	return method1309(i, false).method455(aClass15_1714, this, true);
    }
    
    public static int method1303(int i) {
	anInt1707++;
	if (i != 6)
	    method1308(-58, (byte) 74, 81);
	return 6;
    }
    
    public void method1304(int i) {
	anInt1704++;
	aClass65_1701 = new Cache(anInt1710);
	if (i != 19918)
	    method13(-0.64744514F, -57, -43);
    }
    
    public boolean method9(boolean bool, int i) {
	anInt1705++;
	if (bool != true)
	    method1309(-110, false);
	return method1309(i, !bool).aBoolean2536;
    }
    
    public static int method1305(int i, boolean bool, int i_2_) {
	anInt1703++;
	int i_3_
	    = (Class10.method83(45365 + i_2_, 91923 + i, 4, 121) + -128
	       - (-(Class10.method83(i_2_ - -10294, i + 37821, 2, 126) - 128
		    >> -678280703)
		  + -(Class10.method83(i_2_, i, 1, 121) + -128 >> 522121282)));
	if (bool != true)
	    return -37;
	i_3_ = 35 + (int) ((double) i_3_ * 0.3);
	if ((i_3_ ^ 0xffffffff) <= -11) {
	    if (i_3_ > 60)
		i_3_ = 60;
	} else
	    i_3_ = 10;
	return i_3_;
    }
    
    public int[] method13(float f, int i, int i_4_) {
	int i_5_ = 92 % ((i - 8) / 44);
	Class37_Sub4_Sub2 class37_sub4_sub2 = method1309(i_4_, false);
	anInt1708++;
	class37_sub4_sub2.aBoolean2525 = true;
	return class37_sub4_sub2.method459(-10538, f, this, aClass15_1714,
					   anInt1715);
    }
    
    public void method1306(int i, boolean bool) {
	for (Class37_Sub4_Sub2 class37_sub4_sub2
		 = (Class37_Sub4_Sub2) aClass65_1701.getFirst();
	     class37_sub4_sub2 != null;
	     class37_sub4_sub2
		 = (Class37_Sub4_Sub2) aClass65_1701.getNext()) {
	    if (class37_sub4_sub2.aBoolean2525) {
		class37_sub4_sub2.method458(i, 64);
		class37_sub4_sub2.aBoolean2525 = false;
	    }
	}
	if (bool == false)
	    anInt1706++;
    }
    
    public static void method1307(int i) {
	aClass16_1693 = null;
	aClass16_1688 = null;
	aClass65_1713 = null;
	aClass16_1689 = null;
	anIntArray1692 = null;
	aClass16_1690 = null;
	anIntArray1696 = null;
	anIntArray1702 = null;
	if (i != -105)
	    method1307(-32);
	aClass16_1698 = null;
    }
    
    public static void method1308(int i, byte i_6_, int i_7_) {
	if (i_6_ > 59) {
	    int[] is = new int[4];
	    int i_8_ = 1;
	    anInt1711++;
	    int[] is_9_ = new int[4];
	    is_9_[0] = i;
	    is[0] = i_7_;
	    for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -5; i_10_++) {
		if (i != Class87.anIntArray1587[i_10_]) {
		    is_9_[i_8_] = Class87.anIntArray1587[i_10_];
		    is[i_8_] = Class37_Sub12.anIntArray2097[i_10_];
		    i_8_++;
		}
	    }
	    Class87.anIntArray1587 = is_9_;
	    Class37_Sub12.anIntArray2097 = is;
	    Class37_Sub20.method1021(Class37_Sub12.anIntArray2097, 0,
				     Class87.anIntArray1587, 0,
				     (-1
				      + InterfaceListener.aClass56Array1933.length),
				     InterfaceListener.aClass56Array1933);
	}
    }
    
    public boolean method12(int i, int i_11_) {
	anInt1697++;
	if (i_11_ >= -73)
	    anInt1687 = 40;
	return method1309(i, false).aBoolean2540;
    }
    
    public Class37_Sub4_Sub2 method1309(int i, boolean bool) {
	anInt1700++;
	Class37_Sub4_Sub2 class37_sub4_sub2
	    = ((Class37_Sub4_Sub2)
	       aClass65_1701.get((long) i));
	if (bool != false)
	    anIntArray1696 = null;
	if (class37_sub4_sub2 != null)
	    return class37_sub4_sub2;
	byte[] is = aClass15_1691.getFile(0, i);
	if (is == null)
	    return Class37_Sub9_Sub20.method844((byte) -107);
	ByteVector class37_sub11 = new ByteVector(is);
	class37_sub4_sub2 = new Class37_Sub4_Sub2(class37_sub11);
	aClass65_1701.put(class37_sub4_sub2, (long) i);
	return class37_sub4_sub2;
    }
    
    public boolean method8(int i, int i_12_) {
	anInt1694++;
	if (i >= -91)
	    method1303(-90);
	if ((anInt1715 ^ 0xffffffff) == -65
	    || (method1309(i_12_, false).anInt2531 ^ 0xffffffff) == -65)
	    return true;
	return false;
    }
    
    public int method11(byte i, int i_13_) {
	if (i != -29)
	    method1306(30, false);
	anInt1716++;
	return method1309(i_13_, false).anInt2519;
    }
    
    public static void method1310(int i, boolean bool) {
	anInt1712++;
	if (i < 52)
	    aClass65_1713 = null;
	for (int i_14_ = 0; Class76.anInt1436 > i_14_; i_14_++) {
	    Class37_Sub4_Sub7_Sub1_Sub1 class37_sub4_sub7_sub1_sub1
		= (Class37_Sub13.aClass37_Sub4_Sub7_Sub1_Sub1Array2111
		   [Class37_Sub4_Sub16.anIntArray2869[i_14_]]);
	    int i_15_ = 536870912 - -(Class37_Sub4_Sub16.anIntArray2869[i_14_]
				      << -595292530);
	    if (class37_sub4_sub7_sub1_sub1 != null
		&& class37_sub4_sub7_sub1_sub1.method497(20542)
		&& (class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955
		    .aBoolean2863) == bool
		&& class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955
		       .method721(126)) {
		int i_16_
		    = class37_sub4_sub7_sub1_sub1.anInt3666 >> -442910681;
		int i_17_
		    = class37_sub4_sub7_sub1_sub1.anInt3642 >> -2067953241;
		if (i_16_ >= 0 && (i_16_ ^ 0xffffffff) > -105 && i_17_ >= 0
		    && (i_17_ ^ 0xffffffff) > -105) {
		    if (((class37_sub4_sub7_sub1_sub1.anInt3683 ^ 0xffffffff)
			 == -2)
			&& (0x7f & class37_sub4_sub7_sub1_sub1.anInt3666
			    ^ 0xffffffff) == -65
			&& (class37_sub4_sub7_sub1_sub1.anInt3642 & 0x7f
			    ^ 0xffffffff) == -65) {
			if ((Queue.anIntArrayArray1449[i_16_][i_17_]
			     ^ 0xffffffff)
			    == (Class73.anInt1388 ^ 0xffffffff))
			    continue;
			Queue.anIntArrayArray1449[i_16_][i_17_]
			    = Class73.anInt1388;
		    }
		    if (!class37_sub4_sub7_sub1_sub1.aClass37_Sub4_Sub15_3955
			 .aBoolean2811)
			i_15_ += -2147483648;
		    Class38.aClass67_847.method1238
			(Class37_Sub9_Sub1.anInt2916,
			 class37_sub4_sub7_sub1_sub1.anInt3666,
			 class37_sub4_sub7_sub1_sub1.anInt3642,
			 (RSString.method153
			  (Class37_Sub9_Sub1.anInt2916, (64 * class37_sub4_sub7_sub1_sub1.anInt3683 + -64
			    + class37_sub4_sub7_sub1_sub1.anInt3642),
			   (64 * (-1 + class37_sub4_sub7_sub1_sub1.anInt3683)
			    + class37_sub4_sub7_sub1_sub1.anInt3666))),
			 60 + 64 * class37_sub4_sub7_sub1_sub1.anInt3683 - 64,
			 class37_sub4_sub7_sub1_sub1,
			 class37_sub4_sub7_sub1_sub1.anInt3663, i_15_,
			 class37_sub4_sub7_sub1_sub1.aBoolean3635);
		}
	    }
	}
    }
    
    public Class82(Class15 class15, Class15 class15_18_, int i, int i_19_) {
	try {
	    aClass15_1714 = class15_18_;
	    anInt1715 = i_19_;
	    aClass15_1691 = class15;
	    anInt1710 = i;
	    aClass65_1701 = new Cache(anInt1710);
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("vc.<init>("
						    + (class15 != null
						       ? "{...}" : "null")
						    + ','
						    + (class15_18_ != null
						       ? "{...}" : "null")
						    + ',' + i + ',' + i_19_
						    + ')'));
	}
    }
    
    static {
	aClass16_1688
	    = (Class37_Sub2.create_rsstring
	       ("You are standing in a members)2only area)3"));
	aClass16_1698 = aClass16_1688;
	anIntArray1702 = new int[5];
	aClass16_1689 = Class37_Sub2.create_rsstring("Untersuchen");
	anIntArray1696 = new int[25];
	aClass16_1693 = Class37_Sub2.create_rsstring(":assist:");
	aClass16_1690 = Class37_Sub2.create_rsstring("<col=00ff00>");
	aClass65_1713 = new Cache(64);
    }
}
