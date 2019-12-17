package org.ie.client;

/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class2
{
    public static int anInt73;
    public static int anInt74;
    public static int anInt75 = 0;
    public static int anInt76;
    public static Class47 aClass47_77;
    public static RSString aClass16_78;
    public static RSString aClass16_79;
    public static RSString aClass16_80;
    public static RSString aClass16_81
	= (Class37_Sub2.create_rsstring
	   ("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q"));
    public static int anInt82;
    public static RSString aClass16_83;
    
    public static void method43(int i, RSString rSString, int i_0_) {
	anInt74++;
	if (i_0_ > -26)
	    aClass16_80 = null;
	boolean bool = false;
	RSString class16_1_ = rSString.method167(-1).method164(70);
	for (int i_2_ = 0; i_2_ < Class19.anInt487; i_2_++) {
	    Class37_Sub4_Sub7_Sub1_Sub2 class37_sub4_sub7_sub1_sub2
		= (Class75.aClass37_Sub4_Sub7_Sub1_Sub2Array1414
		   [Class26.anIntArray657[i_2_]]);
	    if (class37_sub4_sub7_sub1_sub2 != null
		&& class37_sub4_sub7_sub1_sub2.aClass16_3993 != null
		&& class37_sub4_sub7_sub1_sub2.aClass16_3993
		       .method159(class16_1_, (byte) 108)) {
		NodeSub.method434
		    ((Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234
		      .anIntArray3669[0]),
		     0, class37_sub4_sub7_sub1_sub2.anIntArray3651[0],
		     (Class37_Sub23.aClass37_Sub4_Sub7_Sub1_Sub2_2234
		      .anIntArray3651[0]),
		     false, 2, 0, 1, 0,
		     class37_sub4_sub7_sub1_sub2.anIntArray3669[0], 0, 1, true);
		bool = true;
		if (i != 1) {
		    if ((i ^ 0xffffffff) == -5) {
			Class37_Sub9_Sub13.anInt3127++;
			Class42.aClass37_Sub11_Sub1_936.method989(247);
			Class42.aClass37_Sub11_Sub1_936
			    .method945(Class26.anIntArray657[i_2_]);
		    } else if ((i ^ 0xffffffff) != -7) {
			if (i == 7) {
			    Class42.aClass37_Sub11_Sub1_936
				.method989(211);
			    Class42.aClass37_Sub11_Sub1_936
				.method957(true, Class26.anIntArray657[i_2_]);
			    Class37_Sub9_Sub4.anInt2960++;
			}
		    } else {
			Class42.aClass37_Sub11_Sub1_936.method989(244);
			Class62.anInt1174++;
			Class42.aClass37_Sub11_Sub1_936
			    .method945(Class26.anIntArray657[i_2_]);
		    }
		} else {
		    MouseHandler.anInt184++;
		    Class42.aClass37_Sub11_Sub1_936.method989(96);
		    Class42.aClass37_Sub11_Sub1_936
			.method957(true, Class26.anIntArray657[i_2_]);
		}
		break;
	    }
	}
	if (!bool)
	    Class37_Sub4_Sub7_Sub1_Sub1.method505
		(Class37_Sub9_Sub8.aClass16_3045, 0,
		 Class37_Sub9_Sub27.method881((new RSString[]
		   { Class37_Sub2.aClass16_1821,
		 class16_1_ })));
    }
    
    public static void method44(int i) {
	aClass16_80 = null;
	aClass16_81 = null;
	aClass16_83 = null;
	aClass16_79 = null;
	aClass47_77 = null;
	aClass16_78 = null;
	if (i != 0)
	    method44(81);
    }
    
    static {
	aClass16_78
	    = Class37_Sub2.create_rsstring(" zuerst von Ihrer Freunde)2Liste(Q");
	anInt82 = 0;
	aClass16_80 = Class37_Sub2.create_rsstring("(Y<)4col>");
	aClass16_79
	    = Class37_Sub2.create_rsstring("Loading wordpack )2 ");
	aClass16_83 = aClass16_79;
    }
}
