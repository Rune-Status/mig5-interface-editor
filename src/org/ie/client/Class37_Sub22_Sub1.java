package org.ie.client;

/* Class37_Sub22_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37_Sub22_Sub1 extends Class37_Sub22
{
    public int anInt3630;
    public boolean aBoolean3631;
    public byte[] aByteArray3632;
    public int anInt3633;
    public int anInt3634;
    
    public Class37_Sub22_Sub1 method1026(Class30 class30) {
	aByteArray3632 = class30.method275(-122, aByteArray3632);
	anInt3630 = class30.method274(anInt3630, -49);
	if (anInt3633 == anInt3634)
	    anInt3633 = anInt3634 = class30.method273(anInt3633, (byte) -17);
	else {
	    anInt3633 = class30.method273(anInt3633, (byte) -17);
	    anInt3634 = class30.method273(anInt3634, (byte) -17);
	    if (anInt3633 == anInt3634)
		anInt3633--;
	}
	return this;
    }
    
    public Class37_Sub22_Sub1(int i, byte[] is, int i_0_, int i_1_) {
	anInt3630 = i;
	aByteArray3632 = is;
	anInt3633 = i_0_;
	anInt3634 = i_1_;
    }
    
    public Class37_Sub22_Sub1(int i, byte[] is, int i_2_, int i_3_,
			      boolean bool) {
	anInt3630 = i;
	aByteArray3632 = is;
	anInt3633 = i_2_;
	anInt3634 = i_3_;
	aBoolean3631 = bool;
    }
}
