package org.ie.client;

/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11
{
    public int anInt202;
    public int anInt203;
    public Class5[] aClass5Array204;
    
    public Class37_Sub22_Sub1 method86() {
	byte[] is = method87();
	return new Class37_Sub22_Sub1(22050, is, 22050 * anInt202 / 1000,
				      22050 * anInt203 / 1000);
    }
    
    public byte[] method87() {
	int i = 0;
	for (int i_0_ = 0; i_0_ < 10; i_0_++) {
	    if (aClass5Array204[i_0_] != null
		&& (aClass5Array204[i_0_].anInt111
		    + aClass5Array204[i_0_].anInt112) > i)
		i = (aClass5Array204[i_0_].anInt111
		     + aClass5Array204[i_0_].anInt112);
	}
	if (i == 0)
	    return new byte[0];
	int i_1_ = 22050 * i / 1000;
	byte[] is = new byte[i_1_];
	for (int i_2_ = 0; i_2_ < 10; i_2_++) {
	    if (aClass5Array204[i_2_] != null) {
		int i_3_ = aClass5Array204[i_2_].anInt111 * 22050 / 1000;
		int i_4_ = aClass5Array204[i_2_].anInt112 * 22050 / 1000;
		int[] is_5_
		    = aClass5Array204[i_2_]
			  .method56(i_3_, aClass5Array204[i_2_].anInt111);
		for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
		    int i_7_ = is[i_6_ + i_4_] + (is_5_[i_6_] >> 8);
		    if ((i_7_ + 128 & ~0xff) != 0)
			i_7_ = i_7_ >> 31 ^ 0x7f;
		    is[i_6_ + i_4_] = (byte) i_7_;
		}
	    }
	}
	return is;
    }
    
    public Class11(ByteVector class37_sub11) {
	aClass5Array204 = new Class5[10];
	for (int i = 0; i < 10; i++) {
	    int i_8_ = class37_sub11.getUnsignedByte();
	    if (i_8_ != 0) {
		class37_sub11.pos--;
		aClass5Array204[i] = new Class5();
		aClass5Array204[i].method57(class37_sub11);
	    }
	}
	anInt202 = class37_sub11.getUnsignedShort();
	anInt203 = class37_sub11.getUnsignedShort();
    }
    
    public static Class11 method88(Class15 class15, int i, int i_9_) {
	byte[] is = class15.getFile(i, i_9_);
	if (is == null)
	    return null;
	return new Class11(new ByteVector(is));
    }
    
    public int method89() {
	int i = 9999999;
	for (int i_10_ = 0; i_10_ < 10; i_10_++) {
	    if (aClass5Array204[i_10_] != null
		&& aClass5Array204[i_10_].anInt112 / 20 < i)
		i = aClass5Array204[i_10_].anInt112 / 20;
	}
	if (anInt202 < anInt203 && anInt202 / 20 < i)
	    i = anInt202 / 20;
	if (i == 9999999 || i == 0)
	    return 0;
	for (int i_11_ = 0; i_11_ < 10; i_11_++) {
	    if (aClass5Array204[i_11_] != null)
		aClass5Array204[i_11_].anInt112 -= i * 20;
	}
	if (anInt202 < anInt203) {
	    anInt202 -= i * 20;
	    anInt203 -= i * 20;
	}
	return i;
    }
    
    public Class11() {
	aClass5Array204 = new Class5[10];
    }
}
