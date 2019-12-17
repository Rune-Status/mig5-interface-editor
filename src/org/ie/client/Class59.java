package org.ie.client;

/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class59
{
    public static int anInt1129 = 0;
    public static int anInt1130;
    public static Class37_Sub4_Sub9_Sub1[] aClass37_Sub4_Sub9_Sub1Array1131;
    public static int anInt1132;
    public static Sprite[] aClass37_Sub4_Sub9_Sub3Array1133;
    public static int anInt1134 = -1;
    public static Sprite aClass37_Sub4_Sub9_Sub3_1135;
    public static RSString aClass16_1136;
    public static int anInt1137;
    public static RSString aClass16_1138;
    
    public static void method1163(byte i) {
	aClass16_1136 = null;
	aClass16_1138 = null;
	aClass37_Sub4_Sub9_Sub1Array1131 = null;
	aClass37_Sub4_Sub9_Sub3Array1133 = null;
	aClass37_Sub4_Sub9_Sub3_1135 = null;
	if (i != 0)
	    method1164(-60, 116);
    }
    
    public static void method1164(int i, int i_0_) {
	anInt1137++;
	if (i != 32701)
	    aClass16_1136 = null;
	if (Class37_Sub7.anInt1904 == 0)
	    Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method384(i_0_,
								(byte) 119);
	else
	    Class37_Sub13.anInt2118 = i_0_;
    }
    
    static {
	anInt1132 = 0;
	aClass16_1136 = Class37_Sub2.create_rsstring("Spieler");
	aClass16_1138 = Class37_Sub2.create_rsstring("headicons_hint");
	anInt1130 = 0;
    }
}
