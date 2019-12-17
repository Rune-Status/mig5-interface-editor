package org.ie.client;

/* Class37_Sub4_Sub7_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub7_Sub3 extends Class37_Sub4_Sub7
{
    public static RSString aClass16_3736;
    public int anInt3737;
    public static boolean aBoolean3738 = false;
    public static RSString aClass16_3739;
    public static Class15_Sub1 aClass15_Sub1_3740;
    public static RSString aClass16_3741;
    public static int anInt3742;
    public static int anInt3743;
    public static int anInt3744;
    public static RSString aClass16_3745;
    public static RSString aClass16_3746;
    public static RSString aClass16_3747;
    public static boolean[] aBooleanArray3748;
    public static RSString aClass16_3749;
    public static RSString aClass16_3750;
    public static RSString aClass16_3751;
    public int anInt3752;
    public static int anInt3753;
    public static RSString aClass16_3754;
    public static RSString aClass16_3755;
    
    public Class37_Sub4_Sub7_Sub6 method493(boolean bool) {
	if (bool != true)
	    method516(null, null);
	anInt3744++;
	return Class46.loadItem(anInt3752, (byte) 115).method451((byte) -115,
								   anInt3737);
    }
    
    public static void method515(Class15 class15, Class15 class15_0_, int i) {
	try {
	    anInt3753++;
	    Class36.aClass15_800 = class15_0_;
	    Class37_Sub9_Sub15.aClass15_3159 = class15;
	    Class37_Sub2.anInt1832 = Class36.aClass15_800.method129(i);
	} catch (RuntimeException runtimeexception) {
	    throw method516(runtimeexception,
			    ("f.A(" + (class15 != null ? "{...}" : "null")
			     + ',' + (class15_0_ != null ? "{...}" : "null")
			     + ',' + i + ')'));
	}
    }
    
    public static RuntimeException_Sub1 method516(Throwable throwable,
						  String string) {
	anInt3742++;
	RuntimeException_Sub1 runtimeexception_sub1;
	if (throwable instanceof RuntimeException_Sub1) {
	    runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
	    runtimeexception_sub1.aString1625 += ' ' + (String) string;
	} else
	    runtimeexception_sub1
		= new RuntimeException_Sub1(throwable, string);
	return runtimeexception_sub1;
    }
    
    public static void method517(byte i) {
	aClass16_3741 = null;
	aClass16_3746 = null;
	aClass16_3754 = null;
	aClass16_3750 = null;
	aClass16_3751 = null;
	aClass16_3747 = null;
	aClass15_Sub1_3740 = null;
	aClass16_3736 = null;
	aClass16_3749 = null;
	if (i != 59)
	    method517((byte) -101);
	aClass16_3739 = null;
	aBooleanArray3748 = null;
	aClass16_3745 = null;
	aClass16_3755 = null;
    }
    
    static {
	aClass16_3736
	    = Class37_Sub2.create_rsstring("Please wait 1 minute and try again)3");
	aClass16_3745 = aClass16_3736;
	aClass16_3747
	    = Class37_Sub2.create_rsstring("Bitte versuchen Sie es erneut)3");
	aBooleanArray3748
	    = new boolean[] { true, true, true, true, true, true, true, true,
			      true, true, true, true, true, true, true, true,
			      true, true, true, true, true, true, true, false,
			      false };
	aClass16_3741
	    = Class37_Sub2.create_rsstring("Please reload this page)3");
	aClass16_3754
	    = Class37_Sub2.create_rsstring(" zuerst von Ihrer Ignorieren)2Liste(Q");
	aClass16_3750 = Class37_Sub2.create_rsstring(":trade:");
	aClass16_3739
	    = Class37_Sub2.create_rsstring("Invalid username or password)3");
	aClass16_3749 = aClass16_3736;
	aClass16_3755 = Class37_Sub2.create_rsstring("mapdots");
	aClass16_3751 = aClass16_3739;
	aClass16_3746 = aClass16_3741;
    }
}
