package org.ie.client;

/* Class24_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class24_Sub2 extends Class24
{
    public SourceDataLine aSourceDataLine1766;
    public int anInt1767;
    public byte[] aByteArray1768;
    public AudioFormat anAudioFormat1769;
    public static Class aClass1770;
    
    public void method239() {
	int i = 256;
	if (Class37_Sub4_Sub10.aBoolean2690)
	    i <<= 1;
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    int i_1_ = anIntArray606[i_0_];
	    if ((i_1_ + 8388608 & ~0xffffff) != 0)
		i_1_ = 0x7fffff ^ i_1_ >> 31;
	    aByteArray1768[i_0_ * 2] = (byte) (i_1_ >> 8);
	    aByteArray1768[i_0_ * 2 + 1] = (byte) (i_1_ >> 16);
	}
	aSourceDataLine1766.write(aByteArray1768, 0, i << 1);
    }
    
    public int method241() {
	return anInt1767 - (aSourceDataLine1766.available()
			    >> (Class37_Sub4_Sub10.aBoolean2690 ? 2 : 1));
    }
    
    public void method240() {
	if (aSourceDataLine1766 != null) {
	    aSourceDataLine1766.close();
	    aSourceDataLine1766 = null;
	}
    }
    
    public void method237(Component component) {
	anAudioFormat1769
	    = new AudioFormat((float) Class33.anInt765, 16,
			      !Class37_Sub4_Sub10.aBoolean2690 ? 1 : 2, true,
			      false);
	aByteArray1768
	    = new byte[256 << (!Class37_Sub4_Sub10.aBoolean2690 ? 1 : 2)];
    }
    
    public void method236() {
	aSourceDataLine1766.flush();
    }
    
    public void method246(int i) throws LineUnavailableException {
	try {
	    DataLine.Info info
		= (new DataLine.Info
		   ((aClass1770 == null
		     ? (aClass1770
			= method252("javax.sound.sampled.SourceDataLine"))
		     : aClass1770),
		    anAudioFormat1769,
		    i << (Class37_Sub4_Sub10.aBoolean2690 ? 2 : 1)));
	    aSourceDataLine1766 = (SourceDataLine) AudioSystem.getLine(info);
	    aSourceDataLine1766.open();
	    aSourceDataLine1766.start();
	    anInt1767 = i;
	} catch (LineUnavailableException lineunavailableexception) {
	    if ((Class37_Sub9_Sub7.method792(1152557602, i) ^ 0xffffffff)
		!= -2)
		method246(Class37_Sub4_Sub3.method466(i, -696398748));
	    else {
		aSourceDataLine1766 = null;
		throw lineunavailableexception;
	    }
	}
    }
    
    public static Class method252(String string) {
	Class var_class;
	try {
	    var_class = Class.forName(string);
	} catch (ClassNotFoundException classnotfoundexception) {
	    return null;
	}
	return var_class;
    }
}
