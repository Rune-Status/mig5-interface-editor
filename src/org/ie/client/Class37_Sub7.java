package org.ie.client;

/* Class37_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub7 extends Node
{
    public int anInt1892;
    public static int anInt1893;
    public static RSInterface presse_child;
    public int[] anIntArray1895;
    public Class37_Sub3_Sub4 aClass37_Sub3_Sub4_1896;
    public static int anInt1897;
    public static int loopCycle = 0;
    public static int anInt1899;
    public static int anInt1900;
    public Class37_Sub4_Sub11 aClass37_Sub4_Sub11_1901;
    public static RSString aClass16_1902
	= (Class37_Sub2.create_rsstring
	   ("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie"));
    public int anInt1903;
    public static int anInt1904 = 0;
    public int anInt1905;
    public static RSString aClass16_1906;
    public int anInt1907;
    public int anInt1908;
    public int anInt1909;
    public int anInt1910;
    public static int anInt1911;
    public static RSString aClass16_1912;
    public int anInt1913;
    public int anInt1914;
    public static int anInt1915;
    public static int anInt1916;
    public Class37_Sub3_Sub4 aClass37_Sub3_Sub4_1917;
    public int anInt1918;
    public static int anInt1919;
    
    public static void redrawInterfaceArea(int i, int i_0_, int i_1_, int i_2_) {
	int i_4_ = 0;
	    for (/**/; i_4_ < Class37_Sub9_Sub37.anInt3597; i_4_++) {
		if (((Class37_Sub11_Sub1.anIntArray3611[i_4_]
		      + Class71.anIntArray1364[i_4_])
		     ^ 0xffffffff) < (i_0_ ^ 0xffffffff)
		    && i + i_0_ > Class71.anIntArray1364[i_4_]
		    && ((i_1_ ^ 0xffffffff)
			> ((Class43.anIntArray961[i_4_]
			    - -Class37_Sub4_Sub7_Sub7.anIntArray3842[i_4_])
			   ^ 0xffffffff))
		    && i_2_ + i_1_ > Class43.anIntArray961[i_4_])
		    Class37_Sub4_Sub7_Sub1_Sub1.aBooleanArray3948[i_4_] = true;
	    }
    }
    
    public static void method741(int i, int i_5_, int i_6_, int i_7_,
				 int i_8_) {
	anInt1911++;
	if ((Class19.anInt490 ^ 0xffffffff) == -2)
	    Class76.aClass37_Sub4_Sub9_Sub3Array1435
		[Class37_Sub9_Sub8.anInt3057 / 100]
		.method653(Applet_Sub1.anInt8 - 8, -8 + Class27.anInt676);
	if (Class19.anInt490 == 2)
	    Class76.aClass37_Sub4_Sub9_Sub3Array1435
		[4 - -(Class37_Sub9_Sub8.anInt3057 / 100)]
		.method653(-8 + Applet_Sub1.anInt8, Class27.anInt676 - 8);
	Cache.method1182(false);
	int i_9_ = -115 / ((-62 - i_6_) / 46);
	if (Class64.aBoolean1216) {
	    int i_10_ = 512 + (i_7_ - 5);
	    int i_11_ = 20 + i_5_;
	    Class17.aClass37_Sub4_Sub9_Sub2_Sub1_315.method603
		((Class37_Sub9_Sub27.method881
		  ((new RSString[]
			  { KeyboardHandler.aClass16_561,
			    Class37_Sub9_Sub24.method870(Applet_Sub1.anInt13,
							 (byte) -114) }))),
		 i_10_, i_11_, 16776960, -1);
	    i_11_ += 15;
	    Runtime runtime = Runtime.getRuntime();
	    int i_12_ = (int) ((runtime.totalMemory() + -runtime.freeMemory())
			       / 1024L);
	    int i_13_ = 16776960;
	    if (i_12_ > 32768 && ClientScriptDef.aBoolean2613)
		i_13_ = 16711680;
	    if (i_12_ > 65536 && !ClientScriptDef.aBoolean2613)
		i_13_ = 16711680;
	    Class17.aClass37_Sub4_Sub9_Sub2_Sub1_315.method603
		((Class37_Sub9_Sub27.method881
		  (new RSString[] { Class37_Sub9_Sub29.aClass16_3444,
				   Class37_Sub9_Sub24.method870(i_12_,
								(byte) -114),
				   Class37_Sub9_Sub10.aClass16_3087 })),
		 i_10_, i_11_, i_13_, -1);
	    i_11_ += 15;
	}
    }
    
    public static void method742(int i) {
    	Class37_Sub13 class37_sub13 = ((Class37_Sub13) Class37_Sub4_Sub7_Sub1.aClass13_3670.get((long) i));
    	if (class37_sub13 != null)
    		class37_sub13.unlink();
    }
    
    public static void method743(byte i) {
	aClass16_1912 = null;
	if (i >= -47)
	    method743((byte) -15);
	presse_child = null;
	aClass16_1902 = null;
	aClass16_1906 = null;
    }
    
    public void method744(int i) {
	int i_14_ = anInt1910;
	if (i != -870)
	    method741(125, 126, 50, 49, 85);
	anInt1899++;
	Class37_Sub4_Sub11 class37_sub4_sub11
	    = aClass37_Sub4_Sub11_1901.method681((byte) 95);
	if (class37_sub4_sub11 == null) {
	    anInt1909 = 0;
	    anInt1910 = -1;
	    anIntArray1895 = null;
	    anInt1908 = 0;
	    anInt1905 = 0;
	} else {
	    anIntArray1895 = class37_sub4_sub11.anIntArray2714;
	    anInt1905 = class37_sub4_sub11.anInt2705 * 128;
	    anInt1910 = class37_sub4_sub11.anInt2709;
	    anInt1908 = class37_sub4_sub11.anInt2727;
	    anInt1909 = class37_sub4_sub11.anInt2692;
	}
	if ((i_14_ ^ 0xffffffff) != (anInt1910 ^ 0xffffffff)
	    && aClass37_Sub3_Sub4_1896 != null) {
	    Class1.aClass37_Sub3_Sub2_59.method353(aClass37_Sub3_Sub4_1896);
	    aClass37_Sub3_Sub4_1896 = null;
	}
    }
    
    static {
	presse_child = null;
	aClass16_1912
	    = Class37_Sub2.create_rsstring("oberen Rand der Webseite ausw-=hlen)3");
	aClass16_1906 = Class37_Sub2.create_rsstring("<img=0>");
    }
}
