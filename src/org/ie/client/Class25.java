package org.ie.client;

/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class25
{
    public static int anInt635;
    public static RSString aClass16_636
	= Class37_Sub2.create_rsstring("<col=ffffff>");
    public static int anInt637;
    public static RSString aClass16_638;
    public static int anInt639;
    public static RSString aClass16_640
	= (Class37_Sub2.create_rsstring
	   ("Too many incorrect logins from your address)3"));
    public static RSString aClass16_641;
    public static Deque aClass58_642;
    public static int anInt643;
    public static RSString aClass16_644;
    public static RSString aClass16_645;
    public static byte[][] aByteArrayArray646;
    public static RSString aClass16_647;
    
    public static void method253(ByteVector class37_sub11, int i) {
	int i_0_ = 64 % ((-62 - i) / 36);
	anInt643++;
	byte[] is = new byte[24];
	if (Class71.aClass42_1363 != null) {
	    try {
		Class71.aClass42_1363.method1081(0L, 0);
		Class71.aClass42_1363.method1085(is, (byte) 118);
		int i_1_;
		for (i_1_ = 0; (i_1_ ^ 0xffffffff) > -25; i_1_++) {
		    if ((is[i_1_] ^ 0xffffffff) != -1)
			break;
		}
		if (i_1_ >= 24)
		    throw new IOException();
	    } catch (Exception exception) {
		for (int i_2_ = 0; i_2_ < 24; i_2_++)
		    is[i_2_] = (byte) -1;
	    }
	}
	class37_sub11.method954(24, 0, 4, is);
    }
    
    public static void method254(int i) {
	if (i > -55)
	    method253(null, 56);
	aClass16_638 = null;
	aClass16_640 = null;
	aClass16_636 = null;
	aClass16_645 = null;
	aClass16_644 = null;
	aByteArrayArray646 = null;
	aClass58_642 = null;
	aClass16_647 = null;
	aClass16_641 = null;
    }
    
    public static Class37_Sub4_Sub8 method255(boolean bool, int i) {
	anInt635++;
	Class37_Sub4_Sub8 class37_sub4_sub8
	    = ((Class37_Sub4_Sub8)
	       Class64.aClass65_1210.get((long) i));
	if (class37_sub4_sub8 != null)
	    return class37_sub4_sub8;
	byte[] is = Class52.aClass15_1054.getFile(4, i);
	class37_sub4_sub8 = new Class37_Sub4_Sub8();
	if (is != null)
	    class37_sub4_sub8.method575(-16, new ByteVector(is), i);
	class37_sub4_sub8.method571(0);
	Class64.aClass65_1210.put(class37_sub4_sub8, (long) i);
	if (bool != true)
	    aClass16_644 = null;
	return class37_sub4_sub8;
    }
    
    static {
	aClass16_638 = Class37_Sub2.create_rsstring("(U0a )2 via: ");
	aClass16_641 = aClass16_640;
	anInt637 = 0;
	aClass58_642 = new Deque();
	aClass16_645
	    = Class37_Sub2.create_rsstring("nicht hergestellt werden)3");
	aByteArrayArray646 = new byte[250][];
	aClass16_647 = Class37_Sub2.create_rsstring("<col=ffff00>*V");
	aClass16_644 = Class37_Sub2.create_rsstring("(Y");
    }
}
