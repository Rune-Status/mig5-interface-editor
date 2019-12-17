package org.ie.client;

/* Class37_Sub9_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub9_Sub35 extends Class37_Sub9
{
    public static RSString aClass16_3560;
    public static int[] anIntArray3561 = { 16, 32, 64, 128 };
    public static RSString aClass16_3562;
    public static RSString aClass16_3563;
    public static int anInt3564;
    public static int anInt3565;
    public static Class52 aClass52_3566;
    public static RSString aClass16_3567;
    public static RSString aClass16_3568;
    public static int anInt3569;
    
    public static RSInterface method914(int i, int i_1_) {
	RSInterface rSInterface = Class37_Sub9_Sub14.getInterface(i);
	if (i_1_ == -1)
	    return rSInterface;
	if (rSInterface == null || rSInterface.aClass18Array450 == null
	    || ((rSInterface.aClass18Array450.length ^ 0xffffffff)
		>= (i_1_ ^ 0xffffffff)))
	    return null;
	return rSInterface.aClass18Array450[i_1_];
    }
    
    public int[] method761(int i, int i_3_) {
	if (i > -125)
	    anIntArray3561 = null;
	anInt3565++;
	int[] is = aClass38_1966.method1049(i_3_, true);
	if (aClass38_1966.aBoolean850)
	    Class53.method1134(is, 0, Class32.anInt743,
			       Class37_Sub4_Sub16.anIntArray2871[i_3_]);
	return is;
    }
    
    public Class37_Sub9_Sub35() {
	super(0, true);
    }
    
    public static void method915(int i) {
	aClass16_3563 = null;
	aClass52_3566 = null;
	anIntArray3561 = null;
	aClass16_3560 = null;
	aClass16_3562 = null;
	aClass16_3567 = null;
	if (i != -10453)
	    aClass16_3562 = null;
	aClass16_3568 = null;
    }
    
    static {
	aClass16_3560
	    = Class37_Sub2.create_rsstring("as it was used to break our rules)3");
	aClass16_3562
	    = (Class37_Sub2.create_rsstring
	       ("You have only just left another world)3"));
	anInt3564 = -1;
	aClass16_3563 = aClass16_3560;
	aClass16_3568 = aClass16_3562;
	aClass16_3567
	    = Class37_Sub2.create_rsstring(" weitere Optionen");
    }
}
