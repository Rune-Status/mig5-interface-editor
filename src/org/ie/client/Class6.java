package org.ie.client;

/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.util.zip.Inflater;

public class Class6
{
    public static RSString aClass16_134;
    public static RSString aClass16_135
	= Class37_Sub2.create_rsstring(" more options");
    public static int anInt136;
    public static int anInt137;
    public Inflater anInflater138;
    public static Hashtable aClass13_139;
    public static RSString aClass16_140;
    public static RSString aClass16_141;
    public static int anInt142;
    public static RSString aClass16_143 = aClass16_135;
    public static RSString aClass16_144;
    public static RSString aClass16_145;
    public static int anInt146;
    public static Class15 aClass15_147;
    
    public void method58(byte i, byte[] is, ByteVector class37_sub11) {
	try {
	    anInt136++;
	    if ((class37_sub11.buf[class37_sub11.pos]
		 ^ 0xffffffff) != -32
		|| (class37_sub11.buf[class37_sub11.pos - -1]
		    ^ 0xffffffff) != 116)
		throw new RuntimeException("Invalid GZIP header!");
	    if (anInflater138 == null)
		anInflater138 = new Inflater(true);
	    try {
		anInflater138.setInput(class37_sub11.buf,
				       class37_sub11.pos + 10,
				       -18 + (-class37_sub11.pos
					      + (class37_sub11
						 .buf).length));
		anInflater138.inflate(is);
		if (i != 126)
		    aClass16_135 = null;
	    } catch (Exception exception) {
		anInflater138.reset();
		throw new RuntimeException("Invalid GZIP compressed data!");
	    }
	    anInflater138.reset();
	} catch (RuntimeException runtimeexception) {
	    throw Class37_Sub4_Sub7_Sub3.method516(runtimeexception,
						   ("bh.C(" + i + ','
						    + (is != null ? "{...}"
						       : "null")
						    + ','
						    + (class37_sub11 != null
						       ? "{...}" : "null")
						    + ')'));
	}
    }
    
    public static void method59(int i) {
	if (i == 1000000) {
	    aClass16_144 = null;
	    aClass16_140 = null;
	    aClass16_143 = null;
	    aClass16_145 = null;
	    aClass15_147 = null;
	    aClass16_135 = null;
	    aClass13_139 = null;
	    aClass16_141 = null;
	    aClass16_134 = null;
	}
    }
    
    public Class6() {
	this(-1, 1000000, 1000000);
    }
    
    public static void method60(int i, Component component) {
	component.removeMouseListener(Cache.mouseHandler);
	if (i != 593)
	    aClass16_141 = null;
	component.removeMouseMotionListener(Cache.mouseHandler);
	anInt142++;
	component.removeFocusListener(Cache.mouseHandler);
	Class71.currentMousePress = 0;
    }
    
    public Class6(int i, int i_0_, int i_1_) {
	/* empty */
    }
    
    public static Sprite method61(int i_2_, int i_3_, Class15 class15) {
	if (!Class37_Sub12.method1001(i_3_, class15, (byte) 124, i_2_))
	    return null;
	return Class33.method299(-115);
    }
    
    static {
	aClass16_141 = Class37_Sub2.create_rsstring("scroll:");
	aClass16_134 = aClass16_141;
	aClass16_140 = aClass16_141;
	aClass13_139 = new Hashtable(4096);
	aClass16_144 = Class37_Sub2.create_rsstring("Ung-Ultiges Anmelde)2Paket)3");
	aClass16_145 = Class37_Sub2.create_rsstring("Versteckt");
    }
}
