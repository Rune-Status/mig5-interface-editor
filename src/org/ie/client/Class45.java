package org.ie.client;

/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public abstract class Class45
{
    public static int anInt970 = -8 + (int) (17.0 * Math.random());
    public static int anInt971;
    public static RSString aClass16_972;
    public static int anInt973;
    public static int anInt974;
    public static int anInt975;
    public static int anInt976;
    public static int anInt977 = 0;
    public static RSString aClass16_978;
    
    public static Sprite method1095
	(boolean bool, Class15 class15, RSString rSString, RSString class16_0_) {
	try {
	    if (bool != false)
		aClass16_972 = null;
	    anInt975++;
	    int i = class15.method123((byte) 32, class16_0_);
	    int i_1_ = class15.method128(rSString, -128, i);
	    return Class6.method61(i, i_1_, class15);
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516
		      (runtimeexception,
		       ("n.F(" + bool + ','
			+ (class15 != null ? "{...}" : "null") + ','
			+ (rSString != null ? "{...}" : "null") + ','
			+ (class16_0_ != null ? "{...}" : "null") + ')'));
	}
    }
    
    public abstract void method1096(int i, Component component);
    
    public static Class37_Sub4_Sub16 method1097(byte i, int i_2_) {
	if (i < 126)
	    aClass16_972 = null;
	anInt973++;
	Class37_Sub4_Sub16 class37_sub4_sub16
	    = ((Class37_Sub4_Sub16)
	       Class37_Sub4_Sub18.aClass65_2891.get((long) i_2_));
	if (class37_sub4_sub16 != null)
	    return class37_sub4_sub16;
	class37_sub4_sub16
	    = Canvas_Sub1.method38(Class37_Sub9_Sub14.aClass15_3145, i_2_,
				   (byte) 125, false, Class6.aClass15_147);
	if (class37_sub4_sub16 != null)
	    Class37_Sub4_Sub18.aClass65_2891.put(class37_sub4_sub16, (long) i_2_);
	return class37_sub4_sub16;
    }
    
    public abstract int method1098(int i);
    
    public static int method1099(int i, int i_3_, byte i_4_) {
	if (i_4_ != -74)
	    return -48;
	int i_5_ = i >> -215034849 & -1 + i_3_;
	anInt971++;
	return i_5_ + ((i >>> 832847167) + i) % i_3_;
    }
    
    public abstract void method1100(Component component, byte i);
    
    public static void method1101(int i) {
	aClass16_972 = null;
	if (i == 0)
	    aClass16_978 = null;
    }
    
    static {
	anInt974 = 0;
	aClass16_978
	    = (Class37_Sub2.create_rsstring
	       ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V "));
	aClass16_972 = aClass16_978;
    }
}
