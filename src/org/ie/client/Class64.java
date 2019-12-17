package org.ie.client;

/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class64
{
    public static RSString aClass16_1209;
    public static Cache aClass65_1210;
    public static int anInt1211;
    public static Sprite aClass37_Sub4_Sub9_Sub3_1212;
    public static int anInt1213 = 0;
    public static int anInt1214;
    public static int anInt1215;
    public static boolean aBoolean1216;
    public static int[][][] anIntArrayArrayArray1217;
    public static RSString aClass16_1218;
    
    public static void method1175(Class19 class19, int i, boolean bool) {
	if (Class43.aClass19_950 != null) {
	    try {
		Class43.aClass19_950.method209((byte) -128);
	    } catch (Exception exception) {
		/* empty */
	    }
	    Class43.aClass19_950 = null;
	}
	Class43.aClass19_950 = class19;
	NodeSub.method437(151, bool);
	Class37_Sub9.anInt1956 = i;
	Class49.aClass37_Sub11_1006 = null;
	Class37_Sub9_Sub17.aClass37_Sub11_3224.pos = 0;
	Class60.aClass37_Sub4_Sub13_1152 = null;
	anInt1211++;
	for (;;) {
	    Class37_Sub4_Sub13 class37_sub4_sub13
		= (Class37_Sub4_Sub13) Class17.aClass13_316.getFirst();
	    if (class37_sub4_sub13 == null)
		break;
	    Class6.aClass13_139.put(class37_sub4_sub13, class37_sub4_sub13.hash);
	    Class37_Sub9_Sub12.anInt3121--;
	    Class37_Sub4_Sub7_Sub1_Sub1.anInt3953++;
	}
	for (;;) {
	    Class37_Sub4_Sub13 class37_sub4_sub13
		= ((Class37_Sub4_Sub13)
		   Class37_Sub9_Sub20.aClass13_3297.getFirst());
	    if (class37_sub4_sub13 == null)
		break;
	    Class4.aClass77_92.insertFront(class37_sub4_sub13);
	    Class37_Sub4_Sub18.aClass13_2905.put(class37_sub4_sub13,
						       (class37_sub4_sub13
							.hash));
	    Class37_Sub9_Sub26.anInt3396++;
	    Class45.anInt974--;
	}
	if (Class75.aByte1409 != 0) {
	    try {
		ByteVector class37_sub11 = new ByteVector(4);
		class37_sub11.method964(124, 4);
		class37_sub11.method964(126, Class75.aByte1409);
		class37_sub11.method965(0);
		Class43.aClass19_950
		    .method204(0, (byte) 126, class37_sub11.buf, 4);
	    } catch (java.io.IOException ioexception) {
		try {
		    Class43.aClass19_950.method209((byte) -128);
		} catch (Exception exception) {
		    /* empty */
		}
		Class43.aClass19_950 = null;
		Class37_Sub4_Sub12.anInt2785++;
	    }
	}
	Class59.anInt1129 = 0;
	Class60.aLong1144 = Class71.method1263();
    }
    
    public static void method1176(byte i) {
	if (i == 25) {
	    anIntArrayArrayArray1217 = null;
	    aClass37_Sub4_Sub9_Sub3_1212 = null;
	    aClass16_1218 = null;
	    aClass16_1209 = null;
	    aClass65_1210 = null;
	}
    }
    
    static {
	aClass16_1209
	    = Class37_Sub2.create_rsstring("Bitte versuchen Sie es in ");
	aBoolean1216 = false;
	aClass16_1218 = null;
	anIntArrayArrayArray1217 = new int[4][105][105];
	aClass65_1210 = new Cache(64);
    }
}
