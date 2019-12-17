package org.ie.client;

/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardHandler implements KeyListener, FocusListener
{
    public static int anInt558 = -1;
    public static RSString aClass16_559
	= Class37_Sub2.create_rsstring("Zu viele Verbindungen von Ihrer Adresse)3");
    public static RSString aClass16_560;
    public static RSString aClass16_561
	= Class37_Sub2.create_rsstring("Fps:");
    public static int anInt562;
    public static int anInt563;
    public static int anInt564;
    public static int anInt565;
    public static int anInt566;
    public static int anInt567;
    public static Class32 aClass32_568;
    
    public synchronized void keyPressed(KeyEvent keyevent) {
    	if (Class37_Sub9_Sub13.keyboardHandler != null) {
    		Class37_Sub13.anInt2120 = 0;
    		int i = keyevent.getKeyCode();
    		if (i < 0 || (i ^ 0xffffffff) <= (Class37_Sub5.keycodes.length ^ 0xffffffff))
    			i = -1;
    		else {
    			i = Class37_Sub5.keycodes[i];
    			if ((i & 0x80) != 0)
    				i = -1;
    		}
    		if ((Hashtable.heldKeyCachePosition ^ 0xffffffff) <= -1 && i >= 0) {
    			Class37_Sub9_Sub19.heldKeyCache[Hashtable.heldKeyCachePosition] = i;
    			Hashtable.heldKeyCachePosition = 0x7f & 1 + Hashtable.heldKeyCachePosition;
    			if ((Class37_Sub9_Sub26.currentHeldKeyCachePosition ^ 0xffffffff) == (Hashtable.heldKeyCachePosition ^ 0xffffffff))
    				Hashtable.heldKeyCachePosition = -1;
    		}
    		if (i >= 0) {
    			int i_0_ = Class37_Sub9_Sub16.typedKeyCachePosition + 1 & 0x7f;
    			if ((Class37_Sub9_Sub21.currentTypedKeyCachePosition ^ 0xffffffff) != (i_0_ ^ 0xffffffff)) {
    				Class86.typedKeyCodeCache[Class37_Sub9_Sub16.typedKeyCachePosition] = i;
    				Class37_Sub9_Sub31.typedKeyCharCache[(Class37_Sub9_Sub16.typedKeyCachePosition)] = -1;
    				Class37_Sub9_Sub16.typedKeyCachePosition = i_0_;
    			}
    		}
    		int i_1_ = keyevent.getModifiers();
    		if ((0xa & i_1_ ^ 0xffffffff) != -1 || (i ^ 0xffffffff) == -86 || i == 10)
    			keyevent.consume();
    	}
    	anInt567++;
    }
    
    public static void method228(int i) {
	aClass16_561 = null;
	aClass32_568 = null;
	aClass16_560 = null;
	if (i != 0)
	    aClass16_561 = null;
	aClass16_559 = null;
    }
    
    public synchronized void focusLost(FocusEvent focusevent) {
	anInt565++;
	if (Class37_Sub9_Sub13.keyboardHandler != null)
	    Hashtable.heldKeyCachePosition = -1;
    }
    
    public synchronized void keyReleased(KeyEvent keyevent) {
    	if (Class37_Sub9_Sub13.keyboardHandler != null) {
    		Class37_Sub13.anInt2120 = 0;
    		int i = keyevent.getKeyCode();
    		if (i >= 0 && Class37_Sub5.keycodes.length > i)
    			i = ~0x80 & Class37_Sub5.keycodes[i];
    		else
    			i = -1;
    		if (Hashtable.heldKeyCachePosition >= 0 && (i ^ 0xffffffff) <= -1) {
    			Class37_Sub9_Sub19.heldKeyCache[Hashtable.heldKeyCachePosition] = i ^ 0xffffffff;
    			Hashtable.heldKeyCachePosition = 1 + Hashtable.heldKeyCachePosition & 0x7f;
    			if ((Hashtable.heldKeyCachePosition ^ 0xffffffff) == (Class37_Sub9_Sub26.currentHeldKeyCachePosition ^ 0xffffffff))
    				Hashtable.heldKeyCachePosition = -1;
    		}
    	}
    	anInt566++;
    	keyevent.consume();
    }
    
    public void keyTyped(KeyEvent keyevent) {
	anInt564++;
		if (Class37_Sub9_Sub13.keyboardHandler != null) {
			int i = Class80.method1300(keyevent, -15009);
			if (i >= 0) {
				int pos = 0x7f & Class37_Sub9_Sub16.typedKeyCachePosition + 1;
				if (pos != Class37_Sub9_Sub21.currentTypedKeyCachePosition) {
					Class86.typedKeyCodeCache[Class37_Sub9_Sub16.typedKeyCachePosition] = -1;
					Class37_Sub9_Sub31.typedKeyCharCache[(Class37_Sub9_Sub16.typedKeyCachePosition)] = i;
					Class37_Sub9_Sub16.typedKeyCachePosition = pos;
				}
			}
		}
		keyevent.consume();
    }
    
    public void focusGained(FocusEvent focusevent) {
	anInt563++;
    }
    
    static {
	aClass16_560
	    = (Class37_Sub2.create_rsstring
	       (" steht bereits auf Ihrer Ignorieren)2Liste(Q"));
    }
}
