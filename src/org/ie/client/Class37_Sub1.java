package org.ie.client;

/* Class37_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub1 extends Node
{
    public static RSString aClass16_1796;
    public RSString aClass16_1797;
    public static RSString aClass16_1798;
    public static int anInt1799;
    public static int anInt1800;
    public static int anInt1801;
    public static RSString aClass16_1802;
    public static int[] anIntArray1803 = new int[256];
    public static RSString aClass16_1804;
    public static int anInt1805;
    public static int anInt1806;
    public static Class78[] aClass78Array1807;
    public static int anInt1808;
    public static Sprite[] aClass37_Sub4_Sub9_Sub3Array1809;
    
    public static boolean method328(int i, byte i_0_) {
	if (i_0_ != -10)
	    anIntArray1803 = null;
	anInt1801++;
	if ((i ^ 0xffffffff) != (-i & i ^ 0xffffffff))
	    return false;
	return true;
    }
    
    public static void method329(int i) {
	anInt1805++;
	Class37_Sub9_Sub35.aClass52_3566.method1127(5);
	if (i != -7242)
	    aClass16_1798 = null;
	for (int i_1_ = 0; i_1_ < 32; i_1_++)
	    Class37_Sub4_Sub5.aLongArray2602[i_1_] = 0L;
	for (int i_2_ = 0; i_2_ < 32; i_2_++)
	    Class37_Sub4_Sub2.aLongArray2528[i_2_] = 0L;
	Class52_Sub1.anInt2305 = 0;
    }
    
    public static void method330(Class15 class15, int i) {
	int i_3_ = -96 / ((27 - i) / 44);
	Class37_Sub3_Sub3.aClass15_2394 = class15;
	anInt1799++;
    }
    
    public static void method331(boolean bool) {
	aClass16_1802 = null;
	aClass37_Sub4_Sub9_Sub3Array1809 = null;
	aClass16_1804 = null;
	if (bool != true)
	    method329(83);
	aClass16_1796 = null;
	anIntArray1803 = null;
	aClass78Array1807 = null;
	aClass16_1798 = null;
    }
    
    static {
	aClass16_1798 = Class37_Sub2.create_rsstring("mapback");
	aClass16_1802 = Class37_Sub2.create_rsstring("Drop");
	aClass16_1796 = aClass16_1802;
	aClass16_1804
	    = Class37_Sub2.create_rsstring("Lade Texturen )2 ");
	for (int i = 0; i < 256; i++) {
	    int i_4_ = i;
	    for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -9; i_5_++) {
		if ((i_4_ & 0x1) != 1)
		    i_4_ >>>= 1;
		else
		    i_4_ = i_4_ >>> -799843487 ^ ~0x12477cdf;
	    }
	    anIntArray1803[i] = i_4_;
	}
	anInt1806 = 500;
	aClass78Array1807 = new Class78[50];
	anInt1808 = 0;
    }
}
