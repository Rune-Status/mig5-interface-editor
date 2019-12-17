package org.ie.client;

/* Class37_Sub4_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub4_Sub18 extends NodeSub
{
    public int anInt2885;
    public static RSString aClass16_2886;
    public int anInt2887;
    public static int anInt2888;
    public short[] aShortArray2889;
    public short[] aShortArray2890;
    public static Cache aClass65_2891;
    public static int anInt2892;
    public int anInt2893;
    public static int anInt2894;
    public int anInt2895 = 128;
    public static RSString aClass16_2896
	= Class37_Sub2.create_rsstring("Der Anmelde)2Server ist offline)3");
    public int anInt2897;
    public static int anInt2898;
    public static RSString aClass16_2899;
    public int anInt2900;
    public int anInt2901;
    public int anInt2902;
    public short[] aShortArray2903;
    public short[] aShortArray2904;
    public static Hashtable aClass13_2905;
    public static RSString aClass16_2906;
    public static Class15 aClass15_2907;
    public static RSString aClass16_2908;
    public static RSString aClass16_2909;
    public static RSString aClass16_2910;
    
    public static void method729(int i) {
	if (i != -6)
	    aClass16_2909 = null;
	aClass16_2896 = null;
	aClass13_2905 = null;
	aClass16_2906 = null;
	aClass16_2908 = null;
	aClass16_2909 = null;
	aClass16_2899 = null;
	aClass16_2910 = null;
	aClass65_2891 = null;
	aClass15_2907 = null;
	aClass16_2886 = null;
    }
    
    public static Class37_Sub4_Sub14 method730(int i, int i_0_) {
	anInt2894++;
	Class37_Sub4_Sub14 class37_sub4_sub14
	    = ((Class37_Sub4_Sub14)
	       Class37_Sub9_Sub4.aClass65_2973.get((long) i_0_));
	if (class37_sub4_sub14 != null)
	    return class37_sub4_sub14;
	byte[] is = Class37_Sub9_Sub24.aClass15_3364.getFile(16, i_0_);
	class37_sub4_sub14 = new Class37_Sub4_Sub14();
	if (i != -9094)
	    aClass16_2896 = null;
	if (is != null)
	    class37_sub4_sub14.method709((byte) 114, new ByteVector(is));
	Class37_Sub9_Sub4.aClass65_2973.put(class37_sub4_sub14, (long) i_0_);
	return class37_sub4_sub14;
    }
    
    public Class37_Sub4_Sub7_Sub6 method731(int i, boolean bool) {
	anInt2888++;
	Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6
	    = ((Class37_Sub4_Sub7_Sub6)
	       Class37_Sub9_Sub31.aClass65_3489.get((long) anInt2902));
	if (class37_sub4_sub7_sub6 == null) {
	    Class37_Sub4_Sub7_Sub4 class37_sub4_sub7_sub4
		= Class37_Sub4_Sub7_Sub4.method529(Class73.aClass15_1389,
						   anInt2901, 0);
	    if (class37_sub4_sub7_sub4 == null)
		return null;
	    if (aShortArray2904 != null) {
		for (int i_1_ = 0; ((aShortArray2904.length ^ 0xffffffff)
				    < (i_1_ ^ 0xffffffff)); i_1_++)
		    class37_sub4_sub7_sub4.method535(aShortArray2904[i_1_],
						     aShortArray2903[i_1_]);
	    }
	    if (aShortArray2890 != null) {
		for (int i_2_ = 0; i_2_ < aShortArray2890.length; i_2_++)
		    class37_sub4_sub7_sub4.method525(aShortArray2890[i_2_],
						     aShortArray2889[i_2_]);
	    }
	    class37_sub4_sub7_sub6
		= class37_sub4_sub7_sub4.method518(anInt2900 + 64,
						   anInt2887 + 850, -30, -50,
						   -30, true, true);
	    Class37_Sub9_Sub31.aClass65_3489
		.put(class37_sub4_sub7_sub6, (long) anInt2902);
	}
	Class37_Sub4_Sub7_Sub6 class37_sub4_sub7_sub6_3_;
	if (anInt2897 != -1 && i != -1)
	    class37_sub4_sub7_sub6_3_
		= Class37_Sub9_Sub22.method861(anInt2897)
		      .method695(class37_sub4_sub7_sub6, i, true);
	else
	    class37_sub4_sub7_sub6_3_ = class37_sub4_sub7_sub6.method542(true);
	if (anInt2895 != 128 || (anInt2893 ^ 0xffffffff) != -129)
	    class37_sub4_sub7_sub6_3_.method552(anInt2895, anInt2893,
						anInt2895);
	if (bool != true)
	    return null;
	if (anInt2885 != 0) {
	    if (anInt2885 == 90)
		class37_sub4_sub7_sub6_3_.method553();
	    if ((anInt2885 ^ 0xffffffff) == -181) {
		class37_sub4_sub7_sub6_3_.method553();
		class37_sub4_sub7_sub6_3_.method553();
	    }
	    if ((anInt2885 ^ 0xffffffff) == -271) {
		class37_sub4_sub7_sub6_3_.method553();
		class37_sub4_sub7_sub6_3_.method553();
		class37_sub4_sub7_sub6_3_.method553();
	    }
	}
	return class37_sub4_sub7_sub6_3_;
    }
    
    public void method732(ByteVector class37_sub11, int i) {
	for (;;) {
	    int i_4_ = class37_sub11.getUnsignedByte();
	    if ((i_4_ ^ 0xffffffff) == -1)
		break;
	    method733((byte) -71, i_4_, class37_sub11);
	}
	anInt2892++;
	if (i != -181)
	    aClass16_2906 = null;
    }
    
    public void method733(byte i, int i_5_, ByteVector class37_sub11) {
	int i_6_ = -83 % ((28 - i) / 58);
	if (i_5_ == 1)
	    anInt2901 = class37_sub11.getUnsignedShort();
	else if ((i_5_ ^ 0xffffffff) == -3)
	    anInt2897 = class37_sub11.getUnsignedShort();
	else if ((i_5_ ^ 0xffffffff) != -5) {
	    if ((i_5_ ^ 0xffffffff) == -6)
		anInt2893 = class37_sub11.getUnsignedShort();
	    else if ((i_5_ ^ 0xffffffff) == -7)
		anInt2885 = class37_sub11.getUnsignedShort();
	    else if (i_5_ != 7) {
		if (i_5_ != 8) {
		    if (i_5_ != 40) {
			if (i_5_ == 41) {
			    int i_7_ = class37_sub11.getUnsignedByte();
			    aShortArray2890 = new short[i_7_];
			    aShortArray2889 = new short[i_7_];
			    for (int i_8_ = 0;
				 (i_7_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff);
				 i_8_++) {
				aShortArray2890[i_8_]
				    = (short) class37_sub11.getUnsignedShort();
				aShortArray2889[i_8_]
				    = (short) class37_sub11.getUnsignedShort();
			    }
			}
		    } else {
			int i_9_ = class37_sub11.getUnsignedByte();
			aShortArray2904 = new short[i_9_];
			aShortArray2903 = new short[i_9_];
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
			    aShortArray2904[i_10_]
				= (short) class37_sub11.getUnsignedShort();
			    aShortArray2903[i_10_]
				= (short) class37_sub11.getUnsignedShort();
			}
		    }
		} else
		    anInt2887 = class37_sub11.getUnsignedByte();
	    } else
		anInt2900 = class37_sub11.getUnsignedByte();
	} else
	    anInt2895 = class37_sub11.getUnsignedShort();
	anInt2898++;
    }
    
    public Class37_Sub4_Sub18() {
	anInt2887 = 0;
	anInt2885 = 0;
	anInt2897 = -1;
	anInt2900 = 0;
	anInt2893 = 128;
    }
    
    static {
	aClass16_2886 = Class37_Sub2.create_rsstring("Existing User");
	aClass16_2899 = aClass16_2886;
	aClass65_2891 = new Cache(100);
	aClass13_2905 = new Hashtable(4096);
	aClass16_2910
	    = (Class37_Sub2.create_rsstring
	       ("Diese Betatest)2Welt ist nur f-Ur eingeladene"));
	aClass16_2909 = Class37_Sub2.create_rsstring("::clientdrop");
	aClass16_2906
	    = Class37_Sub2.create_rsstring("Loading )2 please wait)3");
	aClass16_2908 = aClass16_2906;
    }
}
