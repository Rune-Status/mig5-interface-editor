package org.ie.client;

/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class41
{
    public Class37_Sub4_Sub7 aClass37_Sub4_Sub7_887;
    public static int anInt888;
    public static RSString aClass16_889;
    public int anInt890;
    public int anInt891;
    public Class37_Sub4_Sub7 aClass37_Sub4_Sub7_892;
    public static RSString aClass16_893;
    public static RSString aClass16_894;
    public static RSString aClass16_895;
    public int anInt896;
    public int anInt897;
    public static RSString aClass16_898;
    public static RSString aClass16_899;
    public static int anInt900 = 0;
    public static int anInt901;
    public static int[] anIntArray902;
    public int anInt903 = 0;
    public int anInt904;
    public static RSString aClass16_905;
    public static int anInt906;
    public int anInt907;
    public int anInt908;
    public static RSString aClass16_909;
    public static RSString aClass16_910;
    public int anInt911 = 0;
    public static int[] anIntArray912;
    
    public static void method1073(int i) {
	aClass16_895 = null;
	anIntArray912 = null;
	aClass16_899 = null;
	aClass16_893 = null;
	aClass16_898 = null;
	anIntArray902 = null;
	aClass16_889 = null;
	aClass16_909 = null;
	if (i != -6321)
	    method1073(107);
	aClass16_894 = null;
	aClass16_905 = null;
	aClass16_910 = null;
    }
    
    public static void method1074(Class15 class15, int i, boolean bool,
				  RSString rSString, RSString class16_0_,
				  int i_1_, int i_2_) {
	try {
	    anInt888++;
	    if (i_1_ != 32)
		aClass16_898 = null;
	    int i_3_ = class15.method123((byte) 32, class16_0_);
	    int i_4_ = class15.method128(rSString, i_1_ + -119, i_3_);
	    Class37_Sub4_Sub4.method476(i, class15, i_3_, i_2_, bool, true,
					i_4_);
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516
		      (runtimeexception,
		       ("ma.B(" + (class15 != null ? "{...}" : "null") + ','
			+ i + ',' + bool + ','
			+ (rSString != null ? "{...}" : "null") + ','
			+ (class16_0_ != null ? "{...}" : "null") + ',' + i_1_
			+ ',' + i_2_ + ')'));
	}
    }
    
    static {
	aClass16_893 = Class37_Sub2.create_rsstring(" has logged in)3");
	aClass16_895 = Class37_Sub2.create_rsstring("T");
	aClass16_905
	    = Class37_Sub2.create_rsstring("Loading interfaces )2 ");
	anIntArray902 = new int[100];
	anInt906 = 0;
	aClass16_898
	    = (Class37_Sub2.create_rsstring
	       ("Please wait 5 minutes before trying again)3"));
	aClass16_899 = aClass16_898;
	aClass16_894
	    = Class37_Sub2.create_rsstring("Ung-Ultiger Benutzername");
	aClass16_889 = aClass16_893;
	aClass16_909 = aClass16_905;
	aClass16_910 = Class37_Sub2.create_rsstring("http:)4)4www)3runescape)3com");
	anIntArray912 = new int[] { 3, 40, 7, 32, 15, 47, 36, 49 };
    }
}
