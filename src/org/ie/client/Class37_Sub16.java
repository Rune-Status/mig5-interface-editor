package org.ie.client;

/* Class37_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub16 extends Node
{
    public int anInt2148;
    public static int anInt2149;
    public static RSString aClass16_2150;
    public static int anInt2151 = 0;
    public static Class15 aClass15_2152;
    public static int anInt2153;
    public static int anInt2154;
    public static Cache aClass65_2155;
    public int anInt2156;
    public static RSString aClass16_2157;
    
    public static void method1010(byte i) {
	aClass15_2152 = null;
	aClass65_2155 = null;
	aClass16_2157 = null;
	int i_0_ = 73 / ((32 - i) / 63);
	aClass16_2150 = null;
    }
    
    public static Class37_Sub4_Sub9_Sub1 method1011(int i, int i_1_, int i_2_,
						    Class15 class15) {
	anInt2149++;
	if (i_2_ < 96)
	    anInt2154 = -67;
	if (!Class37_Sub12.method1001(i, class15, (byte) 124, i_1_))
	    return null;
	return Deque.method1158(125);
    }
    
    public Class37_Sub16(int i, int i_3_) {
	anInt2156 = i_3_;
	anInt2148 = i;
    }
    
    static {
	aClass16_2150 = Class37_Sub2.create_rsstring("(U0a )2 in: ");
	anInt2154 = 0;
	aClass16_2157 = Class37_Sub2.create_rsstring("Abbrechen");
	aClass65_2155 = new Cache(64);
    }
}
