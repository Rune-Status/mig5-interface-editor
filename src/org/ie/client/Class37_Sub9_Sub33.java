package org.ie.client;

/* Class37_Sub9_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub33 extends Class37_Sub9
{
    public static int anInt3510;
    public static int anInt3511;
    public static Cache aClass65_3512;
    public static int anInt3513;
    public static int anInt3514;
    public static int anInt3515;
    public static int anInt3516;
    public static int anInt3517;
    public static int[] anIntArray3518 = new int[1000];
    public static int[] anIntArray3519;
    public static RSString aClass16_3520;
    public static RSString aClass16_3521;
    public static RSString aClass16_3522;
    public static Class37_Sub4_Sub9_Sub1[] aClass37_Sub4_Sub9_Sub1Array3523;
    public static RSString aClass16_3524;
    public static RSString password;
    public static RSString aClass16_3526;
    public static Class23 aClass23_3527;
    public static RSString aClass16_3528;
    
    public static void method901(Class69 class69, int i,
				 Class15_Sub1 class15_sub1, boolean bool) {
	try {
	    anInt3516++;
	    if (bool != false)
		method901(null, 120, null, false);
	    byte[] is = null;
	    synchronized (Class37_Sub9_Sub34.aClass58_3557) {
		for (Class37_Sub5 class37_sub5
			 = ((Class37_Sub5)
			    Class37_Sub9_Sub34.aClass58_3557.getFirst());
		     class37_sub5 != null;
		     class37_sub5
			 = (Class37_Sub5) Class37_Sub9_Sub34.aClass58_3557
					      .getNext()) {
		    if (class37_sub5.hash == (long) i
			&& class37_sub5.aClass69_1866 == class69
			&& (class37_sub5.anInt1867 ^ 0xffffffff) == -1) {
			is = class37_sub5.aByteArray1863;
			break;
		    }
		}
	    }
	    if (is != null)
		class15_sub1.method142(i, true, -115, class69, is);
	    else {
		byte[] is_0_ = class69.method1252(i, -117);
		class15_sub1.method142(i, true, 90, class69, is_0_);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("uh.C("
						    + (class69 != null
						       ? "{...}" : "null")
						    + ',' + i + ','
						    + (class15_sub1 != null
						       ? "{...}" : "null")
						    + ',' + bool + ')'));
	}
    }
    
    public static boolean method902(boolean bool, int i) {
	anInt3513++;
	if (bool != true)
	    password = null;
	if ((i & 0x24bd23) >> 196304373 == 0)
	    return false;
	return true;
    }
    
    public static int method903(int i, int i_1_, int i_2_, byte i_3_, int i_4_,
				int i_5_, int i_6_) {
	anInt3511++;
	if ((i_4_ & 0x1 ^ 0xffffffff) == -2) {
	    int i_7_ = i_1_;
	    i_1_ = i_2_;
	    i_2_ = i_7_;
	}
	i_6_ &= 0x3;
	if (i_6_ == 0)
	    return i_5_;
	if (i_3_ != -38)
	    return -96;
	if (i_6_ == 1)
	    return i;
	if ((i_6_ ^ 0xffffffff) == -3)
	    return -i_1_ - -1 + (7 - i_5_);
	return 1 + -i_2_ + (-i + 7);
    }
    
    public Class37_Sub9_Sub33() {
	super(0, true);
    }
    
    public static void method904(int i) {
	password = null;
	anIntArray3518 = null;
	aClass37_Sub4_Sub9_Sub1Array3523 = null;
	aClass16_3522 = null;
	anIntArray3519 = null;
	aClass16_3524 = null;
	aClass16_3521 = null;
	aClass23_3527 = null;
	if (i != -1)
	    method902(true, -10);
	aClass65_3512 = null;
	aClass16_3526 = null;
	aClass16_3520 = null;
	aClass16_3528 = null;
    }
    
    public int[] method761(int i, int i_8_) {
	int[] is = aClass38_1966.method1049(i_8_, true);
	anInt3517++;
	if (i > -125)
	    method902(true, 8);
	if (aClass38_1966.aBoolean850) {
	    int i_9_ = Class37_Sub4_Sub16.anIntArray2871[i_8_];
	    for (int i_10_ = 0; i_10_ < Class32.anInt743; i_10_++)
		is[i_10_] = method906(-126, i_9_,
				      Class84.anIntArray1528[i_10_]) % 4096;
	}
	return is;
    }
    
    public static void method905(int i) {
	for (int i_11_ = -1;
	     (Class19.anInt487 ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
	    int i_12_;
	    if (i_11_ != -1)
		i_12_ = Class26.anIntArray657[i_11_];
	    else
		i_12_ = 2047;
	    Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2
		= Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414[i_12_];
	    if (class37_sub4_sub7_sub1_sub2 != null)
		Class37_Sub9_Sub3.method771(1, class37_sub4_sub7_sub1_sub2,
					    105);
	}
	anInt3510++;
	if (i >= -121)
	    method902(true, 16);
    }
    
    public int method906(int i, int i_13_, int i_14_) {
	anInt3514++;
	int i_15_ = i_14_ - -(i_13_ * 57);
	int i_16_ = -25 % ((-7 - i) / 62);
	i_15_ ^= i_15_ << -1425864511;
	return (4096
		+ -((i_15_ * (i_15_ * (i_15_ * 15731) - -789221) - -1376312589
		     & 0x7fffffff)
		    / 262144));
    }
    
    static {
	aClass65_3512 = new Cache(200);
	aClass16_3524 = Class37_Sub2.create_rsstring("");
	aClass16_3526 = aClass16_3524;
	aClass16_3522 = aClass16_3524;
	password = aClass16_3524;
	aClass16_3520 = aClass16_3524;
	aClass16_3521 = aClass16_3524;
	aClass16_3528 = aClass16_3524;
    }
}
