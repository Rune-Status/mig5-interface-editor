package org.ie.client;

/* Class24_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class24_Sub1 extends Class24
{
    public static Interface2 anInterface2_1764;
    public int anInt1765;
    
    public void method246(int i) throws Exception {
	if (i > 32768)
	    throw new IllegalArgumentException();
	anInterface2_1764.method5(-31114, anInt1765, i);
    }
    
    public void method240() {
	anInterface2_1764.method3(anInt1765, (byte) 126);
    }
    
    public void method239() {
	anInterface2_1764.method2(anInt1765, anIntArray606);
    }
    
    public static void method251() {
	anInterface2_1764 = null;
    }
    
    public void method237(Component component) throws Exception {
	anInterface2_1764.method4(component, Class37_Sub4_Sub10.aBoolean2690,
				  (byte) -99, Class33.anInt765);
    }
    
    public int method241() {
	return anInterface2_1764.method6((byte) 123, anInt1765);
    }
    
    public void method236() {
	anInterface2_1764.method1(anInt1765, true);
    }
    
    public Class24_Sub1(Signlink signlink, int i) {
	anInterface2_1764 = signlink.method1116(-122);
	anInt1765 = i;
    }
}
