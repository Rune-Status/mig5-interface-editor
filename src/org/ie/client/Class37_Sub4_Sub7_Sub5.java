package org.ie.client;

/* Class37_Sub4_Sub7_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub7_Sub5 extends Class37_Sub4_Sub7
{
    public int anInt3804;
    public static Cache aClass65_3805;
    public static RSString aClass16_3806;
    public int anInt3807;
    public static RSString aClass16_3808;
    public static int anInt3809;
    public static RSString aClass16_3810
	= Class37_Sub2.create_rsstring("b12_full");
    public int anInt3811;
    public int anInt3812;
    public static RSString aClass16_3813;
    public static RSString aClass16_3814
	= Class37_Sub2.create_rsstring("Loaded update list");
    public static int anInt3815;
    public int anInt3816;
    public int anInt3817;
    public int anInt3818;
    public int anInt3819;
    public Class37_Sub4_Sub12 aClass37_Sub4_Sub12_3820;
    public static RSString aClass16_3821;
    
    public static Class15_Sub1 method540(boolean bool, boolean bool_0_, int i,
					 byte i_1_, boolean bool_2_) {
    	bool = false;
    	bool_0_ = false;
    	bool_2_ = false;
    	Class69 class69 = null;
    	if (Deque.aClass42_1109 != null)
    		class69 = new Class69(i, Deque.aClass42_1109,
    				Class37_Sub4_Sub7_Sub1.aClass42Array3699[i],
    				1000000);
		Class15_Sub1 cw = new Class15_Sub1(class69, Class10.aClass69_199, i, bool_2_,
				bool, bool_0_);
		cw.method139((byte) 0, 10, 10);
		return cw;
    }
    
    public Class37_Sub4_Sub7_Sub6 method493(boolean bool) {
	if (aClass37_Sub4_Sub12_3820 != null) {
	    int i = -anInt3811 + Class37_Sub7.loopCycle;
	    if ((i ^ 0xffffffff) < -101
		&& aClass37_Sub4_Sub12_3820.anInt2777 > 0)
		i = 100;
	    while ((i ^ 0xffffffff)
		   < (aClass37_Sub4_Sub12_3820.anIntArray2780[anInt3804]
		      ^ 0xffffffff)) {
		i -= aClass37_Sub4_Sub12_3820.anIntArray2780[anInt3804];
		anInt3804++;
		if (aClass37_Sub4_Sub12_3820.anIntArray2761.length
		    <= anInt3804) {
		    anInt3804 -= aClass37_Sub4_Sub12_3820.anInt2777;
		    if ((anInt3804 ^ 0xffffffff) > -1
			|| ((anInt3804 ^ 0xffffffff)
			    <= (aClass37_Sub4_Sub12_3820.anIntArray2761.length
				^ 0xffffffff))) {
			aClass37_Sub4_Sub12_3820 = null;
			break;
		    }
		}
	    }
	    anInt3811 = -i + Class37_Sub7.loopCycle;
	}
	Class37_Sub4_Sub11 class37_sub4_sub11
	    = Class37_Sub9_Sub8.method794(anInt3807, 28067);
	if (class37_sub4_sub11.anIntArray2702 != null)
	    class37_sub4_sub11 = class37_sub4_sub11.method681((byte) 96);
	anInt3809++;
	if (class37_sub4_sub11 == null)
	    return null;
	int i;
	int i_3_;
	if (anInt3816 != 1 && anInt3816 != 3) {
	    i_3_ = class37_sub4_sub11.anInt2731;
	    i = class37_sub4_sub11.anInt2743;
	} else {
	    i = class37_sub4_sub11.anInt2731;
	    i_3_ = class37_sub4_sub11.anInt2743;
	}
	int i_4_ = anInt3817 + (i_3_ >> 539166945);
	int i_5_ = (1 + i_3_ >> -381608063) + anInt3817;
	int i_6_ = (i - -1 >> 922229921) + anInt3812;
	int i_7_ = (i >> -1289991935) + anInt3812;
	int[][] is = Class64.anIntArrayArrayArray1217[anInt3819];
	if (bool != true)
	    return null;
	int i_8_ = (is[i_4_][i_6_] + (is[i_5_][i_7_]
				      + (is[i_4_][i_7_] + is[i_5_][i_6_]))
		    >> -1001973470);
	int i_9_ = (anInt3817 << 1081967879) - -(i_3_ << -321869690);
	int i_10_ = (i << -1159911866) + (anInt3812 << 1156935911);
	return class37_sub4_sub11.method682(i_10_, i_9_, anInt3818, anInt3804,
					    is, i_8_, 52,
					    aClass37_Sub4_Sub12_3820,
					    anInt3816);
    }
    
    public static void method541(int i) {
	aClass16_3821 = null;
	if (i != -1159911866)
	    aClass16_3806 = null;
	aClass16_3813 = null;
	aClass16_3814 = null;
	aClass16_3808 = null;
	aClass65_3805 = null;
	aClass16_3806 = null;
	aClass16_3810 = null;
    }
    
    public Class37_Sub4_Sub7_Sub5
	(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_,
	 int i_16_, boolean bool, Class37_Sub4_Sub7 class37_sub4_sub7) {
	anInt3818 = i_11_;
	anInt3817 = i_14_;
	anInt3812 = i_15_;
	anInt3807 = i;
	anInt3816 = i_12_;
	anInt3819 = i_13_;
	if (i_16_ != -1) {
	    aClass37_Sub4_Sub12_3820
		= Class37_Sub9_Sub22.method861(i_16_);
	    anInt3804 = 0;
	    anInt3811 = -1 + Class37_Sub7.loopCycle;
	    if ((aClass37_Sub4_Sub12_3820.anInt2760 ^ 0xffffffff) == -1
		&& class37_sub4_sub7 != null
		&& class37_sub4_sub7 instanceof Class37_Sub4_Sub7_Sub5) {
		Class37_Sub4_Sub7_Sub5 class37_sub4_sub7_sub5_17_
		    = (Class37_Sub4_Sub7_Sub5) class37_sub4_sub7;
		if (class37_sub4_sub7_sub5_17_.aClass37_Sub4_Sub12_3820
		    == aClass37_Sub4_Sub12_3820) {
		    anInt3804 = class37_sub4_sub7_sub5_17_.anInt3804;
		    anInt3811 = class37_sub4_sub7_sub5_17_.anInt3811;
		    return;
		}
	    }
	    if (bool
		&& (aClass37_Sub4_Sub12_3820.anInt2777 ^ 0xffffffff) != 0) {
		anInt3804 = (int) ((double) (aClass37_Sub4_Sub12_3820
					     .anIntArray2761).length
				   * Math.random());
		anInt3811 -= (int) ((double) (aClass37_Sub4_Sub12_3820
					      .anIntArray2780[anInt3804])
				    * Math.random());
	    }
	}
    }
    
    static {
	aClass16_3806 = Class37_Sub2.create_rsstring("Cabbage");
	aClass16_3808 = Class37_Sub2.create_rsstring("null");
	aClass16_3821 = aClass16_3814;
	aClass16_3813
	    = Class37_Sub2.create_rsstring("Die Verbindung konnte");
	aClass65_3805 = new Cache(64);
    }
}
