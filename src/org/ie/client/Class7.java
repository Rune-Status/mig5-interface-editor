package org.ie.client;

/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class7
{
    public ByteVector aClass37_Sub11_148;
    public long aLong149;
    public int anInt150;
    public static byte[] aByteArray151
	= { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    public int anInt152;
    public int[] anIntArray153;
    public int[] anIntArray154;
    public int[] anIntArray155;
    public int[] anIntArray156;
    
    public void method62(long l) {
	aLong149 = l;
	int i = anIntArray153.length;
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    anIntArray156[i_0_] = 0;
	    anIntArray154[i_0_] = 0;
	    aClass37_Sub11_148.pos = anIntArray155[i_0_];
	    method74(i_0_);
	    anIntArray153[i_0_] = aClass37_Sub11_148.pos;
	}
    }
    
    public long method63(int i) {
	return aLong149 + (long) i * (long) anInt152;
    }
    
    public int method64(int i) {
	int i_1_ = method73(i);
	return i_1_;
    }
    
    public void method65(byte[] is) {
	aClass37_Sub11_148.buf = is;
	aClass37_Sub11_148.pos = 10;
	int i = aClass37_Sub11_148.getUnsignedShort();
	anInt150 = aClass37_Sub11_148.getUnsignedShort();
	anInt152 = 500000;
	anIntArray155 = new int[i];
	int i_2_ = 0;
	while (i_2_ < i) {
	    int i_3_ = aClass37_Sub11_148.getInt();
	    int i_4_ = aClass37_Sub11_148.getInt();
	    if (i_3_ == 1297379947) {
		anIntArray155[i_2_] = aClass37_Sub11_148.pos;
		i_2_++;
	    }
	    aClass37_Sub11_148.pos += i_4_;
	}
	aLong149 = 0L;
	anIntArray153 = new int[i];
	for (int i_5_ = 0; i_5_ < i; i_5_++)
	    anIntArray153[i_5_] = anIntArray155[i_5_];
	anIntArray156 = new int[i];
	anIntArray154 = new int[i];
    }
    
    public int method66(int i, int i_6_) {
	if (i_6_ == 255) {
	    int i_7_ = aClass37_Sub11_148.getUnsignedByte();
	    int i_8_ = aClass37_Sub11_148.method974((byte) -89);
	    if (i_7_ == 47) {
		aClass37_Sub11_148.pos += i_8_;
		return 1;
	    }
	    if (i_7_ == 81) {
		int i_9_ = aClass37_Sub11_148.getTriByte(-26256544);
		i_8_ -= 3;
		int i_10_ = anIntArray156[i];
		aLong149 += (long) i_10_ * (long) (anInt152 - i_9_);
		anInt152 = i_9_;
		aClass37_Sub11_148.pos += i_8_;
		return 2;
	    }
	    aClass37_Sub11_148.pos += i_8_;
	    return 3;
	}
	byte i_11_ = aByteArray151[i_6_ - 128];
	int i_12_ = i_6_;
	if (i_11_ >= 1)
	    i_12_ |= aClass37_Sub11_148.getUnsignedByte() << 8;
	if (i_11_ >= 2)
	    i_12_ |= aClass37_Sub11_148.getUnsignedByte() << 16;
	return i_12_;
    }
    
    public void method67() {
	aClass37_Sub11_148.buf = null;
	anIntArray155 = null;
	anIntArray153 = null;
	anIntArray156 = null;
	anIntArray154 = null;
    }
    
    public boolean method68() {
	int i = anIntArray153.length;
	for (int i_13_ = 0; i_13_ < i; i_13_++) {
	    if (anIntArray153[i_13_] >= 0)
		return false;
	}
	return true;
    }
    
    public void method69(int i) {
	anIntArray153[i] = aClass37_Sub11_148.pos;
    }
    
    public static void method70() {
	aByteArray151 = null;
    }
    
    public void method71(int i) {
	aClass37_Sub11_148.pos = anIntArray153[i];
    }
    
    public int method72() {
	return anIntArray153.length;
    }
    
    public int method73(int i) {
	int i_14_
	    = aClass37_Sub11_148.buf[aClass37_Sub11_148.pos];
	if (i_14_ < 0) {
	    i_14_ &= 0xff;
	    anIntArray154[i] = i_14_;
	    aClass37_Sub11_148.pos++;
	} else
	    i_14_ = anIntArray154[i];
	if (i_14_ == 240 || i_14_ == 247) {
	    int i_15_ = aClass37_Sub11_148.method974((byte) -109);
	    if (i_14_ == 247 && i_15_ > 0) {
		int i_16_ = ((aClass37_Sub11_148.buf
			      [aClass37_Sub11_148.pos])
			     & 0xff);
		if (i_16_ >= 241 && i_16_ <= 243 || i_16_ == 246
		    || i_16_ == 248 || i_16_ >= 250 && i_16_ <= 252
		    || i_16_ == 254) {
		    aClass37_Sub11_148.pos++;
		    anIntArray154[i] = i_16_;
		    return method66(i, i_16_);
		}
	    }
	    aClass37_Sub11_148.pos += i_15_;
	    return 0;
	}
	return method66(i, i_14_);
    }
    
    public void method74(int i) {
	int i_17_ = aClass37_Sub11_148.method974((byte) -101);
	anIntArray156[i] += i_17_;
    }
    
    public void method75() {
	aClass37_Sub11_148.pos = -1;
    }
    
    public boolean method76() {
	if (aClass37_Sub11_148.buf == null)
	    return false;
	return true;
    }
    
    public int method77() {
	int i = anIntArray153.length;
	int i_18_ = -1;
	int i_19_ = 2147483647;
	for (int i_20_ = 0; i_20_ < i; i_20_++) {
	    if (anIntArray153[i_20_] >= 0 && anIntArray156[i_20_] < i_19_) {
		i_18_ = i_20_;
		i_19_ = anIntArray156[i_20_];
	    }
	}
	return i_18_;
    }
    
    public Class7() {
	aClass37_Sub11_148 = new ByteVector(null);
    }
    
    public Class7(byte[] is) {
	aClass37_Sub11_148 = new ByteVector(null);
	method65(is);
    }
}
