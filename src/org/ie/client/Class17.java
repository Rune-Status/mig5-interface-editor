package org.ie.client;

/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class17
{
    public static int anInt296;
    public int[] anIntArray297;
    public Class37_Sub9 aClass37_Sub9_298;
    public static int anInt299;
    public static Deque aClass58_300 = new Deque();
    public Class37_Sub9 aClass37_Sub9_301;
    public static int anInt302;
    public static int anInt303;
    public static int anInt304;
    public static int anInt305;
    public static int anInt306;
    public static int[] anIntArray307 = new int[99];
    public static RSString aClass16_308;
    public int[] anIntArray309;
    public static RSString aClass16_310;
    public static RSString aClass16_311;
    public static Cache aClass65_312;
    public static RSString aClass16_313;
    public Class37_Sub9[] aClass37_Sub9Array314;
    public static Class37_Sub4_Sub9_Sub2_Sub1 aClass37_Sub4_Sub9_Sub2_Sub1_315;
    public static Hashtable aClass13_316;
    public static RSString aClass16_317;
    
    public static void method182(boolean bool) {
	anInt304++;
	do {
	    try {
		if (Class37_Sub7.anInt1904 == 1) {
		    int i = Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635
				.method371((byte) 111);
		    if ((i ^ 0xffffffff) < -1
			&& Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635
			       .method376(81)) {
			i -= Class37_Sub5.anInt1877;
			if ((i ^ 0xffffffff) > -1)
			    i = 0;
			Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635
			    .method384(i, (byte) 82);
			break;
		    }
		    Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method363(127);
		    Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method357(-1);
		    Class19.aClass73_489 = null;
		    Class37_Sub4_Sub11.aClass37_Sub19_2735 = null;
		    if (Class84.aClass15_1534 == null)
			Class37_Sub7.anInt1904 = 0;
		    else
			Class37_Sub7.anInt1904 = 2;
		}
		if (bool == false)
		    break;
		method188(null, null, 67, 40, 36);
	    } catch (Exception exception) {
		exception.printStackTrace();
		Class37_Sub4_Sub7.aClass37_Sub3_Sub3_2635.method363(127);
		Class19.aClass73_489 = null;
		Class37_Sub4_Sub11.aClass37_Sub19_2735 = null;
		Class84.aClass15_1534 = null;
		Class37_Sub7.anInt1904 = 0;
		break;
	    }
	    break;
	} while (false);
    }
    
    public int[] method183(int i, float f, int i_0_, boolean bool,
			   Class15 class15, boolean bool_1_,
			   Interface3 interface3) {
	try {
	    Class37_Sub4_Sub15.aClass15_2859 = class15;
	    int[] is = new int[i_0_ * i];
	    Class37_Sub9_Sub19.anInterface3_3265 = interface3;
	    anInt303++;
	    Class37_Sub9_Sub10.method803(i, -98, i_0_);
	    for (int i_2_ = 0; i_2_ < aClass37_Sub9Array314.length; i_2_++)
		aClass37_Sub9Array314[i_2_].method751(i, i_0_, -10);
	    if (bool_1_ != true)
		return null;
	    int i_3_ = 0;
	    int i_4_;
	    int i_5_;
	    int i_6_;
	    if (bool) {
		i_6_ = -1;
		i_4_ = -1;
		i_5_ = i_0_ + -1;
	    } else {
		i_4_ = 1;
		i_5_ = 0;
		i_6_ = i_0_;
	    }
	    for (int i_7_ = 0; (i ^ 0xffffffff) < (i_7_ ^ 0xffffffff);
		 i_7_++) {
		int[] is_8_;
		int[] is_9_;
		int[] is_10_;
		if (aClass37_Sub9_301.aBoolean1943) {
		    int[] is_11_ = aClass37_Sub9_301.method761(-127, i_7_);
		    is_10_ = is_11_;
		    is_8_ = is_11_;
		    is_9_ = is_11_;
		} else {
		    int[][] is_12_
			= aClass37_Sub9_301.method759((byte) 127, i_7_);
		    is_8_ = is_12_[1];
		    is_9_ = is_12_[2];
		    is_10_ = is_12_[0];
		}
		for (int i_13_ = i_5_;
		     (i_6_ ^ 0xffffffff) != (i_13_ ^ 0xffffffff);
		     i_13_ += i_4_) {
		    int i_14_ = is_10_[i_13_] >> -542541692;
		    int i_15_ = is_9_[i_13_] >> -1425764476;
		    if ((i_15_ ^ 0xffffffff) < -256)
			i_15_ = 255;
		    int i_16_ = is_8_[i_13_] >> -282237532;
		    if (i_16_ > 255)
			i_16_ = 255;
		    if (i_14_ > 255)
			i_14_ = 255;
		    if (i_16_ < 0)
			i_16_ = 0;
		    if ((i_14_ ^ 0xffffffff) > -1)
			i_14_ = 0;
		    if ((i_15_ ^ 0xffffffff) > -1)
			i_15_ = 0;
		    is[i_3_++]
			= Rasterizer.method671(((i_16_
							     << 971350120)
							    + ((i_14_
								<< 2130121872)
							       - -i_15_)),
							   f);
		}
	    }
	    for (int i_17_ = 0;
		 ((i_17_ ^ 0xffffffff)
		  > (aClass37_Sub9Array314.length ^ 0xffffffff));
		 i_17_++)
		aClass37_Sub9Array314[i_17_].method755((byte) 113);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("ed.D(" + i + ',' + f + ','
						    + i_0_ + ',' + bool + ','
						    + (class15 != null
						       ? "{...}" : "null")
						    + ',' + bool_1_ + ','
						    + (interface3 != null
						       ? "{...}" : "null")
						    + ')'));
	}
    }
    
    public static void method184(boolean bool, int i, int i_18_, int i_19_,
				 Class15_Sub1 class15_sub1, byte i_20_,
				 int i_21_) {
	anInt306++;
	long l = (long) ((i_21_ << -1350430544) + i);
	Class37_Sub4_Sub13 class37_sub4_sub13
	    = (Class37_Sub4_Sub13) Class6.aClass13_139.get(l);
	if (class37_sub4_sub13 == null) {
	    class37_sub4_sub13
		= (Class37_Sub4_Sub13) aClass13_316.get(l);
	    if (i_19_ != -1350430544)
		anIntArray307 = null;
	    if (class37_sub4_sub13 == null) {
		class37_sub4_sub13
		    = (Class37_Sub4_Sub13) Class37_Sub4_Sub18.aClass13_2905
					       .get(l);
		if (class37_sub4_sub13 != null) {
		    if (bool) {
			class37_sub4_sub13.unlinkSub();
			Class6.aClass13_139.put(class37_sub4_sub13,
						      l);
			Class37_Sub4_Sub7_Sub1_Sub1.anInt3953++;
			Class37_Sub9_Sub26.anInt3396--;
		    }
		} else {
		    if (!bool) {
			class37_sub4_sub13 = ((Class37_Sub4_Sub13)
					      Class37_Sub9_Sub20
						  .aClass13_3297
						  .get(l));
			if (class37_sub4_sub13 != null)
			    return;
		    }
		    class37_sub4_sub13 = new Class37_Sub4_Sub13();
		    class37_sub4_sub13.anInt2790 = i_18_;
		    class37_sub4_sub13.aClass15_Sub1_2801 = class15_sub1;
		    class37_sub4_sub13.aByte2788 = i_20_;
		    if (bool) {
			Class6.aClass13_139.put(class37_sub4_sub13,
						      l);
			Class37_Sub4_Sub7_Sub1_Sub1.anInt3953++;
		    } else {
			Class4.aClass77_92.insertBack(class37_sub4_sub13);
			Class37_Sub4_Sub18.aClass13_2905
			    .put(class37_sub4_sub13, l);
			Class37_Sub9_Sub26.anInt3396++;
		    }
		}
	    }
	}
    }
    
    public static InventoryDef list(int i_22_) {
	anInt302++;
	InventoryDef class37_sub4_sub17
	    = ((InventoryDef)
	       Class52_Sub1.aClass65_2299.get((long) i_22_));
	if (class37_sub4_sub17 != null)
	    return class37_sub4_sub17;
	byte[] is = Class37_Sub16.aClass15_2152.getFile(5, i_22_);
	class37_sub4_sub17 = new InventoryDef();
	if (is != null)
	    class37_sub4_sub17.method727(new ByteVector(is), false);
	Class52_Sub1.aClass65_2299.put(class37_sub4_sub17, (long) i_22_);
	return class37_sub4_sub17;
    }
    
    public boolean method186(Interface3 interface3, Class15 class15, byte i) {
	try {
	    anInt296++;
	    if (i > -67)
		method188(null, null, 6, 119, 52);
	    for (int i_23_ = 0; anIntArray297.length > i_23_; i_23_++) {
		if (!class15.method112(anIntArray297[i_23_], -17104))
		    return false;
	    }
	    for (int i_24_ = 0;
		 (anIntArray309.length ^ 0xffffffff) < (i_24_ ^ 0xffffffff);
		 i_24_++) {
		if (!interface3.method10(anIntArray309[i_24_], 44))
		    return false;
	    }
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("ed.E("
						    + (interface3 != null
						       ? "{...}" : "null")
						    + ','
						    + (class15 != null
						       ? "{...}" : "null")
						    + ',' + i + ')'));
	}
    }
    
    public static void method187(boolean bool) {
	aClass37_Sub4_Sub9_Sub2_Sub1_315 = null;
	if (bool == false) {
	    aClass16_308 = null;
	    anIntArray307 = null;
	    aClass13_316 = null;
	    aClass16_310 = null;
	    aClass16_313 = null;
	    aClass16_317 = null;
	    aClass65_312 = null;
	    aClass16_311 = null;
	    aClass58_300 = null;
	}
    }
    
    public static Class24 method188(Component component, Signlink signlink,
				    int i, int i_25_, int i_26_) {
	try {
	    anInt299++;
	    if ((Class33.anInt765 ^ 0xffffffff) == -1)
		throw new IllegalStateException();
	    if ((i_26_ ^ 0xffffffff) > i_25_ || i_26_ >= 2)
		throw new IllegalArgumentException();
	    if ((i ^ 0xffffffff) > -257)
		i = 256;
	    try {
		Class24 class24
		    = (Class24) Class.forName("Class24_Sub2").newInstance();
		class24.anInt624 = i;
		class24.anIntArray606
		    = new int[256 * (!Class37_Sub4_Sub10.aBoolean2690 ? 1
				     : 2)];
		class24.method237(component);
		class24.anInt623 = (~0x3ff & i) - -1024;
		if ((class24.anInt623 ^ 0xffffffff) < -16385)
		    class24.anInt623 = 16384;
		class24.method246(class24.anInt623);
		if ((ClientScriptDef.anInt2622 ^ 0xffffffff) < -1
		    && Class2.aClass47_77 == null) {
		    Class2.aClass47_77 = new Class47();
		    Class2.aClass47_77.aClass51_991 = signlink;
		    signlink.method1119(Class2.aClass47_77,
				       ClientScriptDef.anInt2622, (byte) 65);
		}
		if (Class2.aClass47_77 != null) {
		    if (Class2.aClass47_77.aClass24Array996[i_26_] != null)
			throw new IllegalArgumentException();
		    Class2.aClass47_77.aClass24Array996[i_26_] = class24;
		}
		return class24;
	    } catch (Throwable throwable) {
		try {
		    Class24_Sub1 class24_sub1
			= new Class24_Sub1(signlink, i_26_);
		    class24_sub1.anIntArray606
			= (new int
			   [(!Class37_Sub4_Sub10.aBoolean2690 ? 1 : 2) * 256]);
		    class24_sub1.anInt624 = i;
		    class24_sub1.method237(component);
		    class24_sub1.anInt623 = 16384;
		    class24_sub1.method246(class24_sub1.anInt623);
		    if (ClientScriptDef.anInt2622 > 0
			&& Class2.aClass47_77 == null) {
			Class2.aClass47_77 = new Class47();
			Class2.aClass47_77.aClass51_991 = signlink;
			signlink.method1119(Class2.aClass47_77,
					   ClientScriptDef.anInt2622,
					   (byte) 65);
		    }
		    if (Class2.aClass47_77 != null) {
			if (Class2.aClass47_77.aClass24Array996[i_26_] != null)
			    throw new IllegalArgumentException();
			Class2.aClass47_77.aClass24Array996[i_26_]
			    = class24_sub1;
		    }
		    return class24_sub1;
		} catch (Throwable throwable_27_) {
		    return new Class24();
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("ed.G("
						    + (component != null
						       ? "{...}" : "null")
						    + ','
						    + (signlink != null
						       ? "{...}" : "null")
						    + ',' + i + ',' + i_25_
						    + ',' + i_26_ + ')'));
	}
    }
    
    public Class17() {
	anIntArray297 = new int[0];
	anIntArray309 = new int[0];
	aClass37_Sub9_301 = new Class37_Sub9_Sub14();
	aClass37_Sub9_298 = new Class37_Sub9_Sub14();
	aClass37_Sub9Array314
	    = new Class37_Sub9[] { aClass37_Sub9_301, aClass37_Sub9_298 };
    }
    
    public Class17(ByteVector class37_sub11) {
	int i = class37_sub11.getUnsignedByte();
	Hashtable class13 = new Hashtable(64);
	Hashtable class13_28_ = new Hashtable(64);
	Hashtable class13_29_ = new Hashtable(64);
	aClass37_Sub9Array314 = new Class37_Sub9[i];
	int[][] is = new int[i][];
	for (int i_30_ = 0; i > i_30_; i_30_++) {
	    Class37_Sub9 class37_sub9
		= Class37_Sub9_Sub3.method772(class37_sub11, true);
	    int i_31_ = class37_sub9.method757(75);
	    int i_32_ = class37_sub9.method758(-30563);
	    if (i_31_ >= 0) {
		int i_33_ = i_31_;
		if ((i_33_ ^ 0xffffffff) <= -1
		    && class13_28_.get((long) i_33_) == null)
		    class13_28_.put(new InterfaceClickMask(i_33_), (long) i_33_);
	    }
	    if ((i_32_ ^ 0xffffffff) <= -1) {
		int i_34_ = i_32_;
		if (i_34_ >= 0
		    && class13_29_.get((long) i_34_) == null)
		    class13_29_.put(new InterfaceClickMask(i_34_), (long) i_34_);
	    }
	    int i_35_ = class37_sub9.aClass37_Sub9Array1947.length;
	    is[i_30_] = new int[i_35_];
	    for (int i_36_ = 0; i_35_ > i_36_; i_36_++)
		is[i_30_][i_36_] = class37_sub11.getUnsignedByte();
	    class13.put(class37_sub9, (long) class37_sub9.anInt1955);
	    aClass37_Sub9Array314[i_30_] = class37_sub9;
	}
	for (int i_37_ = 0; (i ^ 0xffffffff) < (i_37_ ^ 0xffffffff); i_37_++) {
	    Class37_Sub9 class37_sub9 = aClass37_Sub9Array314[i_37_];
	    int i_38_ = class37_sub9.aClass37_Sub9Array1947.length;
	    for (int i_39_ = 0; i_38_ > i_39_; i_39_++) {
		Class37_Sub9 class37_sub9_40_
		    = ((Class37_Sub9)
		       class13.get((long) is[i_37_][i_39_]));
		class37_sub9.aClass37_Sub9Array1947[i_39_] = class37_sub9_40_;
	    }
	    is[i_37_] = null;
	}
	aClass37_Sub9_301
	    = ((Class37_Sub9)
	       class13.get((long) class37_sub11.getUnsignedByte()));
	aClass37_Sub9_298
	    = ((Class37_Sub9)
	       class13.get((long) class37_sub11.getUnsignedByte()));
	Object object = null;
	Object object_41_ = null;
	anIntArray297 = new int[class13_28_.method97()];
	anIntArray309 = new int[class13_29_.method97()];
	Node[] class37s = new Node[class13_28_.method97()];
	Node[] class37s_42_ = new Node[class13_29_.method97()];
	class13_28_.method96(class37s);
	Object object_43_ = null;
	class13_29_.method96(class37s_42_);
	for (int i_44_ = 0;
	     (class37s.length ^ 0xffffffff) < (i_44_ ^ 0xffffffff); i_44_++)
	    anIntArray297[i_44_] = ((InterfaceClickMask) class37s[i_44_]).click_mask;
	Object object_45_ = null;
	for (int i_46_ = 0; class37s_42_.length > i_46_; i_46_++)
	    anIntArray309[i_46_]
		= ((InterfaceClickMask) class37s_42_[i_46_]).click_mask;
    }
    
    static {
	int i = 0;
	for (int i_47_ = 0; i_47_ < 99; i_47_++) {
	    int i_48_ = i_47_ + 1;
	    int i_49_ = (int) ((double) i_48_
			       + Math.pow(2.0, (double) i_48_ / 7.0) * 300.0);
	    i += i_49_;
	    anIntArray307[i_47_] = i / 4;
	}
	aClass16_308 = Class37_Sub2.create_rsstring("glow2:");
	aClass16_310 = aClass16_308;
	aClass16_311 = aClass16_308;
	aClass16_313 = Class37_Sub2.create_rsstring("::qa_op_test");
	aClass65_312 = new Cache(50);
	aClass13_316 = new Hashtable(32);
	aClass16_317 = Class37_Sub2.create_rsstring("");
    }
}
