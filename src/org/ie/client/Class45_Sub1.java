package org.ie.client;

/* Class45_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class45_Sub1 extends Class45 implements MouseWheelListener
{
    public int anInt2292 = 0;
    
    public void method1096(int i, Component component) {
	component.removeMouseWheelListener(this);
	if (i != 17)
	    anInt2292 = -39;
    }
    
    public synchronized int method1098(int i) {
	int i_0_ = anInt2292;
	anInt2292 = i;
	return i_0_;
    }
    
    public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
	anInt2292 += mousewheelevent.getWheelRotation();
    }
    
    public void method1100(Component component, byte i) {
	component.addMouseWheelListener(this);
	if (i <= 91)
	    method1096(-124, null);
    }
}
