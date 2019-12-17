package org.ie.client;

/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class68
{
    public static int anInt1321;
    public static Class20[] aClass20Array1322 = new Class20[4];
    public static RSString aClass16_1323;
    public static int[] anIntArray1324 = new int[25];
    public static int anInt1325;
    public static int anInt1326;
    public static RSString aClass16_1327
	= Class37_Sub2.create_rsstring("Welcome to RuneScape");
    public static int anInt1328;
    public static int[][] anIntArrayArray1329;
    
    public static void method1244(int i, int i_0_, int i_1_,
				  Class37_Sub4_Sub15 class37_sub4_sub15,
				  boolean bool) {
	anInt1326++;
	if (Class37_Sub9_Sub13.anInt3134 < 400) {
	    if (class37_sub4_sub15.anIntArray2824 != null)
		class37_sub4_sub15 = class37_sub4_sub15.method719((byte) 89);
	    if (class37_sub4_sub15 != null && bool == false
		&& class37_sub4_sub15.aBoolean2811) {
		RSString rSString = class37_sub4_sub15.aClass16_2852;
		if ((class37_sub4_sub15.anInt2819 ^ 0xffffffff) != -1)
		    rSString
			= (Class37_Sub9_Sub27.method881
			   ((new RSString[]
			 { rSString,
			   (Class52.method1126
			(-3, class37_sub4_sub15.anInt2819,
			 (Class37_Sub23
			  .aClass37_Sub4_Sub7_Sub1_Sub2_2234
			  .anInt3978))),
			   Class37_Sub9_Sub24.aClass16_3370,
			   Class79.aClass16_1482,
			   Class37_Sub9_Sub24.method870((class37_sub4_sub15
						     .anInt2819),
						    (byte) -114),
			   Class25.aClass16_644 })));
		if ((Class37_Sub14.anInt2122 ^ 0xffffffff) != -2) {
		    if (Class37_Sub4_Sub5.aBoolean2595) {
			if ((Class37_Sub4_Sub12.anInt2759 & 0x2 ^ 0xffffffff)
			    == -3) {
			    Class37_Sub9_Sub3.method774
				(6, i_1_, Class37_Sub9_Sub1.aClass16_2912,
				 i_0_, true,
				 (Class37_Sub9_Sub27.method881
				  (new RSString[] { Class60.aClass16_1142,
							Class79.aClass16_1478,
							rSString })),
				 i);
			    Node.anInt816++;
			}
		    } else {
			RSString[] class16s
			    = class37_sub4_sub15.aClass16Array2861;
			Class37_Sub4_Sub16.anInt2866++;
			if (Class32.aBoolean744)
			    class16s = Class37_Sub18.method1017(class16s, 5);
			if (class16s != null) {
			    for (int i_2_ = 4; (i_2_ ^ 0xffffffff) <= -1;
				 i_2_--) {
				if (class16s[i_2_] != null
				    && !(class16s[i_2_].method159
					 (RSInterface.aClass16_330, (byte) 89))) {
				    Class86.anInt1582++;
				    int i_3_ = 0;
				    if (i_2_ == 0)
					i_3_ = 51;
				    if (i_2_ == 1)
					i_3_ = 26;
				    if ((i_2_ ^ 0xffffffff) == -3)
					i_3_ = 1;
				    if (i_2_ == 3)
					i_3_ = 9;
				    if (i_2_ == 4)
					i_3_ = 8;
				    Class37_Sub9_Sub3.method774
					(i_3_, i_1_, class16s[i_2_], i_0_,
					 true,
					 (Class37_Sub9_Sub27.method881
					  ((new RSString[]
					    { Class37_Sub11_Sub1.aClass16_3627,
					      rSString }))),
					 i);
				}
			    }
			}
			if (class16s != null) {
			    for (int i_4_ = 4; i_4_ >= 0; i_4_--) {
				if (class16s[i_4_] != null
				    && (class16s[i_4_].method159
					(RSInterface.aClass16_330, (byte) 53))) {
				    int i_5_ = 0;
				    if ((class37_sub4_sub15.anInt2819
					 ^ 0xffffffff)
					< ((Class37_Sub23
					    .aClass37_Sub4_Sub7_Sub1_Sub2_2234
					    .anInt3978)
					   ^ 0xffffffff))
					i_5_ = 2000;
				    Class37_Sub9_Sub2.anInt2937++;
				    int i_6_ = 0;
				    if ((i_4_ ^ 0xffffffff) == -1)
					i_6_ = 51 + i_5_;
				    if (i_4_ == 1)
					i_6_ = i_5_ + 26;
				    if ((i_4_ ^ 0xffffffff) == -3)
					i_6_ = i_5_ + 1;
				    if ((i_4_ ^ 0xffffffff) == -4)
					i_6_ = i_5_ + 9;
				    if ((i_4_ ^ 0xffffffff) == -5)
					i_6_ = i_5_ + 8;
				    Class37_Sub9_Sub3.method774
					(i_6_, i_1_, class16s[i_4_], i_0_,
					 !bool,
					 (Class37_Sub9_Sub27.method881
					  ((new RSString[]
					    { Class37_Sub11_Sub1.aClass16_3627,
					      rSString }))),
					 i);
				}
			    }
			}
			Class37_Sub9_Sub3.method774
			    (1007, i_1_, Class37_Sub4_Sub7_Sub7.aClass16_3844,
			     i_0_, true,
			     (Class37_Sub9_Sub27.method881
			      ((new RSString[]
				     { Class37_Sub11_Sub1.aClass16_3627,
				       rSString }))),
			     i);
		    }
		} else {
		    Class37_Sub9_Sub3.method774
			(33, i_1_, Class37_Sub9_Sub27.aClass16_3404, i_0_,
			 true,
			 Class37_Sub9_Sub27.method881((new RSString[]
			   { Class64.aClass16_1218,
			 Class79.aClass16_1478,
			 rSString })),
			 i);
		    Class37_Sub9_Sub17.anInt3214++;
		}
	    }
	}
    }
    
    public static int method1245(byte i, int i_7_) {
	anInt1325++;
	int i_8_ = 0;
	if (i_7_ < 0 || (i_7_ ^ 0xffffffff) <= -65537) {
	    i_8_ += 16;
	    i_7_ >>>= 16;
	}
	if (i_7_ >= 256) {
	    i_8_ += 8;
	    i_7_ >>>= 8;
	}
	if ((i_7_ ^ 0xffffffff) <= -17) {
	    i_7_ >>>= 4;
	    i_8_ += 4;
	}
	if (i != 24)
	    return 30;
	if (i_7_ >= 4) {
	    i_7_ >>>= 2;
	    i_8_ += 2;
	}
	if ((i_7_ ^ 0xffffffff) <= -2) {
	    i_8_++;
	    i_7_ >>>= 1;
	}
	return i_7_ + i_8_;
    }
    
    public static void method1246(byte i) {
	aClass20Array1322 = null;
	anIntArrayArray1329 = null;
	aClass16_1323 = null;
	if (i == 124) {
	    aClass16_1327 = null;
	    anIntArray1324 = null;
	}
    }
    
    public abstract byte[] method1247(int i);
    
    public static RSString method1248(ByteVector class37_sub11, boolean bool,
				     int i) {
	anInt1328++;
	try {
	    if (bool != false)
		anIntArray1324 = null;
	    RSString rSString = new RSString();
	    rSString.anInt1650 = class37_sub11.method961(255);
	    if (i < rSString.anInt1650)
		rSString.anInt1650 = i;
	    rSString.aByteArray1669 = new byte[rSString.anInt1650];
	    class37_sub11.pos
		+= (Class15_Sub1.aClass14_1746.method103
		    (rSString.aByteArray1669, class37_sub11.pos, -128,
		     class37_sub11.buf, rSString.anInt1650, 0));
	    return rSString;
	} catch (Exception exception) {
	    return Class37_Sub4_Sub7_Sub5.aClass16_3806;
	}
    }
    
    public abstract void method1249(byte[] is, byte i);
    
    static {
	aClass16_1323 = aClass16_1327;
    }
}
