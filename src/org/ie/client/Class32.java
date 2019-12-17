package org.ie.client;

/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

import org.ie.Main;

public abstract class Class32
{
    public static RSString aClass16_729;
    public static RSString aClass16_730;
    public static int anInt731;
    public int anInt732;
    public int anInt734;
    public Image anImage735;
    public static RSString aClass16_736
	= Class37_Sub2.create_rsstring("m-Ochte sich mit Ihnen duellieren)3");
    public static int anInt737;
    public static RSString aClass16_738;
    public static int anInt739;
    public static int anInt740;
    public static RSString aClass16_741;
    public static int anInt742;
    public static int anInt743;
    public static boolean aBoolean744;
    public int[] anIntArray745;
    public static boolean aBoolean746;
    
    public abstract void init(Component component, int i, int i_0_,
				   byte i_1_);
    
    public static void method288(int i) {
	if (i >= 1) {
	    aClass16_738 = null;
	    aClass16_736 = null;
	    aClass16_741 = null;
	    aClass16_729 = null;
	    aClass16_730 = null;
	}
    }
    
    public static RSString method289(int i, int i_2_, int i_3_, boolean bool) {
	if ((i_2_ ^ 0xffffffff) > -2 || (i_2_ ^ 0xffffffff) < -37)
	    i_2_ = 10;
	anInt731++;
	int i_4_ = 1;
	for (int i_5_ = i_3_ / i_2_; (i_5_ ^ 0xffffffff) != -1; i_5_ /= i_2_)
	    i_4_++;
	int i_6_ = i_4_;
	if ((i_3_ ^ 0xffffffff) > -1 || bool)
	    i_6_++;
	byte[] is = new byte[i_6_];
	if ((i_3_ ^ 0xffffffff) > -1)
	    is[0] = (byte) 45;
	else if (bool)
	    is[0] = (byte) 43;
	if (i < 117)
	    return null;
	for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_7_++) {
	    int i_8_ = i_3_ % i_2_;
	    i_3_ /= i_2_;
	    if ((i_8_ ^ 0xffffffff) > -1)
		i_8_ = -i_8_;
	    if (i_8_ > 9)
		i_8_ += 39;
	    is[-1 + i_6_ + -i_7_] = (byte) (48 + i_8_);
	}
	RSString rSString = new RSString();
	rSString.aByteArray1669 = is;
	rSString.anInt1650 = i_6_;
	return rSString;
    }
    
    public abstract void draw(int i, Graphics graphics, int i_9_,
				   boolean bool);
    
    public void method291(byte i) {
	anInt739++;
	Graphics2D.method587(anIntArray745, anInt734, anInt732);
	if (i != -10)
	    method288(5);
    }
    
    public abstract void clipDraw(int i, int i_10_, int i_11_, int i_12_,
				   int i_13_, Graphics graphics);
    
    static {
	Main.gamepanel = 548;
	aClass16_738
	    = Class37_Sub2.create_rsstring("Lade Schrifts-=tze )2 ");
	aClass16_730 = Class37_Sub2.create_rsstring("runes");
	aClass16_741 = Class37_Sub2.create_rsstring("<img=0>");
	anInt740 = 0;
	aClass16_729 = Class37_Sub2.create_rsstring("event_opbase");
	aBoolean744 = false;
	aBoolean746 = false;
    }
}
