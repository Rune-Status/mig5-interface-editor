package org.ie.client;

/* Class37_Sub4_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub14 extends NodeSub
{
    public static RSString aClass16_2802
	= Class37_Sub2.create_rsstring("<col=ffffff>");
    public static int anInt2803;
    public static RSString aClass16_2804;
    public static Class15 aClass15_2805;
    public static RSString aClass16_2806
	= (Class37_Sub2.create_rsstring
	   ("Clientscript error )2 check log for details"));
    public static int anInt2807;
    public int anInt2808 = 0;
    public static int[] anIntArray2809 = new int[500];
    public static RSString aClass16_2810
	= Class37_Sub2.create_rsstring("Please contact customer support)3");
    
    public void method709(byte i, ByteVector class37_sub11) {
	for (;;) {
	    int i_0_ = class37_sub11.getUnsignedByte();
	    if ((i_0_ ^ 0xffffffff) == -1)
		break;
	    method710(class37_sub11, i_0_, -60);
	}
	if (i >= 102)
	    anInt2803++;
    }
    
    public void method710(ByteVector class37_sub11, int i, int i_1_) {
	if ((i ^ 0xffffffff) == -6)
	    anInt2808 = class37_sub11.getUnsignedShort();
	anInt2807++;
	int i_2_ = 105 / ((76 - i_1_) / 46);
    }
    
    public static void method711(int i) {
	anIntArray2809 = null;
	aClass16_2810 = null;
	aClass16_2804 = null;
	if (i == 500) {
	    aClass16_2806 = null;
	    aClass16_2802 = null;
	    aClass15_2805 = null;
	}
    }
    
    static {
	aClass16_2804 = aClass16_2810;
    }
}
