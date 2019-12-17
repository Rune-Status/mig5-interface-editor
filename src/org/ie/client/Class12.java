package org.ie.client;

/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class12
{
    public int[] anIntArray205;
    public int anInt206;
    public int anInt207 = 2;
    public int[] anIntArray208 = new int[2];
    public int anInt209;
    public int anInt210;
    public int anInt211;
    public int anInt212;
    public int anInt213;
    public int anInt214;
    public int anInt215;
    
    public void method90(ByteVector class37_sub11) {
	anInt207 = class37_sub11.getUnsignedByte();
	anIntArray208 = new int[anInt207];
	anIntArray205 = new int[anInt207];
	for (int i = 0; i < anInt207; i++) {
	    anIntArray208[i] = class37_sub11.getUnsignedShort();
	    anIntArray205[i] = class37_sub11.getUnsignedShort();
	}
    }
    
    public int method91(int i) {
	if (anInt215 >= anInt211) {
	    anInt213 = anIntArray205[anInt212++] << 15;
	    if (anInt212 >= anInt207)
		anInt212 = anInt207 - 1;
	    anInt211 = (int) ((double) anIntArray208[anInt212] / 65536.0
			      * (double) i);
	    if (anInt211 > anInt215)
		anInt214 = (((anIntArray205[anInt212] << 15) - anInt213)
			    / (anInt211 - anInt215));
	}
	anInt213 += anInt214;
	anInt215++;
	return anInt213 - anInt214 >> 15;
    }
    
    public void method92(ByteVector class37_sub11) {
	anInt209 = class37_sub11.getUnsignedByte();
	anInt206 = class37_sub11.getInt();
	anInt210 = class37_sub11.getInt();
	method90(class37_sub11);
    }
    
    public void method93() {
	anInt211 = 0;
	anInt212 = 0;
	anInt214 = 0;
	anInt213 = 0;
	anInt215 = 0;
    }
    
    public Class12() {
	anIntArray205 = new int[2];
	anIntArray208[0] = 0;
	anIntArray208[1] = 65535;
	anIntArray205[0] = 0;
	anIntArray205[1] = 65535;
    }
}
