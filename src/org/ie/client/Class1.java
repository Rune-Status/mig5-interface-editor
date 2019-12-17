package org.ie.client;

/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1
{
    public static RSString aClass16_57;
    public static int anInt58;
    public static Class37_Sub3_Sub2 aClass37_Sub3_Sub2_59;
    public static int anInt60;
    public static RSInterface aClass18_61;
    public static int anInt62;
    public static byte[][][] aByteArrayArrayArray63 = new byte[4][104][104];
    public static int anInt64;
    public static int anInt65;
    public static RSString aClass16_66;
    public static volatile int currentClickY = 0;
    public static RSString aClass16_68;
    public static int[] anIntArray69;
    public static RSString aClass16_70;
    public static RSString aClass16_71;
    public static RSString aClass16_72;
    
    public static void method39(int i, int i_0_, int i_1_, int i_2_, int i_3_,
				int i_4_, int i_5_, int i_6_) {
	anInt58++;
	if (i_5_ >= -4)
	    anIntArray69 = null;
	if (InterfaceClickMask.loadExists(i_0_))
	    Class26.method258(i_3_, i, i_1_, i_2_, i_4_, -1, i_6_, Class37_Sub9_Sub29.mainInterfaceArray[i_0_]);
    }
    
    public static Class37_Sub15 method40(Class15 class15, int i, byte i_7_) {
	anInt64++;
	if (i_7_ >= -20)
	    anInt62 = -117;
	byte[] is = class15.method111(i, (byte) 94);
	if (is == null)
	    return null;
	return new Class37_Sub15(is);
    }
    
    public static void method41(int i) {
	aClass16_72 = null;
	aClass16_70 = null;
	aClass16_71 = null;
	anIntArray69 = null;
	aByteArrayArrayArray63 = null;
	aClass37_Sub3_Sub2_59 = null;
	if (i != -1788)
	    aClass16_71 = null;
	aClass16_66 = null;
	aClass16_57 = null;
	aClass18_61 = null;
	aClass16_68 = null;
    }
    
    public static void method42(byte i) {
	if (i >= -91)
	    anIntArray69 = null;
	for (Class37_Sub7 class37_sub7
		 = (Class37_Sub7) NodeSub.aClass58_1857.getFirst();
	     class37_sub7 != null;
	     class37_sub7 = (Class37_Sub7) NodeSub.aClass58_1857
					       .getNext()) {
	    if (class37_sub7.aClass37_Sub4_Sub11_1901 != null)
		class37_sub7.method744(-870);
	}
	anInt60++;
    }
    
    static {
	aClass16_66
	    = Class37_Sub2.create_rsstring("Ein kostenloses Spielkonto erstellen)3");
	anInt62 = 0;
	aClass16_70 = Class37_Sub2.create_rsstring("hel");
	aClass16_68 = Class37_Sub2.create_rsstring("Loaded wordpack");
	aClass16_57 = aClass16_68;
	aClass16_72
	    = Class37_Sub2.create_rsstring("Ung-Ultige Session)2ID)3");
	aClass16_71 = Class37_Sub2.create_rsstring("leuchten1:");
    }
}
